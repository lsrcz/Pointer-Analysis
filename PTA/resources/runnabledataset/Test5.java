package runnabledataset;

import benchmark.tool.Benchmark;
import benchmark.tool.BasicClass;
class Test5Lib{
public static Test5Class1 local1;
public static Test5Class1 local2;
public static Test5Class2 local3;
public static Test5Class2 local4;
}
class Test5Class1 extends BasicClass {
public static Test5Class2 field1;
public static Test5Class1 field2;
public Test5Class1 method1(int depth) {
if (depth == 0) return Test5Lib.local1;
return this.field2;
}
}
class Test5Class2 extends Test5Class1 {
public static Test5Class1 field3;
public Test5Class2 field4;
public static void method2(Test5Class2 arg0, Test5Class2 arg1, int depth) {
if (depth == 0) return;
}
}
public class Test5{
public static void main(String[] args) {
int inputValue = 10;
Benchmark.alloc(1);
Test5Lib.local1 = new Test5Class1();
Benchmark.alloc(2);
Test5Lib.local2 = new Test5Class1();
Benchmark.alloc(3);
Test5Lib.local3 = new Test5Class2();
Benchmark.alloc(4);
Test5Lib.local4 = new Test5Class2();
Test5Lib.local1.field1 = Test5Lib.local4;
Test5Lib.local1.field2 = Test5Lib.local4;
Test5Lib.local2.field1 = Test5Lib.local4;
Test5Lib.local2.field2 = Test5Lib.local4;
Test5Lib.local3.field3 = Test5Lib.local2;
Test5Lib.local3.field4 = Test5Lib.local3;
Test5Lib.local3.field1 = Test5Lib.local4;
Test5Lib.local3.field2 = Test5Lib.local2;
Test5Lib.local4.field3 = Test5Lib.local4;
Test5Lib.local4.field4 = Test5Lib.local3;
Test5Lib.local4.field1 = Test5Lib.local3;
Test5Lib.local4.field2 = Test5Lib.local2;
Test5Lib.local4.field3=Test5Lib.local1.method1(3);
for (int local5 = 0; local5<=1; local5 += 1) {
Test5Lib.local1.field1.method2(Test5Lib.local3,Test5Lib.local3,3);
}
Test5Lib.local4.field4.method2(Test5Lib.local3.field1,Test5Lib.local1.field1,3);
for (int local6 = 0; local6<=1; local6 += 1) {
for (int local7 = 0; local7<=3; local7 += 1) {
for (int local8 = 0; local8<=1; local8 += 1) {
Test5Lib.local4.field3=Test5Lib.local2.field2;
}
}
}
if (inputValue<=4) {
for (int local9 = 0; local9<=2; local9 += 1) {
Test5Lib.local3.field1.method2(Test5Lib.local4.field1,Test5Lib.local4.field1,3);
}
}else {
for (int local10 = 0; local10<=2; local10 += 1) {
if (inputValue==4) {
Test5Lib.local2.field1.method2(Test5Lib.local3.field4,Test5Lib.local3.field4,3);
}
}
}
for (int local11 = 0; local11<=3; local11 += 1) {
if (inputValue==3) {
Test5Lib.local1.field2=Test5Lib.local4.field2.method1(3);
}
}
if (inputValue<=2) {
Test5Lib.local3.field3=Test5Lib.local3;
}else {
if (inputValue==4) {
for (int local12 = 0; local12<=0; local12 += 1) {
if (inputValue<3) {
if (inputValue<1) {
}else {
}
}else {
if (inputValue<=4) {
}else {
}
}
}
}
}
if (inputValue<4) {
if (inputValue>=1) {
Test5Lib.local2.field1.method2(Test5Lib.local4.field1,Test5Lib.local1.field1,3);
}
}
Test5Lib.local1.field2=Test5Lib.local3;
Test5Lib.local4.method2(Test5Lib.local3,Test5Lib.local2.field1,3);
Benchmark.test(1,Test5Lib.local1);
Benchmark.test(2,Test5Lib.local2);
Benchmark.test(3,Test5Lib.local3);
Benchmark.test(4,Test5Lib.local4);
Benchmark.test(5,Test5Lib.local1.field1);
Benchmark.test(6,Test5Lib.local1.field2);
Benchmark.test(7,Test5Lib.local2.field1);
Benchmark.test(8,Test5Lib.local2.field2);
Benchmark.test(9,Test5Lib.local3.field3);
Benchmark.test(10,Test5Lib.local3.field4);
Benchmark.test(11,Test5Lib.local3.field1);
Benchmark.test(12,Test5Lib.local3.field2);
Benchmark.test(13,Test5Lib.local4.field3);
Benchmark.test(14,Test5Lib.local4.field4);
Benchmark.test(15,Test5Lib.local4.field1);
Benchmark.test(16,Test5Lib.local4.field2);
Benchmark.print();
}
}
