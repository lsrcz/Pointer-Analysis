package runnabledataset;

import benchmark.tool.Benchmark;
import benchmark.tool.BasicClass;
class Test30Lib{
public static Test30Class1 local1;
public static Test30Class1 local2;
public static Test30Class1 local3;
public static Test30Class1 local4;
public static Test30Class2 local5;
public static Test30Class2 local6;
public static Test30Class2 local7;
public static Test30Class3 local8;
}
class Test30Class1 extends BasicClass {
public Test30Class1 field1;
public Test30Class2 field2;
public static void method1(int depth) {
if (depth == 0) return;
}
}
class Test30Class2 extends Test30Class1 {
public Test30Class2 field3;
public Test30Class3 field4;
public Test30Class1 field5;
public static void method2(int depth) {
if (depth == 0) return;
}
}
class Test30Class3 extends Test30Class2 {
public Test30Class2 field6;
public Test30Class3 field7;
public Test30Class3 field8;
public void method3(Test30Class2 arg0, Test30Class1 arg1, int depth) {
if (depth == 0) return;
if (depth<=1) {
this.field8=this;
}else {
arg0.field4.method4(depth-1);
}
}
public static void method4(int depth) {
if (depth == 0) return;
for (int local9 = 0; local9<=1; local9 += 1) {
for (int local10 = 0; local10<=0; local10 += 1) {
if (depth<3) {
if (depth>2) {
for (int local11 = 0; local11<=0; local11 += 1) {
}
}else {
if (depth>=1) {
}else {
}
}
}
}
}
}
}
public class Test30{
public static void main(String[] args) {
int inputValue = 10;
Benchmark.alloc(1);
Test30Lib.local1 = new Test30Class1();
Benchmark.alloc(2);
Test30Lib.local2 = new Test30Class1();
Benchmark.alloc(3);
Test30Lib.local3 = new Test30Class1();
Benchmark.alloc(4);
Test30Lib.local4 = new Test30Class1();
Benchmark.alloc(5);
Test30Lib.local5 = new Test30Class2();
Benchmark.alloc(6);
Test30Lib.local6 = new Test30Class2();
Benchmark.alloc(7);
Test30Lib.local7 = new Test30Class2();
Benchmark.alloc(8);
Test30Lib.local8 = new Test30Class3();
Test30Lib.local1.field1 = Test30Lib.local1;
Test30Lib.local1.field2 = Test30Lib.local8;
Test30Lib.local2.field1 = Test30Lib.local5;
Test30Lib.local2.field2 = Test30Lib.local6;
Test30Lib.local3.field1 = Test30Lib.local8;
Test30Lib.local3.field2 = Test30Lib.local6;
Test30Lib.local4.field1 = Test30Lib.local7;
Test30Lib.local4.field2 = Test30Lib.local7;
Test30Lib.local5.field3 = Test30Lib.local6;
Test30Lib.local5.field4 = Test30Lib.local8;
Test30Lib.local5.field5 = Test30Lib.local7;
Test30Lib.local5.field1 = Test30Lib.local8;
Test30Lib.local5.field2 = Test30Lib.local6;
Test30Lib.local6.field3 = Test30Lib.local6;
Test30Lib.local6.field4 = Test30Lib.local8;
Test30Lib.local6.field5 = Test30Lib.local8;
Test30Lib.local6.field1 = Test30Lib.local5;
Test30Lib.local6.field2 = Test30Lib.local8;
Test30Lib.local7.field3 = Test30Lib.local6;
Test30Lib.local7.field4 = Test30Lib.local8;
Test30Lib.local7.field5 = Test30Lib.local5;
Test30Lib.local7.field1 = Test30Lib.local8;
Test30Lib.local7.field2 = Test30Lib.local5;
Test30Lib.local8.field6 = Test30Lib.local5;
Test30Lib.local8.field7 = Test30Lib.local8;
Test30Lib.local8.field8 = Test30Lib.local8;
Test30Lib.local8.field3 = Test30Lib.local7;
Test30Lib.local8.field4 = Test30Lib.local8;
Test30Lib.local8.field5 = Test30Lib.local8;
Test30Lib.local8.field1 = Test30Lib.local3;
Test30Lib.local8.field2 = Test30Lib.local7;
Test30Lib.local6.field4.method3(Test30Lib.local7.field4,Test30Lib.local7.field5,3);
for (int local12 = 0; local12<=3; local12 += 1) {
for (int local13 = 0; local13<=1; local13 += 1) {
for (int local14 = 0; local14<=1; local14 += 1) {
Test30Lib.local5.field5=Test30Lib.local6.field5;
}
}
}
Test30Lib.local3.field1.method1(3);
Benchmark.test(1,Test30Lib.local1);
Benchmark.test(2,Test30Lib.local2);
Benchmark.test(3,Test30Lib.local3);
Benchmark.test(4,Test30Lib.local4);
Benchmark.test(5,Test30Lib.local5);
Benchmark.test(6,Test30Lib.local6);
Benchmark.test(7,Test30Lib.local7);
Benchmark.test(8,Test30Lib.local8);
Benchmark.test(9,Test30Lib.local1.field1);
Benchmark.test(10,Test30Lib.local1.field2);
Benchmark.test(11,Test30Lib.local2.field1);
Benchmark.test(12,Test30Lib.local2.field2);
Benchmark.test(13,Test30Lib.local3.field1);
Benchmark.test(14,Test30Lib.local3.field2);
Benchmark.test(15,Test30Lib.local4.field1);
Benchmark.test(16,Test30Lib.local4.field2);
Benchmark.test(17,Test30Lib.local5.field3);
Benchmark.test(18,Test30Lib.local5.field4);
Benchmark.test(19,Test30Lib.local5.field5);
Benchmark.test(20,Test30Lib.local5.field1);
Benchmark.test(21,Test30Lib.local5.field2);
Benchmark.test(22,Test30Lib.local6.field3);
Benchmark.test(23,Test30Lib.local6.field4);
Benchmark.test(24,Test30Lib.local6.field5);
Benchmark.test(25,Test30Lib.local6.field1);
Benchmark.test(26,Test30Lib.local6.field2);
Benchmark.test(27,Test30Lib.local7.field3);
Benchmark.test(28,Test30Lib.local7.field4);
Benchmark.test(29,Test30Lib.local7.field5);
Benchmark.test(30,Test30Lib.local7.field1);
Benchmark.test(31,Test30Lib.local7.field2);
Benchmark.test(32,Test30Lib.local8.field6);
Benchmark.test(33,Test30Lib.local8.field7);
Benchmark.test(34,Test30Lib.local8.field8);
Benchmark.test(35,Test30Lib.local8.field3);
Benchmark.test(36,Test30Lib.local8.field4);
Benchmark.test(37,Test30Lib.local8.field5);
Benchmark.test(38,Test30Lib.local8.field1);
Benchmark.test(39,Test30Lib.local8.field2);
Benchmark.print();
}
}
