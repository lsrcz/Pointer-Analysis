package dataset;

import benchmark.internal.Benchmark;
import benchmark.tool.BasicClass;
class Test8Lib{
public static Test8Class1 local1;
public static Test8Class1 local2;
public static Test8Class2 local3;
}
class Test8Class1 extends BasicClass {
public Test8Class1 field1;
public static void method1(Test8Class2 arg0, Test8Class1 arg1, int depth) {
if (depth == 0) return;
}
}
class Test8Class2 extends Test8Class1 {
public Test8Class1 field2;
public static Test8Class1 field3;
public void method2(Test8Class2 arg0, Test8Class2 arg1, int depth) {
if (depth == 0) return;
}
}
public class Test8{
public static void main(String[] args) {
int inputValue = 0;
Benchmark.alloc(1);
Test8Lib.local1 = new Test8Class1();
Benchmark.alloc(2);
Test8Lib.local2 = new Test8Class1();
Benchmark.alloc(3);
Test8Lib.local3 = new Test8Class2();
Test8Lib.local1.field1 = Test8Lib.local2;
Test8Lib.local2.field1 = Test8Lib.local2;
Test8Lib.local3.field2 = Test8Lib.local1;
Test8Lib.local3.field3 = Test8Lib.local1;
Test8Lib.local3.field1 = Test8Lib.local2;
Test8Lib.local3=Test8Lib.local3;
if (inputValue>4) {
if (inputValue>=3) {
for (int local4 = 0; local4<=2; local4 += 1) {
for (int local5 = 0; local5<=3; local5 += 1) {
Test8Lib.local3=Test8Lib.local3;
}
}
}
}
Test8Lib.local3.method2(Test8Lib.local3,Test8Lib.local3,3);
Benchmark.test(1,Test8Lib.local1);
Benchmark.test(2,Test8Lib.local2);
Benchmark.test(3,Test8Lib.local3);
Benchmark.test(4,Test8Lib.local1.field1);
Benchmark.test(5,Test8Lib.local2.field1);
Benchmark.test(6,Test8Lib.local3.field2);
Benchmark.test(7,Test8Lib.local3.field3);
Benchmark.test(8,Test8Lib.local3.field1);
Benchmark.print();
}
}
