package dataset;

import benchmark.internal.Benchmark;
import benchmark.tool.BasicClass;
class Test10Lib{
public static Test10Class1 local1;
public static Test10Class1 local2;
public static Test10Class2 local3;
public static Test10Class2 local4;
}
class Test10Class1 extends BasicClass {
public Test10Class2 field1;
public static void method1(int depth) {
if (depth == 0) return;
}
}
class Test10Class2 extends Test10Class1 {
public static Test10Class1 field2;
public static Test10Class2 method2(Test10Class2 arg0, int depth) {
if (depth == 0) return Test10Lib.local3;
return arg0;
}
}
public class Test10{
public static void main(String[] args) {
int inputValue = 0;
Benchmark.alloc(1);
Test10Lib.local1 = new Test10Class1();
Benchmark.alloc(2);
Test10Lib.local2 = new Test10Class1();
Benchmark.alloc(3);
Test10Lib.local3 = new Test10Class2();
Benchmark.alloc(4);
Test10Lib.local4 = new Test10Class2();
Test10Lib.local1.field1 = Test10Lib.local4;
Test10Lib.local2.field1 = Test10Lib.local4;
Test10Lib.local3.field2 = Test10Lib.local2;
Test10Lib.local3.field1 = Test10Lib.local3;
Test10Lib.local4.field2 = Test10Lib.local4;
Test10Lib.local4.field1 = Test10Lib.local3;
Test10Lib.local1=Test10Lib.local1;
if (inputValue<4) {
for (int local5 = 0; local5<=2; local5 += 1) {
Test10Lib.local3.field1=Test10Lib.local1.field1;
}
}else {
for (int local6 = 0; local6<=3; local6 += 1) {
if (inputValue>3) {
for (int local7 = 0; local7<=1; local7 += 1) {
for (int local8 = 0; local8<=2; local8 += 1) {
}
}
}else {
Test10Lib.local3.field1.method1(3);
}
}
}
if (inputValue>2) {
Test10Lib.local1.field1=Test10Lib.local3;
}
Test10Lib.local1.field1=Test10Lib.local3.field1;
Test10Lib.local2.method1(3);
Test10Lib.local2=Test10Lib.local4.field1;
for (int local9 = 0; local9<=1; local9 += 1) {
for (int local10 = 0; local10<=1; local10 += 1) {
for (int local11 = 0; local11<=0; local11 += 1) {
for (int local12 = 0; local12<=0; local12 += 1) {
Test10Lib.local4=Test10Lib.local3.field1;
}
}
}
}
Test10Lib.local1=Test10Lib.local2;
Test10Lib.local3.field1=Test10Lib.local4.field1;
Test10Lib.local4=Test10Lib.local2.field1;
Benchmark.test(1,Test10Lib.local1);
Benchmark.test(2,Test10Lib.local2);
Benchmark.test(3,Test10Lib.local3);
Benchmark.test(4,Test10Lib.local4);
Benchmark.test(5,Test10Lib.local1.field1);
Benchmark.test(6,Test10Lib.local2.field1);
Benchmark.test(7,Test10Lib.local3.field2);
Benchmark.test(8,Test10Lib.local3.field1);
Benchmark.test(9,Test10Lib.local4.field2);
Benchmark.test(10,Test10Lib.local4.field1);
Benchmark.print();
}
}
