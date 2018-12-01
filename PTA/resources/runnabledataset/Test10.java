package runnabledataset;

import benchmark.tool.Benchmark;
import benchmark.tool.BasicClass;
class Test10Lib{
public static Test10Class1 local1;
public static Test10Class1 local2;
public static Test10Class1 local3;
public static Test10Class2 local4;
public static Test10Class3 local5;
public static Test10Class3 local6;
}
class Test10Class1 extends BasicClass {
public Test10Class2 field1;
public Test10Class3 field2;
public Test10Class2 field3;
public void method1(int depth) {
if (depth == 0) return;
this.field3=this.field3.method5(this.field2,depth-1);
}
public void method2(Test10Class3 arg0, int depth) {
if (depth == 0) return;
this.field2.method7(depth-1);
arg0.method1(depth-1);
}
public static void method3(Test10Class1 arg0, Test10Class1 arg1, int depth) {
if (depth == 0) return;
arg1=arg1.field2.method6(depth-1);
}
}
class Test10Class2 extends Test10Class1 {
public Test10Class3 field4;
public Test10Class3 field5;
public static void method4(Test10Class2 arg0, int depth) {
if (depth == 0) return;
for (int local7 = 0; local7<=3; local7 += 1) {
if (depth>=1) {
arg0.field1.method2(arg0.field5,depth-1);
}
}
if (depth<=1) {
arg0.field4=arg0.field5;
}
}
public static Test10Class2 method5(Test10Class1 arg0, int depth) {
if (depth == 0) return Test10Lib.local4;
arg0.field2.method8(arg0.field1,depth-1);
if (depth<=4) {
for (int local8 = 0; local8<=1; local8 += 1) {
arg0.field3.method4(arg0.field1,depth-1);
}
}else {
arg0=arg0.field1.method5(arg0,depth-1);
}
if (depth<4) {
for (int local9 = 0; local9<=3; local9 += 1) {
arg0.field3=arg0.field1;
}
}else {
arg0.field2=arg0.field2;
}
return arg0.field1;
}
}
class Test10Class3 extends Test10Class1 {
public Test10Class2 field6;
public static Test10Class3 method6(int depth) {
if (depth == 0) return Test10Lib.local5;
if (depth==3) {
if (depth<=3) {
for (int local10 = 0; local10<=2; local10 += 1) {
if (depth<3) {
if (depth<3) {
}else {
}
}
}
}else {
if (depth<3) {
if (depth==3) {
for (int local11 = 0; local11<=3; local11 += 1) {
}
}
}
}
}else {
if (depth<3) {
if (depth<2) {
if (depth==3) {
for (int local12 = 0; local12<=2; local12 += 1) {
}
}
}
}
}
return Test10Lib.local5;
}
public void method7(int depth) {
if (depth == 0) return;
this.field1.method3(this.field6,this.field2,depth-1);
for (int local13 = 0; local13<=1; local13 += 1) {
this.method7(depth-1);
}
for (int local14 = 0; local14<=1; local14 += 1) {
for (int local15 = 0; local15<=2; local15 += 1) {
for (int local16 = 0; local16<=0; local16 += 1) {
if (depth>=3) {
this.field1=this.field6;
}else {
if (depth>4) {
}
}
}
}
}
this.field2=this;
}
public void method8(Test10Class2 arg0, int depth) {
if (depth == 0) return;
arg0.field5.method7(depth-1);
}
}
public class Test10{
public static void main(String[] args) {
int inputValue = 10;
Benchmark.alloc(1);
Test10Lib.local1 = new Test10Class1();
Benchmark.alloc(2);
Test10Lib.local2 = new Test10Class1();
Benchmark.alloc(3);
Test10Lib.local3 = new Test10Class1();
Benchmark.alloc(4);
Test10Lib.local4 = new Test10Class2();
Benchmark.alloc(5);
Test10Lib.local5 = new Test10Class3();
Benchmark.alloc(6);
Test10Lib.local6 = new Test10Class3();
Test10Lib.local1.field1 = Test10Lib.local4;
Test10Lib.local1.field2 = Test10Lib.local5;
Test10Lib.local1.field3 = Test10Lib.local4;
Test10Lib.local2.field1 = Test10Lib.local4;
Test10Lib.local2.field2 = Test10Lib.local6;
Test10Lib.local2.field3 = Test10Lib.local4;
Test10Lib.local3.field1 = Test10Lib.local4;
Test10Lib.local3.field2 = Test10Lib.local6;
Test10Lib.local3.field3 = Test10Lib.local4;
Test10Lib.local4.field4 = Test10Lib.local5;
Test10Lib.local4.field5 = Test10Lib.local5;
Test10Lib.local4.field1 = Test10Lib.local4;
Test10Lib.local4.field2 = Test10Lib.local5;
Test10Lib.local4.field3 = Test10Lib.local4;
Test10Lib.local5.field6 = Test10Lib.local4;
Test10Lib.local5.field1 = Test10Lib.local4;
Test10Lib.local5.field2 = Test10Lib.local5;
Test10Lib.local5.field3 = Test10Lib.local4;
Test10Lib.local6.field6 = Test10Lib.local4;
Test10Lib.local6.field1 = Test10Lib.local4;
Test10Lib.local6.field2 = Test10Lib.local5;
Test10Lib.local6.field3 = Test10Lib.local4;
if (inputValue>=3) {
if (inputValue<3) {
for (int local17 = 0; local17<=0; local17 += 1) {
if (inputValue==4) {
for (int local18 = 0; local18<=0; local18 += 1) {
}
}else {
Test10Lib.local6.field3=Test10Lib.local3.field1;
}
}
}
}
for (int local19 = 0; local19<=0; local19 += 1) {
Test10Lib.local3.field2=Test10Lib.local5.field2.method6(3);
}
if (inputValue>2) {
Test10Lib.local2.field1.method1(3);
}else {
if (inputValue<=4) {
if (inputValue==3) {
for (int local20 = 0; local20<=0; local20 += 1) {
if (inputValue>=3) {
}
}
}else {
if (inputValue==1) {
for (int local21 = 0; local21<=0; local21 += 1) {
}
}
}
}
}
Test10Lib.local1=Test10Lib.local6.field3;
if (inputValue>=3) {
if (inputValue<=1) {
for (int local22 = 0; local22<=2; local22 += 1) {
for (int local23 = 0; local23<=1; local23 += 1) {
if (inputValue<2) {
}
}
}
}else {
if (inputValue>=4) {
Test10Lib.local1=Test10Lib.local6.field6;
}else {
Test10Lib.local2=Test10Lib.local1;
}
}
}else {
for (int local24 = 0; local24<=3; local24 += 1) {
if (inputValue>1) {
Test10Lib.local2.field1=Test10Lib.local3.field1.method5(Test10Lib.local5.field6,3);
}
}
}
Benchmark.test(1,Test10Lib.local1);
Benchmark.test(2,Test10Lib.local2);
Benchmark.test(3,Test10Lib.local3);
Benchmark.test(4,Test10Lib.local4);
Benchmark.test(5,Test10Lib.local5);
Benchmark.test(6,Test10Lib.local6);
Benchmark.test(7,Test10Lib.local1.field1);
Benchmark.test(8,Test10Lib.local1.field2);
Benchmark.test(9,Test10Lib.local1.field3);
Benchmark.test(10,Test10Lib.local2.field1);
Benchmark.test(11,Test10Lib.local2.field2);
Benchmark.test(12,Test10Lib.local2.field3);
Benchmark.test(13,Test10Lib.local3.field1);
Benchmark.test(14,Test10Lib.local3.field2);
Benchmark.test(15,Test10Lib.local3.field3);
Benchmark.test(16,Test10Lib.local4.field4);
Benchmark.test(17,Test10Lib.local4.field5);
Benchmark.test(18,Test10Lib.local4.field1);
Benchmark.test(19,Test10Lib.local4.field2);
Benchmark.test(20,Test10Lib.local4.field3);
Benchmark.test(21,Test10Lib.local5.field6);
Benchmark.test(22,Test10Lib.local5.field1);
Benchmark.test(23,Test10Lib.local5.field2);
Benchmark.test(24,Test10Lib.local5.field3);
Benchmark.test(25,Test10Lib.local6.field6);
Benchmark.test(26,Test10Lib.local6.field1);
Benchmark.test(27,Test10Lib.local6.field2);
Benchmark.test(28,Test10Lib.local6.field3);
Benchmark.print();
}
}
