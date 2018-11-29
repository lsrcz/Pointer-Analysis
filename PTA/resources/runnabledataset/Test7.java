package runnabledataset;

import benchmark.tool.Benchmark;
import benchmark.tool.BasicClass;
class Test7Lib{
public static Test7Class1 local1;
public static Test7Class1 local2;
public static Test7Class1 local3;
public static Test7Class2 local4;
public static Test7Class2 local5;
public static Test7Class2 local6;
public static Test7Class2 local7;
public static Test7Class2 local8;
}
class Test7Class1 extends BasicClass {
public Test7Class1 field1;
public Test7Class1 field2;
public static Test7Class2 field3;
public static Test7Class2 method1(int depth) {
if (depth == 0) return Test7Lib.local4;
return field3.field4;
}
public static void method2(int depth) {
if (depth == 0) return;
for (int local9 = 0; local9<=2; local9 += 1) {
for (int local10 = 0; local10<=1; local10 += 1) {
field3.field5=field3.field8.method9(field3.field4,depth-1);
}
}
}
public void method3(Test7Class2 arg0, int depth) {
if (depth == 0) return;
this.field3=arg0.field4;
}
public Test7Class2 method4(int depth) {
if (depth == 0) return Test7Lib.local5;
this.field3.method13(depth-1);
for (int local11 = 0; local11<=1; local11 += 1) {
if (depth>2) {
this.field2=this.field3.method11(depth-1);
}else {
this.field2=this;
}
}
return this.field3;
}
public Test7Class1 method5(int depth) {
if (depth == 0) return Test7Lib.local2;
this.field3.method13(depth-1);
for (int local12 = 0; local12<=1; local12 += 1) {
if (depth<1) {
for (int local13 = 0; local13<=1; local13 += 1) {
if (depth==4) {
for (int local14 = 0; local14<=1; local14 += 1) {
}
}
}
}
}
this.field1=this;
if (depth>3) {
this.field3=this.field3;
}
this.method3(this.field3,depth-1);
for (int local15 = 0; local15<=2; local15 += 1) {
this.field3=this.field3.method13(depth-1);
}
for (int local16 = 0; local16<=3; local16 += 1) {
this.field1=this.field3;
}
for (int local17 = 0; local17<=1; local17 += 1) {
for (int local18 = 0; local18<=3; local18 += 1) {
this.field1.method10(depth-1);
}
}
return this.field3;
}
public static Test7Class1 method6(Test7Class1 arg0, Test7Class1 arg1, int depth) {
if (depth == 0) return Test7Lib.local3;
field3.field10.method2(depth-1);
if (depth>4) {
field3.field11.method5(depth-1);
}else {
if (depth>3) {
if (depth>=3) {
for (int local19 = 0; local19<=2; local19 += 1) {
arg0.field2=arg0.field2.method6(field3.field7,arg0.field2,depth-1);
}
}
}
}
arg0=field3.field4;
field3.field6=field3.field8.method1(depth-1);
arg1.method10(depth-1);
for (int local20 = 0; local20<=1; local20 += 1) {
field3.field4=arg1.field3;
}
for (int local21 = 0; local21<=0; local21 += 1) {
arg1.field2.method6(field3.field10,field3.field4,depth-1);
}
return field3.field5;
}
public void method7(Test7Class1 arg0, Test7Class1 arg1, int depth) {
if (depth == 0) return;
for (int local22 = 0; local22<=2; local22 += 1) {
for (int local23 = 0; local23<=2; local23 += 1) {
this.field3=this.field3;
}
}
for (int local24 = 0; local24<=3; local24 += 1) {
if (depth<4) {
arg0.field1.method4(depth-1);
}else {
arg0.field3=arg1.field3;
}
}
if (depth==2) {
if (depth<=3) {
if (depth<=4) {
for (int local25 = 0; local25<=2; local25 += 1) {
arg0.field3=arg1.field3;
}
}
}
}else {
for (int local26 = 0; local26<=1; local26 += 1) {
arg1.field2=arg0.field3.method11(depth-1);
}
}
this.field2.method3(this.field3,depth-1);
arg1=this.field1;
if (depth==4) {
arg0.field2=arg0;
}
}
public static void method8(int depth) {
if (depth == 0) return;
if (depth<2) {
field3.field10=field3.method13(depth-1);
}else {
field3.field5=field3.field11;
}
}
public Test7Class2 method9(Test7Class1 arg0, int depth) {
if (depth == 0) return Test7Lib.local8;
for (int local27 = 0; local27<=0; local27 += 1) {
arg0.field3=arg0.field3;
}
for (int local28 = 0; local28<=0; local28 += 1) {
arg0.field3=this.field3;
}
for (int local29 = 0; local29<=2; local29 += 1) {
for (int local30 = 0; local30<=0; local30 += 1) {
for (int local31 = 0; local31<=1; local31 += 1) {
this.field3=arg0.field3;
}
}
}
arg0=this.field3;
arg0.field3=this.field3;
for (int local32 = 0; local32<=0; local32 += 1) {
if (depth<1) {
arg0.field3=arg0.field3;
}else {
this.field2=this;
}
}
return this.field3;
}
public static void method10(int depth) {
if (depth == 0) return;
if (depth>1) {
if (depth<=1) {
field3.field4=field3.field4;
}
}
}
}
class Test7Class2 extends Test7Class1 {
public static Test7Class2 field4;
public Test7Class2 field5;
public Test7Class1 field6;
public Test7Class1 field7;
public Test7Class1 field8;
public static Test7Class1 field9;
public static Test7Class1 field10;
public static Test7Class2 field11;
public static Test7Class1 method11(int depth) {
if (depth == 0) return Test7Lib.local1;
field9.field2=field11.field2.method9(field3.field3,depth-1);
if (depth>2) {
field3.field1=field4.field4;
}else {
field3.field6=field11.field11.method11(depth-1);
}
for (int local33 = 0; local33<=3; local33 += 1) {
for (int local34 = 0; local34<=2; local34 += 1) {
field3.field1.method3(field3.field4,depth-1);
}
}
for (int local35 = 0; local35<=1; local35 += 1) {
field11.field9=field11.field4;
}
return field9.field3;
}
public static void method12(int depth) {
if (depth == 0) return;
field3.field10=field11.field9;
for (int local36 = 0; local36<=2; local36 += 1) {
if (depth<=1) {
field10.field2=field4.field11;
}
}
field11=field4;
field11.field9=field3.field11.method9(field11.field3,depth-1);
for (int local37 = 0; local37<=2; local37 += 1) {
if (depth==1) {
field9.field1=field4;
}else {
field3.field1.method3(field11.field5,depth-1);
}
}
field3.field5.method10(depth-1);
field10.field1=field3.field3.method11(depth-1);
for (int local38 = 0; local38<=0; local38 += 1) {
for (int local39 = 0; local39<=1; local39 += 1) {
if (depth==4) {
field3.field8=field9.field3.method6(field4.field3,field4.field10,depth-1);
}else {
field3.field3=field4.field3;
}
}
}
for (int local40 = 0; local40<=2; local40 += 1) {
if (depth==1) {
if (depth==2) {
for (int local41 = 0; local41<=2; local41 += 1) {
field3.field5.method12(depth-1);
}
}
}
}
}
public static Test7Class2 method13(int depth) {
if (depth == 0) return Test7Lib.local5;
field10.field3=field11.field11;
field11.field2=field3.field4.method13(depth-1);
return field3;
}
public static void method14(Test7Class2 arg0, int depth) {
if (depth == 0) return;
field4.field10.method7(field4.field11,field4.field9,depth-1);
for (int local42 = 0; local42<=0; local42 += 1) {
field3.field10=field4.field4;
}
field4.field10=arg0.field3;
}
}
public class Test7{
public static void main(String[] args) {
int inputValue = 10;
Benchmark.alloc(1);
Test7Lib.local1 = new Test7Class1();
Benchmark.alloc(2);
Test7Lib.local2 = new Test7Class1();
Benchmark.alloc(3);
Test7Lib.local3 = new Test7Class1();
Benchmark.alloc(4);
Test7Lib.local4 = new Test7Class2();
Benchmark.alloc(5);
Test7Lib.local5 = new Test7Class2();
Benchmark.alloc(6);
Test7Lib.local6 = new Test7Class2();
Benchmark.alloc(7);
Test7Lib.local7 = new Test7Class2();
Benchmark.alloc(8);
Test7Lib.local8 = new Test7Class2();
Test7Lib.local1.field1 = Test7Lib.local6;
Test7Lib.local1.field2 = Test7Lib.local7;
Test7Lib.local1.field3 = Test7Lib.local4;
Test7Lib.local2.field1 = Test7Lib.local3;
Test7Lib.local2.field2 = Test7Lib.local2;
Test7Lib.local2.field3 = Test7Lib.local4;
Test7Lib.local3.field1 = Test7Lib.local1;
Test7Lib.local3.field2 = Test7Lib.local6;
Test7Lib.local3.field3 = Test7Lib.local6;
Test7Lib.local4.field4 = Test7Lib.local8;
Test7Lib.local4.field5 = Test7Lib.local4;
Test7Lib.local4.field6 = Test7Lib.local8;
Test7Lib.local4.field7 = Test7Lib.local1;
Test7Lib.local4.field8 = Test7Lib.local2;
Test7Lib.local4.field9 = Test7Lib.local2;
Test7Lib.local4.field10 = Test7Lib.local2;
Test7Lib.local4.field11 = Test7Lib.local4;
Test7Lib.local4.field1 = Test7Lib.local5;
Test7Lib.local4.field2 = Test7Lib.local7;
Test7Lib.local4.field3 = Test7Lib.local5;
Test7Lib.local5.field4 = Test7Lib.local7;
Test7Lib.local5.field5 = Test7Lib.local6;
Test7Lib.local5.field6 = Test7Lib.local3;
Test7Lib.local5.field7 = Test7Lib.local2;
Test7Lib.local5.field8 = Test7Lib.local2;
Test7Lib.local5.field9 = Test7Lib.local2;
Test7Lib.local5.field10 = Test7Lib.local1;
Test7Lib.local5.field11 = Test7Lib.local5;
Test7Lib.local5.field1 = Test7Lib.local3;
Test7Lib.local5.field2 = Test7Lib.local2;
Test7Lib.local5.field3 = Test7Lib.local6;
Test7Lib.local6.field4 = Test7Lib.local8;
Test7Lib.local6.field5 = Test7Lib.local5;
Test7Lib.local6.field6 = Test7Lib.local2;
Test7Lib.local6.field7 = Test7Lib.local8;
Test7Lib.local6.field8 = Test7Lib.local8;
Test7Lib.local6.field9 = Test7Lib.local6;
Test7Lib.local6.field10 = Test7Lib.local3;
Test7Lib.local6.field11 = Test7Lib.local8;
Test7Lib.local6.field1 = Test7Lib.local4;
Test7Lib.local6.field2 = Test7Lib.local5;
Test7Lib.local6.field3 = Test7Lib.local5;
Test7Lib.local7.field4 = Test7Lib.local7;
Test7Lib.local7.field5 = Test7Lib.local5;
Test7Lib.local7.field6 = Test7Lib.local6;
Test7Lib.local7.field7 = Test7Lib.local6;
Test7Lib.local7.field8 = Test7Lib.local5;
Test7Lib.local7.field9 = Test7Lib.local8;
Test7Lib.local7.field10 = Test7Lib.local5;
Test7Lib.local7.field11 = Test7Lib.local4;
Test7Lib.local7.field1 = Test7Lib.local3;
Test7Lib.local7.field2 = Test7Lib.local7;
Test7Lib.local7.field3 = Test7Lib.local7;
Test7Lib.local8.field4 = Test7Lib.local6;
Test7Lib.local8.field5 = Test7Lib.local4;
Test7Lib.local8.field6 = Test7Lib.local1;
Test7Lib.local8.field7 = Test7Lib.local6;
Test7Lib.local8.field8 = Test7Lib.local6;
Test7Lib.local8.field9 = Test7Lib.local1;
Test7Lib.local8.field10 = Test7Lib.local5;
Test7Lib.local8.field11 = Test7Lib.local7;
Test7Lib.local8.field1 = Test7Lib.local5;
Test7Lib.local8.field2 = Test7Lib.local1;
Test7Lib.local8.field3 = Test7Lib.local6;
Test7Lib.local6.field3.method14(Test7Lib.local7,3);
Test7Lib.local1.field1=Test7Lib.local8.field4;
Test7Lib.local1.field3=Test7Lib.local5.field4;
Test7Lib.local8.field6=Test7Lib.local2.field2.method6(Test7Lib.local1.field1,Test7Lib.local3.field2,3);
Test7Lib.local2.field3=Test7Lib.local5.field4;
for (int local43 = 0; local43<=1; local43 += 1) {
if (inputValue>1) {
if (inputValue>2) {
Test7Lib.local6.field4.method10(3);
}
}else {
Test7Lib.local6.field3=Test7Lib.local7.field5;
}
}
Test7Lib.local7.field1.method10(3);
if (inputValue<=2) {
if (inputValue<=4) {
Test7Lib.local7.field3=Test7Lib.local3.field3;
}else {
if (inputValue>=1) {
if (inputValue<3) {
if (inputValue==3) {
}else {
}
}
}else {
Test7Lib.local6.field3=Test7Lib.local1.field1.method1(3);
}
}
}
for (int local44 = 0; local44<=1; local44 += 1) {
Test7Lib.local2.field2=Test7Lib.local1.field2;
}
Test7Lib.local7.field9.method2(3);
Benchmark.test(1,Test7Lib.local1);
Benchmark.test(2,Test7Lib.local2);
Benchmark.test(3,Test7Lib.local3);
Benchmark.test(4,Test7Lib.local4);
Benchmark.test(5,Test7Lib.local5);
Benchmark.test(6,Test7Lib.local6);
Benchmark.test(7,Test7Lib.local7);
Benchmark.test(8,Test7Lib.local8);
Benchmark.test(9,Test7Lib.local1.field1);
Benchmark.test(10,Test7Lib.local1.field2);
Benchmark.test(11,Test7Lib.local1.field3);
Benchmark.test(12,Test7Lib.local2.field1);
Benchmark.test(13,Test7Lib.local2.field2);
Benchmark.test(14,Test7Lib.local2.field3);
Benchmark.test(15,Test7Lib.local3.field1);
Benchmark.test(16,Test7Lib.local3.field2);
Benchmark.test(17,Test7Lib.local3.field3);
Benchmark.test(18,Test7Lib.local4.field4);
Benchmark.test(19,Test7Lib.local4.field5);
Benchmark.test(20,Test7Lib.local4.field6);
Benchmark.test(21,Test7Lib.local4.field7);
Benchmark.test(22,Test7Lib.local4.field8);
Benchmark.test(23,Test7Lib.local4.field9);
Benchmark.test(24,Test7Lib.local4.field10);
Benchmark.test(25,Test7Lib.local4.field11);
Benchmark.test(26,Test7Lib.local4.field1);
Benchmark.test(27,Test7Lib.local4.field2);
Benchmark.test(28,Test7Lib.local4.field3);
Benchmark.test(29,Test7Lib.local5.field4);
Benchmark.test(30,Test7Lib.local5.field5);
Benchmark.test(31,Test7Lib.local5.field6);
Benchmark.test(32,Test7Lib.local5.field7);
Benchmark.test(33,Test7Lib.local5.field8);
Benchmark.test(34,Test7Lib.local5.field9);
Benchmark.test(35,Test7Lib.local5.field10);
Benchmark.test(36,Test7Lib.local5.field11);
Benchmark.test(37,Test7Lib.local5.field1);
Benchmark.test(38,Test7Lib.local5.field2);
Benchmark.test(39,Test7Lib.local5.field3);
Benchmark.test(40,Test7Lib.local6.field4);
Benchmark.test(41,Test7Lib.local6.field5);
Benchmark.test(42,Test7Lib.local6.field6);
Benchmark.test(43,Test7Lib.local6.field7);
Benchmark.test(44,Test7Lib.local6.field8);
Benchmark.test(45,Test7Lib.local6.field9);
Benchmark.test(46,Test7Lib.local6.field10);
Benchmark.test(47,Test7Lib.local6.field11);
Benchmark.test(48,Test7Lib.local6.field1);
Benchmark.test(49,Test7Lib.local6.field2);
Benchmark.test(50,Test7Lib.local6.field3);
Benchmark.test(51,Test7Lib.local7.field4);
Benchmark.test(52,Test7Lib.local7.field5);
Benchmark.test(53,Test7Lib.local7.field6);
Benchmark.test(54,Test7Lib.local7.field7);
Benchmark.test(55,Test7Lib.local7.field8);
Benchmark.test(56,Test7Lib.local7.field9);
Benchmark.test(57,Test7Lib.local7.field10);
Benchmark.test(58,Test7Lib.local7.field11);
Benchmark.test(59,Test7Lib.local7.field1);
Benchmark.test(60,Test7Lib.local7.field2);
Benchmark.test(61,Test7Lib.local7.field3);
Benchmark.test(62,Test7Lib.local8.field4);
Benchmark.test(63,Test7Lib.local8.field5);
Benchmark.test(64,Test7Lib.local8.field6);
Benchmark.test(65,Test7Lib.local8.field7);
Benchmark.test(66,Test7Lib.local8.field8);
Benchmark.test(67,Test7Lib.local8.field9);
Benchmark.test(68,Test7Lib.local8.field10);
Benchmark.test(69,Test7Lib.local8.field11);
Benchmark.test(70,Test7Lib.local8.field1);
Benchmark.test(71,Test7Lib.local8.field2);
Benchmark.test(72,Test7Lib.local8.field3);
Benchmark.print();
}
}
