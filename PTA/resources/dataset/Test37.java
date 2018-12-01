package dataset;

import benchmark.internal.Benchmark;
import benchmark.tool.BasicClass;
class Test37Lib{
public static Test37Class1 local1;
public static Test37Class2 local2;
public static Test37Class3 local3;
public static Test37Class3 local4;
}
class Test37Class1 extends BasicClass {
public Test37Class2 field1;
public Test37Class1 field2;
public static Test37Class1 method1(int depth) {
if (depth == 0) return Test37Lib.local2;
return Test37Lib.local4;
}
public static void method2(int depth) {
if (depth == 0) return;
for (int local5 = 0; local5<=1; local5 += 1) {
for (int local6 = 0; local6<=1; local6 += 1) {
for (int local7 = 0; local7<=1; local7 += 1) {
for (int local8 = 0; local8<=0; local8 += 1) {
for (int local9 = 0; local9<=3; local9 += 1) {
}
}
}
}
}
}
public void method3(int depth) {
if (depth == 0) return;
this.field1.field3.field1.method4(this.field1,depth-1);
}
}
class Test37Class2 extends Test37Class1 {
public Test37Class1 field3;
public Test37Class1 method4(Test37Class1 arg0, int depth) {
if (depth == 0) return Test37Lib.local3;
return arg0.field2.field1.field1;
}
public void method5(Test37Class2 arg0, int depth) {
if (depth == 0) return;
}
public void method6(Test37Class1 arg0, int depth) {
if (depth == 0) return;
for (int local10 = 0; local10<=3; local10 += 1) {
if (depth==2) {
if (depth>=4) {
if (depth>=4) {
arg0.field1.field1=arg0.field2.field1;
}else {
for (int local11 = 0; local11<=0; local11 += 1) {
}
}
}
}else {
if (depth<=3) {
this.field2.field1.method5(this.field3.field1,depth-1);
}
}
}
}
}
class Test37Class3 extends Test37Class2 {
public Test37Class3 field4;
public Test37Class3 field5;
public Test37Class1 field6;
public Test37Class3 method7(Test37Class3 arg0, int depth) {
if (depth == 0) return Test37Lib.local4;
return arg0.field4.field5;
}
public void method8(Test37Class3 arg0, int depth) {
if (depth == 0) return;
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
Test37Lib.local3 = new Test37Class3();
Benchmark.alloc(4);
Test37Lib.local4 = new Test37Class3();
Test37Lib.local1.field1 = Test37Lib.local3;
Test37Lib.local1.field2 = Test37Lib.local3;
Test37Lib.local2.field3 = Test37Lib.local4;
Test37Lib.local2.field1 = Test37Lib.local4;
Test37Lib.local2.field2 = Test37Lib.local4;
Test37Lib.local3.field4 = Test37Lib.local4;
Test37Lib.local3.field5 = Test37Lib.local4;
Test37Lib.local3.field6 = Test37Lib.local1;
Test37Lib.local3.field3 = Test37Lib.local2;
Test37Lib.local3.field1 = Test37Lib.local3;
Test37Lib.local3.field2 = Test37Lib.local1;
Test37Lib.local4.field4 = Test37Lib.local3;
Test37Lib.local4.field5 = Test37Lib.local3;
Test37Lib.local4.field6 = Test37Lib.local4;
Test37Lib.local4.field3 = Test37Lib.local1;
Test37Lib.local4.field1 = Test37Lib.local3;
Test37Lib.local4.field2 = Test37Lib.local1;
Test37Lib.local4.field2.field2=Test37Lib.local2.field3.field2.field2;
if (inputValue>4) {
if (inputValue>3) {
if (inputValue>=4) {
for (int local12 = 0; local12<=1; local12 += 1) {
Test37Lib.local4.field4.field4.field1.method6(Test37Lib.local2.field1.field2,3);
}
}
}else {
for (int local13 = 0; local13<=0; local13 += 1) {
Test37Lib.local4.field4.field1.field1=Test37Lib.local2.field1.field2.field1;
}
}
}
if (inputValue>=2) {
for (int local14 = 0; local14<=2; local14 += 1) {
Test37Lib.local3.field6.field1.method4(Test37Lib.local3.field5.field5,3);
}
}
Benchmark.test(1,Test37Lib.local1);
Benchmark.test(2,Test37Lib.local2);
Benchmark.test(3,Test37Lib.local3);
Benchmark.test(4,Test37Lib.local4);
Benchmark.test(5,Test37Lib.local1.field1);
Benchmark.test(6,Test37Lib.local1.field2);
Benchmark.test(7,Test37Lib.local2.field3);
Benchmark.test(8,Test37Lib.local2.field1);
Benchmark.test(9,Test37Lib.local2.field2);
Benchmark.test(10,Test37Lib.local3.field4);
Benchmark.test(11,Test37Lib.local3.field5);
Benchmark.test(12,Test37Lib.local3.field6);
Benchmark.test(13,Test37Lib.local3.field3);
Benchmark.test(14,Test37Lib.local3.field1);
Benchmark.test(15,Test37Lib.local3.field2);
Benchmark.test(16,Test37Lib.local4.field4);
Benchmark.test(17,Test37Lib.local4.field5);
Benchmark.test(18,Test37Lib.local4.field6);
Benchmark.test(19,Test37Lib.local4.field3);
Benchmark.test(20,Test37Lib.local4.field1);
Benchmark.test(21,Test37Lib.local4.field2);
Benchmark.print();
}
}
