package runnabledataset;

import benchmark.tool.Benchmark;
import benchmark.tool.BasicClass;
class Test41Lib{
public static Test41Class1 local1;
public static Test41Class1 local2;
public static Test41Class1 local3;
public static Test41Class1 local4;
public static Test41Class2 local5;
public static Test41Class2 local6;
public static Test41Class2 local7;
public static Test41Class3 local8;
public static Test41Class3 local9;
public static Test41Class3 local10;
public static Test41Class3 local11;
public static Test41Class3 local12;
}
class Test41Class1 extends BasicClass {
public Test41Class3 field1;
public static Test41Class2 field2;
public static Test41Class3 field3;
public static void method1(int depth) {
if (depth == 0) return;
field3.field6.method2(field2,depth-1);
if (depth<4) {
field2.field3.method1(depth-1);
}
}
public void method2(Test41Class2 arg0, int depth) {
if (depth == 0) return;
if (depth<=1) {
if (depth>=4) {
this.field1.method7(this.field1,depth-1);
}else {
if (depth==4) {
for (int local13 = 0; local13<=3; local13 += 1) {
for (int local14 = 0; local14<=0; local14 += 1) {
}
}
}else {
arg0.field1=this.field3;
}
}
}
for (int local15 = 0; local15<=1; local15 += 1) {
arg0.field2.method1(depth-1);
}
}
public Test41Class3 method3(Test41Class1 arg0, Test41Class2 arg1, int depth) {
if (depth == 0) return Test41Lib.local11;
this.field3.method7(this.field2,depth-1);
return arg1.field1;
}
}
class Test41Class2 extends Test41Class1 {
public static Test41Class2 field4;
public Test41Class3 method4(int depth) {
if (depth == 0) return Test41Lib.local12;
return this.field1;
}
public static Test41Class1 method5(int depth) {
if (depth == 0) return Test41Lib.local6;
field3.field1=field2.field1;
return field4.field1;
}
}
class Test41Class3 extends Test41Class2 {
public Test41Class2 field5;
public Test41Class3 field6;
public Test41Class1 field7;
public static Test41Class1 field8;
public Test41Class2 field9;
public void method6(int depth) {
if (depth == 0) return;
for (int local16 = 0; local16<=3; local16 += 1) {
for (int local17 = 0; local17<=0; local17 += 1) {
if (depth==3) {
this.field1=this.field1;
}
}
}
}
public void method7(Test41Class1 arg0, int depth) {
if (depth == 0) return;
this.field1.method6(depth-1);
}
}
public class Test41{
public static void main(String[] args) {
int inputValue = 10;
Benchmark.alloc(1);
Test41Lib.local1 = new Test41Class1();
Benchmark.alloc(2);
Test41Lib.local2 = new Test41Class1();
Benchmark.alloc(3);
Test41Lib.local3 = new Test41Class1();
Benchmark.alloc(4);
Test41Lib.local4 = new Test41Class1();
Benchmark.alloc(5);
Test41Lib.local5 = new Test41Class2();
Benchmark.alloc(6);
Test41Lib.local6 = new Test41Class2();
Benchmark.alloc(7);
Test41Lib.local7 = new Test41Class2();
Benchmark.alloc(8);
Test41Lib.local8 = new Test41Class3();
Benchmark.alloc(9);
Test41Lib.local9 = new Test41Class3();
Benchmark.alloc(10);
Test41Lib.local10 = new Test41Class3();
Benchmark.alloc(11);
Test41Lib.local11 = new Test41Class3();
Benchmark.alloc(12);
Test41Lib.local12 = new Test41Class3();
Test41Lib.local1.field1 = Test41Lib.local12;
Test41Lib.local1.field2 = Test41Lib.local9;
Test41Lib.local1.field3 = Test41Lib.local11;
Test41Lib.local2.field1 = Test41Lib.local8;
Test41Lib.local2.field2 = Test41Lib.local12;
Test41Lib.local2.field3 = Test41Lib.local9;
Test41Lib.local3.field1 = Test41Lib.local11;
Test41Lib.local3.field2 = Test41Lib.local5;
Test41Lib.local3.field3 = Test41Lib.local12;
Test41Lib.local4.field1 = Test41Lib.local10;
Test41Lib.local4.field2 = Test41Lib.local12;
Test41Lib.local4.field3 = Test41Lib.local10;
Test41Lib.local5.field4 = Test41Lib.local9;
Test41Lib.local5.field1 = Test41Lib.local11;
Test41Lib.local5.field2 = Test41Lib.local5;
Test41Lib.local5.field3 = Test41Lib.local10;
Test41Lib.local6.field4 = Test41Lib.local6;
Test41Lib.local6.field1 = Test41Lib.local8;
Test41Lib.local6.field2 = Test41Lib.local7;
Test41Lib.local6.field3 = Test41Lib.local12;
Test41Lib.local7.field4 = Test41Lib.local10;
Test41Lib.local7.field1 = Test41Lib.local9;
Test41Lib.local7.field2 = Test41Lib.local9;
Test41Lib.local7.field3 = Test41Lib.local12;
Test41Lib.local8.field5 = Test41Lib.local8;
Test41Lib.local8.field6 = Test41Lib.local11;
Test41Lib.local8.field7 = Test41Lib.local6;
Test41Lib.local8.field8 = Test41Lib.local5;
Test41Lib.local8.field9 = Test41Lib.local10;
Test41Lib.local8.field4 = Test41Lib.local5;
Test41Lib.local8.field1 = Test41Lib.local10;
Test41Lib.local8.field2 = Test41Lib.local9;
Test41Lib.local8.field3 = Test41Lib.local12;
Test41Lib.local9.field5 = Test41Lib.local9;
Test41Lib.local9.field6 = Test41Lib.local10;
Test41Lib.local9.field7 = Test41Lib.local1;
Test41Lib.local9.field8 = Test41Lib.local1;
Test41Lib.local9.field9 = Test41Lib.local10;
Test41Lib.local9.field4 = Test41Lib.local10;
Test41Lib.local9.field1 = Test41Lib.local11;
Test41Lib.local9.field2 = Test41Lib.local10;
Test41Lib.local9.field3 = Test41Lib.local9;
Test41Lib.local10.field5 = Test41Lib.local5;
Test41Lib.local10.field6 = Test41Lib.local10;
Test41Lib.local10.field7 = Test41Lib.local8;
Test41Lib.local10.field8 = Test41Lib.local10;
Test41Lib.local10.field9 = Test41Lib.local7;
Test41Lib.local10.field4 = Test41Lib.local6;
Test41Lib.local10.field1 = Test41Lib.local12;
Test41Lib.local10.field2 = Test41Lib.local9;
Test41Lib.local10.field3 = Test41Lib.local10;
Test41Lib.local11.field5 = Test41Lib.local8;
Test41Lib.local11.field6 = Test41Lib.local9;
Test41Lib.local11.field7 = Test41Lib.local7;
Test41Lib.local11.field8 = Test41Lib.local3;
Test41Lib.local11.field9 = Test41Lib.local11;
Test41Lib.local11.field4 = Test41Lib.local5;
Test41Lib.local11.field1 = Test41Lib.local10;
Test41Lib.local11.field2 = Test41Lib.local6;
Test41Lib.local11.field3 = Test41Lib.local11;
Test41Lib.local12.field5 = Test41Lib.local12;
Test41Lib.local12.field6 = Test41Lib.local9;
Test41Lib.local12.field7 = Test41Lib.local3;
Test41Lib.local12.field8 = Test41Lib.local8;
Test41Lib.local12.field9 = Test41Lib.local12;
Test41Lib.local12.field4 = Test41Lib.local7;
Test41Lib.local12.field1 = Test41Lib.local8;
Test41Lib.local12.field2 = Test41Lib.local12;
Test41Lib.local12.field3 = Test41Lib.local8;
if (inputValue<3) {
Test41Lib.local6.field2.method2(Test41Lib.local12.field3,3);
}else {
for (int local18 = 0; local18<=3; local18 += 1) {
Test41Lib.local3.field3.method6(3);
}
}
Test41Lib.local12.field7=Test41Lib.local9;
Test41Lib.local7.field2=Test41Lib.local11.field4;
Benchmark.test(1,Test41Lib.local1);
Benchmark.test(2,Test41Lib.local2);
Benchmark.test(3,Test41Lib.local3);
Benchmark.test(4,Test41Lib.local4);
Benchmark.test(5,Test41Lib.local5);
Benchmark.test(6,Test41Lib.local6);
Benchmark.test(7,Test41Lib.local7);
Benchmark.test(8,Test41Lib.local8);
Benchmark.test(9,Test41Lib.local9);
Benchmark.test(10,Test41Lib.local10);
Benchmark.test(11,Test41Lib.local11);
Benchmark.test(12,Test41Lib.local12);
Benchmark.test(13,Test41Lib.local1.field1);
Benchmark.test(14,Test41Lib.local1.field2);
Benchmark.test(15,Test41Lib.local1.field3);
Benchmark.test(16,Test41Lib.local2.field1);
Benchmark.test(17,Test41Lib.local2.field2);
Benchmark.test(18,Test41Lib.local2.field3);
Benchmark.test(19,Test41Lib.local3.field1);
Benchmark.test(20,Test41Lib.local3.field2);
Benchmark.test(21,Test41Lib.local3.field3);
Benchmark.test(22,Test41Lib.local4.field1);
Benchmark.test(23,Test41Lib.local4.field2);
Benchmark.test(24,Test41Lib.local4.field3);
Benchmark.test(25,Test41Lib.local5.field4);
Benchmark.test(26,Test41Lib.local5.field1);
Benchmark.test(27,Test41Lib.local5.field2);
Benchmark.test(28,Test41Lib.local5.field3);
Benchmark.test(29,Test41Lib.local6.field4);
Benchmark.test(30,Test41Lib.local6.field1);
Benchmark.test(31,Test41Lib.local6.field2);
Benchmark.test(32,Test41Lib.local6.field3);
Benchmark.test(33,Test41Lib.local7.field4);
Benchmark.test(34,Test41Lib.local7.field1);
Benchmark.test(35,Test41Lib.local7.field2);
Benchmark.test(36,Test41Lib.local7.field3);
Benchmark.test(37,Test41Lib.local8.field5);
Benchmark.test(38,Test41Lib.local8.field6);
Benchmark.test(39,Test41Lib.local8.field7);
Benchmark.test(40,Test41Lib.local8.field8);
Benchmark.test(41,Test41Lib.local8.field9);
Benchmark.test(42,Test41Lib.local8.field4);
Benchmark.test(43,Test41Lib.local8.field1);
Benchmark.test(44,Test41Lib.local8.field2);
Benchmark.test(45,Test41Lib.local8.field3);
Benchmark.test(46,Test41Lib.local9.field5);
Benchmark.test(47,Test41Lib.local9.field6);
Benchmark.test(48,Test41Lib.local9.field7);
Benchmark.test(49,Test41Lib.local9.field8);
Benchmark.test(50,Test41Lib.local9.field9);
Benchmark.test(51,Test41Lib.local9.field4);
Benchmark.test(52,Test41Lib.local9.field1);
Benchmark.test(53,Test41Lib.local9.field2);
Benchmark.test(54,Test41Lib.local9.field3);
Benchmark.test(55,Test41Lib.local10.field5);
Benchmark.test(56,Test41Lib.local10.field6);
Benchmark.test(57,Test41Lib.local10.field7);
Benchmark.test(58,Test41Lib.local10.field8);
Benchmark.test(59,Test41Lib.local10.field9);
Benchmark.test(60,Test41Lib.local10.field4);
Benchmark.test(61,Test41Lib.local10.field1);
Benchmark.test(62,Test41Lib.local10.field2);
Benchmark.test(63,Test41Lib.local10.field3);
Benchmark.test(64,Test41Lib.local11.field5);
Benchmark.test(65,Test41Lib.local11.field6);
Benchmark.test(66,Test41Lib.local11.field7);
Benchmark.test(67,Test41Lib.local11.field8);
Benchmark.test(68,Test41Lib.local11.field9);
Benchmark.test(69,Test41Lib.local11.field4);
Benchmark.test(70,Test41Lib.local11.field1);
Benchmark.test(71,Test41Lib.local11.field2);
Benchmark.test(72,Test41Lib.local11.field3);
Benchmark.test(73,Test41Lib.local12.field5);
Benchmark.test(74,Test41Lib.local12.field6);
Benchmark.test(75,Test41Lib.local12.field7);
Benchmark.test(76,Test41Lib.local12.field8);
Benchmark.test(77,Test41Lib.local12.field9);
Benchmark.test(78,Test41Lib.local12.field4);
Benchmark.test(79,Test41Lib.local12.field1);
Benchmark.test(80,Test41Lib.local12.field2);
Benchmark.test(81,Test41Lib.local12.field3);
Benchmark.print();
}
}
