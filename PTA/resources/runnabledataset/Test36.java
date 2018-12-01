package runnabledataset;

import benchmark.tool.Benchmark;
import benchmark.tool.BasicClass;
class Test36Lib{
public static Test36Class1 local1;
public static Test36Class1 local2;
public static Test36Class1 local3;
public static Test36Class1 local4;
public static Test36Class1 local5;
public static Test36Class2 local6;
public static Test36Class3 local7;
public static Test36Class3 local8;
public static Test36Class3 local9;
}
class Test36Class1 extends BasicClass {
public Test36Class3 field1;
public Test36Class1 field2;
public static void method1(Test36Class3 arg0, int depth) {
if (depth == 0) return;
}
public static void method2(int depth) {
if (depth == 0) return;
for (int local10 = 0; local10<=1; local10 += 1) {
for (int local11 = 0; local11<=1; local11 += 1) {
if (depth==4) {
for (int local12 = 0; local12<=1; local12 += 1) {
if (depth<=1) {
}
}
}
}
}
}
public Test36Class3 method3(Test36Class3 arg0, int depth) {
if (depth == 0) return Test36Lib.local7;
this.field1.field8.field1.method5(depth-1);
return this.field1.field6.field1;
}
}
class Test36Class2 extends Test36Class1 {
public Test36Class1 field3;
public Test36Class3 method4(Test36Class3 arg0, Test36Class2 arg1, int depth) {
if (depth == 0) return Test36Lib.local7;
return this.field1.field1.field1;
}
public static Test36Class3 method5(int depth) {
if (depth == 0) return Test36Lib.local7;
return Test36Lib.local8;
}
public static void method6(int depth) {
if (depth == 0) return;
}
}
class Test36Class3 extends Test36Class2 {
public Test36Class1 field4;
public Test36Class2 field5;
public Test36Class1 field6;
public Test36Class1 field7;
public Test36Class2 field8;
public Test36Class3 method7(Test36Class3 arg0, Test36Class2 arg1, int depth) {
if (depth == 0) return Test36Lib.local9;
return arg0.field3.field2.field1;
}
}
public class Test36{
public static void main(String[] args) {
int inputValue = 10;
Benchmark.alloc(1);
Test36Lib.local1 = new Test36Class1();
Benchmark.alloc(2);
Test36Lib.local2 = new Test36Class1();
Benchmark.alloc(3);
Test36Lib.local3 = new Test36Class1();
Benchmark.alloc(4);
Test36Lib.local4 = new Test36Class1();
Benchmark.alloc(5);
Test36Lib.local5 = new Test36Class1();
Benchmark.alloc(6);
Test36Lib.local6 = new Test36Class2();
Benchmark.alloc(7);
Test36Lib.local7 = new Test36Class3();
Benchmark.alloc(8);
Test36Lib.local8 = new Test36Class3();
Benchmark.alloc(9);
Test36Lib.local9 = new Test36Class3();
Test36Lib.local1.field1 = Test36Lib.local7;
Test36Lib.local1.field2 = Test36Lib.local7;
Test36Lib.local2.field1 = Test36Lib.local7;
Test36Lib.local2.field2 = Test36Lib.local6;
Test36Lib.local3.field1 = Test36Lib.local9;
Test36Lib.local3.field2 = Test36Lib.local9;
Test36Lib.local4.field1 = Test36Lib.local8;
Test36Lib.local4.field2 = Test36Lib.local4;
Test36Lib.local5.field1 = Test36Lib.local7;
Test36Lib.local5.field2 = Test36Lib.local7;
Test36Lib.local6.field3 = Test36Lib.local1;
Test36Lib.local6.field1 = Test36Lib.local8;
Test36Lib.local6.field2 = Test36Lib.local3;
Test36Lib.local7.field4 = Test36Lib.local9;
Test36Lib.local7.field5 = Test36Lib.local9;
Test36Lib.local7.field6 = Test36Lib.local6;
Test36Lib.local7.field7 = Test36Lib.local3;
Test36Lib.local7.field8 = Test36Lib.local6;
Test36Lib.local7.field3 = Test36Lib.local7;
Test36Lib.local7.field1 = Test36Lib.local8;
Test36Lib.local7.field2 = Test36Lib.local6;
Test36Lib.local8.field4 = Test36Lib.local3;
Test36Lib.local8.field5 = Test36Lib.local7;
Test36Lib.local8.field6 = Test36Lib.local1;
Test36Lib.local8.field7 = Test36Lib.local8;
Test36Lib.local8.field8 = Test36Lib.local6;
Test36Lib.local8.field3 = Test36Lib.local8;
Test36Lib.local8.field1 = Test36Lib.local7;
Test36Lib.local8.field2 = Test36Lib.local1;
Test36Lib.local9.field4 = Test36Lib.local6;
Test36Lib.local9.field5 = Test36Lib.local6;
Test36Lib.local9.field6 = Test36Lib.local5;
Test36Lib.local9.field7 = Test36Lib.local2;
Test36Lib.local9.field8 = Test36Lib.local7;
Test36Lib.local9.field3 = Test36Lib.local8;
Test36Lib.local9.field1 = Test36Lib.local9;
Test36Lib.local9.field2 = Test36Lib.local3;
Test36Lib.local9.field8.field3.field1.method3(Test36Lib.local4.field1.field1,3);
Test36Lib.local7.field1.field2=Test36Lib.local9.field7.field1.field1.method5(3);
Test36Lib.local8.field2.field1.field5=Test36Lib.local5.field1.method4(Test36Lib.local9.field1.field3.field1,Test36Lib.local5.field1.field8.field1,3);
Benchmark.test(1,Test36Lib.local1);
Benchmark.test(2,Test36Lib.local2);
Benchmark.test(3,Test36Lib.local3);
Benchmark.test(4,Test36Lib.local4);
Benchmark.test(5,Test36Lib.local5);
Benchmark.test(6,Test36Lib.local6);
Benchmark.test(7,Test36Lib.local7);
Benchmark.test(8,Test36Lib.local8);
Benchmark.test(9,Test36Lib.local9);
Benchmark.test(10,Test36Lib.local1.field1);
Benchmark.test(11,Test36Lib.local1.field2);
Benchmark.test(12,Test36Lib.local2.field1);
Benchmark.test(13,Test36Lib.local2.field2);
Benchmark.test(14,Test36Lib.local3.field1);
Benchmark.test(15,Test36Lib.local3.field2);
Benchmark.test(16,Test36Lib.local4.field1);
Benchmark.test(17,Test36Lib.local4.field2);
Benchmark.test(18,Test36Lib.local5.field1);
Benchmark.test(19,Test36Lib.local5.field2);
Benchmark.test(20,Test36Lib.local6.field3);
Benchmark.test(21,Test36Lib.local6.field1);
Benchmark.test(22,Test36Lib.local6.field2);
Benchmark.test(23,Test36Lib.local7.field4);
Benchmark.test(24,Test36Lib.local7.field5);
Benchmark.test(25,Test36Lib.local7.field6);
Benchmark.test(26,Test36Lib.local7.field7);
Benchmark.test(27,Test36Lib.local7.field8);
Benchmark.test(28,Test36Lib.local7.field3);
Benchmark.test(29,Test36Lib.local7.field1);
Benchmark.test(30,Test36Lib.local7.field2);
Benchmark.test(31,Test36Lib.local8.field4);
Benchmark.test(32,Test36Lib.local8.field5);
Benchmark.test(33,Test36Lib.local8.field6);
Benchmark.test(34,Test36Lib.local8.field7);
Benchmark.test(35,Test36Lib.local8.field8);
Benchmark.test(36,Test36Lib.local8.field3);
Benchmark.test(37,Test36Lib.local8.field1);
Benchmark.test(38,Test36Lib.local8.field2);
Benchmark.test(39,Test36Lib.local9.field4);
Benchmark.test(40,Test36Lib.local9.field5);
Benchmark.test(41,Test36Lib.local9.field6);
Benchmark.test(42,Test36Lib.local9.field7);
Benchmark.test(43,Test36Lib.local9.field8);
Benchmark.test(44,Test36Lib.local9.field3);
Benchmark.test(45,Test36Lib.local9.field1);
Benchmark.test(46,Test36Lib.local9.field2);
Benchmark.print();
}
}
