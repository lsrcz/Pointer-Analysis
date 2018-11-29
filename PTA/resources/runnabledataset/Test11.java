package runnabledataset;

import benchmark.tool.Benchmark;
import benchmark.tool.BasicClass;
class Test11Lib{
public static Test11Class1 local1;
public static Test11Class2 local2;
}
class Test11Class1 extends BasicClass {
public Test11Class1 field1;
public static Test11Class1 method1(int depth) {
if (depth == 0) return Test11Lib.local1;
return Test11Lib.local2;
}
}
class Test11Class2 extends Test11Class1 {
public static Test11Class1 field2;
public static Test11Class2 field3;
public void method2(Test11Class1 arg0, Test11Class2 arg1, int depth) {
if (depth == 0) return;
}
}
public class Test11{
public static void main(String[] args) {
int inputValue = 10;
Benchmark.alloc(1);
Test11Lib.local1 = new Test11Class1();
Benchmark.alloc(2);
Test11Lib.local2 = new Test11Class2();
Test11Lib.local1.field1 = Test11Lib.local2;
Test11Lib.local2.field2 = Test11Lib.local2;
Test11Lib.local2.field3 = Test11Lib.local2;
Test11Lib.local2.field1 = Test11Lib.local1;
for (int local3 = 0; local3<=3; local3 += 1) {
Test11Lib.local2.field3=Test11Lib.local2;
}
if (inputValue==1) {
if (inputValue>1) {
Test11Lib.local2.field2=Test11Lib.local2.field2;
}
}
Test11Lib.local2.field2=Test11Lib.local2.method1(3);
Benchmark.test(1,Test11Lib.local1);
Benchmark.test(2,Test11Lib.local2);
Benchmark.test(3,Test11Lib.local1.field1);
Benchmark.test(4,Test11Lib.local2.field2);
Benchmark.test(5,Test11Lib.local2.field3);
Benchmark.test(6,Test11Lib.local2.field1);
Benchmark.print();
}
}
