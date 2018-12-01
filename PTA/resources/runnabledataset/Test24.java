package runnabledataset;

import benchmark.tool.Benchmark;
import benchmark.tool.BasicClass;
class Test24Lib{
public static Test24Class1 local1;
public static Test24Class1 local2;
public static Test24Class2 local3;
public static Test24Class2 local4;
public static Test24Class2 local5;
public static Test24Class2 local6;
public static Test24Class2 local7;
public static Test24Class3 local8;
public static Test24Class3 local9;
public static Test24Class3 local10;
public static Test24Class3 local11;
}
class Test24Class1 extends BasicClass {
public Test24Class3 field1;
public Test24Class1 field2;
public static void method1(Test24Class1 arg0, int depth) {
if (depth == 0) return;
}
public void method2(Test24Class3 arg0, Test24Class3 arg1, int depth) {
if (depth == 0) return;
if (depth<=3) {
this.field1.method8(arg1.field1,arg0.field8,depth-1);
}else {
if (depth==4) {
arg1.field4.method3(depth-1);
}else {
arg1.field3.method5(arg1,arg0.field3,depth-1);
}
}
}
public Test24Class1 method3(int depth) {
if (depth == 0) return Test24Lib.local6;
if (depth<=4) {
for (int local12 = 0; local12<=0; local12 += 1) {
this.field1.method1(this,depth-1);
}
}else {
this.field1.method6(this.field1,this.field1,depth-1);
}
return this;
}
}
class Test24Class2 extends Test24Class1 {
public Test24Class3 field3;
public Test24Class2 field4;
public Test24Class1 field5;
public static Test24Class3 method4(int depth) {
if (depth == 0) return Test24Lib.local11;
return Test24Lib.local11;
}
public static void method5(Test24Class3 arg0, Test24Class1 arg1, int depth) {
if (depth == 0) return;
}
public static Test24Class1 method6(Test24Class3 arg0, Test24Class3 arg1, int depth) {
if (depth == 0) return Test24Lib.local8;
for (int local13 = 0; local13<=3; local13 += 1) {
for (int local14 = 0; local14<=0; local14 += 1) {
arg1.field5.method2(arg0.field8,arg1.field3,depth-1);
}
}
return arg1.field7;
}
public static Test24Class2 method7(Test24Class3 arg0, Test24Class3 arg1, int depth) {
if (depth == 0) return Test24Lib.local7;
arg0=arg1.field8;
return arg1.field8;
}
}
class Test24Class3 extends Test24Class2 {
public Test24Class1 field6;
public Test24Class1 field7;
public Test24Class3 field8;
public static void method8(Test24Class3 arg0, Test24Class2 arg1, int depth) {
if (depth == 0) return;
for (int local15 = 0; local15<=3; local15 += 1) {
if (depth>4) {
if (depth<=2) {
arg1.field1=arg1.field3;
}else {
for (int local16 = 0; local16<=1; local16 += 1) {
arg0.field1.method9(arg1.field1,arg0.field8,depth-1);
}
}
}
}
}
public static Test24Class2 method9(Test24Class2 arg0, Test24Class1 arg1, int depth) {
if (depth == 0) return Test24Lib.local5;
for (int local17 = 0; local17<=3; local17 += 1) {
arg0.field3.method5(arg1.field1,arg1.field1,depth-1);
}
return arg0.field1;
}
}
public class Test24{
public static void main(String[] args) {
int inputValue = 10;
Benchmark.alloc(1);
Test24Lib.local1 = new Test24Class1();
Benchmark.alloc(2);
Test24Lib.local2 = new Test24Class1();
Benchmark.alloc(3);
Test24Lib.local3 = new Test24Class2();
Benchmark.alloc(4);
Test24Lib.local4 = new Test24Class2();
Benchmark.alloc(5);
Test24Lib.local5 = new Test24Class2();
Benchmark.alloc(6);
Test24Lib.local6 = new Test24Class2();
Benchmark.alloc(7);
Test24Lib.local7 = new Test24Class2();
Benchmark.alloc(8);
Test24Lib.local8 = new Test24Class3();
Benchmark.alloc(9);
Test24Lib.local9 = new Test24Class3();
Benchmark.alloc(10);
Test24Lib.local10 = new Test24Class3();
Benchmark.alloc(11);
Test24Lib.local11 = new Test24Class3();
Test24Lib.local1.field1 = Test24Lib.local8;
Test24Lib.local1.field2 = Test24Lib.local6;
Test24Lib.local2.field1 = Test24Lib.local9;
Test24Lib.local2.field2 = Test24Lib.local10;
Test24Lib.local3.field3 = Test24Lib.local11;
Test24Lib.local3.field4 = Test24Lib.local4;
Test24Lib.local3.field5 = Test24Lib.local5;
Test24Lib.local3.field1 = Test24Lib.local8;
Test24Lib.local3.field2 = Test24Lib.local8;
Test24Lib.local4.field3 = Test24Lib.local11;
Test24Lib.local4.field4 = Test24Lib.local8;
Test24Lib.local4.field5 = Test24Lib.local1;
Test24Lib.local4.field1 = Test24Lib.local9;
Test24Lib.local4.field2 = Test24Lib.local4;
Test24Lib.local5.field3 = Test24Lib.local10;
Test24Lib.local5.field4 = Test24Lib.local6;
Test24Lib.local5.field5 = Test24Lib.local10;
Test24Lib.local5.field1 = Test24Lib.local10;
Test24Lib.local5.field2 = Test24Lib.local8;
Test24Lib.local6.field3 = Test24Lib.local9;
Test24Lib.local6.field4 = Test24Lib.local5;
Test24Lib.local6.field5 = Test24Lib.local11;
Test24Lib.local6.field1 = Test24Lib.local8;
Test24Lib.local6.field2 = Test24Lib.local6;
Test24Lib.local7.field3 = Test24Lib.local9;
Test24Lib.local7.field4 = Test24Lib.local8;
Test24Lib.local7.field5 = Test24Lib.local3;
Test24Lib.local7.field1 = Test24Lib.local9;
Test24Lib.local7.field2 = Test24Lib.local6;
Test24Lib.local8.field6 = Test24Lib.local10;
Test24Lib.local8.field7 = Test24Lib.local7;
Test24Lib.local8.field8 = Test24Lib.local8;
Test24Lib.local8.field3 = Test24Lib.local10;
Test24Lib.local8.field4 = Test24Lib.local5;
Test24Lib.local8.field5 = Test24Lib.local1;
Test24Lib.local8.field1 = Test24Lib.local11;
Test24Lib.local8.field2 = Test24Lib.local9;
Test24Lib.local9.field6 = Test24Lib.local10;
Test24Lib.local9.field7 = Test24Lib.local6;
Test24Lib.local9.field8 = Test24Lib.local10;
Test24Lib.local9.field3 = Test24Lib.local9;
Test24Lib.local9.field4 = Test24Lib.local6;
Test24Lib.local9.field5 = Test24Lib.local11;
Test24Lib.local9.field1 = Test24Lib.local9;
Test24Lib.local9.field2 = Test24Lib.local7;
Test24Lib.local10.field6 = Test24Lib.local9;
Test24Lib.local10.field7 = Test24Lib.local1;
Test24Lib.local10.field8 = Test24Lib.local9;
Test24Lib.local10.field3 = Test24Lib.local11;
Test24Lib.local10.field4 = Test24Lib.local9;
Test24Lib.local10.field5 = Test24Lib.local7;
Test24Lib.local10.field1 = Test24Lib.local8;
Test24Lib.local10.field2 = Test24Lib.local4;
Test24Lib.local11.field6 = Test24Lib.local8;
Test24Lib.local11.field7 = Test24Lib.local4;
Test24Lib.local11.field8 = Test24Lib.local9;
Test24Lib.local11.field3 = Test24Lib.local11;
Test24Lib.local11.field4 = Test24Lib.local5;
Test24Lib.local11.field5 = Test24Lib.local2;
Test24Lib.local11.field1 = Test24Lib.local9;
Test24Lib.local11.field2 = Test24Lib.local3;
Test24Lib.local5.field5=Test24Lib.local9.field7.method3(3);
Test24Lib.local10.field5=Test24Lib.local7.field4;
for (int local18 = 0; local18<=2; local18 += 1) {
for (int local19 = 0; local19<=0; local19 += 1) {
Test24Lib.local1=Test24Lib.local4.field1.method9(Test24Lib.local4.field1,Test24Lib.local4,3);
}
}
Benchmark.test(1,Test24Lib.local1);
Benchmark.test(2,Test24Lib.local2);
Benchmark.test(3,Test24Lib.local3);
Benchmark.test(4,Test24Lib.local4);
Benchmark.test(5,Test24Lib.local5);
Benchmark.test(6,Test24Lib.local6);
Benchmark.test(7,Test24Lib.local7);
Benchmark.test(8,Test24Lib.local8);
Benchmark.test(9,Test24Lib.local9);
Benchmark.test(10,Test24Lib.local10);
Benchmark.test(11,Test24Lib.local11);
Benchmark.test(12,Test24Lib.local1.field1);
Benchmark.test(13,Test24Lib.local1.field2);
Benchmark.test(14,Test24Lib.local2.field1);
Benchmark.test(15,Test24Lib.local2.field2);
Benchmark.test(16,Test24Lib.local3.field3);
Benchmark.test(17,Test24Lib.local3.field4);
Benchmark.test(18,Test24Lib.local3.field5);
Benchmark.test(19,Test24Lib.local3.field1);
Benchmark.test(20,Test24Lib.local3.field2);
Benchmark.test(21,Test24Lib.local4.field3);
Benchmark.test(22,Test24Lib.local4.field4);
Benchmark.test(23,Test24Lib.local4.field5);
Benchmark.test(24,Test24Lib.local4.field1);
Benchmark.test(25,Test24Lib.local4.field2);
Benchmark.test(26,Test24Lib.local5.field3);
Benchmark.test(27,Test24Lib.local5.field4);
Benchmark.test(28,Test24Lib.local5.field5);
Benchmark.test(29,Test24Lib.local5.field1);
Benchmark.test(30,Test24Lib.local5.field2);
Benchmark.test(31,Test24Lib.local6.field3);
Benchmark.test(32,Test24Lib.local6.field4);
Benchmark.test(33,Test24Lib.local6.field5);
Benchmark.test(34,Test24Lib.local6.field1);
Benchmark.test(35,Test24Lib.local6.field2);
Benchmark.test(36,Test24Lib.local7.field3);
Benchmark.test(37,Test24Lib.local7.field4);
Benchmark.test(38,Test24Lib.local7.field5);
Benchmark.test(39,Test24Lib.local7.field1);
Benchmark.test(40,Test24Lib.local7.field2);
Benchmark.test(41,Test24Lib.local8.field6);
Benchmark.test(42,Test24Lib.local8.field7);
Benchmark.test(43,Test24Lib.local8.field8);
Benchmark.test(44,Test24Lib.local8.field3);
Benchmark.test(45,Test24Lib.local8.field4);
Benchmark.test(46,Test24Lib.local8.field5);
Benchmark.test(47,Test24Lib.local8.field1);
Benchmark.test(48,Test24Lib.local8.field2);
Benchmark.test(49,Test24Lib.local9.field6);
Benchmark.test(50,Test24Lib.local9.field7);
Benchmark.test(51,Test24Lib.local9.field8);
Benchmark.test(52,Test24Lib.local9.field3);
Benchmark.test(53,Test24Lib.local9.field4);
Benchmark.test(54,Test24Lib.local9.field5);
Benchmark.test(55,Test24Lib.local9.field1);
Benchmark.test(56,Test24Lib.local9.field2);
Benchmark.test(57,Test24Lib.local10.field6);
Benchmark.test(58,Test24Lib.local10.field7);
Benchmark.test(59,Test24Lib.local10.field8);
Benchmark.test(60,Test24Lib.local10.field3);
Benchmark.test(61,Test24Lib.local10.field4);
Benchmark.test(62,Test24Lib.local10.field5);
Benchmark.test(63,Test24Lib.local10.field1);
Benchmark.test(64,Test24Lib.local10.field2);
Benchmark.test(65,Test24Lib.local11.field6);
Benchmark.test(66,Test24Lib.local11.field7);
Benchmark.test(67,Test24Lib.local11.field8);
Benchmark.test(68,Test24Lib.local11.field3);
Benchmark.test(69,Test24Lib.local11.field4);
Benchmark.test(70,Test24Lib.local11.field5);
Benchmark.test(71,Test24Lib.local11.field1);
Benchmark.test(72,Test24Lib.local11.field2);
Benchmark.print();
}
}
