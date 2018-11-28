package jry.test;

import com.sun.codemodel.internal.JFieldRef;
import com.sun.tools.internal.ws.wsdl.document.jaxws.Exception;
import soot.*;
import soot.jimple.*;
import soot.jimple.toolkits.callgraph.ReachableMethods;
import soot.util.queue.QueueReader;
import vasco.callgraph.CallGraphTransformer;

import java.io.File;
import java.util.*;

class LocalMapPrinter extends SceneTransformer {
    class Pair {
        public Object var;
        public Unit unit;
        public Pair(Object _var, Unit _unit) {
            var = _var; unit = _unit;
        }

        @Override
        public int hashCode() {
            return var.hashCode();
        }

        @Override
        public boolean equals(Object obj) {
            return var.equals(((Pair)obj).var);
        }
    }
    @Override
    protected void internalTransform(String s, Map<String, String> map) {
        ReachableMethods allMethods = Scene.v().getReachableMethods();
        QueueReader<MethodOrMethodContext> qReader = allMethods.listener();
        Set<Pair> S = new HashSet<>();
        Set<SootFieldRef> SF = new HashSet<>();
        while (qReader.hasNext()) {
            SootMethod sMethod = qReader.next().method();
            if (sMethod.hasActiveBody()) {
                System.out.println("----------------");
                System.out.println(sMethod.getActiveBody());
                for (Unit unit : sMethod.getActiveBody().getUnits()) {
                    if (unit instanceof DefinitionStmt) {
                        Value lvar = ((DefinitionStmt) unit).getLeftOp();
                        System.out.println("Find DefinitionStmt: " + unit);
                        System.out.println(((DefinitionStmt) unit).getRightOp().getClass());
                        if (lvar instanceof Local) {
                            Local var = (Local) lvar;
                            System.out.println("Find Local: " + unit);
                            if (!S.contains(new Pair(var, unit))) {
                                S.add(new Pair(var, unit));
                                // System.out.println(var + "," + unit);
                            }
                        } else if (lvar instanceof InstanceFieldRef) {
                            // System.out.println("Find InstanceFieldRef: " + lvar.toString());
                            Local var = (Local)((InstanceFieldRef) lvar).getBase();
                            if (!S.contains(new Pair(var, unit))) {
                                S.add(new Pair(var, unit));
                                // System.out.println(var + "," + unit);
                            }
                            if (!SF.contains(((InstanceFieldRef) lvar).getFieldRef())) {
                                SF.add(((InstanceFieldRef) lvar).getFieldRef());
                                System.out.println(unit);
                            }
                        } else if (lvar instanceof ArrayRef){
                            // System.out.println("Find ArrayRef: " + lvar.toString());
                            Local var = (Local)(((ArrayRef) lvar).getBase());
                            if (!S.contains(new Pair(var, unit))) {
                                S.add(new Pair(var, unit));
                                // System.out.println(var + "," + unit);
                            }
                        } else if (lvar instanceof StaticFieldRef) {
                            //System.out.println("Find StaticFieldRef: " + lvar.toString());
                            if (!S.contains(new Pair(((StaticFieldRef) lvar).getFieldRef(), unit))) {
                                S.add(new Pair(((StaticFieldRef) lvar).getFieldRef(), unit));
                                //System.out.println(((StaticFieldRef) lvar).getFieldRef() + "," + unit);
                            }
                            if (!SF.contains(((StaticFieldRef) lvar).getFieldRef())) {
                                SF.add(((StaticFieldRef) lvar).getFieldRef());
                                System.out.println(unit);
                            }
                        } else {
                            assert false;
                        }
                    }
                }
            }
        }
    }
}

public class TryLocalMap {
    public static void main(String[] args) {
        String dir = "code/src";
        String className = "LocalTest";
        String classPath = dir
                + File.pathSeparator + dir + File.separator + "rt.jar"
                + File.pathSeparator + dir + File.separator + "jce.jar";
        String[] sootArgs = {
                "-cp", classPath, "-pp",
                "-w", "-app",
                "-keep-line-number",
                "-keep-bytecode-offset",
                "-p", "cg", "implicit-entry:false",
                "-p", "cg.spark", "enabled",
                "-p", "cg.spark", "simulate-natives",
                "-p", "cg", "safe-forname",
                "-p", "cg", "safe-newinstance",
                "-main-class", className,
                "-f", "none", className
        };
        System.out.println(classPath);
        PackManager.v().getPack("wjtp").add(new Transform("wjtp.fcpa", new CallGraphTransformer()));
        PackManager.v().getPack("wjtp").add(new Transform("wjtp.mypta", new LocalMapPrinter()));
        soot.Main.main(sootArgs);
    }
}
