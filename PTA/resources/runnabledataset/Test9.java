package runnabledataset;

import benchmark.tool.Benchmark;
import benchmark.tool.BasicClass;
class Test9Lib{
public static Test9Class1 local1;
public static Test9Class1 local2;
public static Test9Class1 local3;
public static Test9Class2 local4;
public static Test9Class2 local5;
public static Test9Class2 local6;
public static Test9Class2 local7;
public static Test9Class2 local8;
}
class Test9Class1 extends BasicClass {
public Test9Class2 field1;
public Test9Class2 field2;
public Test9Class2 field3;
public Test9Class1 field4;
public Test9Class2 field5;
public Test9Class1 field6;
public Test9Class2 field7;
public static Test9Class1 field8;
public static Test9Class1 method1(Test9Class2 arg0, Test9Class2 arg1, int depth) {
if (depth == 0) return Test9Lib.local3;
arg0.field4=field8.field6;
field8.field8.method4(field8,depth-1);
field8.field4=arg0.method2(arg0,arg1,depth-1);
field8.field6=arg0.field9;
arg1.field4=arg1.field5;
arg0.field2.method4(field8,depth-1);
for (int local9 = 0; local9<=2; local9 += 1) {
for (int local10 = 0; local10<=0; local10 += 1) {
arg0.field5.method3(depth-1);
}
}
return arg1.field4;
}
public static Test9Class1 method2(Test9Class2 arg0, Test9Class1 arg1, int depth) {
if (depth == 0) return Test9Lib.local3;
arg1=field8.field1.method2(arg1.field7,field8.field6,depth-1);
arg0.field7=arg0;
return arg0.field8;
}
public void method3(int depth) {
if (depth == 0) return;
this.field3.method7(this.field2,depth-1);
for (int local11 = 0; local11<=3; local11 += 1) {
this.field3=this.field5;
}
this.field5=this.field7;
this.field1.method6(this.field5,depth-1);
this.field1=this.field5;
this.field4=this.field4.method1(this.field7,this.field3,depth-1);
if (depth<=2) {
this.field4=this.field1.method5(this.field5,this.field7,depth-1);
}
this.field7.method7(this.field3,depth-1);
this.field2.method8(this.field5,depth-1);
}
public static void method4(Test9Class1 arg0, int depth) {
if (depth == 0) return;
arg0.field4=arg0.field4.method2(field8.field1,arg0.field8,depth-1);
arg0.field8.method4(arg0.field1,depth-1);
field8.field7.method7(arg0.field7,depth-1);
field8.field1.method6(field8.field8,depth-1);
field8.field2=arg0.field7;
field8.field1.method5(arg0.field2,field8.field2,depth-1);
arg0.field3.method5(field8.field7,arg0.field2,depth-1);
field8.field5=field8.field2;
}
}
class Test9Class2 extends Test9Class1 {
public Test9Class2 field9;
public Test9Class2 field10;
public Test9Class1 method5(Test9Class2 arg0, Test9Class2 arg1, int depth) {
if (depth == 0) return Test9Lib.local3;
arg0.field4=arg0.field1;
for (int local12 = 0; local12<=0; local12 += 1) {
for (int local13 = 0; local13<=1; local13 += 1) {
arg1.field8=arg1.field7;
}
}
if (depth<1) {
this.method6(this.field3,depth-1);
}
for (int local14 = 0; local14<=3; local14 += 1) {
if (depth>=1) {
if (depth==2) {
arg1.field2.method3(depth-1);
}
}else {
if (depth<=1) {
if (depth==1) {
this.field6=arg0.field1;
}
}
}
}
arg1.field5.method3(depth-1);
if (depth>1) {
if (depth>=4) {
arg1.field7.method7(arg1.field3,depth-1);
}else {
arg0.field1=arg1.field1;
}
}
this.field2.method3(depth-1);
return arg0.field7;
}
public void method6(Test9Class1 arg0, int depth) {
if (depth == 0) return;
this.field6=this.field2.method5(this.field2,arg0.field3,depth-1);
for (int local15 = 0; local15<=2; local15 += 1) {
this.field2.method8(this.field7,depth-1);
}
arg0.field7.method6(arg0.field2,depth-1);
arg0=this.field7;
this.field3=this.field9;
arg0.field1=this.field3;
}
public void method7(Test9Class2 arg0, int depth) {
if (depth == 0) return;
if (depth<3) {
for (int local16 = 0; local16<=3; local16 += 1) {
arg0.field9=this.field3;
}
}else {
if (depth>4) {
arg0.field8=this.field5;
}else {
this.field3.method3(depth-1);
}
}
for (int local17 = 0; local17<=2; local17 += 1) {
this.field1.method2(this,arg0.field6,depth-1);
}
}
public void method8(Test9Class2 arg0, int depth) {
if (depth == 0) return;
arg0.field6=arg0.field7;
for (int local18 = 0; local18<=2; local18 += 1) {
arg0.field5=arg0.field9;
}
arg0.field1.method8(arg0.field2,depth-1);
for (int local19 = 0; local19<=3; local19 += 1) {
arg0.field6=arg0.field5.method1(arg0.field1,this.field5,depth-1);
}
arg0.method4(arg0.field2,depth-1);
}
}
public class Test9{
public static void main(String[] args) {
int inputValue = 10;
Benchmark.alloc(1);
Test9Lib.local1 = new Test9Class1();
Benchmark.alloc(2);
Test9Lib.local2 = new Test9Class1();
Benchmark.alloc(3);
Test9Lib.local3 = new Test9Class1();
Benchmark.alloc(4);
Test9Lib.local4 = new Test9Class2();
Benchmark.alloc(5);
Test9Lib.local5 = new Test9Class2();
Benchmark.alloc(6);
Test9Lib.local6 = new Test9Class2();
Benchmark.alloc(7);
Test9Lib.local7 = new Test9Class2();
Benchmark.alloc(8);
Test9Lib.local8 = new Test9Class2();
Test9Lib.local1.field1 = Test9Lib.local6;
Test9Lib.local1.field2 = Test9Lib.local4;
Test9Lib.local1.field3 = Test9Lib.local6;
Test9Lib.local1.field4 = Test9Lib.local7;
Test9Lib.local1.field5 = Test9Lib.local5;
Test9Lib.local1.field6 = Test9Lib.local1;
Test9Lib.local1.field7 = Test9Lib.local8;
Test9Lib.local1.field8 = Test9Lib.local5;
Test9Lib.local2.field1 = Test9Lib.local8;
Test9Lib.local2.field2 = Test9Lib.local4;
Test9Lib.local2.field3 = Test9Lib.local5;
Test9Lib.local2.field4 = Test9Lib.local4;
Test9Lib.local2.field5 = Test9Lib.local4;
Test9Lib.local2.field6 = Test9Lib.local6;
Test9Lib.local2.field7 = Test9Lib.local4;
Test9Lib.local2.field8 = Test9Lib.local6;
Test9Lib.local3.field1 = Test9Lib.local5;
Test9Lib.local3.field2 = Test9Lib.local5;
Test9Lib.local3.field3 = Test9Lib.local6;
Test9Lib.local3.field4 = Test9Lib.local5;
Test9Lib.local3.field5 = Test9Lib.local6;
Test9Lib.local3.field6 = Test9Lib.local3;
Test9Lib.local3.field7 = Test9Lib.local7;
Test9Lib.local3.field8 = Test9Lib.local6;
Test9Lib.local4.field9 = Test9Lib.local6;
Test9Lib.local4.field10 = Test9Lib.local5;
Test9Lib.local4.field1 = Test9Lib.local4;
Test9Lib.local4.field2 = Test9Lib.local6;
Test9Lib.local4.field3 = Test9Lib.local6;
Test9Lib.local4.field4 = Test9Lib.local5;
Test9Lib.local4.field5 = Test9Lib.local6;
Test9Lib.local4.field6 = Test9Lib.local4;
Test9Lib.local4.field7 = Test9Lib.local4;
Test9Lib.local4.field8 = Test9Lib.local7;
Test9Lib.local5.field9 = Test9Lib.local7;
Test9Lib.local5.field10 = Test9Lib.local6;
Test9Lib.local5.field1 = Test9Lib.local5;
Test9Lib.local5.field2 = Test9Lib.local8;
Test9Lib.local5.field3 = Test9Lib.local4;
Test9Lib.local5.field4 = Test9Lib.local7;
Test9Lib.local5.field5 = Test9Lib.local6;
Test9Lib.local5.field6 = Test9Lib.local2;
Test9Lib.local5.field7 = Test9Lib.local8;
Test9Lib.local5.field8 = Test9Lib.local1;
Test9Lib.local6.field9 = Test9Lib.local4;
Test9Lib.local6.field10 = Test9Lib.local8;
Test9Lib.local6.field1 = Test9Lib.local4;
Test9Lib.local6.field2 = Test9Lib.local5;
Test9Lib.local6.field3 = Test9Lib.local4;
Test9Lib.local6.field4 = Test9Lib.local3;
Test9Lib.local6.field5 = Test9Lib.local7;
Test9Lib.local6.field6 = Test9Lib.local6;
Test9Lib.local6.field7 = Test9Lib.local7;
Test9Lib.local6.field8 = Test9Lib.local6;
Test9Lib.local7.field9 = Test9Lib.local6;
Test9Lib.local7.field10 = Test9Lib.local4;
Test9Lib.local7.field1 = Test9Lib.local6;
Test9Lib.local7.field2 = Test9Lib.local7;
Test9Lib.local7.field3 = Test9Lib.local7;
Test9Lib.local7.field4 = Test9Lib.local1;
Test9Lib.local7.field5 = Test9Lib.local6;
Test9Lib.local7.field6 = Test9Lib.local3;
Test9Lib.local7.field7 = Test9Lib.local8;
Test9Lib.local7.field8 = Test9Lib.local1;
Test9Lib.local8.field9 = Test9Lib.local7;
Test9Lib.local8.field10 = Test9Lib.local4;
Test9Lib.local8.field1 = Test9Lib.local5;
Test9Lib.local8.field2 = Test9Lib.local5;
Test9Lib.local8.field3 = Test9Lib.local5;
Test9Lib.local8.field4 = Test9Lib.local3;
Test9Lib.local8.field5 = Test9Lib.local6;
Test9Lib.local8.field6 = Test9Lib.local7;
Test9Lib.local8.field7 = Test9Lib.local5;
Test9Lib.local8.field8 = Test9Lib.local8;
Test9Lib.local4.field8=Test9Lib.local1.field4;
for (int local20 = 0; local20<=2; local20 += 1) {
Test9Lib.local7=Test9Lib.local2.field7;
}
Test9Lib.local5.field4=Test9Lib.local3.field1.method5(Test9Lib.local7.field1,Test9Lib.local5.field3,3);
Test9Lib.local7.field2.method8(Test9Lib.local3.field3,3);
if (inputValue>=1) {
Test9Lib.local4.field10.method6(Test9Lib.local2.field2,3);
}else {
for (int local21 = 0; local21<=3; local21 += 1) {
for (int local22 = 0; local22<=1; local22 += 1) {
for (int local23 = 0; local23<=0; local23 += 1) {
Test9Lib.local7.field3=Test9Lib.local3.field7;
}
}
}
}
Test9Lib.local3=Test9Lib.local7.field10.method1(Test9Lib.local5.field10,Test9Lib.local4.field2,3);
Test9Lib.local2.field4=Test9Lib.local4.field5.method1(Test9Lib.local7.field3,Test9Lib.local4.field10,3);
for (int local24 = 0; local24<=2; local24 += 1) {
Test9Lib.local6.field9=Test9Lib.local6.field9;
}
Test9Lib.local5.field5.method8(Test9Lib.local8,3);
Test9Lib.local2.field8.method3(3);
Benchmark.test(1,Test9Lib.local1);
Benchmark.test(2,Test9Lib.local2);
Benchmark.test(3,Test9Lib.local3);
Benchmark.test(4,Test9Lib.local4);
Benchmark.test(5,Test9Lib.local5);
Benchmark.test(6,Test9Lib.local6);
Benchmark.test(7,Test9Lib.local7);
Benchmark.test(8,Test9Lib.local8);
Benchmark.test(9,Test9Lib.local1.field1);
Benchmark.test(10,Test9Lib.local1.field2);
Benchmark.test(11,Test9Lib.local1.field3);
Benchmark.test(12,Test9Lib.local1.field4);
Benchmark.test(13,Test9Lib.local1.field5);
Benchmark.test(14,Test9Lib.local1.field6);
Benchmark.test(15,Test9Lib.local1.field7);
Benchmark.test(16,Test9Lib.local1.field8);
Benchmark.test(17,Test9Lib.local2.field1);
Benchmark.test(18,Test9Lib.local2.field2);
Benchmark.test(19,Test9Lib.local2.field3);
Benchmark.test(20,Test9Lib.local2.field4);
Benchmark.test(21,Test9Lib.local2.field5);
Benchmark.test(22,Test9Lib.local2.field6);
Benchmark.test(23,Test9Lib.local2.field7);
Benchmark.test(24,Test9Lib.local2.field8);
Benchmark.test(25,Test9Lib.local3.field1);
Benchmark.test(26,Test9Lib.local3.field2);
Benchmark.test(27,Test9Lib.local3.field3);
Benchmark.test(28,Test9Lib.local3.field4);
Benchmark.test(29,Test9Lib.local3.field5);
Benchmark.test(30,Test9Lib.local3.field6);
Benchmark.test(31,Test9Lib.local3.field7);
Benchmark.test(32,Test9Lib.local3.field8);
Benchmark.test(33,Test9Lib.local4.field9);
Benchmark.test(34,Test9Lib.local4.field10);
Benchmark.test(35,Test9Lib.local4.field1);
Benchmark.test(36,Test9Lib.local4.field2);
Benchmark.test(37,Test9Lib.local4.field3);
Benchmark.test(38,Test9Lib.local4.field4);
Benchmark.test(39,Test9Lib.local4.field5);
Benchmark.test(40,Test9Lib.local4.field6);
Benchmark.test(41,Test9Lib.local4.field7);
Benchmark.test(42,Test9Lib.local4.field8);
Benchmark.test(43,Test9Lib.local5.field9);
Benchmark.test(44,Test9Lib.local5.field10);
Benchmark.test(45,Test9Lib.local5.field1);
Benchmark.test(46,Test9Lib.local5.field2);
Benchmark.test(47,Test9Lib.local5.field3);
Benchmark.test(48,Test9Lib.local5.field4);
Benchmark.test(49,Test9Lib.local5.field5);
Benchmark.test(50,Test9Lib.local5.field6);
Benchmark.test(51,Test9Lib.local5.field7);
Benchmark.test(52,Test9Lib.local5.field8);
Benchmark.test(53,Test9Lib.local6.field9);
Benchmark.test(54,Test9Lib.local6.field10);
Benchmark.test(55,Test9Lib.local6.field1);
Benchmark.test(56,Test9Lib.local6.field2);
Benchmark.test(57,Test9Lib.local6.field3);
Benchmark.test(58,Test9Lib.local6.field4);
Benchmark.test(59,Test9Lib.local6.field5);
Benchmark.test(60,Test9Lib.local6.field6);
Benchmark.test(61,Test9Lib.local6.field7);
Benchmark.test(62,Test9Lib.local6.field8);
Benchmark.test(63,Test9Lib.local7.field9);
Benchmark.test(64,Test9Lib.local7.field10);
Benchmark.test(65,Test9Lib.local7.field1);
Benchmark.test(66,Test9Lib.local7.field2);
Benchmark.test(67,Test9Lib.local7.field3);
Benchmark.test(68,Test9Lib.local7.field4);
Benchmark.test(69,Test9Lib.local7.field5);
Benchmark.test(70,Test9Lib.local7.field6);
Benchmark.test(71,Test9Lib.local7.field7);
Benchmark.test(72,Test9Lib.local7.field8);
Benchmark.test(73,Test9Lib.local8.field9);
Benchmark.test(74,Test9Lib.local8.field10);
Benchmark.test(75,Test9Lib.local8.field1);
Benchmark.test(76,Test9Lib.local8.field2);
Benchmark.test(77,Test9Lib.local8.field3);
Benchmark.test(78,Test9Lib.local8.field4);
Benchmark.test(79,Test9Lib.local8.field5);
Benchmark.test(80,Test9Lib.local8.field6);
Benchmark.test(81,Test9Lib.local8.field7);
Benchmark.test(82,Test9Lib.local8.field8);
Benchmark.print();
}
}
