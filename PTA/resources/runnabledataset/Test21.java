package runnabledataset;

import benchmark.tool.Benchmark;
import benchmark.tool.BasicClass;
class Test21Lib{
public static Test21Class1 local1;
public static Test21Class1 local2;
public static Test21Class1 local3;
public static Test21Class1 local4;
public static Test21Class2 local5;
public static Test21Class2 local6;
public static Test21Class2 local7;
public static Test21Class2 local8;
public static Test21Class3 local9;
}
class Test21Class1 extends BasicClass {
public Test21Class3 field1;
public static Test21Class1 method1(int depth) {
if (depth == 0) return Test21Lib.local7;
for (int local10 = 0; local10<=0; local10 += 1) {
for (int local11 = 0; local11<=0; local11 += 1) {
for (int local12 = 0; local12<=1; local12 += 1) {
if (depth>=2) {
for (int local13 = 0; local13<=3; local13 += 1) {
}
}else {
for (int local14 = 0; local14<=2; local14 += 1) {
}
}
}
}
}
return Test21Lib.local7;
}
public static Test21Class3 method2(int depth) {
if (depth == 0) return Test21Lib.local9;
for (int local15 = 0; local15<=0; local15 += 1) {
if (depth>1) {
for (int local16 = 0; local16<=2; local16 += 1) {
if (depth>=3) {
if (depth==4) {
}else {
}
}else {
for (int local17 = 0; local17<=0; local17 += 1) {
}
}
}
}else {
for (int local18 = 0; local18<=3; local18 += 1) {
if (depth<1) {
for (int local19 = 0; local19<=2; local19 += 1) {
}
}else {
for (int local20 = 0; local20<=0; local20 += 1) {
}
}
}
}
}
return Test21Lib.local9;
}
}
class Test21Class2 extends Test21Class1 {
public Test21Class3 field2;
public Test21Class1 field3;
public Test21Class2 field4;
public Test21Class2 method3(int depth) {
if (depth == 0) return Test21Lib.local5;
if (depth<=3) {
this.field3=this.field4.method3(depth-1);
}
return this.field1;
}
public static Test21Class3 method4(Test21Class2 arg0, int depth) {
if (depth == 0) return Test21Lib.local9;
arg0=arg0.field4.method5(depth-1);
return arg0.field2;
}
public static Test21Class3 method5(int depth) {
if (depth == 0) return Test21Lib.local9;
return Test21Lib.local9;
}
public static void method6(Test21Class1 arg0, Test21Class1 arg1, int depth) {
if (depth == 0) return;
for (int local21 = 0; local21<=2; local21 += 1) {
if (depth==4) {
arg1.field1=arg1.field1.method5(depth-1);
}
}
}
}
class Test21Class3 extends Test21Class2 {
public Test21Class2 field5;
public static void method7(Test21Class1 arg0, int depth) {
if (depth == 0) return;
for (int local22 = 0; local22<=0; local22 += 1) {
for (int local23 = 0; local23<=0; local23 += 1) {
if (depth==4) {
for (int local24 = 0; local24<=1; local24 += 1) {
for (int local25 = 0; local25<=3; local25 += 1) {
}
}
}else {
if (depth<2) {
for (int local26 = 0; local26<=1; local26 += 1) {
}
}else {
for (int local27 = 0; local27<=3; local27 += 1) {
}
}
}
}
}
}
}
public class Test21{
public static void main(String[] args) {
int inputValue = 10;
Benchmark.alloc(1);
Test21Lib.local1 = new Test21Class1();
Benchmark.alloc(2);
Test21Lib.local2 = new Test21Class1();
Benchmark.alloc(3);
Test21Lib.local3 = new Test21Class1();
Benchmark.alloc(4);
Test21Lib.local4 = new Test21Class1();
Benchmark.alloc(5);
Test21Lib.local5 = new Test21Class2();
Benchmark.alloc(6);
Test21Lib.local6 = new Test21Class2();
Benchmark.alloc(7);
Test21Lib.local7 = new Test21Class2();
Benchmark.alloc(8);
Test21Lib.local8 = new Test21Class2();
Benchmark.alloc(9);
Test21Lib.local9 = new Test21Class3();
Test21Lib.local1.field1 = Test21Lib.local9;
Test21Lib.local2.field1 = Test21Lib.local9;
Test21Lib.local3.field1 = Test21Lib.local9;
Test21Lib.local4.field1 = Test21Lib.local9;
Test21Lib.local5.field2 = Test21Lib.local9;
Test21Lib.local5.field3 = Test21Lib.local6;
Test21Lib.local5.field4 = Test21Lib.local8;
Test21Lib.local5.field1 = Test21Lib.local9;
Test21Lib.local6.field2 = Test21Lib.local9;
Test21Lib.local6.field3 = Test21Lib.local8;
Test21Lib.local6.field4 = Test21Lib.local8;
Test21Lib.local6.field1 = Test21Lib.local9;
Test21Lib.local7.field2 = Test21Lib.local9;
Test21Lib.local7.field3 = Test21Lib.local6;
Test21Lib.local7.field4 = Test21Lib.local7;
Test21Lib.local7.field1 = Test21Lib.local9;
Test21Lib.local8.field2 = Test21Lib.local9;
Test21Lib.local8.field3 = Test21Lib.local3;
Test21Lib.local8.field4 = Test21Lib.local8;
Test21Lib.local8.field1 = Test21Lib.local9;
Test21Lib.local9.field5 = Test21Lib.local8;
Test21Lib.local9.field2 = Test21Lib.local9;
Test21Lib.local9.field3 = Test21Lib.local7;
Test21Lib.local9.field4 = Test21Lib.local5;
Test21Lib.local9.field1 = Test21Lib.local9;
Test21Lib.local5.field3=Test21Lib.local9;
for (int local28 = 0; local28<=2; local28 += 1) {
Test21Lib.local8.field1.method4(Test21Lib.local8.field4,3);
}
Test21Lib.local9.field4=Test21Lib.local5;
Benchmark.test(1,Test21Lib.local1);
Benchmark.test(2,Test21Lib.local2);
Benchmark.test(3,Test21Lib.local3);
Benchmark.test(4,Test21Lib.local4);
Benchmark.test(5,Test21Lib.local5);
Benchmark.test(6,Test21Lib.local6);
Benchmark.test(7,Test21Lib.local7);
Benchmark.test(8,Test21Lib.local8);
Benchmark.test(9,Test21Lib.local9);
Benchmark.test(10,Test21Lib.local1.field1);
Benchmark.test(11,Test21Lib.local2.field1);
Benchmark.test(12,Test21Lib.local3.field1);
Benchmark.test(13,Test21Lib.local4.field1);
Benchmark.test(14,Test21Lib.local5.field2);
Benchmark.test(15,Test21Lib.local5.field3);
Benchmark.test(16,Test21Lib.local5.field4);
Benchmark.test(17,Test21Lib.local5.field1);
Benchmark.test(18,Test21Lib.local6.field2);
Benchmark.test(19,Test21Lib.local6.field3);
Benchmark.test(20,Test21Lib.local6.field4);
Benchmark.test(21,Test21Lib.local6.field1);
Benchmark.test(22,Test21Lib.local7.field2);
Benchmark.test(23,Test21Lib.local7.field3);
Benchmark.test(24,Test21Lib.local7.field4);
Benchmark.test(25,Test21Lib.local7.field1);
Benchmark.test(26,Test21Lib.local8.field2);
Benchmark.test(27,Test21Lib.local8.field3);
Benchmark.test(28,Test21Lib.local8.field4);
Benchmark.test(29,Test21Lib.local8.field1);
Benchmark.test(30,Test21Lib.local9.field5);
Benchmark.test(31,Test21Lib.local9.field2);
Benchmark.test(32,Test21Lib.local9.field3);
Benchmark.test(33,Test21Lib.local9.field4);
Benchmark.test(34,Test21Lib.local9.field1);
Benchmark.print();
}
}
