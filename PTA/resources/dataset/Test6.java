package dataset;

import benchmark.internal.Benchmark;
import benchmark.tool.BasicClass;
class Test6Lib{
public static Test6Class1 local1;
public static Test6Class1 local2;
public static Test6Class2 local3;
public static Test6Class2 local4;
}
class Test6Class1 extends BasicClass {
public static Test6Class1 field1;
public Test6Class2 method1(Test6Class2 arg0, Test6Class2 arg1, int depth) {
if (depth == 0) return Test6Lib.local4;
return arg1;
}
}
class Test6Class2 extends Test6Class1 {
public static Test6Class1 field2;
public void method2(int depth) {
if (depth == 0) return;
}
}
public class Test6{
public static void main(String[] args) {
int inputValue = 0;
Benchmark.alloc(1);
Test6Lib.local1 = new Test6Class1();
Benchmark.alloc(2);
Test6Lib.local2 = new Test6Class1();
Benchmark.alloc(3);
Test6Lib.local3 = new Test6Class2();
Benchmark.alloc(4);
Test6Lib.local4 = new Test6Class2();
Test6Lib.local1.field1 = Test6Lib.local4;
Test6Lib.local2.field1 = Test6Lib.local3;
Test6Lib.local3.field2 = Test6Lib.local1;
Test6Lib.local3.field1 = Test6Lib.local2;
Test6Lib.local4.field2 = Test6Lib.local3;
Test6Lib.local4.field1 = Test6Lib.local1;
Test6Lib.local2.field1=Test6Lib.local1.method1(Test6Lib.local3,Test6Lib.local4,3);
Test6Lib.local3.method2(3);
if (inputValue<2) {
for (int local5 = 0; local5<=3; local5 += 1) {
Test6Lib.local2=Test6Lib.local3;
}
}else {
Test6Lib.local4=Test6Lib.local4;
}
Benchmark.test(1,Test6Lib.local1);
Benchmark.test(2,Test6Lib.local2);
Benchmark.test(3,Test6Lib.local3);
Benchmark.test(4,Test6Lib.local4);
Benchmark.test(5,Test6Lib.local1.field1);
Benchmark.test(6,Test6Lib.local2.field1);
Benchmark.test(7,Test6Lib.local3.field2);
Benchmark.test(8,Test6Lib.local3.field1);
Benchmark.test(9,Test6Lib.local4.field2);
Benchmark.test(10,Test6Lib.local4.field1);
Benchmark.print();
}
}
