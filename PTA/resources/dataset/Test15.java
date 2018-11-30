package dataset;

import benchmark.internal.Benchmark;
import benchmark.tool.BasicClass;
class Test15Lib{
public static Test15Class1 local1;
public static Test15Class1 local2;
public static Test15Class2 local3;
}
class Test15Class1 extends BasicClass {
public Test15Class2 field1;
public static void method1(Test15Class1 arg0, int depth) {
if (depth == 0) return;
}
}
class Test15Class2 extends Test15Class1 {
public static Test15Class2 field2;
public static Test15Class1 field3;
public static void method2(Test15Class1 arg0, int depth) {
if (depth == 0) return;
}
}
public class Test15{
public static void main(String[] args) {
int inputValue = 0;
Benchmark.alloc(1);
Test15Lib.local1 = new Test15Class1();
Benchmark.alloc(2);
Test15Lib.local2 = new Test15Class1();
Benchmark.alloc(3);
Test15Lib.local3 = new Test15Class2();
Test15Lib.local1.field1 = Test15Lib.local3;
Test15Lib.local2.field1 = Test15Lib.local3;
Test15Lib.local3.field2 = Test15Lib.local3;
Test15Lib.local3.field3 = Test15Lib.local1;
Test15Lib.local3.field1 = Test15Lib.local3;
Test15Lib.local3.method2(Test15Lib.local3.field2,3);
for (int local4 = 0; local4<=1; local4 += 1) {
if (inputValue<=2) {
Test15Lib.local2.field1=Test15Lib.local3.field1;
}
}
for (int local5 = 0; local5<=1; local5 += 1) {
if (inputValue>1) {
Test15Lib.local3.field3=Test15Lib.local2;
}
}
Benchmark.test(1,Test15Lib.local1);
Benchmark.test(2,Test15Lib.local2);
Benchmark.test(3,Test15Lib.local3);
Benchmark.test(4,Test15Lib.local1.field1);
Benchmark.test(5,Test15Lib.local2.field1);
Benchmark.test(6,Test15Lib.local3.field2);
Benchmark.test(7,Test15Lib.local3.field3);
Benchmark.test(8,Test15Lib.local3.field1);
Benchmark.print();
}
}
