package dataset;

import benchmark.internal.Benchmark;
import benchmark.tool.BasicClass;
class Test10Lib{
public static Test10Class1 local1;
public static Test10Class1 local2;
public static Test10Class2 local3;
}
class Test10Class1 extends BasicClass {
public static Test10Class1 field1;
public Test10Class1 method1(Test10Class1 arg0, Test10Class1 arg1, int depth) {
if (depth == 0) return Test10Lib.local1;
return arg0;
}
}
class Test10Class2 extends Test10Class1 {
public Test10Class1 field2;
public static Test10Class1 method2(Test10Class1 arg0, Test10Class1 arg1, int depth) {
if (depth == 0) return Test10Lib.local2;
return arg1;
}
}
public class Test10{
public static void main(String[] args) {
int inputValue = 0;
Benchmark.alloc(1);
Test10Lib.local1 = new Test10Class1();
Benchmark.alloc(2);
Test10Lib.local2 = new Test10Class1();
Benchmark.alloc(3);
Test10Lib.local3 = new Test10Class2();
Test10Lib.local1.field1 = Test10Lib.local1;
Test10Lib.local2.field1 = Test10Lib.local2;
Test10Lib.local3.field2 = Test10Lib.local1;
Test10Lib.local3.field1 = Test10Lib.local1;
Test10Lib.local3=Test10Lib.local3;
for (int local4 = 0; local4<=1; local4 += 1) {
Test10Lib.local2=Test10Lib.local1;
}
Test10Lib.local1.field1=Test10Lib.local2.field1.method1(Test10Lib.local3.field1,Test10Lib.local3.field1,3);
Benchmark.test(1,Test10Lib.local1);
Benchmark.test(2,Test10Lib.local2);
Benchmark.test(3,Test10Lib.local3);
Benchmark.test(4,Test10Lib.local1.field1);
Benchmark.test(5,Test10Lib.local2.field1);
Benchmark.test(6,Test10Lib.local3.field2);
Benchmark.test(7,Test10Lib.local3.field1);
Benchmark.print();
}
}
