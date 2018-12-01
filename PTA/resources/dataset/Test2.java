package dataset;

import benchmark.internal.Benchmark;
import benchmark.tool.BasicClass;
class Test2Lib{
    public static Test2Class1 local1;
    public static Test2Class1 local2;
    public static Test2Class1 local3;
    public static Test2Class1 local4;
    public static Test2Class2 local5;
    public static Test2Class3 local6;
    public static Test2Class3 local7;
    public static Test2Class3 local8;
    public static Test2Class3 local9;
    public static Test2Class3 local10;
}
class Test2Class1 extends BasicClass {
    public Test2Class3 field1;
    public void method1(int depth) {
        if (depth == 0) return;
        for (int local11 = 0; local11<=1; local11 += 1) {
            for (int local12 = 0; local12<=0; local12 += 1) {
                for (int local13 = 0; local13<=0; local13 += 1) {
                    for (int local14 = 0; local14<=1; local14 += 1) {
                        this.field1=this.field1.method2(this.field1,depth-1);
                    }
                }
            }
        }
    }
}
class Test2Class2 extends Test2Class1 {
    public Test2Class3 field2;
    public Test2Class3 method2(Test2Class3 arg0, int depth) {
        if (depth == 0) return Test2Lib.local10;
        arg0.field4=arg0.field1;
        return arg0.field2;
    }
    public Test2Class2 method3(Test2Class2 arg0, int depth) {
        if (depth == 0) return Test2Lib.local9;
        arg0.field1=arg0.field1;
        this.method4(this.field2,arg0.field2,depth-1);
        this.field1.method4(arg0,arg0,depth-1);
        arg0.field2.method5(depth-1);
        return this.field1;
    }
    public void method4(Test2Class2 arg0, Test2Class1 arg1, int depth) {
        if (depth == 0) return;
        if (depth>1) {
            arg1=arg0.field2.method5(depth-1);
        }else {
            for (int local15 = 0; local15<=0; local15 += 1) {
                arg0=arg0.field1;
            }
        }
        if (depth==3) {
            for (int local16 = 0; local16<=2; local16 += 1) {
                arg1.field1=arg0.field1;
            }
        }
        arg0.field2=arg0.field2;
        arg1=this.field2;
    }
}
class Test2Class3 extends Test2Class2 {
    public Test2Class3 field3;
    public Test2Class1 field4;
    public Test2Class1 method5(int depth) {
        if (depth == 0) return Test2Lib.local7;
        this.method1(depth-1);
        if (depth<4) {
            this.field2.method4(this.field1,this.field4,depth-1);
        }else {
            this.field2.method4(this.field1,this.field4,depth-1);
        }
        this.method5(depth-1);
        for (int local17 = 0; local17<=3; local17 += 1) {
            if (depth==1) {
                this.field4=this.field2;
            }else {
                for (int local18 = 0; local18<=0; local18 += 1) {
                    this.field3=this.field3;
                }
            }
        }
        return this.field2;
    }
}
public class Test2{
    public static void main(String[] args) {
        int inputValue = 0;
        Benchmark.alloc(1);
        Test2Lib.local1 = new Test2Class1();
        Benchmark.alloc(2);
        Test2Lib.local2 = new Test2Class1();
        Benchmark.alloc(3);
        Test2Lib.local3 = new Test2Class1();
        Benchmark.alloc(4);
        Test2Lib.local4 = new Test2Class1();
        Benchmark.alloc(5);
        Test2Lib.local5 = new Test2Class2();
        Benchmark.alloc(6);
        Test2Lib.local6 = new Test2Class3();
        Benchmark.alloc(7);
        Test2Lib.local7 = new Test2Class3();
        Benchmark.alloc(8);
        Test2Lib.local8 = new Test2Class3();
        Benchmark.alloc(9);
        Test2Lib.local9 = new Test2Class3();
        Benchmark.alloc(10);
        Test2Lib.local10 = new Test2Class3();
        Test2Lib.local1.field1 = Test2Lib.local7;
        Test2Lib.local2.field1 = Test2Lib.local10;
        Test2Lib.local3.field1 = Test2Lib.local7;
        Test2Lib.local4.field1 = Test2Lib.local6;
        Test2Lib.local5.field2 = Test2Lib.local6;
        Test2Lib.local5.field1 = Test2Lib.local8;
        Test2Lib.local6.field3 = Test2Lib.local8;
        Test2Lib.local6.field4 = Test2Lib.local4;
        Test2Lib.local6.field2 = Test2Lib.local7;
        Test2Lib.local6.field1 = Test2Lib.local8;
        Test2Lib.local7.field3 = Test2Lib.local7;
        Test2Lib.local7.field4 = Test2Lib.local1;
        Test2Lib.local7.field2 = Test2Lib.local8;
        Test2Lib.local7.field1 = Test2Lib.local8;
        Test2Lib.local8.field3 = Test2Lib.local6;
        Test2Lib.local8.field4 = Test2Lib.local2;
        Test2Lib.local8.field2 = Test2Lib.local6;
        Test2Lib.local8.field1 = Test2Lib.local7;
        Test2Lib.local9.field3 = Test2Lib.local7;
        Test2Lib.local9.field4 = Test2Lib.local1;
        Test2Lib.local9.field2 = Test2Lib.local6;
        Test2Lib.local9.field1 = Test2Lib.local10;
        Test2Lib.local10.field3 = Test2Lib.local10;
        Test2Lib.local10.field4 = Test2Lib.local3;
        Test2Lib.local10.field2 = Test2Lib.local6;
        Test2Lib.local10.field1 = Test2Lib.local10;
        /*if (inputValue>=1) {
            for (int local19 = 0; local19<=3; local19 += 1) {
                Test2Lib.local7.field4=Test2Lib.local7;
            }
        }
        if (inputValue>2) {
            Test2Lib.local5=Test2Lib.local8.field1;
        }else {
            Test2Lib.local5.field2=Test2Lib.local6.field1;
        }
        Test2Lib.local6.field2=Test2Lib.local6.field2;
        if (inputValue<=1) {
            for (int local20 = 0; local20<=0; local20 += 1) {
                Test2Lib.local5=Test2Lib.local4.field1;
            }
        }
        Test2Lib.local5=Test2Lib.local5.method3(Test2Lib.local4.field1,3);*/
        Benchmark.test(1,Test2Lib.local1);
        Benchmark.test(2,Test2Lib.local2);
        Benchmark.test(3,Test2Lib.local3);
        Benchmark.test(4,Test2Lib.local4);
        Benchmark.test(5,Test2Lib.local5);
        Benchmark.test(6,Test2Lib.local6);
        Benchmark.test(7,Test2Lib.local7);
        Benchmark.test(8,Test2Lib.local8);
        Benchmark.test(9,Test2Lib.local9);
        Benchmark.test(10,Test2Lib.local10);
        Benchmark.test(11,Test2Lib.local1.field1);
        Benchmark.test(12,Test2Lib.local2.field1);
        Benchmark.test(13,Test2Lib.local3.field1);
        Benchmark.test(14,Test2Lib.local4.field1);
        Benchmark.test(15,Test2Lib.local5.field2);
        Benchmark.test(16,Test2Lib.local5.field1);
        Benchmark.test(17,Test2Lib.local6.field3);
        Benchmark.test(18,Test2Lib.local6.field4);
        Benchmark.test(19,Test2Lib.local6.field2);
        Benchmark.test(20,Test2Lib.local6.field1);
        Benchmark.test(21,Test2Lib.local7.field3);
        Benchmark.test(22,Test2Lib.local7.field4);
        Benchmark.test(23,Test2Lib.local7.field2);
        Benchmark.test(24,Test2Lib.local7.field1);
        Benchmark.test(25,Test2Lib.local8.field3);
        Benchmark.test(26,Test2Lib.local8.field4);
        Benchmark.test(27,Test2Lib.local8.field2);
        Benchmark.test(28,Test2Lib.local8.field1);
        Benchmark.test(29,Test2Lib.local9.field3);
        Benchmark.test(30,Test2Lib.local9.field4);
        Benchmark.test(31,Test2Lib.local9.field2);
        Benchmark.test(32,Test2Lib.local9.field1);
        Benchmark.test(33,Test2Lib.local10.field3);
        Benchmark.test(34,Test2Lib.local10.field4);
        Benchmark.test(35,Test2Lib.local10.field2);
        Benchmark.test(36,Test2Lib.local10.field1);
        Benchmark.print();
    }
}
