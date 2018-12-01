package dataset;

import benchmark.internal.Benchmark;
import benchmark.tool.BasicClass;
class Test65Lib{
public static Test65Class1 local1;
public static Test65Class1 local2;
public static Test65Class2 local3;
public static Test65Class2 local4;
}
class Test65Class1 extends BasicClass {
public Test65Class2 field1;
public Test65Class1 field2;
public Test65Class1 method1(int depth) {
if (depth == 0) return Test65Lib.local3;
this.field1.field1.field2=this.field1.field1.field3;
if (depth==4) {
this.field2.field2=this.field1.field2;
}
this.field1.field3.field2=this.field1.field3.field2;
this.field2.field2.field2=this.field2.field2.field1.method1(depth-1);
return this.field1.field1.field2;
}
}
class Test65Class2 extends Test65Class1 {
public Test65Class1 field3;
public Test65Class1 method2(int depth) {
if (depth == 0) return Test65Lib.local1;
for (int local5 = 0; local5<=3; local5 += 1) {
if (depth<=2) {
for (int local6 = 0; local6<=3; local6 += 1) {
for (int local7 = 0; local7<=1; local7 += 1) {
for (int local8 = 0; local8<=1; local8 += 1) {
}
}
}
}
}
if (depth>=2) {
this.field3.field2.field2=this.method1(depth-1);
}else {
if (depth>=4) {
if (depth==2) {
if (depth<1) {
this.field1.field2.field1.method2(depth-1);
}else {
this.field1.field1.field3=this.field3.field2.field1;
}
}
}
}
return this.field2.field1.field1;
}
}
public class Test65{
public static void main(String[] args) {
int inputValue = 0;
Benchmark.alloc(1);
Test65Lib.local1 = new Test65Class1();
Benchmark.alloc(2);
Test65Lib.local2 = new Test65Class1();
Benchmark.alloc(3);
Test65Lib.local3 = new Test65Class2();
Benchmark.alloc(4);
Test65Lib.local4 = new Test65Class2();
Test65Lib.local1.field1 = Test65Lib.local4;
Test65Lib.local1.field2 = Test65Lib.local1;
Test65Lib.local2.field1 = Test65Lib.local4;
Test65Lib.local2.field2 = Test65Lib.local4;
Test65Lib.local3.field3 = Test65Lib.local4;
Test65Lib.local3.field1 = Test65Lib.local4;
Test65Lib.local3.field2 = Test65Lib.local3;
Test65Lib.local4.field3 = Test65Lib.local4;
Test65Lib.local4.field1 = Test65Lib.local3;
Test65Lib.local4.field2 = Test65Lib.local2;
for (int local9 = 0; local9<=0; local9 += 1) {
if (inputValue<1) {
Test65Lib.local1.field1.field3=Test65Lib.local4.field1.field3;
}
}
Test65Lib.local2.field2.field1.method2(3);
for (int local10 = 0; local10<=2; local10 += 1) {
for (int local11 = 0; local11<=2; local11 += 1) {
for (int local12 = 0; local12<=3; local12 += 1) {
if (inputValue==2) {
Test65Lib.local1.field1.field2=Test65Lib.local4.field3.field1.field2;
}else {
for (int local13 = 0; local13<=2; local13 += 1) {
}
}
}
}
}
Test65Lib.local3.field1.field1=Test65Lib.local4.field3.field2.field1;
if (inputValue==1) {
Test65Lib.local4.field1.field1=Test65Lib.local4.field1.field1;
}else {
Test65Lib.local3.field3.field1.field3=Test65Lib.local4.field2.field1.field3;
}
Test65Lib.local1.field2.field1.field2=Test65Lib.local1.field1.field1.field1;
Test65Lib.local2.field1.field1=Test65Lib.local2.field2.field1;
for (int local14 = 0; local14<=2; local14 += 1) {
Test65Lib.local2.field2.field2.field1=Test65Lib.local4.field1.field2.field1;
}
if (inputValue<2) {
Test65Lib.local1.field1.field1.field3=Test65Lib.local2.field1.field2;
}
for (int local15 = 0; local15<=0; local15 += 1) {
Test65Lib.local1.field2.field2=Test65Lib.local4.field3.field2.field1.method1(3);
}
Benchmark.test(1,Test65Lib.local1);
Benchmark.test(2,Test65Lib.local2);
Benchmark.test(3,Test65Lib.local3);
Benchmark.test(4,Test65Lib.local4);
Benchmark.test(5,Test65Lib.local1.field1);
Benchmark.test(6,Test65Lib.local1.field2);
Benchmark.test(7,Test65Lib.local2.field1);
Benchmark.test(8,Test65Lib.local2.field2);
Benchmark.test(9,Test65Lib.local3.field3);
Benchmark.test(10,Test65Lib.local3.field1);
Benchmark.test(11,Test65Lib.local3.field2);
Benchmark.test(12,Test65Lib.local4.field3);
Benchmark.test(13,Test65Lib.local4.field1);
Benchmark.test(14,Test65Lib.local4.field2);
Benchmark.print();
}
}
