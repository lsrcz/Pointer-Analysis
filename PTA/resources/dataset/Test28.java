package dataset;

import benchmark.internal.Benchmark;
import benchmark.tool.BasicClass;
class Test28Lib{
public static Test28Class1 local1;
public static Test28Class1 local2;
public static Test28Class1 local3;
public static Test28Class2 local4;
public static Test28Class2 local5;
public static Test28Class2 local6;
public static Test28Class2 local7;
public static Test28Class2 local8;
public static Test28Class3 local9;
public static Test28Class3 local10;
public static Test28Class3 local11;
public static Test28Class3 local12;
}
class Test28Class1 extends BasicClass {
public static Test28Class3 field1;
public Test28Class1 field2;
public static Test28Class1 method1(Test28Class1 arg0, Test28Class2 arg1, int depth) {
if (depth == 0) return Test28Lib.local8;
return arg1.field3;
}
}
class Test28Class2 extends Test28Class1 {
public Test28Class3 field3;
public void method2(Test28Class3 arg0, Test28Class2 arg1, int depth) {
if (depth == 0) return;
for (int local13 = 0; local13<=0; local13 += 1) {
if (depth==4) {
arg0.field2=arg0.field3.method5(arg1.field3,depth-1);
}
}
arg0.field4=arg1;
arg0.field2.method1(this.field1,arg0,depth-1);
arg0.field4=this;
for (int local14 = 0; local14<=0; local14 += 1) {
arg1.field1.method3(this.field1,arg1,depth-1);
}
if (depth<=3) {
arg0.field2=this.field1;
}
for (int local15 = 0; local15<=3; local15 += 1) {
if (depth>=1) {
arg0=this.field1;
}else {
if (depth==1) {
if (depth<4) {
for (int local16 = 0; local16<=1; local16 += 1) {
}
}else {
for (int local17 = 0; local17<=3; local17 += 1) {
}
}
}else {
arg0.field1=arg0;
}
}
}
arg1=this.field3;
}
public static void method3(Test28Class3 arg0, Test28Class1 arg1, int depth) {
if (depth == 0) return;
field1.field4=arg0;
arg1.field2=arg0;
field1.field4=arg0.field1;
for (int local18 = 0; local18<=0; local18 += 1) {
for (int local19 = 0; local19<=2; local19 += 1) {
arg1.field2=arg0.field1.method5(arg0.field1,depth-1);
}
}
if (depth>=4) {
if (depth==2) {
for (int local20 = 0; local20<=2; local20 += 1) {
if (depth<1) {
arg0.field2=arg0.field3.method7(arg0.field4,depth-1);
}else {
arg0.field4=field1.field4;
}
}
}else {
if (depth==2) {
if (depth>=3) {
if (depth>3) {
}else {
}
}else {
if (depth<4) {
}
}
}
}
}else {
field1.field2=field1.field3.method7(arg0,depth-1);
}
arg0.field4.method3(field1.field1,field1.field3,depth-1);
for (int local21 = 0; local21<=0; local21 += 1) {
if (depth>3) {
if (depth<=2) {
if (depth==4) {
arg0.field1.method6(depth-1);
}
}
}else {
for (int local22 = 0; local22<=1; local22 += 1) {
arg0.method3(arg0.field1,arg0,depth-1);
}
}
}
if (depth==1) {
arg1.field2=arg0.method6(depth-1);
}else {
arg1.field1.method3(arg0.field3,field1.field2,depth-1);
}
}
}
class Test28Class3 extends Test28Class2 {
public Test28Class2 field4;
public void method4(Test28Class1 arg0, int depth) {
if (depth == 0) return;
if (depth>2) {
if (depth>=4) {
if (depth>3) {
arg0=this.method7(this,depth-1);
}
}
}
}
public static Test28Class2 method5(Test28Class3 arg0, int depth) {
if (depth == 0) return Test28Lib.local4;
for (int local23 = 0; local23<=1; local23 += 1) {
for (int local24 = 0; local24<=3; local24 += 1) {
arg0.field1=arg0.field3;
}
}
arg0.field2=arg0.field3;
for (int local25 = 0; local25<=0; local25 += 1) {
field1.field2=field1.field1;
}
for (int local26 = 0; local26<=2; local26 += 1) {
if (depth==1) {
field1.field3.method2(arg0.field1,arg0,depth-1);
}
}
return field1;
}
public Test28Class2 method6(int depth) {
if (depth == 0) return Test28Lib.local10;
if (depth<3) {
for (int local27 = 0; local27<=2; local27 += 1) {
this.field2=this.field2;
}
}else {
if (depth>=2) {
if (depth<3) {
if (depth==1) {
if (depth<2) {
}
}
}else {
this.method7(this.field4,depth-1);
}
}
}
return this.field3;
}
public static Test28Class1 method7(Test28Class2 arg0, int depth) {
if (depth == 0) return Test28Lib.local10;
field1.field4=field1.field3;
arg0.field2=arg0.field1.method7(arg0.field1,depth-1);
if (depth>3) {
if (depth<1) {
arg0=arg0;
}else {
field1.field1=field1.field1;
}
}
if (depth>3) {
for (int local28 = 0; local28<=0; local28 += 1) {
arg0.field1.method6(depth-1);
}
}else {
arg0.field3.method6(depth-1);
}
return arg0.field1;
}
}
public class Test28{
public static void main(String[] args) {
int inputValue = 0;
Benchmark.alloc(1);
Test28Lib.local1 = new Test28Class1();
Benchmark.alloc(2);
Test28Lib.local2 = new Test28Class1();
Benchmark.alloc(3);
Test28Lib.local3 = new Test28Class1();
Benchmark.alloc(4);
Test28Lib.local4 = new Test28Class2();
Benchmark.alloc(5);
Test28Lib.local5 = new Test28Class2();
Benchmark.alloc(6);
Test28Lib.local6 = new Test28Class2();
Benchmark.alloc(7);
Test28Lib.local7 = new Test28Class2();
Benchmark.alloc(8);
Test28Lib.local8 = new Test28Class2();
Benchmark.alloc(9);
Test28Lib.local9 = new Test28Class3();
Benchmark.alloc(10);
Test28Lib.local10 = new Test28Class3();
Benchmark.alloc(11);
Test28Lib.local11 = new Test28Class3();
Benchmark.alloc(12);
Test28Lib.local12 = new Test28Class3();
Test28Lib.local1.field1 = Test28Lib.local9;
Test28Lib.local1.field2 = Test28Lib.local10;
Test28Lib.local2.field1 = Test28Lib.local10;
Test28Lib.local2.field2 = Test28Lib.local3;
Test28Lib.local3.field1 = Test28Lib.local9;
Test28Lib.local3.field2 = Test28Lib.local8;
Test28Lib.local4.field3 = Test28Lib.local10;
Test28Lib.local4.field1 = Test28Lib.local9;
Test28Lib.local4.field2 = Test28Lib.local12;
Test28Lib.local5.field3 = Test28Lib.local11;
Test28Lib.local5.field1 = Test28Lib.local12;
Test28Lib.local5.field2 = Test28Lib.local12;
Test28Lib.local6.field3 = Test28Lib.local9;
Test28Lib.local6.field1 = Test28Lib.local9;
Test28Lib.local6.field2 = Test28Lib.local12;
Test28Lib.local7.field3 = Test28Lib.local12;
Test28Lib.local7.field1 = Test28Lib.local9;
Test28Lib.local7.field2 = Test28Lib.local5;
Test28Lib.local8.field3 = Test28Lib.local11;
Test28Lib.local8.field1 = Test28Lib.local9;
Test28Lib.local8.field2 = Test28Lib.local5;
Test28Lib.local9.field4 = Test28Lib.local4;
Test28Lib.local9.field3 = Test28Lib.local11;
Test28Lib.local9.field1 = Test28Lib.local11;
Test28Lib.local9.field2 = Test28Lib.local9;
Test28Lib.local10.field4 = Test28Lib.local8;
Test28Lib.local10.field3 = Test28Lib.local9;
Test28Lib.local10.field1 = Test28Lib.local11;
Test28Lib.local10.field2 = Test28Lib.local4;
Test28Lib.local11.field4 = Test28Lib.local4;
Test28Lib.local11.field3 = Test28Lib.local11;
Test28Lib.local11.field1 = Test28Lib.local12;
Test28Lib.local11.field2 = Test28Lib.local6;
Test28Lib.local12.field4 = Test28Lib.local7;
Test28Lib.local12.field3 = Test28Lib.local12;
Test28Lib.local12.field1 = Test28Lib.local12;
Test28Lib.local12.field2 = Test28Lib.local6;
if (inputValue==4) {
Test28Lib.local7.field1=Test28Lib.local11;
}else {
if (inputValue>=2) {
Test28Lib.local11.field1.method4(Test28Lib.local9,3);
}
}
for (int local29 = 0; local29<=0; local29 += 1) {
Test28Lib.local6.field3=Test28Lib.local6.field3;
}
Test28Lib.local10=Test28Lib.local8.field3;
Test28Lib.local10.method5(Test28Lib.local8.field1,3);
for (int local30 = 0; local30<=0; local30 += 1) {
Test28Lib.local12.field1=Test28Lib.local10.field3;
}
if (inputValue<=1) {
Test28Lib.local9.field2=Test28Lib.local9.field4;
}
if (inputValue>=1) {
Test28Lib.local9.field1.method4(Test28Lib.local7.field1,3);
}
Test28Lib.local1.field1=Test28Lib.local11.field3;
for (int local31 = 0; local31<=1; local31 += 1) {
for (int local32 = 0; local32<=3; local32 += 1) {
Test28Lib.local5.field2=Test28Lib.local12.field4;
}
}
for (int local33 = 0; local33<=0; local33 += 1) {
for (int local34 = 0; local34<=3; local34 += 1) {
Test28Lib.local11.field4=Test28Lib.local8;
}
}
Benchmark.test(1,Test28Lib.local1);
Benchmark.test(2,Test28Lib.local2);
Benchmark.test(3,Test28Lib.local3);
Benchmark.test(4,Test28Lib.local4);
Benchmark.test(5,Test28Lib.local5);
Benchmark.test(6,Test28Lib.local6);
Benchmark.test(7,Test28Lib.local7);
Benchmark.test(8,Test28Lib.local8);
Benchmark.test(9,Test28Lib.local9);
Benchmark.test(10,Test28Lib.local10);
Benchmark.test(11,Test28Lib.local11);
Benchmark.test(12,Test28Lib.local12);
Benchmark.test(13,Test28Lib.local1.field1);
Benchmark.test(14,Test28Lib.local1.field2);
Benchmark.test(15,Test28Lib.local2.field1);
Benchmark.test(16,Test28Lib.local2.field2);
Benchmark.test(17,Test28Lib.local3.field1);
Benchmark.test(18,Test28Lib.local3.field2);
Benchmark.test(19,Test28Lib.local4.field3);
Benchmark.test(20,Test28Lib.local4.field1);
Benchmark.test(21,Test28Lib.local4.field2);
Benchmark.test(22,Test28Lib.local5.field3);
Benchmark.test(23,Test28Lib.local5.field1);
Benchmark.test(24,Test28Lib.local5.field2);
Benchmark.test(25,Test28Lib.local6.field3);
Benchmark.test(26,Test28Lib.local6.field1);
Benchmark.test(27,Test28Lib.local6.field2);
Benchmark.test(28,Test28Lib.local7.field3);
Benchmark.test(29,Test28Lib.local7.field1);
Benchmark.test(30,Test28Lib.local7.field2);
Benchmark.test(31,Test28Lib.local8.field3);
Benchmark.test(32,Test28Lib.local8.field1);
Benchmark.test(33,Test28Lib.local8.field2);
Benchmark.test(34,Test28Lib.local9.field4);
Benchmark.test(35,Test28Lib.local9.field3);
Benchmark.test(36,Test28Lib.local9.field1);
Benchmark.test(37,Test28Lib.local9.field2);
Benchmark.test(38,Test28Lib.local10.field4);
Benchmark.test(39,Test28Lib.local10.field3);
Benchmark.test(40,Test28Lib.local10.field1);
Benchmark.test(41,Test28Lib.local10.field2);
Benchmark.test(42,Test28Lib.local11.field4);
Benchmark.test(43,Test28Lib.local11.field3);
Benchmark.test(44,Test28Lib.local11.field1);
Benchmark.test(45,Test28Lib.local11.field2);
Benchmark.test(46,Test28Lib.local12.field4);
Benchmark.test(47,Test28Lib.local12.field3);
Benchmark.test(48,Test28Lib.local12.field1);
Benchmark.test(49,Test28Lib.local12.field2);
Benchmark.print();
}
}
