package dataset;

import benchmark.internal.Benchmark;
import benchmark.tool.BasicClass;
class Test6Lib{
public static Test6Class1 local1;
public static Test6Class1 local2;
public static Test6Class1 local3;
public static Test6Class2 local4;
public static Test6Class2 local5;
public static Test6Class3 local6;
public static Test6Class3 local7;
public static Test6Class3 local8;
public static Test6Class3 local9;
}
class Test6Class1 extends BasicClass {
public Test6Class3 field1;
public Test6Class2 field2;
public Test6Class3 field3;
public static Test6Class1 method1(Test6Class3 arg0, int depth) {
if (depth == 0) return Test6Lib.local9;
arg0=arg0.field3;
arg0.field7=arg0.field7;
arg0.field8=arg0.field1;
return arg0.field1;
}
public void method2(Test6Class1 arg0, Test6Class3 arg1, int depth) {
if (depth == 0) return;
arg1.field7=this.field2;
this.field3.method6(depth-1);
for (int local10 = 0; local10<=1; local10 += 1) {
arg0.field2=arg1.field7;
}
}
}
class Test6Class2 extends Test6Class1 {
public Test6Class2 field4;
public Test6Class1 field5;
public Test6Class1 field6;
public void method3(int depth) {
if (depth == 0) return;
if (depth>2) {
for (int local11 = 0; local11<=0; local11 += 1) {
this.field4=this.field4;
}
}
for (int local12 = 0; local12<=3; local12 += 1) {
this.field6.method1(this.field1,depth-1);
}
this.field3=this.field1;
this.method2(this.field1,this.field1,depth-1);
}
public static Test6Class2 method4(Test6Class3 arg0, int depth) {
if (depth == 0) return Test6Lib.local4;
if (depth>3) {
if (depth>=4) {
if (depth>1) {
if (depth==1) {
for (int local13 = 0; local13<=1; local13 += 1) {
}
}else {
arg0.field1.method6(depth-1);
}
}
}
}
for (int local14 = 0; local14<=1; local14 += 1) {
if (depth<=3) {
for (int local15 = 0; local15<=3; local15 += 1) {
if (depth>=1) {
arg0.field8=arg0.field7;
}else {
if (depth>=3) {
}else {
}
}
}
}else {
arg0.field1=arg0;
}
}
return arg0.field2;
}
public void method5(Test6Class3 arg0, int depth) {
if (depth == 0) return;
if (depth<4) {
this.field2=arg0.field2;
}else {
for (int local16 = 0; local16<=3; local16 += 1) {
arg0.field7.method2(arg0.field3,this.field1,depth-1);
}
}
}
}
class Test6Class3 extends Test6Class1 {
public Test6Class2 field7;
public Test6Class1 field8;
public static void method6(int depth) {
if (depth == 0) return;
}
}
public class Test6{
public static void main(String[] args) {
int inputValue = 0;
Benchmark.alloc(1);
Test6Lib.local1 = new Test6Class1();
Benchmark.alloc(2);
Test6Lib.local2 = new Test6Class1();
Benchmark.alloc(3);
Test6Lib.local3 = new Test6Class1();
Benchmark.alloc(4);
Test6Lib.local4 = new Test6Class2();
Benchmark.alloc(5);
Test6Lib.local5 = new Test6Class2();
Benchmark.alloc(6);
Test6Lib.local6 = new Test6Class3();
Benchmark.alloc(7);
Test6Lib.local7 = new Test6Class3();
Benchmark.alloc(8);
Test6Lib.local8 = new Test6Class3();
Benchmark.alloc(9);
Test6Lib.local9 = new Test6Class3();
Test6Lib.local1.field1 = Test6Lib.local7;
Test6Lib.local1.field2 = Test6Lib.local5;
Test6Lib.local1.field3 = Test6Lib.local6;
Test6Lib.local2.field1 = Test6Lib.local6;
Test6Lib.local2.field2 = Test6Lib.local5;
Test6Lib.local2.field3 = Test6Lib.local6;
Test6Lib.local3.field1 = Test6Lib.local6;
Test6Lib.local3.field2 = Test6Lib.local5;
Test6Lib.local3.field3 = Test6Lib.local9;
Test6Lib.local4.field4 = Test6Lib.local5;
Test6Lib.local4.field5 = Test6Lib.local5;
Test6Lib.local4.field6 = Test6Lib.local1;
Test6Lib.local4.field1 = Test6Lib.local8;
Test6Lib.local4.field2 = Test6Lib.local4;
Test6Lib.local4.field3 = Test6Lib.local8;
Test6Lib.local5.field4 = Test6Lib.local4;
Test6Lib.local5.field5 = Test6Lib.local2;
Test6Lib.local5.field6 = Test6Lib.local4;
Test6Lib.local5.field1 = Test6Lib.local7;
Test6Lib.local5.field2 = Test6Lib.local4;
Test6Lib.local5.field3 = Test6Lib.local8;
Test6Lib.local6.field7 = Test6Lib.local5;
Test6Lib.local6.field8 = Test6Lib.local7;
Test6Lib.local6.field1 = Test6Lib.local6;
Test6Lib.local6.field2 = Test6Lib.local5;
Test6Lib.local6.field3 = Test6Lib.local6;
Test6Lib.local7.field7 = Test6Lib.local4;
Test6Lib.local7.field8 = Test6Lib.local9;
Test6Lib.local7.field1 = Test6Lib.local8;
Test6Lib.local7.field2 = Test6Lib.local5;
Test6Lib.local7.field3 = Test6Lib.local7;
Test6Lib.local8.field7 = Test6Lib.local4;
Test6Lib.local8.field8 = Test6Lib.local1;
Test6Lib.local8.field1 = Test6Lib.local6;
Test6Lib.local8.field2 = Test6Lib.local5;
Test6Lib.local8.field3 = Test6Lib.local9;
Test6Lib.local9.field7 = Test6Lib.local4;
Test6Lib.local9.field8 = Test6Lib.local4;
Test6Lib.local9.field1 = Test6Lib.local9;
Test6Lib.local9.field2 = Test6Lib.local5;
Test6Lib.local9.field3 = Test6Lib.local8;
for (int local17 = 0; local17<=1; local17 += 1) {
if (inputValue>2) {
for (int local18 = 0; local18<=1; local18 += 1) {
Test6Lib.local4.field2=Test6Lib.local7.field7;
}
}
}
Test6Lib.local9.field8.method2(Test6Lib.local1.field1,Test6Lib.local7,3);
if (inputValue>=1) {
if (inputValue>=3) {
Test6Lib.local8.field7=Test6Lib.local2.field2;
}
}else {
Test6Lib.local3.field3.method2(Test6Lib.local3.field3,Test6Lib.local8.field1,3);
}
Test6Lib.local4.field2=Test6Lib.local5.field2;
Test6Lib.local2.field3.method6(3);
Benchmark.test(1,Test6Lib.local1);
Benchmark.test(2,Test6Lib.local2);
Benchmark.test(3,Test6Lib.local3);
Benchmark.test(4,Test6Lib.local4);
Benchmark.test(5,Test6Lib.local5);
Benchmark.test(6,Test6Lib.local6);
Benchmark.test(7,Test6Lib.local7);
Benchmark.test(8,Test6Lib.local8);
Benchmark.test(9,Test6Lib.local9);
Benchmark.test(10,Test6Lib.local1.field1);
Benchmark.test(11,Test6Lib.local1.field2);
Benchmark.test(12,Test6Lib.local1.field3);
Benchmark.test(13,Test6Lib.local2.field1);
Benchmark.test(14,Test6Lib.local2.field2);
Benchmark.test(15,Test6Lib.local2.field3);
Benchmark.test(16,Test6Lib.local3.field1);
Benchmark.test(17,Test6Lib.local3.field2);
Benchmark.test(18,Test6Lib.local3.field3);
Benchmark.test(19,Test6Lib.local4.field4);
Benchmark.test(20,Test6Lib.local4.field5);
Benchmark.test(21,Test6Lib.local4.field6);
Benchmark.test(22,Test6Lib.local4.field1);
Benchmark.test(23,Test6Lib.local4.field2);
Benchmark.test(24,Test6Lib.local4.field3);
Benchmark.test(25,Test6Lib.local5.field4);
Benchmark.test(26,Test6Lib.local5.field5);
Benchmark.test(27,Test6Lib.local5.field6);
Benchmark.test(28,Test6Lib.local5.field1);
Benchmark.test(29,Test6Lib.local5.field2);
Benchmark.test(30,Test6Lib.local5.field3);
Benchmark.test(31,Test6Lib.local6.field7);
Benchmark.test(32,Test6Lib.local6.field8);
Benchmark.test(33,Test6Lib.local6.field1);
Benchmark.test(34,Test6Lib.local6.field2);
Benchmark.test(35,Test6Lib.local6.field3);
Benchmark.test(36,Test6Lib.local7.field7);
Benchmark.test(37,Test6Lib.local7.field8);
Benchmark.test(38,Test6Lib.local7.field1);
Benchmark.test(39,Test6Lib.local7.field2);
Benchmark.test(40,Test6Lib.local7.field3);
Benchmark.test(41,Test6Lib.local8.field7);
Benchmark.test(42,Test6Lib.local8.field8);
Benchmark.test(43,Test6Lib.local8.field1);
Benchmark.test(44,Test6Lib.local8.field2);
Benchmark.test(45,Test6Lib.local8.field3);
Benchmark.test(46,Test6Lib.local9.field7);
Benchmark.test(47,Test6Lib.local9.field8);
Benchmark.test(48,Test6Lib.local9.field1);
Benchmark.test(49,Test6Lib.local9.field2);
Benchmark.test(50,Test6Lib.local9.field3);
Benchmark.print();
}
}
