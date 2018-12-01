package dataset;

import benchmark.internal.Benchmark;
import benchmark.tool.BasicClass;
class Test62Lib{
public static Test62Class1 local1;
public static Test62Class1 local2;
public static Test62Class2 local3;
public static Test62Class2 local4;
}
class Test62Class1 extends BasicClass {
public Test62Class2 field1;
public Test62Class1 field2;
public static Test62Class1 method1(Test62Class1 arg0, int depth) {
if (depth == 0) return Test62Lib.local4;
arg0.field2.field1.field3=arg0.field2.field2;
return arg0.field1.field5.field3;
}
}
class Test62Class2 extends Test62Class1 {
public Test62Class1 field3;
public Test62Class1 field4;
public Test62Class2 field5;
public static Test62Class1 method2(int depth) {
if (depth == 0) return Test62Lib.local4;
if (depth<2) {
if (depth==2) {
for (int local5 = 0; local5<=3; local5 += 1) {
if (depth<3) {
for (int local6 = 0; local6<=0; local6 += 1) {
}
}else {
for (int local7 = 0; local7<=3; local7 += 1) {
}
}
}
}else {
for (int local8 = 0; local8<=1; local8 += 1) {
for (int local9 = 0; local9<=0; local9 += 1) {
if (depth==3) {
}
}
}
}
}
for (int local10 = 0; local10<=2; local10 += 1) {
for (int local11 = 0; local11<=1; local11 += 1) {
if (depth<3) {
if (depth<=3) {
for (int local12 = 0; local12<=0; local12 += 1) {
}
}else {
if (depth>=4) {
}else {
}
}
}else {
for (int local13 = 0; local13<=1; local13 += 1) {
for (int local14 = 0; local14<=1; local14 += 1) {
}
}
}
}
}
for (int local15 = 0; local15<=1; local15 += 1) {
for (int local16 = 0; local16<=1; local16 += 1) {
if (depth>4) {
if (depth==4) {
for (int local17 = 0; local17<=0; local17 += 1) {
}
}
}else {
if (depth<1) {
for (int local18 = 0; local18<=2; local18 += 1) {
}
}
}
}
}
return Test62Lib.local1;
}
}
public class Test62{
public static void main(String[] args) {
int inputValue = 0;
Benchmark.alloc(1);
Test62Lib.local1 = new Test62Class1();
Benchmark.alloc(2);
Test62Lib.local2 = new Test62Class1();
Benchmark.alloc(3);
Test62Lib.local3 = new Test62Class2();
Benchmark.alloc(4);
Test62Lib.local4 = new Test62Class2();
Test62Lib.local1.field1 = Test62Lib.local3;
Test62Lib.local1.field2 = Test62Lib.local4;
Test62Lib.local2.field1 = Test62Lib.local3;
Test62Lib.local2.field2 = Test62Lib.local2;
Test62Lib.local3.field3 = Test62Lib.local1;
Test62Lib.local3.field4 = Test62Lib.local3;
Test62Lib.local3.field5 = Test62Lib.local3;
Test62Lib.local3.field1 = Test62Lib.local3;
Test62Lib.local3.field2 = Test62Lib.local4;
Test62Lib.local4.field3 = Test62Lib.local3;
Test62Lib.local4.field4 = Test62Lib.local4;
Test62Lib.local4.field5 = Test62Lib.local3;
Test62Lib.local4.field1 = Test62Lib.local4;
Test62Lib.local4.field2 = Test62Lib.local4;
Test62Lib.local3.field4.field1=Test62Lib.local2.field1.field5.field1;
if (inputValue==1) {
for (int local19 = 0; local19<=2; local19 += 1) {
if (inputValue<=2) {
if (inputValue>3) {
for (int local20 = 0; local20<=0; local20 += 1) {
}
}
}
}
}else {
Test62Lib.local3.field3.field1.field5=Test62Lib.local1.field2.field2.field1;
}
for (int local21 = 0; local21<=1; local21 += 1) {
if (inputValue>1) {
Test62Lib.local1.field1.field5.field5=Test62Lib.local1.field2.field2.field1;
}
}
if (inputValue>=4) {
if (inputValue>2) {
Test62Lib.local3.field5.field4=Test62Lib.local2.field1.field5.field4;
}else {
Test62Lib.local3.field2.field1.field4.method1(Test62Lib.local3.field1.field2.field2,3);
}
}
Test62Lib.local2.field1.field4.field1=Test62Lib.local3.field3.field1.field5;
Test62Lib.local3.field5.field2=Test62Lib.local4.field1.field2.field1;
if (inputValue<4) {
Test62Lib.local3.field5.field5=Test62Lib.local3.field1.field1.field1;
}
Test62Lib.local4.field5.field1.field4=Test62Lib.local3.field3.field1.method2(3);
if (inputValue==4) {
for (int local22 = 0; local22<=0; local22 += 1) {
for (int local23 = 0; local23<=3; local23 += 1) {
Test62Lib.local3.field1.field3.field2=Test62Lib.local4.field5.field5.field1.method2(3);
}
}
}
for (int local24 = 0; local24<=3; local24 += 1) {
Test62Lib.local1.field1.field5.field2=Test62Lib.local3.field5.field1.field2;
}
Benchmark.test(1,Test62Lib.local1);
Benchmark.test(2,Test62Lib.local2);
Benchmark.test(3,Test62Lib.local3);
Benchmark.test(4,Test62Lib.local4);
Benchmark.test(5,Test62Lib.local1.field1);
Benchmark.test(6,Test62Lib.local1.field2);
Benchmark.test(7,Test62Lib.local2.field1);
Benchmark.test(8,Test62Lib.local2.field2);
Benchmark.test(9,Test62Lib.local3.field3);
Benchmark.test(10,Test62Lib.local3.field4);
Benchmark.test(11,Test62Lib.local3.field5);
Benchmark.test(12,Test62Lib.local3.field1);
Benchmark.test(13,Test62Lib.local3.field2);
Benchmark.test(14,Test62Lib.local4.field3);
Benchmark.test(15,Test62Lib.local4.field4);
Benchmark.test(16,Test62Lib.local4.field5);
Benchmark.test(17,Test62Lib.local4.field1);
Benchmark.test(18,Test62Lib.local4.field2);
Benchmark.print();
}
}
