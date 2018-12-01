package dataset;

import benchmark.internal.Benchmark;
import benchmark.tool.BasicClass;
class Test19Lib{
public static Test19Class1 local1;
public static Test19Class1 local2;
public static Test19Class2 local3;
public static Test19Class2 local4;
public static Test19Class2 local5;
public static Test19Class2 local6;
public static Test19Class3 local7;
public static Test19Class3 local8;
public static Test19Class3 local9;
public static Test19Class3 local10;
}
class Test19Class1 extends BasicClass {
public Test19Class3 field1;
public Test19Class2 field2;
public Test19Class3 field3;
public static Test19Class3 method1(Test19Class2 arg0, int depth) {
if (depth == 0) return Test19Lib.local7;
if (depth>1) {
if (depth<3) {
for (int local11 = 0; local11<=2; local11 += 1) {
arg0.field4=arg0.field2;
}
}else {
if (depth>2) {
if (depth>=4) {
arg0.field2=arg0.field3;
}
}else {
arg0.field4=arg0;
}
}
}
return arg0.field1;
}
public static void method2(Test19Class2 arg0, int depth) {
if (depth == 0) return;
for (int local12 = 0; local12<=2; local12 += 1) {
for (int local13 = 0; local13<=2; local13 += 1) {
arg0.field1.method6(arg0.field1,depth-1);
}
}
}
public static void method3(Test19Class1 arg0, int depth) {
if (depth == 0) return;
}
public Test19Class1 method4(Test19Class1 arg0, Test19Class1 arg1, int depth) {
if (depth == 0) return Test19Lib.local2;
arg0=arg0.field2;
return this.field3;
}
public Test19Class3 method5(Test19Class1 arg0, int depth) {
if (depth == 0) return Test19Lib.local10;
for (int local14 = 0; local14<=3; local14 += 1) {
arg0.field3.method10(this,arg0,depth-1);
}
return arg0.field3;
}
}
class Test19Class2 extends Test19Class1 {
public Test19Class1 field4;
public void method6(Test19Class3 arg0, int depth) {
if (depth == 0) return;
}
public Test19Class2 method7(Test19Class2 arg0, int depth) {
if (depth == 0) return Test19Lib.local9;
for (int local15 = 0; local15<=0; local15 += 1) {
this.field4=arg0.field4;
}
return this.field2;
}
public void method8(int depth) {
if (depth == 0) return;
}
public void method9(Test19Class1 arg0, int depth) {
if (depth == 0) return;
if (depth==1) {
this.field1=this.field1;
}else {
if (depth<=3) {
if (depth<3) {
for (int local16 = 0; local16<=2; local16 += 1) {
if (depth>2) {
}else {
}
}
}else {
for (int local17 = 0; local17<=1; local17 += 1) {
arg0.field2.method8(depth-1);
}
}
}else {
this.field4.method3(this,depth-1);
}
}
}
}
class Test19Class3 extends Test19Class2 {
public Test19Class2 field5;
public Test19Class2 field6;
public Test19Class1 method10(Test19Class1 arg0, Test19Class1 arg1, int depth) {
if (depth == 0) return Test19Lib.local1;
return arg1.field3;
}
public static Test19Class3 method11(int depth) {
if (depth == 0) return Test19Lib.local9;
return Test19Lib.local8;
}
public static void method12(Test19Class3 arg0, int depth) {
if (depth == 0) return;
}
public void method13(Test19Class2 arg0, int depth) {
if (depth == 0) return;
for (int local18 = 0; local18<=3; local18 += 1) {
this.field1.method2(this.field5,depth-1);
}
}
public void method14(Test19Class2 arg0, Test19Class1 arg1, int depth) {
if (depth == 0) return;
arg0.field3.method11(depth-1);
}
}
public class Test19{
public static void main(String[] args) {
int inputValue = 0;
Benchmark.alloc(1);
Test19Lib.local1 = new Test19Class1();
Benchmark.alloc(2);
Test19Lib.local2 = new Test19Class1();
Benchmark.alloc(3);
Test19Lib.local3 = new Test19Class2();
Benchmark.alloc(4);
Test19Lib.local4 = new Test19Class2();
Benchmark.alloc(5);
Test19Lib.local5 = new Test19Class2();
Benchmark.alloc(6);
Test19Lib.local6 = new Test19Class2();
Benchmark.alloc(7);
Test19Lib.local7 = new Test19Class3();
Benchmark.alloc(8);
Test19Lib.local8 = new Test19Class3();
Benchmark.alloc(9);
Test19Lib.local9 = new Test19Class3();
Benchmark.alloc(10);
Test19Lib.local10 = new Test19Class3();
Test19Lib.local1.field1 = Test19Lib.local10;
Test19Lib.local1.field2 = Test19Lib.local4;
Test19Lib.local1.field3 = Test19Lib.local10;
Test19Lib.local2.field1 = Test19Lib.local9;
Test19Lib.local2.field2 = Test19Lib.local5;
Test19Lib.local2.field3 = Test19Lib.local7;
Test19Lib.local3.field4 = Test19Lib.local5;
Test19Lib.local3.field1 = Test19Lib.local8;
Test19Lib.local3.field2 = Test19Lib.local4;
Test19Lib.local3.field3 = Test19Lib.local10;
Test19Lib.local4.field4 = Test19Lib.local6;
Test19Lib.local4.field1 = Test19Lib.local10;
Test19Lib.local4.field2 = Test19Lib.local4;
Test19Lib.local4.field3 = Test19Lib.local9;
Test19Lib.local5.field4 = Test19Lib.local5;
Test19Lib.local5.field1 = Test19Lib.local7;
Test19Lib.local5.field2 = Test19Lib.local9;
Test19Lib.local5.field3 = Test19Lib.local8;
Test19Lib.local6.field4 = Test19Lib.local9;
Test19Lib.local6.field1 = Test19Lib.local10;
Test19Lib.local6.field2 = Test19Lib.local5;
Test19Lib.local6.field3 = Test19Lib.local10;
Test19Lib.local7.field5 = Test19Lib.local5;
Test19Lib.local7.field6 = Test19Lib.local10;
Test19Lib.local7.field4 = Test19Lib.local9;
Test19Lib.local7.field1 = Test19Lib.local9;
Test19Lib.local7.field2 = Test19Lib.local4;
Test19Lib.local7.field3 = Test19Lib.local10;
Test19Lib.local8.field5 = Test19Lib.local4;
Test19Lib.local8.field6 = Test19Lib.local6;
Test19Lib.local8.field4 = Test19Lib.local10;
Test19Lib.local8.field1 = Test19Lib.local8;
Test19Lib.local8.field2 = Test19Lib.local8;
Test19Lib.local8.field3 = Test19Lib.local8;
Test19Lib.local9.field5 = Test19Lib.local5;
Test19Lib.local9.field6 = Test19Lib.local3;
Test19Lib.local9.field4 = Test19Lib.local10;
Test19Lib.local9.field1 = Test19Lib.local7;
Test19Lib.local9.field2 = Test19Lib.local9;
Test19Lib.local9.field3 = Test19Lib.local7;
Test19Lib.local10.field5 = Test19Lib.local9;
Test19Lib.local10.field6 = Test19Lib.local5;
Test19Lib.local10.field4 = Test19Lib.local3;
Test19Lib.local10.field1 = Test19Lib.local7;
Test19Lib.local10.field2 = Test19Lib.local6;
Test19Lib.local10.field3 = Test19Lib.local7;
Test19Lib.local9.field6.method9(Test19Lib.local7,3);
Test19Lib.local8.field4=Test19Lib.local6.field2;
if (inputValue==1) {
for (int local19 = 0; local19<=0; local19 += 1) {
Test19Lib.local9.field1.method13(Test19Lib.local7.field2,3);
}
}
Benchmark.test(1,Test19Lib.local1);
Benchmark.test(2,Test19Lib.local2);
Benchmark.test(3,Test19Lib.local3);
Benchmark.test(4,Test19Lib.local4);
Benchmark.test(5,Test19Lib.local5);
Benchmark.test(6,Test19Lib.local6);
Benchmark.test(7,Test19Lib.local7);
Benchmark.test(8,Test19Lib.local8);
Benchmark.test(9,Test19Lib.local9);
Benchmark.test(10,Test19Lib.local10);
Benchmark.test(11,Test19Lib.local1.field1);
Benchmark.test(12,Test19Lib.local1.field2);
Benchmark.test(13,Test19Lib.local1.field3);
Benchmark.test(14,Test19Lib.local2.field1);
Benchmark.test(15,Test19Lib.local2.field2);
Benchmark.test(16,Test19Lib.local2.field3);
Benchmark.test(17,Test19Lib.local3.field4);
Benchmark.test(18,Test19Lib.local3.field1);
Benchmark.test(19,Test19Lib.local3.field2);
Benchmark.test(20,Test19Lib.local3.field3);
Benchmark.test(21,Test19Lib.local4.field4);
Benchmark.test(22,Test19Lib.local4.field1);
Benchmark.test(23,Test19Lib.local4.field2);
Benchmark.test(24,Test19Lib.local4.field3);
Benchmark.test(25,Test19Lib.local5.field4);
Benchmark.test(26,Test19Lib.local5.field1);
Benchmark.test(27,Test19Lib.local5.field2);
Benchmark.test(28,Test19Lib.local5.field3);
Benchmark.test(29,Test19Lib.local6.field4);
Benchmark.test(30,Test19Lib.local6.field1);
Benchmark.test(31,Test19Lib.local6.field2);
Benchmark.test(32,Test19Lib.local6.field3);
Benchmark.test(33,Test19Lib.local7.field5);
Benchmark.test(34,Test19Lib.local7.field6);
Benchmark.test(35,Test19Lib.local7.field4);
Benchmark.test(36,Test19Lib.local7.field1);
Benchmark.test(37,Test19Lib.local7.field2);
Benchmark.test(38,Test19Lib.local7.field3);
Benchmark.test(39,Test19Lib.local8.field5);
Benchmark.test(40,Test19Lib.local8.field6);
Benchmark.test(41,Test19Lib.local8.field4);
Benchmark.test(42,Test19Lib.local8.field1);
Benchmark.test(43,Test19Lib.local8.field2);
Benchmark.test(44,Test19Lib.local8.field3);
Benchmark.test(45,Test19Lib.local9.field5);
Benchmark.test(46,Test19Lib.local9.field6);
Benchmark.test(47,Test19Lib.local9.field4);
Benchmark.test(48,Test19Lib.local9.field1);
Benchmark.test(49,Test19Lib.local9.field2);
Benchmark.test(50,Test19Lib.local9.field3);
Benchmark.test(51,Test19Lib.local10.field5);
Benchmark.test(52,Test19Lib.local10.field6);
Benchmark.test(53,Test19Lib.local10.field4);
Benchmark.test(54,Test19Lib.local10.field1);
Benchmark.test(55,Test19Lib.local10.field2);
Benchmark.test(56,Test19Lib.local10.field3);
Benchmark.print();
}
}
