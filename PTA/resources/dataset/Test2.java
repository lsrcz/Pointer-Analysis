package dataset;

import benchmark.internal.Benchmark;
import benchmark.tool.BasicClass;
class Class1 extends BasicClass {
    public Class4 field1;
    public Class2 field2;
    public void method1(Class3 arg0, Class3 arg1, int depth) {
        if (depth == 0) return;
    }
    public static void method2(int depth) {
        if (depth == 0) return;
    }
    public static void method3(Class2 arg0, int depth) {
        if (depth == 0) return;
    }
    public void method4(Class2 arg0, int depth) {
        if (depth == 0) return;
    }
    public Class2 method5(int depth) {
        if (depth == 0) return new Class2();
        return this.field2;
    }
    public void method6(int depth) {
        if (depth == 0) return;
    }
}
class Class2 extends Class1 {
    public Class1 field3;
    public Class4 field4;
    public Class2 field5;
    public Class4 method7(int depth) {
        if (depth == 0) return new Class4();
        return this.field1;
    }
    public static void method8(int depth) {
        if (depth == 0) return;
    }
    public static Class4 method9(Class3 arg0, Class1 arg1, int depth) {
        if (depth == 0) return new Class4();
        return arg0.field1;
    }
    public static void method10(Class1 arg0, int depth) {
        if (depth == 0) return;
    }
    public static void method11(int depth) {
        if (depth == 0) return;
    }
    public static void method12(Class4 arg0, Class4 arg1, int depth) {
        if (depth == 0) return;
    }
    public static void method13(int depth) {
        if (depth == 0) return;
    }
    public static Class1 method14(Class1 arg0, int depth) {
        if (depth == 0) return new Class1();
        return arg0;
    }
    public static void method15(Class3 arg0, Class5 arg1, int depth) {
        if (depth == 0) return;
    }
}
class Class3 extends Class1 {
    public static Class5 field6;
    public Class5 method16(Class1 arg0, int depth) {
        if (depth == 0) return new Class5();
        return this.field6;
    }
    public static Class4 method17(Class1 arg0, Class5 arg1, int depth) {
        if (depth == 0) return new Class4();
        return arg0.field1;
    }
    public void method18(int depth) {
        if (depth == 0) return;
    }
    public Class1 method19(Class1 arg0, Class1 arg1, int depth) {
        if (depth == 0) return new Class1();
        return this.field2;
    }
    public static void method20(Class2 arg0, int depth) {
        if (depth == 0) return;
    }
    public static void method21(int depth) {
        if (depth == 0) return;
    }
}
class Class4 extends Class1 {
    public static Class5 field7;
    public Class1 field8;
    public Class2 field9;
    public Class5 field10;
    public Class3 field11;
}
class Class5 extends Class3 {
    public Class2 field12;
    public static Class1 field13;
    public Class1 method22(Class4 arg0, Class5 arg1, int depth) {
        if (depth == 0) return new Class1();
        return this.field12;
    }
    public Class2 method23(Class1 arg0, Class3 arg1, int depth) {
        if (depth == 0) return new Class2();
        return arg1.field2;
    }
    public static void method24(int depth) {
        if (depth == 0) return;
    }
    public Class4 method25(Class2 arg0, int depth) {
        if (depth == 0) return new Class4();
        return this.field1;
    }
    public void method26(Class1 arg0, int depth) {
        if (depth == 0) return;
    }
    public void method27(Class2 arg0, Class5 arg1, int depth) {
        if (depth == 0) return;
    }
    public Class2 method28(int depth) {
        if (depth == 0) return new Class2();
        return this.field12;
    }
    public void method29(int depth) {
        if (depth == 0) return;
    }
    public Class1 method30(Class3 arg0, Class1 arg1, int depth) {
        if (depth == 0) return new Class1();
        return this.field1;
    }
}