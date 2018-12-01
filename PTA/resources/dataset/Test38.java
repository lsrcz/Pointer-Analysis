package dataset;

import benchmark.internal.Benchmark;
import benchmark.tool.BasicClass;
class Test38Lib{
public static Test38Class1 local1;
public static Test38Class1 local2;
public static Test38Class2 local3;
public static Test38Class2 local4;
public static Test38Class3 local5;
public static Test38Class3 local6;
public static Test38Class3 local7;
}
class Test38Class1 extends BasicClass {
public Test38Class1 field1;
public Test38Class2 field2;
public void method1(Test38Class1 arg0, int depth) {
if (depth == 0) return;
}
}
class Test38Class2 extends Test38Class1 {
public Test38Class3 field3;
public Test38Class1 field4;
public Test38Class2 field5;
public Test38Class1 field6;
public Test38Class1 field7;
public Test38Class3 method2(int depth) {
if (depth == 0) return Test38Lib.local5;
this.field5.field2.field2=this.field5.field5.field2;
return this.field1.field2.field3;
}
public static Test38Class3 method3(int depth) {
if (depth == 0) return Test38Lib.local7;
for (int local8 = 0; local8<=0; local8 += 1) {
for (int local9 = 0; local9<=1; local9 += 1) {
for (int local10 = 0; local10<=3; local10 += 1) {
if (depth==4) {
for (int local11 = 0; local11<=3; local11 += 1) {
}
}
}
}
}
return Test38Lib.local5;
}
public void method4(int depth) {
if (depth == 0) return;
this.field4.field2.field2.method2(depth-1);
}
}
class Test38Class3 extends Test38Class1 {
public Test38Class3 field8;
public static void method5(Test38Class3 arg0, int depth) {
if (depth == 0) return;
for (int local12 = 0; local12<=0; local12 += 1) {
arg0=arg0.field8.field8.field8.method7(depth-1);
}
}
public void method6(Test38Class3 arg0, int depth) {
if (depth == 0) return;
arg0.field2.field5.field3.method5(this.field2.field3.field8,depth-1);
}
public Test38Class3 method7(int depth) {
if (depth == 0) return Test38Lib.local6;
return this.field8.field8;
}
}
public class Test38{
public static void main(String[] args) {
int inputValue = 0;
Benchmark.alloc(1);
Test38Lib.local1 = new Test38Class1();
Benchmark.alloc(2);
Test38Lib.local2 = new Test38Class1();
Benchmark.alloc(3);
Test38Lib.local3 = new Test38Class2();
Benchmark.alloc(4);
Test38Lib.local4 = new Test38Class2();
Benchmark.alloc(5);
Test38Lib.local5 = new Test38Class3();
Benchmark.alloc(6);
Test38Lib.local6 = new Test38Class3();
Benchmark.alloc(7);
Test38Lib.local7 = new Test38Class3();
Test38Lib.local1.field1 = Test38Lib.local3;
Test38Lib.local1.field2 = Test38Lib.local4;
Test38Lib.local2.field1 = Test38Lib.local3;
Test38Lib.local2.field2 = Test38Lib.local3;
Test38Lib.local3.field3 = Test38Lib.local7;
Test38Lib.local3.field4 = Test38Lib.local4;
Test38Lib.local3.field5 = Test38Lib.local3;
Test38Lib.local3.field6 = Test38Lib.local5;
Test38Lib.local3.field7 = Test38Lib.local4;
Test38Lib.local3.field1 = Test38Lib.local2;
Test38Lib.local3.field2 = Test38Lib.local4;
Test38Lib.local4.field3 = Test38Lib.local7;
Test38Lib.local4.field4 = Test38Lib.local2;
Test38Lib.local4.field5 = Test38Lib.local4;
Test38Lib.local4.field6 = Test38Lib.local3;
Test38Lib.local4.field7 = Test38Lib.local2;
Test38Lib.local4.field1 = Test38Lib.local3;
Test38Lib.local4.field2 = Test38Lib.local3;
Test38Lib.local5.field8 = Test38Lib.local6;
Test38Lib.local5.field1 = Test38Lib.local3;
Test38Lib.local5.field2 = Test38Lib.local3;
Test38Lib.local6.field8 = Test38Lib.local5;
Test38Lib.local6.field1 = Test38Lib.local5;
Test38Lib.local6.field2 = Test38Lib.local4;
Test38Lib.local7.field8 = Test38Lib.local7;
Test38Lib.local7.field1 = Test38Lib.local7;
Test38Lib.local7.field2 = Test38Lib.local3;
if (inputValue>4) {
if (inputValue>=3) {
Test38Lib.local2.field2.field2.field3.method5(Test38Lib.local1.field2.field2.field3,3);
}else {
Test38Lib.local7.field8.field1.field2.method1(Test38Lib.local4.field2.field5.field2,3);
}
}else {
for (int local13 = 0; local13<=3; local13 += 1) {
Test38Lib.local3.field3.method5(Test38Lib.local4.field4.field2.field3,3);
}
}
Test38Lib.local3.field3.method5(Test38Lib.local5.field1.field2.field3,3);
if (inputValue<=1) {
Test38Lib.local1.field2.field3.field8=Test38Lib.local4.field4.field2.field3;
}
Benchmark.test(1,Test38Lib.local1);
Benchmark.test(2,Test38Lib.local2);
Benchmark.test(3,Test38Lib.local3);
Benchmark.test(4,Test38Lib.local4);
Benchmark.test(5,Test38Lib.local5);
Benchmark.test(6,Test38Lib.local6);
Benchmark.test(7,Test38Lib.local7);
Benchmark.test(8,Test38Lib.local1.field1);
Benchmark.test(9,Test38Lib.local1.field2);
Benchmark.test(10,Test38Lib.local2.field1);
Benchmark.test(11,Test38Lib.local2.field2);
Benchmark.test(12,Test38Lib.local3.field3);
Benchmark.test(13,Test38Lib.local3.field4);
Benchmark.test(14,Test38Lib.local3.field5);
Benchmark.test(15,Test38Lib.local3.field6);
Benchmark.test(16,Test38Lib.local3.field7);
Benchmark.test(17,Test38Lib.local3.field1);
Benchmark.test(18,Test38Lib.local3.field2);
Benchmark.test(19,Test38Lib.local4.field3);
Benchmark.test(20,Test38Lib.local4.field4);
Benchmark.test(21,Test38Lib.local4.field5);
Benchmark.test(22,Test38Lib.local4.field6);
Benchmark.test(23,Test38Lib.local4.field7);
Benchmark.test(24,Test38Lib.local4.field1);
Benchmark.test(25,Test38Lib.local4.field2);
Benchmark.test(26,Test38Lib.local5.field8);
Benchmark.test(27,Test38Lib.local5.field1);
Benchmark.test(28,Test38Lib.local5.field2);
Benchmark.test(29,Test38Lib.local6.field8);
Benchmark.test(30,Test38Lib.local6.field1);
Benchmark.test(31,Test38Lib.local6.field2);
Benchmark.test(32,Test38Lib.local7.field8);
Benchmark.test(33,Test38Lib.local7.field1);
Benchmark.test(34,Test38Lib.local7.field2);
Benchmark.print();
}
}
