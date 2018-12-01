package dataset;

import benchmark.internal.Benchmark;
import benchmark.tool.BasicClass;
class Test22Lib{
public static Test22Class1 local1;
public static Test22Class1 local2;
public static Test22Class2 local3;
public static Test22Class2 local4;
public static Test22Class2 local5;
public static Test22Class2 local6;
public static Test22Class2 local7;
public static Test22Class3 local8;
public static Test22Class3 local9;
public static Test22Class3 local10;
public static Test22Class3 local11;
public static Test22Class3 local12;
}
class Test22Class1 extends BasicClass {
public Test22Class1 field1;
public static Test22Class1 method1(int depth) {
if (depth == 0) return Test22Lib.local8;
return Test22Lib.local9;
}
}
class Test22Class2 extends Test22Class1 {
public Test22Class2 field2;
public Test22Class1 field3;
public Test22Class1 field4;
public void method2(Test22Class3 arg0, int depth) {
if (depth == 0) return;
arg0=arg0;
}
public static Test22Class1 method3(int depth) {
if (depth == 0) return Test22Lib.local4;
return Test22Lib.local8;
}
public static void method4(int depth) {
if (depth == 0) return;
}
public static void method5(Test22Class1 arg0, Test22Class2 arg1, int depth) {
if (depth == 0) return;
arg1=arg1.field2;
}
}
class Test22Class3 extends Test22Class1 {
public Test22Class2 field5;
public Test22Class1 field6;
public Test22Class1 field7;
public static Test22Class1 method6(int depth) {
if (depth == 0) return Test22Lib.local3;
if (depth>1) {
if (depth<=1) {
for (int local13 = 0; local13<=0; local13 += 1) {
for (int local14 = 0; local14<=0; local14 += 1) {
if (depth==1) {
}else {
}
}
}
}
}else {
for (int local15 = 0; local15<=0; local15 += 1) {
if (depth<2) {
if (depth<2) {
if (depth==3) {
}
}else {
for (int local16 = 0; local16<=2; local16 += 1) {
}
}
}
}
}
return Test22Lib.local1;
}
public Test22Class2 method7(Test22Class3 arg0, int depth) {
if (depth == 0) return Test22Lib.local7;
return arg0.field5;
}
public Test22Class2 method8(Test22Class3 arg0, Test22Class2 arg1, int depth) {
if (depth == 0) return Test22Lib.local6;
return this.field5;
}
}
public class Test22{
public static void main(String[] args) {
int inputValue = 0;
Benchmark.alloc(1);
Test22Lib.local1 = new Test22Class1();
Benchmark.alloc(2);
Test22Lib.local2 = new Test22Class1();
Benchmark.alloc(3);
Test22Lib.local3 = new Test22Class2();
Benchmark.alloc(4);
Test22Lib.local4 = new Test22Class2();
Benchmark.alloc(5);
Test22Lib.local5 = new Test22Class2();
Benchmark.alloc(6);
Test22Lib.local6 = new Test22Class2();
Benchmark.alloc(7);
Test22Lib.local7 = new Test22Class2();
Benchmark.alloc(8);
Test22Lib.local8 = new Test22Class3();
Benchmark.alloc(9);
Test22Lib.local9 = new Test22Class3();
Benchmark.alloc(10);
Test22Lib.local10 = new Test22Class3();
Benchmark.alloc(11);
Test22Lib.local11 = new Test22Class3();
Benchmark.alloc(12);
Test22Lib.local12 = new Test22Class3();
Test22Lib.local1.field1 = Test22Lib.local10;
Test22Lib.local2.field1 = Test22Lib.local4;
Test22Lib.local3.field2 = Test22Lib.local6;
Test22Lib.local3.field3 = Test22Lib.local8;
Test22Lib.local3.field4 = Test22Lib.local11;
Test22Lib.local3.field1 = Test22Lib.local9;
Test22Lib.local4.field2 = Test22Lib.local3;
Test22Lib.local4.field3 = Test22Lib.local9;
Test22Lib.local4.field4 = Test22Lib.local5;
Test22Lib.local4.field1 = Test22Lib.local6;
Test22Lib.local5.field2 = Test22Lib.local3;
Test22Lib.local5.field3 = Test22Lib.local3;
Test22Lib.local5.field4 = Test22Lib.local3;
Test22Lib.local5.field1 = Test22Lib.local8;
Test22Lib.local6.field2 = Test22Lib.local3;
Test22Lib.local6.field3 = Test22Lib.local11;
Test22Lib.local6.field4 = Test22Lib.local11;
Test22Lib.local6.field1 = Test22Lib.local7;
Test22Lib.local7.field2 = Test22Lib.local5;
Test22Lib.local7.field3 = Test22Lib.local11;
Test22Lib.local7.field4 = Test22Lib.local2;
Test22Lib.local7.field1 = Test22Lib.local11;
Test22Lib.local8.field5 = Test22Lib.local3;
Test22Lib.local8.field6 = Test22Lib.local4;
Test22Lib.local8.field7 = Test22Lib.local3;
Test22Lib.local8.field1 = Test22Lib.local11;
Test22Lib.local9.field5 = Test22Lib.local4;
Test22Lib.local9.field6 = Test22Lib.local7;
Test22Lib.local9.field7 = Test22Lib.local4;
Test22Lib.local9.field1 = Test22Lib.local6;
Test22Lib.local10.field5 = Test22Lib.local4;
Test22Lib.local10.field6 = Test22Lib.local8;
Test22Lib.local10.field7 = Test22Lib.local10;
Test22Lib.local10.field1 = Test22Lib.local2;
Test22Lib.local11.field5 = Test22Lib.local6;
Test22Lib.local11.field6 = Test22Lib.local5;
Test22Lib.local11.field7 = Test22Lib.local1;
Test22Lib.local11.field1 = Test22Lib.local10;
Test22Lib.local12.field5 = Test22Lib.local7;
Test22Lib.local12.field6 = Test22Lib.local9;
Test22Lib.local12.field7 = Test22Lib.local5;
Test22Lib.local12.field1 = Test22Lib.local9;
if (inputValue<=1) {
if (inputValue==2) {
Test22Lib.local4.field2=Test22Lib.local7.field2;
}
}else {
for (int local17 = 0; local17<=1; local17 += 1) {
if (inputValue<1) {
Test22Lib.local9=Test22Lib.local10;
}
}
}
Test22Lib.local8.field5.method2(Test22Lib.local11,3);
for (int local18 = 0; local18<=0; local18 += 1) {
Test22Lib.local12.field7=Test22Lib.local8.method6(3);
}
Benchmark.test(1,Test22Lib.local1);
Benchmark.test(2,Test22Lib.local2);
Benchmark.test(3,Test22Lib.local3);
Benchmark.test(4,Test22Lib.local4);
Benchmark.test(5,Test22Lib.local5);
Benchmark.test(6,Test22Lib.local6);
Benchmark.test(7,Test22Lib.local7);
Benchmark.test(8,Test22Lib.local8);
Benchmark.test(9,Test22Lib.local9);
Benchmark.test(10,Test22Lib.local10);
Benchmark.test(11,Test22Lib.local11);
Benchmark.test(12,Test22Lib.local12);
Benchmark.test(13,Test22Lib.local1.field1);
Benchmark.test(14,Test22Lib.local2.field1);
Benchmark.test(15,Test22Lib.local3.field2);
Benchmark.test(16,Test22Lib.local3.field3);
Benchmark.test(17,Test22Lib.local3.field4);
Benchmark.test(18,Test22Lib.local3.field1);
Benchmark.test(19,Test22Lib.local4.field2);
Benchmark.test(20,Test22Lib.local4.field3);
Benchmark.test(21,Test22Lib.local4.field4);
Benchmark.test(22,Test22Lib.local4.field1);
Benchmark.test(23,Test22Lib.local5.field2);
Benchmark.test(24,Test22Lib.local5.field3);
Benchmark.test(25,Test22Lib.local5.field4);
Benchmark.test(26,Test22Lib.local5.field1);
Benchmark.test(27,Test22Lib.local6.field2);
Benchmark.test(28,Test22Lib.local6.field3);
Benchmark.test(29,Test22Lib.local6.field4);
Benchmark.test(30,Test22Lib.local6.field1);
Benchmark.test(31,Test22Lib.local7.field2);
Benchmark.test(32,Test22Lib.local7.field3);
Benchmark.test(33,Test22Lib.local7.field4);
Benchmark.test(34,Test22Lib.local7.field1);
Benchmark.test(35,Test22Lib.local8.field5);
Benchmark.test(36,Test22Lib.local8.field6);
Benchmark.test(37,Test22Lib.local8.field7);
Benchmark.test(38,Test22Lib.local8.field1);
Benchmark.test(39,Test22Lib.local9.field5);
Benchmark.test(40,Test22Lib.local9.field6);
Benchmark.test(41,Test22Lib.local9.field7);
Benchmark.test(42,Test22Lib.local9.field1);
Benchmark.test(43,Test22Lib.local10.field5);
Benchmark.test(44,Test22Lib.local10.field6);
Benchmark.test(45,Test22Lib.local10.field7);
Benchmark.test(46,Test22Lib.local10.field1);
Benchmark.test(47,Test22Lib.local11.field5);
Benchmark.test(48,Test22Lib.local11.field6);
Benchmark.test(49,Test22Lib.local11.field7);
Benchmark.test(50,Test22Lib.local11.field1);
Benchmark.test(51,Test22Lib.local12.field5);
Benchmark.test(52,Test22Lib.local12.field6);
Benchmark.test(53,Test22Lib.local12.field7);
Benchmark.test(54,Test22Lib.local12.field1);
Benchmark.print();
}
}
