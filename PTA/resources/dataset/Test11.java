package dataset;

import benchmark.internal.Benchmark;
import benchmark.tool.BasicClass;
class Test11Lib{
public static Test11Class1 local1;
public static Test11Class1 local2;
public static Test11Class1 local3;
public static Test11Class2 local4;
public static Test11Class2 local5;
public static Test11Class2 local6;
public static Test11Class2 local7;
}
class Test11Class1 extends BasicClass {
public static Test11Class1 field1;
public static Test11Class2 field2;
public Test11Class1 field3;
public Test11Class2 field4;
public Test11Class2 field5;
public Test11Class1 field6;
public static Test11Class1 field7;
public static Test11Class1 field8;
public static void method1(int depth) {
if (depth == 0) return;
field2.field8=field2;
for (int local8 = 0; local8<=2; local8 += 1) {
if (depth>4) {
field2.field18=field2.field1;
}else {
if (depth==2) {
field1.field4=field2;
}else {
field2.field4=field2.field11;
}
}
}
field1.field2.method4(field8.field4,depth-1);
for (int local9 = 0; local9<=0; local9 += 1) {
field2.field2=field8.field5.method11(field8.field1,depth-1);
}
}
public static void method2(Test11Class2 arg0, int depth) {
if (depth == 0) return;
arg0.field4=arg0;
field8.field5=arg0.field4;
field1.field5.method10(field7.field4,field8.field4,depth-1);
arg0.field8=field2;
field2.field9=field2.field16.method11(field2.field1,depth-1);
field1.field5.method6(field7.field4,depth-1);
arg0.field17.method8(field2.field12,field1.field1,depth-1);
}
public static Test11Class2 method3(Test11Class1 arg0, Test11Class1 arg1, int depth) {
if (depth == 0) return Test11Lib.local5;
return arg0.field4;
}
}
class Test11Class2 extends Test11Class1 {
public static Test11Class1 field9;
public Test11Class2 field10;
public Test11Class2 field11;
public Test11Class2 field12;
public Test11Class2 field13;
public Test11Class1 field14;
public Test11Class1 field15;
public static Test11Class2 field16;
public static Test11Class2 field17;
public static Test11Class1 field18;
public Test11Class1 method4(Test11Class2 arg0, int depth) {
if (depth == 0) return Test11Lib.local6;
arg0.field14=arg0.field2.method4(this.field12,depth-1);
return this.field4;
}
public static void method5(Test11Class2 arg0, Test11Class1 arg1, int depth) {
if (depth == 0) return;
field17.field12.method11(field8.field2,depth-1);
field18.field3=arg1.field4;
for (int local10 = 0; local10<=1; local10 += 1) {
if (depth<=3) {
arg0.field6=field18;
}
}
field2.method12(field16.field10,arg0.field2,depth-1);
for (int local11 = 0; local11<=0; local11 += 1) {
if (depth>1) {
field16.field12=field2.field13;
}
}
}
public void method6(Test11Class2 arg0, int depth) {
if (depth == 0) return;
for (int local12 = 0; local12<=2; local12 += 1) {
if (depth>=3) {
for (int local13 = 0; local13<=0; local13 += 1) {
for (int local14 = 0; local14<=3; local14 += 1) {
this.field13.method10(this.field15,this.field16,depth-1);
}
}
}
}
if (depth<=3) {
this.field16.method7(depth-1);
}else {
arg0.field12=arg0.field16;
}
this.field5=arg0;
this.field2.method12(this.field12,this.field2,depth-1);
}
public void method7(int depth) {
if (depth == 0) return;
for (int local15 = 0; local15<=3; local15 += 1) {
this.field13=this.field17;
}
this.field8=this.field17;
}
public static Test11Class1 method8(Test11Class2 arg0, Test11Class1 arg1, int depth) {
if (depth == 0) return Test11Lib.local3;
for (int local16 = 0; local16<=0; local16 += 1) {
if (depth>=2) {
arg0.field17.method12(field2,field9.field4,depth-1);
}
}
for (int local17 = 0; local17<=2; local17 += 1) {
arg0.field13.method2(field2.field4,depth-1);
}
arg0.field8.method1(depth-1);
field7.field4=field17.field17;
arg0.field4=arg0.field4;
arg0.field17.method11(field16.field2,depth-1);
return field7.field5;
}
public static Test11Class2 method9(Test11Class2 arg0, Test11Class1 arg1, int depth) {
if (depth == 0) return Test11Lib.local7;
for (int local18 = 0; local18<=1; local18 += 1) {
field2.field1=field17.field12.method4(field17.field13,depth-1);
}
if (depth<4) {
if (depth<=1) {
field2.field18=field2.field11;
}else {
field2.field10.method6(field1.field4,depth-1);
}
}
if (depth<=4) {
field9.field8=arg0.field13;
}
field18.field8=field1.field2;
field18.field7=arg0.field11;
if (depth>3) {
field2.field9=field2.field2.method3(field2.field4,field2.field4,depth-1);
}
field16.field11.method6(arg0.field10,depth-1);
for (int local19 = 0; local19<=2; local19 += 1) {
if (depth==1) {
field2.field4.method10(field16.field14,field1.field2,depth-1);
}
}
return field2.field2;
}
public static void method10(Test11Class1 arg0, Test11Class2 arg1, int depth) {
if (depth == 0) return;
arg0.field2=field8.field2;
field7.field5.method7(depth-1);
field17.field5.method10(arg1,field8.field4,depth-1);
for (int local20 = 0; local20<=0; local20 += 1) {
field16.field2.method7(depth-1);
}
arg1.method13(depth-1);
for (int local21 = 0; local21<=1; local21 += 1) {
arg0.field6.method1(depth-1);
}
if (depth>4) {
field9.field7.method2(arg1.field4,depth-1);
}else {
field17.field13.method1(depth-1);
}
}
public Test11Class2 method11(Test11Class1 arg0, int depth) {
if (depth == 0) return Test11Lib.local4;
arg0.field5.method6(this.field12,depth-1);
if (depth>=1) {
arg0.field4.method2(this.field13,depth-1);
}
this.field7.method2(this.field16,depth-1);
this.field2=arg0.field5;
this.field10.method3(this.field13,this.field10,depth-1);
this.field12=arg0.field4;
if (depth>1) {
this.field12=this.field13;
}else {
for (int local22 = 0; local22<=3; local22 += 1) {
for (int local23 = 0; local23<=2; local23 += 1) {
this.field17=this.field16;
}
}
}
return this.field16;
}
public void method12(Test11Class2 arg0, Test11Class2 arg1, int depth) {
if (depth == 0) return;
}
public void method13(int depth) {
if (depth == 0) return;
this.field5.method9(this.field11,this.field4,depth-1);
this.field8=this.field8;
this.field5.method8(this.field17,this.field3,depth-1);
this.field1=this.field17;
this.field17.method7(depth-1);
}
}
public class Test11{
public static void main(String[] args) {
int inputValue = 0;
Benchmark.alloc(1);
Test11Lib.local1 = new Test11Class1();
Benchmark.alloc(2);
Test11Lib.local2 = new Test11Class1();
Benchmark.alloc(3);
Test11Lib.local3 = new Test11Class1();
Benchmark.alloc(4);
Test11Lib.local4 = new Test11Class2();
Benchmark.alloc(5);
Test11Lib.local5 = new Test11Class2();
Benchmark.alloc(6);
Test11Lib.local6 = new Test11Class2();
Benchmark.alloc(7);
Test11Lib.local7 = new Test11Class2();
Test11Lib.local1.field1 = Test11Lib.local1;
Test11Lib.local1.field2 = Test11Lib.local5;
Test11Lib.local1.field3 = Test11Lib.local7;
Test11Lib.local1.field4 = Test11Lib.local5;
Test11Lib.local1.field5 = Test11Lib.local6;
Test11Lib.local1.field6 = Test11Lib.local5;
Test11Lib.local1.field7 = Test11Lib.local6;
Test11Lib.local1.field8 = Test11Lib.local2;
Test11Lib.local2.field1 = Test11Lib.local1;
Test11Lib.local2.field2 = Test11Lib.local7;
Test11Lib.local2.field3 = Test11Lib.local2;
Test11Lib.local2.field4 = Test11Lib.local5;
Test11Lib.local2.field5 = Test11Lib.local4;
Test11Lib.local2.field6 = Test11Lib.local3;
Test11Lib.local2.field7 = Test11Lib.local2;
Test11Lib.local2.field8 = Test11Lib.local7;
Test11Lib.local3.field1 = Test11Lib.local4;
Test11Lib.local3.field2 = Test11Lib.local6;
Test11Lib.local3.field3 = Test11Lib.local5;
Test11Lib.local3.field4 = Test11Lib.local4;
Test11Lib.local3.field5 = Test11Lib.local5;
Test11Lib.local3.field6 = Test11Lib.local4;
Test11Lib.local3.field7 = Test11Lib.local7;
Test11Lib.local3.field8 = Test11Lib.local2;
Test11Lib.local4.field9 = Test11Lib.local6;
Test11Lib.local4.field10 = Test11Lib.local5;
Test11Lib.local4.field11 = Test11Lib.local6;
Test11Lib.local4.field12 = Test11Lib.local6;
Test11Lib.local4.field13 = Test11Lib.local7;
Test11Lib.local4.field14 = Test11Lib.local5;
Test11Lib.local4.field15 = Test11Lib.local6;
Test11Lib.local4.field16 = Test11Lib.local7;
Test11Lib.local4.field17 = Test11Lib.local4;
Test11Lib.local4.field18 = Test11Lib.local3;
Test11Lib.local4.field1 = Test11Lib.local2;
Test11Lib.local4.field2 = Test11Lib.local5;
Test11Lib.local4.field3 = Test11Lib.local2;
Test11Lib.local4.field4 = Test11Lib.local6;
Test11Lib.local4.field5 = Test11Lib.local5;
Test11Lib.local4.field6 = Test11Lib.local4;
Test11Lib.local4.field7 = Test11Lib.local5;
Test11Lib.local4.field8 = Test11Lib.local1;
Test11Lib.local5.field9 = Test11Lib.local7;
Test11Lib.local5.field10 = Test11Lib.local4;
Test11Lib.local5.field11 = Test11Lib.local4;
Test11Lib.local5.field12 = Test11Lib.local7;
Test11Lib.local5.field13 = Test11Lib.local6;
Test11Lib.local5.field14 = Test11Lib.local4;
Test11Lib.local5.field15 = Test11Lib.local6;
Test11Lib.local5.field16 = Test11Lib.local7;
Test11Lib.local5.field17 = Test11Lib.local7;
Test11Lib.local5.field18 = Test11Lib.local5;
Test11Lib.local5.field1 = Test11Lib.local6;
Test11Lib.local5.field2 = Test11Lib.local4;
Test11Lib.local5.field3 = Test11Lib.local2;
Test11Lib.local5.field4 = Test11Lib.local6;
Test11Lib.local5.field5 = Test11Lib.local4;
Test11Lib.local5.field6 = Test11Lib.local3;
Test11Lib.local5.field7 = Test11Lib.local6;
Test11Lib.local5.field8 = Test11Lib.local3;
Test11Lib.local6.field9 = Test11Lib.local5;
Test11Lib.local6.field10 = Test11Lib.local4;
Test11Lib.local6.field11 = Test11Lib.local5;
Test11Lib.local6.field12 = Test11Lib.local4;
Test11Lib.local6.field13 = Test11Lib.local4;
Test11Lib.local6.field14 = Test11Lib.local7;
Test11Lib.local6.field15 = Test11Lib.local5;
Test11Lib.local6.field16 = Test11Lib.local6;
Test11Lib.local6.field17 = Test11Lib.local6;
Test11Lib.local6.field18 = Test11Lib.local3;
Test11Lib.local6.field1 = Test11Lib.local7;
Test11Lib.local6.field2 = Test11Lib.local6;
Test11Lib.local6.field3 = Test11Lib.local4;
Test11Lib.local6.field4 = Test11Lib.local5;
Test11Lib.local6.field5 = Test11Lib.local4;
Test11Lib.local6.field6 = Test11Lib.local3;
Test11Lib.local6.field7 = Test11Lib.local5;
Test11Lib.local6.field8 = Test11Lib.local4;
Test11Lib.local7.field9 = Test11Lib.local2;
Test11Lib.local7.field10 = Test11Lib.local4;
Test11Lib.local7.field11 = Test11Lib.local4;
Test11Lib.local7.field12 = Test11Lib.local4;
Test11Lib.local7.field13 = Test11Lib.local7;
Test11Lib.local7.field14 = Test11Lib.local7;
Test11Lib.local7.field15 = Test11Lib.local5;
Test11Lib.local7.field16 = Test11Lib.local7;
Test11Lib.local7.field17 = Test11Lib.local6;
Test11Lib.local7.field18 = Test11Lib.local7;
Test11Lib.local7.field1 = Test11Lib.local1;
Test11Lib.local7.field2 = Test11Lib.local7;
Test11Lib.local7.field3 = Test11Lib.local1;
Test11Lib.local7.field4 = Test11Lib.local4;
Test11Lib.local7.field5 = Test11Lib.local4;
Test11Lib.local7.field6 = Test11Lib.local5;
Test11Lib.local7.field7 = Test11Lib.local3;
Test11Lib.local7.field8 = Test11Lib.local2;
for (int local24 = 0; local24<=0; local24 += 1) {
for (int local25 = 0; local25<=2; local25 += 1) {
for (int local26 = 0; local26<=3; local26 += 1) {
Test11Lib.local4.field12=Test11Lib.local6.field4;
}
}
}
if (inputValue>3) {
Test11Lib.local4.field7.method3(Test11Lib.local6.field1,Test11Lib.local4.field1,3);
}else {
if (inputValue>=3) {
if (inputValue>1) {
Test11Lib.local4.field10.method1(3);
}else {
Test11Lib.local5.field7=Test11Lib.local7.field17;
}
}
}
if (inputValue==1) {
for (int local27 = 0; local27<=1; local27 += 1) {
Test11Lib.local5.field4=Test11Lib.local7.field2;
}
}else {
Test11Lib.local6.method13(3);
}
Test11Lib.local4.field9=Test11Lib.local7.field12;
Test11Lib.local5.field4=Test11Lib.local7.field2;
for (int local28 = 0; local28<=1; local28 += 1) {
for (int local29 = 0; local29<=2; local29 += 1) {
for (int local30 = 0; local30<=1; local30 += 1) {
for (int local31 = 0; local31<=0; local31 += 1) {
for (int local32 = 0; local32<=1; local32 += 1) {
}
}
}
}
}
Test11Lib.local7.field17.method6(Test11Lib.local6.field5,3);
for (int local33 = 0; local33<=1; local33 += 1) {
for (int local34 = 0; local34<=1; local34 += 1) {
Test11Lib.local6.field5.method6(Test11Lib.local4.field11,3);
}
}
for (int local35 = 0; local35<=0; local35 += 1) {
Test11Lib.local5.field16=Test11Lib.local7.field17;
}
for (int local36 = 0; local36<=0; local36 += 1) {
Test11Lib.local6.field18=Test11Lib.local6.field12;
}
Benchmark.test(1,Test11Lib.local1);
Benchmark.test(2,Test11Lib.local2);
Benchmark.test(3,Test11Lib.local3);
Benchmark.test(4,Test11Lib.local4);
Benchmark.test(5,Test11Lib.local5);
Benchmark.test(6,Test11Lib.local6);
Benchmark.test(7,Test11Lib.local7);
Benchmark.test(8,Test11Lib.local1.field1);
Benchmark.test(9,Test11Lib.local1.field2);
Benchmark.test(10,Test11Lib.local1.field3);
Benchmark.test(11,Test11Lib.local1.field4);
Benchmark.test(12,Test11Lib.local1.field5);
Benchmark.test(13,Test11Lib.local1.field6);
Benchmark.test(14,Test11Lib.local1.field7);
Benchmark.test(15,Test11Lib.local1.field8);
Benchmark.test(16,Test11Lib.local2.field1);
Benchmark.test(17,Test11Lib.local2.field2);
Benchmark.test(18,Test11Lib.local2.field3);
Benchmark.test(19,Test11Lib.local2.field4);
Benchmark.test(20,Test11Lib.local2.field5);
Benchmark.test(21,Test11Lib.local2.field6);
Benchmark.test(22,Test11Lib.local2.field7);
Benchmark.test(23,Test11Lib.local2.field8);
Benchmark.test(24,Test11Lib.local3.field1);
Benchmark.test(25,Test11Lib.local3.field2);
Benchmark.test(26,Test11Lib.local3.field3);
Benchmark.test(27,Test11Lib.local3.field4);
Benchmark.test(28,Test11Lib.local3.field5);
Benchmark.test(29,Test11Lib.local3.field6);
Benchmark.test(30,Test11Lib.local3.field7);
Benchmark.test(31,Test11Lib.local3.field8);
Benchmark.test(32,Test11Lib.local4.field9);
Benchmark.test(33,Test11Lib.local4.field10);
Benchmark.test(34,Test11Lib.local4.field11);
Benchmark.test(35,Test11Lib.local4.field12);
Benchmark.test(36,Test11Lib.local4.field13);
Benchmark.test(37,Test11Lib.local4.field14);
Benchmark.test(38,Test11Lib.local4.field15);
Benchmark.test(39,Test11Lib.local4.field16);
Benchmark.test(40,Test11Lib.local4.field17);
Benchmark.test(41,Test11Lib.local4.field18);
Benchmark.test(42,Test11Lib.local4.field1);
Benchmark.test(43,Test11Lib.local4.field2);
Benchmark.test(44,Test11Lib.local4.field3);
Benchmark.test(45,Test11Lib.local4.field4);
Benchmark.test(46,Test11Lib.local4.field5);
Benchmark.test(47,Test11Lib.local4.field6);
Benchmark.test(48,Test11Lib.local4.field7);
Benchmark.test(49,Test11Lib.local4.field8);
Benchmark.test(50,Test11Lib.local5.field9);
Benchmark.test(51,Test11Lib.local5.field10);
Benchmark.test(52,Test11Lib.local5.field11);
Benchmark.test(53,Test11Lib.local5.field12);
Benchmark.test(54,Test11Lib.local5.field13);
Benchmark.test(55,Test11Lib.local5.field14);
Benchmark.test(56,Test11Lib.local5.field15);
Benchmark.test(57,Test11Lib.local5.field16);
Benchmark.test(58,Test11Lib.local5.field17);
Benchmark.test(59,Test11Lib.local5.field18);
Benchmark.test(60,Test11Lib.local5.field1);
Benchmark.test(61,Test11Lib.local5.field2);
Benchmark.test(62,Test11Lib.local5.field3);
Benchmark.test(63,Test11Lib.local5.field4);
Benchmark.test(64,Test11Lib.local5.field5);
Benchmark.test(65,Test11Lib.local5.field6);
Benchmark.test(66,Test11Lib.local5.field7);
Benchmark.test(67,Test11Lib.local5.field8);
Benchmark.test(68,Test11Lib.local6.field9);
Benchmark.test(69,Test11Lib.local6.field10);
Benchmark.test(70,Test11Lib.local6.field11);
Benchmark.test(71,Test11Lib.local6.field12);
Benchmark.test(72,Test11Lib.local6.field13);
Benchmark.test(73,Test11Lib.local6.field14);
Benchmark.test(74,Test11Lib.local6.field15);
Benchmark.test(75,Test11Lib.local6.field16);
Benchmark.test(76,Test11Lib.local6.field17);
Benchmark.test(77,Test11Lib.local6.field18);
Benchmark.test(78,Test11Lib.local6.field1);
Benchmark.test(79,Test11Lib.local6.field2);
Benchmark.test(80,Test11Lib.local6.field3);
Benchmark.test(81,Test11Lib.local6.field4);
Benchmark.test(82,Test11Lib.local6.field5);
Benchmark.test(83,Test11Lib.local6.field6);
Benchmark.test(84,Test11Lib.local6.field7);
Benchmark.test(85,Test11Lib.local6.field8);
Benchmark.test(86,Test11Lib.local7.field9);
Benchmark.test(87,Test11Lib.local7.field10);
Benchmark.test(88,Test11Lib.local7.field11);
Benchmark.test(89,Test11Lib.local7.field12);
Benchmark.test(90,Test11Lib.local7.field13);
Benchmark.test(91,Test11Lib.local7.field14);
Benchmark.test(92,Test11Lib.local7.field15);
Benchmark.test(93,Test11Lib.local7.field16);
Benchmark.test(94,Test11Lib.local7.field17);
Benchmark.test(95,Test11Lib.local7.field18);
Benchmark.test(96,Test11Lib.local7.field1);
Benchmark.test(97,Test11Lib.local7.field2);
Benchmark.test(98,Test11Lib.local7.field3);
Benchmark.test(99,Test11Lib.local7.field4);
Benchmark.test(100,Test11Lib.local7.field5);
Benchmark.test(101,Test11Lib.local7.field6);
Benchmark.test(102,Test11Lib.local7.field7);
Benchmark.test(103,Test11Lib.local7.field8);
Benchmark.print();
}
}
