package dataset;

import benchmark.internal.Benchmark;
import benchmark.tool.BasicClass;
class Test14Lib{
public static Test14Class1 local1;
public static Test14Class2 local2;
public static Test14Class2 local3;
}
class Test14Class1 extends BasicClass {
public static Test14Class1 field1;
public static Test14Class1 field2;
public void method1(int depth) {
if (depth == 0) return;
}
}
class Test14Class2 extends Test14Class1 {
public Test14Class1 field3;
public void method2(int depth) {
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
Benchmark.alloc(3);
Test14Lib.local3 = new Test14Class2();
Test14Lib.local1.field1 = Test14Lib.local1;
Test14Lib.local1.field2 = Test14Lib.local3;
Test14Lib.local2.field3 = Test14Lib.local2;
Test14Lib.local2.field1 = Test14Lib.local3;
Test14Lib.local2.field2 = Test14Lib.local1;
Test14Lib.local3.field3 = Test14Lib.local2;
Test14Lib.local3.field1 = Test14Lib.local3;
Test14Lib.local3.field2 = Test14Lib.local2;
for (int local4 = 0; local4<=3; local4 += 1) {
for (int local5 = 0; local5<=0; local5 += 1) {
for (int local6 = 0; local6<=2; local6 += 1) {
Test14Lib.local3.field3=Test14Lib.local2.field2;
}
}
}
if (inputValue>=3) {
Test14Lib.local3.method1(3);
}
for (int local7 = 0; local7<=0; local7 += 1) {
for (int local8 = 0; local8<=0; local8 += 1) {
Test14Lib.local2.field2.method1(3);
}
}
Test14Lib.local3.method1(3);
for (int local9 = 0; local9<=3; local9 += 1) {
for (int local10 = 0; local10<=0; local10 += 1) {
Test14Lib.local1.method1(3);
}
}
for (int local11 = 0; local11<=3; local11 += 1) {
for (int local12 = 0; local12<=0; local12 += 1) {
for (int local13 = 0; local13<=1; local13 += 1) {
Test14Lib.local1=Test14Lib.local2.field1;
}
}
}
Test14Lib.local2.field2.method1(3);
Test14Lib.local1.method1(3);
if (inputValue>3) {
if (inputValue<1) {
Test14Lib.local3=Test14Lib.local2;
}
}else {
for (int local14 = 0; local14<=1; local14 += 1) {
for (int local15 = 0; local15<=2; local15 += 1) {
for (int local16 = 0; local16<=0; local16 += 1) {
Test14Lib.local3=Test14Lib.local3;
}
}
}
}
for (int local17 = 0; local17<=3; local17 += 1) {
for (int local18 = 0; local18<=2; local18 += 1) {
Test14Lib.local3.field3=Test14Lib.local1.field2;
}
}
Benchmark.test(1,Test14Lib.local1);
Benchmark.test(2,Test14Lib.local2);
Benchmark.test(3,Test14Lib.local3);
Benchmark.test(4,Test14Lib.local1.field1);
Benchmark.test(5,Test14Lib.local1.field2);
Benchmark.test(6,Test14Lib.local2.field3);
Benchmark.test(7,Test14Lib.local2.field1);
Benchmark.test(8,Test14Lib.local2.field2);
Benchmark.test(9,Test14Lib.local3.field3);
Benchmark.test(10,Test14Lib.local3.field1);
Benchmark.test(11,Test14Lib.local3.field2);
Benchmark.print();
}
}
