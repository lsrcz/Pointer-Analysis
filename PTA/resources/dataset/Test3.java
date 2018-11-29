package dataset;

import benchmark.internal.Benchmark;
import benchmark.tool.BasicClass;
class Test3Lib{
    public static Test3Class1 local1;
    public static Test3Class1 local2;
    public static Test3Class1 local3;
    public static Test3Class1 local4;
    public static Test3Class2 local5;
    public static Test3Class2 local6;
}
class Test3Class1 extends BasicClass {
    public Test3Class2 field1;
    public static Test3Class2 field2;
    public void method1(int depth) {
        if (depth == 0) return;
        if (depth>4) {
            this.field2.method6(this.field2,this.field2,depth-1);
        }
        for (int local7 = 0; local7<=0; local7 += 1) {
            if (depth>=2) {
                if (depth>2) {
                    for (int local8 = 0; local8<=1; local8 += 1) {
                        for (int local9 = 0; local9<=0; local9 += 1) {
                        }
                    }
                }
            }
        }
        if (depth<1) {
            this.field2.method1(depth-1);
        }else {
            for (int local10 = 0; local10<=0; local10 += 1) {
                this.field2.method5(depth-1);
            }
        }
    }
    public static Test3Class2 method2(Test3Class1 arg0, Test3Class2 arg1, int depth) {
        if (depth == 0) return Test3Lib.local5;
        field2.field5=arg1;
        field2.field4=arg0.field2.method6(arg1.field2,arg1.field2,depth-1);
        return field2.field2;
    }
    public static void method3(Test3Class1 arg0, Test3Class1 arg1, int depth) {
        if (depth == 0) return;
        field2.field1=field2.field4;
        arg0=field2.field1;
        for (int local11 = 0; local11<=0; local11 += 1) {
            for (int local12 = 0; local12<=1; local12 += 1) {
                if (depth<=2) {
                    if (depth==3) {
                        arg0.field2.method1(depth-1);
                    }
                }
            }
        }
    }
}
class Test3Class2 extends Test3Class1 {
    public static Test3Class2 field3;
    public Test3Class2 field4;
    public Test3Class1 field5;
    public Test3Class1 field6;
    public Test3Class1 method4(int depth) {
        if (depth == 0) return Test3Lib.local1;
        this.field1=this.field4;
        for (int local13 = 0; local13<=2; local13 += 1) {
            this.field4.method4(depth-1);
        }
        if (depth>2) {
            this.field4.method5(depth-1);
        }else {
            if (depth==2) {
                this.field2.method5(depth-1);
            }
        }
        return this.field6;
    }
    public static void method5(int depth) {
        if (depth == 0) return;
        for (int local14 = 0; local14<=3; local14 += 1) {
            field2.field2=field3.field2;
        }
        for (int local15 = 0; local15<=1; local15 += 1) {
            if (depth<3) {
                if (depth>3) {
                    field2.field1.method3(field3,field2.field3,depth-1);
                }
            }
        }
    }
    public Test3Class2 method6(Test3Class2 arg0, Test3Class2 arg1, int depth) {
        if (depth == 0) return Test3Lib.local6;
        arg1.field5=this.field3;
        return arg1;
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
        Test3Lib.local4 = new Test3Class1();
        Benchmark.alloc(5);
        Test3Lib.local5 = new Test3Class2();
        Benchmark.alloc(6);
        Test3Lib.local6 = new Test3Class2();
        Test3Lib.local1.field1 = Test3Lib.local5;
        Test3Lib.local1.field2 = Test3Lib.local5;
        Test3Lib.local2.field1 = Test3Lib.local6;
        Test3Lib.local2.field2 = Test3Lib.local5;
        Test3Lib.local3.field1 = Test3Lib.local5;
        Test3Lib.local3.field2 = Test3Lib.local5;
        Test3Lib.local4.field1 = Test3Lib.local5;
        Test3Lib.local4.field2 = Test3Lib.local6;
        Test3Lib.local5.field3 = Test3Lib.local6;
        Test3Lib.local5.field4 = Test3Lib.local6;
        Test3Lib.local5.field5 = Test3Lib.local2;
        Test3Lib.local5.field6 = Test3Lib.local2;
        Test3Lib.local5.field1 = Test3Lib.local6;
        Test3Lib.local5.field2 = Test3Lib.local5;
        Test3Lib.local6.field3 = Test3Lib.local6;
        Test3Lib.local6.field4 = Test3Lib.local5;
        Test3Lib.local6.field5 = Test3Lib.local2;
        Test3Lib.local6.field6 = Test3Lib.local3;
        Test3Lib.local6.field1 = Test3Lib.local6;
        Test3Lib.local6.field2 = Test3Lib.local5;
        for (int local16 = 0; local16<=3; local16 += 1) {
            if (inputValue<=3) {
                Test3Lib.local6.field3.method3(Test3Lib.local6.field3,Test3Lib.local5.field5,3);
            }
        }
        for (int local17 = 0; local17<=3; local17 += 1) {
            if (inputValue>3) {
                Test3Lib.local2=Test3Lib.local6.field6;
            }else {
                Test3Lib.local5.field5=Test3Lib.local2.field2.method4(3);
            }
        }
        Test3Lib.local5.field6=Test3Lib.local6.field1;
        if (inputValue==1) {
            if (inputValue<3) {
                Test3Lib.local5.field1.method1(3);
            }else {
                for (int local18 = 0; local18<=3; local18 += 1) {
                    if (inputValue<1) {
                        for (int local19 = 0; local19<=1; local19 += 1) {
                        }
                    }
                }
            }
        }
        for (int local20 = 0; local20<=1; local20 += 1) {
            Test3Lib.local4.field1.method3(Test3Lib.local6.field4,Test3Lib.local6.field5,3);
        }
        Test3Lib.local5.field6=Test3Lib.local5.field3;
        if (inputValue<1) {
            if (inputValue==2) {
                for (int local21 = 0; local21<=2; local21 += 1) {
                    Test3Lib.local2.field2=Test3Lib.local5;
                }
            }
        }else {
            for (int local22 = 0; local22<=0; local22 += 1) {
                for (int local23 = 0; local23<=1; local23 += 1) {
                    Test3Lib.local6.field1=Test3Lib.local6.field1;
                }
            }
        }
        for (int local24 = 0; local24<=0; local24 += 1) {
            Test3Lib.local4.field1=Test3Lib.local3.field2;
        }
        for (int local25 = 0; local25<=2; local25 += 1) {
            Test3Lib.local6.field1=Test3Lib.local2.field2;
        }
        if (inputValue>=1) {
            if (inputValue<3) {
                if (inputValue==3) {
                    for (int local26 = 0; local26<=1; local26 += 1) {
                        for (int local27 = 0; local27<=1; local27 += 1) {
                        }
                    }
                }
            }else {
                for (int local28 = 0; local28<=3; local28 += 1) {
                    for (int local29 = 0; local29<=3; local29 += 1) {
                        Test3Lib.local1.field2=Test3Lib.local1.field2;
                    }
                }
            }
        }else {
            Test3Lib.local6.field3=Test3Lib.local5.field1;
        }
        Benchmark.test(1,Test3Lib.local1);
        Benchmark.test(2,Test3Lib.local2);
        Benchmark.test(3,Test3Lib.local3);
        Benchmark.test(4,Test3Lib.local4);
        Benchmark.test(5,Test3Lib.local5);
        Benchmark.test(6,Test3Lib.local6);
        Benchmark.test(7,Test3Lib.local1.field1);
        Benchmark.test(8,Test3Lib.local1.field2);
        Benchmark.test(9,Test3Lib.local2.field1);
        Benchmark.test(10,Test3Lib.local2.field2);
        Benchmark.test(11,Test3Lib.local3.field1);
        Benchmark.test(12,Test3Lib.local3.field2);
        Benchmark.test(13,Test3Lib.local4.field1);
        Benchmark.test(14,Test3Lib.local4.field2);
        Benchmark.test(15,Test3Lib.local5.field3);
        Benchmark.test(16,Test3Lib.local5.field4);
        Benchmark.test(17,Test3Lib.local5.field5);
        Benchmark.test(18,Test3Lib.local5.field6);
        Benchmark.test(19,Test3Lib.local5.field1);
        Benchmark.test(20,Test3Lib.local5.field2);
        Benchmark.test(21,Test3Lib.local6.field3);
        Benchmark.test(22,Test3Lib.local6.field4);
        Benchmark.test(23,Test3Lib.local6.field5);
        Benchmark.test(24,Test3Lib.local6.field6);
        Benchmark.test(25,Test3Lib.local6.field1);
        Benchmark.test(26,Test3Lib.local6.field2);
        Benchmark.print();
    }
}
