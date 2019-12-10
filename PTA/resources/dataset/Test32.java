package dataset;

import benchmark.internal.Benchmark;
import benchmark.tool.BasicClass;
class Test32Lib{
    public static Test32Class1 local1;
    public static Test32Class1 local2;
    public static Test32Class1 local3;
    public static Test32Class2 local4;
    public static Test32Class2 local5;
    public static Test32Class3 local6;
    public static Test32Class3 local7;
    public static Test32Class3 local8;
}
class Test32Class1 extends BasicClass {
    public Test32Class1 field1;
    public Test32Class3 field2;
    public Test32Class1 field3;
    public Test32Class1 field4;
    public Test32Class3 field5;
    public void method1(Test32Class2 arg0, Test32Class3 arg1, int depth) {
        if (depth == 0) return;
        arg1.field6.field6=arg1.field13.field8.field5;
    }
    public void method2(Test32Class3 arg0, int depth) {
        if (depth == 0) return;
        arg0.field2.field2.method6(depth-1);
    }
}
class Test32Class2 extends Test32Class1 {
    public Test32Class2 field6;
    public Test32Class1 field7;
    public Test32Class1 field8;
    public Test32Class1 field9;
    public static Test32Class2 method3(Test32Class1 arg0, int depth) {
        if (depth == 0) return Test32Lib.local4;
        arg0.field1.field5.field6=arg0.field1.field5.field13;
        return arg0.field5.field7.field5;
    }
    public static Test32Class1 method4(int depth) {
        if (depth == 0) return Test32Lib.local2;
        return Test32Lib.local1;
    }
}
class Test32Class3 extends Test32Class2 {
    public Test32Class1 field10;
    public Test32Class1 field11;
    public Test32Class1 field12;
    public Test32Class3 field13;
    public Test32Class1 field14;
    public Test32Class3 method5(int depth) {
        if (depth == 0) return Test32Lib.local7;
        return this.field8.field5.field2;
    }
    public void method6(int depth) {
        if (depth == 0) return;
        this.field13.field13.field6=this.field7.field3.field2;
    }
    public void method7(int depth) {
        if (depth == 0) return;
    }
}
public class Test32{
    public static void main(String[] args) {
        int inputValue = 0;
        Benchmark.alloc(1);
        Test32Lib.local1 = new Test32Class1();
        Benchmark.alloc(2);
        Test32Lib.local2 = new Test32Class1();
        Benchmark.alloc(3);
        Test32Lib.local3 = new Test32Class1();
        Benchmark.alloc(4);
        Test32Lib.local4 = new Test32Class2();
        Benchmark.alloc(5);
        Test32Lib.local5 = new Test32Class2();
        Benchmark.alloc(6);
        Test32Lib.local6 = new Test32Class3();
        Benchmark.alloc(7);
        Test32Lib.local7 = new Test32Class3();
        Benchmark.alloc(8);
        Test32Lib.local8 = new Test32Class3();
        Test32Lib.local1.field1 = Test32Lib.local2;
        Test32Lib.local1.field2 = Test32Lib.local8;
        Test32Lib.local1.field3 = Test32Lib.local3;
        Test32Lib.local1.field4 = Test32Lib.local1;
        Test32Lib.local1.field5 = Test32Lib.local7;
        Test32Lib.local2.field1 = Test32Lib.local1;
        Test32Lib.local2.field2 = Test32Lib.local8;
        Test32Lib.local2.field3 = Test32Lib.local6;
        Test32Lib.local2.field4 = Test32Lib.local8;
        Test32Lib.local2.field5 = Test32Lib.local7;
        Test32Lib.local3.field1 = Test32Lib.local6;
        Test32Lib.local3.field2 = Test32Lib.local6;
        Test32Lib.local3.field3 = Test32Lib.local6;
        Test32Lib.local3.field4 = Test32Lib.local4;
        Test32Lib.local3.field5 = Test32Lib.local7;
        Test32Lib.local4.field6 = Test32Lib.local8;
        Test32Lib.local4.field7 = Test32Lib.local6;
        Test32Lib.local4.field8 = Test32Lib.local7;
        Test32Lib.local4.field9 = Test32Lib.local8;
        Test32Lib.local4.field1 = Test32Lib.local5;
        Test32Lib.local4.field2 = Test32Lib.local8;
        Test32Lib.local4.field3 = Test32Lib.local8;
        Test32Lib.local4.field4 = Test32Lib.local5;
        Test32Lib.local4.field5 = Test32Lib.local8;
        Test32Lib.local5.field6 = Test32Lib.local6;
        Test32Lib.local5.field7 = Test32Lib.local6;
        Test32Lib.local5.field8 = Test32Lib.local4;
        Test32Lib.local5.field9 = Test32Lib.local7;
        Test32Lib.local5.field1 = Test32Lib.local5;
        Test32Lib.local5.field2 = Test32Lib.local7;
        Test32Lib.local5.field3 = Test32Lib.local8;
        Test32Lib.local5.field4 = Test32Lib.local7;
        Test32Lib.local5.field5 = Test32Lib.local7;
        Test32Lib.local6.field10 = Test32Lib.local7;
        Test32Lib.local6.field11 = Test32Lib.local7;
        Test32Lib.local6.field12 = Test32Lib.local5;
        Test32Lib.local6.field13 = Test32Lib.local7;
        Test32Lib.local6.field14 = Test32Lib.local3;
        Test32Lib.local6.field6 = Test32Lib.local6;
        Test32Lib.local6.field7 = Test32Lib.local4;
        Test32Lib.local6.field8 = Test32Lib.local1;
        Test32Lib.local6.field9 = Test32Lib.local1;
        Test32Lib.local6.field1 = Test32Lib.local1;
        Test32Lib.local6.field2 = Test32Lib.local7;
        Test32Lib.local6.field3 = Test32Lib.local8;
        Test32Lib.local6.field4 = Test32Lib.local1;
        Test32Lib.local6.field5 = Test32Lib.local7;
        Test32Lib.local7.field10 = Test32Lib.local1;
        Test32Lib.local7.field11 = Test32Lib.local6;
        Test32Lib.local7.field12 = Test32Lib.local8;
        Test32Lib.local7.field13 = Test32Lib.local6;
        Test32Lib.local7.field14 = Test32Lib.local5;
        Test32Lib.local7.field6 = Test32Lib.local5;
        Test32Lib.local7.field7 = Test32Lib.local4;
        Test32Lib.local7.field8 = Test32Lib.local3;
        Test32Lib.local7.field9 = Test32Lib.local6;
        Test32Lib.local7.field1 = Test32Lib.local6;
        Test32Lib.local7.field2 = Test32Lib.local8;
        Test32Lib.local7.field3 = Test32Lib.local7;
        Test32Lib.local7.field4 = Test32Lib.local4;
        Test32Lib.local7.field5 = Test32Lib.local6;
        Test32Lib.local8.field10 = Test32Lib.local1;
        Test32Lib.local8.field11 = Test32Lib.local5;
        Test32Lib.local8.field12 = Test32Lib.local2;
        Test32Lib.local8.field13 = Test32Lib.local6;
        Test32Lib.local8.field14 = Test32Lib.local1;
        Test32Lib.local8.field6 = Test32Lib.local7;
        Test32Lib.local8.field7 = Test32Lib.local8;
        Test32Lib.local8.field8 = Test32Lib.local2;
        Test32Lib.local8.field9 = Test32Lib.local2;
        Test32Lib.local8.field1 = Test32Lib.local5;
        Test32Lib.local8.field2 = Test32Lib.local6;
        Test32Lib.local8.field3 = Test32Lib.local8;
        Test32Lib.local8.field4 = Test32Lib.local7;
        Test32Lib.local8.field5 = Test32Lib.local8;
        Test32Lib.local8.field3.field2.method6(3);
        Test32Lib.local7.field3.field5.field14.method2(Test32Lib.local8.field8.field5.field13,3);
        for (int local9 = 0; local9<=1; local9 += 1) {
            Test32Lib.local7.field6.field8.field5.method7(3);
        }
        Benchmark.test(1,Test32Lib.local1);
        Benchmark.test(2,Test32Lib.local2);
        Benchmark.test(3,Test32Lib.local3);
        Benchmark.test(4,Test32Lib.local4);
        Benchmark.test(5,Test32Lib.local5);
        Benchmark.test(6,Test32Lib.local6);
        Benchmark.test(7,Test32Lib.local7);
        Benchmark.test(8,Test32Lib.local8);
        Benchmark.test(9,Test32Lib.local1.field1);
        Benchmark.test(10,Test32Lib.local1.field2);
        Benchmark.test(11,Test32Lib.local1.field3);
        Benchmark.test(12,Test32Lib.local1.field4);
        Benchmark.test(13,Test32Lib.local1.field5);
        Benchmark.test(14,Test32Lib.local2.field1);
        Benchmark.test(15,Test32Lib.local2.field2);
        Benchmark.test(16,Test32Lib.local2.field3);
        Benchmark.test(17,Test32Lib.local2.field4);
        Benchmark.test(18,Test32Lib.local2.field5);
        Benchmark.test(19,Test32Lib.local3.field1);
        Benchmark.test(20,Test32Lib.local3.field2);
        Benchmark.test(21,Test32Lib.local3.field3);
        Benchmark.test(22,Test32Lib.local3.field4);
        Benchmark.test(23,Test32Lib.local3.field5);
        Benchmark.test(24,Test32Lib.local4.field6);
        Benchmark.test(25,Test32Lib.local4.field7);
        Benchmark.test(26,Test32Lib.local4.field8);
        Benchmark.test(27,Test32Lib.local4.field9);
        Benchmark.test(28,Test32Lib.local4.field1);
        Benchmark.test(29,Test32Lib.local4.field2);
        Benchmark.test(30,Test32Lib.local4.field3);
        Benchmark.test(31,Test32Lib.local4.field4);
        Benchmark.test(32,Test32Lib.local4.field5);
        Benchmark.test(33,Test32Lib.local5.field6);
        Benchmark.test(34,Test32Lib.local5.field7);
        Benchmark.test(35,Test32Lib.local5.field8);
        Benchmark.test(36,Test32Lib.local5.field9);
        Benchmark.test(37,Test32Lib.local5.field1);
        Benchmark.test(38,Test32Lib.local5.field2);
        Benchmark.test(39,Test32Lib.local5.field3);
        Benchmark.test(40,Test32Lib.local5.field4);
        Benchmark.test(41,Test32Lib.local5.field5);
        Benchmark.test(42,Test32Lib.local6.field10);
        Benchmark.test(43,Test32Lib.local6.field11);
        Benchmark.test(44,Test32Lib.local6.field12);
        Benchmark.test(45,Test32Lib.local6.field13);
        Benchmark.test(46,Test32Lib.local6.field14);
        Benchmark.test(47,Test32Lib.local6.field6);
        Benchmark.test(48,Test32Lib.local6.field7);
        Benchmark.test(49,Test32Lib.local6.field8);
        Benchmark.test(50,Test32Lib.local6.field9);
        Benchmark.test(51,Test32Lib.local6.field1);
        Benchmark.test(52,Test32Lib.local6.field2);
        Benchmark.test(53,Test32Lib.local6.field3);
        Benchmark.test(54,Test32Lib.local6.field4);
        Benchmark.test(55,Test32Lib.local6.field5);
        Benchmark.test(56,Test32Lib.local7.field10);
        Benchmark.test(57,Test32Lib.local7.field11);
        Benchmark.test(58,Test32Lib.local7.field12);
        Benchmark.test(59,Test32Lib.local7.field13);
        Benchmark.test(60,Test32Lib.local7.field14);
        Benchmark.test(61,Test32Lib.local7.field6);
        Benchmark.test(62,Test32Lib.local7.field7);
        Benchmark.test(63,Test32Lib.local7.field8);
        Benchmark.test(64,Test32Lib.local7.field9);
        Benchmark.test(65,Test32Lib.local7.field1);
        Benchmark.test(66,Test32Lib.local7.field2);
        Benchmark.test(67,Test32Lib.local7.field3);
        Benchmark.test(68,Test32Lib.local7.field4);
        Benchmark.test(69,Test32Lib.local7.field5);
        Benchmark.test(70,Test32Lib.local8.field10);
        Benchmark.test(71,Test32Lib.local8.field11);
        Benchmark.test(72,Test32Lib.local8.field12);
        Benchmark.test(73,Test32Lib.local8.field13);
        Benchmark.test(74,Test32Lib.local8.field14);
        Benchmark.test(75,Test32Lib.local8.field6);
        Benchmark.test(76,Test32Lib.local8.field7);
        Benchmark.test(77,Test32Lib.local8.field8);
        Benchmark.test(78,Test32Lib.local8.field9);
        Benchmark.test(79,Test32Lib.local8.field1);
        Benchmark.test(80,Test32Lib.local8.field2);
        Benchmark.test(81,Test32Lib.local8.field3);
        Benchmark.test(82,Test32Lib.local8.field4);
        Benchmark.test(83,Test32Lib.local8.field5);
        Benchmark.print();
    }
}
