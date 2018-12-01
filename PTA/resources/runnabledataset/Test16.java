package runnabledataset;

import benchmark.tool.Benchmark;
import benchmark.tool.BasicClass;
class Test16Lib{
public static Test16Class1 local1;
public static Test16Class2 local2;
public static Test16Class2 local3;
public static Test16Class2 local4;
public static Test16Class3 local5;
public static Test16Class3 local6;
public static Test16Class3 local7;
public static Test16Class3 local8;
}
class Test16Class1 extends BasicClass {
public Test16Class1 field1;
public Test16Class2 method1(int depth) {
if (depth == 0) return Test16Lib.local6;
for (int local9 = 0; local9<=2; local9 += 1) {
if (depth<1) {
this.field1=this;
}else {
this.field1=this.field1.method1(depth-1);
}
}
return Test16Lib.local4;
}
public static void method2(Test16Class1 arg0, Test16Class3 arg1, int depth) {
if (depth == 0) return;
arg1.field1.method1(depth-1);
}
public static Test16Class1 method3(Test16Class2 arg0, int depth) {
if (depth == 0) return Test16Lib.local5;
return arg0.field2;
}
public static Test16Class1 method4(Test16Class3 arg0, int depth) {
if (depth == 0) return Test16Lib.local7;
return arg0.field1;
}
}
class Test16Class2 extends Test16Class1 {
public Test16Class1 field2;
public Test16Class2 field3;
public static Test16Class3 method5(int depth) {
if (depth == 0) return Test16Lib.local6;
return Test16Lib.local5;
}
public static Test16Class3 method6(Test16Class1 arg0, Test16Class2 arg1, int depth) {
if (depth == 0) return Test16Lib.local8;
for (int local10 = 0; local10<=3; local10 += 1) {
if (depth>=1) {
if (depth>=1) {
if (depth==2) {
arg1.field2=arg1.field3.method5(depth-1);
}else {
for (int local11 = 0; local11<=1; local11 += 1) {
}
}
}else {
arg1.field1=arg1.field1;
}
}else {
if (depth>=4) {
arg1.field3=arg1;
}else {
for (int local12 = 0; local12<=0; local12 += 1) {
for (int local13 = 0; local13<=3; local13 += 1) {
}
}
}
}
}
return Test16Lib.local6;
}
}
class Test16Class3 extends Test16Class2 {
public Test16Class3 field4;
public Test16Class1 field5;
public static void method7(Test16Class3 arg0, Test16Class3 arg1, int depth) {
if (depth == 0) return;
arg0.field2=arg1.field2.method4(arg0,depth-1);
}
public static Test16Class1 method8(int depth) {
if (depth == 0) return Test16Lib.local7;
for (int local14 = 0; local14<=0; local14 += 1) {
if (depth==3) {
for (int local15 = 0; local15<=2; local15 += 1) {
for (int local16 = 0; local16<=2; local16 += 1) {
for (int local17 = 0; local17<=2; local17 += 1) {
}
}
}
}
}
return Test16Lib.local5;
}
}
public class Test16{
public static void main(String[] args) {
int inputValue = 10;
Benchmark.alloc(1);
Test16Lib.local1 = new Test16Class1();
Benchmark.alloc(2);
Test16Lib.local2 = new Test16Class2();
Benchmark.alloc(3);
Test16Lib.local3 = new Test16Class2();
Benchmark.alloc(4);
Test16Lib.local4 = new Test16Class2();
Benchmark.alloc(5);
Test16Lib.local5 = new Test16Class3();
Benchmark.alloc(6);
Test16Lib.local6 = new Test16Class3();
Benchmark.alloc(7);
Test16Lib.local7 = new Test16Class3();
Benchmark.alloc(8);
Test16Lib.local8 = new Test16Class3();
Test16Lib.local1.field1 = Test16Lib.local8;
Test16Lib.local2.field2 = Test16Lib.local3;
Test16Lib.local2.field3 = Test16Lib.local4;
Test16Lib.local2.field1 = Test16Lib.local7;
Test16Lib.local3.field2 = Test16Lib.local7;
Test16Lib.local3.field3 = Test16Lib.local4;
Test16Lib.local3.field1 = Test16Lib.local8;
Test16Lib.local4.field2 = Test16Lib.local4;
Test16Lib.local4.field3 = Test16Lib.local6;
Test16Lib.local4.field1 = Test16Lib.local2;
Test16Lib.local5.field4 = Test16Lib.local5;
Test16Lib.local5.field5 = Test16Lib.local8;
Test16Lib.local5.field2 = Test16Lib.local3;
Test16Lib.local5.field3 = Test16Lib.local8;
Test16Lib.local5.field1 = Test16Lib.local6;
Test16Lib.local6.field4 = Test16Lib.local7;
Test16Lib.local6.field5 = Test16Lib.local7;
Test16Lib.local6.field2 = Test16Lib.local3;
Test16Lib.local6.field3 = Test16Lib.local8;
Test16Lib.local6.field1 = Test16Lib.local2;
Test16Lib.local7.field4 = Test16Lib.local8;
Test16Lib.local7.field5 = Test16Lib.local1;
Test16Lib.local7.field2 = Test16Lib.local7;
Test16Lib.local7.field3 = Test16Lib.local5;
Test16Lib.local7.field1 = Test16Lib.local7;
Test16Lib.local8.field4 = Test16Lib.local5;
Test16Lib.local8.field5 = Test16Lib.local4;
Test16Lib.local8.field2 = Test16Lib.local4;
Test16Lib.local8.field3 = Test16Lib.local5;
Test16Lib.local8.field1 = Test16Lib.local6;
for (int local18 = 0; local18<=0; local18 += 1) {
Test16Lib.local7.method8(3);
}
if (inputValue<4) {
Test16Lib.local7.field1=Test16Lib.local6.field4;
}else {
if (inputValue<2) {
Test16Lib.local6.field2.method1(3);
}else {
Test16Lib.local4.field1=Test16Lib.local4.method3(Test16Lib.local4,3);
}
}
Test16Lib.local1.field1=Test16Lib.local8.method4(Test16Lib.local6,3);
Benchmark.test(1,Test16Lib.local1);
Benchmark.test(2,Test16Lib.local2);
Benchmark.test(3,Test16Lib.local3);
Benchmark.test(4,Test16Lib.local4);
Benchmark.test(5,Test16Lib.local5);
Benchmark.test(6,Test16Lib.local6);
Benchmark.test(7,Test16Lib.local7);
Benchmark.test(8,Test16Lib.local8);
Benchmark.test(9,Test16Lib.local1.field1);
Benchmark.test(10,Test16Lib.local2.field2);
Benchmark.test(11,Test16Lib.local2.field3);
Benchmark.test(12,Test16Lib.local2.field1);
Benchmark.test(13,Test16Lib.local3.field2);
Benchmark.test(14,Test16Lib.local3.field3);
Benchmark.test(15,Test16Lib.local3.field1);
Benchmark.test(16,Test16Lib.local4.field2);
Benchmark.test(17,Test16Lib.local4.field3);
Benchmark.test(18,Test16Lib.local4.field1);
Benchmark.test(19,Test16Lib.local5.field4);
Benchmark.test(20,Test16Lib.local5.field5);
Benchmark.test(21,Test16Lib.local5.field2);
Benchmark.test(22,Test16Lib.local5.field3);
Benchmark.test(23,Test16Lib.local5.field1);
Benchmark.test(24,Test16Lib.local6.field4);
Benchmark.test(25,Test16Lib.local6.field5);
Benchmark.test(26,Test16Lib.local6.field2);
Benchmark.test(27,Test16Lib.local6.field3);
Benchmark.test(28,Test16Lib.local6.field1);
Benchmark.test(29,Test16Lib.local7.field4);
Benchmark.test(30,Test16Lib.local7.field5);
Benchmark.test(31,Test16Lib.local7.field2);
Benchmark.test(32,Test16Lib.local7.field3);
Benchmark.test(33,Test16Lib.local7.field1);
Benchmark.test(34,Test16Lib.local8.field4);
Benchmark.test(35,Test16Lib.local8.field5);
Benchmark.test(36,Test16Lib.local8.field2);
Benchmark.test(37,Test16Lib.local8.field3);
Benchmark.test(38,Test16Lib.local8.field1);
Benchmark.print();
}
}
