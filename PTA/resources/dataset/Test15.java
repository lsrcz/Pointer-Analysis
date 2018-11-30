package dataset;

import benchmark.internal.Benchmark;
import benchmark.tool.BasicClass;
class Test15Lib{
public static Test15Class1 local1;
public static Test15Class1 local2;
public static Test15Class2 local3;
}
class Test15Class1 extends BasicClass {
public Test15Class1 field1;
public Test15Class2 method1(Test15Class2 arg0, Test15Class1 arg1, int depth) {
if (depth == 0) return Test15Lib.local3;
return arg0;
}
}
class Test15Class2 extends Test15Class1 {
public static Test15Class2 field2;
public Test15Class2 method2(Test15Class2 arg0, int depth) {
if (depth == 0) return Test15Lib.local3;
return this.field2;
}
}
public class Test15{
public static void main(String[] args) {
int inputValue = 0;
Benchmark.alloc(1);
Test15Lib.local1 = new Test15Class1();
Benchmark.alloc(2);
Test15Lib.local2 = new Test15Class1();
Benchmark.alloc(3);
Test15Lib.local3 = new Test15Class2();
Test15Lib.local1.field1 = Test15Lib.local3;
Test15Lib.local2.field1 = Test15Lib.local1;
Test15Lib.local3.field2 = Test15Lib.local3;
Test15Lib.local3.field1 = Test15Lib.local2;
if (inputValue>4) {
Test15Lib.local3.field1=Test15Lib.local3.field2;
}else {
for (int local4 = 0; local4<=1; local4 += 1) {
for (int local5 = 0; local5<=1; local5 += 1) {
Test15Lib.local3.field2=Test15Lib.local3;
}
}
}
for (int local6 = 0; local6<=2; local6 += 1) {
for (int local7 = 0; local7<=0; local7 += 1) {
Test15Lib.local3.field2=Test15Lib.local3;
}
}
for (int local8 = 0; local8<=3; local8 += 1) {
if (inputValue>2) {
Test15Lib.local2=Test15Lib.local2;
}
}
for (int local9 = 0; local9<=3; local9 += 1) {
if (inputValue>=2) {
if (inputValue>=3) {
if (inputValue<4) {
Test15Lib.local2=Test15Lib.local1;
}
}else {
Test15Lib.local3.field1=Test15Lib.local3.field2.method2(Test15Lib.local3.field2,3);
}
}else {
Test15Lib.local2.field1=Test15Lib.local3.field2.method2(Test15Lib.local3.field2,3);
}
}
if (inputValue<3) {
Test15Lib.local3.field1=Test15Lib.local3.field2.method1(Test15Lib.local3,Test15Lib.local2.field1,3);
}
if (inputValue==1) {
Test15Lib.local1=Test15Lib.local3.field2;
}else {
if (inputValue<=2) {
for (int local10 = 0; local10<=2; local10 += 1) {
if (inputValue>=2) {
Test15Lib.local3.field2=Test15Lib.local3.field1.method1(Test15Lib.local3.field2,Test15Lib.local1,3);
}else {
for (int local11 = 0; local11<=1; local11 += 1) {
}
}
}
}
}
Test15Lib.local3=Test15Lib.local3.field2.method1(Test15Lib.local3,Test15Lib.local3,3);
if (inputValue>1) {
Test15Lib.local3.field1=Test15Lib.local1;
}
for (int local12 = 0; local12<=0; local12 += 1) {
for (int local13 = 0; local13<=0; local13 += 1) {
for (int local14 = 0; local14<=2; local14 += 1) {
for (int local15 = 0; local15<=1; local15 += 1) {
if (inputValue<4) {
}else {
}
}
}
}
}
for (int local16 = 0; local16<=2; local16 += 1) {
if (inputValue>=2) {
if (inputValue>4) {
for (int local17 = 0; local17<=3; local17 += 1) {
Test15Lib.local1=Test15Lib.local1;
}
}else {
Test15Lib.local2.field1=Test15Lib.local3.field2.method2(Test15Lib.local3,3);
}
}
}
Benchmark.test(1,Test15Lib.local1);
Benchmark.test(2,Test15Lib.local2);
Benchmark.test(3,Test15Lib.local3);
Benchmark.test(4,Test15Lib.local1.field1);
Benchmark.test(5,Test15Lib.local2.field1);
Benchmark.test(6,Test15Lib.local3.field2);
Benchmark.test(7,Test15Lib.local3.field1);
Benchmark.print();
}
}
