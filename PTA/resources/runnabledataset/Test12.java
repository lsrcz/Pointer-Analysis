package runnabledataset;

import benchmark.tool.Benchmark;
import benchmark.tool.BasicClass;
class Test12Lib{
public static Test12Class1 local1;
public static Test12Class1 local2;
public static Test12Class1 local3;
public static Test12Class1 local4;
public static Test12Class2 local5;
public static Test12Class2 local6;
public static Test12Class2 local7;
public static Test12Class2 local8;
public static Test12Class2 local9;
}
class Test12Class1 extends BasicClass {
public static Test12Class1 field1;
public Test12Class1 method1(Test12Class2 arg0, Test12Class2 arg1, int depth) {
if (depth == 0) return Test12Lib.local8;
return arg1.field1;
}
public Test12Class2 method2(Test12Class2 arg0, int depth) {
if (depth == 0) return Test12Lib.local5;
arg0=arg0.field4.method3(arg0.field2,depth-1);
if (depth<2) {
arg0.field1=arg0.field3;
}else {
arg0.field1.method3(this.field1,depth-1);
}
for (int local10 = 0; local10<=2; local10 += 1) {
if (depth>3) {
this.field1.method5(arg0.field2,depth-1);
}else {
arg0.field2=arg0.field3;
}
}
return arg0.field4;
}
public Test12Class2 method3(Test12Class1 arg0, int depth) {
if (depth == 0) return Test12Lib.local5;
if (depth>3) {
arg0=arg0.field1;
}
for (int local11 = 0; local11<=2; local11 += 1) {
if (depth>=3) {
if (depth>=4) {
arg0.field1=arg0.field1;
}
}else {
arg0.method5(arg0,depth-1);
}
}
if (depth<3) {
arg0.field1.method3(arg0.field1,depth-1);
}else {
for (int local12 = 0; local12<=3; local12 += 1) {
arg0.field1=arg0.field1;
}
}
return Test12Lib.local5;
}
public Test12Class1 method4(Test12Class2 arg0, int depth) {
if (depth == 0) return Test12Lib.local4;
if (depth>=3) {
for (int local13 = 0; local13<=3; local13 += 1) {
arg0=arg0.field3;
}
}else {
if (depth<=2) {
if (depth>3) {
arg0.field1=arg0.field1;
}else {
if (depth>=2) {
arg0.field1=arg0.field4.method6(this,depth-1);
}else {
for (int local14 = 0; local14<=0; local14 += 1) {
}
}
}
}else {
if (depth>4) {
arg0.field2.method5(this,depth-1);
}else {
for (int local15 = 0; local15<=2; local15 += 1) {
if (depth>=3) {
}
}
}
}
}
arg0.field4=arg0.field3;
arg0.field1=this.field1;
for (int local16 = 0; local16<=1; local16 += 1) {
arg0.field4.method6(this.field1,depth-1);
}
arg0.field1=arg0;
for (int local17 = 0; local17<=1; local17 += 1) {
arg0.field2=arg0.field4;
}
this.field1=arg0.field1;
this.field1=arg0.field4.method6(arg0.field1,depth-1);
return arg0.field2;
}
public void method5(Test12Class1 arg0, int depth) {
if (depth == 0) return;
if (depth==4) {
arg0=this.field1;
}else {
for (int local18 = 0; local18<=1; local18 += 1) {
arg0.field1=this.field1;
}
}
this.field1=arg0.field1.method3(arg0,depth-1);
for (int local19 = 0; local19<=1; local19 += 1) {
for (int local20 = 0; local20<=2; local20 += 1) {
for (int local21 = 0; local21<=2; local21 += 1) {
if (depth>4) {
if (depth<=2) {
}
}else {
if (depth==1) {
}
}
}
}
}
}
}
class Test12Class2 extends Test12Class1 {
public Test12Class2 field2;
public static Test12Class2 field3;
public static Test12Class2 field4;
public static Test12Class1 method6(Test12Class1 arg0, int depth) {
if (depth == 0) return Test12Lib.local8;
if (depth>4) {
field4.method6(field4.field2,depth-1);
}
arg0.field1=field4.field2.method6(field4.field2,depth-1);
return field4.field3;
}
}
public class Test12{
public static void main(String[] args) {
int inputValue = 10;
Benchmark.alloc(1);
Test12Lib.local1 = new Test12Class1();
Benchmark.alloc(2);
Test12Lib.local2 = new Test12Class1();
Benchmark.alloc(3);
Test12Lib.local3 = new Test12Class1();
Benchmark.alloc(4);
Test12Lib.local4 = new Test12Class1();
Benchmark.alloc(5);
Test12Lib.local5 = new Test12Class2();
Benchmark.alloc(6);
Test12Lib.local6 = new Test12Class2();
Benchmark.alloc(7);
Test12Lib.local7 = new Test12Class2();
Benchmark.alloc(8);
Test12Lib.local8 = new Test12Class2();
Benchmark.alloc(9);
Test12Lib.local9 = new Test12Class2();
Test12Lib.local1.field1 = Test12Lib.local4;
Test12Lib.local2.field1 = Test12Lib.local4;
Test12Lib.local3.field1 = Test12Lib.local4;
Test12Lib.local4.field1 = Test12Lib.local2;
Test12Lib.local5.field2 = Test12Lib.local6;
Test12Lib.local5.field3 = Test12Lib.local8;
Test12Lib.local5.field4 = Test12Lib.local8;
Test12Lib.local5.field1 = Test12Lib.local1;
Test12Lib.local6.field2 = Test12Lib.local5;
Test12Lib.local6.field3 = Test12Lib.local7;
Test12Lib.local6.field4 = Test12Lib.local9;
Test12Lib.local6.field1 = Test12Lib.local5;
Test12Lib.local7.field2 = Test12Lib.local7;
Test12Lib.local7.field3 = Test12Lib.local6;
Test12Lib.local7.field4 = Test12Lib.local7;
Test12Lib.local7.field1 = Test12Lib.local6;
Test12Lib.local8.field2 = Test12Lib.local5;
Test12Lib.local8.field3 = Test12Lib.local7;
Test12Lib.local8.field4 = Test12Lib.local9;
Test12Lib.local8.field1 = Test12Lib.local4;
Test12Lib.local9.field2 = Test12Lib.local5;
Test12Lib.local9.field3 = Test12Lib.local6;
Test12Lib.local9.field4 = Test12Lib.local9;
Test12Lib.local9.field1 = Test12Lib.local8;
if (inputValue<2) {
for (int local22 = 0; local22<=3; local22 += 1) {
if (inputValue==2) {
if (inputValue==1) {
Test12Lib.local7.field4=Test12Lib.local8.field2;
}
}
}
}else {
for (int local23 = 0; local23<=2; local23 += 1) {
if (inputValue==3) {
Test12Lib.local5.field1=Test12Lib.local3.method1(Test12Lib.local9.field2,Test12Lib.local6.field2,3);
}else {
Test12Lib.local6.field4.method5(Test12Lib.local9.field4,3);
}
}
}
Test12Lib.local3.field1=Test12Lib.local8.field3.method4(Test12Lib.local5,3);
for (int local24 = 0; local24<=0; local24 += 1) {
Test12Lib.local6.field3=Test12Lib.local7;
}
Test12Lib.local3.field1=Test12Lib.local5.field3;
for (int local25 = 0; local25<=0; local25 += 1) {
for (int local26 = 0; local26<=0; local26 += 1) {
if (inputValue>=3) {
Test12Lib.local7.field4.method4(Test12Lib.local6.field4,3);
}
}
}
for (int local27 = 0; local27<=3; local27 += 1) {
Test12Lib.local1.field1=Test12Lib.local5.field2;
}
Test12Lib.local4.field1=Test12Lib.local1;
Test12Lib.local9.field1=Test12Lib.local8.field4.method1(Test12Lib.local8,Test12Lib.local5.field3,3);
for (int local28 = 0; local28<=1; local28 += 1) {
if (inputValue<3) {
Test12Lib.local6.field1=Test12Lib.local6.field1;
}else {
Test12Lib.local7.field2.method6(Test12Lib.local1,3);
}
}
for (int local29 = 0; local29<=2; local29 += 1) {
for (int local30 = 0; local30<=3; local30 += 1) {
for (int local31 = 0; local31<=3; local31 += 1) {
if (inputValue<=2) {
if (inputValue>=2) {
}
}else {
Test12Lib.local6.field4=Test12Lib.local8.field2;
}
}
}
}
Benchmark.test(1,Test12Lib.local1);
Benchmark.test(2,Test12Lib.local2);
Benchmark.test(3,Test12Lib.local3);
Benchmark.test(4,Test12Lib.local4);
Benchmark.test(5,Test12Lib.local5);
Benchmark.test(6,Test12Lib.local6);
Benchmark.test(7,Test12Lib.local7);
Benchmark.test(8,Test12Lib.local8);
Benchmark.test(9,Test12Lib.local9);
Benchmark.test(10,Test12Lib.local1.field1);
Benchmark.test(11,Test12Lib.local2.field1);
Benchmark.test(12,Test12Lib.local3.field1);
Benchmark.test(13,Test12Lib.local4.field1);
Benchmark.test(14,Test12Lib.local5.field2);
Benchmark.test(15,Test12Lib.local5.field3);
Benchmark.test(16,Test12Lib.local5.field4);
Benchmark.test(17,Test12Lib.local5.field1);
Benchmark.test(18,Test12Lib.local6.field2);
Benchmark.test(19,Test12Lib.local6.field3);
Benchmark.test(20,Test12Lib.local6.field4);
Benchmark.test(21,Test12Lib.local6.field1);
Benchmark.test(22,Test12Lib.local7.field2);
Benchmark.test(23,Test12Lib.local7.field3);
Benchmark.test(24,Test12Lib.local7.field4);
Benchmark.test(25,Test12Lib.local7.field1);
Benchmark.test(26,Test12Lib.local8.field2);
Benchmark.test(27,Test12Lib.local8.field3);
Benchmark.test(28,Test12Lib.local8.field4);
Benchmark.test(29,Test12Lib.local8.field1);
Benchmark.test(30,Test12Lib.local9.field2);
Benchmark.test(31,Test12Lib.local9.field3);
Benchmark.test(32,Test12Lib.local9.field4);
Benchmark.test(33,Test12Lib.local9.field1);
Benchmark.print();
}
}
