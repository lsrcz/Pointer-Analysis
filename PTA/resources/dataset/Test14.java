package dataset;

import benchmark.internal.Benchmark;
import benchmark.tool.BasicClass;
class Test14Lib{
public static Test14Class1 local1;
public static Test14Class2 local2;
}
class Test14Class1 extends BasicClass {
public static Test14Class2 field1;
public Test14Class2 field2;
public static void method1(int depth) {
if (depth == 0) return;
}
}
class Test14Class2 extends Test14Class1 {
public static Test14Class1 field3;
public Test14Class2 field4;
public void method2(Test14Class1 arg0, int depth) {
if (depth == 0) return;
}
}
public class Test14{
public static void main(String[] args) {
int inputValue = 0;
Benchmark.alloc(1);
Test14Lib.local1 = new Test14Class1();
Benchmark.alloc(2);
Test14Lib.local2 = new Test14Class2();
Test14Lib.local1.field1 = Test14Lib.local2;
Test14Lib.local1.field2 = Test14Lib.local2;
Test14Lib.local2.field3 = Test14Lib.local2;
Test14Lib.local2.field4 = Test14Lib.local2;
Test14Lib.local2.field1 = Test14Lib.local2;
Test14Lib.local2.field2 = Test14Lib.local2;
Test14Lib.local2.field4.method2(Test14Lib.local2.field2,3);
if (inputValue==3) {
if (inputValue==3) {
for (int local3 = 0; local3<=1; local3 += 1) {
Test14Lib.local1.field2.method2(Test14Lib.local1.field2,3);
}
}else {
Test14Lib.local1=Test14Lib.local2.field2;
}
}
Test14Lib.local1=Test14Lib.local2.field1;
Benchmark.test(1,Test14Lib.local1);
Benchmark.test(2,Test14Lib.local2);
Benchmark.test(3,Test14Lib.local1.field1);
Benchmark.test(4,Test14Lib.local1.field2);
Benchmark.test(5,Test14Lib.local2.field3);
Benchmark.test(6,Test14Lib.local2.field4);
Benchmark.test(7,Test14Lib.local2.field1);
Benchmark.test(8,Test14Lib.local2.field2);
Benchmark.print();
}
}
