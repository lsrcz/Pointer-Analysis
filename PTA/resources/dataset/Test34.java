package dataset;

import benchmark.internal.Benchmark;
import benchmark.tool.BasicClass;
class Test34Lib{
public static Test34Class1 local1;
public static Test34Class1 local2;
public static Test34Class1 local3;
public static Test34Class1 local4;
public static Test34Class1 local5;
public static Test34Class2 local6;
public static Test34Class2 local7;
public static Test34Class2 local8;
public static Test34Class3 local9;
public static Test34Class3 local10;
public static Test34Class3 local11;
public static Test34Class3 local12;
public static Test34Class3 local13;
}
class Test34Class1 extends BasicClass {
public Test34Class2 field1;
public static Test34Class3 field2;
public Test34Class3 field3;
public Test34Class3 field4;
public static Test34Class3 field5;
public Test34Class2 field6;
public static void method1(Test34Class2 arg0, Test34Class2 arg1, int depth) {
if (depth == 0) return;
if (depth==1) {
field5.field5=arg0.field4;
}
for (int local14 = 0; local14<=0; local14 += 1) {
field5.field10=arg0.field4.method9(depth-1);
}
}
public Test34Class3 method2(Test34Class2 arg0, int depth) {
if (depth == 0) return Test34Lib.local12;
arg0.field6=arg0.field1;
if (depth<=1) {
for (int local15 = 0; local15<=3; local15 += 1) {
arg0.field3.method10(arg0.field4,depth-1);
}
}
return this.field4;
}
public void method3(Test34Class3 arg0, Test34Class3 arg1, int depth) {
if (depth == 0) return;
for (int local16 = 0; local16<=2; local16 += 1) {
this.field5.method11(this.field3,depth-1);
}
}
public Test34Class2 method4(int depth) {
if (depth == 0) return Test34Lib.local6;
return this.field6;
}
}
class Test34Class2 extends Test34Class1 {
public Test34Class2 field7;
public static Test34Class2 field8;
public Test34Class2 field9;
public static Test34Class1 method5(Test34Class2 arg0, Test34Class2 arg1, int depth) {
if (depth == 0) return Test34Lib.local2;
for (int local17 = 0; local17<=0; local17 += 1) {
if (depth>=1) {
for (int local18 = 0; local18<=3; local18 += 1) {
field2.field10=field5.field5;
}
}else {
if (depth>1) {
for (int local19 = 0; local19<=0; local19 += 1) {
if (depth>=2) {
}else {
}
}
}else {
field2.field10=arg0.field1;
}
}
}
return field5.field4;
}
public static Test34Class2 method6(Test34Class1 arg0, int depth) {
if (depth == 0) return Test34Lib.local6;
return field8;
}
public Test34Class3 method7(Test34Class2 arg0, Test34Class3 arg1, int depth) {
if (depth == 0) return Test34Lib.local10;
for (int local20 = 0; local20<=2; local20 += 1) {
for (int local21 = 0; local21<=0; local21 += 1) {
if (depth>=4) {
arg0.field4.method1(arg0.field7,arg0,depth-1);
}else {
if (depth>=4) {
this.field7=this.field7.method4(depth-1);
}
}
}
}
return arg1.field5;
}
}
class Test34Class3 extends Test34Class1 {
public static Test34Class1 field10;
public static void method8(int depth) {
if (depth == 0) return;
}
public static Test34Class1 method9(int depth) {
if (depth == 0) return Test34Lib.local11;
return field2.field10;
}
public void method10(Test34Class3 arg0, int depth) {
if (depth == 0) return;
}
public static void method11(Test34Class1 arg0, int depth) {
if (depth == 0) return;
field5.field6.method1(arg0.field6,field10.field1,depth-1);
if (depth==3) {
field10=field2;
}
}
}
public class Test34{
public static void main(String[] args) {
int inputValue = 0;
Benchmark.alloc(1);
Test34Lib.local1 = new Test34Class1();
Benchmark.alloc(2);
Test34Lib.local2 = new Test34Class1();
Benchmark.alloc(3);
Test34Lib.local3 = new Test34Class1();
Benchmark.alloc(4);
Test34Lib.local4 = new Test34Class1();
Benchmark.alloc(5);
Test34Lib.local5 = new Test34Class1();
Benchmark.alloc(6);
Test34Lib.local6 = new Test34Class2();
Benchmark.alloc(7);
Test34Lib.local7 = new Test34Class2();
Benchmark.alloc(8);
Test34Lib.local8 = new Test34Class2();
Benchmark.alloc(9);
Test34Lib.local9 = new Test34Class3();
Benchmark.alloc(10);
Test34Lib.local10 = new Test34Class3();
Benchmark.alloc(11);
Test34Lib.local11 = new Test34Class3();
Benchmark.alloc(12);
Test34Lib.local12 = new Test34Class3();
Benchmark.alloc(13);
Test34Lib.local13 = new Test34Class3();
Test34Lib.local1.field1 = Test34Lib.local8;
Test34Lib.local1.field2 = Test34Lib.local12;
Test34Lib.local1.field3 = Test34Lib.local12;
Test34Lib.local1.field4 = Test34Lib.local10;
Test34Lib.local1.field5 = Test34Lib.local13;
Test34Lib.local1.field6 = Test34Lib.local7;
Test34Lib.local2.field1 = Test34Lib.local6;
Test34Lib.local2.field2 = Test34Lib.local10;
Test34Lib.local2.field3 = Test34Lib.local9;
Test34Lib.local2.field4 = Test34Lib.local13;
Test34Lib.local2.field5 = Test34Lib.local10;
Test34Lib.local2.field6 = Test34Lib.local6;
Test34Lib.local3.field1 = Test34Lib.local8;
Test34Lib.local3.field2 = Test34Lib.local13;
Test34Lib.local3.field3 = Test34Lib.local9;
Test34Lib.local3.field4 = Test34Lib.local12;
Test34Lib.local3.field5 = Test34Lib.local13;
Test34Lib.local3.field6 = Test34Lib.local8;
Test34Lib.local4.field1 = Test34Lib.local7;
Test34Lib.local4.field2 = Test34Lib.local12;
Test34Lib.local4.field3 = Test34Lib.local9;
Test34Lib.local4.field4 = Test34Lib.local12;
Test34Lib.local4.field5 = Test34Lib.local9;
Test34Lib.local4.field6 = Test34Lib.local7;
Test34Lib.local5.field1 = Test34Lib.local6;
Test34Lib.local5.field2 = Test34Lib.local13;
Test34Lib.local5.field3 = Test34Lib.local10;
Test34Lib.local5.field4 = Test34Lib.local11;
Test34Lib.local5.field5 = Test34Lib.local9;
Test34Lib.local5.field6 = Test34Lib.local7;
Test34Lib.local6.field7 = Test34Lib.local8;
Test34Lib.local6.field8 = Test34Lib.local8;
Test34Lib.local6.field9 = Test34Lib.local8;
Test34Lib.local6.field1 = Test34Lib.local7;
Test34Lib.local6.field2 = Test34Lib.local11;
Test34Lib.local6.field3 = Test34Lib.local13;
Test34Lib.local6.field4 = Test34Lib.local9;
Test34Lib.local6.field5 = Test34Lib.local13;
Test34Lib.local6.field6 = Test34Lib.local7;
Test34Lib.local7.field7 = Test34Lib.local6;
Test34Lib.local7.field8 = Test34Lib.local7;
Test34Lib.local7.field9 = Test34Lib.local8;
Test34Lib.local7.field1 = Test34Lib.local8;
Test34Lib.local7.field2 = Test34Lib.local12;
Test34Lib.local7.field3 = Test34Lib.local13;
Test34Lib.local7.field4 = Test34Lib.local9;
Test34Lib.local7.field5 = Test34Lib.local13;
Test34Lib.local7.field6 = Test34Lib.local7;
Test34Lib.local8.field7 = Test34Lib.local6;
Test34Lib.local8.field8 = Test34Lib.local8;
Test34Lib.local8.field9 = Test34Lib.local7;
Test34Lib.local8.field1 = Test34Lib.local8;
Test34Lib.local8.field2 = Test34Lib.local10;
Test34Lib.local8.field3 = Test34Lib.local10;
Test34Lib.local8.field4 = Test34Lib.local9;
Test34Lib.local8.field5 = Test34Lib.local10;
Test34Lib.local8.field6 = Test34Lib.local7;
Test34Lib.local9.field10 = Test34Lib.local1;
Test34Lib.local9.field1 = Test34Lib.local8;
Test34Lib.local9.field2 = Test34Lib.local11;
Test34Lib.local9.field3 = Test34Lib.local11;
Test34Lib.local9.field4 = Test34Lib.local13;
Test34Lib.local9.field5 = Test34Lib.local11;
Test34Lib.local9.field6 = Test34Lib.local6;
Test34Lib.local10.field10 = Test34Lib.local5;
Test34Lib.local10.field1 = Test34Lib.local8;
Test34Lib.local10.field2 = Test34Lib.local11;
Test34Lib.local10.field3 = Test34Lib.local12;
Test34Lib.local10.field4 = Test34Lib.local13;
Test34Lib.local10.field5 = Test34Lib.local10;
Test34Lib.local10.field6 = Test34Lib.local8;
Test34Lib.local11.field10 = Test34Lib.local13;
Test34Lib.local11.field1 = Test34Lib.local8;
Test34Lib.local11.field2 = Test34Lib.local12;
Test34Lib.local11.field3 = Test34Lib.local13;
Test34Lib.local11.field4 = Test34Lib.local9;
Test34Lib.local11.field5 = Test34Lib.local9;
Test34Lib.local11.field6 = Test34Lib.local8;
Test34Lib.local12.field10 = Test34Lib.local5;
Test34Lib.local12.field1 = Test34Lib.local8;
Test34Lib.local12.field2 = Test34Lib.local11;
Test34Lib.local12.field3 = Test34Lib.local10;
Test34Lib.local12.field4 = Test34Lib.local10;
Test34Lib.local12.field5 = Test34Lib.local9;
Test34Lib.local12.field6 = Test34Lib.local8;
Test34Lib.local13.field10 = Test34Lib.local6;
Test34Lib.local13.field1 = Test34Lib.local7;
Test34Lib.local13.field2 = Test34Lib.local10;
Test34Lib.local13.field3 = Test34Lib.local12;
Test34Lib.local13.field4 = Test34Lib.local9;
Test34Lib.local13.field5 = Test34Lib.local10;
Test34Lib.local13.field6 = Test34Lib.local6;
if (inputValue<2) {
if (inputValue==1) {
for (int local22 = 0; local22<=0; local22 += 1) {
for (int local23 = 0; local23<=0; local23 += 1) {
for (int local24 = 0; local24<=2; local24 += 1) {
}
}
}
}
}else {
if (inputValue<2) {
Test34Lib.local6.field1=Test34Lib.local2.field6;
}else {
Test34Lib.local9.field10=Test34Lib.local9.field10;
}
}
if (inputValue>=1) {
Test34Lib.local13.field1=Test34Lib.local13.field1;
}else {
if (inputValue<=4) {
for (int local25 = 0; local25<=0; local25 += 1) {
Test34Lib.local3.field5.method4(3);
}
}
}
if (inputValue==3) {
Test34Lib.local2.field2.method11(Test34Lib.local10.field1,3);
}
Benchmark.test(1,Test34Lib.local1);
Benchmark.test(2,Test34Lib.local2);
Benchmark.test(3,Test34Lib.local3);
Benchmark.test(4,Test34Lib.local4);
Benchmark.test(5,Test34Lib.local5);
Benchmark.test(6,Test34Lib.local6);
Benchmark.test(7,Test34Lib.local7);
Benchmark.test(8,Test34Lib.local8);
Benchmark.test(9,Test34Lib.local9);
Benchmark.test(10,Test34Lib.local10);
Benchmark.test(11,Test34Lib.local11);
Benchmark.test(12,Test34Lib.local12);
Benchmark.test(13,Test34Lib.local13);
Benchmark.test(14,Test34Lib.local1.field1);
Benchmark.test(15,Test34Lib.local1.field2);
Benchmark.test(16,Test34Lib.local1.field3);
Benchmark.test(17,Test34Lib.local1.field4);
Benchmark.test(18,Test34Lib.local1.field5);
Benchmark.test(19,Test34Lib.local1.field6);
Benchmark.test(20,Test34Lib.local2.field1);
Benchmark.test(21,Test34Lib.local2.field2);
Benchmark.test(22,Test34Lib.local2.field3);
Benchmark.test(23,Test34Lib.local2.field4);
Benchmark.test(24,Test34Lib.local2.field5);
Benchmark.test(25,Test34Lib.local2.field6);
Benchmark.test(26,Test34Lib.local3.field1);
Benchmark.test(27,Test34Lib.local3.field2);
Benchmark.test(28,Test34Lib.local3.field3);
Benchmark.test(29,Test34Lib.local3.field4);
Benchmark.test(30,Test34Lib.local3.field5);
Benchmark.test(31,Test34Lib.local3.field6);
Benchmark.test(32,Test34Lib.local4.field1);
Benchmark.test(33,Test34Lib.local4.field2);
Benchmark.test(34,Test34Lib.local4.field3);
Benchmark.test(35,Test34Lib.local4.field4);
Benchmark.test(36,Test34Lib.local4.field5);
Benchmark.test(37,Test34Lib.local4.field6);
Benchmark.test(38,Test34Lib.local5.field1);
Benchmark.test(39,Test34Lib.local5.field2);
Benchmark.test(40,Test34Lib.local5.field3);
Benchmark.test(41,Test34Lib.local5.field4);
Benchmark.test(42,Test34Lib.local5.field5);
Benchmark.test(43,Test34Lib.local5.field6);
Benchmark.test(44,Test34Lib.local6.field7);
Benchmark.test(45,Test34Lib.local6.field8);
Benchmark.test(46,Test34Lib.local6.field9);
Benchmark.test(47,Test34Lib.local6.field1);
Benchmark.test(48,Test34Lib.local6.field2);
Benchmark.test(49,Test34Lib.local6.field3);
Benchmark.test(50,Test34Lib.local6.field4);
Benchmark.test(51,Test34Lib.local6.field5);
Benchmark.test(52,Test34Lib.local6.field6);
Benchmark.test(53,Test34Lib.local7.field7);
Benchmark.test(54,Test34Lib.local7.field8);
Benchmark.test(55,Test34Lib.local7.field9);
Benchmark.test(56,Test34Lib.local7.field1);
Benchmark.test(57,Test34Lib.local7.field2);
Benchmark.test(58,Test34Lib.local7.field3);
Benchmark.test(59,Test34Lib.local7.field4);
Benchmark.test(60,Test34Lib.local7.field5);
Benchmark.test(61,Test34Lib.local7.field6);
Benchmark.test(62,Test34Lib.local8.field7);
Benchmark.test(63,Test34Lib.local8.field8);
Benchmark.test(64,Test34Lib.local8.field9);
Benchmark.test(65,Test34Lib.local8.field1);
Benchmark.test(66,Test34Lib.local8.field2);
Benchmark.test(67,Test34Lib.local8.field3);
Benchmark.test(68,Test34Lib.local8.field4);
Benchmark.test(69,Test34Lib.local8.field5);
Benchmark.test(70,Test34Lib.local8.field6);
Benchmark.test(71,Test34Lib.local9.field10);
Benchmark.test(72,Test34Lib.local9.field1);
Benchmark.test(73,Test34Lib.local9.field2);
Benchmark.test(74,Test34Lib.local9.field3);
Benchmark.test(75,Test34Lib.local9.field4);
Benchmark.test(76,Test34Lib.local9.field5);
Benchmark.test(77,Test34Lib.local9.field6);
Benchmark.test(78,Test34Lib.local10.field10);
Benchmark.test(79,Test34Lib.local10.field1);
Benchmark.test(80,Test34Lib.local10.field2);
Benchmark.test(81,Test34Lib.local10.field3);
Benchmark.test(82,Test34Lib.local10.field4);
Benchmark.test(83,Test34Lib.local10.field5);
Benchmark.test(84,Test34Lib.local10.field6);
Benchmark.test(85,Test34Lib.local11.field10);
Benchmark.test(86,Test34Lib.local11.field1);
Benchmark.test(87,Test34Lib.local11.field2);
Benchmark.test(88,Test34Lib.local11.field3);
Benchmark.test(89,Test34Lib.local11.field4);
Benchmark.test(90,Test34Lib.local11.field5);
Benchmark.test(91,Test34Lib.local11.field6);
Benchmark.test(92,Test34Lib.local12.field10);
Benchmark.test(93,Test34Lib.local12.field1);
Benchmark.test(94,Test34Lib.local12.field2);
Benchmark.test(95,Test34Lib.local12.field3);
Benchmark.test(96,Test34Lib.local12.field4);
Benchmark.test(97,Test34Lib.local12.field5);
Benchmark.test(98,Test34Lib.local12.field6);
Benchmark.test(99,Test34Lib.local13.field10);
Benchmark.test(100,Test34Lib.local13.field1);
Benchmark.test(101,Test34Lib.local13.field2);
Benchmark.test(102,Test34Lib.local13.field3);
Benchmark.test(103,Test34Lib.local13.field4);
Benchmark.test(104,Test34Lib.local13.field5);
Benchmark.test(105,Test34Lib.local13.field6);
Benchmark.print();
}
}
