package dataset;

import benchmark.internal.Benchmark;
import benchmark.tool.BasicClass;
class Test6Lib{
public static Test6Class1 local1;
public static Test6Class2 local2;
public static Test6Class2 local3;
}
class Test6Class1 extends BasicClass {
public static Test6Class1 field1;
public Test6Class1 field2;
public void method1(Test6Class1 arg0, Test6Class1 arg1, int depth) {
if (depth == 0) return;
}
}
class Test6Class2 extends Test6Class1 {
public Test6Class1 field3;
public static Test6Class1 method2(Test6Class1 arg0, int depth) {
if (depth == 0) return Test6Lib.local1;
return arg0.field1;
}
}
public class Test6{
public static void main(String[] args) {
int inputValue = 0;
Benchmark.alloc(1);
Test6Lib.local1 = new Test6Class1();
Benchmark.alloc(2);
Test6Lib.local2 = new Test6Class2();
Benchmark.alloc(3);
Test6Lib.local3 = new Test6Class2();
Test6Lib.local1.field1 = Test6Lib.local3;
Test6Lib.local1.field2 = Test6Lib.local3;
Test6Lib.local2.field3 = Test6Lib.local1;
Test6Lib.local2.field1 = Test6Lib.local1;
Test6Lib.local2.field2 = Test6Lib.local3;
Test6Lib.local3.field3 = Test6Lib.local2;
Test6Lib.local3.field1 = Test6Lib.local3;
Test6Lib.local3.field2 = Test6Lib.local1;
if (inputValue>=3) {
for (int local4 = 0; local4<=3; local4 += 1) {
Test6Lib.local1.field2.method1(Test6Lib.local3.field1,Test6Lib.local3.field3,3);
}
}
for (int local5 = 0; local5<=3; local5 += 1) {
for (int local6 = 0; local6<=3; local6 += 1) {
Test6Lib.local2.method1(Test6Lib.local1.field2,Test6Lib.local3.field3,3);
}
}
Test6Lib.local1.field2=Test6Lib.local3.field3;
if (inputValue>=1) {
Test6Lib.local3.method2(Test6Lib.local3,3);
}
if (inputValue>=3) {
for (int local7 = 0; local7<=0; local7 += 1) {
Test6Lib.local1=Test6Lib.local1.field2;
}
}
for (int local8 = 0; local8<=1; local8 += 1) {
for (int local9 = 0; local9<=1; local9 += 1) {
Test6Lib.local1.method1(Test6Lib.local1,Test6Lib.local2.field1,3);
}
}
for (int local10 = 0; local10<=0; local10 += 1) {
Test6Lib.local1.field1=Test6Lib.local3.method2(Test6Lib.local3.field2,3);
}
Test6Lib.local3.field2=Test6Lib.local2.field1;
if (inputValue<=4) {
if (inputValue>=1) {
for (int local11 = 0; local11<=2; local11 += 1) {
Test6Lib.local1.field2=Test6Lib.local2.field3;
}
}else {
Test6Lib.local1.field2=Test6Lib.local2.field2;
}
}
for (int local12 = 0; local12<=1; local12 += 1) {
Test6Lib.local3.field1=Test6Lib.local1.field1;
}
Benchmark.test(1,Test6Lib.local1);
Benchmark.test(2,Test6Lib.local2);
Benchmark.test(3,Test6Lib.local3);
Benchmark.test(4,Test6Lib.local1.field1);
Benchmark.test(5,Test6Lib.local1.field2);
Benchmark.test(6,Test6Lib.local2.field3);
Benchmark.test(7,Test6Lib.local2.field1);
Benchmark.test(8,Test6Lib.local2.field2);
Benchmark.test(9,Test6Lib.local3.field3);
Benchmark.test(10,Test6Lib.local3.field1);
Benchmark.test(11,Test6Lib.local3.field2);
Benchmark.print();
}
}
