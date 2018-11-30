package runnabledataset;

import benchmark.tool.Benchmark;
import benchmark.tool.BasicClass;
class Test3Lib{
public static Test3Class1 local1;
public static Test3Class2 local2;
}
class Test3Class1 extends BasicClass {
public Test3Class2 field1;
public void method1(Test3Class2 arg0, int depth) {
if (depth == 0) return;
}
}
class Test3Class2 extends Test3Class1 {
public Test3Class1 field2;
public void method2(int depth) {
if (depth == 0) return;
}
}
public class Test3{
public static void main(String[] args) {
int inputValue = 10;
Benchmark.alloc(1);
Test3Lib.local1 = new Test3Class1();
Benchmark.alloc(2);
Test3Lib.local2 = new Test3Class2();
Test3Lib.local1.field1 = Test3Lib.local2;
Test3Lib.local2.field2 = Test3Lib.local1;
Test3Lib.local2.field1 = Test3Lib.local2;
if (inputValue<=1) {
if (inputValue>4) {
Test3Lib.local1=Test3Lib.local2.field1;
}
}
for (int local3 = 0; local3<=0; local3 += 1) {
Test3Lib.local1.field1.method2(3);
}
for (int local4 = 0; local4<=2; local4 += 1) {
if (inputValue<=3) {
if (inputValue>=3) {
for (int local5 = 0; local5<=2; local5 += 1) {
Test3Lib.local1=Test3Lib.local2.field1;
}
}else {
Test3Lib.local2.method1(Test3Lib.local1.field1,3);
}
}
}
Benchmark.test(1,Test3Lib.local1);
Benchmark.test(2,Test3Lib.local2);
Benchmark.test(3,Test3Lib.local1.field1);
Benchmark.test(4,Test3Lib.local2.field2);
Benchmark.test(5,Test3Lib.local2.field1);
Benchmark.print();
}
}
