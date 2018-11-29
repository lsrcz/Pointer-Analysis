package jry.evaluation;

import jas.Var;
import jry.util.FileIO;
import ppg.code.Code;

import java.util.*;

class MyMethod {
    public Integer id = 0;
    public List<Integer> args = new LinkedList<>();
    public boolean isStatic;
    public int returnType = 0;
    public MyMethod(int _id, List<Integer> _args, boolean _isStatic, int _returnType) {
        id = _id; args = _args; isStatic = _isStatic; returnType = _returnType;
    }
}

class MyField {
    public Integer id = 0;
    public Integer type;
    public boolean isStatic;
    public MyField(int _id, int _type, boolean _isStatic) {
        id = _id; type = _type; isStatic = _isStatic;
    }
}

class MyClass {
    public Integer id = 0;
    public List<MyMethod> methods = new LinkedList<>();
    public List<MyField> myFields = new LinkedList<>();
    public List<MyField> fields = new LinkedList<>();
    public Integer father = 0;
}

class VarRef {
    public Integer type = 0;
    public String name;
    public VarRef(Integer _type, String _name) {
        type = _type; name = _name;
    }
}

class MethodRef {
    public Integer classId = 0;
    MyMethod method;
    public MethodRef(Integer _classId, MyMethod _method) {
        classId = _classId;
        method = _method;
    }
}

public class CodeGenerator {
    private final String head = "package dataset;\n" +
            "\n" +
            "import benchmark.internal.Benchmark;\n" +
            "import benchmark.tool.BasicClass;\n";

    MyClass[] classes;
    List<MethodRef> allMethods = new LinkedList<>();
    List<VarRef> varLib = new LinkedList<>();
    Random rand = new Random();
    int totalMethods = 0;
    int totalFields = 0;
    int totalClasses = 0;
    int maxMethodBody = 0;
    int localId = 0;
    String mainClass = "";

    public CodeGenerator(int classNum, int maxFields, int maxMethods, int _maxMethodBody, String _mainClass, Integer libNum) {
        mainClass = _mainClass;
        maxMethodBody = _maxMethodBody;
        getClasses(classNum, maxFields, maxMethods);
        for (int i = 1; i <= classNum; ++i) {
            int count = rand.nextInt(libNum) + 1;
            for (int j = 1; j <= count; ++j) {
                localId += 1;
                varLib.add(new VarRef(i, getLocalName(localId)));
            }
        }
    }

    String printClass(MyClass currentClass) {
        String head = "class " + getClassName(currentClass.id) + " extends " + getClassName(currentClass.father) + " {\n";
        System.out.println(currentClass.id + " " + currentClass.methods.size() + " " + currentClass.fields.size());
        String fields = "";
        for (MyField field : currentClass.myFields) {
            String currentField = "public ";
            if (field.isStatic) currentField += "static ";
            currentField += getClassName(field.type) + " " + getFieldName(field.id) + ";\n";
            fields += currentField;
        }
        String methods = "";

        //TODO function overloading
        for (MyMethod method : currentClass.methods) {
            methods += getMethod(currentClass, method);
        }

        return head + fields + methods + "}\n";
    }

    String printLib() {
        String head = "class " + mainClass + "Lib{\n";
        String fields = "";
        for (VarRef var : varLib) {
            fields += "public static " + getClassName(var.type) + " " + var.name + ";\n";
        }
        return head + fields + "}\n";
    }

    public String generateCode() {
        String ans = head;
        ans += printLib();
        for (int i = 1; i <= totalClasses; ++i) {
            ans += printClass(classes[i]);
        }
        ans += printMain();
        FileIO.write("resources/dataset/" + mainClass + ".java", ans);
        return ans;
    }

    String printMain() {
        int allocId = 0;
        int queryId = 0;
        String head = "public class " + mainClass + "{\n";
        head += "public static void main(String[] args) {\n";
        head += "int inputValue = 0;\n";
        String definitionPhase = "";
        List<VarRef> vars = new LinkedList<VarRef>();
        for (VarRef var : varLib) {
            allocId += 1;
            definitionPhase += "Benchmark.alloc(" + allocId + ");\n";
            definitionPhase += mainClass + "Lib." + var.name + " = new " + getClassName(var.type) + "();\n";
            vars.add(new VarRef(var.type, mainClass + "Lib." + var.name));
        }
        String assignPhase = "";
        for (VarRef currentVar : vars) {
            for (MyField field : classes[currentVar.type].fields) {
                List<String> rightVars = new LinkedList<>();
                getAllVars("", field.type, 0, vars, rightVars, InhLevel.SON);
                assert !rightVars.isEmpty();
                String rVar = rightVars.get(rand.nextInt(rightVars.size()));
                assignPhase += currentVar.name + "." + getFieldName(field.id) + " = " + rVar + ";\n";
            }
        }
        String body = generateBody(10, vars, "inputValue", "3", 0);
        String queryPhase = "";
        List<String> queryName = new LinkedList<>();
        getAllVars("", 0, 1, vars, queryName, InhLevel.SON);
        for (String name : queryName) {
            queryId += 1;
            queryPhase += "Benchmark.test(" + queryId + "," + name + ");\n";
        }

        String code = head + definitionPhase + assignPhase + body + queryPhase + "Benchmark.print();\n}\n}\n";
        return code;
    }

    private void getClasses(int classNum, int maxFields, int maxMethods) {
        totalClasses = classNum;
        classes = new MyClass[classNum + 1];
        for (int i = 1; i <= classNum; ++i) {
            MyClass newClass = new MyClass();
            if (i > 1) {
                newClass.father = rand.nextInt(i - 1) + 1;
            } else {
                newClass.father = 0;
            }
            int fieldNum = rand.nextInt(maxFields) + 1;
            int methodNum = rand.nextInt(maxMethods) + 1;
            for (int j = 1; j <= fieldNum; ++j) {
                totalFields += 1;
                MyField currentField = new MyField(totalFields, rand.nextInt(classNum) + 1, rand.nextInt(2) == 0);
                newClass.fields.add(currentField);
                newClass.myFields.add(currentField);
            }
            if (i > 1) {
                MyClass fatherClass = classes[newClass.father];
                for (MyField fatherField : fatherClass.fields) {
                    newClass.fields.add(fatherField);
                }
            }
            for (int j = 1; j <= methodNum; ++j) {
                totalMethods += 1;
                int argNum = rand.nextInt(3);
                List<Integer> args = new LinkedList<Integer>();
                for (int k = 1; k <= argNum; ++k) {
                    args.add(rand.nextInt(classNum) + 1);
                }
                int returnType = -1;
                if (rand.nextInt(2) == 0) {
                    returnType = rand.nextInt(classNum) + 1;
                }
                MyMethod newMethod = new MyMethod(totalMethods, args, rand.nextInt(2) == 0, returnType);
                newClass.methods.add(newMethod);
                allMethods.add(new MethodRef(i, newMethod));
            }
            newClass.id = i;
            classes[i] = newClass;
        }
    }

    String getClassName(int type) {
        if (type == -1) {
            return "void";
        } else if (type == 0) {
            return "BasicClass";
        } else return mainClass + "Class" + type;
    }

    String getFieldName(int id) {
        return "field" + id;
    }

    String getMethodName(int id) {
        return "method" + id;
    }

    String getLocalName(int id) {
        return "local" + id;
    }

    boolean checkSuperClass(int father, int son) {
        if (father == 0) return true;
        while (son > 0) {
            if (son == father) {
                return true;
            }
            son = classes[son].father;
        }
        return false;
    }

    List<Integer> getAllSuperClass(Integer classId) {
        List<Integer> superClass = new LinkedList<>();
        while (classId > 0) {
            superClass.add(classId);
            classId = classes[classId].father;
        }
        return superClass;
    }

    enum InhLevel {
        SON, SUPER, EQUAL;
    }

    void getAllVars(String prefix, int classId, int remainLevel, List<VarRef> candidate,
                    List<String> resultList, InhLevel type) {
        for (VarRef var : candidate) {
            if (type == InhLevel.SON) {
                if (checkSuperClass(classId, var.type)) {
                    resultList.add(prefix + var.name);
                }
            } else if (type == InhLevel.EQUAL) {
                if (classId == var.type) {
                    resultList.add(prefix + var.name);
                }
            } else if (type == InhLevel.SUPER) {
                if (checkSuperClass(var.type, classId)) {
                    resultList.add(prefix + var.name);
                }
            }
        }
        if (remainLevel == 0) {
            return;
        }
        for (VarRef var : candidate) {
            List<VarRef> nextLevel = new LinkedList<>();
            for (MyField field : classes[var.type].fields) {
                nextLevel.add(new VarRef(field.type, getFieldName(field.id)));
            }
            getAllVars(prefix + var.name + ".", classId, remainLevel-1, nextLevel, resultList, type);
        }
    }

    String choose(int type, List<VarRef> vars, int extendLevel) {
        List<String> allNames = new LinkedList<>();
        getAllVars("", type, extendLevel, vars, allNames, InhLevel.SON);
        int length = allNames.size();
        if (length == 0) {
            return null;
        }
        int position = rand.nextInt(length);
        return allNames.get(position);
    }

    String chooseLib(int type) {
        return mainClass + "Lib." + choose(type, varLib, 0);
    }

    enum LineType {
        IF, FOR, ASSIGN, METHODCALL;
    }

    static final String[] ope = {"<", ">", "==", "<=", ">="};

    String getCondition(String name) {
        int number = rand.nextInt(4) + 1;
        String operator = ope[rand.nextInt(ope.length)];
        return name + operator + number;
    }

    List<String> removeThis(List<String> list) {
        List<String> result = new LinkedList<>();
        for (String name : list) {
            if (!name.equals("this")) {
                result.add(name);
            }
        }
        return result;
    }

    String generateBody(int lines, List<VarRef> vars, String condition, String callDepth, int generateDepth) {
        if (generateDepth == 5) return "";
        String body = "", line = "";
        for (int i = 1; i <= lines; ++i) {
            boolean generated = false;
            while (!generated) {
                LineType currentLineType = LineType.values()[rand.nextInt(LineType.values().length)];
                switch (currentLineType) {
                    case IF:
                        line = "if (" + getCondition(condition) + ") {\n";
                        line += generateBody(1, vars, condition, callDepth, generateDepth + 1) + "}";
                        if (rand.nextInt(2) == 0) {
                            line += "else {\n" + generateBody(1, vars, condition, callDepth, generateDepth + 1);
                            line += "}";
                        }
                        line += "\n";
                        generated = true;
                        break;
                    case FOR:
                        localId += 1;
                        String loopVar = getLocalName(localId);
                        line = "for (int " + loopVar + " = 0; " + loopVar + "<=" + rand.nextInt(4) + "; " + loopVar + " += 1) {\n";
                        line += generateBody(1, vars, condition, callDepth, generateDepth + 1);
                        line += "}\n";
                        generated = true;
                        break;
                    case ASSIGN:
                        int classId = rand.nextInt(totalClasses) + 1;
                        List<String> leftName = new LinkedList<>();
                        getAllVars("", classId, 1, vars, leftName, InhLevel.EQUAL);
                        leftName = removeThis(leftName);
                        if (leftName.isEmpty()) break;
                        List<String> rightName = new LinkedList<>();
                        getAllVars("", classId, 1, vars, rightName, InhLevel.SON);
                        assert !rightName.isEmpty();
                        int lpos = rand.nextInt(leftName.size());
                        int rpos = rand.nextInt(rightName.size());
                        line = leftName.get(lpos) + "=" + rightName.get(rpos) + ";\n";
                        generated = true;
                        break;
                    case METHODCALL:
                        if (allMethods.isEmpty()) break;
                        MethodRef currentMethod = allMethods.get(rand.nextInt(allMethods.size()));
                        List<String> callers = new LinkedList<>();
                        getAllVars("", currentMethod.classId, 1, vars, callers, InhLevel.SON);
                        if (callers.isEmpty())  break;
                        String caller = callers.get(rand.nextInt(callers.size()));
                        String args = "";
                        MyMethod method = currentMethod.method;
                        boolean getArgs = true;
                        for (Integer argClass : method.args) {
                            List<String> candidateArg = new LinkedList<>();
                            getAllVars("", argClass, 1, vars, candidateArg, InhLevel.SON);
                            if (candidateArg.isEmpty()) {
                                getArgs = false;
                                break;
                            }
                            args += candidateArg.get(rand.nextInt(candidateArg.size())) + ",";
                        }
                        if (getArgs == false) break;
                        args += callDepth;
                        line = caller + "." + getMethodName(method.id) + "(" + args + ");\n";
                        if (method.returnType != -1) {
                            List<String> candidateReceiver = new LinkedList<>();
                            getAllVars("", method.returnType, 1, vars, candidateReceiver, InhLevel.SUPER);
                            candidateReceiver = removeThis(candidateReceiver);
                            if (candidateReceiver.size() > 0 && rand.nextInt(3) > 0) {
                                String receiver = candidateReceiver.get(rand.nextInt(candidateReceiver.size()));
                                line = receiver + "=" + line;
                            }
                        }
                        generated = true;
                        break;
                }
            }
            body += line;
        }
        return body;
    }

    private String getMethod(MyClass currentClass, MyMethod currentMethod) {
        String signature = "public ";
        if (currentMethod.isStatic) signature += "static ";
        signature += getClassName(currentMethod.returnType) + " " + getMethodName(currentMethod.id) + "(";
        int id = 0;
        for (Integer classId : currentMethod.args) {
            signature += getClassName(classId) + " arg" + id + ", ";
            id += 1;
        }
        signature += "int depth) {\n";

        signature += "if (depth == 0) ";
        if (currentMethod.returnType == -1) {
            signature += "return;\n";
        } else {
            signature += "return " + chooseLib(currentMethod.returnType) + ";\n";
        }

        List<VarRef> vars = new LinkedList<VarRef>();
        id = 0;
        for (Integer classId : currentMethod.args) {
            vars.add(new VarRef(classId, "arg" + id));
            id += 1;
        }
        if (currentMethod.isStatic) {
            for (MyField field : currentClass.fields) {
                if (field.isStatic) {
                    vars.add(new VarRef(field.type, getFieldName(field.id)));
                }
            }
        } else
            vars.add(new VarRef(currentClass.id, "this"));


        String body = generateBody(rand.nextInt(maxMethodBody), vars , "depth", "depth-1", 0);

        if (currentMethod.returnType != -1) {
            String returnVar = choose(currentMethod.returnType, vars, 1);
            if (returnVar == null) {
                body += "return " + chooseLib(currentMethod.returnType) + ";\n";
            } else {
                body += "return " + returnVar + ";\n";
            }
        }

        return signature + body + "}\n";
    }

}
