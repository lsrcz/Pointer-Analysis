package runnabledataset;

import benchmark.tool.Benchmark;
import benchmark.tool.BasicClass;
class Test7Lib{
public static Test7Class1 local1;
public static Test7Class2 local2;
}
class Test7Class1 extends BasicClass {
public Test7Class2 field1;
public static Test7Class1 field2;
public static Test7Class2 method1(int depth) {
if (depth == 0) return Test7Lib.local2;
return field2.field1;
}
}
class Test7Class2 extends Test7Class1 {
public static Test7Class2 field3;
public static Test7Class2 method2(Test7Class1 arg0, int depth) {
if (depth == 0) return Test7Lib.local2;
return field3.field3;
}
}
public class Test7{
public static void main(String[] args) {
int inputValue = 10;
Benchmark.alloc(1);
Test7Lib.local1 = new Test7Class1();
Benchmark.alloc(2);
Test7Lib.local2 = new Test7Class2();
Test7Lib.local1.field1 = Test7Lib.local2;
Test7Lib.local1.field2 = Test7Lib.local2;
Test7Lib.local2.field3 = Test7Lib.local2;
Test7Lib.local2.field1 = Test7Lib.local2;
Test7Lib.local2.field2 = Test7Lib.local2;
Test7Lib.local1.field1=Test7Lib.local2;
if (inputValue<4) {
Test7Lib.local1=Test7Lib.local1.field1;
}else {
Test7Lib.local2.field3=Test7Lib.local2.field1;
}
Test7Lib.local2.method2(Test7Lib.local1.field1,3);
Test7Lib.local2.field3=Test7Lib.local2.field1;
for (int local3 = 0; local3<=1; local3 += 1) {
Test7Lib.local2.field3=Test7Lib.local2.field1.method2(Test7Lib.local2.field2,3);
}
Test7Lib.local2.field2=Test7Lib.local2.method2(Test7Lib.local1,3);
Test7Lib.local1.field2=Test7Lib.local2.field2;
Test7Lib.local2.field2=Test7Lib.local2.field1;
Test7Lib.local2.field1.method1(3);
Test7Lib.local2.field3=Test7Lib.local2.field1;
Benchmark.test(1,Test7Lib.local1);
Benchmark.test(2,Test7Lib.local2);
Benchmark.test(3,Test7Lib.local1.field1);
Benchmark.test(4,Test7Lib.local1.field2);
Benchmark.test(5,Test7Lib.local2.field3);
Benchmark.test(6,Test7Lib.local2.field1);
Benchmark.test(7,Test7Lib.local2.field2);
Benchmark.print();
}
}
