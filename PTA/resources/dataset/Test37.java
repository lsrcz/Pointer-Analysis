package dataset;

import benchmark.internal.Benchmark;
import benchmark.tool.BasicClass;
class Test37Lib{
public static Test37Class1 local1;
public static Test37Class2 local2;
public static Test37Class2 local3;
public static Test37Class2 local4;
public static Test37Class2 local5;
public static Test37Class3 local6;
public static Test37Class3 local7;
}
class Test37Class1 extends BasicClass {
public static Test37Class3 field1;
public Test37Class1 field2;
public static Test37Class2 field3;
public static Test37Class1 field4;
public static Test37Class1 field5;
public Test37Class1 method1(int depth) {
if (depth == 0) return Test37Lib.local7;
this.field1.method6(depth-1);
for (int local8 = 0; local8<=2; local8 += 1) {
this.field1=this.field1;
}
return this.field3;
}
}
class Test37Class2 extends Test37Class1 {
public static Test37Class1 field6;
public Test37Class3 field7;
public static Test37Class1 field8;
public static Test37Class2 field9;
public static Test37Class1 field10;
public static Test37Class3 field11;
public static void method2(Test37Class3 arg0, Test37Class2 arg1, int depth) {
if (depth == 0) return;
}
public static void method3(Test37Class2 arg0, int depth) {
if (depth == 0) return;
}
public Test37Class1 method4(Test37Class3 arg0, Test37Class2 arg1, int depth) {
if (depth == 0) return Test37Lib.local6;
return arg1;
}
}
class Test37Class3 extends Test37Class2 {
public Test37Class2 field12;
public Test37Class3 field13;
public static Test37Class2 field14;
public static Test37Class3 field15;
public static Test37Class3 field16;
public Test37Class1 method5(Test37Class3 arg0, int depth) {
if (depth == 0) return Test37Lib.local3;
for (int local9 = 0; local9<=3; local9 += 1) {
arg0.field8=arg0.field8;
}
return arg0.field10;
}
public static void method6(int depth) {
if (depth == 0) return;
for (int local10 = 0; local10<=3; local10 += 1) {
for (int local11 = 0; local11<=0; local11 += 1) {
field10.field1.method6(depth-1);
}
}
for (int local12 = 0; local12<=2; local12 += 1) {
for (int local13 = 0; local13<=1; local13 += 1) {
if (depth>3) {
if (depth>4) {
if (depth>=4) {
}
}
}else {
field16.field16=field5.field1;
}
}
}
}
}
public class Test37{
public static void main(String[] args) {
int inputValue = 0;
Benchmark.alloc(1);
Test37Lib.local1 = new Test37Class1();
Benchmark.alloc(2);
Test37Lib.local2 = new Test37Class2();
Benchmark.alloc(3);
Test37Lib.local3 = new Test37Class2();
Benchmark.alloc(4);
Test37Lib.local4 = new Test37Class2();
Benchmark.alloc(5);
Test37Lib.local5 = new Test37Class2();
Benchmark.alloc(6);
Test37Lib.local6 = new Test37Class3();
Benchmark.alloc(7);
Test37Lib.local7 = new Test37Class3();
Test37Lib.local1.field1 = Test37Lib.local6;
Test37Lib.local1.field2 = Test37Lib.local2;
Test37Lib.local1.field3 = Test37Lib.local7;
Test37Lib.local1.field4 = Test37Lib.local3;
Test37Lib.local1.field5 = Test37Lib.local5;
Test37Lib.local2.field6 = Test37Lib.local1;
Test37Lib.local2.field7 = Test37Lib.local7;
Test37Lib.local2.field8 = Test37Lib.local3;
Test37Lib.local2.field9 = Test37Lib.local2;
Test37Lib.local2.field10 = Test37Lib.local1;
Test37Lib.local2.field11 = Test37Lib.local7;
Test37Lib.local2.field1 = Test37Lib.local7;
Test37Lib.local2.field2 = Test37Lib.local4;
Test37Lib.local2.field3 = Test37Lib.local7;
Test37Lib.local2.field4 = Test37Lib.local7;
Test37Lib.local2.field5 = Test37Lib.local5;
Test37Lib.local3.field6 = Test37Lib.local5;
Test37Lib.local3.field7 = Test37Lib.local6;
Test37Lib.local3.field8 = Test37Lib.local2;
Test37Lib.local3.field9 = Test37Lib.local2;
Test37Lib.local3.field10 = Test37Lib.local7;
Test37Lib.local3.field11 = Test37Lib.local6;
Test37Lib.local3.field1 = Test37Lib.local7;
Test37Lib.local3.field2 = Test37Lib.local7;
Test37Lib.local3.field3 = Test37Lib.local6;
Test37Lib.local3.field4 = Test37Lib.local5;
Test37Lib.local3.field5 = Test37Lib.local4;
Test37Lib.local4.field6 = Test37Lib.local5;
Test37Lib.local4.field7 = Test37Lib.local6;
Test37Lib.local4.field8 = Test37Lib.local7;
Test37Lib.local4.field9 = Test37Lib.local7;
Test37Lib.local4.field10 = Test37Lib.local5;
Test37Lib.local4.field11 = Test37Lib.local6;
Test37Lib.local4.field1 = Test37Lib.local7;
Test37Lib.local4.field2 = Test37Lib.local5;
Test37Lib.local4.field3 = Test37Lib.local5;
Test37Lib.local4.field4 = Test37Lib.local1;
Test37Lib.local4.field5 = Test37Lib.local1;
Test37Lib.local5.field6 = Test37Lib.local7;
Test37Lib.local5.field7 = Test37Lib.local6;
Test37Lib.local5.field8 = Test37Lib.local6;
Test37Lib.local5.field9 = Test37Lib.local5;
Test37Lib.local5.field10 = Test37Lib.local1;
Test37Lib.local5.field11 = Test37Lib.local7;
Test37Lib.local5.field1 = Test37Lib.local7;
Test37Lib.local5.field2 = Test37Lib.local7;
Test37Lib.local5.field3 = Test37Lib.local4;
Test37Lib.local5.field4 = Test37Lib.local2;
Test37Lib.local5.field5 = Test37Lib.local3;
Test37Lib.local6.field12 = Test37Lib.local7;
Test37Lib.local6.field13 = Test37Lib.local7;
Test37Lib.local6.field14 = Test37Lib.local4;
Test37Lib.local6.field15 = Test37Lib.local7;
Test37Lib.local6.field16 = Test37Lib.local6;
Test37Lib.local6.field6 = Test37Lib.local5;
Test37Lib.local6.field7 = Test37Lib.local6;
Test37Lib.local6.field8 = Test37Lib.local6;
Test37Lib.local6.field9 = Test37Lib.local5;
Test37Lib.local6.field10 = Test37Lib.local2;
Test37Lib.local6.field11 = Test37Lib.local7;
Test37Lib.local6.field1 = Test37Lib.local7;
Test37Lib.local6.field2 = Test37Lib.local7;
Test37Lib.local6.field3 = Test37Lib.local7;
Test37Lib.local6.field4 = Test37Lib.local5;
Test37Lib.local6.field5 = Test37Lib.local4;
Test37Lib.local7.field12 = Test37Lib.local7;
Test37Lib.local7.field13 = Test37Lib.local6;
Test37Lib.local7.field14 = Test37Lib.local3;
Test37Lib.local7.field15 = Test37Lib.local7;
Test37Lib.local7.field16 = Test37Lib.local6;
Test37Lib.local7.field6 = Test37Lib.local5;
Test37Lib.local7.field7 = Test37Lib.local7;
Test37Lib.local7.field8 = Test37Lib.local3;
Test37Lib.local7.field9 = Test37Lib.local5;
Test37Lib.local7.field10 = Test37Lib.local4;
Test37Lib.local7.field11 = Test37Lib.local6;
Test37Lib.local7.field1 = Test37Lib.local7;
Test37Lib.local7.field2 = Test37Lib.local2;
Test37Lib.local7.field3 = Test37Lib.local3;
Test37Lib.local7.field4 = Test37Lib.local5;
Test37Lib.local7.field5 = Test37Lib.local7;
Test37Lib.local4.method3(Test37Lib.local6.field16,3);
for (int local14 = 0; local14<=2; local14 += 1) {
Test37Lib.local3.field11.method2(Test37Lib.local4.field11,Test37Lib.local2.field3,3);
}
if (inputValue>=2) {
if (inputValue<=4) {
Test37Lib.local2.field3=Test37Lib.local1.field1;
}
}
Benchmark.test(1,Test37Lib.local1);
Benchmark.test(2,Test37Lib.local2);
Benchmark.test(3,Test37Lib.local3);
Benchmark.test(4,Test37Lib.local4);
Benchmark.test(5,Test37Lib.local5);
Benchmark.test(6,Test37Lib.local6);
Benchmark.test(7,Test37Lib.local7);
Benchmark.test(8,Test37Lib.local1.field1);
Benchmark.test(9,Test37Lib.local1.field2);
Benchmark.test(10,Test37Lib.local1.field3);
Benchmark.test(11,Test37Lib.local1.field4);
Benchmark.test(12,Test37Lib.local1.field5);
Benchmark.test(13,Test37Lib.local2.field6);
Benchmark.test(14,Test37Lib.local2.field7);
Benchmark.test(15,Test37Lib.local2.field8);
Benchmark.test(16,Test37Lib.local2.field9);
Benchmark.test(17,Test37Lib.local2.field10);
Benchmark.test(18,Test37Lib.local2.field11);
Benchmark.test(19,Test37Lib.local2.field1);
Benchmark.test(20,Test37Lib.local2.field2);
Benchmark.test(21,Test37Lib.local2.field3);
Benchmark.test(22,Test37Lib.local2.field4);
Benchmark.test(23,Test37Lib.local2.field5);
Benchmark.test(24,Test37Lib.local3.field6);
Benchmark.test(25,Test37Lib.local3.field7);
Benchmark.test(26,Test37Lib.local3.field8);
Benchmark.test(27,Test37Lib.local3.field9);
Benchmark.test(28,Test37Lib.local3.field10);
Benchmark.test(29,Test37Lib.local3.field11);
Benchmark.test(30,Test37Lib.local3.field1);
Benchmark.test(31,Test37Lib.local3.field2);
Benchmark.test(32,Test37Lib.local3.field3);
Benchmark.test(33,Test37Lib.local3.field4);
Benchmark.test(34,Test37Lib.local3.field5);
Benchmark.test(35,Test37Lib.local4.field6);
Benchmark.test(36,Test37Lib.local4.field7);
Benchmark.test(37,Test37Lib.local4.field8);
Benchmark.test(38,Test37Lib.local4.field9);
Benchmark.test(39,Test37Lib.local4.field10);
Benchmark.test(40,Test37Lib.local4.field11);
Benchmark.test(41,Test37Lib.local4.field1);
Benchmark.test(42,Test37Lib.local4.field2);
Benchmark.test(43,Test37Lib.local4.field3);
Benchmark.test(44,Test37Lib.local4.field4);
Benchmark.test(45,Test37Lib.local4.field5);
Benchmark.test(46,Test37Lib.local5.field6);
Benchmark.test(47,Test37Lib.local5.field7);
Benchmark.test(48,Test37Lib.local5.field8);
Benchmark.test(49,Test37Lib.local5.field9);
Benchmark.test(50,Test37Lib.local5.field10);
Benchmark.test(51,Test37Lib.local5.field11);
Benchmark.test(52,Test37Lib.local5.field1);
Benchmark.test(53,Test37Lib.local5.field2);
Benchmark.test(54,Test37Lib.local5.field3);
Benchmark.test(55,Test37Lib.local5.field4);
Benchmark.test(56,Test37Lib.local5.field5);
Benchmark.test(57,Test37Lib.local6.field12);
Benchmark.test(58,Test37Lib.local6.field13);
Benchmark.test(59,Test37Lib.local6.field14);
Benchmark.test(60,Test37Lib.local6.field15);
Benchmark.test(61,Test37Lib.local6.field16);
Benchmark.test(62,Test37Lib.local6.field6);
Benchmark.test(63,Test37Lib.local6.field7);
Benchmark.test(64,Test37Lib.local6.field8);
Benchmark.test(65,Test37Lib.local6.field9);
Benchmark.test(66,Test37Lib.local6.field10);
Benchmark.test(67,Test37Lib.local6.field11);
Benchmark.test(68,Test37Lib.local6.field1);
Benchmark.test(69,Test37Lib.local6.field2);
Benchmark.test(70,Test37Lib.local6.field3);
Benchmark.test(71,Test37Lib.local6.field4);
Benchmark.test(72,Test37Lib.local6.field5);
Benchmark.test(73,Test37Lib.local7.field12);
Benchmark.test(74,Test37Lib.local7.field13);
Benchmark.test(75,Test37Lib.local7.field14);
Benchmark.test(76,Test37Lib.local7.field15);
Benchmark.test(77,Test37Lib.local7.field16);
Benchmark.test(78,Test37Lib.local7.field6);
Benchmark.test(79,Test37Lib.local7.field7);
Benchmark.test(80,Test37Lib.local7.field8);
Benchmark.test(81,Test37Lib.local7.field9);
Benchmark.test(82,Test37Lib.local7.field10);
Benchmark.test(83,Test37Lib.local7.field11);
Benchmark.test(84,Test37Lib.local7.field1);
Benchmark.test(85,Test37Lib.local7.field2);
Benchmark.test(86,Test37Lib.local7.field3);
Benchmark.test(87,Test37Lib.local7.field4);
Benchmark.test(88,Test37Lib.local7.field5);
Benchmark.print();
}
}
