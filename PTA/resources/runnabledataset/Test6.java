package runnabledataset;

import benchmark.tool.Benchmark;
import benchmark.tool.BasicClass;
class Test6Lib{
public static Test6Class1 local1;
public static Test6Class2 local2;
public static Test6Class2 local3;
public static Test6Class2 local4;
public static Test6Class2 local5;
}
class Test6Class1 extends BasicClass {
public Test6Class2 field1;
public Test6Class2 field2;
public static Test6Class2 field3;
public Test6Class1 field4;
public Test6Class1 field5;
public static Test6Class2 field6;
public Test6Class1 field7;
public Test6Class2 field8;
public Test6Class2 method1(int depth) {
if (depth == 0) return Test6Lib.local4;
for (int local6 = 0; local6<=3; local6 += 1) {
for (int local7 = 0; local7<=2; local7 += 1) {
this.field1=this.field3;
}
}
if (depth>2) {
this.field4=this;
}else {
this.field5.method5(this.field1,depth-1);
}
this.field2.method4(this.field6,this.field6,depth-1);
if (depth>2) {
this.field2=this.field3;
}
if (depth<=1) {
if (depth<2) {
this.field8=this.field1;
}
}else {
this.field8.method2(this.field1,this.field8,depth-1);
}
for (int local8 = 0; local8<=3; local8 += 1) {
this.field4=this.field8;
}
this.field1.method3(this.field7,depth-1);
for (int local9 = 0; local9<=1; local9 += 1) {
this.field7=this.field4;
}
this.field3.method8(depth-1);
return this.field8;
}
public static void method2(Test6Class2 arg0, Test6Class1 arg1, int depth) {
if (depth == 0) return;
if (depth<1) {
field6=field6.field2;
}else {
if (depth<=1) {
arg1.field7.method5(field6.field11,depth-1);
}else {
for (int local10 = 0; local10<=2; local10 += 1) {
arg1.field6=arg1.field2;
}
}
}
for (int local11 = 0; local11<=1; local11 += 1) {
field3.field9=arg0;
}
for (int local12 = 0; local12<=1; local12 += 1) {
arg0.field4.method7(field6.field11,field3.field8,depth-1);
}
arg0.field6=arg0.field8;
arg1.field7=arg1.field1;
arg0.field11=arg0.field11;
if (depth==1) {
for (int local13 = 0; local13<=2; local13 += 1) {
for (int local14 = 0; local14<=2; local14 += 1) {
arg0.field16=field3.field6;
}
}
}else {
if (depth>3) {
field3.field3.method9(arg0.field16,arg0.field15,depth-1);
}
}
field6.field1=field6.field15;
if (depth<=3) {
for (int local15 = 0; local15<=1; local15 += 1) {
if (depth==1) {
for (int local16 = 0; local16<=2; local16 += 1) {
arg1.field5=field6.field7;
}
}else {
for (int local17 = 0; local17<=1; local17 += 1) {
if (depth>2) {
}
}
}
}
}else {
field3.field3=field6.field16;
}
}
public static void method3(Test6Class1 arg0, int depth) {
if (depth == 0) return;
field3.field11.method2(field6.field11,field3.field1,depth-1);
field3.field6.method4(field3.field15,field6,depth-1);
if (depth>2) {
field3.field15=field3.field8;
}else {
field6.field11=field3.field2;
}
if (depth<=1) {
if (depth<=4) {
field6.field16.method6(field6.field8,depth-1);
}else {
for (int local18 = 0; local18<=0; local18 += 1) {
field3.field9.method6(field3,depth-1);
}
}
}else {
field3.field7.method3(field3.field2,depth-1);
}
for (int local19 = 0; local19<=2; local19 += 1) {
for (int local20 = 0; local20<=2; local20 += 1) {
arg0.field2=field3.field2;
}
}
if (depth<=4) {
arg0.field7.method4(field3.field8,arg0.field2,depth-1);
}else {
arg0.field2=field6.field3;
}
if (depth>=4) {
if (depth>=3) {
for (int local21 = 0; local21<=0; local21 += 1) {
if (depth<=1) {
field3.field2=field6.field1;
}
}
}
}
field6.field10=field6.field10;
}
public void method4(Test6Class2 arg0, Test6Class2 arg1, int depth) {
if (depth == 0) return;
arg1.field9=this.field2.method5(arg0.field7,depth-1);
}
public Test6Class1 method5(Test6Class1 arg0, int depth) {
if (depth == 0) return Test6Lib.local3;
arg0.field1=this.field6;
this.field2=arg0.field8;
arg0.field6=arg0.field2;
if (depth>=3) {
this.field6=this.field1.method9(arg0.field2,arg0.field3,depth-1);
}else {
this.field4.method7(this.field8,this.field8,depth-1);
}
if (depth==1) {
for (int local22 = 0; local22<=2; local22 += 1) {
this.field3.method3(this,depth-1);
}
}else {
this.field4=arg0.field6.method5(arg0.field5,depth-1);
}
if (depth>2) {
if (depth==4) {
if (depth<1) {
this.field5.method4(arg0.field8,arg0.field8,depth-1);
}
}else {
for (int local23 = 0; local23<=1; local23 += 1) {
if (depth<=1) {
for (int local24 = 0; local24<=2; local24 += 1) {
}
}
}
}
}
for (int local25 = 0; local25<=2; local25 += 1) {
arg0.field4=this.field2;
}
if (depth<4) {
this.field4=this.field5;
}
return arg0;
}
public void method6(Test6Class2 arg0, int depth) {
if (depth == 0) return;
if (depth==3) {
for (int local26 = 0; local26<=3; local26 += 1) {
arg0.field13=this.field3.method1(depth-1);
}
}
arg0.field14.method8(depth-1);
if (depth>=2) {
arg0.field10=arg0.field3;
}
this.field2.method6(arg0.field16,depth-1);
if (depth==3) {
if (depth>=1) {
for (int local27 = 0; local27<=2; local27 += 1) {
arg0.field12.method1(depth-1);
}
}else {
for (int local28 = 0; local28<=1; local28 += 1) {
arg0.field14.method4(arg0.field16,arg0.field3,depth-1);
}
}
}
this.field4=arg0.field7;
if (depth<=2) {
this.field2=this.field6.method8(depth-1);
}else {
arg0=this.field3;
}
if (depth>3) {
if (depth<=1) {
arg0.field3.method6(arg0.field12,depth-1);
}
}else {
arg0.field12=arg0.field16;
}
}
public void method7(Test6Class2 arg0, Test6Class2 arg1, int depth) {
if (depth == 0) return;
this.field3=arg0;
arg1.field5=arg0.field15;
arg1.method1(depth-1);
for (int local29 = 0; local29<=0; local29 += 1) {
if (depth<=1) {
for (int local30 = 0; local30<=2; local30 += 1) {
for (int local31 = 0; local31<=1; local31 += 1) {
arg1.field1=arg0.field3;
}
}
}
}
arg1.field7.method3(arg0.field8,depth-1);
this.field8.method9(arg0,arg0.field2,depth-1);
arg0.field3=arg0.field16;
arg0.field10.method2(arg1.field15,arg1.field9,depth-1);
}
public static Test6Class2 method8(int depth) {
if (depth == 0) return Test6Lib.local3;
for (int local32 = 0; local32<=2; local32 += 1) {
for (int local33 = 0; local33<=0; local33 += 1) {
for (int local34 = 0; local34<=1; local34 += 1) {
field3.field13=field3.field2.method9(field6.field15,field3,depth-1);
}
}
}
for (int local35 = 0; local35<=3; local35 += 1) {
field3.field12.method4(field6.field8,field3.field16,depth-1);
}
if (depth<2) {
for (int local36 = 0; local36<=1; local36 += 1) {
field3.field3=field3.field3;
}
}
return field3.field12;
}
}
class Test6Class2 extends Test6Class1 {
public Test6Class1 field9;
public Test6Class1 field10;
public static Test6Class2 field11;
public static Test6Class2 field12;
public Test6Class1 field13;
public static Test6Class1 field14;
public Test6Class2 field15;
public static Test6Class2 field16;
public static Test6Class2 method9(Test6Class2 arg0, Test6Class1 arg1, int depth) {
if (depth == 0) return Test6Lib.local4;
for (int local37 = 0; local37<=2; local37 += 1) {
if (depth==1) {
field11.field15=arg0;
}
}
if (depth>=4) {
arg1.field4=field3.field15;
}else {
arg1.field6=field14.field3.method9(field12.field3,arg0.field8,depth-1);
}
arg0.field6.method3(field12,depth-1);
if (depth==3) {
if (depth<4) {
if (depth<4) {
for (int local38 = 0; local38<=2; local38 += 1) {
if (depth<4) {
}
}
}else {
for (int local39 = 0; local39<=1; local39 += 1) {
if (depth>2) {
}else {
}
}
}
}else {
for (int local40 = 0; local40<=1; local40 += 1) {
field6.field15.method7(field6.field15,field14.field6,depth-1);
}
}
}else {
if (depth<=4) {
for (int local41 = 0; local41<=3; local41 += 1) {
arg0.field5=field16.field8;
}
}
}
if (depth<1) {
field14.field4=field11.field6;
}else {
field11=arg1.field3;
}
field3.field6=field16.field16;
return field11.field2;
}
}
public class Test6{
public static void main(String[] args) {
int inputValue = 10;
Benchmark.alloc(1);
Test6Lib.local1 = new Test6Class1();
Benchmark.alloc(2);
Test6Lib.local2 = new Test6Class2();
Benchmark.alloc(3);
Test6Lib.local3 = new Test6Class2();
Benchmark.alloc(4);
Test6Lib.local4 = new Test6Class2();
Benchmark.alloc(5);
Test6Lib.local5 = new Test6Class2();
Test6Lib.local1.field1 = Test6Lib.local4;
Test6Lib.local1.field2 = Test6Lib.local4;
Test6Lib.local1.field3 = Test6Lib.local2;
Test6Lib.local1.field4 = Test6Lib.local4;
Test6Lib.local1.field5 = Test6Lib.local2;
Test6Lib.local1.field6 = Test6Lib.local5;
Test6Lib.local1.field7 = Test6Lib.local4;
Test6Lib.local1.field8 = Test6Lib.local5;
Test6Lib.local2.field9 = Test6Lib.local2;
Test6Lib.local2.field10 = Test6Lib.local1;
Test6Lib.local2.field11 = Test6Lib.local3;
Test6Lib.local2.field12 = Test6Lib.local5;
Test6Lib.local2.field13 = Test6Lib.local5;
Test6Lib.local2.field14 = Test6Lib.local2;
Test6Lib.local2.field15 = Test6Lib.local4;
Test6Lib.local2.field16 = Test6Lib.local2;
Test6Lib.local2.field1 = Test6Lib.local2;
Test6Lib.local2.field2 = Test6Lib.local5;
Test6Lib.local2.field3 = Test6Lib.local2;
Test6Lib.local2.field4 = Test6Lib.local2;
Test6Lib.local2.field5 = Test6Lib.local1;
Test6Lib.local2.field6 = Test6Lib.local3;
Test6Lib.local2.field7 = Test6Lib.local2;
Test6Lib.local2.field8 = Test6Lib.local3;
Test6Lib.local3.field9 = Test6Lib.local3;
Test6Lib.local3.field10 = Test6Lib.local3;
Test6Lib.local3.field11 = Test6Lib.local5;
Test6Lib.local3.field12 = Test6Lib.local3;
Test6Lib.local3.field13 = Test6Lib.local4;
Test6Lib.local3.field14 = Test6Lib.local4;
Test6Lib.local3.field15 = Test6Lib.local5;
Test6Lib.local3.field16 = Test6Lib.local2;
Test6Lib.local3.field1 = Test6Lib.local4;
Test6Lib.local3.field2 = Test6Lib.local3;
Test6Lib.local3.field3 = Test6Lib.local2;
Test6Lib.local3.field4 = Test6Lib.local1;
Test6Lib.local3.field5 = Test6Lib.local1;
Test6Lib.local3.field6 = Test6Lib.local2;
Test6Lib.local3.field7 = Test6Lib.local4;
Test6Lib.local3.field8 = Test6Lib.local4;
Test6Lib.local4.field9 = Test6Lib.local1;
Test6Lib.local4.field10 = Test6Lib.local5;
Test6Lib.local4.field11 = Test6Lib.local4;
Test6Lib.local4.field12 = Test6Lib.local5;
Test6Lib.local4.field13 = Test6Lib.local3;
Test6Lib.local4.field14 = Test6Lib.local5;
Test6Lib.local4.field15 = Test6Lib.local3;
Test6Lib.local4.field16 = Test6Lib.local4;
Test6Lib.local4.field1 = Test6Lib.local4;
Test6Lib.local4.field2 = Test6Lib.local2;
Test6Lib.local4.field3 = Test6Lib.local5;
Test6Lib.local4.field4 = Test6Lib.local1;
Test6Lib.local4.field5 = Test6Lib.local4;
Test6Lib.local4.field6 = Test6Lib.local3;
Test6Lib.local4.field7 = Test6Lib.local5;
Test6Lib.local4.field8 = Test6Lib.local4;
Test6Lib.local5.field9 = Test6Lib.local1;
Test6Lib.local5.field10 = Test6Lib.local2;
Test6Lib.local5.field11 = Test6Lib.local3;
Test6Lib.local5.field12 = Test6Lib.local5;
Test6Lib.local5.field13 = Test6Lib.local4;
Test6Lib.local5.field14 = Test6Lib.local2;
Test6Lib.local5.field15 = Test6Lib.local4;
Test6Lib.local5.field16 = Test6Lib.local2;
Test6Lib.local5.field1 = Test6Lib.local5;
Test6Lib.local5.field2 = Test6Lib.local2;
Test6Lib.local5.field3 = Test6Lib.local4;
Test6Lib.local5.field4 = Test6Lib.local2;
Test6Lib.local5.field5 = Test6Lib.local4;
Test6Lib.local5.field6 = Test6Lib.local3;
Test6Lib.local5.field7 = Test6Lib.local5;
Test6Lib.local5.field8 = Test6Lib.local5;
Test6Lib.local2.field15.method3(Test6Lib.local5.field11,3);
if (inputValue<1) {
Test6Lib.local5.field4=Test6Lib.local3.field14.method1(3);
}else {
for (int local42 = 0; local42<=1; local42 += 1) {
if (inputValue==4) {
Test6Lib.local2=Test6Lib.local2.field3.method8(3);
}
}
}
Test6Lib.local2.field9.method3(Test6Lib.local2.field7,3);
Test6Lib.local4.field10=Test6Lib.local2.field13.method5(Test6Lib.local4.field12,3);
Test6Lib.local3.field7=Test6Lib.local2.field2;
Test6Lib.local4.field14.method7(Test6Lib.local1.field3,Test6Lib.local4.field6,3);
if (inputValue<1) {
Test6Lib.local2.field15.method3(Test6Lib.local2.field8,3);
}
Test6Lib.local4.field3=Test6Lib.local4.field16;
if (inputValue<3) {
for (int local43 = 0; local43<=2; local43 += 1) {
Test6Lib.local3.field7=Test6Lib.local4.field10;
}
}
Test6Lib.local4.field1=Test6Lib.local3.field16;
Benchmark.test(1,Test6Lib.local1);
Benchmark.test(2,Test6Lib.local2);
Benchmark.test(3,Test6Lib.local3);
Benchmark.test(4,Test6Lib.local4);
Benchmark.test(5,Test6Lib.local5);
Benchmark.test(6,Test6Lib.local1.field1);
Benchmark.test(7,Test6Lib.local1.field2);
Benchmark.test(8,Test6Lib.local1.field3);
Benchmark.test(9,Test6Lib.local1.field4);
Benchmark.test(10,Test6Lib.local1.field5);
Benchmark.test(11,Test6Lib.local1.field6);
Benchmark.test(12,Test6Lib.local1.field7);
Benchmark.test(13,Test6Lib.local1.field8);
Benchmark.test(14,Test6Lib.local2.field9);
Benchmark.test(15,Test6Lib.local2.field10);
Benchmark.test(16,Test6Lib.local2.field11);
Benchmark.test(17,Test6Lib.local2.field12);
Benchmark.test(18,Test6Lib.local2.field13);
Benchmark.test(19,Test6Lib.local2.field14);
Benchmark.test(20,Test6Lib.local2.field15);
Benchmark.test(21,Test6Lib.local2.field16);
Benchmark.test(22,Test6Lib.local2.field1);
Benchmark.test(23,Test6Lib.local2.field2);
Benchmark.test(24,Test6Lib.local2.field3);
Benchmark.test(25,Test6Lib.local2.field4);
Benchmark.test(26,Test6Lib.local2.field5);
Benchmark.test(27,Test6Lib.local2.field6);
Benchmark.test(28,Test6Lib.local2.field7);
Benchmark.test(29,Test6Lib.local2.field8);
Benchmark.test(30,Test6Lib.local3.field9);
Benchmark.test(31,Test6Lib.local3.field10);
Benchmark.test(32,Test6Lib.local3.field11);
Benchmark.test(33,Test6Lib.local3.field12);
Benchmark.test(34,Test6Lib.local3.field13);
Benchmark.test(35,Test6Lib.local3.field14);
Benchmark.test(36,Test6Lib.local3.field15);
Benchmark.test(37,Test6Lib.local3.field16);
Benchmark.test(38,Test6Lib.local3.field1);
Benchmark.test(39,Test6Lib.local3.field2);
Benchmark.test(40,Test6Lib.local3.field3);
Benchmark.test(41,Test6Lib.local3.field4);
Benchmark.test(42,Test6Lib.local3.field5);
Benchmark.test(43,Test6Lib.local3.field6);
Benchmark.test(44,Test6Lib.local3.field7);
Benchmark.test(45,Test6Lib.local3.field8);
Benchmark.test(46,Test6Lib.local4.field9);
Benchmark.test(47,Test6Lib.local4.field10);
Benchmark.test(48,Test6Lib.local4.field11);
Benchmark.test(49,Test6Lib.local4.field12);
Benchmark.test(50,Test6Lib.local4.field13);
Benchmark.test(51,Test6Lib.local4.field14);
Benchmark.test(52,Test6Lib.local4.field15);
Benchmark.test(53,Test6Lib.local4.field16);
Benchmark.test(54,Test6Lib.local4.field1);
Benchmark.test(55,Test6Lib.local4.field2);
Benchmark.test(56,Test6Lib.local4.field3);
Benchmark.test(57,Test6Lib.local4.field4);
Benchmark.test(58,Test6Lib.local4.field5);
Benchmark.test(59,Test6Lib.local4.field6);
Benchmark.test(60,Test6Lib.local4.field7);
Benchmark.test(61,Test6Lib.local4.field8);
Benchmark.test(62,Test6Lib.local5.field9);
Benchmark.test(63,Test6Lib.local5.field10);
Benchmark.test(64,Test6Lib.local5.field11);
Benchmark.test(65,Test6Lib.local5.field12);
Benchmark.test(66,Test6Lib.local5.field13);
Benchmark.test(67,Test6Lib.local5.field14);
Benchmark.test(68,Test6Lib.local5.field15);
Benchmark.test(69,Test6Lib.local5.field16);
Benchmark.test(70,Test6Lib.local5.field1);
Benchmark.test(71,Test6Lib.local5.field2);
Benchmark.test(72,Test6Lib.local5.field3);
Benchmark.test(73,Test6Lib.local5.field4);
Benchmark.test(74,Test6Lib.local5.field5);
Benchmark.test(75,Test6Lib.local5.field6);
Benchmark.test(76,Test6Lib.local5.field7);
Benchmark.test(77,Test6Lib.local5.field8);
Benchmark.print();
}
}
