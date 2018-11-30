package dataset;

import benchmark.internal.Benchmark;
import benchmark.tool.BasicClass;
class Test12Lib{
public static Test12Class1 local1;
public static Test12Class2 local2;
public static Test12Class2 local3;
}
class Test12Class1 extends BasicClass {
public Test12Class2 field1;
public static Test12Class1 field2;
public static Test12Class2 method1(int depth) {
if (depth == 0) return Test12Lib.local2;
return field2.field1;
}
}
class Test12Class2 extends Test12Class1 {
public Test12Class2 field3;
public static Test12Class2 field4;
public static void method2(int depth) {
if (depth == 0) return;
}
}
public class Test12{
public static void main(String[] args) {
int inputValue = 0;
Benchmark.alloc(1);
Test12Lib.local1 = new Test12Class1();
Benchmark.alloc(2);
Test12Lib.local2 = new Test12Class2();
Benchmark.alloc(3);
Test12Lib.local3 = new Test12Class2();
Test12Lib.local1.field1 = Test12Lib.local2;
Test12Lib.local1.field2 = Test12Lib.local1;
Test12Lib.local2.field3 = Test12Lib.local2;
Test12Lib.local2.field4 = Test12Lib.local2;
Test12Lib.local2.field1 = Test12Lib.local3;
Test12Lib.local2.field2 = Test12Lib.local2;
Test12Lib.local3.field3 = Test12Lib.local3;
Test12Lib.local3.field4 = Test12Lib.local2;
Test12Lib.local3.field1 = Test12Lib.local3;
Test12Lib.local3.field2 = Test12Lib.local2;
for (int local4 = 0; local4<=1; local4 += 1) {
Test12Lib.local1.field2=Test12Lib.local2.field1;
}
if (inputValue<=3) {
if (inputValue<=3) {
Test12Lib.local3.field1=Test12Lib.local3.field4.method1(3);
}
}else {
Test12Lib.local1=Test12Lib.local2.field1;
}
if (inputValue<4) {
Test12Lib.local2.field3=Test12Lib.local2;
}else {
if (inputValue==3) {
Test12Lib.local3.field3.method1(3);
}else {
Test12Lib.local1=Test12Lib.local3.field2;
}
}
Benchmark.test(1,Test12Lib.local1);
Benchmark.test(2,Test12Lib.local2);
Benchmark.test(3,Test12Lib.local3);
Benchmark.test(4,Test12Lib.local1.field1);
Benchmark.test(5,Test12Lib.local1.field2);
Benchmark.test(6,Test12Lib.local2.field3);
Benchmark.test(7,Test12Lib.local2.field4);
Benchmark.test(8,Test12Lib.local2.field1);
Benchmark.test(9,Test12Lib.local2.field2);
Benchmark.test(10,Test12Lib.local3.field3);
Benchmark.test(11,Test12Lib.local3.field4);
Benchmark.test(12,Test12Lib.local3.field1);
Benchmark.test(13,Test12Lib.local3.field2);
Benchmark.print();
}
}
