package runnabledataset;

import benchmark.tool.Benchmark;
import benchmark.tool.BasicClass;
class Test13Lib{
public static Test13Class1 local1;
public static Test13Class1 local2;
public static Test13Class1 local3;
public static Test13Class1 local4;
public static Test13Class2 local5;
public static Test13Class3 local6;
public static Test13Class3 local7;
public static Test13Class3 local8;
public static Test13Class3 local9;
}
class Test13Class1 extends BasicClass {
public Test13Class1 field1;
public Test13Class3 method1(Test13Class1 arg0, Test13Class1 arg1, int depth) {
if (depth == 0) return Test13Lib.local9;
this.field1=arg1;
this.field1=this.field1.method1(this,this,depth-1);
if (depth>=4) {
if (depth>1) {
if (depth>=3) {
for (int local10 = 0; local10<=1; local10 += 1) {
if (depth>=2) {
}else {
}
}
}
}else {
if (depth>1) {
if (depth==3) {
for (int local11 = 0; local11<=1; local11 += 1) {
}
}else {
for (int local12 = 0; local12<=0; local12 += 1) {
}
}
}
}
}
return Test13Lib.local8;
}
public Test13Class1 method2(Test13Class2 arg0, int depth) {
if (depth == 0) return Test13Lib.local1;
arg0.field3=arg0.field3;
if (depth>3) {
arg0.field2=this.method2(arg0.field3,depth-1);
}
return arg0.field1;
}
}
class Test13Class2 extends Test13Class1 {
public Test13Class1 field2;
public Test13Class3 field3;
public static Test13Class1 method3(int depth) {
if (depth == 0) return Test13Lib.local7;
return Test13Lib.local8;
}
public static Test13Class1 method4(Test13Class3 arg0, int depth) {
if (depth == 0) return Test13Lib.local4;
if (depth==2) {
if (depth>1) {
for (int local13 = 0; local13<=2; local13 += 1) {
arg0.field5.method3(depth-1);
}
}else {
if (depth<=1) {
arg0.field1=arg0.field4;
}
}
}else {
arg0.field2=arg0.field6.method4(arg0.field6,depth-1);
}
for (int local14 = 0; local14<=3; local14 += 1) {
if (depth>2) {
for (int local15 = 0; local15<=3; local15 += 1) {
arg0.field3.method6(depth-1);
}
}else {
if (depth<1) {
for (int local16 = 0; local16<=1; local16 += 1) {
arg0.field4.method3(depth-1);
}
}else {
arg0.field5=arg0.field2.method1(arg0.field2,arg0.field6,depth-1);
}
}
}
for (int local17 = 0; local17<=2; local17 += 1) {
if (depth==4) {
arg0.field5.method2(arg0.field4,depth-1);
}else {
for (int local18 = 0; local18<=0; local18 += 1) {
arg0.field3=arg0;
}
}
}
if (depth<=1) {
arg0.field4=arg0.field5;
}
return arg0;
}
public Test13Class1 method5(int depth) {
if (depth == 0) return Test13Lib.local2;
if (depth<=2) {
this.field3=this.field3;
}
if (depth>=2) {
for (int local19 = 0; local19<=1; local19 += 1) {
for (int local20 = 0; local20<=1; local20 += 1) {
this.method3(depth-1);
}
}
}else {
this.method5(depth-1);
}
return this.field3;
}
}
class Test13Class3 extends Test13Class2 {
public Test13Class2 field4;
public Test13Class3 field5;
public Test13Class3 field6;
public void method6(int depth) {
if (depth == 0) return;
}
}
public class Test13{
public static void main(String[] args) {
int inputValue = 10;
Benchmark.alloc(1);
Test13Lib.local1 = new Test13Class1();
Benchmark.alloc(2);
Test13Lib.local2 = new Test13Class1();
Benchmark.alloc(3);
Test13Lib.local3 = new Test13Class1();
Benchmark.alloc(4);
Test13Lib.local4 = new Test13Class1();
Benchmark.alloc(5);
Test13Lib.local5 = new Test13Class2();
Benchmark.alloc(6);
Test13Lib.local6 = new Test13Class3();
Benchmark.alloc(7);
Test13Lib.local7 = new Test13Class3();
Benchmark.alloc(8);
Test13Lib.local8 = new Test13Class3();
Benchmark.alloc(9);
Test13Lib.local9 = new Test13Class3();
Test13Lib.local1.field1 = Test13Lib.local3;
Test13Lib.local2.field1 = Test13Lib.local4;
Test13Lib.local3.field1 = Test13Lib.local2;
Test13Lib.local4.field1 = Test13Lib.local1;
Test13Lib.local5.field2 = Test13Lib.local3;
Test13Lib.local5.field3 = Test13Lib.local9;
Test13Lib.local5.field1 = Test13Lib.local5;
Test13Lib.local6.field4 = Test13Lib.local5;
Test13Lib.local6.field5 = Test13Lib.local6;
Test13Lib.local6.field6 = Test13Lib.local6;
Test13Lib.local6.field2 = Test13Lib.local3;
Test13Lib.local6.field3 = Test13Lib.local6;
Test13Lib.local6.field1 = Test13Lib.local3;
Test13Lib.local7.field4 = Test13Lib.local6;
Test13Lib.local7.field5 = Test13Lib.local8;
Test13Lib.local7.field6 = Test13Lib.local8;
Test13Lib.local7.field2 = Test13Lib.local8;
Test13Lib.local7.field3 = Test13Lib.local9;
Test13Lib.local7.field1 = Test13Lib.local3;
Test13Lib.local8.field4 = Test13Lib.local9;
Test13Lib.local8.field5 = Test13Lib.local9;
Test13Lib.local8.field6 = Test13Lib.local6;
Test13Lib.local8.field2 = Test13Lib.local5;
Test13Lib.local8.field3 = Test13Lib.local6;
Test13Lib.local8.field1 = Test13Lib.local5;
Test13Lib.local9.field4 = Test13Lib.local6;
Test13Lib.local9.field5 = Test13Lib.local8;
Test13Lib.local9.field6 = Test13Lib.local8;
Test13Lib.local9.field2 = Test13Lib.local6;
Test13Lib.local9.field3 = Test13Lib.local7;
Test13Lib.local9.field1 = Test13Lib.local6;
for (int local21 = 0; local21<=3; local21 += 1) {
Test13Lib.local6.field4=Test13Lib.local7;
}
Test13Lib.local7.field2=Test13Lib.local5.method3(3);
Test13Lib.local9.field2.method1(Test13Lib.local8.field4,Test13Lib.local3,3);
Test13Lib.local4=Test13Lib.local9.field1;
if (inputValue>2) {
Test13Lib.local5.field1=Test13Lib.local7.field3.method5(3);
}
Benchmark.test(1,Test13Lib.local1);
Benchmark.test(2,Test13Lib.local2);
Benchmark.test(3,Test13Lib.local3);
Benchmark.test(4,Test13Lib.local4);
Benchmark.test(5,Test13Lib.local5);
Benchmark.test(6,Test13Lib.local6);
Benchmark.test(7,Test13Lib.local7);
Benchmark.test(8,Test13Lib.local8);
Benchmark.test(9,Test13Lib.local9);
Benchmark.test(10,Test13Lib.local1.field1);
Benchmark.test(11,Test13Lib.local2.field1);
Benchmark.test(12,Test13Lib.local3.field1);
Benchmark.test(13,Test13Lib.local4.field1);
Benchmark.test(14,Test13Lib.local5.field2);
Benchmark.test(15,Test13Lib.local5.field3);
Benchmark.test(16,Test13Lib.local5.field1);
Benchmark.test(17,Test13Lib.local6.field4);
Benchmark.test(18,Test13Lib.local6.field5);
Benchmark.test(19,Test13Lib.local6.field6);
Benchmark.test(20,Test13Lib.local6.field2);
Benchmark.test(21,Test13Lib.local6.field3);
Benchmark.test(22,Test13Lib.local6.field1);
Benchmark.test(23,Test13Lib.local7.field4);
Benchmark.test(24,Test13Lib.local7.field5);
Benchmark.test(25,Test13Lib.local7.field6);
Benchmark.test(26,Test13Lib.local7.field2);
Benchmark.test(27,Test13Lib.local7.field3);
Benchmark.test(28,Test13Lib.local7.field1);
Benchmark.test(29,Test13Lib.local8.field4);
Benchmark.test(30,Test13Lib.local8.field5);
Benchmark.test(31,Test13Lib.local8.field6);
Benchmark.test(32,Test13Lib.local8.field2);
Benchmark.test(33,Test13Lib.local8.field3);
Benchmark.test(34,Test13Lib.local8.field1);
Benchmark.test(35,Test13Lib.local9.field4);
Benchmark.test(36,Test13Lib.local9.field5);
Benchmark.test(37,Test13Lib.local9.field6);
Benchmark.test(38,Test13Lib.local9.field2);
Benchmark.test(39,Test13Lib.local9.field3);
Benchmark.test(40,Test13Lib.local9.field1);
Benchmark.print();
}
}
