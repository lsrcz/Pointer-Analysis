package runnabledataset;

import benchmark.tool.Benchmark;
import benchmark.tool.BasicClass;
class Test12Lib{
public static Test12Class1 local1;
public static Test12Class2 local2;
}
class Test12Class1 extends BasicClass {
public Test12Class2 field1;
public Test12Class1 method1(int depth) {
if (depth == 0) return Test12Lib.local1;
return this.field1;
}
}
class Test12Class2 extends Test12Class1 {
public Test12Class1 field2;
public static void method2(Test12Class1 arg0, int depth) {
if (depth == 0) return;
}
}
public class Test12{
public static void main(String[] args) {
int inputValue = 10;
Benchmark.alloc(1);
Test12Lib.local1 = new Test12Class1();
Benchmark.alloc(2);
Test12Lib.local2 = new Test12Class2();
Test12Lib.local1.field1 = Test12Lib.local2;
Test12Lib.local2.field2 = Test12Lib.local2;
Test12Lib.local2.field1 = Test12Lib.local2;
Test12Lib.local2=Test12Lib.local1.field1;
if (inputValue<1) {
Test12Lib.local1.field1.method2(Test12Lib.local2,3);
}else {
Test12Lib.local2.method2(Test12Lib.local2.field1,3);
}
if (inputValue==4) {
if (inputValue==4) {
if (inputValue<1) {
if (inputValue>3) {
if (inputValue>=3) {
}
}else {
if (inputValue<3) {
}
}
}
}else {
Test12Lib.local1=Test12Lib.local1.field1;
}
}else {
Test12Lib.local1.field1.method2(Test12Lib.local2,3);
}
Benchmark.test(1,Test12Lib.local1);
Benchmark.test(2,Test12Lib.local2);
Benchmark.test(3,Test12Lib.local1.field1);
Benchmark.test(4,Test12Lib.local2.field2);
Benchmark.test(5,Test12Lib.local2.field1);
Benchmark.print();
}
}
