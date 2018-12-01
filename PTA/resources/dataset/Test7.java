package dataset;

import benchmark.internal.Benchmark;
import benchmark.tool.BasicClass;
class Test7Lib{
public static Test7Class1 local1;
public static Test7Class1 local2;
public static Test7Class1 local3;
public static Test7Class1 local4;
public static Test7Class2 local5;
public static Test7Class2 local6;
public static Test7Class2 local7;
public static Test7Class2 local8;
public static Test7Class2 local9;
public static Test7Class3 local10;
public static Test7Class3 local11;
public static Test7Class3 local12;
}
class Test7Class1 extends BasicClass {
public Test7Class2 field1;
public Test7Class1 field2;
public void method1(Test7Class3 arg0, int depth) {
if (depth == 0) return;
for (int local13 = 0; local13<=0; local13 += 1) {
arg0.field6.method5(arg0,depth-1);
}
this.field2=arg0.field5;
}
}
class Test7Class2 extends Test7Class1 {
public Test7Class1 field3;
public Test7Class3 method2(Test7Class2 arg0, int depth) {
if (depth == 0) return Test7Lib.local10;
if (depth<=2) {
for (int local14 = 0; local14<=2; local14 += 1) {
arg0.field1=arg0;
}
}
if (depth==3) {
if (depth<2) {
for (int local15 = 0; local15<=1; local15 += 1) {
if (depth<=1) {
if (depth>1) {
}else {
}
}else {
for (int local16 = 0; local16<=2; local16 += 1) {
}
}
}
}
}
if (depth<2) {
if (depth>1) {
for (int local17 = 0; local17<=3; local17 += 1) {
for (int local18 = 0; local18<=2; local18 += 1) {
this.field3=arg0;
}
}
}else {
if (depth>1) {
if (depth<3) {
if (depth>2) {
}else {
}
}
}
}
}
return Test7Lib.local11;
}
}
class Test7Class3 extends Test7Class2 {
public Test7Class1 field4;
public Test7Class1 field5;
public Test7Class3 field6;
public static void method3(Test7Class3 arg0, Test7Class3 arg1, int depth) {
if (depth == 0) return;
for (int local19 = 0; local19<=2; local19 += 1) {
if (depth>=1) {
for (int local20 = 0; local20<=2; local20 += 1) {
if (depth<=3) {
arg1.field4=arg1.field6;
}else {
arg0.field1=arg1.field1;
}
}
}
}
arg1=arg1.field6;
arg0.method4(depth-1);
arg1.field6.method1(arg0,depth-1);
}
public void method4(int depth) {
if (depth == 0) return;
this.field6.method4(depth-1);
}
public static Test7Class2 method5(Test7Class2 arg0, int depth) {
if (depth == 0) return Test7Lib.local6;
return arg0.field1;
}
}
public class Test7{
public static void main(String[] args) {
int inputValue = 0;
Benchmark.alloc(1);
Test7Lib.local1 = new Test7Class1();
Benchmark.alloc(2);
Test7Lib.local2 = new Test7Class1();
Benchmark.alloc(3);
Test7Lib.local3 = new Test7Class1();
Benchmark.alloc(4);
Test7Lib.local4 = new Test7Class1();
Benchmark.alloc(5);
Test7Lib.local5 = new Test7Class2();
Benchmark.alloc(6);
Test7Lib.local6 = new Test7Class2();
Benchmark.alloc(7);
Test7Lib.local7 = new Test7Class2();
Benchmark.alloc(8);
Test7Lib.local8 = new Test7Class2();
Benchmark.alloc(9);
Test7Lib.local9 = new Test7Class2();
Benchmark.alloc(10);
Test7Lib.local10 = new Test7Class3();
Benchmark.alloc(11);
Test7Lib.local11 = new Test7Class3();
Benchmark.alloc(12);
Test7Lib.local12 = new Test7Class3();
Test7Lib.local1.field1 = Test7Lib.local6;
Test7Lib.local1.field2 = Test7Lib.local5;
Test7Lib.local2.field1 = Test7Lib.local10;
Test7Lib.local2.field2 = Test7Lib.local12;
Test7Lib.local3.field1 = Test7Lib.local7;
Test7Lib.local3.field2 = Test7Lib.local12;
Test7Lib.local4.field1 = Test7Lib.local11;
Test7Lib.local4.field2 = Test7Lib.local10;
Test7Lib.local5.field3 = Test7Lib.local10;
Test7Lib.local5.field1 = Test7Lib.local6;
Test7Lib.local5.field2 = Test7Lib.local2;
Test7Lib.local6.field3 = Test7Lib.local2;
Test7Lib.local6.field1 = Test7Lib.local9;
Test7Lib.local6.field2 = Test7Lib.local3;
Test7Lib.local7.field3 = Test7Lib.local11;
Test7Lib.local7.field1 = Test7Lib.local12;
Test7Lib.local7.field2 = Test7Lib.local3;
Test7Lib.local8.field3 = Test7Lib.local2;
Test7Lib.local8.field1 = Test7Lib.local8;
Test7Lib.local8.field2 = Test7Lib.local4;
Test7Lib.local9.field3 = Test7Lib.local12;
Test7Lib.local9.field1 = Test7Lib.local5;
Test7Lib.local9.field2 = Test7Lib.local7;
Test7Lib.local10.field4 = Test7Lib.local11;
Test7Lib.local10.field5 = Test7Lib.local1;
Test7Lib.local10.field6 = Test7Lib.local11;
Test7Lib.local10.field3 = Test7Lib.local6;
Test7Lib.local10.field1 = Test7Lib.local10;
Test7Lib.local10.field2 = Test7Lib.local1;
Test7Lib.local11.field4 = Test7Lib.local2;
Test7Lib.local11.field5 = Test7Lib.local7;
Test7Lib.local11.field6 = Test7Lib.local10;
Test7Lib.local11.field3 = Test7Lib.local1;
Test7Lib.local11.field1 = Test7Lib.local8;
Test7Lib.local11.field2 = Test7Lib.local4;
Test7Lib.local12.field4 = Test7Lib.local10;
Test7Lib.local12.field5 = Test7Lib.local3;
Test7Lib.local12.field6 = Test7Lib.local10;
Test7Lib.local12.field3 = Test7Lib.local9;
Test7Lib.local12.field1 = Test7Lib.local12;
Test7Lib.local12.field2 = Test7Lib.local10;
if (inputValue>=4) {
for (int local21 = 0; local21<=0; local21 += 1) {
for (int local22 = 0; local22<=0; local22 += 1) {
Test7Lib.local2=Test7Lib.local10.field4;
}
}
}
Test7Lib.local9.field2=Test7Lib.local11.method5(Test7Lib.local8.field1,3);
Test7Lib.local6.method2(Test7Lib.local7.field1,3);
if (inputValue==1) {
Test7Lib.local12.field4=Test7Lib.local12.field6.method5(Test7Lib.local6,3);
}else {
if (inputValue<3) {
if (inputValue<=2) {
if (inputValue>2) {
Test7Lib.local12.field5=Test7Lib.local11.method5(Test7Lib.local10.field6,3);
}else {
Test7Lib.local7=Test7Lib.local11;
}
}else {
if (inputValue>=3) {
if (inputValue>2) {
}
}
}
}else {
if (inputValue<=4) {
Test7Lib.local11.field3=Test7Lib.local10.field1;
}
}
}
Test7Lib.local10=Test7Lib.local10.field6;
Benchmark.test(1,Test7Lib.local1);
Benchmark.test(2,Test7Lib.local2);
Benchmark.test(3,Test7Lib.local3);
Benchmark.test(4,Test7Lib.local4);
Benchmark.test(5,Test7Lib.local5);
Benchmark.test(6,Test7Lib.local6);
Benchmark.test(7,Test7Lib.local7);
Benchmark.test(8,Test7Lib.local8);
Benchmark.test(9,Test7Lib.local9);
Benchmark.test(10,Test7Lib.local10);
Benchmark.test(11,Test7Lib.local11);
Benchmark.test(12,Test7Lib.local12);
Benchmark.test(13,Test7Lib.local1.field1);
Benchmark.test(14,Test7Lib.local1.field2);
Benchmark.test(15,Test7Lib.local2.field1);
Benchmark.test(16,Test7Lib.local2.field2);
Benchmark.test(17,Test7Lib.local3.field1);
Benchmark.test(18,Test7Lib.local3.field2);
Benchmark.test(19,Test7Lib.local4.field1);
Benchmark.test(20,Test7Lib.local4.field2);
Benchmark.test(21,Test7Lib.local5.field3);
Benchmark.test(22,Test7Lib.local5.field1);
Benchmark.test(23,Test7Lib.local5.field2);
Benchmark.test(24,Test7Lib.local6.field3);
Benchmark.test(25,Test7Lib.local6.field1);
Benchmark.test(26,Test7Lib.local6.field2);
Benchmark.test(27,Test7Lib.local7.field3);
Benchmark.test(28,Test7Lib.local7.field1);
Benchmark.test(29,Test7Lib.local7.field2);
Benchmark.test(30,Test7Lib.local8.field3);
Benchmark.test(31,Test7Lib.local8.field1);
Benchmark.test(32,Test7Lib.local8.field2);
Benchmark.test(33,Test7Lib.local9.field3);
Benchmark.test(34,Test7Lib.local9.field1);
Benchmark.test(35,Test7Lib.local9.field2);
Benchmark.test(36,Test7Lib.local10.field4);
Benchmark.test(37,Test7Lib.local10.field5);
Benchmark.test(38,Test7Lib.local10.field6);
Benchmark.test(39,Test7Lib.local10.field3);
Benchmark.test(40,Test7Lib.local10.field1);
Benchmark.test(41,Test7Lib.local10.field2);
Benchmark.test(42,Test7Lib.local11.field4);
Benchmark.test(43,Test7Lib.local11.field5);
Benchmark.test(44,Test7Lib.local11.field6);
Benchmark.test(45,Test7Lib.local11.field3);
Benchmark.test(46,Test7Lib.local11.field1);
Benchmark.test(47,Test7Lib.local11.field2);
Benchmark.test(48,Test7Lib.local12.field4);
Benchmark.test(49,Test7Lib.local12.field5);
Benchmark.test(50,Test7Lib.local12.field6);
Benchmark.test(51,Test7Lib.local12.field3);
Benchmark.test(52,Test7Lib.local12.field1);
Benchmark.test(53,Test7Lib.local12.field2);
Benchmark.print();
}
}
