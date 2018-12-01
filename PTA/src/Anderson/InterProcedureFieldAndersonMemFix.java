package Anderson;

import soot.*;
import soot.jimple.*;
import soot.jimple.internal.JimpleLocal;
import soot.toolkits.scalar.ArraySparseSet;
import soot.toolkits.scalar.FlowSet;
import soot.toolkits.scalar.Pair;
import vasco.Context;
import vasco.ForwardInterProceduralAnalysis;
import vasco.ProgramRepresentation;
import vasco.soot.DefaultJimpleRepresentation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class InterProcedureFieldAndersonMemFix extends ForwardInterProceduralAnalysis<SootMethod, Unit, Map<Object, FlowSet<AnyNewExpr>>> {
    // private Map<Pair<Context, Unit>, Map<Object, FlowSet<AnyNewExpr>>> mapPool = new HashMap<>();
    private static final Local RETURN_LOCAL = new JimpleLocal("@return", IntType.v());
    private Unit uu;

    public InterProcedureFieldAndersonMemFix() {
        verbose = false;
        //freeResultsOnTheFly = true;
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

    private void assign(Object lhs, Value rhs, Map<Object, FlowSet<AnyNewExpr>> input, Map<Object, FlowSet<AnyNewExpr>> output) {
        if (lhs instanceof Local) {
            output.put(lhs, new ArraySparseSet<>());
            if (rhs instanceof AnyNewExpr) {
                output.get(lhs).clear();
                output.get(lhs).add((AnyNewExpr) rhs);
            } else if (rhs instanceof Local) {
                Local r = getLocal(rhs);
                output.get(lhs).clear();
                if (input.containsKey(r))
                    output.get(lhs).union(input.get(r));
            } else if (rhs instanceof InstanceFieldRef) {
                output.get(lhs).clear();
                Value base = ((InstanceFieldRef)rhs).getBase();
                SootField field = ((InstanceFieldRef)rhs).getField();
                if (base instanceof Local) {
                    Local x = getLocal(base);
                    if (input.containsKey(base)) {
                        for (AnyNewExpr expr : input.get(base)) {
                            Pair<AnyNewExpr, SootField> p = new Pair<>(expr, field);
                            if (!input.containsKey(p)) {
                                continue;
                            }
                            output.get(lhs).union(input.get(p));
                        }
                        //int j = 0;
                    }
                    /*
                    for (AnyNewExpr expr : input.get(base)) {
                        Pair<AnyNewExpr, SootField> p = new Pair<>(expr, field);
                        if (!input.containsKey(p)) {
                            continue;
                        }
                        output.get(lhs).union(input.get(p));
                    }*/ // ugly
                }
            } else if (rhs instanceof StaticFieldRef) {
                output.get(lhs).clear();
                SootField field = ((StaticFieldRef)rhs).getField();
                if (input.containsKey(field)) {
                    output.get(lhs).union(input.get(field));
                }
            } else if (rhs instanceof ArrayRef) {
                output.get(lhs).clear();
                Value base = ((ArrayRef)rhs).getBase();
                if (base instanceof Local) {
                    if (input.containsKey(base)) {
                        for (AnyNewExpr expr : input.get(base)) {
                            if (expr instanceof NewArrayExpr) {
                                Pair<NewArrayExpr, String> p = new Pair<>((NewArrayExpr) expr, "Array");
                                if (!input.containsKey(p))
                                    continue;
                                output.get(lhs).union(input.get(p));
                            } else if (expr instanceof NewMultiArrayExpr) {
                                Pair<NewMultiArrayExpr, String> p = new Pair<>((NewMultiArrayExpr)expr, "MultiArray");
                                if (!input.containsKey(p))
                                    continue;
                                output.get(lhs).union(input.get(p));
                            }
                        }
                    }
                } else
                    assert false;
            }
        } else if (lhs instanceof InstanceFieldRef) {
            if (rhs instanceof Local) {
                if (input.containsKey(rhs)) {
                    Value base = ((InstanceFieldRef) lhs).getBase();
                    SootField field = ((InstanceFieldRef) lhs).getField();
                    if (base instanceof Local) {
                        Local x = getLocal(base);////?
                        if (input.containsKey(base)) {
                            int s = input.get(base).size();
                            for (AnyNewExpr expr : input.get(base)) {
                                Pair<AnyNewExpr, SootField> p = new Pair<>(expr, field);
                                if (!input.containsKey(p)) {
                                    output.put(p, new ArraySparseSet<>());
                                }
                                if (s == 1) {
                                    output.get(p).clear();
                                }
                                output.get(p).union(input.get(rhs));
                            }
                        }
                    }
                }
            }
        } else if (lhs instanceof StaticFieldRef) {
            if (rhs instanceof Local) {
                SootField field = ((StaticFieldRef) lhs).getField();
                if (!output.containsKey(field)) {
                    output.put(field, new ArraySparseSet<>());
                } else {
                    output.get(field).clear();
                }
                if (input.containsKey(rhs)) {
                    output.get(field).union(input.get(rhs));
                }
            }
        } else if (lhs instanceof ArrayRef) {
            if (rhs instanceof Local) {
                Value base = ((ArrayRef)lhs).getBase();
                if (base instanceof Local) {
                    if (input.containsKey(base)) {
                        for (AnyNewExpr expr : input.get(base)) {
                            if (expr instanceof NewArrayExpr) {
                                Pair<NewArrayExpr, String> p = new Pair<>((NewArrayExpr) expr, "Array");
                                if (!input.containsKey(p)) {
                                    output.put(p, new ArraySparseSet<>());
                                }
                                output.get(p).union(input.get(rhs));
                            } else if (expr instanceof NewMultiArrayExpr) {
                                Pair<NewMultiArrayExpr, String> p = new Pair<>((NewMultiArrayExpr)expr, "MultiArray");
                                if (!input.containsKey(p)) {
                                    output.put(p, new ArraySparseSet<>());
                                }
                                output.get(p).union(input.get(rhs));
                            }
                        }
                    }
                } else
                    assert false;
            }
        }
        List<Object> keylist = new ArrayList<>();
        for (Entry<Object, FlowSet<AnyNewExpr>> p : output.entrySet()) {
            if (p.getValue().size() == 0) {
                keylist.add(p.getKey());
            }
        }
        for (Object key : keylist) {
            output.remove(key);
        }
    }

    @Override
    public Map<Object, FlowSet<AnyNewExpr>> normalFlowFunction(
            Context<SootMethod, Unit, Map<Object, FlowSet<AnyNewExpr>>> context,
            Unit unit,
            Map<Object, FlowSet<AnyNewExpr>> localFlowSetMap) {

        Map<Object, FlowSet<AnyNewExpr>> outValue = this.copy(localFlowSetMap);
        Value lhsOp;
        uu = unit;
        if (unit instanceof AssignStmt) {
            lhsOp = ((AssignStmt)unit).getLeftOp();
            Value rhsOp = ((AssignStmt)unit).getRightOp();
            assign(lhsOp, rhsOp, localFlowSetMap, outValue);
        } else if (unit instanceof ReturnStmt) {
            lhsOp = ((ReturnStmt)unit).getOp();
            assign(RETURN_LOCAL, lhsOp, localFlowSetMap, outValue);
        } else if (unit instanceof ThrowStmt) {
            outValue.put(RETURN_LOCAL, new ArraySparseSet<>());
        }
        return outValue;
    }

    @Override
    public Map<Object, FlowSet<AnyNewExpr>> callEntryFlowFunction(
            Context<SootMethod, Unit, Map<Object, FlowSet<AnyNewExpr>>> context,
            SootMethod sootMethod,
            Unit unit,
            Map<Object, FlowSet<AnyNewExpr>> localFlowSetMap) {
        uu = unit;
        //Map<Object, FlowSet<AnyNewExpr>> entryValue = this.copy(localFlowSetMap);
        Map<Object, FlowSet<AnyNewExpr>> entryValue = this.topValue();
        for (Entry<Object, FlowSet<AnyNewExpr>> entry : localFlowSetMap.entrySet()) {
            /*if (entry.getKey() instanceof SootField || entry.getKey() instanceof Pair) {
                entryValue.put(entry.getKey(), entry.getValue());
            } else*/ if (entry.getKey() instanceof Local) {

            } else {
                entryValue.put(entry.getKey(), entry.getValue());
                int i = 0;
            }
        }
        InvokeExpr ie = ((Stmt)unit).getInvokeExpr();
        int s = ie.getArgCount();
        for (int i = 0; i < ie.getArgCount(); ++i) {
            Value arg = ie.getArg(i);
            Local param = sootMethod.getActiveBody().getParameterLocal(i);
            assign(param, arg, localFlowSetMap, entryValue);
        }
        if (ie instanceof VirtualInvokeExpr) {
            int i = 0;
        }
        if (ie instanceof InstanceInvokeExpr) {
            Value instance = ((InstanceInvokeExpr)ie).getBase();
            Local thisLocal = sootMethod.getActiveBody().getThisLocal();
            this.assign(thisLocal, instance, localFlowSetMap, entryValue);
        }
        return entryValue;
    }

    @Override
    public Map<Object, FlowSet<AnyNewExpr>> callExitFlowFunction(
            Context<SootMethod, Unit, Map<Object, FlowSet<AnyNewExpr>>> context,
            SootMethod sootMethod,
            Unit unit,
            Map<Object, FlowSet<AnyNewExpr>> localFlowSetMap) {
        uu = unit;
        Map<Object, FlowSet<AnyNewExpr>> afterCallValue = this.copy(localFlowSetMap);
        //Map<Object, FlowSet<AnyNewExpr>> afterCallValue = this.topValue();
        if (unit instanceof AssignStmt) {
            Value lhsOp = ((AssignStmt)unit).getLeftOp();
            assign((Local)lhsOp, RETURN_LOCAL, localFlowSetMap, afterCallValue);
        }
        return afterCallValue;
    }

    @Override
    public Map<Object, FlowSet<AnyNewExpr>> callLocalFlowFunction(Context<SootMethod, Unit, Map<Object, FlowSet<AnyNewExpr>>> context, Unit unit, Map<Object, FlowSet<AnyNewExpr>> localFlowSetMap) {
        Map<Object, FlowSet<AnyNewExpr>> afterCallValue = this.copy(localFlowSetMap);
        uu = unit;
        if (unit instanceof AssignStmt) {
            Value lhsOp = ((AssignStmt)unit).getLeftOp();
            afterCallValue.remove(lhsOp);
        }

        return afterCallValue;
    }

    @Override
    public Map<Object, FlowSet<AnyNewExpr>> boundaryValue(SootMethod sootMethod) {
        return this.topValue();
    }

    @Override
    public Map<Object, FlowSet<AnyNewExpr>> copy(Map<Object, FlowSet<AnyNewExpr>> localFlowSetMap) {
        // efficient?

        Map<Object, FlowSet<AnyNewExpr>> ret = new HashMap<>();
        for (Object l: localFlowSetMap.keySet()) {
            ret.put(l, new ArraySparseSet<>());
            localFlowSetMap.get(l).copy(ret.get(l));
        }
        return ret;
        // error?
        //return new HashMap<>(localFlowSetMap);
    }

    @Override
    public Map<Object, FlowSet<AnyNewExpr>> meet(Map<Object, FlowSet<AnyNewExpr>> localFlowSetMap, Map<Object, FlowSet<AnyNewExpr>> a1) {
        // efficient or error?
        Map<Object, FlowSet<AnyNewExpr>> ret = localFlowSetMap;// new HashMap<>(localFlowSetMap);
        for (Object l: a1.keySet()) {
            if (localFlowSetMap.containsKey(l)) {
                FlowSet<AnyNewExpr> set1 = localFlowSetMap.get(l);
                FlowSet<AnyNewExpr> set2 = a1.get(l);
                FlowSet<AnyNewExpr> nset = new ArraySparseSet<>();
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
    public Map<Object, FlowSet<AnyNewExpr>> topValue() {
        return new HashMap<>();
    }
}
