package dataset;

import benchmark.internal.Benchmark;
import benchmark.tool.BasicClass;
class Test3Lib{
    public static Test3Class1 local1;
    public static Test3Class1 local2;
    public static Test3Class1 local3;
    public static Test3Class2 local4;
}
class Test3Class1 extends BasicClass {
    public static Test3Class1 field1;
    public void method1(Test3Class2 arg0, Test3Class2 arg1, int depth) {
        if (depth == 0) return;
        arg1=arg0.field3;
        if (depth>4) {
            if (depth>3) {
                arg1.field5=this;
            }
        }else {
            for (int local5 = 0; local5<=2; local5 += 1) {
                if (depth>=1) {
                    arg1.field4=arg0;
                }else {
                    arg0.field6.method1(arg1.field4,arg0.field4,depth-1);
                }
            }
        }
    }
    public static void method2(Test3Class2 arg0, Test3Class1 arg1, int depth) {
        if (depth == 0) return;
    }
    public Test3Class2 method3(Test3Class2 arg0, int depth) {
        if (depth == 0) return Test3Lib.local4;
        arg0.field1=arg0.field3.method5(arg0.field2,arg0.field4,depth-1);
        if (depth<=4) {
            for (int local6 = 0; local6<=3; local6 += 1) {
                if (depth<=1) {
                    for (int local7 = 0; local7<=1; local7 += 1) {
                        arg0.field2=arg0.field3.method7(arg0.field4,arg0.field3,depth-1);
                    }
                }else {
                    arg0.field2.method7(arg0.field2,arg0.field1,depth-1);
                }
            }
        }else {
            if (depth==1) {
                for (int local8 = 0; local8<=3; local8 += 1) {
                    this.field1=arg0.field5;
                }
            }else {
                for (int local9 = 0; local9<=0; local9 += 1) {
                    arg0.field4=arg0.field4;
                }
            }
        }
        arg0.field6=arg0.field3;
        return arg0.field2;
    }
}
class Test3Class2 extends Test3Class1 {
    public Test3Class2 field2;
    public static Test3Class2 field3;
    public static Test3Class2 field4;
    public static Test3Class1 field5;
    public Test3Class1 field6;
    public void method4(Test3Class1 arg0, Test3Class1 arg1, int depth) {
        if (depth == 0) return;
    }
    public Test3Class2 method5(Test3Class2 arg0, Test3Class1 arg1, int depth) {
        if (depth == 0) return Test3Lib.local4;
        arg0.field2=arg0.field4.method6(depth-1);
        if (depth<2) {
            for (int local10 = 0; local10<=0; local10 += 1) {
                arg0=arg0.field3;
            }
        }else {
            for (int local11 = 0; local11<=1; local11 += 1) {
                this.field1.method2(arg0,this,depth-1);
            }
        }
        arg1.method1(arg0,arg0.field4,depth-1);
        this.field4.method3(this,depth-1);
        return arg0.field4;
    }
    public static Test3Class2 method6(int depth) {
        if (depth == 0) return Test3Lib.local4;
        if (depth==3) {
            field4=field4.field2;
        }
        field3.field5=field5.field1;
        if (depth>=3) {
            if (depth<=2) {
                if (depth<1) {
                    for (int local12 = 0; local12<=2; local12 += 1) {
                        field3.field2.method3(field3,depth-1);
                    }
                }else {
                    for (int local13 = 0; local13<=2; local13 += 1) {
                        if (depth>2) {
                        }
                    }
                }
            }
        }
        for (int local14 = 0; local14<=2; local14 += 1) {
            field3.field6=field3.method7(field3.field2,field4.field4,depth-1);
        }
        return field4.field3;
    }
    public static Test3Class2 method7(Test3Class2 arg0, Test3Class1 arg1, int depth) {
        if (depth == 0) return Test3Lib.local4;
        arg0.field4.method2(field4,arg1.field1,depth-1);
        return field3.field2;
    }
}
public class Test3{
    public static void main(String[] args) {
        int inputValue = 0;
        Benchmark.alloc(1);
        Test3Lib.local1 = new Test3Class1();
        Benchmark.alloc(2);
        Test3Lib.local2 = new Test3Class1();
        Benchmark.alloc(3);
        Test3Lib.local3 = new Test3Class1();
        Benchmark.alloc(4);
        Test3Lib.local4 = new Test3Class2();
        Test3Lib.local1.field1 = Test3Lib.local2;
        Test3Lib.local2.field1 = Test3Lib.local3;
        Test3Lib.local3.field1 = Test3Lib.local2;
        Test3Lib.local4.field2 = Test3Lib.local4;
        Test3Lib.local4.field3 = Test3Lib.local4;
        Test3Lib.local4.field4 = Test3Lib.local4;
        Test3Lib.local4.field5 = Test3Lib.local3;
        Test3Lib.local4.field6 = Test3Lib.local4;
        Test3Lib.local4.field1 = Test3Lib.local1;
        Test3Lib.local4.field3.method2(Test3Lib.local4.field2,Test3Lib.local4.field4,3);
        for (int local18 = 0; local18<=3; local18 += 1) {
            Test3Lib.local2=Test3Lib.local2.field1;
        }
        Benchmark.test(1,Test3Lib.local1);
        Benchmark.test(2,Test3Lib.local2);
        Benchmark.test(3,Test3Lib.local3);
        Benchmark.test(4,Test3Lib.local4);
        Benchmark.test(5,Test3Lib.local1.field1);
        Benchmark.test(6,Test3Lib.local2.field1);
        Benchmark.test(7,Test3Lib.local3.field1);
        Benchmark.test(8,Test3Lib.local4.field2);
        Benchmark.test(9,Test3Lib.local4.field3);
        Benchmark.test(10,Test3Lib.local4.field4);
        Benchmark.test(11,Test3Lib.local4.field5);
        Benchmark.test(12,Test3Lib.local4.field6);
        Benchmark.test(13,Test3Lib.local4.field1);
        Benchmark.print();
    }
}
