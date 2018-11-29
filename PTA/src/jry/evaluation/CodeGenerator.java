package jry.evaluation;

import jas.Var;
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

public class CodeGenerator {
    private final String Head = "package dataset;\n" +
            "\n" +
            "import benchmark.internal.Benchmark;\n" +
            "import benchmark.tool.BasicClass;\n";

    MyClass[] classes;
    Random rand = new Random();
    int totalMethods = 0;
    int totalFields = 0;
    int totalClasses = 0;
    int maxMethodBody = 0;

    public CodeGenerator(int classNum, int maxFields, int maxMethods, int _maxMethodBody) {
        maxMethodBody = _maxMethodBody;
        getClasses(classNum, maxFields, maxMethods);
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

    @Override
    public String toString() {
        String ans = Head;
        for (int i = 1; i <= totalClasses; ++i) {
            ans += printClass(classes[i]);
        }
        return ans;
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
            int fieldNum = rand.nextInt(maxFields);
            int methodNum = rand.nextInt(maxMethods);
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
                newClass.methods.add(new MyMethod(totalMethods, args, rand.nextInt(2) == 0, returnType));
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
        } else return "Class" + type;
    }

    String getFieldName(int id) {
        return "field" + id;
    }

    String getMethodName(int id) {
        return "method" + id;
    }

    boolean checkSuperClass(int father, int son) {
        System.out.println(son + " " + father + " ");
        while (son > 0) {
            System.out.println("try " + son + " " + father);
            if (son == father) {
                System.out.println(true);
                return true;
            }
            son = classes[son].father;
        }
        System.out.println(false);
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

    void getAllVars(String prefix, int classId, int remainLevel, List<VarRef> candidate, List<String> resultList) {
        for (VarRef var : candidate) {
            if (checkSuperClass(classId, var.type)) {
                resultList.add(prefix + var.name);
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
            getAllVars(prefix + var.name + ".", classId, remainLevel -1, nextLevel, resultList);
        }
    }

    String choose(int type, List<VarRef> vars, int extendLevel) {
        List<String> allNames = new LinkedList<>();
        getAllVars("", type, extendLevel, vars, allNames);
        int length = allNames.size();
        if (length == 0) {
            return null;
        }
        int position = rand.nextInt(length);
        return allNames.get(position);
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

    String generateBody(int lines, List<VarRef> vars, String condition, String callDepth) {
        String body = "";
        for (int i = 1; i <= lines; ++i) {
            LineType currentLineType = LineType.values()[rand.nextInt(LineType.values().length)];
            switch (currentLineType){
                case IF:
                    String line = "if (" + getCondition(condition) + ") then ";
                    line += generateBody(1, vars, condition, callDepth);
                    if (rand.nextInt(2) == 0) {
                        line += "else " + generateBody(1, vars, condition, callDepth);
                    }
            }
        }
        return "";
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
            signature += "return new " + getClassName(currentMethod.returnType) + "();\n";
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

        String body = generateBody(rand.nextInt(maxMethodBody), vars , "depth", "depth-1");

        if (currentMethod.returnType != -1) {
            String returnVar = choose(currentMethod.returnType, vars, 1);
            if (returnVar == null) {
                body += "return new " + getClassName(currentMethod.returnType) + "();\n";
            } else {
                body += "return " + returnVar + ";\n";
            }
        }

        return signature + body + "}\n";
    }

}
