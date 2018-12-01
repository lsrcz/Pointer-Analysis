package dataset;

import benchmark.internal.Benchmark;
import benchmark.tool.BasicClass;
class Test33Lib{
public static Test33Class1 local1;
public static Test33Class1 local2;
public static Test33Class2 local3;
public static Test33Class2 local4;
public static Test33Class2 local5;
public static Test33Class3 local6;
public static Test33Class3 local7;
public static Test33Class3 local8;
}
class Test33Class1 extends BasicClass {
public Test33Class1 field1;
public Test33Class2 field2;
public Test33Class2 field3;
public Test33Class1 field4;
public static void method1(int depth) {
if (depth == 0) return;
for (int local9 = 0; local9<=3; local9 += 1) {
if (depth>3) {
if (depth<=1) {
if (depth==2) {
if (depth<3) {
}else {
}
}else {
for (int local10 = 0; local10<=2; local10 += 1) {
}
}
}
}else {
for (int local11 = 0; local11<=1; local11 += 1) {
for (int local12 = 0; local12<=3; local12 += 1) {
for (int local13 = 0; local13<=3; local13 += 1) {
}
}
}
}
}
}
public void method2(Test33Class3 arg0, int depth) {
if (depth == 0) return;
arg0.field2.field2.field2.method2(arg0,depth-1);
}
public static void method3(int depth) {
if (depth == 0) return;
for (int local14 = 0; local14<=0; local14 += 1) {
if (depth>=2) {
for (int local15 = 0; local15<=3; local15 += 1) {
if (depth>1) {
if (depth>1) {
}else {
}
}else {
if (depth>=2) {
}
}
}
}
}
}
}
class Test33Class2 extends Test33Class1 {
public Test33Class2 field5;
public Test33Class2 field6;
public static Test33Class1 method4(int depth) {
if (depth == 0) return Test33Lib.local3;
if (depth>=1) {
for (int local16 = 0; local16<=0; local16 += 1) {
for (int local17 = 0; local17<=0; local17 += 1) {
for (int local18 = 0; local18<=1; local18 += 1) {
for (int local19 = 0; local19<=3; local19 += 1) {
}
}
}
}
}
return Test33Lib.local8;
}
public static void method5(int depth) {
if (depth == 0) return;
if (depth>4) {
if (depth==3) {
if (depth<1) {
if (depth==2) {
for (int local20 = 0; local20<=0; local20 += 1) {
}
}
}
}
}else {
for (int local21 = 0; local21<=0; local21 += 1) {
if (depth<4) {
if (depth>=1) {
if (depth<=2) {
}
}
}else {
for (int local22 = 0; local22<=3; local22 += 1) {
for (int local23 = 0; local23<=0; local23 += 1) {
}
}
}
}
}
}
public Test33Class3 method6(Test33Class3 arg0, int depth) {
if (depth == 0) return Test33Lib.local7;
return arg0;
}
}
class Test33Class3 extends Test33Class2 {
public Test33Class2 field7;
public Test33Class1 field8;
public Test33Class2 field9;
public Test33Class2 field10;
public static Test33Class2 method7(Test33Class2 arg0, int depth) {
if (depth == 0) return Test33Lib.local5;
if (depth>2) {
arg0.field5.field2.field1=arg0.field3.field1.field3;
}
return arg0.field6.field2;
}
public Test33Class3 method8(Test33Class1 arg0, Test33Class1 arg1, int depth) {
if (depth == 0) return Test33Lib.local6;
this.field2.field4=this.field5.field5.field3;
return this;
}
public void method9(int depth) {
if (depth == 0) return;
if (depth>1) {
this.field3.field4=this.field7.field5.field1;
}else {
this.field3.field6.field1=this.field1.field2.field2;
}
}
}
public class Test33{
public static void main(String[] args) {
int inputValue = 0;
Benchmark.alloc(1);
Test33Lib.local1 = new Test33Class1();
Benchmark.alloc(2);
Test33Lib.local2 = new Test33Class1();
Benchmark.alloc(3);
Test33Lib.local3 = new Test33Class2();
Benchmark.alloc(4);
Test33Lib.local4 = new Test33Class2();
Benchmark.alloc(5);
Test33Lib.local5 = new Test33Class2();
Benchmark.alloc(6);
Test33Lib.local6 = new Test33Class3();
Benchmark.alloc(7);
Test33Lib.local7 = new Test33Class3();
Benchmark.alloc(8);
Test33Lib.local8 = new Test33Class3();
Test33Lib.local1.field1 = Test33Lib.local2;
Test33Lib.local1.field2 = Test33Lib.local5;
Test33Lib.local1.field3 = Test33Lib.local3;
Test33Lib.local1.field4 = Test33Lib.local6;
Test33Lib.local2.field1 = Test33Lib.local7;
Test33Lib.local2.field2 = Test33Lib.local4;
Test33Lib.local2.field3 = Test33Lib.local6;
Test33Lib.local2.field4 = Test33Lib.local7;
Test33Lib.local3.field5 = Test33Lib.local7;
Test33Lib.local3.field6 = Test33Lib.local5;
Test33Lib.local3.field1 = Test33Lib.local2;
Test33Lib.local3.field2 = Test33Lib.local6;
Test33Lib.local3.field3 = Test33Lib.local5;
Test33Lib.local3.field4 = Test33Lib.local1;
Test33Lib.local4.field5 = Test33Lib.local4;
Test33Lib.local4.field6 = Test33Lib.local4;
Test33Lib.local4.field1 = Test33Lib.local5;
Test33Lib.local4.field2 = Test33Lib.local8;
Test33Lib.local4.field3 = Test33Lib.local6;
Test33Lib.local4.field4 = Test33Lib.local3;
Test33Lib.local5.field5 = Test33Lib.local4;
Test33Lib.local5.field6 = Test33Lib.local5;
Test33Lib.local5.field1 = Test33Lib.local8;
Test33Lib.local5.field2 = Test33Lib.local6;
Test33Lib.local5.field3 = Test33Lib.local6;
Test33Lib.local5.field4 = Test33Lib.local8;
Test33Lib.local6.field7 = Test33Lib.local6;
Test33Lib.local6.field8 = Test33Lib.local3;
Test33Lib.local6.field9 = Test33Lib.local6;
Test33Lib.local6.field10 = Test33Lib.local6;
Test33Lib.local6.field5 = Test33Lib.local6;
Test33Lib.local6.field6 = Test33Lib.local3;
Test33Lib.local6.field1 = Test33Lib.local7;
Test33Lib.local6.field2 = Test33Lib.local5;
Test33Lib.local6.field3 = Test33Lib.local3;
Test33Lib.local6.field4 = Test33Lib.local8;
Test33Lib.local7.field7 = Test33Lib.local3;
Test33Lib.local7.field8 = Test33Lib.local6;
Test33Lib.local7.field9 = Test33Lib.local4;
Test33Lib.local7.field10 = Test33Lib.local6;
Test33Lib.local7.field5 = Test33Lib.local5;
Test33Lib.local7.field6 = Test33Lib.local7;
Test33Lib.local7.field1 = Test33Lib.local8;
Test33Lib.local7.field2 = Test33Lib.local8;
Test33Lib.local7.field3 = Test33Lib.local7;
Test33Lib.local7.field4 = Test33Lib.local6;
Test33Lib.local8.field7 = Test33Lib.local3;
Test33Lib.local8.field8 = Test33Lib.local8;
Test33Lib.local8.field9 = Test33Lib.local5;
Test33Lib.local8.field10 = Test33Lib.local3;
Test33Lib.local8.field5 = Test33Lib.local5;
Test33Lib.local8.field6 = Test33Lib.local5;
Test33Lib.local8.field1 = Test33Lib.local4;
Test33Lib.local8.field2 = Test33Lib.local3;
Test33Lib.local8.field3 = Test33Lib.local7;
Test33Lib.local8.field4 = Test33Lib.local6;
Test33Lib.local6.method9(3);
Test33Lib.local6=Test33Lib.local6;
Test33Lib.local8.field4.field1.field4=Test33Lib.local4.field4.field3.field2;
Benchmark.test(1,Test33Lib.local1);
Benchmark.test(2,Test33Lib.local2);
Benchmark.test(3,Test33Lib.local3);
Benchmark.test(4,Test33Lib.local4);
Benchmark.test(5,Test33Lib.local5);
Benchmark.test(6,Test33Lib.local6);
Benchmark.test(7,Test33Lib.local7);
Benchmark.test(8,Test33Lib.local8);
Benchmark.test(9,Test33Lib.local1.field1);
Benchmark.test(10,Test33Lib.local1.field2);
Benchmark.test(11,Test33Lib.local1.field3);
Benchmark.test(12,Test33Lib.local1.field4);
Benchmark.test(13,Test33Lib.local2.field1);
Benchmark.test(14,Test33Lib.local2.field2);
Benchmark.test(15,Test33Lib.local2.field3);
Benchmark.test(16,Test33Lib.local2.field4);
Benchmark.test(17,Test33Lib.local3.field5);
Benchmark.test(18,Test33Lib.local3.field6);
Benchmark.test(19,Test33Lib.local3.field1);
Benchmark.test(20,Test33Lib.local3.field2);
Benchmark.test(21,Test33Lib.local3.field3);
Benchmark.test(22,Test33Lib.local3.field4);
Benchmark.test(23,Test33Lib.local4.field5);
Benchmark.test(24,Test33Lib.local4.field6);
Benchmark.test(25,Test33Lib.local4.field1);
Benchmark.test(26,Test33Lib.local4.field2);
Benchmark.test(27,Test33Lib.local4.field3);
Benchmark.test(28,Test33Lib.local4.field4);
Benchmark.test(29,Test33Lib.local5.field5);
Benchmark.test(30,Test33Lib.local5.field6);
Benchmark.test(31,Test33Lib.local5.field1);
Benchmark.test(32,Test33Lib.local5.field2);
Benchmark.test(33,Test33Lib.local5.field3);
Benchmark.test(34,Test33Lib.local5.field4);
Benchmark.test(35,Test33Lib.local6.field7);
Benchmark.test(36,Test33Lib.local6.field8);
Benchmark.test(37,Test33Lib.local6.field9);
Benchmark.test(38,Test33Lib.local6.field10);
Benchmark.test(39,Test33Lib.local6.field5);
Benchmark.test(40,Test33Lib.local6.field6);
Benchmark.test(41,Test33Lib.local6.field1);
Benchmark.test(42,Test33Lib.local6.field2);
Benchmark.test(43,Test33Lib.local6.field3);
Benchmark.test(44,Test33Lib.local6.field4);
Benchmark.test(45,Test33Lib.local7.field7);
Benchmark.test(46,Test33Lib.local7.field8);
Benchmark.test(47,Test33Lib.local7.field9);
Benchmark.test(48,Test33Lib.local7.field10);
Benchmark.test(49,Test33Lib.local7.field5);
Benchmark.test(50,Test33Lib.local7.field6);
Benchmark.test(51,Test33Lib.local7.field1);
Benchmark.test(52,Test33Lib.local7.field2);
Benchmark.test(53,Test33Lib.local7.field3);
Benchmark.test(54,Test33Lib.local7.field4);
Benchmark.test(55,Test33Lib.local8.field7);
Benchmark.test(56,Test33Lib.local8.field8);
Benchmark.test(57,Test33Lib.local8.field9);
Benchmark.test(58,Test33Lib.local8.field10);
Benchmark.test(59,Test33Lib.local8.field5);
Benchmark.test(60,Test33Lib.local8.field6);
Benchmark.test(61,Test33Lib.local8.field1);
Benchmark.test(62,Test33Lib.local8.field2);
Benchmark.test(63,Test33Lib.local8.field3);
Benchmark.test(64,Test33Lib.local8.field4);
Benchmark.print();
}
}
