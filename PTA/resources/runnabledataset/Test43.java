package runnabledataset;

import benchmark.tool.Benchmark;
import benchmark.tool.BasicClass;
class Test43Lib{
public static Test43Class1 local1;
public static Test43Class1 local2;
public static Test43Class1 local3;
public static Test43Class1 local4;
public static Test43Class2 local5;
public static Test43Class2 local6;
public static Test43Class2 local7;
public static Test43Class2 local8;
public static Test43Class2 local9;
public static Test43Class3 local10;
public static Test43Class3 local11;
public static Test43Class3 local12;
}
class Test43Class1 extends BasicClass {
public Test43Class3 field1;
public Test43Class2 field2;
public Test43Class2 field3;
public Test43Class1 field4;
public Test43Class2 field5;
public static Test43Class2 method1(Test43Class3 arg0, int depth) {
if (depth == 0) return Test43Lib.local6;
return arg0.field11.field2.field3;
}
public static Test43Class3 method2(int depth) {
if (depth == 0) return Test43Lib.local10;
if (depth>=3) {
if (depth<4) {
for (int local13 = 0; local13<=0; local13 += 1) {
for (int local14 = 0; local14<=2; local14 += 1) {
if (depth>=1) {
}
}
}
}
}
return Test43Lib.local11;
}
}
class Test43Class2 extends Test43Class1 {
public Test43Class2 field6;
public void method3(int depth) {
if (depth == 0) return;
}
}
class Test43Class3 extends Test43Class1 {
public Test43Class1 field7;
public Test43Class2 field8;
public Test43Class2 field9;
public Test43Class3 field10;
public Test43Class3 field11;
public static void method4(Test43Class2 arg0, int depth) {
if (depth == 0) return;
}
public void method5(int depth) {
if (depth == 0) return;
this.field4.field4.field5.method3(depth-1);
}
public static Test43Class1 method6(Test43Class2 arg0, int depth) {
if (depth == 0) return Test43Lib.local9;
return arg0.field5.field1.field7;
}
}
public class Test43{
public static void main(String[] args) {
int inputValue = 10;
Benchmark.alloc(1);
Test43Lib.local1 = new Test43Class1();
Benchmark.alloc(2);
Test43Lib.local2 = new Test43Class1();
Benchmark.alloc(3);
Test43Lib.local3 = new Test43Class1();
Benchmark.alloc(4);
Test43Lib.local4 = new Test43Class1();
Benchmark.alloc(5);
Test43Lib.local5 = new Test43Class2();
Benchmark.alloc(6);
Test43Lib.local6 = new Test43Class2();
Benchmark.alloc(7);
Test43Lib.local7 = new Test43Class2();
Benchmark.alloc(8);
Test43Lib.local8 = new Test43Class2();
Benchmark.alloc(9);
Test43Lib.local9 = new Test43Class2();
Benchmark.alloc(10);
Test43Lib.local10 = new Test43Class3();
Benchmark.alloc(11);
Test43Lib.local11 = new Test43Class3();
Benchmark.alloc(12);
Test43Lib.local12 = new Test43Class3();
Test43Lib.local1.field1 = Test43Lib.local12;
Test43Lib.local1.field2 = Test43Lib.local6;
Test43Lib.local1.field3 = Test43Lib.local6;
Test43Lib.local1.field4 = Test43Lib.local12;
Test43Lib.local1.field5 = Test43Lib.local6;
Test43Lib.local2.field1 = Test43Lib.local11;
Test43Lib.local2.field2 = Test43Lib.local6;
Test43Lib.local2.field3 = Test43Lib.local7;
Test43Lib.local2.field4 = Test43Lib.local6;
Test43Lib.local2.field5 = Test43Lib.local5;
Test43Lib.local3.field1 = Test43Lib.local11;
Test43Lib.local3.field2 = Test43Lib.local9;
Test43Lib.local3.field3 = Test43Lib.local5;
Test43Lib.local3.field4 = Test43Lib.local3;
Test43Lib.local3.field5 = Test43Lib.local5;
Test43Lib.local4.field1 = Test43Lib.local12;
Test43Lib.local4.field2 = Test43Lib.local5;
Test43Lib.local4.field3 = Test43Lib.local6;
Test43Lib.local4.field4 = Test43Lib.local11;
Test43Lib.local4.field5 = Test43Lib.local7;
Test43Lib.local5.field6 = Test43Lib.local5;
Test43Lib.local5.field1 = Test43Lib.local11;
Test43Lib.local5.field2 = Test43Lib.local8;
Test43Lib.local5.field3 = Test43Lib.local8;
Test43Lib.local5.field4 = Test43Lib.local5;
Test43Lib.local5.field5 = Test43Lib.local6;
Test43Lib.local6.field6 = Test43Lib.local9;
Test43Lib.local6.field1 = Test43Lib.local10;
Test43Lib.local6.field2 = Test43Lib.local7;
Test43Lib.local6.field3 = Test43Lib.local8;
Test43Lib.local6.field4 = Test43Lib.local10;
Test43Lib.local6.field5 = Test43Lib.local5;
Test43Lib.local7.field6 = Test43Lib.local7;
Test43Lib.local7.field1 = Test43Lib.local11;
Test43Lib.local7.field2 = Test43Lib.local8;
Test43Lib.local7.field3 = Test43Lib.local5;
Test43Lib.local7.field4 = Test43Lib.local10;
Test43Lib.local7.field5 = Test43Lib.local5;
Test43Lib.local8.field6 = Test43Lib.local6;
Test43Lib.local8.field1 = Test43Lib.local12;
Test43Lib.local8.field2 = Test43Lib.local9;
Test43Lib.local8.field3 = Test43Lib.local8;
Test43Lib.local8.field4 = Test43Lib.local8;
Test43Lib.local8.field5 = Test43Lib.local5;
Test43Lib.local9.field6 = Test43Lib.local8;
Test43Lib.local9.field1 = Test43Lib.local12;
Test43Lib.local9.field2 = Test43Lib.local9;
Test43Lib.local9.field3 = Test43Lib.local6;
Test43Lib.local9.field4 = Test43Lib.local9;
Test43Lib.local9.field5 = Test43Lib.local5;
Test43Lib.local10.field7 = Test43Lib.local10;
Test43Lib.local10.field8 = Test43Lib.local7;
Test43Lib.local10.field9 = Test43Lib.local8;
Test43Lib.local10.field10 = Test43Lib.local10;
Test43Lib.local10.field11 = Test43Lib.local11;
Test43Lib.local10.field1 = Test43Lib.local11;
Test43Lib.local10.field2 = Test43Lib.local9;
Test43Lib.local10.field3 = Test43Lib.local5;
Test43Lib.local10.field4 = Test43Lib.local2;
Test43Lib.local10.field5 = Test43Lib.local6;
Test43Lib.local11.field7 = Test43Lib.local6;
Test43Lib.local11.field8 = Test43Lib.local8;
Test43Lib.local11.field9 = Test43Lib.local5;
Test43Lib.local11.field10 = Test43Lib.local10;
Test43Lib.local11.field11 = Test43Lib.local10;
Test43Lib.local11.field1 = Test43Lib.local10;
Test43Lib.local11.field2 = Test43Lib.local8;
Test43Lib.local11.field3 = Test43Lib.local6;
Test43Lib.local11.field4 = Test43Lib.local6;
Test43Lib.local11.field5 = Test43Lib.local9;
Test43Lib.local12.field7 = Test43Lib.local10;
Test43Lib.local12.field8 = Test43Lib.local5;
Test43Lib.local12.field9 = Test43Lib.local7;
Test43Lib.local12.field10 = Test43Lib.local12;
Test43Lib.local12.field11 = Test43Lib.local10;
Test43Lib.local12.field1 = Test43Lib.local11;
Test43Lib.local12.field2 = Test43Lib.local5;
Test43Lib.local12.field3 = Test43Lib.local5;
Test43Lib.local12.field4 = Test43Lib.local1;
Test43Lib.local12.field5 = Test43Lib.local9;
Test43Lib.local6.field3.field4=Test43Lib.local10.field5.field3.field5;
Test43Lib.local12.field9.field1.field10.method1(Test43Lib.local11.field10.field11.field1,3);
Test43Lib.local11.field7.field5.field2=Test43Lib.local10.field9.field6.field5;
Benchmark.test(1,Test43Lib.local1);
Benchmark.test(2,Test43Lib.local2);
Benchmark.test(3,Test43Lib.local3);
Benchmark.test(4,Test43Lib.local4);
Benchmark.test(5,Test43Lib.local5);
Benchmark.test(6,Test43Lib.local6);
Benchmark.test(7,Test43Lib.local7);
Benchmark.test(8,Test43Lib.local8);
Benchmark.test(9,Test43Lib.local9);
Benchmark.test(10,Test43Lib.local10);
Benchmark.test(11,Test43Lib.local11);
Benchmark.test(12,Test43Lib.local12);
Benchmark.test(13,Test43Lib.local1.field1);
Benchmark.test(14,Test43Lib.local1.field2);
Benchmark.test(15,Test43Lib.local1.field3);
Benchmark.test(16,Test43Lib.local1.field4);
Benchmark.test(17,Test43Lib.local1.field5);
Benchmark.test(18,Test43Lib.local2.field1);
Benchmark.test(19,Test43Lib.local2.field2);
Benchmark.test(20,Test43Lib.local2.field3);
Benchmark.test(21,Test43Lib.local2.field4);
Benchmark.test(22,Test43Lib.local2.field5);
Benchmark.test(23,Test43Lib.local3.field1);
Benchmark.test(24,Test43Lib.local3.field2);
Benchmark.test(25,Test43Lib.local3.field3);
Benchmark.test(26,Test43Lib.local3.field4);
Benchmark.test(27,Test43Lib.local3.field5);
Benchmark.test(28,Test43Lib.local4.field1);
Benchmark.test(29,Test43Lib.local4.field2);
Benchmark.test(30,Test43Lib.local4.field3);
Benchmark.test(31,Test43Lib.local4.field4);
Benchmark.test(32,Test43Lib.local4.field5);
Benchmark.test(33,Test43Lib.local5.field6);
Benchmark.test(34,Test43Lib.local5.field1);
Benchmark.test(35,Test43Lib.local5.field2);
Benchmark.test(36,Test43Lib.local5.field3);
Benchmark.test(37,Test43Lib.local5.field4);
Benchmark.test(38,Test43Lib.local5.field5);
Benchmark.test(39,Test43Lib.local6.field6);
Benchmark.test(40,Test43Lib.local6.field1);
Benchmark.test(41,Test43Lib.local6.field2);
Benchmark.test(42,Test43Lib.local6.field3);
Benchmark.test(43,Test43Lib.local6.field4);
Benchmark.test(44,Test43Lib.local6.field5);
Benchmark.test(45,Test43Lib.local7.field6);
Benchmark.test(46,Test43Lib.local7.field1);
Benchmark.test(47,Test43Lib.local7.field2);
Benchmark.test(48,Test43Lib.local7.field3);
Benchmark.test(49,Test43Lib.local7.field4);
Benchmark.test(50,Test43Lib.local7.field5);
Benchmark.test(51,Test43Lib.local8.field6);
Benchmark.test(52,Test43Lib.local8.field1);
Benchmark.test(53,Test43Lib.local8.field2);
Benchmark.test(54,Test43Lib.local8.field3);
Benchmark.test(55,Test43Lib.local8.field4);
Benchmark.test(56,Test43Lib.local8.field5);
Benchmark.test(57,Test43Lib.local9.field6);
Benchmark.test(58,Test43Lib.local9.field1);
Benchmark.test(59,Test43Lib.local9.field2);
Benchmark.test(60,Test43Lib.local9.field3);
Benchmark.test(61,Test43Lib.local9.field4);
Benchmark.test(62,Test43Lib.local9.field5);
Benchmark.test(63,Test43Lib.local10.field7);
Benchmark.test(64,Test43Lib.local10.field8);
Benchmark.test(65,Test43Lib.local10.field9);
Benchmark.test(66,Test43Lib.local10.field10);
Benchmark.test(67,Test43Lib.local10.field11);
Benchmark.test(68,Test43Lib.local10.field1);
Benchmark.test(69,Test43Lib.local10.field2);
Benchmark.test(70,Test43Lib.local10.field3);
Benchmark.test(71,Test43Lib.local10.field4);
Benchmark.test(72,Test43Lib.local10.field5);
Benchmark.test(73,Test43Lib.local11.field7);
Benchmark.test(74,Test43Lib.local11.field8);
Benchmark.test(75,Test43Lib.local11.field9);
Benchmark.test(76,Test43Lib.local11.field10);
Benchmark.test(77,Test43Lib.local11.field11);
Benchmark.test(78,Test43Lib.local11.field1);
Benchmark.test(79,Test43Lib.local11.field2);
Benchmark.test(80,Test43Lib.local11.field3);
Benchmark.test(81,Test43Lib.local11.field4);
Benchmark.test(82,Test43Lib.local11.field5);
Benchmark.test(83,Test43Lib.local12.field7);
Benchmark.test(84,Test43Lib.local12.field8);
Benchmark.test(85,Test43Lib.local12.field9);
Benchmark.test(86,Test43Lib.local12.field10);
Benchmark.test(87,Test43Lib.local12.field11);
Benchmark.test(88,Test43Lib.local12.field1);
Benchmark.test(89,Test43Lib.local12.field2);
Benchmark.test(90,Test43Lib.local12.field3);
Benchmark.test(91,Test43Lib.local12.field4);
Benchmark.test(92,Test43Lib.local12.field5);
Benchmark.print();
}
}
