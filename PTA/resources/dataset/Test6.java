package dataset;

import benchmark.internal.Benchmark;
import benchmark.tool.BasicClass;
class Test6Lib{
public static Test6Class1 local1;
public static Test6Class2 local2;
public static Test6Class2 local3;
}
class Test6Class1 extends BasicClass {
public Test6Class2 field1;
public static void method1(Test6Class1 arg0, Test6Class1 arg1, int depth) {
if (depth == 0) return;
}
}
class Test6Class2 extends Test6Class1 {
public Test6Class1 field2;
public static void method2(Test6Class1 arg0, int depth) {
if (depth == 0) return;
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
Test6Lib.local1.field1 = Test6Lib.local2;
Test6Lib.local2.field2 = Test6Lib.local3;
Test6Lib.local2.field1 = Test6Lib.local2;
Test6Lib.local3.field2 = Test6Lib.local3;
Test6Lib.local3.field1 = Test6Lib.local3;
if (inputValue>=1) {
Test6Lib.local2.field1.method1(Test6Lib.local2.field1,Test6Lib.local2.field2,3);
}
Test6Lib.local2=Test6Lib.local2.field1;
if (inputValue<4) {
if (inputValue>3) {
Test6Lib.local1.field1=Test6Lib.local2;
}
}else {
for (int local4 = 0; local4<=1; local4 += 1) {
Test6Lib.local2.field1.method2(Test6Lib.local1.field1,3);
}
}
Benchmark.test(1,Test6Lib.local1);
Benchmark.test(2,Test6Lib.local2);
Benchmark.test(3,Test6Lib.local3);
Benchmark.test(4,Test6Lib.local1.field1);
Benchmark.test(5,Test6Lib.local2.field2);
Benchmark.test(6,Test6Lib.local2.field1);
Benchmark.test(7,Test6Lib.local3.field2);
Benchmark.test(8,Test6Lib.local3.field1);
Benchmark.print();
}
}
