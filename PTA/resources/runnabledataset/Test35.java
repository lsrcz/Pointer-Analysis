package runnabledataset;

import benchmark.tool.Benchmark;
import benchmark.tool.BasicClass;
class Test35Lib{
public static Test35Class1 local1;
public static Test35Class1 local2;
public static Test35Class2 local3;
public static Test35Class2 local4;
public static Test35Class2 local5;
public static Test35Class2 local6;
public static Test35Class2 local7;
public static Test35Class3 local8;
public static Test35Class3 local9;
public static Test35Class3 local10;
public static Test35Class3 local11;
}
class Test35Class1 extends BasicClass {
public Test35Class3 field1;
public Test35Class3 field2;
public void method1(Test35Class2 arg0, Test35Class3 arg1, int depth) {
if (depth == 0) return;
}
}
class Test35Class2 extends Test35Class1 {
public Test35Class2 field3;
public Test35Class2 field4;
public static void method2(Test35Class2 arg0, int depth) {
if (depth == 0) return;
}
public void method3(int depth) {
if (depth == 0) return;
}
public static Test35Class2 method4(Test35Class2 arg0, int depth) {
if (depth == 0) return Test35Lib.local4;
return arg0.field2.field5.field4;
}
}
class Test35Class3 extends Test35Class2 {
public Test35Class3 field5;
public static void method5(Test35Class2 arg0, int depth) {
if (depth == 0) return;
for (int local12 = 0; local12<=3; local12 += 1) {
arg0.field2.field5.field3=arg0.field4.field1.field4;
}
}
}
public class Test35{
public static void main(String[] args) {
int inputValue = 10;
Benchmark.alloc(1);
Test35Lib.local1 = new Test35Class1();
Benchmark.alloc(2);
Test35Lib.local2 = new Test35Class1();
Benchmark.alloc(3);
Test35Lib.local3 = new Test35Class2();
Benchmark.alloc(4);
Test35Lib.local4 = new Test35Class2();
Benchmark.alloc(5);
Test35Lib.local5 = new Test35Class2();
Benchmark.alloc(6);
Test35Lib.local6 = new Test35Class2();
Benchmark.alloc(7);
Test35Lib.local7 = new Test35Class2();
Benchmark.alloc(8);
Test35Lib.local8 = new Test35Class3();
Benchmark.alloc(9);
Test35Lib.local9 = new Test35Class3();
Benchmark.alloc(10);
Test35Lib.local10 = new Test35Class3();
Benchmark.alloc(11);
Test35Lib.local11 = new Test35Class3();
Test35Lib.local1.field1 = Test35Lib.local10;
Test35Lib.local1.field2 = Test35Lib.local10;
Test35Lib.local2.field1 = Test35Lib.local10;
Test35Lib.local2.field2 = Test35Lib.local9;
Test35Lib.local3.field3 = Test35Lib.local9;
Test35Lib.local3.field4 = Test35Lib.local5;
Test35Lib.local3.field1 = Test35Lib.local10;
Test35Lib.local3.field2 = Test35Lib.local8;
Test35Lib.local4.field3 = Test35Lib.local10;
Test35Lib.local4.field4 = Test35Lib.local7;
Test35Lib.local4.field1 = Test35Lib.local8;
Test35Lib.local4.field2 = Test35Lib.local8;
Test35Lib.local5.field3 = Test35Lib.local3;
Test35Lib.local5.field4 = Test35Lib.local11;
Test35Lib.local5.field1 = Test35Lib.local11;
Test35Lib.local5.field2 = Test35Lib.local10;
Test35Lib.local6.field3 = Test35Lib.local11;
Test35Lib.local6.field4 = Test35Lib.local5;
Test35Lib.local6.field1 = Test35Lib.local10;
Test35Lib.local6.field2 = Test35Lib.local9;
Test35Lib.local7.field3 = Test35Lib.local3;
Test35Lib.local7.field4 = Test35Lib.local3;
Test35Lib.local7.field1 = Test35Lib.local9;
Test35Lib.local7.field2 = Test35Lib.local8;
Test35Lib.local8.field5 = Test35Lib.local9;
Test35Lib.local8.field3 = Test35Lib.local6;
Test35Lib.local8.field4 = Test35Lib.local4;
Test35Lib.local8.field1 = Test35Lib.local9;
Test35Lib.local8.field2 = Test35Lib.local9;
Test35Lib.local9.field5 = Test35Lib.local8;
Test35Lib.local9.field3 = Test35Lib.local5;
Test35Lib.local9.field4 = Test35Lib.local10;
Test35Lib.local9.field1 = Test35Lib.local11;
Test35Lib.local9.field2 = Test35Lib.local8;
Test35Lib.local10.field5 = Test35Lib.local11;
Test35Lib.local10.field3 = Test35Lib.local11;
Test35Lib.local10.field4 = Test35Lib.local10;
Test35Lib.local10.field1 = Test35Lib.local8;
Test35Lib.local10.field2 = Test35Lib.local11;
Test35Lib.local11.field5 = Test35Lib.local9;
Test35Lib.local11.field3 = Test35Lib.local10;
Test35Lib.local11.field4 = Test35Lib.local11;
Test35Lib.local11.field1 = Test35Lib.local9;
Test35Lib.local11.field2 = Test35Lib.local8;
Test35Lib.local10.field1.method3(3);
for (int local13 = 0; local13<=3; local13 += 1) {
Test35Lib.local11.field4.field1.method5(Test35Lib.local2.field2.field5,3);
}
Test35Lib.local1=Test35Lib.local3.field4.field2.field5;
Benchmark.test(1,Test35Lib.local1);
Benchmark.test(2,Test35Lib.local2);
Benchmark.test(3,Test35Lib.local3);
Benchmark.test(4,Test35Lib.local4);
Benchmark.test(5,Test35Lib.local5);
Benchmark.test(6,Test35Lib.local6);
Benchmark.test(7,Test35Lib.local7);
Benchmark.test(8,Test35Lib.local8);
Benchmark.test(9,Test35Lib.local9);
Benchmark.test(10,Test35Lib.local10);
Benchmark.test(11,Test35Lib.local11);
Benchmark.test(12,Test35Lib.local1.field1);
Benchmark.test(13,Test35Lib.local1.field2);
Benchmark.test(14,Test35Lib.local2.field1);
Benchmark.test(15,Test35Lib.local2.field2);
Benchmark.test(16,Test35Lib.local3.field3);
Benchmark.test(17,Test35Lib.local3.field4);
Benchmark.test(18,Test35Lib.local3.field1);
Benchmark.test(19,Test35Lib.local3.field2);
Benchmark.test(20,Test35Lib.local4.field3);
Benchmark.test(21,Test35Lib.local4.field4);
Benchmark.test(22,Test35Lib.local4.field1);
Benchmark.test(23,Test35Lib.local4.field2);
Benchmark.test(24,Test35Lib.local5.field3);
Benchmark.test(25,Test35Lib.local5.field4);
Benchmark.test(26,Test35Lib.local5.field1);
Benchmark.test(27,Test35Lib.local5.field2);
Benchmark.test(28,Test35Lib.local6.field3);
Benchmark.test(29,Test35Lib.local6.field4);
Benchmark.test(30,Test35Lib.local6.field1);
Benchmark.test(31,Test35Lib.local6.field2);
Benchmark.test(32,Test35Lib.local7.field3);
Benchmark.test(33,Test35Lib.local7.field4);
Benchmark.test(34,Test35Lib.local7.field1);
Benchmark.test(35,Test35Lib.local7.field2);
Benchmark.test(36,Test35Lib.local8.field5);
Benchmark.test(37,Test35Lib.local8.field3);
Benchmark.test(38,Test35Lib.local8.field4);
Benchmark.test(39,Test35Lib.local8.field1);
Benchmark.test(40,Test35Lib.local8.field2);
Benchmark.test(41,Test35Lib.local9.field5);
Benchmark.test(42,Test35Lib.local9.field3);
Benchmark.test(43,Test35Lib.local9.field4);
Benchmark.test(44,Test35Lib.local9.field1);
Benchmark.test(45,Test35Lib.local9.field2);
Benchmark.test(46,Test35Lib.local10.field5);
Benchmark.test(47,Test35Lib.local10.field3);
Benchmark.test(48,Test35Lib.local10.field4);
Benchmark.test(49,Test35Lib.local10.field1);
Benchmark.test(50,Test35Lib.local10.field2);
Benchmark.test(51,Test35Lib.local11.field5);
Benchmark.test(52,Test35Lib.local11.field3);
Benchmark.test(53,Test35Lib.local11.field4);
Benchmark.test(54,Test35Lib.local11.field1);
Benchmark.test(55,Test35Lib.local11.field2);
Benchmark.print();
}
}
