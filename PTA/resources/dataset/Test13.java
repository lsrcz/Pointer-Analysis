package dataset;

import benchmark.internal.Benchmark;
import benchmark.tool.BasicClass;
class Test13Lib{
public static Test13Class1 local1;
public static Test13Class1 local2;
public static Test13Class2 local3;
}
class Test13Class1 extends BasicClass {
public static Test13Class1 field1;
public Test13Class2 method1(Test13Class2 arg0, int depth) {
if (depth == 0) return Test13Lib.local3;
return arg0;
}
}
class Test13Class2 extends Test13Class1 {
public Test13Class1 field2;
public static Test13Class1 field3;
public void method2(Test13Class2 arg0, int depth) {
if (depth == 0) return;
}
}
public class Test13{
public static void main(String[] args) {
int inputValue = 0;
Benchmark.alloc(1);
Test13Lib.local1 = new Test13Class1();
Benchmark.alloc(2);
Test13Lib.local2 = new Test13Class1();
Benchmark.alloc(3);
Test13Lib.local3 = new Test13Class2();
Test13Lib.local1.field1 = Test13Lib.local2;
Test13Lib.local2.field1 = Test13Lib.local2;
Test13Lib.local3.field2 = Test13Lib.local1;
Test13Lib.local3.field3 = Test13Lib.local2;
Test13Lib.local3.field1 = Test13Lib.local1;
for (int local4 = 0; local4<=3; local4 += 1) {
Test13Lib.local2=Test13Lib.local2;
}
if (inputValue<=2) {
Test13Lib.local3.field3=Test13Lib.local3.field2.method1(Test13Lib.local3,3);
}else {
for (int local5 = 0; local5<=0; local5 += 1) {
Test13Lib.local3=Test13Lib.local3;
}
}
for (int local6 = 0; local6<=0; local6 += 1) {
if (inputValue<=3) {
for (int local7 = 0; local7<=3; local7 += 1) {
if (inputValue<=2) {
if (inputValue<2) {
}else {
}
}else {
Test13Lib.local3=Test13Lib.local3;
}
}
}
}
Benchmark.test(1,Test13Lib.local1);
Benchmark.test(2,Test13Lib.local2);
Benchmark.test(3,Test13Lib.local3);
Benchmark.test(4,Test13Lib.local1.field1);
Benchmark.test(5,Test13Lib.local2.field1);
Benchmark.test(6,Test13Lib.local3.field2);
Benchmark.test(7,Test13Lib.local3.field3);
Benchmark.test(8,Test13Lib.local3.field1);
Benchmark.print();
}
}
