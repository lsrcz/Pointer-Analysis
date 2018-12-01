package dataset;

import benchmark.internal.Benchmark;
import benchmark.tool.BasicClass;
class Test11Lib{
public static Test11Class1 local1;
public static Test11Class1 local2;
public static Test11Class1 local3;
public static Test11Class1 local4;
public static Test11Class1 local5;
public static Test11Class2 local6;
public static Test11Class2 local7;
public static Test11Class2 local8;
public static Test11Class2 local9;
public static Test11Class2 local10;
public static Test11Class3 local11;
public static Test11Class3 local12;
}
class Test11Class1 extends BasicClass {
public Test11Class1 field1;
public Test11Class2 field2;
public static void method1(Test11Class2 arg0, Test11Class3 arg1, int depth) {
if (depth == 0) return;
arg1=arg1;
for (int local13 = 0; local13<=1; local13 += 1) {
if (depth<4) {
arg1.field1=arg1.field5.method5(arg1.field5,depth-1);
}else {
arg0.field1=arg1.field2;
}
}
}
public void method2(int depth) {
if (depth == 0) return;
for (int local14 = 0; local14<=0; local14 += 1) {
this.field1=this.field2.method3(this.field2,this.field1,depth-1);
}
}
}
class Test11Class2 extends Test11Class1 {
public Test11Class2 field3;
public Test11Class2 field4;
public Test11Class2 method3(Test11Class2 arg0, Test11Class1 arg1, int depth) {
if (depth == 0) return Test11Lib.local6;
if (depth>2) {
for (int local15 = 0; local15<=0; local15 += 1) {
arg0.field2=arg1.field2.method3(arg0,this.field1,depth-1);
}
}
this.field2.method4(arg1.field2,depth-1);
if (depth==1) {
for (int local16 = 0; local16<=2; local16 += 1) {
if (depth>=1) {
this.field3=arg0.method3(arg0.field3,arg0,depth-1);
}
}
}else {
arg1.method2(depth-1);
}
return arg0.field4;
}
public void method4(Test11Class2 arg0, int depth) {
if (depth == 0) return;
for (int local17 = 0; local17<=2; local17 += 1) {
this.field1.method2(depth-1);
}
arg0.field1=arg0.field3.method3(arg0.field4,arg0.field4,depth-1);
}
}
class Test11Class3 extends Test11Class2 {
public Test11Class3 field5;
public Test11Class1 method5(Test11Class3 arg0, int depth) {
if (depth == 0) return Test11Lib.local1;
for (int local18 = 0; local18<=2; local18 += 1) {
arg0.field5.method5(arg0,depth-1);
}
for (int local19 = 0; local19<=3; local19 += 1) {
this.field5.method2(depth-1);
}
arg0.field1=this.field4;
return this.field1;
}
public static void method6(Test11Class3 arg0, Test11Class3 arg1, int depth) {
if (depth == 0) return;
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
Test11Lib.local4 = new Test11Class1();
Benchmark.alloc(5);
Test11Lib.local5 = new Test11Class1();
Benchmark.alloc(6);
Test11Lib.local6 = new Test11Class2();
Benchmark.alloc(7);
Test11Lib.local7 = new Test11Class2();
Benchmark.alloc(8);
Test11Lib.local8 = new Test11Class2();
Benchmark.alloc(9);
Test11Lib.local9 = new Test11Class2();
Benchmark.alloc(10);
Test11Lib.local10 = new Test11Class2();
Benchmark.alloc(11);
Test11Lib.local11 = new Test11Class3();
Benchmark.alloc(12);
Test11Lib.local12 = new Test11Class3();
Test11Lib.local1.field1 = Test11Lib.local5;
Test11Lib.local1.field2 = Test11Lib.local6;
Test11Lib.local2.field1 = Test11Lib.local12;
Test11Lib.local2.field2 = Test11Lib.local7;
Test11Lib.local3.field1 = Test11Lib.local8;
Test11Lib.local3.field2 = Test11Lib.local11;
Test11Lib.local4.field1 = Test11Lib.local4;
Test11Lib.local4.field2 = Test11Lib.local11;
Test11Lib.local5.field1 = Test11Lib.local11;
Test11Lib.local5.field2 = Test11Lib.local10;
Test11Lib.local6.field3 = Test11Lib.local12;
Test11Lib.local6.field4 = Test11Lib.local7;
Test11Lib.local6.field1 = Test11Lib.local8;
Test11Lib.local6.field2 = Test11Lib.local11;
Test11Lib.local7.field3 = Test11Lib.local12;
Test11Lib.local7.field4 = Test11Lib.local10;
Test11Lib.local7.field1 = Test11Lib.local11;
Test11Lib.local7.field2 = Test11Lib.local11;
Test11Lib.local8.field3 = Test11Lib.local6;
Test11Lib.local8.field4 = Test11Lib.local10;
Test11Lib.local8.field1 = Test11Lib.local8;
Test11Lib.local8.field2 = Test11Lib.local9;
Test11Lib.local9.field3 = Test11Lib.local6;
Test11Lib.local9.field4 = Test11Lib.local9;
Test11Lib.local9.field1 = Test11Lib.local5;
Test11Lib.local9.field2 = Test11Lib.local6;
Test11Lib.local10.field3 = Test11Lib.local12;
Test11Lib.local10.field4 = Test11Lib.local9;
Test11Lib.local10.field1 = Test11Lib.local6;
Test11Lib.local10.field2 = Test11Lib.local8;
Test11Lib.local11.field5 = Test11Lib.local11;
Test11Lib.local11.field3 = Test11Lib.local9;
Test11Lib.local11.field4 = Test11Lib.local12;
Test11Lib.local11.field1 = Test11Lib.local3;
Test11Lib.local11.field2 = Test11Lib.local9;
Test11Lib.local12.field5 = Test11Lib.local12;
Test11Lib.local12.field3 = Test11Lib.local10;
Test11Lib.local12.field4 = Test11Lib.local10;
Test11Lib.local12.field1 = Test11Lib.local1;
Test11Lib.local12.field2 = Test11Lib.local6;
Test11Lib.local12.method5(Test11Lib.local11,3);
Test11Lib.local12.field3.method3(Test11Lib.local9.field4,Test11Lib.local12.field4,3);
Test11Lib.local3=Test11Lib.local1.field2;
for (int local20 = 0; local20<=1; local20 += 1) {
Test11Lib.local2.field1=Test11Lib.local1.field2;
}
Test11Lib.local12.method4(Test11Lib.local8,3);
Benchmark.test(1,Test11Lib.local1);
Benchmark.test(2,Test11Lib.local2);
Benchmark.test(3,Test11Lib.local3);
Benchmark.test(4,Test11Lib.local4);
Benchmark.test(5,Test11Lib.local5);
Benchmark.test(6,Test11Lib.local6);
Benchmark.test(7,Test11Lib.local7);
Benchmark.test(8,Test11Lib.local8);
Benchmark.test(9,Test11Lib.local9);
Benchmark.test(10,Test11Lib.local10);
Benchmark.test(11,Test11Lib.local11);
Benchmark.test(12,Test11Lib.local12);
Benchmark.test(13,Test11Lib.local1.field1);
Benchmark.test(14,Test11Lib.local1.field2);
Benchmark.test(15,Test11Lib.local2.field1);
Benchmark.test(16,Test11Lib.local2.field2);
Benchmark.test(17,Test11Lib.local3.field1);
Benchmark.test(18,Test11Lib.local3.field2);
Benchmark.test(19,Test11Lib.local4.field1);
Benchmark.test(20,Test11Lib.local4.field2);
Benchmark.test(21,Test11Lib.local5.field1);
Benchmark.test(22,Test11Lib.local5.field2);
Benchmark.test(23,Test11Lib.local6.field3);
Benchmark.test(24,Test11Lib.local6.field4);
Benchmark.test(25,Test11Lib.local6.field1);
Benchmark.test(26,Test11Lib.local6.field2);
Benchmark.test(27,Test11Lib.local7.field3);
Benchmark.test(28,Test11Lib.local7.field4);
Benchmark.test(29,Test11Lib.local7.field1);
Benchmark.test(30,Test11Lib.local7.field2);
Benchmark.test(31,Test11Lib.local8.field3);
Benchmark.test(32,Test11Lib.local8.field4);
Benchmark.test(33,Test11Lib.local8.field1);
Benchmark.test(34,Test11Lib.local8.field2);
Benchmark.test(35,Test11Lib.local9.field3);
Benchmark.test(36,Test11Lib.local9.field4);
Benchmark.test(37,Test11Lib.local9.field1);
Benchmark.test(38,Test11Lib.local9.field2);
Benchmark.test(39,Test11Lib.local10.field3);
Benchmark.test(40,Test11Lib.local10.field4);
Benchmark.test(41,Test11Lib.local10.field1);
Benchmark.test(42,Test11Lib.local10.field2);
Benchmark.test(43,Test11Lib.local11.field5);
Benchmark.test(44,Test11Lib.local11.field3);
Benchmark.test(45,Test11Lib.local11.field4);
Benchmark.test(46,Test11Lib.local11.field1);
Benchmark.test(47,Test11Lib.local11.field2);
Benchmark.test(48,Test11Lib.local12.field5);
Benchmark.test(49,Test11Lib.local12.field3);
Benchmark.test(50,Test11Lib.local12.field4);
Benchmark.test(51,Test11Lib.local12.field1);
Benchmark.test(52,Test11Lib.local12.field2);
Benchmark.print();
}
}
