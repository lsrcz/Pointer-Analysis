package dataset;

import benchmark.internal.Benchmark;
import benchmark.tool.BasicClass;
class Test43Lib{
public static Test43Class1 local1;
public static Test43Class1 local2;
public static Test43Class1 local3;
public static Test43Class1 local4;
public static Test43Class2 local5;
public static Test43Class2 local6;
public static Test43Class2 local7;
public static Test43Class2 local8;
public static Test43Class2 local9;
public static Test43Class3 local10;
public static Test43Class3 local11;
public static Test43Class3 local12;
}
class Test43Class1 extends BasicClass {
public static Test43Class1 field1;
public Test43Class3 field2;
public static Test43Class3 field3;
public Test43Class1 field4;
public Test43Class3 field5;
public void method1(int depth) {
if (depth == 0) return;
if (depth<2) {
if (depth==3) {
if (depth<=3) {
for (int local13 = 0; local13<=0; local13 += 1) {
for (int local14 = 0; local14<=2; local14 += 1) {
}
}
}else {
for (int local15 = 0; local15<=1; local15 += 1) {
this.field3.method7(this.field1,depth-1);
}
}
}else {
if (depth==2) {
this.field5.method6(depth-1);
}
}
}
for (int local16 = 0; local16<=2; local16 += 1) {
for (int local17 = 0; local17<=0; local17 += 1) {
for (int local18 = 0; local18<=2; local18 += 1) {
this.field3=this.field2;
}
}
}
}
public Test43Class2 method2(Test43Class1 arg0, Test43Class2 arg1, int depth) {
if (depth == 0) return Test43Lib.local9;
return arg1.field8;
}
}
class Test43Class2 extends Test43Class1 {
public static Test43Class1 field6;
public Test43Class1 field7;
public static Test43Class2 field8;
public static Test43Class3 field9;
public static Test43Class2 field10;
public static Test43Class1 field11;
public static Test43Class3 method3(Test43Class2 arg0, int depth) {
if (depth == 0) return Test43Lib.local11;
for (int local19 = 0; local19<=1; local19 += 1) {
for (int local20 = 0; local20<=1; local20 += 1) {
for (int local21 = 0; local21<=2; local21 += 1) {
field8.field8=field8;
}
}
}
return field1.field5;
}
public Test43Class1 method4(int depth) {
if (depth == 0) return Test43Lib.local8;
this.field9=this.field5;
for (int local22 = 0; local22<=0; local22 += 1) {
if (depth>2) {
this.field6=this.field2.method2(this.field7,this,depth-1);
}else {
for (int local23 = 0; local23<=3; local23 += 1) {
this.field1=this.method2(this.field6,this,depth-1);
}
}
}
return this.field4;
}
public void method5(int depth) {
if (depth == 0) return;
}
}
class Test43Class3 extends Test43Class1 {
public static Test43Class3 field12;
public static Test43Class3 field13;
public Test43Class3 field14;
public static Test43Class1 field15;
public Test43Class1 field16;
public Test43Class3 method6(int depth) {
if (depth == 0) return Test43Lib.local12;
if (depth==3) {
for (int local24 = 0; local24<=1; local24 += 1) {
for (int local25 = 0; local25<=2; local25 += 1) {
this.field12.method9(this.field16,depth-1);
}
}
}
return this.field5;
}
public void method7(Test43Class1 arg0, int depth) {
if (depth == 0) return;
for (int local26 = 0; local26<=1; local26 += 1) {
arg0.field4=this.field2.method8(arg0.field5,this.field4,depth-1);
}
}
public static Test43Class1 method8(Test43Class3 arg0, Test43Class1 arg1, int depth) {
if (depth == 0) return Test43Lib.local11;
for (int local27 = 0; local27<=3; local27 += 1) {
for (int local28 = 0; local28<=1; local28 += 1) {
if (depth<1) {
if (depth<=2) {
arg1.field5.method6(depth-1);
}
}
}
}
field1.field2=arg0.field5;
return field12.field1;
}
public static void method9(Test43Class1 arg0, int depth) {
if (depth == 0) return;
field15.field2.method7(field12,depth-1);
}
}
public class Test43{
public static void main(String[] args) {
int inputValue = 0;
Benchmark.alloc(1);
Test43Lib.local1 = new Test43Class1();
Benchmark.alloc(2);
Test43Lib.local2 = new Test43Class1();
Benchmark.alloc(3);
Test43Lib.local3 = new Test43Class1();
Benchmark.alloc(4);
Test43Lib.local4 = new Test43Class1();
Benchmark.alloc(5);
Test43Lib.local5 = new Test43Class2();
Benchmark.alloc(6);
Test43Lib.local6 = new Test43Class2();
Benchmark.alloc(7);
Test43Lib.local7 = new Test43Class2();
Benchmark.alloc(8);
Test43Lib.local8 = new Test43Class2();
Benchmark.alloc(9);
Test43Lib.local9 = new Test43Class2();
Benchmark.alloc(10);
Test43Lib.local10 = new Test43Class3();
Benchmark.alloc(11);
Test43Lib.local11 = new Test43Class3();
Benchmark.alloc(12);
Test43Lib.local12 = new Test43Class3();
Test43Lib.local1.field1 = Test43Lib.local6;
Test43Lib.local1.field2 = Test43Lib.local11;
Test43Lib.local1.field3 = Test43Lib.local12;
Test43Lib.local1.field4 = Test43Lib.local1;
Test43Lib.local1.field5 = Test43Lib.local11;
Test43Lib.local2.field1 = Test43Lib.local6;
Test43Lib.local2.field2 = Test43Lib.local11;
Test43Lib.local2.field3 = Test43Lib.local12;
Test43Lib.local2.field4 = Test43Lib.local9;
Test43Lib.local2.field5 = Test43Lib.local10;
Test43Lib.local3.field1 = Test43Lib.local1;
Test43Lib.local3.field2 = Test43Lib.local10;
Test43Lib.local3.field3 = Test43Lib.local12;
Test43Lib.local3.field4 = Test43Lib.local5;
Test43Lib.local3.field5 = Test43Lib.local11;
Test43Lib.local4.field1 = Test43Lib.local10;
Test43Lib.local4.field2 = Test43Lib.local11;
Test43Lib.local4.field3 = Test43Lib.local10;
Test43Lib.local4.field4 = Test43Lib.local6;
Test43Lib.local4.field5 = Test43Lib.local11;
Test43Lib.local5.field6 = Test43Lib.local6;
Test43Lib.local5.field7 = Test43Lib.local9;
Test43Lib.local5.field8 = Test43Lib.local6;
Test43Lib.local5.field9 = Test43Lib.local12;
Test43Lib.local5.field10 = Test43Lib.local9;
Test43Lib.local5.field11 = Test43Lib.local2;
Test43Lib.local5.field1 = Test43Lib.local3;
Test43Lib.local5.field2 = Test43Lib.local12;
Test43Lib.local5.field3 = Test43Lib.local12;
Test43Lib.local5.field4 = Test43Lib.local5;
Test43Lib.local5.field5 = Test43Lib.local11;
Test43Lib.local6.field6 = Test43Lib.local8;
Test43Lib.local6.field7 = Test43Lib.local5;
Test43Lib.local6.field8 = Test43Lib.local6;
Test43Lib.local6.field9 = Test43Lib.local11;
Test43Lib.local6.field10 = Test43Lib.local8;
Test43Lib.local6.field11 = Test43Lib.local7;
Test43Lib.local6.field1 = Test43Lib.local12;
Test43Lib.local6.field2 = Test43Lib.local12;
Test43Lib.local6.field3 = Test43Lib.local12;
Test43Lib.local6.field4 = Test43Lib.local4;
Test43Lib.local6.field5 = Test43Lib.local11;
Test43Lib.local7.field6 = Test43Lib.local6;
Test43Lib.local7.field7 = Test43Lib.local2;
Test43Lib.local7.field8 = Test43Lib.local6;
Test43Lib.local7.field9 = Test43Lib.local12;
Test43Lib.local7.field10 = Test43Lib.local6;
Test43Lib.local7.field11 = Test43Lib.local7;
Test43Lib.local7.field1 = Test43Lib.local6;
Test43Lib.local7.field2 = Test43Lib.local10;
Test43Lib.local7.field3 = Test43Lib.local10;
Test43Lib.local7.field4 = Test43Lib.local9;
Test43Lib.local7.field5 = Test43Lib.local10;
Test43Lib.local8.field6 = Test43Lib.local5;
Test43Lib.local8.field7 = Test43Lib.local8;
Test43Lib.local8.field8 = Test43Lib.local6;
Test43Lib.local8.field9 = Test43Lib.local12;
Test43Lib.local8.field10 = Test43Lib.local6;
Test43Lib.local8.field11 = Test43Lib.local2;
Test43Lib.local8.field1 = Test43Lib.local11;
Test43Lib.local8.field2 = Test43Lib.local12;
Test43Lib.local8.field3 = Test43Lib.local12;
Test43Lib.local8.field4 = Test43Lib.local5;
Test43Lib.local8.field5 = Test43Lib.local12;
Test43Lib.local9.field6 = Test43Lib.local11;
Test43Lib.local9.field7 = Test43Lib.local1;
Test43Lib.local9.field8 = Test43Lib.local5;
Test43Lib.local9.field9 = Test43Lib.local11;
Test43Lib.local9.field10 = Test43Lib.local7;
Test43Lib.local9.field11 = Test43Lib.local7;
Test43Lib.local9.field1 = Test43Lib.local3;
Test43Lib.local9.field2 = Test43Lib.local12;
Test43Lib.local9.field3 = Test43Lib.local12;
Test43Lib.local9.field4 = Test43Lib.local2;
Test43Lib.local9.field5 = Test43Lib.local11;
Test43Lib.local10.field12 = Test43Lib.local10;
Test43Lib.local10.field13 = Test43Lib.local11;
Test43Lib.local10.field14 = Test43Lib.local11;
Test43Lib.local10.field15 = Test43Lib.local3;
Test43Lib.local10.field16 = Test43Lib.local7;
Test43Lib.local10.field1 = Test43Lib.local6;
Test43Lib.local10.field2 = Test43Lib.local11;
Test43Lib.local10.field3 = Test43Lib.local12;
Test43Lib.local10.field4 = Test43Lib.local3;
Test43Lib.local10.field5 = Test43Lib.local12;
Test43Lib.local11.field12 = Test43Lib.local12;
Test43Lib.local11.field13 = Test43Lib.local12;
Test43Lib.local11.field14 = Test43Lib.local11;
Test43Lib.local11.field15 = Test43Lib.local3;
Test43Lib.local11.field16 = Test43Lib.local7;
Test43Lib.local11.field1 = Test43Lib.local5;
Test43Lib.local11.field2 = Test43Lib.local12;
Test43Lib.local11.field3 = Test43Lib.local10;
Test43Lib.local11.field4 = Test43Lib.local12;
Test43Lib.local11.field5 = Test43Lib.local10;
Test43Lib.local12.field12 = Test43Lib.local10;
Test43Lib.local12.field13 = Test43Lib.local12;
Test43Lib.local12.field14 = Test43Lib.local10;
Test43Lib.local12.field15 = Test43Lib.local10;
Test43Lib.local12.field16 = Test43Lib.local2;
Test43Lib.local12.field1 = Test43Lib.local10;
Test43Lib.local12.field2 = Test43Lib.local11;
Test43Lib.local12.field3 = Test43Lib.local10;
Test43Lib.local12.field4 = Test43Lib.local5;
Test43Lib.local12.field5 = Test43Lib.local11;
if (inputValue>=2) {
if (inputValue<1) {
if (inputValue>=3) {
if (inputValue>4) {
for (int local29 = 0; local29<=0; local29 += 1) {
}
}
}else {
Test43Lib.local6.field2=Test43Lib.local9.field8.method3(Test43Lib.local6.field10,3);
}
}else {
if (inputValue>2) {
Test43Lib.local9.field4=Test43Lib.local2.field4;
}else {
Test43Lib.local10.field1=Test43Lib.local10.field2.method6(3);
}
}
}else {
if (inputValue>2) {
Test43Lib.local5.field5=Test43Lib.local4.field3;
}else {
if (inputValue>4) {
if (inputValue==3) {
if (inputValue>1) {
}else {
}
}
}else {
if (inputValue<4) {
if (inputValue<2) {
}
}
}
}
}
if (inputValue>=3) {
if (inputValue>4) {
for (int local30 = 0; local30<=3; local30 += 1) {
Test43Lib.local1.field1=Test43Lib.local4.field5.method6(3);
}
}else {
Test43Lib.local6=Test43Lib.local7.field10;
}
}
for (int local31 = 0; local31<=0; local31 += 1) {
Test43Lib.local5.field8.method3(Test43Lib.local6,3);
}
Benchmark.test(1,Test43Lib.local1);
Benchmark.test(2,Test43Lib.local2);
Benchmark.test(3,Test43Lib.local3);
Benchmark.test(4,Test43Lib.local4);
Benchmark.test(5,Test43Lib.local5);
Benchmark.test(6,Test43Lib.local6);
Benchmark.test(7,Test43Lib.local7);
Benchmark.test(8,Test43Lib.local8);
Benchmark.test(9,Test43Lib.local9);
Benchmark.test(10,Test43Lib.local10);
Benchmark.test(11,Test43Lib.local11);
Benchmark.test(12,Test43Lib.local12);
Benchmark.test(13,Test43Lib.local1.field1);
Benchmark.test(14,Test43Lib.local1.field2);
Benchmark.test(15,Test43Lib.local1.field3);
Benchmark.test(16,Test43Lib.local1.field4);
Benchmark.test(17,Test43Lib.local1.field5);
Benchmark.test(18,Test43Lib.local2.field1);
Benchmark.test(19,Test43Lib.local2.field2);
Benchmark.test(20,Test43Lib.local2.field3);
Benchmark.test(21,Test43Lib.local2.field4);
Benchmark.test(22,Test43Lib.local2.field5);
Benchmark.test(23,Test43Lib.local3.field1);
Benchmark.test(24,Test43Lib.local3.field2);
Benchmark.test(25,Test43Lib.local3.field3);
Benchmark.test(26,Test43Lib.local3.field4);
Benchmark.test(27,Test43Lib.local3.field5);
Benchmark.test(28,Test43Lib.local4.field1);
Benchmark.test(29,Test43Lib.local4.field2);
Benchmark.test(30,Test43Lib.local4.field3);
Benchmark.test(31,Test43Lib.local4.field4);
Benchmark.test(32,Test43Lib.local4.field5);
Benchmark.test(33,Test43Lib.local5.field6);
Benchmark.test(34,Test43Lib.local5.field7);
Benchmark.test(35,Test43Lib.local5.field8);
Benchmark.test(36,Test43Lib.local5.field9);
Benchmark.test(37,Test43Lib.local5.field10);
Benchmark.test(38,Test43Lib.local5.field11);
Benchmark.test(39,Test43Lib.local5.field1);
Benchmark.test(40,Test43Lib.local5.field2);
Benchmark.test(41,Test43Lib.local5.field3);
Benchmark.test(42,Test43Lib.local5.field4);
Benchmark.test(43,Test43Lib.local5.field5);
Benchmark.test(44,Test43Lib.local6.field6);
Benchmark.test(45,Test43Lib.local6.field7);
Benchmark.test(46,Test43Lib.local6.field8);
Benchmark.test(47,Test43Lib.local6.field9);
Benchmark.test(48,Test43Lib.local6.field10);
Benchmark.test(49,Test43Lib.local6.field11);
Benchmark.test(50,Test43Lib.local6.field1);
Benchmark.test(51,Test43Lib.local6.field2);
Benchmark.test(52,Test43Lib.local6.field3);
Benchmark.test(53,Test43Lib.local6.field4);
Benchmark.test(54,Test43Lib.local6.field5);
Benchmark.test(55,Test43Lib.local7.field6);
Benchmark.test(56,Test43Lib.local7.field7);
Benchmark.test(57,Test43Lib.local7.field8);
Benchmark.test(58,Test43Lib.local7.field9);
Benchmark.test(59,Test43Lib.local7.field10);
Benchmark.test(60,Test43Lib.local7.field11);
Benchmark.test(61,Test43Lib.local7.field1);
Benchmark.test(62,Test43Lib.local7.field2);
Benchmark.test(63,Test43Lib.local7.field3);
Benchmark.test(64,Test43Lib.local7.field4);
Benchmark.test(65,Test43Lib.local7.field5);
Benchmark.test(66,Test43Lib.local8.field6);
Benchmark.test(67,Test43Lib.local8.field7);
Benchmark.test(68,Test43Lib.local8.field8);
Benchmark.test(69,Test43Lib.local8.field9);
Benchmark.test(70,Test43Lib.local8.field10);
Benchmark.test(71,Test43Lib.local8.field11);
Benchmark.test(72,Test43Lib.local8.field1);
Benchmark.test(73,Test43Lib.local8.field2);
Benchmark.test(74,Test43Lib.local8.field3);
Benchmark.test(75,Test43Lib.local8.field4);
Benchmark.test(76,Test43Lib.local8.field5);
Benchmark.test(77,Test43Lib.local9.field6);
Benchmark.test(78,Test43Lib.local9.field7);
Benchmark.test(79,Test43Lib.local9.field8);
Benchmark.test(80,Test43Lib.local9.field9);
Benchmark.test(81,Test43Lib.local9.field10);
Benchmark.test(82,Test43Lib.local9.field11);
Benchmark.test(83,Test43Lib.local9.field1);
Benchmark.test(84,Test43Lib.local9.field2);
Benchmark.test(85,Test43Lib.local9.field3);
Benchmark.test(86,Test43Lib.local9.field4);
Benchmark.test(87,Test43Lib.local9.field5);
Benchmark.test(88,Test43Lib.local10.field12);
Benchmark.test(89,Test43Lib.local10.field13);
Benchmark.test(90,Test43Lib.local10.field14);
Benchmark.test(91,Test43Lib.local10.field15);
Benchmark.test(92,Test43Lib.local10.field16);
Benchmark.test(93,Test43Lib.local10.field1);
Benchmark.test(94,Test43Lib.local10.field2);
Benchmark.test(95,Test43Lib.local10.field3);
Benchmark.test(96,Test43Lib.local10.field4);
Benchmark.test(97,Test43Lib.local10.field5);
Benchmark.test(98,Test43Lib.local11.field12);
Benchmark.test(99,Test43Lib.local11.field13);
Benchmark.test(100,Test43Lib.local11.field14);
Benchmark.test(101,Test43Lib.local11.field15);
Benchmark.test(102,Test43Lib.local11.field16);
Benchmark.test(103,Test43Lib.local11.field1);
Benchmark.test(104,Test43Lib.local11.field2);
Benchmark.test(105,Test43Lib.local11.field3);
Benchmark.test(106,Test43Lib.local11.field4);
Benchmark.test(107,Test43Lib.local11.field5);
Benchmark.test(108,Test43Lib.local12.field12);
Benchmark.test(109,Test43Lib.local12.field13);
Benchmark.test(110,Test43Lib.local12.field14);
Benchmark.test(111,Test43Lib.local12.field15);
Benchmark.test(112,Test43Lib.local12.field16);
Benchmark.test(113,Test43Lib.local12.field1);
Benchmark.test(114,Test43Lib.local12.field2);
Benchmark.test(115,Test43Lib.local12.field3);
Benchmark.test(116,Test43Lib.local12.field4);
Benchmark.test(117,Test43Lib.local12.field5);
Benchmark.print();
}
}
