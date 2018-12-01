package runnabledataset;

import benchmark.tool.Benchmark;
import benchmark.tool.BasicClass;
class Test74Lib{
public static Test74Class1 local1;
public static Test74Class2 local2;
}
class Test74Class1 extends BasicClass {
public Test74Class1 field1;
public Test74Class1 field2;
public Test74Class2 field3;
public Test74Class1 field4;
public void method1(Test74Class1 arg0, Test74Class1 arg1, int depth) {
if (depth == 0) return;
if (depth<=3) {
for (int local3 = 0; local3<=3; local3 += 1) {
arg0.field1.field1.field3=arg1.field3;
}
}
}
}
class Test74Class2 extends Test74Class1 {
public Test74Class1 field5;
public Test74Class1 field6;
public Test74Class1 field7;
public static void method2(int depth) {
if (depth == 0) return;
for (int local4 = 0; local4<=3; local4 += 1) {
for (int local5 = 0; local5<=2; local5 += 1) {
if (depth==4) {
for (int local6 = 0; local6<=2; local6 += 1) {
for (int local7 = 0; local7<=0; local7 += 1) {
}
}
}
}
}
for (int local8 = 0; local8<=3; local8 += 1) {
if (depth>=3) {
if (depth<=3) {
for (int local9 = 0; local9<=0; local9 += 1) {
if (depth>=4) {
}
}
}else {
if (depth>=3) {
if (depth>=2) {
}else {
}
}
}
}
}
if (depth<4) {
if (depth==4) {
for (int local10 = 0; local10<=1; local10 += 1) {
for (int local11 = 0; local11<=2; local11 += 1) {
for (int local12 = 0; local12<=1; local12 += 1) {
}
}
}
}else {
for (int local13 = 0; local13<=0; local13 += 1) {
if (depth>1) {
if (depth<=4) {
}
}else {
for (int local14 = 0; local14<=2; local14 += 1) {
}
}
}
}
}else {
if (depth==1) {
for (int local15 = 0; local15<=0; local15 += 1) {
for (int local16 = 0; local16<=1; local16 += 1) {
if (depth<4) {
}else {
}
}
}
}
}
if (depth<=2) {
for (int local17 = 0; local17<=3; local17 += 1) {
for (int local18 = 0; local18<=3; local18 += 1) {
if (depth<1) {
if (depth>4) {
}else {
}
}else {
for (int local19 = 0; local19<=2; local19 += 1) {
}
}
}
}
}
}
}
public class Test74{
public static void main(String[] args) {
int inputValue = 10;
Benchmark.alloc(1);
Test74Lib.local1 = new Test74Class1();
Benchmark.alloc(2);
Test74Lib.local2 = new Test74Class2();
Test74Lib.local1.field1 = Test74Lib.local2;
Test74Lib.local1.field2 = Test74Lib.local2;
Test74Lib.local1.field3 = Test74Lib.local2;
Test74Lib.local1.field4 = Test74Lib.local1;
Test74Lib.local2.field5 = Test74Lib.local2;
Test74Lib.local2.field6 = Test74Lib.local2;
Test74Lib.local2.field7 = Test74Lib.local1;
Test74Lib.local2.field1 = Test74Lib.local2;
Test74Lib.local2.field2 = Test74Lib.local2;
Test74Lib.local2.field3 = Test74Lib.local2;
Test74Lib.local2.field4 = Test74Lib.local2;
for (int local20 = 0; local20<=2; local20 += 1) {
Test74Lib.local2.field3.field4.field4.method1(Test74Lib.local1.field1.field2.field3,Test74Lib.local2.field2.field3.field5,3);
}
if (inputValue<4) {
if (inputValue<=1) {
if (inputValue>=4) {
if (inputValue<3) {
if (inputValue>=4) {
}
}
}else {
Test74Lib.local2.field1.field4.field1=Test74Lib.local2.field2.field4.field3;
}
}
}else {
Test74Lib.local2.field4.field3.field4=Test74Lib.local1.field4.field1.field3;
}
Test74Lib.local2.field3.field7.field3.method2(3);
Test74Lib.local1.field2.field4.field2.method1(Test74Lib.local2.field4.field3,Test74Lib.local1.field3.field4.field4,3);
Test74Lib.local2.field6.field1.field3=Test74Lib.local2.field5.field4.field3;
for (int local21 = 0; local21<=1; local21 += 1) {
for (int local22 = 0; local22<=3; local22 += 1) {
for (int local23 = 0; local23<=3; local23 += 1) {
Test74Lib.local1.field4.field4.field3.method2(3);
}
}
}
Test74Lib.local2.field3.field1.field4=Test74Lib.local2.field5.field3.field4;
if (inputValue<=2) {
Test74Lib.local1.field1.field2=Test74Lib.local2.field6.field3.field4;
}
Test74Lib.local2.field7.field2.field3=Test74Lib.local2.field4.field4.field3;
for (int local24 = 0; local24<=3; local24 += 1) {
for (int local25 = 0; local25<=0; local25 += 1) {
if (inputValue<4) {
Test74Lib.local1.field2.field1.field3.method2(3);
}
}
}
Benchmark.test(1,Test74Lib.local1);
Benchmark.test(2,Test74Lib.local2);
Benchmark.test(3,Test74Lib.local1.field1);
Benchmark.test(4,Test74Lib.local1.field2);
Benchmark.test(5,Test74Lib.local1.field3);
Benchmark.test(6,Test74Lib.local1.field4);
Benchmark.test(7,Test74Lib.local2.field5);
Benchmark.test(8,Test74Lib.local2.field6);
Benchmark.test(9,Test74Lib.local2.field7);
Benchmark.test(10,Test74Lib.local2.field1);
Benchmark.test(11,Test74Lib.local2.field2);
Benchmark.test(12,Test74Lib.local2.field3);
Benchmark.test(13,Test74Lib.local2.field4);
Benchmark.print();
}
}
