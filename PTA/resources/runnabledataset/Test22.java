package runnabledataset;

import benchmark.tool.Benchmark;
import benchmark.tool.BasicClass;
class Test22Lib{
public static Test22Class1 local1;
public static Test22Class1 local2;
public static Test22Class1 local3;
public static Test22Class1 local4;
public static Test22Class1 local5;
public static Test22Class2 local6;
public static Test22Class2 local7;
public static Test22Class3 local8;
public static Test22Class3 local9;
public static Test22Class3 local10;
public static Test22Class3 local11;
}
class Test22Class1 extends BasicClass {
public Test22Class1 field1;
public Test22Class2 field2;
public static Test22Class2 field3;
public static Test22Class2 method1(int depth) {
if (depth == 0) return Test22Lib.local7;
return field3.field4;
}
}
class Test22Class2 extends Test22Class1 {
public static Test22Class3 field4;
public Test22Class3 field5;
public static Test22Class3 method2(int depth) {
if (depth == 0) return Test22Lib.local9;
for (int local12 = 0; local12<=2; local12 += 1) {
field4.field3=field4.field1.method1(depth-1);
}
field4.field1=field4.field7;
return field3.field4;
}
}
class Test22Class3 extends Test22Class2 {
public static Test22Class3 field6;
public Test22Class2 field7;
public Test22Class1 field8;
public static Test22Class2 field9;
public static void method3(Test22Class3 arg0, Test22Class2 arg1, int depth) {
if (depth == 0) return;
arg1.field1=arg1;
for (int local13 = 0; local13<=2; local13 += 1) {
arg0.field2.method2(depth-1);
}
arg0=field6.field4;
}
public Test22Class3 method4(int depth) {
if (depth == 0) return Test22Lib.local10;
this.field4=this.field6;
if (depth<3) {
this.field7=this.field4;
}
if (depth>=3) {
this.field8=this.field8;
}
for (int local14 = 0; local14<=2; local14 += 1) {
if (depth>=1) {
this.field1=this.field9;
}
}
this.field9=this.field2;
if (depth==4) {
if (depth<=4) {
this.field6=this.field6.method5(this,this.field1,depth-1);
}
}
if (depth>3) {
if (depth==1) {
this.field6.method3(this,this.field2,depth-1);
}else {
if (depth<2) {
this.field5=this.field5.method2(depth-1);
}
}
}
return this.field5;
}
public Test22Class3 method5(Test22Class2 arg0, Test22Class1 arg1, int depth) {
if (depth == 0) return Test22Lib.local9;
return this.field4;
}
}
public class Test22{
public static void main(String[] args) {
int inputValue = 10;
Benchmark.alloc(1);
Test22Lib.local1 = new Test22Class1();
Benchmark.alloc(2);
Test22Lib.local2 = new Test22Class1();
Benchmark.alloc(3);
Test22Lib.local3 = new Test22Class1();
Benchmark.alloc(4);
Test22Lib.local4 = new Test22Class1();
Benchmark.alloc(5);
Test22Lib.local5 = new Test22Class1();
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
Test22Lib.local1.field1 = Test22Lib.local2;
Test22Lib.local1.field2 = Test22Lib.local9;
Test22Lib.local1.field3 = Test22Lib.local8;
Test22Lib.local2.field1 = Test22Lib.local9;
Test22Lib.local2.field2 = Test22Lib.local10;
Test22Lib.local2.field3 = Test22Lib.local6;
Test22Lib.local3.field1 = Test22Lib.local5;
Test22Lib.local3.field2 = Test22Lib.local7;
Test22Lib.local3.field3 = Test22Lib.local6;
Test22Lib.local4.field1 = Test22Lib.local7;
Test22Lib.local4.field2 = Test22Lib.local9;
Test22Lib.local4.field3 = Test22Lib.local9;
Test22Lib.local5.field1 = Test22Lib.local1;
Test22Lib.local5.field2 = Test22Lib.local6;
Test22Lib.local5.field3 = Test22Lib.local9;
Test22Lib.local6.field4 = Test22Lib.local9;
Test22Lib.local6.field5 = Test22Lib.local8;
Test22Lib.local6.field1 = Test22Lib.local2;
Test22Lib.local6.field2 = Test22Lib.local10;
Test22Lib.local6.field3 = Test22Lib.local6;
Test22Lib.local7.field4 = Test22Lib.local9;
Test22Lib.local7.field5 = Test22Lib.local8;
Test22Lib.local7.field1 = Test22Lib.local7;
Test22Lib.local7.field2 = Test22Lib.local10;
Test22Lib.local7.field3 = Test22Lib.local11;
Test22Lib.local8.field6 = Test22Lib.local11;
Test22Lib.local8.field7 = Test22Lib.local11;
Test22Lib.local8.field8 = Test22Lib.local2;
Test22Lib.local8.field9 = Test22Lib.local11;
Test22Lib.local8.field4 = Test22Lib.local8;
Test22Lib.local8.field5 = Test22Lib.local10;
Test22Lib.local8.field1 = Test22Lib.local3;
Test22Lib.local8.field2 = Test22Lib.local7;
Test22Lib.local8.field3 = Test22Lib.local10;
Test22Lib.local9.field6 = Test22Lib.local10;
Test22Lib.local9.field7 = Test22Lib.local11;
Test22Lib.local9.field8 = Test22Lib.local9;
Test22Lib.local9.field9 = Test22Lib.local11;
Test22Lib.local9.field4 = Test22Lib.local9;
Test22Lib.local9.field5 = Test22Lib.local9;
Test22Lib.local9.field1 = Test22Lib.local2;
Test22Lib.local9.field2 = Test22Lib.local6;
Test22Lib.local9.field3 = Test22Lib.local10;
Test22Lib.local10.field6 = Test22Lib.local11;
Test22Lib.local10.field7 = Test22Lib.local10;
Test22Lib.local10.field8 = Test22Lib.local10;
Test22Lib.local10.field9 = Test22Lib.local10;
Test22Lib.local10.field4 = Test22Lib.local8;
Test22Lib.local10.field5 = Test22Lib.local8;
Test22Lib.local10.field1 = Test22Lib.local6;
Test22Lib.local10.field2 = Test22Lib.local9;
Test22Lib.local10.field3 = Test22Lib.local8;
Test22Lib.local11.field6 = Test22Lib.local9;
Test22Lib.local11.field7 = Test22Lib.local9;
Test22Lib.local11.field8 = Test22Lib.local3;
Test22Lib.local11.field9 = Test22Lib.local8;
Test22Lib.local11.field4 = Test22Lib.local9;
Test22Lib.local11.field5 = Test22Lib.local8;
Test22Lib.local11.field1 = Test22Lib.local9;
Test22Lib.local11.field2 = Test22Lib.local8;
Test22Lib.local11.field3 = Test22Lib.local11;
if (inputValue>1) {
Test22Lib.local6.field1=Test22Lib.local7.field5.method5(Test22Lib.local2.field3,Test22Lib.local7,3);
}
Test22Lib.local10.field9.method2(3);
Test22Lib.local3.field2.method2(3);
for (int local15 = 0; local15<=1; local15 += 1) {
Test22Lib.local9.field9=Test22Lib.local6.field1.method1(3);
}
Test22Lib.local7.field5.method5(Test22Lib.local10.field6,Test22Lib.local8.field5,3);
Test22Lib.local8.field6=Test22Lib.local11.method4(3);
Test22Lib.local8.field1=Test22Lib.local2.field2;
if (inputValue<=1) {
for (int local16 = 0; local16<=3; local16 += 1) {
Test22Lib.local4.field1=Test22Lib.local9.field6;
}
}
if (inputValue==3) {
Test22Lib.local10.field8=Test22Lib.local10.field9;
}else {
Test22Lib.local10.field2=Test22Lib.local11.field7;
}
Test22Lib.local8.method3(Test22Lib.local8.field4,Test22Lib.local8.field9,3);
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
Benchmark.test(12,Test22Lib.local1.field1);
Benchmark.test(13,Test22Lib.local1.field2);
Benchmark.test(14,Test22Lib.local1.field3);
Benchmark.test(15,Test22Lib.local2.field1);
Benchmark.test(16,Test22Lib.local2.field2);
Benchmark.test(17,Test22Lib.local2.field3);
Benchmark.test(18,Test22Lib.local3.field1);
Benchmark.test(19,Test22Lib.local3.field2);
Benchmark.test(20,Test22Lib.local3.field3);
Benchmark.test(21,Test22Lib.local4.field1);
Benchmark.test(22,Test22Lib.local4.field2);
Benchmark.test(23,Test22Lib.local4.field3);
Benchmark.test(24,Test22Lib.local5.field1);
Benchmark.test(25,Test22Lib.local5.field2);
Benchmark.test(26,Test22Lib.local5.field3);
Benchmark.test(27,Test22Lib.local6.field4);
Benchmark.test(28,Test22Lib.local6.field5);
Benchmark.test(29,Test22Lib.local6.field1);
Benchmark.test(30,Test22Lib.local6.field2);
Benchmark.test(31,Test22Lib.local6.field3);
Benchmark.test(32,Test22Lib.local7.field4);
Benchmark.test(33,Test22Lib.local7.field5);
Benchmark.test(34,Test22Lib.local7.field1);
Benchmark.test(35,Test22Lib.local7.field2);
Benchmark.test(36,Test22Lib.local7.field3);
Benchmark.test(37,Test22Lib.local8.field6);
Benchmark.test(38,Test22Lib.local8.field7);
Benchmark.test(39,Test22Lib.local8.field8);
Benchmark.test(40,Test22Lib.local8.field9);
Benchmark.test(41,Test22Lib.local8.field4);
Benchmark.test(42,Test22Lib.local8.field5);
Benchmark.test(43,Test22Lib.local8.field1);
Benchmark.test(44,Test22Lib.local8.field2);
Benchmark.test(45,Test22Lib.local8.field3);
Benchmark.test(46,Test22Lib.local9.field6);
Benchmark.test(47,Test22Lib.local9.field7);
Benchmark.test(48,Test22Lib.local9.field8);
Benchmark.test(49,Test22Lib.local9.field9);
Benchmark.test(50,Test22Lib.local9.field4);
Benchmark.test(51,Test22Lib.local9.field5);
Benchmark.test(52,Test22Lib.local9.field1);
Benchmark.test(53,Test22Lib.local9.field2);
Benchmark.test(54,Test22Lib.local9.field3);
Benchmark.test(55,Test22Lib.local10.field6);
Benchmark.test(56,Test22Lib.local10.field7);
Benchmark.test(57,Test22Lib.local10.field8);
Benchmark.test(58,Test22Lib.local10.field9);
Benchmark.test(59,Test22Lib.local10.field4);
Benchmark.test(60,Test22Lib.local10.field5);
Benchmark.test(61,Test22Lib.local10.field1);
Benchmark.test(62,Test22Lib.local10.field2);
Benchmark.test(63,Test22Lib.local10.field3);
Benchmark.test(64,Test22Lib.local11.field6);
Benchmark.test(65,Test22Lib.local11.field7);
Benchmark.test(66,Test22Lib.local11.field8);
Benchmark.test(67,Test22Lib.local11.field9);
Benchmark.test(68,Test22Lib.local11.field4);
Benchmark.test(69,Test22Lib.local11.field5);
Benchmark.test(70,Test22Lib.local11.field1);
Benchmark.test(71,Test22Lib.local11.field2);
Benchmark.test(72,Test22Lib.local11.field3);
Benchmark.print();
}
}
