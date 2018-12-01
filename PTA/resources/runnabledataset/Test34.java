package runnabledataset;

import benchmark.tool.Benchmark;
import benchmark.tool.BasicClass;
class Test34Lib{
public static Test34Class1 local1;
public static Test34Class1 local2;
public static Test34Class1 local3;
public static Test34Class2 local4;
public static Test34Class3 local5;
public static Test34Class3 local6;
public static Test34Class3 local7;
public static Test34Class3 local8;
public static Test34Class3 local9;
}
class Test34Class1 extends BasicClass {
public Test34Class2 field1;
public Test34Class3 field2;
public Test34Class3 field3;
public Test34Class2 field4;
public Test34Class1 field5;
public static void method1(Test34Class3 arg0, int depth) {
if (depth == 0) return;
if (depth==2) {
if (depth>=2) {
for (int local10 = 0; local10<=1; local10 += 1) {
if (depth>3) {
arg0.field7.method5(arg0.field3.field2,depth-1);
}else {
arg0.field7.field1=arg0.field5.field3.field2;
}
}
}
}
}
}
class Test34Class2 extends Test34Class1 {
public Test34Class3 field6;
public static void method2(Test34Class3 arg0, int depth) {
if (depth == 0) return;
}
public static Test34Class3 method3(int depth) {
if (depth == 0) return Test34Lib.local8;
if (depth>3) {
for (int local11 = 0; local11<=1; local11 += 1) {
if (depth>3) {
if (depth<=2) {
if (depth==2) {
}else {
}
}
}else {
for (int local12 = 0; local12<=2; local12 += 1) {
if (depth<1) {
}
}
}
}
}
return Test34Lib.local8;
}
public Test34Class2 method4(Test34Class2 arg0, Test34Class3 arg1, int depth) {
if (depth == 0) return Test34Lib.local4;
if (depth>=4) {
arg0.field2.field2.field5=arg1.field7.field7.field6;
}else {
if (depth<1) {
this.field6.field7.field7.method2(arg0.field6.field2.field3,depth-1);
}
}
return arg1.field7.field3.field2;
}
}
class Test34Class3 extends Test34Class2 {
public Test34Class3 field7;
public void method5(Test34Class3 arg0, int depth) {
if (depth == 0) return;
for (int local13 = 0; local13<=0; local13 += 1) {
if (depth==3) {
arg0.field6.method2(this.field6.field3,depth-1);
}else {
this.field4.field3.field2=arg0.field1.field6.field6;
}
}
}
}
public class Test34{
public static void main(String[] args) {
int inputValue = 10;
Benchmark.alloc(1);
Test34Lib.local1 = new Test34Class1();
Benchmark.alloc(2);
Test34Lib.local2 = new Test34Class1();
Benchmark.alloc(3);
Test34Lib.local3 = new Test34Class1();
Benchmark.alloc(4);
Test34Lib.local4 = new Test34Class2();
Benchmark.alloc(5);
Test34Lib.local5 = new Test34Class3();
Benchmark.alloc(6);
Test34Lib.local6 = new Test34Class3();
Benchmark.alloc(7);
Test34Lib.local7 = new Test34Class3();
Benchmark.alloc(8);
Test34Lib.local8 = new Test34Class3();
Benchmark.alloc(9);
Test34Lib.local9 = new Test34Class3();
Test34Lib.local1.field1 = Test34Lib.local5;
Test34Lib.local1.field2 = Test34Lib.local8;
Test34Lib.local1.field3 = Test34Lib.local8;
Test34Lib.local1.field4 = Test34Lib.local7;
Test34Lib.local1.field5 = Test34Lib.local4;
Test34Lib.local2.field1 = Test34Lib.local5;
Test34Lib.local2.field2 = Test34Lib.local8;
Test34Lib.local2.field3 = Test34Lib.local7;
Test34Lib.local2.field4 = Test34Lib.local5;
Test34Lib.local2.field5 = Test34Lib.local7;
Test34Lib.local3.field1 = Test34Lib.local6;
Test34Lib.local3.field2 = Test34Lib.local8;
Test34Lib.local3.field3 = Test34Lib.local5;
Test34Lib.local3.field4 = Test34Lib.local4;
Test34Lib.local3.field5 = Test34Lib.local2;
Test34Lib.local4.field6 = Test34Lib.local7;
Test34Lib.local4.field1 = Test34Lib.local4;
Test34Lib.local4.field2 = Test34Lib.local8;
Test34Lib.local4.field3 = Test34Lib.local8;
Test34Lib.local4.field4 = Test34Lib.local6;
Test34Lib.local4.field5 = Test34Lib.local1;
Test34Lib.local5.field7 = Test34Lib.local9;
Test34Lib.local5.field6 = Test34Lib.local6;
Test34Lib.local5.field1 = Test34Lib.local8;
Test34Lib.local5.field2 = Test34Lib.local6;
Test34Lib.local5.field3 = Test34Lib.local5;
Test34Lib.local5.field4 = Test34Lib.local8;
Test34Lib.local5.field5 = Test34Lib.local2;
Test34Lib.local6.field7 = Test34Lib.local7;
Test34Lib.local6.field6 = Test34Lib.local8;
Test34Lib.local6.field1 = Test34Lib.local6;
Test34Lib.local6.field2 = Test34Lib.local7;
Test34Lib.local6.field3 = Test34Lib.local9;
Test34Lib.local6.field4 = Test34Lib.local8;
Test34Lib.local6.field5 = Test34Lib.local1;
Test34Lib.local7.field7 = Test34Lib.local9;
Test34Lib.local7.field6 = Test34Lib.local8;
Test34Lib.local7.field1 = Test34Lib.local4;
Test34Lib.local7.field2 = Test34Lib.local7;
Test34Lib.local7.field3 = Test34Lib.local9;
Test34Lib.local7.field4 = Test34Lib.local6;
Test34Lib.local7.field5 = Test34Lib.local6;
Test34Lib.local8.field7 = Test34Lib.local7;
Test34Lib.local8.field6 = Test34Lib.local6;
Test34Lib.local8.field1 = Test34Lib.local8;
Test34Lib.local8.field2 = Test34Lib.local5;
Test34Lib.local8.field3 = Test34Lib.local5;
Test34Lib.local8.field4 = Test34Lib.local8;
Test34Lib.local8.field5 = Test34Lib.local1;
Test34Lib.local9.field7 = Test34Lib.local8;
Test34Lib.local9.field6 = Test34Lib.local9;
Test34Lib.local9.field1 = Test34Lib.local7;
Test34Lib.local9.field2 = Test34Lib.local5;
Test34Lib.local9.field3 = Test34Lib.local5;
Test34Lib.local9.field4 = Test34Lib.local4;
Test34Lib.local9.field5 = Test34Lib.local2;
if (inputValue==3) {
Test34Lib.local8.field7.field2.field1=Test34Lib.local2.field2.field6.field7;
}
Test34Lib.local3.field1.field3.field4=Test34Lib.local1.field2.field2.field3.method4(Test34Lib.local4.field3.field7.field4,Test34Lib.local2.field3.field5.field2,3);
Test34Lib.local9.field1.field3.field3.method5(Test34Lib.local9.field6.field7.field3,3);
Benchmark.test(1,Test34Lib.local1);
Benchmark.test(2,Test34Lib.local2);
Benchmark.test(3,Test34Lib.local3);
Benchmark.test(4,Test34Lib.local4);
Benchmark.test(5,Test34Lib.local5);
Benchmark.test(6,Test34Lib.local6);
Benchmark.test(7,Test34Lib.local7);
Benchmark.test(8,Test34Lib.local8);
Benchmark.test(9,Test34Lib.local9);
Benchmark.test(10,Test34Lib.local1.field1);
Benchmark.test(11,Test34Lib.local1.field2);
Benchmark.test(12,Test34Lib.local1.field3);
Benchmark.test(13,Test34Lib.local1.field4);
Benchmark.test(14,Test34Lib.local1.field5);
Benchmark.test(15,Test34Lib.local2.field1);
Benchmark.test(16,Test34Lib.local2.field2);
Benchmark.test(17,Test34Lib.local2.field3);
Benchmark.test(18,Test34Lib.local2.field4);
Benchmark.test(19,Test34Lib.local2.field5);
Benchmark.test(20,Test34Lib.local3.field1);
Benchmark.test(21,Test34Lib.local3.field2);
Benchmark.test(22,Test34Lib.local3.field3);
Benchmark.test(23,Test34Lib.local3.field4);
Benchmark.test(24,Test34Lib.local3.field5);
Benchmark.test(25,Test34Lib.local4.field6);
Benchmark.test(26,Test34Lib.local4.field1);
Benchmark.test(27,Test34Lib.local4.field2);
Benchmark.test(28,Test34Lib.local4.field3);
Benchmark.test(29,Test34Lib.local4.field4);
Benchmark.test(30,Test34Lib.local4.field5);
Benchmark.test(31,Test34Lib.local5.field7);
Benchmark.test(32,Test34Lib.local5.field6);
Benchmark.test(33,Test34Lib.local5.field1);
Benchmark.test(34,Test34Lib.local5.field2);
Benchmark.test(35,Test34Lib.local5.field3);
Benchmark.test(36,Test34Lib.local5.field4);
Benchmark.test(37,Test34Lib.local5.field5);
Benchmark.test(38,Test34Lib.local6.field7);
Benchmark.test(39,Test34Lib.local6.field6);
Benchmark.test(40,Test34Lib.local6.field1);
Benchmark.test(41,Test34Lib.local6.field2);
Benchmark.test(42,Test34Lib.local6.field3);
Benchmark.test(43,Test34Lib.local6.field4);
Benchmark.test(44,Test34Lib.local6.field5);
Benchmark.test(45,Test34Lib.local7.field7);
Benchmark.test(46,Test34Lib.local7.field6);
Benchmark.test(47,Test34Lib.local7.field1);
Benchmark.test(48,Test34Lib.local7.field2);
Benchmark.test(49,Test34Lib.local7.field3);
Benchmark.test(50,Test34Lib.local7.field4);
Benchmark.test(51,Test34Lib.local7.field5);
Benchmark.test(52,Test34Lib.local8.field7);
Benchmark.test(53,Test34Lib.local8.field6);
Benchmark.test(54,Test34Lib.local8.field1);
Benchmark.test(55,Test34Lib.local8.field2);
Benchmark.test(56,Test34Lib.local8.field3);
Benchmark.test(57,Test34Lib.local8.field4);
Benchmark.test(58,Test34Lib.local8.field5);
Benchmark.test(59,Test34Lib.local9.field7);
Benchmark.test(60,Test34Lib.local9.field6);
Benchmark.test(61,Test34Lib.local9.field1);
Benchmark.test(62,Test34Lib.local9.field2);
Benchmark.test(63,Test34Lib.local9.field3);
Benchmark.test(64,Test34Lib.local9.field4);
Benchmark.test(65,Test34Lib.local9.field5);
Benchmark.print();
}
}
