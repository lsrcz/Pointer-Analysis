package dataset;

import benchmark.internal.Benchmark;
import benchmark.tool.BasicClass;
class Test25Lib{
public static Test25Class1 local1;
public static Test25Class2 local2;
public static Test25Class2 local3;
public static Test25Class2 local4;
public static Test25Class3 local5;
public static Test25Class3 local6;
public static Test25Class3 local7;
public static Test25Class3 local8;
}
class Test25Class1 extends BasicClass {
public Test25Class1 field1;
public Test25Class1 field2;
public static void method1(Test25Class3 arg0, int depth) {
if (depth == 0) return;
arg0.field6=arg0.field3;
}
public Test25Class3 method2(Test25Class2 arg0, Test25Class2 arg1, int depth) {
if (depth == 0) return Test25Lib.local6;
return Test25Lib.local5;
}
public static void method3(Test25Class1 arg0, Test25Class1 arg1, int depth) {
if (depth == 0) return;
for (int local9 = 0; local9<=0; local9 += 1) {
if (depth<=2) {
if (depth<1) {
arg0.field1=arg1.field1;
}else {
if (depth<=4) {
if (depth<1) {
}else {
}
}
}
}
}
}
public Test25Class2 method4(int depth) {
if (depth == 0) return Test25Lib.local7;
return Test25Lib.local3;
}
public Test25Class3 method5(Test25Class2 arg0, Test25Class1 arg1, int depth) {
if (depth == 0) return Test25Lib.local5;
return Test25Lib.local5;
}
}
class Test25Class2 extends Test25Class1 {
public Test25Class2 field3;
public Test25Class1 field4;
public Test25Class2 method6(int depth) {
if (depth == 0) return Test25Lib.local2;
return this.field3;
}
public static Test25Class3 method7(int depth) {
if (depth == 0) return Test25Lib.local6;
return Test25Lib.local5;
}
}
class Test25Class3 extends Test25Class2 {
public Test25Class2 field5;
public Test25Class2 field6;
public Test25Class3 field7;
public Test25Class2 method8(Test25Class3 arg0, Test25Class2 arg1, int depth) {
if (depth == 0) return Test25Lib.local4;
return this.field7;
}
public void method9(Test25Class3 arg0, int depth) {
if (depth == 0) return;
}
public Test25Class1 method10(int depth) {
if (depth == 0) return Test25Lib.local8;
this.field3.method1(this,depth-1);
return this.field6;
}
public static Test25Class1 method11(int depth) {
if (depth == 0) return Test25Lib.local1;
return Test25Lib.local3;
}
}
public class Test25{
public static void main(String[] args) {
int inputValue = 0;
Benchmark.alloc(1);
Test25Lib.local1 = new Test25Class1();
Benchmark.alloc(2);
Test25Lib.local2 = new Test25Class2();
Benchmark.alloc(3);
Test25Lib.local3 = new Test25Class2();
Benchmark.alloc(4);
Test25Lib.local4 = new Test25Class2();
Benchmark.alloc(5);
Test25Lib.local5 = new Test25Class3();
Benchmark.alloc(6);
Test25Lib.local6 = new Test25Class3();
Benchmark.alloc(7);
Test25Lib.local7 = new Test25Class3();
Benchmark.alloc(8);
Test25Lib.local8 = new Test25Class3();
Test25Lib.local1.field1 = Test25Lib.local6;
Test25Lib.local1.field2 = Test25Lib.local6;
Test25Lib.local2.field3 = Test25Lib.local7;
Test25Lib.local2.field4 = Test25Lib.local3;
Test25Lib.local2.field1 = Test25Lib.local4;
Test25Lib.local2.field2 = Test25Lib.local6;
Test25Lib.local3.field3 = Test25Lib.local6;
Test25Lib.local3.field4 = Test25Lib.local7;
Test25Lib.local3.field1 = Test25Lib.local7;
Test25Lib.local3.field2 = Test25Lib.local7;
Test25Lib.local4.field3 = Test25Lib.local3;
Test25Lib.local4.field4 = Test25Lib.local4;
Test25Lib.local4.field1 = Test25Lib.local1;
Test25Lib.local4.field2 = Test25Lib.local8;
Test25Lib.local5.field5 = Test25Lib.local4;
Test25Lib.local5.field6 = Test25Lib.local4;
Test25Lib.local5.field7 = Test25Lib.local6;
Test25Lib.local5.field3 = Test25Lib.local8;
Test25Lib.local5.field4 = Test25Lib.local7;
Test25Lib.local5.field1 = Test25Lib.local4;
Test25Lib.local5.field2 = Test25Lib.local8;
Test25Lib.local6.field5 = Test25Lib.local7;
Test25Lib.local6.field6 = Test25Lib.local3;
Test25Lib.local6.field7 = Test25Lib.local5;
Test25Lib.local6.field3 = Test25Lib.local3;
Test25Lib.local6.field4 = Test25Lib.local7;
Test25Lib.local6.field1 = Test25Lib.local8;
Test25Lib.local6.field2 = Test25Lib.local2;
Test25Lib.local7.field5 = Test25Lib.local2;
Test25Lib.local7.field6 = Test25Lib.local2;
Test25Lib.local7.field7 = Test25Lib.local8;
Test25Lib.local7.field3 = Test25Lib.local2;
Test25Lib.local7.field4 = Test25Lib.local2;
Test25Lib.local7.field1 = Test25Lib.local8;
Test25Lib.local7.field2 = Test25Lib.local7;
Test25Lib.local8.field5 = Test25Lib.local8;
Test25Lib.local8.field6 = Test25Lib.local3;
Test25Lib.local8.field7 = Test25Lib.local6;
Test25Lib.local8.field3 = Test25Lib.local7;
Test25Lib.local8.field4 = Test25Lib.local8;
Test25Lib.local8.field1 = Test25Lib.local2;
Test25Lib.local8.field2 = Test25Lib.local6;
for (int local10 = 0; local10<=0; local10 += 1) {
for (int local11 = 0; local11<=1; local11 += 1) {
Test25Lib.local5.field4.method1(Test25Lib.local6,3);
}
}
for (int local12 = 0; local12<=3; local12 += 1) {
Test25Lib.local4.field4.method4(3);
}
if (inputValue>1) {
Test25Lib.local6=Test25Lib.local7.field7;
}else {
Test25Lib.local3.field2=Test25Lib.local7.field4;
}
Benchmark.test(1,Test25Lib.local1);
Benchmark.test(2,Test25Lib.local2);
Benchmark.test(3,Test25Lib.local3);
Benchmark.test(4,Test25Lib.local4);
Benchmark.test(5,Test25Lib.local5);
Benchmark.test(6,Test25Lib.local6);
Benchmark.test(7,Test25Lib.local7);
Benchmark.test(8,Test25Lib.local8);
Benchmark.test(9,Test25Lib.local1.field1);
Benchmark.test(10,Test25Lib.local1.field2);
Benchmark.test(11,Test25Lib.local2.field3);
Benchmark.test(12,Test25Lib.local2.field4);
Benchmark.test(13,Test25Lib.local2.field1);
Benchmark.test(14,Test25Lib.local2.field2);
Benchmark.test(15,Test25Lib.local3.field3);
Benchmark.test(16,Test25Lib.local3.field4);
Benchmark.test(17,Test25Lib.local3.field1);
Benchmark.test(18,Test25Lib.local3.field2);
Benchmark.test(19,Test25Lib.local4.field3);
Benchmark.test(20,Test25Lib.local4.field4);
Benchmark.test(21,Test25Lib.local4.field1);
Benchmark.test(22,Test25Lib.local4.field2);
Benchmark.test(23,Test25Lib.local5.field5);
Benchmark.test(24,Test25Lib.local5.field6);
Benchmark.test(25,Test25Lib.local5.field7);
Benchmark.test(26,Test25Lib.local5.field3);
Benchmark.test(27,Test25Lib.local5.field4);
Benchmark.test(28,Test25Lib.local5.field1);
Benchmark.test(29,Test25Lib.local5.field2);
Benchmark.test(30,Test25Lib.local6.field5);
Benchmark.test(31,Test25Lib.local6.field6);
Benchmark.test(32,Test25Lib.local6.field7);
Benchmark.test(33,Test25Lib.local6.field3);
Benchmark.test(34,Test25Lib.local6.field4);
Benchmark.test(35,Test25Lib.local6.field1);
Benchmark.test(36,Test25Lib.local6.field2);
Benchmark.test(37,Test25Lib.local7.field5);
Benchmark.test(38,Test25Lib.local7.field6);
Benchmark.test(39,Test25Lib.local7.field7);
Benchmark.test(40,Test25Lib.local7.field3);
Benchmark.test(41,Test25Lib.local7.field4);
Benchmark.test(42,Test25Lib.local7.field1);
Benchmark.test(43,Test25Lib.local7.field2);
Benchmark.test(44,Test25Lib.local8.field5);
Benchmark.test(45,Test25Lib.local8.field6);
Benchmark.test(46,Test25Lib.local8.field7);
Benchmark.test(47,Test25Lib.local8.field3);
Benchmark.test(48,Test25Lib.local8.field4);
Benchmark.test(49,Test25Lib.local8.field1);
Benchmark.test(50,Test25Lib.local8.field2);
Benchmark.print();
}
}
