package dataset;

import benchmark.internal.Benchmark;
import benchmark.tool.BasicClass;
class Test14Lib{
public static Test14Class1 local1;
public static Test14Class1 local2;
public static Test14Class1 local3;
public static Test14Class2 local4;
public static Test14Class2 local5;
public static Test14Class3 local6;
public static Test14Class3 local7;
}
class Test14Class1 extends BasicClass {
public Test14Class2 field1;
public Test14Class1 field2;
public void method1(Test14Class3 arg0, int depth) {
if (depth == 0) return;
if (depth<=4) {
if (depth<3) {
arg0.field3.method5(arg0.field3,arg0,depth-1);
}else {
for (int local8 = 0; local8<=0; local8 += 1) {
arg0.field4=arg0.field3;
}
}
}else {
arg0.field2=arg0.field1.method2(arg0,depth-1);
}
if (depth<1) {
if (depth<=2) {
for (int local9 = 0; local9<=3; local9 += 1) {
if (depth==4) {
if (depth>=3) {
}else {
}
}else {
arg0.field4=arg0.field3.method3(depth-1);
}
}
}else {
if (depth<=1) {
arg0.field3=arg0.field3;
}else {
if (depth<1) {
arg0.field2=arg0.field1;
}
}
}
}
}
}
class Test14Class2 extends Test14Class1 {
public Test14Class3 field3;
public static Test14Class1 method2(Test14Class3 arg0, int depth) {
if (depth == 0) return Test14Lib.local4;
for (int local10 = 0; local10<=2; local10 += 1) {
arg0=arg0.field3;
}
arg0.field4.method2(arg0,depth-1);
return arg0.field1;
}
public static Test14Class2 method3(int depth) {
if (depth == 0) return Test14Lib.local6;
if (depth<4) {
if (depth<=1) {
if (depth<2) {
for (int local11 = 0; local11<=3; local11 += 1) {
if (depth<=3) {
}else {
}
}
}else {
for (int local12 = 0; local12<=2; local12 += 1) {
if (depth<4) {
}else {
}
}
}
}else {
if (depth>=3) {
if (depth==4) {
for (int local13 = 0; local13<=2; local13 += 1) {
}
}
}
}
}else {
if (depth<=2) {
if (depth<=4) {
if (depth>1) {
for (int local14 = 0; local14<=1; local14 += 1) {
}
}
}else {
if (depth<=3) {
for (int local15 = 0; local15<=1; local15 += 1) {
}
}
}
}
}
for (int local16 = 0; local16<=1; local16 += 1) {
for (int local17 = 0; local17<=3; local17 += 1) {
if (depth>4) {
if (depth>2) {
for (int local18 = 0; local18<=2; local18 += 1) {
}
}
}else {
if (depth<=1) {
if (depth<1) {
}
}else {
if (depth>3) {
}
}
}
}
}
return Test14Lib.local4;
}
public Test14Class1 method4(Test14Class2 arg0, int depth) {
if (depth == 0) return Test14Lib.local2;
return this;
}
}
class Test14Class3 extends Test14Class2 {
public Test14Class2 field4;
public Test14Class2 field5;
public static void method5(Test14Class2 arg0, Test14Class2 arg1, int depth) {
if (depth == 0) return;
for (int local19 = 0; local19<=0; local19 += 1) {
arg1=arg0.field3.method3(depth-1);
}
arg1.field2.method1(arg0.field3,depth-1);
}
}
public class Test14{
public static void main(String[] args) {
int inputValue = 0;
Benchmark.alloc(1);
Test14Lib.local1 = new Test14Class1();
Benchmark.alloc(2);
Test14Lib.local2 = new Test14Class1();
Benchmark.alloc(3);
Test14Lib.local3 = new Test14Class1();
Benchmark.alloc(4);
Test14Lib.local4 = new Test14Class2();
Benchmark.alloc(5);
Test14Lib.local5 = new Test14Class2();
Benchmark.alloc(6);
Test14Lib.local6 = new Test14Class3();
Benchmark.alloc(7);
Test14Lib.local7 = new Test14Class3();
Test14Lib.local1.field1 = Test14Lib.local7;
Test14Lib.local1.field2 = Test14Lib.local2;
Test14Lib.local2.field1 = Test14Lib.local7;
Test14Lib.local2.field2 = Test14Lib.local4;
Test14Lib.local3.field1 = Test14Lib.local6;
Test14Lib.local3.field2 = Test14Lib.local2;
Test14Lib.local4.field3 = Test14Lib.local7;
Test14Lib.local4.field1 = Test14Lib.local4;
Test14Lib.local4.field2 = Test14Lib.local6;
Test14Lib.local5.field3 = Test14Lib.local7;
Test14Lib.local5.field1 = Test14Lib.local7;
Test14Lib.local5.field2 = Test14Lib.local1;
Test14Lib.local6.field4 = Test14Lib.local6;
Test14Lib.local6.field5 = Test14Lib.local4;
Test14Lib.local6.field3 = Test14Lib.local7;
Test14Lib.local6.field1 = Test14Lib.local6;
Test14Lib.local6.field2 = Test14Lib.local2;
Test14Lib.local7.field4 = Test14Lib.local5;
Test14Lib.local7.field5 = Test14Lib.local6;
Test14Lib.local7.field3 = Test14Lib.local6;
Test14Lib.local7.field1 = Test14Lib.local5;
Test14Lib.local7.field2 = Test14Lib.local2;
Test14Lib.local5.field1.method1(Test14Lib.local5.field3,3);
Test14Lib.local4.field1.method2(Test14Lib.local7.field3,3);
if (inputValue<=1) {
Test14Lib.local5.field3=Test14Lib.local6;
}else {
Test14Lib.local6.field3.method3(3);
}
Test14Lib.local6.field2=Test14Lib.local5.field3.method3(3);
Test14Lib.local7.field2=Test14Lib.local5.field3;
Benchmark.test(1,Test14Lib.local1);
Benchmark.test(2,Test14Lib.local2);
Benchmark.test(3,Test14Lib.local3);
Benchmark.test(4,Test14Lib.local4);
Benchmark.test(5,Test14Lib.local5);
Benchmark.test(6,Test14Lib.local6);
Benchmark.test(7,Test14Lib.local7);
Benchmark.test(8,Test14Lib.local1.field1);
Benchmark.test(9,Test14Lib.local1.field2);
Benchmark.test(10,Test14Lib.local2.field1);
Benchmark.test(11,Test14Lib.local2.field2);
Benchmark.test(12,Test14Lib.local3.field1);
Benchmark.test(13,Test14Lib.local3.field2);
Benchmark.test(14,Test14Lib.local4.field3);
Benchmark.test(15,Test14Lib.local4.field1);
Benchmark.test(16,Test14Lib.local4.field2);
Benchmark.test(17,Test14Lib.local5.field3);
Benchmark.test(18,Test14Lib.local5.field1);
Benchmark.test(19,Test14Lib.local5.field2);
Benchmark.test(20,Test14Lib.local6.field4);
Benchmark.test(21,Test14Lib.local6.field5);
Benchmark.test(22,Test14Lib.local6.field3);
Benchmark.test(23,Test14Lib.local6.field1);
Benchmark.test(24,Test14Lib.local6.field2);
Benchmark.test(25,Test14Lib.local7.field4);
Benchmark.test(26,Test14Lib.local7.field5);
Benchmark.test(27,Test14Lib.local7.field3);
Benchmark.test(28,Test14Lib.local7.field1);
Benchmark.test(29,Test14Lib.local7.field2);
Benchmark.print();
}
}
