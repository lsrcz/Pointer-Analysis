package runnabledataset;

import benchmark.tool.Benchmark;
import benchmark.tool.BasicClass;
class Test18Lib{
public static Test18Class1 local1;
public static Test18Class1 local2;
public static Test18Class1 local3;
public static Test18Class2 local4;
public static Test18Class2 local5;
public static Test18Class2 local6;
public static Test18Class2 local7;
public static Test18Class2 local8;
public static Test18Class3 local9;
public static Test18Class3 local10;
public static Test18Class3 local11;
public static Test18Class3 local12;
}
class Test18Class1 extends BasicClass {
public Test18Class3 field1;
public Test18Class3 field2;
public Test18Class2 field3;
public static Test18Class1 method1(Test18Class1 arg0, int depth) {
if (depth == 0) return Test18Lib.local5;
return arg0.field1;
}
public static Test18Class1 method2(int depth) {
if (depth == 0) return Test18Lib.local10;
if (depth>1) {
if (depth>=4) {
for (int local13 = 0; local13<=3; local13 += 1) {
for (int local14 = 0; local14<=2; local14 += 1) {
if (depth<3) {
}else {
}
}
}
}
}
return Test18Lib.local10;
}
public void method3(Test18Class1 arg0, Test18Class2 arg1, int depth) {
if (depth == 0) return;
}
}
class Test18Class2 extends Test18Class1 {
public Test18Class3 field4;
public Test18Class3 field5;
public static void method4(Test18Class2 arg0, Test18Class3 arg1, int depth) {
if (depth == 0) return;
for (int local15 = 0; local15<=3; local15 += 1) {
for (int local16 = 0; local16<=3; local16 += 1) {
if (depth==2) {
if (depth>2) {
arg0.field4.method6(depth-1);
}
}else {
arg1.field6=arg0.field2;
}
}
}
}
public static void method5(Test18Class2 arg0, int depth) {
if (depth == 0) return;
if (depth<=4) {
for (int local17 = 0; local17<=1; local17 += 1) {
for (int local18 = 0; local18<=2; local18 += 1) {
arg0.field4.method1(arg0.field1,depth-1);
}
}
}else {
if (depth>=2) {
arg0.field2.method9(arg0.field3,arg0.field3,depth-1);
}else {
if (depth==2) {
arg0.field2.method7(depth-1);
}else {
arg0=arg0.field4.method8(arg0,arg0,depth-1);
}
}
}
}
}
class Test18Class3 extends Test18Class1 {
public Test18Class1 field6;
public Test18Class1 field7;
public Test18Class3 field8;
public Test18Class2 method6(int depth) {
if (depth == 0) return Test18Lib.local6;
return this.field3;
}
public static void method7(int depth) {
if (depth == 0) return;
}
public static Test18Class2 method8(Test18Class2 arg0, Test18Class1 arg1, int depth) {
if (depth == 0) return Test18Lib.local7;
arg0.method5(arg0,depth-1);
return arg0.field3;
}
public void method9(Test18Class2 arg0, Test18Class1 arg1, int depth) {
if (depth == 0) return;
}
}
public class Test18{
public static void main(String[] args) {
int inputValue = 10;
Benchmark.alloc(1);
Test18Lib.local1 = new Test18Class1();
Benchmark.alloc(2);
Test18Lib.local2 = new Test18Class1();
Benchmark.alloc(3);
Test18Lib.local3 = new Test18Class1();
Benchmark.alloc(4);
Test18Lib.local4 = new Test18Class2();
Benchmark.alloc(5);
Test18Lib.local5 = new Test18Class2();
Benchmark.alloc(6);
Test18Lib.local6 = new Test18Class2();
Benchmark.alloc(7);
Test18Lib.local7 = new Test18Class2();
Benchmark.alloc(8);
Test18Lib.local8 = new Test18Class2();
Benchmark.alloc(9);
Test18Lib.local9 = new Test18Class3();
Benchmark.alloc(10);
Test18Lib.local10 = new Test18Class3();
Benchmark.alloc(11);
Test18Lib.local11 = new Test18Class3();
Benchmark.alloc(12);
Test18Lib.local12 = new Test18Class3();
Test18Lib.local1.field1 = Test18Lib.local9;
Test18Lib.local1.field2 = Test18Lib.local9;
Test18Lib.local1.field3 = Test18Lib.local4;
Test18Lib.local2.field1 = Test18Lib.local12;
Test18Lib.local2.field2 = Test18Lib.local9;
Test18Lib.local2.field3 = Test18Lib.local7;
Test18Lib.local3.field1 = Test18Lib.local12;
Test18Lib.local3.field2 = Test18Lib.local9;
Test18Lib.local3.field3 = Test18Lib.local4;
Test18Lib.local4.field4 = Test18Lib.local11;
Test18Lib.local4.field5 = Test18Lib.local11;
Test18Lib.local4.field1 = Test18Lib.local9;
Test18Lib.local4.field2 = Test18Lib.local12;
Test18Lib.local4.field3 = Test18Lib.local5;
Test18Lib.local5.field4 = Test18Lib.local12;
Test18Lib.local5.field5 = Test18Lib.local9;
Test18Lib.local5.field1 = Test18Lib.local10;
Test18Lib.local5.field2 = Test18Lib.local12;
Test18Lib.local5.field3 = Test18Lib.local4;
Test18Lib.local6.field4 = Test18Lib.local10;
Test18Lib.local6.field5 = Test18Lib.local10;
Test18Lib.local6.field1 = Test18Lib.local9;
Test18Lib.local6.field2 = Test18Lib.local11;
Test18Lib.local6.field3 = Test18Lib.local7;
Test18Lib.local7.field4 = Test18Lib.local9;
Test18Lib.local7.field5 = Test18Lib.local10;
Test18Lib.local7.field1 = Test18Lib.local12;
Test18Lib.local7.field2 = Test18Lib.local12;
Test18Lib.local7.field3 = Test18Lib.local5;
Test18Lib.local8.field4 = Test18Lib.local12;
Test18Lib.local8.field5 = Test18Lib.local10;
Test18Lib.local8.field1 = Test18Lib.local10;
Test18Lib.local8.field2 = Test18Lib.local10;
Test18Lib.local8.field3 = Test18Lib.local5;
Test18Lib.local9.field6 = Test18Lib.local11;
Test18Lib.local9.field7 = Test18Lib.local11;
Test18Lib.local9.field8 = Test18Lib.local12;
Test18Lib.local9.field1 = Test18Lib.local12;
Test18Lib.local9.field2 = Test18Lib.local11;
Test18Lib.local9.field3 = Test18Lib.local8;
Test18Lib.local10.field6 = Test18Lib.local3;
Test18Lib.local10.field7 = Test18Lib.local2;
Test18Lib.local10.field8 = Test18Lib.local9;
Test18Lib.local10.field1 = Test18Lib.local9;
Test18Lib.local10.field2 = Test18Lib.local10;
Test18Lib.local10.field3 = Test18Lib.local6;
Test18Lib.local11.field6 = Test18Lib.local1;
Test18Lib.local11.field7 = Test18Lib.local10;
Test18Lib.local11.field8 = Test18Lib.local11;
Test18Lib.local11.field1 = Test18Lib.local12;
Test18Lib.local11.field2 = Test18Lib.local12;
Test18Lib.local11.field3 = Test18Lib.local8;
Test18Lib.local12.field6 = Test18Lib.local8;
Test18Lib.local12.field7 = Test18Lib.local3;
Test18Lib.local12.field8 = Test18Lib.local9;
Test18Lib.local12.field1 = Test18Lib.local10;
Test18Lib.local12.field2 = Test18Lib.local10;
Test18Lib.local12.field3 = Test18Lib.local4;
if (inputValue<=2) {
for (int local19 = 0; local19<=2; local19 += 1) {
if (inputValue<=2) {
if (inputValue>3) {
Test18Lib.local10.field3.method5(Test18Lib.local8,3);
}else {
if (inputValue>4) {
}else {
}
}
}else {
Test18Lib.local8.field4.method6(3);
}
}
}else {
Test18Lib.local2=Test18Lib.local10;
}
for (int local20 = 0; local20<=1; local20 += 1) {
if (inputValue==1) {
if (inputValue>2) {
for (int local21 = 0; local21<=1; local21 += 1) {
Test18Lib.local6.field1.method3(Test18Lib.local1,Test18Lib.local6,3);
}
}
}else {
Test18Lib.local8.field3=Test18Lib.local10.field3;
}
}
for (int local22 = 0; local22<=2; local22 += 1) {
if (inputValue<=3) {
for (int local23 = 0; local23<=3; local23 += 1) {
Test18Lib.local6.field5.method7(3);
}
}else {
Test18Lib.local12.field6=Test18Lib.local9.field1;
}
}
Benchmark.test(1,Test18Lib.local1);
Benchmark.test(2,Test18Lib.local2);
Benchmark.test(3,Test18Lib.local3);
Benchmark.test(4,Test18Lib.local4);
Benchmark.test(5,Test18Lib.local5);
Benchmark.test(6,Test18Lib.local6);
Benchmark.test(7,Test18Lib.local7);
Benchmark.test(8,Test18Lib.local8);
Benchmark.test(9,Test18Lib.local9);
Benchmark.test(10,Test18Lib.local10);
Benchmark.test(11,Test18Lib.local11);
Benchmark.test(12,Test18Lib.local12);
Benchmark.test(13,Test18Lib.local1.field1);
Benchmark.test(14,Test18Lib.local1.field2);
Benchmark.test(15,Test18Lib.local1.field3);
Benchmark.test(16,Test18Lib.local2.field1);
Benchmark.test(17,Test18Lib.local2.field2);
Benchmark.test(18,Test18Lib.local2.field3);
Benchmark.test(19,Test18Lib.local3.field1);
Benchmark.test(20,Test18Lib.local3.field2);
Benchmark.test(21,Test18Lib.local3.field3);
Benchmark.test(22,Test18Lib.local4.field4);
Benchmark.test(23,Test18Lib.local4.field5);
Benchmark.test(24,Test18Lib.local4.field1);
Benchmark.test(25,Test18Lib.local4.field2);
Benchmark.test(26,Test18Lib.local4.field3);
Benchmark.test(27,Test18Lib.local5.field4);
Benchmark.test(28,Test18Lib.local5.field5);
Benchmark.test(29,Test18Lib.local5.field1);
Benchmark.test(30,Test18Lib.local5.field2);
Benchmark.test(31,Test18Lib.local5.field3);
Benchmark.test(32,Test18Lib.local6.field4);
Benchmark.test(33,Test18Lib.local6.field5);
Benchmark.test(34,Test18Lib.local6.field1);
Benchmark.test(35,Test18Lib.local6.field2);
Benchmark.test(36,Test18Lib.local6.field3);
Benchmark.test(37,Test18Lib.local7.field4);
Benchmark.test(38,Test18Lib.local7.field5);
Benchmark.test(39,Test18Lib.local7.field1);
Benchmark.test(40,Test18Lib.local7.field2);
Benchmark.test(41,Test18Lib.local7.field3);
Benchmark.test(42,Test18Lib.local8.field4);
Benchmark.test(43,Test18Lib.local8.field5);
Benchmark.test(44,Test18Lib.local8.field1);
Benchmark.test(45,Test18Lib.local8.field2);
Benchmark.test(46,Test18Lib.local8.field3);
Benchmark.test(47,Test18Lib.local9.field6);
Benchmark.test(48,Test18Lib.local9.field7);
Benchmark.test(49,Test18Lib.local9.field8);
Benchmark.test(50,Test18Lib.local9.field1);
Benchmark.test(51,Test18Lib.local9.field2);
Benchmark.test(52,Test18Lib.local9.field3);
Benchmark.test(53,Test18Lib.local10.field6);
Benchmark.test(54,Test18Lib.local10.field7);
Benchmark.test(55,Test18Lib.local10.field8);
Benchmark.test(56,Test18Lib.local10.field1);
Benchmark.test(57,Test18Lib.local10.field2);
Benchmark.test(58,Test18Lib.local10.field3);
Benchmark.test(59,Test18Lib.local11.field6);
Benchmark.test(60,Test18Lib.local11.field7);
Benchmark.test(61,Test18Lib.local11.field8);
Benchmark.test(62,Test18Lib.local11.field1);
Benchmark.test(63,Test18Lib.local11.field2);
Benchmark.test(64,Test18Lib.local11.field3);
Benchmark.test(65,Test18Lib.local12.field6);
Benchmark.test(66,Test18Lib.local12.field7);
Benchmark.test(67,Test18Lib.local12.field8);
Benchmark.test(68,Test18Lib.local12.field1);
Benchmark.test(69,Test18Lib.local12.field2);
Benchmark.test(70,Test18Lib.local12.field3);
Benchmark.print();
}
}
