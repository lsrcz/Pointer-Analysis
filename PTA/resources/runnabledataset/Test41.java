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
}
class Test41Class1 extends BasicClass {
public Test41Class3 field1;
public Test41Class3 field2;
public Test41Class3 method1(int depth) {
if (depth == 0) return Test41Lib.local8;
for (int local12 = 0; local12<=0; local12 += 1) {
this.field2.field2.field8.method1(depth-1);
}
return this.field1.field8.field1;
}
public static void method2(Test41Class3 arg0, int depth) {
if (depth == 0) return;
arg0.field8.field1.field8=arg0.field1.field8;
}
}
class Test41Class2 extends Test41Class1 {
public Test41Class2 field3;
public Test41Class2 field4;
public Test41Class1 field5;
public Test41Class2 field6;
public Test41Class1 field7;
public static Test41Class3 method3(Test41Class2 arg0, Test41Class2 arg1, int depth) {
if (depth == 0) return Test41Lib.local8;
return arg1.field1.field2.field1;
}
public void method4(Test41Class3 arg0, Test41Class3 arg1, int depth) {
if (depth == 0) return;
this.field6.field2.field8=arg1.field8.field1.field8;
}
}
class Test41Class3 extends Test41Class1 {
public Test41Class1 field8;
public void method5(int depth) {
if (depth == 0) return;
if (depth==4) {
for (int local13 = 0; local13<=2; local13 += 1) {
if (depth==2) {
for (int local14 = 0; local14<=3; local14 += 1) {
if (depth==3) {
}else {
}
}
}
}
}
}
public Test41Class3 method6(int depth) {
if (depth == 0) return Test41Lib.local9;
for (int local15 = 0; local15<=2; local15 += 1) {
if (depth<=3) {
for (int local16 = 0; local16<=0; local16 += 1) {
for (int local17 = 0; local17<=3; local17 += 1) {
this.field2.field2.field2=this.field8.field1.field1.method7(depth-1);
}
}
}
}
return this;
}
public Test41Class3 method7(int depth) {
if (depth == 0) return Test41Lib.local9;
return this.field8.field2;
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
Test41Lib.local1.field1 = Test41Lib.local11;
Test41Lib.local1.field2 = Test41Lib.local9;
Test41Lib.local2.field1 = Test41Lib.local9;
Test41Lib.local2.field2 = Test41Lib.local11;
Test41Lib.local3.field1 = Test41Lib.local8;
Test41Lib.local3.field2 = Test41Lib.local9;
Test41Lib.local4.field1 = Test41Lib.local9;
Test41Lib.local4.field2 = Test41Lib.local9;
Test41Lib.local5.field3 = Test41Lib.local7;
Test41Lib.local5.field4 = Test41Lib.local6;
Test41Lib.local5.field5 = Test41Lib.local8;
Test41Lib.local5.field6 = Test41Lib.local5;
Test41Lib.local5.field7 = Test41Lib.local8;
Test41Lib.local5.field1 = Test41Lib.local10;
Test41Lib.local5.field2 = Test41Lib.local10;
Test41Lib.local6.field3 = Test41Lib.local7;
Test41Lib.local6.field4 = Test41Lib.local5;
Test41Lib.local6.field5 = Test41Lib.local3;
Test41Lib.local6.field6 = Test41Lib.local6;
Test41Lib.local6.field7 = Test41Lib.local2;
Test41Lib.local6.field1 = Test41Lib.local11;
Test41Lib.local6.field2 = Test41Lib.local8;
Test41Lib.local7.field3 = Test41Lib.local7;
Test41Lib.local7.field4 = Test41Lib.local7;
Test41Lib.local7.field5 = Test41Lib.local6;
Test41Lib.local7.field6 = Test41Lib.local7;
Test41Lib.local7.field7 = Test41Lib.local3;
Test41Lib.local7.field1 = Test41Lib.local8;
Test41Lib.local7.field2 = Test41Lib.local8;
Test41Lib.local8.field8 = Test41Lib.local3;
Test41Lib.local8.field1 = Test41Lib.local9;
Test41Lib.local8.field2 = Test41Lib.local9;
Test41Lib.local9.field8 = Test41Lib.local7;
Test41Lib.local9.field1 = Test41Lib.local10;
Test41Lib.local9.field2 = Test41Lib.local11;
Test41Lib.local10.field8 = Test41Lib.local11;
Test41Lib.local10.field1 = Test41Lib.local8;
Test41Lib.local10.field2 = Test41Lib.local9;
Test41Lib.local11.field8 = Test41Lib.local10;
Test41Lib.local11.field1 = Test41Lib.local10;
Test41Lib.local11.field2 = Test41Lib.local8;
for (int local18 = 0; local18<=0; local18 += 1) {
if (inputValue>1) {
Test41Lib.local5.field3.field7.field2=Test41Lib.local5.field6.field3.field2.method7(3);
}
}
if (inputValue<=3) {
Test41Lib.local5.field5.field2.field8.method2(Test41Lib.local5.field5.field1.field2,3);
}
Test41Lib.local7.field4.field6.field1.method2(Test41Lib.local4.field2.field8.field1,3);
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
Benchmark.test(12,Test41Lib.local1.field1);
Benchmark.test(13,Test41Lib.local1.field2);
Benchmark.test(14,Test41Lib.local2.field1);
Benchmark.test(15,Test41Lib.local2.field2);
Benchmark.test(16,Test41Lib.local3.field1);
Benchmark.test(17,Test41Lib.local3.field2);
Benchmark.test(18,Test41Lib.local4.field1);
Benchmark.test(19,Test41Lib.local4.field2);
Benchmark.test(20,Test41Lib.local5.field3);
Benchmark.test(21,Test41Lib.local5.field4);
Benchmark.test(22,Test41Lib.local5.field5);
Benchmark.test(23,Test41Lib.local5.field6);
Benchmark.test(24,Test41Lib.local5.field7);
Benchmark.test(25,Test41Lib.local5.field1);
Benchmark.test(26,Test41Lib.local5.field2);
Benchmark.test(27,Test41Lib.local6.field3);
Benchmark.test(28,Test41Lib.local6.field4);
Benchmark.test(29,Test41Lib.local6.field5);
Benchmark.test(30,Test41Lib.local6.field6);
Benchmark.test(31,Test41Lib.local6.field7);
Benchmark.test(32,Test41Lib.local6.field1);
Benchmark.test(33,Test41Lib.local6.field2);
Benchmark.test(34,Test41Lib.local7.field3);
Benchmark.test(35,Test41Lib.local7.field4);
Benchmark.test(36,Test41Lib.local7.field5);
Benchmark.test(37,Test41Lib.local7.field6);
Benchmark.test(38,Test41Lib.local7.field7);
Benchmark.test(39,Test41Lib.local7.field1);
Benchmark.test(40,Test41Lib.local7.field2);
Benchmark.test(41,Test41Lib.local8.field8);
Benchmark.test(42,Test41Lib.local8.field1);
Benchmark.test(43,Test41Lib.local8.field2);
Benchmark.test(44,Test41Lib.local9.field8);
Benchmark.test(45,Test41Lib.local9.field1);
Benchmark.test(46,Test41Lib.local9.field2);
Benchmark.test(47,Test41Lib.local10.field8);
Benchmark.test(48,Test41Lib.local10.field1);
Benchmark.test(49,Test41Lib.local10.field2);
Benchmark.test(50,Test41Lib.local11.field8);
Benchmark.test(51,Test41Lib.local11.field1);
Benchmark.test(52,Test41Lib.local11.field2);
Benchmark.print();
}
}
