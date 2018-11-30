package runnabledataset;

import benchmark.tool.Benchmark;
import benchmark.tool.BasicClass;
class Test39Lib{
public static Test39Class1 local1;
public static Test39Class1 local2;
public static Test39Class2 local3;
public static Test39Class2 local4;
public static Test39Class2 local5;
public static Test39Class2 local6;
public static Test39Class3 local7;
public static Test39Class3 local8;
public static Test39Class3 local9;
public static Test39Class3 local10;
public static Test39Class3 local11;
}
class Test39Class1 extends BasicClass {
public Test39Class3 field1;
public static Test39Class3 method1(Test39Class2 arg0, int depth) {
if (depth == 0) return Test39Lib.local10;
if (depth>=2) {
for (int local12 = 0; local12<=2; local12 += 1) {
for (int local13 = 0; local13<=0; local13 += 1) {
for (int local14 = 0; local14<=1; local14 += 1) {
arg0.field5.method6(arg0.field3,arg0.field6,depth-1);
}
}
}
}else {
arg0.field1.method6(arg0.field4,arg0.field5,depth-1);
}
return arg0.field5;
}
public static void method2(int depth) {
if (depth == 0) return;
if (depth==2) {
for (int local15 = 0; local15<=2; local15 += 1) {
if (depth<1) {
for (int local16 = 0; local16<=1; local16 += 1) {
for (int local17 = 0; local17<=1; local17 += 1) {
}
}
}
}
}else {
for (int local18 = 0; local18<=1; local18 += 1) {
for (int local19 = 0; local19<=1; local19 += 1) {
if (depth>1) {
for (int local20 = 0; local20<=1; local20 += 1) {
}
}else {
if (depth<=2) {
}
}
}
}
}
}
public void method3(int depth) {
if (depth == 0) return;
this.field1.method3(depth-1);
}
}
class Test39Class2 extends Test39Class1 {
public static Test39Class1 field2;
public static Test39Class3 field3;
public static Test39Class3 field4;
public Test39Class3 field5;
public static Test39Class2 field6;
public Test39Class1 field7;
public void method4(Test39Class3 arg0, int depth) {
if (depth == 0) return;
this.field2=arg0.field7;
}
public Test39Class1 method5(int depth) {
if (depth == 0) return Test39Lib.local9;
return this.field7;
}
}
class Test39Class3 extends Test39Class2 {
public static Test39Class2 field8;
public Test39Class3 field9;
public static Test39Class2 field10;
public static Test39Class1 field11;
public Test39Class3 field12;
public Test39Class3 field13;
public void method6(Test39Class1 arg0, Test39Class1 arg1, int depth) {
if (depth == 0) return;
for (int local21 = 0; local21<=3; local21 += 1) {
this.field10=this.field12;
}
}
public void method7(int depth) {
if (depth == 0) return;
}
public void method8(Test39Class2 arg0, int depth) {
if (depth == 0) return;
}
}
public class Test39{
public static void main(String[] args) {
int inputValue = 10;
Benchmark.alloc(1);
Test39Lib.local1 = new Test39Class1();
Benchmark.alloc(2);
Test39Lib.local2 = new Test39Class1();
Benchmark.alloc(3);
Test39Lib.local3 = new Test39Class2();
Benchmark.alloc(4);
Test39Lib.local4 = new Test39Class2();
Benchmark.alloc(5);
Test39Lib.local5 = new Test39Class2();
Benchmark.alloc(6);
Test39Lib.local6 = new Test39Class2();
Benchmark.alloc(7);
Test39Lib.local7 = new Test39Class3();
Benchmark.alloc(8);
Test39Lib.local8 = new Test39Class3();
Benchmark.alloc(9);
Test39Lib.local9 = new Test39Class3();
Benchmark.alloc(10);
Test39Lib.local10 = new Test39Class3();
Benchmark.alloc(11);
Test39Lib.local11 = new Test39Class3();
Test39Lib.local1.field1 = Test39Lib.local10;
Test39Lib.local2.field1 = Test39Lib.local9;
Test39Lib.local3.field2 = Test39Lib.local6;
Test39Lib.local3.field3 = Test39Lib.local9;
Test39Lib.local3.field4 = Test39Lib.local11;
Test39Lib.local3.field5 = Test39Lib.local11;
Test39Lib.local3.field6 = Test39Lib.local11;
Test39Lib.local3.field7 = Test39Lib.local6;
Test39Lib.local3.field1 = Test39Lib.local7;
Test39Lib.local4.field2 = Test39Lib.local9;
Test39Lib.local4.field3 = Test39Lib.local10;
Test39Lib.local4.field4 = Test39Lib.local8;
Test39Lib.local4.field5 = Test39Lib.local8;
Test39Lib.local4.field6 = Test39Lib.local3;
Test39Lib.local4.field7 = Test39Lib.local6;
Test39Lib.local4.field1 = Test39Lib.local8;
Test39Lib.local5.field2 = Test39Lib.local11;
Test39Lib.local5.field3 = Test39Lib.local7;
Test39Lib.local5.field4 = Test39Lib.local10;
Test39Lib.local5.field5 = Test39Lib.local8;
Test39Lib.local5.field6 = Test39Lib.local10;
Test39Lib.local5.field7 = Test39Lib.local10;
Test39Lib.local5.field1 = Test39Lib.local10;
Test39Lib.local6.field2 = Test39Lib.local7;
Test39Lib.local6.field3 = Test39Lib.local9;
Test39Lib.local6.field4 = Test39Lib.local10;
Test39Lib.local6.field5 = Test39Lib.local11;
Test39Lib.local6.field6 = Test39Lib.local4;
Test39Lib.local6.field7 = Test39Lib.local7;
Test39Lib.local6.field1 = Test39Lib.local11;
Test39Lib.local7.field8 = Test39Lib.local9;
Test39Lib.local7.field9 = Test39Lib.local10;
Test39Lib.local7.field10 = Test39Lib.local8;
Test39Lib.local7.field11 = Test39Lib.local5;
Test39Lib.local7.field12 = Test39Lib.local11;
Test39Lib.local7.field13 = Test39Lib.local9;
Test39Lib.local7.field2 = Test39Lib.local7;
Test39Lib.local7.field3 = Test39Lib.local8;
Test39Lib.local7.field4 = Test39Lib.local11;
Test39Lib.local7.field5 = Test39Lib.local11;
Test39Lib.local7.field6 = Test39Lib.local8;
Test39Lib.local7.field7 = Test39Lib.local11;
Test39Lib.local7.field1 = Test39Lib.local7;
Test39Lib.local8.field8 = Test39Lib.local6;
Test39Lib.local8.field9 = Test39Lib.local7;
Test39Lib.local8.field10 = Test39Lib.local10;
Test39Lib.local8.field11 = Test39Lib.local9;
Test39Lib.local8.field12 = Test39Lib.local11;
Test39Lib.local8.field13 = Test39Lib.local8;
Test39Lib.local8.field2 = Test39Lib.local8;
Test39Lib.local8.field3 = Test39Lib.local10;
Test39Lib.local8.field4 = Test39Lib.local10;
Test39Lib.local8.field5 = Test39Lib.local11;
Test39Lib.local8.field6 = Test39Lib.local4;
Test39Lib.local8.field7 = Test39Lib.local5;
Test39Lib.local8.field1 = Test39Lib.local11;
Test39Lib.local9.field8 = Test39Lib.local7;
Test39Lib.local9.field9 = Test39Lib.local10;
Test39Lib.local9.field10 = Test39Lib.local3;
Test39Lib.local9.field11 = Test39Lib.local4;
Test39Lib.local9.field12 = Test39Lib.local10;
Test39Lib.local9.field13 = Test39Lib.local9;
Test39Lib.local9.field2 = Test39Lib.local5;
Test39Lib.local9.field3 = Test39Lib.local10;
Test39Lib.local9.field4 = Test39Lib.local9;
Test39Lib.local9.field5 = Test39Lib.local11;
Test39Lib.local9.field6 = Test39Lib.local5;
Test39Lib.local9.field7 = Test39Lib.local10;
Test39Lib.local9.field1 = Test39Lib.local10;
Test39Lib.local10.field8 = Test39Lib.local6;
Test39Lib.local10.field9 = Test39Lib.local7;
Test39Lib.local10.field10 = Test39Lib.local9;
Test39Lib.local10.field11 = Test39Lib.local10;
Test39Lib.local10.field12 = Test39Lib.local8;
Test39Lib.local10.field13 = Test39Lib.local7;
Test39Lib.local10.field2 = Test39Lib.local4;
Test39Lib.local10.field3 = Test39Lib.local8;
Test39Lib.local10.field4 = Test39Lib.local8;
Test39Lib.local10.field5 = Test39Lib.local7;
Test39Lib.local10.field6 = Test39Lib.local10;
Test39Lib.local10.field7 = Test39Lib.local8;
Test39Lib.local10.field1 = Test39Lib.local10;
Test39Lib.local11.field8 = Test39Lib.local6;
Test39Lib.local11.field9 = Test39Lib.local10;
Test39Lib.local11.field10 = Test39Lib.local10;
Test39Lib.local11.field11 = Test39Lib.local10;
Test39Lib.local11.field12 = Test39Lib.local7;
Test39Lib.local11.field13 = Test39Lib.local9;
Test39Lib.local11.field2 = Test39Lib.local7;
Test39Lib.local11.field3 = Test39Lib.local11;
Test39Lib.local11.field4 = Test39Lib.local9;
Test39Lib.local11.field5 = Test39Lib.local10;
Test39Lib.local11.field6 = Test39Lib.local8;
Test39Lib.local11.field7 = Test39Lib.local2;
Test39Lib.local11.field1 = Test39Lib.local11;
Test39Lib.local8.field10=Test39Lib.local5.field1;
for (int local22 = 0; local22<=1; local22 += 1) {
for (int local23 = 0; local23<=2; local23 += 1) {
Test39Lib.local7.field9=Test39Lib.local5.field4;
}
}
Test39Lib.local9.field13=Test39Lib.local5.field1;
Benchmark.test(1,Test39Lib.local1);
Benchmark.test(2,Test39Lib.local2);
Benchmark.test(3,Test39Lib.local3);
Benchmark.test(4,Test39Lib.local4);
Benchmark.test(5,Test39Lib.local5);
Benchmark.test(6,Test39Lib.local6);
Benchmark.test(7,Test39Lib.local7);
Benchmark.test(8,Test39Lib.local8);
Benchmark.test(9,Test39Lib.local9);
Benchmark.test(10,Test39Lib.local10);
Benchmark.test(11,Test39Lib.local11);
Benchmark.test(12,Test39Lib.local1.field1);
Benchmark.test(13,Test39Lib.local2.field1);
Benchmark.test(14,Test39Lib.local3.field2);
Benchmark.test(15,Test39Lib.local3.field3);
Benchmark.test(16,Test39Lib.local3.field4);
Benchmark.test(17,Test39Lib.local3.field5);
Benchmark.test(18,Test39Lib.local3.field6);
Benchmark.test(19,Test39Lib.local3.field7);
Benchmark.test(20,Test39Lib.local3.field1);
Benchmark.test(21,Test39Lib.local4.field2);
Benchmark.test(22,Test39Lib.local4.field3);
Benchmark.test(23,Test39Lib.local4.field4);
Benchmark.test(24,Test39Lib.local4.field5);
Benchmark.test(25,Test39Lib.local4.field6);
Benchmark.test(26,Test39Lib.local4.field7);
Benchmark.test(27,Test39Lib.local4.field1);
Benchmark.test(28,Test39Lib.local5.field2);
Benchmark.test(29,Test39Lib.local5.field3);
Benchmark.test(30,Test39Lib.local5.field4);
Benchmark.test(31,Test39Lib.local5.field5);
Benchmark.test(32,Test39Lib.local5.field6);
Benchmark.test(33,Test39Lib.local5.field7);
Benchmark.test(34,Test39Lib.local5.field1);
Benchmark.test(35,Test39Lib.local6.field2);
Benchmark.test(36,Test39Lib.local6.field3);
Benchmark.test(37,Test39Lib.local6.field4);
Benchmark.test(38,Test39Lib.local6.field5);
Benchmark.test(39,Test39Lib.local6.field6);
Benchmark.test(40,Test39Lib.local6.field7);
Benchmark.test(41,Test39Lib.local6.field1);
Benchmark.test(42,Test39Lib.local7.field8);
Benchmark.test(43,Test39Lib.local7.field9);
Benchmark.test(44,Test39Lib.local7.field10);
Benchmark.test(45,Test39Lib.local7.field11);
Benchmark.test(46,Test39Lib.local7.field12);
Benchmark.test(47,Test39Lib.local7.field13);
Benchmark.test(48,Test39Lib.local7.field2);
Benchmark.test(49,Test39Lib.local7.field3);
Benchmark.test(50,Test39Lib.local7.field4);
Benchmark.test(51,Test39Lib.local7.field5);
Benchmark.test(52,Test39Lib.local7.field6);
Benchmark.test(53,Test39Lib.local7.field7);
Benchmark.test(54,Test39Lib.local7.field1);
Benchmark.test(55,Test39Lib.local8.field8);
Benchmark.test(56,Test39Lib.local8.field9);
Benchmark.test(57,Test39Lib.local8.field10);
Benchmark.test(58,Test39Lib.local8.field11);
Benchmark.test(59,Test39Lib.local8.field12);
Benchmark.test(60,Test39Lib.local8.field13);
Benchmark.test(61,Test39Lib.local8.field2);
Benchmark.test(62,Test39Lib.local8.field3);
Benchmark.test(63,Test39Lib.local8.field4);
Benchmark.test(64,Test39Lib.local8.field5);
Benchmark.test(65,Test39Lib.local8.field6);
Benchmark.test(66,Test39Lib.local8.field7);
Benchmark.test(67,Test39Lib.local8.field1);
Benchmark.test(68,Test39Lib.local9.field8);
Benchmark.test(69,Test39Lib.local9.field9);
Benchmark.test(70,Test39Lib.local9.field10);
Benchmark.test(71,Test39Lib.local9.field11);
Benchmark.test(72,Test39Lib.local9.field12);
Benchmark.test(73,Test39Lib.local9.field13);
Benchmark.test(74,Test39Lib.local9.field2);
Benchmark.test(75,Test39Lib.local9.field3);
Benchmark.test(76,Test39Lib.local9.field4);
Benchmark.test(77,Test39Lib.local9.field5);
Benchmark.test(78,Test39Lib.local9.field6);
Benchmark.test(79,Test39Lib.local9.field7);
Benchmark.test(80,Test39Lib.local9.field1);
Benchmark.test(81,Test39Lib.local10.field8);
Benchmark.test(82,Test39Lib.local10.field9);
Benchmark.test(83,Test39Lib.local10.field10);
Benchmark.test(84,Test39Lib.local10.field11);
Benchmark.test(85,Test39Lib.local10.field12);
Benchmark.test(86,Test39Lib.local10.field13);
Benchmark.test(87,Test39Lib.local10.field2);
Benchmark.test(88,Test39Lib.local10.field3);
Benchmark.test(89,Test39Lib.local10.field4);
Benchmark.test(90,Test39Lib.local10.field5);
Benchmark.test(91,Test39Lib.local10.field6);
Benchmark.test(92,Test39Lib.local10.field7);
Benchmark.test(93,Test39Lib.local10.field1);
Benchmark.test(94,Test39Lib.local11.field8);
Benchmark.test(95,Test39Lib.local11.field9);
Benchmark.test(96,Test39Lib.local11.field10);
Benchmark.test(97,Test39Lib.local11.field11);
Benchmark.test(98,Test39Lib.local11.field12);
Benchmark.test(99,Test39Lib.local11.field13);
Benchmark.test(100,Test39Lib.local11.field2);
Benchmark.test(101,Test39Lib.local11.field3);
Benchmark.test(102,Test39Lib.local11.field4);
Benchmark.test(103,Test39Lib.local11.field5);
Benchmark.test(104,Test39Lib.local11.field6);
Benchmark.test(105,Test39Lib.local11.field7);
Benchmark.test(106,Test39Lib.local11.field1);
Benchmark.print();
}
}
