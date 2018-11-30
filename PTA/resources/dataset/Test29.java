package dataset;

import benchmark.internal.Benchmark;
import benchmark.tool.BasicClass;
class Test29Lib{
public static Test29Class1 local1;
public static Test29Class1 local2;
public static Test29Class1 local3;
public static Test29Class1 local4;
public static Test29Class2 local5;
public static Test29Class2 local6;
public static Test29Class2 local7;
public static Test29Class2 local8;
public static Test29Class2 local9;
public static Test29Class3 local10;
public static Test29Class3 local11;
public static Test29Class3 local12;
public static Test29Class3 local13;
}
class Test29Class1 extends BasicClass {
public Test29Class1 field1;
public static Test29Class2 field2;
public void method1(int depth) {
if (depth == 0) return;
if (depth<=3) {
if (depth<=1) {
for (int local14 = 0; local14<=1; local14 += 1) {
this.field2.method4(this.field2,this,depth-1);
}
}else {
for (int local15 = 0; local15<=0; local15 += 1) {
for (int local16 = 0; local16<=3; local16 += 1) {
this.field1=this.field2.method4(this.field2,this,depth-1);
}
}
}
}
this.field2=this.field2;
if (depth>=1) {
for (int local17 = 0; local17<=1; local17 += 1) {
for (int local18 = 0; local18<=0; local18 += 1) {
if (depth<4) {
this.field2=this.field2;
}else {
for (int local19 = 0; local19<=3; local19 += 1) {
}
}
}
}
}
for (int local20 = 0; local20<=2; local20 += 1) {
this.field1=this.field2.method4(this.field2,this.field2,depth-1);
}
for (int local21 = 0; local21<=1; local21 += 1) {
this.field1=this.field1;
}
}
}
class Test29Class2 extends Test29Class1 {
public static Test29Class3 field3;
public void method2(int depth) {
if (depth == 0) return;
this.field1=this.method4(this.field2,this.field2,depth-1);
this.field1=this.field3.method6(depth-1);
this.field2.method4(this.field2,this,depth-1);
}
public void method3(Test29Class1 arg0, int depth) {
if (depth == 0) return;
if (depth>1) {
arg0=this.field3.method6(depth-1);
}
this.field3=this.field3;
for (int local22 = 0; local22<=3; local22 += 1) {
this.field3=this.field3;
}
for (int local23 = 0; local23<=3; local23 += 1) {
arg0.field2.method3(arg0,depth-1);
}
arg0.method1(depth-1);
this.field2.method2(depth-1);
this.field1=this.field3.method6(depth-1);
if (depth==1) {
arg0.field2=this.field2;
}else {
if (depth>=1) {
for (int local24 = 0; local24<=1; local24 += 1) {
if (depth==3) {
if (depth==2) {
}
}
}
}
}
if (depth<1) {
this.method3(this,depth-1);
}
}
public Test29Class1 method4(Test29Class2 arg0, Test29Class1 arg1, int depth) {
if (depth == 0) return Test29Lib.local13;
arg0.field3=this.field3;
arg1.field1=arg0.field3.method6(depth-1);
arg0.field2=arg0.field3.method5(arg0.field2,this.field2,depth-1);
this.method1(depth-1);
return arg1.field2;
}
}
class Test29Class3 extends Test29Class1 {
public Test29Class1 field4;
public static Test29Class2 method5(Test29Class1 arg0, Test29Class2 arg1, int depth) {
if (depth == 0) return Test29Lib.local6;
return arg1;
}
public Test29Class1 method6(int depth) {
if (depth == 0) return Test29Lib.local10;
for (int local25 = 0; local25<=2; local25 += 1) {
for (int local26 = 0; local26<=3; local26 += 1) {
this.field1=this;
}
}
this.method5(this.field4,this.field2,depth-1);
this.field2=this.field2;
for (int local27 = 0; local27<=0; local27 += 1) {
for (int local28 = 0; local28<=2; local28 += 1) {
if (depth<3) {
if (depth>3) {
this.field4.method1(depth-1);
}else {
this.field2=this.field2;
}
}else {
this.field4=this.method5(this,this.field2,depth-1);
}
}
}
if (depth>=3) {
if (depth>4) {
if (depth==3) {
if (depth>1) {
this.field2=this.field2;
}else {
for (int local29 = 0; local29<=1; local29 += 1) {
}
}
}else {
for (int local30 = 0; local30<=3; local30 += 1) {
for (int local31 = 0; local31<=2; local31 += 1) {
}
}
}
}
}
if (depth>=4) {
if (depth>1) {
this.field4=this.method6(depth-1);
}else {
if (depth>=4) {
if (depth<3) {
this.field2.method2(depth-1);
}
}
}
}else {
if (depth>=2) {
this.field4=this.method6(depth-1);
}else {
if (depth>3) {
this.field1=this.method5(this,this.field2,depth-1);
}else {
this.field2.method3(this.field2,depth-1);
}
}
}
for (int local32 = 0; local32<=0; local32 += 1) {
this.field4=this.method5(this.field2,this.field2,depth-1);
}
return this.field2;
}
}
public class Test29{
public static void main(String[] args) {
int inputValue = 0;
Benchmark.alloc(1);
Test29Lib.local1 = new Test29Class1();
Benchmark.alloc(2);
Test29Lib.local2 = new Test29Class1();
Benchmark.alloc(3);
Test29Lib.local3 = new Test29Class1();
Benchmark.alloc(4);
Test29Lib.local4 = new Test29Class1();
Benchmark.alloc(5);
Test29Lib.local5 = new Test29Class2();
Benchmark.alloc(6);
Test29Lib.local6 = new Test29Class2();
Benchmark.alloc(7);
Test29Lib.local7 = new Test29Class2();
Benchmark.alloc(8);
Test29Lib.local8 = new Test29Class2();
Benchmark.alloc(9);
Test29Lib.local9 = new Test29Class2();
Benchmark.alloc(10);
Test29Lib.local10 = new Test29Class3();
Benchmark.alloc(11);
Test29Lib.local11 = new Test29Class3();
Benchmark.alloc(12);
Test29Lib.local12 = new Test29Class3();
Benchmark.alloc(13);
Test29Lib.local13 = new Test29Class3();
Test29Lib.local1.field1 = Test29Lib.local6;
Test29Lib.local1.field2 = Test29Lib.local8;
Test29Lib.local2.field1 = Test29Lib.local12;
Test29Lib.local2.field2 = Test29Lib.local5;
Test29Lib.local3.field1 = Test29Lib.local5;
Test29Lib.local3.field2 = Test29Lib.local5;
Test29Lib.local4.field1 = Test29Lib.local4;
Test29Lib.local4.field2 = Test29Lib.local9;
Test29Lib.local5.field3 = Test29Lib.local11;
Test29Lib.local5.field1 = Test29Lib.local8;
Test29Lib.local5.field2 = Test29Lib.local7;
Test29Lib.local6.field3 = Test29Lib.local12;
Test29Lib.local6.field1 = Test29Lib.local6;
Test29Lib.local6.field2 = Test29Lib.local8;
Test29Lib.local7.field3 = Test29Lib.local11;
Test29Lib.local7.field1 = Test29Lib.local12;
Test29Lib.local7.field2 = Test29Lib.local8;
Test29Lib.local8.field3 = Test29Lib.local11;
Test29Lib.local8.field1 = Test29Lib.local12;
Test29Lib.local8.field2 = Test29Lib.local6;
Test29Lib.local9.field3 = Test29Lib.local11;
Test29Lib.local9.field1 = Test29Lib.local13;
Test29Lib.local9.field2 = Test29Lib.local9;
Test29Lib.local10.field4 = Test29Lib.local12;
Test29Lib.local10.field1 = Test29Lib.local6;
Test29Lib.local10.field2 = Test29Lib.local6;
Test29Lib.local11.field4 = Test29Lib.local8;
Test29Lib.local11.field1 = Test29Lib.local6;
Test29Lib.local11.field2 = Test29Lib.local8;
Test29Lib.local12.field4 = Test29Lib.local1;
Test29Lib.local12.field1 = Test29Lib.local5;
Test29Lib.local12.field2 = Test29Lib.local6;
Test29Lib.local13.field4 = Test29Lib.local7;
Test29Lib.local13.field1 = Test29Lib.local3;
Test29Lib.local13.field2 = Test29Lib.local8;
if (inputValue<=3) {
Test29Lib.local7.field2.method4(Test29Lib.local5.field2,Test29Lib.local5.field1,3);
}
if (inputValue>=2) {
Test29Lib.local1=Test29Lib.local11.field2.method4(Test29Lib.local6,Test29Lib.local6.field1,3);
}else {
if (inputValue>=4) {
for (int local33 = 0; local33<=2; local33 += 1) {
for (int local34 = 0; local34<=2; local34 += 1) {
Test29Lib.local1.field1=Test29Lib.local9.field3.method6(3);
}
}
}else {
for (int local35 = 0; local35<=2; local35 += 1) {
if (inputValue<=1) {
Test29Lib.local5.field3=Test29Lib.local7.field3;
}else {
Test29Lib.local7.field1=Test29Lib.local9.field1;
}
}
}
}
for (int local36 = 0; local36<=2; local36 += 1) {
for (int local37 = 0; local37<=3; local37 += 1) {
for (int local38 = 0; local38<=2; local38 += 1) {
for (int local39 = 0; local39<=1; local39 += 1) {
Test29Lib.local7.field3=Test29Lib.local5.field3;
}
}
}
}
Test29Lib.local11=Test29Lib.local6.field3;
Test29Lib.local5.field2=Test29Lib.local7;
Test29Lib.local5.field2.method2(3);
for (int local40 = 0; local40<=2; local40 += 1) {
Test29Lib.local3.field2.method1(3);
}
Test29Lib.local1.field1=Test29Lib.local1;
Test29Lib.local9=Test29Lib.local2.field2;
Test29Lib.local7.field3.method1(3);
Benchmark.test(1,Test29Lib.local1);
Benchmark.test(2,Test29Lib.local2);
Benchmark.test(3,Test29Lib.local3);
Benchmark.test(4,Test29Lib.local4);
Benchmark.test(5,Test29Lib.local5);
Benchmark.test(6,Test29Lib.local6);
Benchmark.test(7,Test29Lib.local7);
Benchmark.test(8,Test29Lib.local8);
Benchmark.test(9,Test29Lib.local9);
Benchmark.test(10,Test29Lib.local10);
Benchmark.test(11,Test29Lib.local11);
Benchmark.test(12,Test29Lib.local12);
Benchmark.test(13,Test29Lib.local13);
Benchmark.test(14,Test29Lib.local1.field1);
Benchmark.test(15,Test29Lib.local1.field2);
Benchmark.test(16,Test29Lib.local2.field1);
Benchmark.test(17,Test29Lib.local2.field2);
Benchmark.test(18,Test29Lib.local3.field1);
Benchmark.test(19,Test29Lib.local3.field2);
Benchmark.test(20,Test29Lib.local4.field1);
Benchmark.test(21,Test29Lib.local4.field2);
Benchmark.test(22,Test29Lib.local5.field3);
Benchmark.test(23,Test29Lib.local5.field1);
Benchmark.test(24,Test29Lib.local5.field2);
Benchmark.test(25,Test29Lib.local6.field3);
Benchmark.test(26,Test29Lib.local6.field1);
Benchmark.test(27,Test29Lib.local6.field2);
Benchmark.test(28,Test29Lib.local7.field3);
Benchmark.test(29,Test29Lib.local7.field1);
Benchmark.test(30,Test29Lib.local7.field2);
Benchmark.test(31,Test29Lib.local8.field3);
Benchmark.test(32,Test29Lib.local8.field1);
Benchmark.test(33,Test29Lib.local8.field2);
Benchmark.test(34,Test29Lib.local9.field3);
Benchmark.test(35,Test29Lib.local9.field1);
Benchmark.test(36,Test29Lib.local9.field2);
Benchmark.test(37,Test29Lib.local10.field4);
Benchmark.test(38,Test29Lib.local10.field1);
Benchmark.test(39,Test29Lib.local10.field2);
Benchmark.test(40,Test29Lib.local11.field4);
Benchmark.test(41,Test29Lib.local11.field1);
Benchmark.test(42,Test29Lib.local11.field2);
Benchmark.test(43,Test29Lib.local12.field4);
Benchmark.test(44,Test29Lib.local12.field1);
Benchmark.test(45,Test29Lib.local12.field2);
Benchmark.test(46,Test29Lib.local13.field4);
Benchmark.test(47,Test29Lib.local13.field1);
Benchmark.test(48,Test29Lib.local13.field2);
Benchmark.print();
}
}
