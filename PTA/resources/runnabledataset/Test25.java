package runnabledataset;

import benchmark.tool.Benchmark;
import benchmark.tool.BasicClass;
class Test25Lib{
public static Test25Class1 local1;
public static Test25Class1 local2;
public static Test25Class1 local3;
public static Test25Class1 local4;
public static Test25Class1 local5;
public static Test25Class2 local6;
public static Test25Class2 local7;
public static Test25Class2 local8;
public static Test25Class3 local9;
public static Test25Class3 local10;
}
class Test25Class1 extends BasicClass {
public Test25Class3 field1;
public static Test25Class2 field2;
public static Test25Class1 field3;
public static Test25Class3 field4;
public static Test25Class1 method1(Test25Class1 arg0, int depth) {
if (depth == 0) return Test25Lib.local8;
field4.method9(field4.field10,depth-1);
field4.field7.method8(arg0.field4,arg0.field1,depth-1);
return field3;
}
public void method2(int depth) {
if (depth == 0) return;
this.field1=this.field4;
for (int local11 = 0; local11<=3; local11 += 1) {
this.field4.method10(this.field4,depth-1);
}
this.field3=this.field4.method5(depth-1);
this.field3=this.method4(this,this.field1,depth-1);
if (depth>=1) {
for (int local12 = 0; local12<=2; local12 += 1) {
this.field4.method8(this.field1,this.field3,depth-1);
}
}
}
public Test25Class1 method3(int depth) {
if (depth == 0) return Test25Lib.local3;
return this;
}
public Test25Class1 method4(Test25Class1 arg0, Test25Class3 arg1, int depth) {
if (depth == 0) return Test25Lib.local9;
for (int local13 = 0; local13<=3; local13 += 1) {
arg1.field7.method2(depth-1);
}
this.field2=arg1.field11;
arg1.field9.method3(depth-1);
for (int local14 = 0; local14<=1; local14 += 1) {
arg0.field2=arg1.field11;
}
if (depth==2) {
arg0.field2.method4(arg0.field2,arg1,depth-1);
}
return this.field2;
}
}
class Test25Class2 extends Test25Class1 {
public Test25Class3 field5;
public Test25Class3 field6;
public Test25Class3 field7;
public static Test25Class1 field8;
public Test25Class3 method5(int depth) {
if (depth == 0) return Test25Lib.local10;
for (int local15 = 0; local15<=3; local15 += 1) {
if (depth>=3) {
this.field6=this.field5;
}
}
this.field8=this;
for (int local16 = 0; local16<=0; local16 += 1) {
this.field3=this.field8.method4(this.field7,this.field1,depth-1);
}
this.field5.method3(depth-1);
for (int local17 = 0; local17<=1; local17 += 1) {
for (int local18 = 0; local18<=3; local18 += 1) {
for (int local19 = 0; local19<=2; local19 += 1) {
this.field6=this.field1;
}
}
}
return this.field5;
}
public void method6(int depth) {
if (depth == 0) return;
for (int local20 = 0; local20<=3; local20 += 1) {
for (int local21 = 0; local21<=3; local21 += 1) {
this.field6=this.field6.method5(depth-1);
}
}
for (int local22 = 0; local22<=0; local22 += 1) {
for (int local23 = 0; local23<=2; local23 += 1) {
this.field3=this.field2;
}
}
this.field4=this.field6;
this.field7=this.field4;
}
public static void method7(Test25Class1 arg0, Test25Class2 arg1, int depth) {
if (depth == 0) return;
}
}
class Test25Class3 extends Test25Class2 {
public static Test25Class1 field9;
public static Test25Class2 field10;
public static Test25Class3 field11;
public static void method8(Test25Class1 arg0, Test25Class1 arg1, int depth) {
if (depth == 0) return;
for (int local24 = 0; local24<=3; local24 += 1) {
arg1.field4.method10(field2.field7,depth-1);
}
if (depth<=2) {
for (int local25 = 0; local25<=3; local25 += 1) {
field11=field10.field5.method5(depth-1);
}
}else {
arg1.field3=field4.field5.method1(arg0,depth-1);
}
for (int local26 = 0; local26<=2; local26 += 1) {
field3=field9.field2.method1(arg0.field2,depth-1);
}
field11.field3=field8.field3;
}
public void method9(Test25Class2 arg0, int depth) {
if (depth == 0) return;
}
public void method10(Test25Class2 arg0, int depth) {
if (depth == 0) return;
}
}
public class Test25{
public static void main(String[] args) {
int inputValue = 10;
Benchmark.alloc(1);
Test25Lib.local1 = new Test25Class1();
Benchmark.alloc(2);
Test25Lib.local2 = new Test25Class1();
Benchmark.alloc(3);
Test25Lib.local3 = new Test25Class1();
Benchmark.alloc(4);
Test25Lib.local4 = new Test25Class1();
Benchmark.alloc(5);
Test25Lib.local5 = new Test25Class1();
Benchmark.alloc(6);
Test25Lib.local6 = new Test25Class2();
Benchmark.alloc(7);
Test25Lib.local7 = new Test25Class2();
Benchmark.alloc(8);
Test25Lib.local8 = new Test25Class2();
Benchmark.alloc(9);
Test25Lib.local9 = new Test25Class3();
Benchmark.alloc(10);
Test25Lib.local10 = new Test25Class3();
Test25Lib.local1.field1 = Test25Lib.local10;
Test25Lib.local1.field2 = Test25Lib.local6;
Test25Lib.local1.field3 = Test25Lib.local6;
Test25Lib.local1.field4 = Test25Lib.local10;
Test25Lib.local2.field1 = Test25Lib.local10;
Test25Lib.local2.field2 = Test25Lib.local8;
Test25Lib.local2.field3 = Test25Lib.local10;
Test25Lib.local2.field4 = Test25Lib.local10;
Test25Lib.local3.field1 = Test25Lib.local9;
Test25Lib.local3.field2 = Test25Lib.local8;
Test25Lib.local3.field3 = Test25Lib.local7;
Test25Lib.local3.field4 = Test25Lib.local9;
Test25Lib.local4.field1 = Test25Lib.local10;
Test25Lib.local4.field2 = Test25Lib.local10;
Test25Lib.local4.field3 = Test25Lib.local4;
Test25Lib.local4.field4 = Test25Lib.local9;
Test25Lib.local5.field1 = Test25Lib.local10;
Test25Lib.local5.field2 = Test25Lib.local10;
Test25Lib.local5.field3 = Test25Lib.local1;
Test25Lib.local5.field4 = Test25Lib.local9;
Test25Lib.local6.field5 = Test25Lib.local9;
Test25Lib.local6.field6 = Test25Lib.local10;
Test25Lib.local6.field7 = Test25Lib.local9;
Test25Lib.local6.field8 = Test25Lib.local10;
Test25Lib.local6.field1 = Test25Lib.local10;
Test25Lib.local6.field2 = Test25Lib.local6;
Test25Lib.local6.field3 = Test25Lib.local4;
Test25Lib.local6.field4 = Test25Lib.local9;
Test25Lib.local7.field5 = Test25Lib.local9;
Test25Lib.local7.field6 = Test25Lib.local9;
Test25Lib.local7.field7 = Test25Lib.local10;
Test25Lib.local7.field8 = Test25Lib.local4;
Test25Lib.local7.field1 = Test25Lib.local10;
Test25Lib.local7.field2 = Test25Lib.local9;
Test25Lib.local7.field3 = Test25Lib.local9;
Test25Lib.local7.field4 = Test25Lib.local9;
Test25Lib.local8.field5 = Test25Lib.local9;
Test25Lib.local8.field6 = Test25Lib.local9;
Test25Lib.local8.field7 = Test25Lib.local10;
Test25Lib.local8.field8 = Test25Lib.local4;
Test25Lib.local8.field1 = Test25Lib.local10;
Test25Lib.local8.field2 = Test25Lib.local7;
Test25Lib.local8.field3 = Test25Lib.local8;
Test25Lib.local8.field4 = Test25Lib.local9;
Test25Lib.local9.field9 = Test25Lib.local5;
Test25Lib.local9.field10 = Test25Lib.local8;
Test25Lib.local9.field11 = Test25Lib.local9;
Test25Lib.local9.field5 = Test25Lib.local9;
Test25Lib.local9.field6 = Test25Lib.local10;
Test25Lib.local9.field7 = Test25Lib.local10;
Test25Lib.local9.field8 = Test25Lib.local5;
Test25Lib.local9.field1 = Test25Lib.local10;
Test25Lib.local9.field2 = Test25Lib.local6;
Test25Lib.local9.field3 = Test25Lib.local2;
Test25Lib.local9.field4 = Test25Lib.local10;
Test25Lib.local10.field9 = Test25Lib.local7;
Test25Lib.local10.field10 = Test25Lib.local10;
Test25Lib.local10.field11 = Test25Lib.local10;
Test25Lib.local10.field5 = Test25Lib.local9;
Test25Lib.local10.field6 = Test25Lib.local10;
Test25Lib.local10.field7 = Test25Lib.local10;
Test25Lib.local10.field8 = Test25Lib.local10;
Test25Lib.local10.field1 = Test25Lib.local10;
Test25Lib.local10.field2 = Test25Lib.local6;
Test25Lib.local10.field3 = Test25Lib.local10;
Test25Lib.local10.field4 = Test25Lib.local10;
if (inputValue>=3) {
if (inputValue==2) {
Test25Lib.local4.field2.method5(3);
}else {
for (int local27 = 0; local27<=3; local27 += 1) {
Test25Lib.local3.field4.method9(Test25Lib.local2.field1,3);
}
}
}else {
if (inputValue<4) {
for (int local28 = 0; local28<=3; local28 += 1) {
Test25Lib.local6.field7=Test25Lib.local2.field1;
}
}else {
Test25Lib.local8=Test25Lib.local1.field2.method5(3);
}
}
Test25Lib.local8.method7(Test25Lib.local3.field3,Test25Lib.local8.field6,3);
if (inputValue>3) {
for (int local29 = 0; local29<=1; local29 += 1) {
if (inputValue<3) {
if (inputValue>=4) {
Test25Lib.local9.field8=Test25Lib.local10.field8;
}
}else {
Test25Lib.local10.field3=Test25Lib.local9.field9.method1(Test25Lib.local8.field8,3);
}
}
}else {
Test25Lib.local3.field1=Test25Lib.local9.field11.method5(3);
}
Test25Lib.local2.field3=Test25Lib.local8.field2;
for (int local30 = 0; local30<=3; local30 += 1) {
Test25Lib.local10.field8=Test25Lib.local4.field2.method1(Test25Lib.local6.field8,3);
}
if (inputValue==3) {
if (inputValue>1) {
for (int local31 = 0; local31<=2; local31 += 1) {
Test25Lib.local7.field2=Test25Lib.local8.field2;
}
}
}
for (int local32 = 0; local32<=2; local32 += 1) {
Test25Lib.local10.field11=Test25Lib.local9.field7;
}
if (inputValue>3) {
Test25Lib.local7.field6.method7(Test25Lib.local9.field3,Test25Lib.local8.field5,3);
}
Test25Lib.local4.field4.method8(Test25Lib.local2.field4,Test25Lib.local7,3);
Test25Lib.local10.field6=Test25Lib.local9.field6;
Benchmark.test(1,Test25Lib.local1);
Benchmark.test(2,Test25Lib.local2);
Benchmark.test(3,Test25Lib.local3);
Benchmark.test(4,Test25Lib.local4);
Benchmark.test(5,Test25Lib.local5);
Benchmark.test(6,Test25Lib.local6);
Benchmark.test(7,Test25Lib.local7);
Benchmark.test(8,Test25Lib.local8);
Benchmark.test(9,Test25Lib.local9);
Benchmark.test(10,Test25Lib.local10);
Benchmark.test(11,Test25Lib.local1.field1);
Benchmark.test(12,Test25Lib.local1.field2);
Benchmark.test(13,Test25Lib.local1.field3);
Benchmark.test(14,Test25Lib.local1.field4);
Benchmark.test(15,Test25Lib.local2.field1);
Benchmark.test(16,Test25Lib.local2.field2);
Benchmark.test(17,Test25Lib.local2.field3);
Benchmark.test(18,Test25Lib.local2.field4);
Benchmark.test(19,Test25Lib.local3.field1);
Benchmark.test(20,Test25Lib.local3.field2);
Benchmark.test(21,Test25Lib.local3.field3);
Benchmark.test(22,Test25Lib.local3.field4);
Benchmark.test(23,Test25Lib.local4.field1);
Benchmark.test(24,Test25Lib.local4.field2);
Benchmark.test(25,Test25Lib.local4.field3);
Benchmark.test(26,Test25Lib.local4.field4);
Benchmark.test(27,Test25Lib.local5.field1);
Benchmark.test(28,Test25Lib.local5.field2);
Benchmark.test(29,Test25Lib.local5.field3);
Benchmark.test(30,Test25Lib.local5.field4);
Benchmark.test(31,Test25Lib.local6.field5);
Benchmark.test(32,Test25Lib.local6.field6);
Benchmark.test(33,Test25Lib.local6.field7);
Benchmark.test(34,Test25Lib.local6.field8);
Benchmark.test(35,Test25Lib.local6.field1);
Benchmark.test(36,Test25Lib.local6.field2);
Benchmark.test(37,Test25Lib.local6.field3);
Benchmark.test(38,Test25Lib.local6.field4);
Benchmark.test(39,Test25Lib.local7.field5);
Benchmark.test(40,Test25Lib.local7.field6);
Benchmark.test(41,Test25Lib.local7.field7);
Benchmark.test(42,Test25Lib.local7.field8);
Benchmark.test(43,Test25Lib.local7.field1);
Benchmark.test(44,Test25Lib.local7.field2);
Benchmark.test(45,Test25Lib.local7.field3);
Benchmark.test(46,Test25Lib.local7.field4);
Benchmark.test(47,Test25Lib.local8.field5);
Benchmark.test(48,Test25Lib.local8.field6);
Benchmark.test(49,Test25Lib.local8.field7);
Benchmark.test(50,Test25Lib.local8.field8);
Benchmark.test(51,Test25Lib.local8.field1);
Benchmark.test(52,Test25Lib.local8.field2);
Benchmark.test(53,Test25Lib.local8.field3);
Benchmark.test(54,Test25Lib.local8.field4);
Benchmark.test(55,Test25Lib.local9.field9);
Benchmark.test(56,Test25Lib.local9.field10);
Benchmark.test(57,Test25Lib.local9.field11);
Benchmark.test(58,Test25Lib.local9.field5);
Benchmark.test(59,Test25Lib.local9.field6);
Benchmark.test(60,Test25Lib.local9.field7);
Benchmark.test(61,Test25Lib.local9.field8);
Benchmark.test(62,Test25Lib.local9.field1);
Benchmark.test(63,Test25Lib.local9.field2);
Benchmark.test(64,Test25Lib.local9.field3);
Benchmark.test(65,Test25Lib.local9.field4);
Benchmark.test(66,Test25Lib.local10.field9);
Benchmark.test(67,Test25Lib.local10.field10);
Benchmark.test(68,Test25Lib.local10.field11);
Benchmark.test(69,Test25Lib.local10.field5);
Benchmark.test(70,Test25Lib.local10.field6);
Benchmark.test(71,Test25Lib.local10.field7);
Benchmark.test(72,Test25Lib.local10.field8);
Benchmark.test(73,Test25Lib.local10.field1);
Benchmark.test(74,Test25Lib.local10.field2);
Benchmark.test(75,Test25Lib.local10.field3);
Benchmark.test(76,Test25Lib.local10.field4);
Benchmark.print();
}
}
