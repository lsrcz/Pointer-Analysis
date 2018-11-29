package Anderson;

import soot.*;
import soot.baf.Inst;
import soot.jimple.*;
import soot.jimple.internal.JimpleLocal;
import soot.toolkits.scalar.ArraySparseSet;
import soot.toolkits.scalar.FlowSet;
import soot.toolkits.scalar.Pair;
import vasco.Context;
import vasco.ForwardInterProceduralAnalysis;
import vasco.ProgramRepresentation;
import vasco.soot.DefaultJimpleRepresentation;
import vasco.soot.examples.SignAnalysis;

import java.util.HashMap;
import java.util.Map;

public class InterProcedureFieldAnderson extends ForwardInterProceduralAnalysis<SootMethod, Unit, Map<Object, FlowSet<NewExpr>>> {
    private static final Local RETURN_LOCAL = new JimpleLocal("@return", IntType.v());

    public InterProcedureFieldAnderson() {
        verbose = false;
    }

    private Local getLocal(Value value) {
        if (value instanceof Local)
            return (Local)value;
        /*
        if (value instanceof InstanceFieldRef) {
            // field
            InstanceFieldRef ref = (InstanceFieldRef)value;
            if (ref.getBase() instanceof Local)
                return (Local)ref.getBase();
        }*/
        return null;
    }

    private void assign(Object lhs, Value rhs, Map<Object, FlowSet<NewExpr>> input, Map<Object, FlowSet<NewExpr>> output) {
        if (lhs instanceof Local) {
            output.put(lhs, new ArraySparseSet<>());
            if (rhs instanceof NewExpr) {
                output.get(lhs).add((NewExpr) rhs);
            } else if (rhs instanceof Local) {
                Local r = getLocal(rhs);
                output.get(lhs).union(input.get(r));
            } else if (rhs instanceof InstanceFieldRef) {
                Value base = ((InstanceFieldRef)rhs).getBase();
                SootField field = ((InstanceFieldRef)rhs).getField();
                if (base instanceof Local) {
                    Local x = getLocal(base);
                    for (NewExpr expr : input.get(base)) {
                        Pair<NewExpr, SootField> p = new Pair<>(expr, field);
                        if (!input.containsKey(p)) {
                            continue;
                        }
                        output.get(lhs).union(input.get(p));
                    }
                }
            }
        } else if (lhs instanceof InstanceFieldRef) {
            if (rhs instanceof Local) {
                if (input.containsKey(rhs)) {
                    Value base = ((InstanceFieldRef) lhs).getBase();
                    SootField field = ((InstanceFieldRef) lhs).getField();
                    if (base instanceof Local) {
                        Local x = getLocal(base);
                        for (NewExpr expr : input.get(base)) {
                            Pair<NewExpr, SootField> p = new Pair<>(expr, field);
                            if (!input.containsKey(p)) {
                                output.put(p, new ArraySparseSet<>());
                            }
                            output.get(p).union(input.get(rhs));
                        }
                    }
                }
            }
        }
    }

    @Override
    public Map<Object, FlowSet<NewExpr>> normalFlowFunction(
            Context<SootMethod, Unit, Map<Object, FlowSet<NewExpr>>> context,
            Unit unit,
            Map<Object, FlowSet<NewExpr>> localFlowSetMap) {
        Map<Object, FlowSet<NewExpr>> outValue = this.copy(localFlowSetMap);
        Value lhsOp;
        if (unit instanceof AssignStmt) {
            lhsOp = ((AssignStmt)unit).getLeftOp();
            Value rhsOp = ((AssignStmt)unit).getRightOp();
            assign(lhsOp, rhsOp, localFlowSetMap, outValue);
        } else if (unit instanceof ReturnStmt) {
            lhsOp = ((ReturnStmt)unit).getOp();
            assign(RETURN_LOCAL, lhsOp, localFlowSetMap, outValue);
            int i = 0;
        }
        return outValue;
    }

    @Override
    public Map<Object, FlowSet<NewExpr>> callEntryFlowFunction(
            Context<SootMethod, Unit, Map<Object, FlowSet<NewExpr>>> context,
            SootMethod sootMethod,
            Unit unit,
            Map<Object, FlowSet<NewExpr>> localFlowSetMap) {
        Map<Object, FlowSet<NewExpr>> entryValue = this.topValue();
        InvokeExpr ie = ((Stmt)unit).getInvokeExpr();

        for (int i = 0; i < ie.getArgCount(); ++i) {
            Value arg = ie.getArg(i);
            Local param = sootMethod.getActiveBody().getParameterLocal(i);
            assign(param, arg, localFlowSetMap, entryValue);
        }
        if (ie instanceof InstanceInvokeExpr) {
            Value instance = ((InstanceInvokeExpr)ie).getBase();
            Local thisLocal = sootMethod.getActiveBody().getThisLocal();
            this.assign(thisLocal, instance, localFlowSetMap, entryValue);
        }
        return entryValue;
    }

    @Override
    public Map<Object, FlowSet<NewExpr>> callExitFlowFunction(
            Context<SootMethod, Unit, Map<Object, FlowSet<NewExpr>>> context,
            SootMethod sootMethod,
            Unit unit,
            Map<Object, FlowSet<NewExpr>> localFlowSetMap) {
        Map<Object, FlowSet<NewExpr>> afterCallValue = this.topValue();
        if (unit instanceof AssignStmt) {
            Value lhsOp = ((AssignStmt)unit).getLeftOp();
            assign((Local)lhsOp, RETURN_LOCAL, localFlowSetMap, afterCallValue);
            int i = 0;
        }
        return afterCallValue;
    }

    @Override
    public Map<Object, FlowSet<NewExpr>> callLocalFlowFunction(Context<SootMethod, Unit, Map<Object, FlowSet<NewExpr>>> context, Unit unit, Map<Object, FlowSet<NewExpr>> localFlowSetMap) {
        Map<Object, FlowSet<NewExpr>> afterCallValue = this.copy(localFlowSetMap);
        if (unit instanceof AssignStmt) {
            Value lhsOp = ((AssignStmt)unit).getLeftOp();
            afterCallValue.remove(lhsOp);
        }

        return afterCallValue;
    }

    @Override
    public Map<Object, FlowSet<NewExpr>> boundaryValue(SootMethod sootMethod) {
        return this.topValue();
    }

    @Override
    public Map<Object, FlowSet<NewExpr>> copy(Map<Object, FlowSet<NewExpr>> localFlowSetMap) {
        // efficient?
        /*
        Map<Local, FlowSet<NewExpr>> ret = new HashMap<>();
        for (Local l: localFlowSetMap.keySet()) {
            ret.put(l, new ArraySparseSet<>());
            localFlowSetMap.get(l).copy(ret.get(l));
        }
        return ret;*/
        // error?
        return new HashMap<>(localFlowSetMap);
    }

    @Override
    public Map<Object, FlowSet<NewExpr>> meet(Map<Object, FlowSet<NewExpr>> localFlowSetMap, Map<Object, FlowSet<NewExpr>> a1) {
        // efficient or error?
        Map<Object, FlowSet<NewExpr>> ret = new HashMap<>(localFlowSetMap);
        for (Object l: a1.keySet()) {
            if (localFlowSetMap.containsKey(l)) {
                FlowSet<NewExpr> set1 = localFlowSetMap.get(l);
                FlowSet<NewExpr> set2 = a1.get(l);
                FlowSet<NewExpr> nset = new ArraySparseSet<>();
                set1.union(set2, nset);
                ret.put(l, nset);
            } else {
                ret.put(l, a1.get(l));
            }
        }
        return ret;
    }

    public ProgramRepresentation<SootMethod, Unit> programRepresentation() {
        return DefaultJimpleRepresentation.v();
    }

    @Override
    public Map<Object, FlowSet<NewExpr>> topValue() {
        return new HashMap<>();
    }
}