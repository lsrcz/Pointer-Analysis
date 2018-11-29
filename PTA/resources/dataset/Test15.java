package dataset;

import benchmark.internal.Benchmark;
import benchmark.tool.BasicClass;
class Test15Lib{
public static Test15Class1 local1;
public static Test15Class2 local2;
public static Test15Class2 local3;
}
class Test15Class1 extends BasicClass {
public Test15Class1 field1;
public static Test15Class2 field2;
public static Test15Class1 method1(Test15Class1 arg0, int depth) {
if (depth == 0) return Test15Lib.local2;
return arg0.field1;
}
}
class Test15Class2 extends Test15Class1 {
public Test15Class1 field3;
public static Test15Class2 field4;
public static void method2(Test15Class1 arg0, Test15Class2 arg1, int depth) {
if (depth == 0) return;
}
}
public class Test15{
public static void main(String[] args) {
int inputValue = 0;
Benchmark.alloc(1);
Test15Lib.local1 = new Test15Class1();
Benchmark.alloc(2);
Test15Lib.local2 = new Test15Class2();
Benchmark.alloc(3);
Test15Lib.local3 = new Test15Class2();
Test15Lib.local1.field1 = Test15Lib.local1;
Test15Lib.local1.field2 = Test15Lib.local3;
Test15Lib.local2.field3 = Test15Lib.local2;
Test15Lib.local2.field4 = Test15Lib.local2;
Test15Lib.local2.field1 = Test15Lib.local1;
Test15Lib.local2.field2 = Test15Lib.local2;
Test15Lib.local3.field3 = Test15Lib.local3;
Test15Lib.local3.field4 = Test15Lib.local2;
Test15Lib.local3.field1 = Test15Lib.local3;
Test15Lib.local3.field2 = Test15Lib.local3;
if (inputValue<1) {
if (inputValue<=1) {
for (int local4 = 0; local4<=3; local4 += 1) {
for (int local5 = 0; local5<=0; local5 += 1) {
Test15Lib.local3.field2=Test15Lib.local3;
}
}
}
}
if (inputValue>1) {
Test15Lib.local2.field4=Test15Lib.local3.field2;
}else {
Test15Lib.local3.field1=Test15Lib.local3.field4;
}
if (inputValue<=2) {
Test15Lib.local3.field4.method2(Test15Lib.local2.field4,Test15Lib.local3,3);
}else {
Test15Lib.local1.field2.method2(Test15Lib.local3.field3,Test15Lib.local2.field2,3);
}
Benchmark.test(1,Test15Lib.local1);
Benchmark.test(2,Test15Lib.local2);
Benchmark.test(3,Test15Lib.local3);
Benchmark.test(4,Test15Lib.local1.field1);
Benchmark.test(5,Test15Lib.local1.field2);
Benchmark.test(6,Test15Lib.local2.field3);
Benchmark.test(7,Test15Lib.local2.field4);
Benchmark.test(8,Test15Lib.local2.field1);
Benchmark.test(9,Test15Lib.local2.field2);
Benchmark.test(10,Test15Lib.local3.field3);
Benchmark.test(11,Test15Lib.local3.field4);
Benchmark.test(12,Test15Lib.local3.field1);
Benchmark.test(13,Test15Lib.local3.field2);
Benchmark.print();
}
}
