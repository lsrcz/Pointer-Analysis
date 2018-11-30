package runnabledataset;

import benchmark.tool.Benchmark;
import benchmark.tool.BasicClass;
class Test26Lib{
public static Test26Class1 local1;
public static Test26Class2 local2;
public static Test26Class2 local3;
public static Test26Class2 local4;
public static Test26Class2 local5;
public static Test26Class3 local6;
public static Test26Class3 local7;
}
class Test26Class1 extends BasicClass {
public static Test26Class1 field1;
public static Test26Class1 field2;
public static Test26Class3 field3;
public static Test26Class2 field4;
public static void method1(Test26Class3 arg0, int depth) {
if (depth == 0) return;
for (int local8 = 0; local8<=3; local8 += 1) {
if (depth>=1) {
if (depth<2) {
for (int local9 = 0; local9<=1; local9 += 1) {
field2.field3.method1(arg0,depth-1);
}
}
}
}
if (depth<=2) {
field4.field3.method3(field4,depth-1);
}
for (int local10 = 0; local10<=2; local10 += 1) {
field4.field5.method2(depth-1);
}
for (int local11 = 0; local11<=0; local11 += 1) {
arg0.field10=field4.field3;
}
}
}
class Test26Class2 extends Test26Class1 {
public Test26Class2 field5;
public Test26Class3 field6;
public void method2(int depth) {
if (depth == 0) return;
this.field2=this.field3.method5(depth-1);
if (depth<4) {
for (int local12 = 0; local12<=1; local12 += 1) {
this.field3.method4(depth-1);
}
}else {
this.field4.method2(depth-1);
}
if (depth<4) {
if (depth<3) {
this.field1=this.field4;
}
}else {
this.field2=this.field6.method5(depth-1);
}
for (int local13 = 0; local13<=0; local13 += 1) {
for (int local14 = 0; local14<=1; local14 += 1) {
if (depth==4) {
this.field5.method1(this.field6,depth-1);
}else {
this.field6.method4(depth-1);
}
}
}
this.field4=this;
this.field2=this.field5;
}
}
class Test26Class3 extends Test26Class1 {
public Test26Class2 field7;
public Test26Class2 field8;
public static Test26Class2 field9;
public static Test26Class1 field10;
public void method3(Test26Class2 arg0, int depth) {
if (depth == 0) return;
arg0.field3=this;
if (depth>2) {
if (depth==3) {
arg0.field4=this.method5(depth-1);
}else {
for (int local15 = 0; local15<=2; local15 += 1) {
arg0.field3.method4(depth-1);
}
}
}else {
this.field9=this.method5(depth-1);
}
for (int local16 = 0; local16<=1; local16 += 1) {
if (depth==3) {
for (int local17 = 0; local17<=1; local17 += 1) {
for (int local18 = 0; local18<=1; local18 += 1) {
for (int local19 = 0; local19<=2; local19 += 1) {
}
}
}
}else {
if (depth>=2) {
this.field8=arg0.field4;
}else {
arg0.field6.method3(arg0.field4,depth-1);
}
}
}
if (depth<=2) {
this.field7.method2(depth-1);
}else {
arg0.field2=this.field8;
}
arg0.field1.method1(this,depth-1);
if (depth<2) {
arg0=arg0;
}
for (int local20 = 0; local20<=0; local20 += 1) {
for (int local21 = 0; local21<=2; local21 += 1) {
if (depth>=2) {
arg0.field5.method2(depth-1);
}
}
}
if (depth==4) {
this.field4.method2(depth-1);
}else {
if (depth==3) {
this.field4.method2(depth-1);
}else {
for (int local22 = 0; local22<=1; local22 += 1) {
this.field1.method1(arg0.field6,depth-1);
}
}
}
for (int local23 = 0; local23<=2; local23 += 1) {
this.field3=this;
}
}
public void method4(int depth) {
if (depth == 0) return;
if (depth<=3) {
this.field3=this;
}else {
this.field8=this.field9;
}
for (int local24 = 0; local24<=0; local24 += 1) {
for (int local25 = 0; local25<=3; local25 += 1) {
for (int local26 = 0; local26<=1; local26 += 1) {
for (int local27 = 0; local27<=0; local27 += 1) {
if (depth>=2) {
}else {
}
}
}
}
}
for (int local28 = 0; local28<=3; local28 += 1) {
this.field2=this.field3.method5(depth-1);
}
this.field4=this.method5(depth-1);
this.field1=this.field2;
this.field2=this.field3;
this.field3.method4(depth-1);
}
public static Test26Class2 method5(int depth) {
if (depth == 0) return Test26Lib.local3;
field9.field5.method2(depth-1);
if (depth>=3) {
for (int local29 = 0; local29<=0; local29 += 1) {
if (depth<4) {
for (int local30 = 0; local30<=2; local30 += 1) {
field10.field4.method1(field10.field3,depth-1);
}
}
}
}else {
for (int local31 = 0; local31<=2; local31 += 1) {
field10.field3.method3(field9,depth-1);
}
}
return field4.field4;
}
}
public class Test26{
public static void main(String[] args) {
int inputValue = 10;
Benchmark.alloc(1);
Test26Lib.local1 = new Test26Class1();
Benchmark.alloc(2);
Test26Lib.local2 = new Test26Class2();
Benchmark.alloc(3);
Test26Lib.local3 = new Test26Class2();
Benchmark.alloc(4);
Test26Lib.local4 = new Test26Class2();
Benchmark.alloc(5);
Test26Lib.local5 = new Test26Class2();
Benchmark.alloc(6);
Test26Lib.local6 = new Test26Class3();
Benchmark.alloc(7);
Test26Lib.local7 = new Test26Class3();
Test26Lib.local1.field1 = Test26Lib.local5;
Test26Lib.local1.field2 = Test26Lib.local7;
Test26Lib.local1.field3 = Test26Lib.local6;
Test26Lib.local1.field4 = Test26Lib.local4;
Test26Lib.local2.field5 = Test26Lib.local4;
Test26Lib.local2.field6 = Test26Lib.local7;
Test26Lib.local2.field1 = Test26Lib.local5;
Test26Lib.local2.field2 = Test26Lib.local6;
Test26Lib.local2.field3 = Test26Lib.local6;
Test26Lib.local2.field4 = Test26Lib.local2;
Test26Lib.local3.field5 = Test26Lib.local5;
Test26Lib.local3.field6 = Test26Lib.local7;
Test26Lib.local3.field1 = Test26Lib.local7;
Test26Lib.local3.field2 = Test26Lib.local3;
Test26Lib.local3.field3 = Test26Lib.local6;
Test26Lib.local3.field4 = Test26Lib.local3;
Test26Lib.local4.field5 = Test26Lib.local3;
Test26Lib.local4.field6 = Test26Lib.local7;
Test26Lib.local4.field1 = Test26Lib.local7;
Test26Lib.local4.field2 = Test26Lib.local1;
Test26Lib.local4.field3 = Test26Lib.local6;
Test26Lib.local4.field4 = Test26Lib.local2;
Test26Lib.local5.field5 = Test26Lib.local5;
Test26Lib.local5.field6 = Test26Lib.local6;
Test26Lib.local5.field1 = Test26Lib.local4;
Test26Lib.local5.field2 = Test26Lib.local3;
Test26Lib.local5.field3 = Test26Lib.local6;
Test26Lib.local5.field4 = Test26Lib.local4;
Test26Lib.local6.field7 = Test26Lib.local5;
Test26Lib.local6.field8 = Test26Lib.local4;
Test26Lib.local6.field9 = Test26Lib.local2;
Test26Lib.local6.field10 = Test26Lib.local3;
Test26Lib.local6.field1 = Test26Lib.local4;
Test26Lib.local6.field2 = Test26Lib.local6;
Test26Lib.local6.field3 = Test26Lib.local6;
Test26Lib.local6.field4 = Test26Lib.local3;
Test26Lib.local7.field7 = Test26Lib.local2;
Test26Lib.local7.field8 = Test26Lib.local2;
Test26Lib.local7.field9 = Test26Lib.local4;
Test26Lib.local7.field10 = Test26Lib.local7;
Test26Lib.local7.field1 = Test26Lib.local4;
Test26Lib.local7.field2 = Test26Lib.local6;
Test26Lib.local7.field3 = Test26Lib.local7;
Test26Lib.local7.field4 = Test26Lib.local2;
if (inputValue<=3) {
if (inputValue>=2) {
if (inputValue==1) {
Test26Lib.local3.field6=Test26Lib.local6;
}
}else {
Test26Lib.local6.field10=Test26Lib.local5.field6;
}
}
for (int local32 = 0; local32<=0; local32 += 1) {
Test26Lib.local6.field3.method4(3);
}
if (inputValue>1) {
if (inputValue<=4) {
Test26Lib.local3.field4.method2(3);
}
}else {
Test26Lib.local2.field5=Test26Lib.local3.field5;
}
if (inputValue==4) {
if (inputValue<2) {
Test26Lib.local4.field4=Test26Lib.local3;
}else {
for (int local33 = 0; local33<=0; local33 += 1) {
Test26Lib.local5.field4.method1(Test26Lib.local7.field3,3);
}
}
}else {
for (int local34 = 0; local34<=1; local34 += 1) {
if (inputValue>=2) {
Test26Lib.local2.field6.method5(3);
}else {
if (inputValue==1) {
for (int local35 = 0; local35<=1; local35 += 1) {
}
}
}
}
}
if (inputValue<=4) {
Test26Lib.local7.method3(Test26Lib.local3,3);
}else {
Test26Lib.local7.field3=Test26Lib.local4.field6;
}
Test26Lib.local7.field2=Test26Lib.local7;
Test26Lib.local3.method2(3);
Test26Lib.local2.field6=Test26Lib.local2.field3;
Test26Lib.local3.field1=Test26Lib.local3.field3.method5(3);
for (int local36 = 0; local36<=2; local36 += 1) {
for (int local37 = 0; local37<=3; local37 += 1) {
Test26Lib.local5.field6.method5(3);
}
}
Benchmark.test(1,Test26Lib.local1);
Benchmark.test(2,Test26Lib.local2);
Benchmark.test(3,Test26Lib.local3);
Benchmark.test(4,Test26Lib.local4);
Benchmark.test(5,Test26Lib.local5);
Benchmark.test(6,Test26Lib.local6);
Benchmark.test(7,Test26Lib.local7);
Benchmark.test(8,Test26Lib.local1.field1);
Benchmark.test(9,Test26Lib.local1.field2);
Benchmark.test(10,Test26Lib.local1.field3);
Benchmark.test(11,Test26Lib.local1.field4);
Benchmark.test(12,Test26Lib.local2.field5);
Benchmark.test(13,Test26Lib.local2.field6);
Benchmark.test(14,Test26Lib.local2.field1);
Benchmark.test(15,Test26Lib.local2.field2);
Benchmark.test(16,Test26Lib.local2.field3);
Benchmark.test(17,Test26Lib.local2.field4);
Benchmark.test(18,Test26Lib.local3.field5);
Benchmark.test(19,Test26Lib.local3.field6);
Benchmark.test(20,Test26Lib.local3.field1);
Benchmark.test(21,Test26Lib.local3.field2);
Benchmark.test(22,Test26Lib.local3.field3);
Benchmark.test(23,Test26Lib.local3.field4);
Benchmark.test(24,Test26Lib.local4.field5);
Benchmark.test(25,Test26Lib.local4.field6);
Benchmark.test(26,Test26Lib.local4.field1);
Benchmark.test(27,Test26Lib.local4.field2);
Benchmark.test(28,Test26Lib.local4.field3);
Benchmark.test(29,Test26Lib.local4.field4);
Benchmark.test(30,Test26Lib.local5.field5);
Benchmark.test(31,Test26Lib.local5.field6);
Benchmark.test(32,Test26Lib.local5.field1);
Benchmark.test(33,Test26Lib.local5.field2);
Benchmark.test(34,Test26Lib.local5.field3);
Benchmark.test(35,Test26Lib.local5.field4);
Benchmark.test(36,Test26Lib.local6.field7);
Benchmark.test(37,Test26Lib.local6.field8);
Benchmark.test(38,Test26Lib.local6.field9);
Benchmark.test(39,Test26Lib.local6.field10);
Benchmark.test(40,Test26Lib.local6.field1);
Benchmark.test(41,Test26Lib.local6.field2);
Benchmark.test(42,Test26Lib.local6.field3);
Benchmark.test(43,Test26Lib.local6.field4);
Benchmark.test(44,Test26Lib.local7.field7);
Benchmark.test(45,Test26Lib.local7.field8);
Benchmark.test(46,Test26Lib.local7.field9);
Benchmark.test(47,Test26Lib.local7.field10);
Benchmark.test(48,Test26Lib.local7.field1);
Benchmark.test(49,Test26Lib.local7.field2);
Benchmark.test(50,Test26Lib.local7.field3);
Benchmark.test(51,Test26Lib.local7.field4);
Benchmark.print();
}
}
