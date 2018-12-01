package dataset;

import benchmark.internal.Benchmark;
import benchmark.tool.BasicClass;
class Test63Lib{
public static Test63Class1 local1;
public static Test63Class1 local2;
public static Test63Class2 local3;
public static Test63Class2 local4;
}
class Test63Class1 extends BasicClass {
public Test63Class1 field1;
public Test63Class1 field2;
public Test63Class2 field3;
public Test63Class2 method1(Test63Class2 arg0, int depth) {
if (depth == 0) return Test63Lib.local3;
for (int local5 = 0; local5<=3; local5 += 1) {
arg0.field7=arg0.field3.field7.field6;
}
if (depth<3) {
for (int local6 = 0; local6<=2; local6 += 1) {
arg0.field6.field6.field4=this.field3.field6.field1;
}
}
return this.field3.field3.field7;
}
}
class Test63Class2 extends Test63Class1 {
public Test63Class1 field4;
public Test63Class2 field5;
public Test63Class2 field6;
public Test63Class2 field7;
public static Test63Class2 method2(int depth) {
if (depth == 0) return Test63Lib.local3;
if (depth<1) {
if (depth==4) {
for (int local7 = 0; local7<=3; local7 += 1) {
if (depth==3) {
if (depth>1) {
}else {
}
}
}
}else {
if (depth<=4) {
for (int local8 = 0; local8<=0; local8 += 1) {
if (depth<=3) {
}
}
}
}
}else {
for (int local9 = 0; local9<=3; local9 += 1) {
if (depth==3) {
if (depth>=2) {
if (depth>=2) {
}
}else {
for (int local10 = 0; local10<=1; local10 += 1) {
}
}
}
}
}
return Test63Lib.local3;
}
}
public class Test63{
public static void main(String[] args) {
int inputValue = 0;
Benchmark.alloc(1);
Test63Lib.local1 = new Test63Class1();
Benchmark.alloc(2);
Test63Lib.local2 = new Test63Class1();
Benchmark.alloc(3);
Test63Lib.local3 = new Test63Class2();
Benchmark.alloc(4);
Test63Lib.local4 = new Test63Class2();
Test63Lib.local1.field1 = Test63Lib.local4;
Test63Lib.local1.field2 = Test63Lib.local4;
Test63Lib.local1.field3 = Test63Lib.local4;
Test63Lib.local2.field1 = Test63Lib.local2;
Test63Lib.local2.field2 = Test63Lib.local1;
Test63Lib.local2.field3 = Test63Lib.local3;
Test63Lib.local3.field4 = Test63Lib.local1;
Test63Lib.local3.field5 = Test63Lib.local3;
Test63Lib.local3.field6 = Test63Lib.local3;
Test63Lib.local3.field7 = Test63Lib.local4;
Test63Lib.local3.field1 = Test63Lib.local4;
Test63Lib.local3.field2 = Test63Lib.local1;
Test63Lib.local3.field3 = Test63Lib.local3;
Test63Lib.local4.field4 = Test63Lib.local2;
Test63Lib.local4.field5 = Test63Lib.local4;
Test63Lib.local4.field6 = Test63Lib.local3;
Test63Lib.local4.field7 = Test63Lib.local4;
Test63Lib.local4.field1 = Test63Lib.local3;
Test63Lib.local4.field2 = Test63Lib.local4;
Test63Lib.local4.field3 = Test63Lib.local4;
Test63Lib.local3.field7.field5.field1=Test63Lib.local3.field2.field3.field3;
if (inputValue<4) {
for (int local11 = 0; local11<=0; local11 += 1) {
if (inputValue<3) {
if (inputValue<=1) {
Test63Lib.local2.field3.field6=Test63Lib.local3.field3.field6.field5;
}else {
for (int local12 = 0; local12<=3; local12 += 1) {
}
}
}else {
Test63Lib.local4.field6.field3.field2=Test63Lib.local4.field3.field7.field6;
}
}
}
Test63Lib.local4.field6.field6=Test63Lib.local1.field3.field5.field5.method2(3);
if (inputValue<2) {
for (int local13 = 0; local13<=1; local13 += 1) {
Test63Lib.local4.field6.field6.field2=Test63Lib.local4.field1.field2.field2;
}
}
for (int local14 = 0; local14<=0; local14 += 1) {
if (inputValue>=1) {
Test63Lib.local3.field3.field1=Test63Lib.local1.field3.field2.field3;
}
}
if (inputValue<=1) {
for (int local15 = 0; local15<=3; local15 += 1) {
if (inputValue==3) {
Test63Lib.local3.field3.field2=Test63Lib.local3.field2.field3.field3.method1(Test63Lib.local4.field3.field3,3);
}else {
for (int local16 = 0; local16<=0; local16 += 1) {
Test63Lib.local3.field4.field3.field6=Test63Lib.local1.field1.field2.field3.method1(Test63Lib.local2.field3.field3,3);
}
}
}
}else {
for (int local17 = 0; local17<=1; local17 += 1) {
for (int local18 = 0; local18<=1; local18 += 1) {
for (int local19 = 0; local19<=0; local19 += 1) {
if (inputValue>=1) {
}else {
}
}
}
}
}
Test63Lib.local4.field3.field3.field2.method1(Test63Lib.local3.field4.field3,3);
for (int local20 = 0; local20<=3; local20 += 1) {
Test63Lib.local4.field5.field6.field1=Test63Lib.local4.field7.field1.field3.method2(3);
}
if (inputValue>2) {
if (inputValue>1) {
Test63Lib.local4.field5.field5.field1=Test63Lib.local3.field6.field2.field1;
}
}else {
for (int local21 = 0; local21<=0; local21 += 1) {
Test63Lib.local2.field1.field3.field3=Test63Lib.local4.field6;
}
}
if (inputValue==1) {
Test63Lib.local3.field3.field1.field1=Test63Lib.local4.field6.field7.method2(3);
}
Benchmark.test(1,Test63Lib.local1);
Benchmark.test(2,Test63Lib.local2);
Benchmark.test(3,Test63Lib.local3);
Benchmark.test(4,Test63Lib.local4);
Benchmark.test(5,Test63Lib.local1.field1);
Benchmark.test(6,Test63Lib.local1.field2);
Benchmark.test(7,Test63Lib.local1.field3);
Benchmark.test(8,Test63Lib.local2.field1);
Benchmark.test(9,Test63Lib.local2.field2);
Benchmark.test(10,Test63Lib.local2.field3);
Benchmark.test(11,Test63Lib.local3.field4);
Benchmark.test(12,Test63Lib.local3.field5);
Benchmark.test(13,Test63Lib.local3.field6);
Benchmark.test(14,Test63Lib.local3.field7);
Benchmark.test(15,Test63Lib.local3.field1);
Benchmark.test(16,Test63Lib.local3.field2);
Benchmark.test(17,Test63Lib.local3.field3);
Benchmark.test(18,Test63Lib.local4.field4);
Benchmark.test(19,Test63Lib.local4.field5);
Benchmark.test(20,Test63Lib.local4.field6);
Benchmark.test(21,Test63Lib.local4.field7);
Benchmark.test(22,Test63Lib.local4.field1);
Benchmark.test(23,Test63Lib.local4.field2);
Benchmark.test(24,Test63Lib.local4.field3);
Benchmark.print();
}
}
