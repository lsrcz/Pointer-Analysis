package runnabledataset;

import benchmark.tool.Benchmark;
import benchmark.tool.BasicClass;
class Test7Lib{
public static Test7Class1 local1;
public static Test7Class2 local2;
public static Test7Class2 local3;
}
class Test7Class1 extends BasicClass {
public static Test7Class2 field1;
public void method1(Test7Class1 arg0, int depth) {
if (depth == 0) return;
}
}
class Test7Class2 extends Test7Class1 {
public static Test7Class1 field2;
public Test7Class2 field3;
public void method2(Test7Class2 arg0, int depth) {
if (depth == 0) return;
}
}
public class Test7{
public static void main(String[] args) {
int inputValue = 10;
Benchmark.alloc(1);
Test7Lib.local1 = new Test7Class1();
Benchmark.alloc(2);
Test7Lib.local2 = new Test7Class2();
Benchmark.alloc(3);
Test7Lib.local3 = new Test7Class2();
Test7Lib.local1.field1 = Test7Lib.local3;
Test7Lib.local2.field2 = Test7Lib.local1;
Test7Lib.local2.field3 = Test7Lib.local3;
Test7Lib.local2.field1 = Test7Lib.local2;
Test7Lib.local3.field2 = Test7Lib.local3;
Test7Lib.local3.field3 = Test7Lib.local2;
Test7Lib.local3.field1 = Test7Lib.local2;
for (int local4 = 0; local4<=2; local4 += 1) {
Test7Lib.local2.field2=Test7Lib.local1.field1;
}
Test7Lib.local3.field2=Test7Lib.local3;
for (int local5 = 0; local5<=1; local5 += 1) {
if (inputValue>=1) {
Test7Lib.local2.field2.method1(Test7Lib.local2.field2,3);
}
}
Benchmark.test(1,Test7Lib.local1);
Benchmark.test(2,Test7Lib.local2);
Benchmark.test(3,Test7Lib.local3);
Benchmark.test(4,Test7Lib.local1.field1);
Benchmark.test(5,Test7Lib.local2.field2);
Benchmark.test(6,Test7Lib.local2.field3);
Benchmark.test(7,Test7Lib.local2.field1);
Benchmark.test(8,Test7Lib.local3.field2);
Benchmark.test(9,Test7Lib.local3.field3);
Benchmark.test(10,Test7Lib.local3.field1);
Benchmark.print();
}
}
