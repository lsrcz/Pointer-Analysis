package dataset;

import benchmark.internal.Benchmark;
import benchmark.tool.BasicClass;
class Test2Lib{
public static Test2Class1 local1;
public static Test2Class2 local2;
public static Test2Class2 local3;
}
class Test2Class1 extends BasicClass {
public static Test2Class2 field1;
public static Test2Class2 field2;
public static void method1(int depth) {
if (depth == 0) return;
}
}
class Test2Class2 extends Test2Class1 {
public static Test2Class1 field3;
public Test2Class2 method2(int depth) {
if (depth == 0) return Test2Lib.local3;
return this.field2;
}
}
public class Test2{
public static void main(String[] args) {
int inputValue = 0;
Benchmark.alloc(1);
Test2Lib.local1 = new Test2Class1();
Benchmark.alloc(2);
Test2Lib.local2 = new Test2Class2();
Benchmark.alloc(3);
Test2Lib.local3 = new Test2Class2();
Test2Lib.local1.field1 = Test2Lib.local2;
Test2Lib.local1.field2 = Test2Lib.local2;
Test2Lib.local2.field3 = Test2Lib.local2;
Test2Lib.local2.field1 = Test2Lib.local3;
Test2Lib.local2.field2 = Test2Lib.local3;
Test2Lib.local3.field3 = Test2Lib.local1;
Test2Lib.local3.field1 = Test2Lib.local2;
Test2Lib.local3.field2 = Test2Lib.local3;
for (int local4 = 0; local4<=3; local4 += 1) {
for (int local5 = 0; local5<=1; local5 += 1) {
Test2Lib.local3.field3=Test2Lib.local2.field1.method2(3);
}
}
Test2Lib.local2.field3.method1(3);
for (int local6 = 0; local6<=0; local6 += 1) {
Test2Lib.local2.field3=Test2Lib.local2.field1;
}
Test2Lib.local1=Test2Lib.local3.field2;
Test2Lib.local1.field1=Test2Lib.local3;
if (inputValue>=2) {
for (int local7 = 0; local7<=1; local7 += 1) {
Test2Lib.local3.method1(3);
}
}else {
Test2Lib.local2.field3=Test2Lib.local2.field1;
}
if (inputValue<2) {
Test2Lib.local3=Test2Lib.local3.field2;
}else {
for (int local8 = 0; local8<=3; local8 += 1) {
Test2Lib.local2.field3=Test2Lib.local1.field2;
}
}
if (inputValue<=4) {
for (int local9 = 0; local9<=2; local9 += 1) {
if (inputValue<=4) {
if (inputValue==1) {
for (int local10 = 0; local10<=3; local10 += 1) {
}
}else {
for (int local11 = 0; local11<=0; local11 += 1) {
}
}
}
}
}else {
Test2Lib.local2.field1=Test2Lib.local2.field2;
}
if (inputValue>=4) {
for (int local12 = 0; local12<=3; local12 += 1) {
Test2Lib.local2.method1(3);
}
}else {
Test2Lib.local2.field2=Test2Lib.local1.field2;
}
if (inputValue>3) {
for (int local13 = 0; local13<=0; local13 += 1) {
for (int local14 = 0; local14<=0; local14 += 1) {
for (int local15 = 0; local15<=1; local15 += 1) {
for (int local16 = 0; local16<=2; local16 += 1) {
}
}
}
}
}else {
Test2Lib.local1.field2=Test2Lib.local2;
}
Benchmark.test(1,Test2Lib.local1);
Benchmark.test(2,Test2Lib.local2);
Benchmark.test(3,Test2Lib.local3);
Benchmark.test(4,Test2Lib.local1.field1);
Benchmark.test(5,Test2Lib.local1.field2);
Benchmark.test(6,Test2Lib.local2.field3);
Benchmark.test(7,Test2Lib.local2.field1);
Benchmark.test(8,Test2Lib.local2.field2);
Benchmark.test(9,Test2Lib.local3.field3);
Benchmark.test(10,Test2Lib.local3.field1);
Benchmark.test(11,Test2Lib.local3.field2);
Benchmark.print();
}
}
