package dataset;

import benchmark.internal.Benchmark;
import benchmark.tool.BasicClass;
class Test27Lib{
public static Test27Class1 local1;
public static Test27Class1 local2;
public static Test27Class1 local3;
public static Test27Class1 local4;
public static Test27Class2 local5;
public static Test27Class2 local6;
public static Test27Class3 local7;
public static Test27Class3 local8;
public static Test27Class3 local9;
public static Test27Class3 local10;
}
class Test27Class1 extends BasicClass {
public Test27Class2 field1;
public Test27Class3 field2;
public Test27Class2 field3;
public void method1(int depth) {
if (depth == 0) return;
}
public static void method2(int depth) {
if (depth == 0) return;
for (int local11 = 0; local11<=3; local11 += 1) {
if (depth<2) {
if (depth>4) {
if (depth<=3) {
for (int local12 = 0; local12<=1; local12 += 1) {
}
}
}
}else {
for (int local13 = 0; local13<=3; local13 += 1) {
for (int local14 = 0; local14<=0; local14 += 1) {
for (int local15 = 0; local15<=1; local15 += 1) {
}
}
}
}
}
}
public void method3(int depth) {
if (depth == 0) return;
for (int local16 = 0; local16<=3; local16 += 1) {
this.field2=this.field2;
}
}
public static Test27Class2 method4(int depth) {
if (depth == 0) return Test27Lib.local5;
return Test27Lib.local5;
}
}
class Test27Class2 extends Test27Class1 {
public Test27Class1 field4;
public void method5(Test27Class1 arg0, int depth) {
if (depth == 0) return;
}
public static void method6(int depth) {
if (depth == 0) return;
}
public static Test27Class1 method7(int depth) {
if (depth == 0) return Test27Lib.local2;
for (int local17 = 0; local17<=3; local17 += 1) {
for (int local18 = 0; local18<=3; local18 += 1) {
if (depth<3) {
if (depth==2) {
if (depth>4) {
}
}else {
if (depth==3) {
}else {
}
}
}else {
if (depth==1) {
if (depth==4) {
}
}else {
for (int local19 = 0; local19<=2; local19 += 1) {
}
}
}
}
}
return Test27Lib.local6;
}
}
class Test27Class3 extends Test27Class1 {
public Test27Class1 field5;
public Test27Class2 field6;
public void method8(int depth) {
if (depth == 0) return;
}
public static Test27Class3 method9(Test27Class2 arg0, Test27Class3 arg1, int depth) {
if (depth == 0) return Test27Lib.local9;
return arg1;
}
public static Test27Class3 method10(Test27Class3 arg0, Test27Class3 arg1, int depth) {
if (depth == 0) return Test27Lib.local10;
return arg1;
}
}
public class Test27{
public static void main(String[] args) {
int inputValue = 0;
Benchmark.alloc(1);
Test27Lib.local1 = new Test27Class1();
Benchmark.alloc(2);
Test27Lib.local2 = new Test27Class1();
Benchmark.alloc(3);
Test27Lib.local3 = new Test27Class1();
Benchmark.alloc(4);
Test27Lib.local4 = new Test27Class1();
Benchmark.alloc(5);
Test27Lib.local5 = new Test27Class2();
Benchmark.alloc(6);
Test27Lib.local6 = new Test27Class2();
Benchmark.alloc(7);
Test27Lib.local7 = new Test27Class3();
Benchmark.alloc(8);
Test27Lib.local8 = new Test27Class3();
Benchmark.alloc(9);
Test27Lib.local9 = new Test27Class3();
Benchmark.alloc(10);
Test27Lib.local10 = new Test27Class3();
Test27Lib.local1.field1 = Test27Lib.local5;
Test27Lib.local1.field2 = Test27Lib.local8;
Test27Lib.local1.field3 = Test27Lib.local6;
Test27Lib.local2.field1 = Test27Lib.local5;
Test27Lib.local2.field2 = Test27Lib.local10;
Test27Lib.local2.field3 = Test27Lib.local5;
Test27Lib.local3.field1 = Test27Lib.local6;
Test27Lib.local3.field2 = Test27Lib.local7;
Test27Lib.local3.field3 = Test27Lib.local5;
Test27Lib.local4.field1 = Test27Lib.local6;
Test27Lib.local4.field2 = Test27Lib.local10;
Test27Lib.local4.field3 = Test27Lib.local5;
Test27Lib.local5.field4 = Test27Lib.local5;
Test27Lib.local5.field1 = Test27Lib.local6;
Test27Lib.local5.field2 = Test27Lib.local8;
Test27Lib.local5.field3 = Test27Lib.local5;
Test27Lib.local6.field4 = Test27Lib.local9;
Test27Lib.local6.field1 = Test27Lib.local6;
Test27Lib.local6.field2 = Test27Lib.local9;
Test27Lib.local6.field3 = Test27Lib.local6;
Test27Lib.local7.field5 = Test27Lib.local4;
Test27Lib.local7.field6 = Test27Lib.local5;
Test27Lib.local7.field1 = Test27Lib.local5;
Test27Lib.local7.field2 = Test27Lib.local8;
Test27Lib.local7.field3 = Test27Lib.local6;
Test27Lib.local8.field5 = Test27Lib.local5;
Test27Lib.local8.field6 = Test27Lib.local5;
Test27Lib.local8.field1 = Test27Lib.local5;
Test27Lib.local8.field2 = Test27Lib.local7;
Test27Lib.local8.field3 = Test27Lib.local6;
Test27Lib.local9.field5 = Test27Lib.local5;
Test27Lib.local9.field6 = Test27Lib.local5;
Test27Lib.local9.field1 = Test27Lib.local5;
Test27Lib.local9.field2 = Test27Lib.local8;
Test27Lib.local9.field3 = Test27Lib.local6;
Test27Lib.local10.field5 = Test27Lib.local4;
Test27Lib.local10.field6 = Test27Lib.local5;
Test27Lib.local10.field1 = Test27Lib.local6;
Test27Lib.local10.field2 = Test27Lib.local8;
Test27Lib.local10.field3 = Test27Lib.local6;
Test27Lib.local9.field2.method8(3);
Test27Lib.local4.method1(3);
Test27Lib.local8.method9(Test27Lib.local9.field3,Test27Lib.local6.field2,3);
Benchmark.test(1,Test27Lib.local1);
Benchmark.test(2,Test27Lib.local2);
Benchmark.test(3,Test27Lib.local3);
Benchmark.test(4,Test27Lib.local4);
Benchmark.test(5,Test27Lib.local5);
Benchmark.test(6,Test27Lib.local6);
Benchmark.test(7,Test27Lib.local7);
Benchmark.test(8,Test27Lib.local8);
Benchmark.test(9,Test27Lib.local9);
Benchmark.test(10,Test27Lib.local10);
Benchmark.test(11,Test27Lib.local1.field1);
Benchmark.test(12,Test27Lib.local1.field2);
Benchmark.test(13,Test27Lib.local1.field3);
Benchmark.test(14,Test27Lib.local2.field1);
Benchmark.test(15,Test27Lib.local2.field2);
Benchmark.test(16,Test27Lib.local2.field3);
Benchmark.test(17,Test27Lib.local3.field1);
Benchmark.test(18,Test27Lib.local3.field2);
Benchmark.test(19,Test27Lib.local3.field3);
Benchmark.test(20,Test27Lib.local4.field1);
Benchmark.test(21,Test27Lib.local4.field2);
Benchmark.test(22,Test27Lib.local4.field3);
Benchmark.test(23,Test27Lib.local5.field4);
Benchmark.test(24,Test27Lib.local5.field1);
Benchmark.test(25,Test27Lib.local5.field2);
Benchmark.test(26,Test27Lib.local5.field3);
Benchmark.test(27,Test27Lib.local6.field4);
Benchmark.test(28,Test27Lib.local6.field1);
Benchmark.test(29,Test27Lib.local6.field2);
Benchmark.test(30,Test27Lib.local6.field3);
Benchmark.test(31,Test27Lib.local7.field5);
Benchmark.test(32,Test27Lib.local7.field6);
Benchmark.test(33,Test27Lib.local7.field1);
Benchmark.test(34,Test27Lib.local7.field2);
Benchmark.test(35,Test27Lib.local7.field3);
Benchmark.test(36,Test27Lib.local8.field5);
Benchmark.test(37,Test27Lib.local8.field6);
Benchmark.test(38,Test27Lib.local8.field1);
Benchmark.test(39,Test27Lib.local8.field2);
Benchmark.test(40,Test27Lib.local8.field3);
Benchmark.test(41,Test27Lib.local9.field5);
Benchmark.test(42,Test27Lib.local9.field6);
Benchmark.test(43,Test27Lib.local9.field1);
Benchmark.test(44,Test27Lib.local9.field2);
Benchmark.test(45,Test27Lib.local9.field3);
Benchmark.test(46,Test27Lib.local10.field5);
Benchmark.test(47,Test27Lib.local10.field6);
Benchmark.test(48,Test27Lib.local10.field1);
Benchmark.test(49,Test27Lib.local10.field2);
Benchmark.test(50,Test27Lib.local10.field3);
Benchmark.print();
}
}
