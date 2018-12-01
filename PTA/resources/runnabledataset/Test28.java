package runnabledataset;

import benchmark.tool.Benchmark;
import benchmark.tool.BasicClass;
class Test28Lib{
public static Test28Class1 local1;
public static Test28Class2 local2;
public static Test28Class2 local3;
public static Test28Class2 local4;
public static Test28Class2 local5;
public static Test28Class2 local6;
public static Test28Class3 local7;
public static Test28Class3 local8;
public static Test28Class3 local9;
public static Test28Class3 local10;
}
class Test28Class1 extends BasicClass {
public Test28Class3 field1;
public static void method1(Test28Class1 arg0, Test28Class3 arg1, int depth) {
if (depth == 0) return;
}
public static Test28Class2 method2(Test28Class3 arg0, int depth) {
if (depth == 0) return Test28Lib.local6;
return Test28Lib.local2;
}
public Test28Class2 method3(int depth) {
if (depth == 0) return Test28Lib.local4;
this.field1.method11(depth-1);
return Test28Lib.local6;
}
public static void method4(int depth) {
if (depth == 0) return;
if (depth<4) {
if (depth<4) {
if (depth>=2) {
for (int local11 = 0; local11<=0; local11 += 1) {
for (int local12 = 0; local12<=0; local12 += 1) {
}
}
}else {
if (depth>=2) {
for (int local13 = 0; local13<=2; local13 += 1) {
}
}
}
}
}else {
if (depth<=1) {
for (int local14 = 0; local14<=1; local14 += 1) {
if (depth==2) {
for (int local15 = 0; local15<=1; local15 += 1) {
}
}
}
}else {
for (int local16 = 0; local16<=0; local16 += 1) {
for (int local17 = 0; local17<=0; local17 += 1) {
for (int local18 = 0; local18<=2; local18 += 1) {
}
}
}
}
}
}
}
class Test28Class2 extends Test28Class1 {
public Test28Class3 field2;
public Test28Class1 method5(Test28Class1 arg0, int depth) {
if (depth == 0) return Test28Lib.local8;
return this.field2;
}
public static Test28Class2 method6(Test28Class1 arg0, int depth) {
if (depth == 0) return Test28Lib.local5;
return Test28Lib.local6;
}
public void method7(Test28Class1 arg0, int depth) {
if (depth == 0) return;
this.field2=this.field2;
}
public void method8(int depth) {
if (depth == 0) return;
}
}
class Test28Class3 extends Test28Class1 {
public Test28Class1 field3;
public Test28Class3 field4;
public static void method9(Test28Class3 arg0, Test28Class3 arg1, int depth) {
if (depth == 0) return;
}
public static void method10(Test28Class3 arg0, Test28Class2 arg1, int depth) {
if (depth == 0) return;
}
public void method11(int depth) {
if (depth == 0) return;
}
public Test28Class3 method12(Test28Class2 arg0, Test28Class1 arg1, int depth) {
if (depth == 0) return Test28Lib.local7;
return arg1.field1;
}
public static Test28Class2 method13(Test28Class1 arg0, int depth) {
if (depth == 0) return Test28Lib.local4;
return Test28Lib.local3;
}
}
public class Test28{
public static void main(String[] args) {
int inputValue = 10;
Benchmark.alloc(1);
Test28Lib.local1 = new Test28Class1();
Benchmark.alloc(2);
Test28Lib.local2 = new Test28Class2();
Benchmark.alloc(3);
Test28Lib.local3 = new Test28Class2();
Benchmark.alloc(4);
Test28Lib.local4 = new Test28Class2();
Benchmark.alloc(5);
Test28Lib.local5 = new Test28Class2();
Benchmark.alloc(6);
Test28Lib.local6 = new Test28Class2();
Benchmark.alloc(7);
Test28Lib.local7 = new Test28Class3();
Benchmark.alloc(8);
Test28Lib.local8 = new Test28Class3();
Benchmark.alloc(9);
Test28Lib.local9 = new Test28Class3();
Benchmark.alloc(10);
Test28Lib.local10 = new Test28Class3();
Test28Lib.local1.field1 = Test28Lib.local7;
Test28Lib.local2.field2 = Test28Lib.local8;
Test28Lib.local2.field1 = Test28Lib.local8;
Test28Lib.local3.field2 = Test28Lib.local8;
Test28Lib.local3.field1 = Test28Lib.local10;
Test28Lib.local4.field2 = Test28Lib.local8;
Test28Lib.local4.field1 = Test28Lib.local8;
Test28Lib.local5.field2 = Test28Lib.local9;
Test28Lib.local5.field1 = Test28Lib.local9;
Test28Lib.local6.field2 = Test28Lib.local9;
Test28Lib.local6.field1 = Test28Lib.local8;
Test28Lib.local7.field3 = Test28Lib.local10;
Test28Lib.local7.field4 = Test28Lib.local7;
Test28Lib.local7.field1 = Test28Lib.local10;
Test28Lib.local8.field3 = Test28Lib.local3;
Test28Lib.local8.field4 = Test28Lib.local9;
Test28Lib.local8.field1 = Test28Lib.local8;
Test28Lib.local9.field3 = Test28Lib.local9;
Test28Lib.local9.field4 = Test28Lib.local8;
Test28Lib.local9.field1 = Test28Lib.local8;
Test28Lib.local10.field3 = Test28Lib.local7;
Test28Lib.local10.field4 = Test28Lib.local9;
Test28Lib.local10.field1 = Test28Lib.local8;
Test28Lib.local10.field3=Test28Lib.local7;
Test28Lib.local2=Test28Lib.local3;
if (inputValue>2) {
Test28Lib.local4=Test28Lib.local6;
}else {
if (inputValue<=1) {
for (int local19 = 0; local19<=0; local19 += 1) {
Test28Lib.local7.field1=Test28Lib.local7.field4;
}
}
}
Benchmark.test(1,Test28Lib.local1);
Benchmark.test(2,Test28Lib.local2);
Benchmark.test(3,Test28Lib.local3);
Benchmark.test(4,Test28Lib.local4);
Benchmark.test(5,Test28Lib.local5);
Benchmark.test(6,Test28Lib.local6);
Benchmark.test(7,Test28Lib.local7);
Benchmark.test(8,Test28Lib.local8);
Benchmark.test(9,Test28Lib.local9);
Benchmark.test(10,Test28Lib.local10);
Benchmark.test(11,Test28Lib.local1.field1);
Benchmark.test(12,Test28Lib.local2.field2);
Benchmark.test(13,Test28Lib.local2.field1);
Benchmark.test(14,Test28Lib.local3.field2);
Benchmark.test(15,Test28Lib.local3.field1);
Benchmark.test(16,Test28Lib.local4.field2);
Benchmark.test(17,Test28Lib.local4.field1);
Benchmark.test(18,Test28Lib.local5.field2);
Benchmark.test(19,Test28Lib.local5.field1);
Benchmark.test(20,Test28Lib.local6.field2);
Benchmark.test(21,Test28Lib.local6.field1);
Benchmark.test(22,Test28Lib.local7.field3);
Benchmark.test(23,Test28Lib.local7.field4);
Benchmark.test(24,Test28Lib.local7.field1);
Benchmark.test(25,Test28Lib.local8.field3);
Benchmark.test(26,Test28Lib.local8.field4);
Benchmark.test(27,Test28Lib.local8.field1);
Benchmark.test(28,Test28Lib.local9.field3);
Benchmark.test(29,Test28Lib.local9.field4);
Benchmark.test(30,Test28Lib.local9.field1);
Benchmark.test(31,Test28Lib.local10.field3);
Benchmark.test(32,Test28Lib.local10.field4);
Benchmark.test(33,Test28Lib.local10.field1);
Benchmark.print();
}
}
