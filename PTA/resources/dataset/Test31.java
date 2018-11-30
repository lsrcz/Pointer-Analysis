package dataset;

import benchmark.internal.Benchmark;
import benchmark.tool.BasicClass;
class Test31Lib{
public static Test31Class1 local1;
public static Test31Class1 local2;
public static Test31Class1 local3;
public static Test31Class1 local4;
public static Test31Class2 local5;
public static Test31Class2 local6;
public static Test31Class2 local7;
public static Test31Class2 local8;
public static Test31Class3 local9;
}
class Test31Class1 extends BasicClass {
public Test31Class1 field1;
public Test31Class3 field2;
public Test31Class1 method1(Test31Class2 arg0, int depth) {
if (depth == 0) return Test31Lib.local5;
for (int local10 = 0; local10<=2; local10 += 1) {
if (depth>3) {
if (depth<=3) {
if (depth>3) {
arg0.field6=arg0.field3.method2(arg0.field5,this.field2,depth-1);
}
}
}else {
if (depth>=4) {
arg0.field3.method5(depth-1);
}
}
}
return arg0.field3;
}
}
class Test31Class2 extends Test31Class1 {
public static Test31Class3 field3;
public static Test31Class1 field4;
public static Test31Class2 field5;
public static Test31Class1 field6;
public Test31Class2 field7;
public Test31Class2 field8;
public static Test31Class2 method2(Test31Class1 arg0, Test31Class3 arg1, int depth) {
if (depth == 0) return Test31Lib.local9;
arg1.field1=field6.field2;
return field4.field2;
}
public void method3(int depth) {
if (depth == 0) return;
}
public Test31Class3 method4(Test31Class2 arg0, Test31Class3 arg1, int depth) {
if (depth == 0) return Test31Lib.local9;
arg0.field6=arg0.field3.method7(this.field2,arg1.field1,depth-1);
for (int local11 = 0; local11<=1; local11 += 1) {
this.field8=this.field8;
}
return arg1.field3;
}
public static Test31Class2 method5(int depth) {
if (depth == 0) return Test31Lib.local9;
return field3.field2;
}
}
class Test31Class3 extends Test31Class2 {
public static Test31Class2 field9;
public Test31Class2 field10;
public Test31Class1 field11;
public Test31Class1 method6(Test31Class3 arg0, Test31Class3 arg1, int depth) {
if (depth == 0) return Test31Lib.local5;
return arg1.field4;
}
public Test31Class3 method7(Test31Class2 arg0, Test31Class1 arg1, int depth) {
if (depth == 0) return Test31Lib.local9;
this.method6(arg0.field3,this.field3,depth-1);
return this.field3;
}
public void method8(Test31Class1 arg0, Test31Class1 arg1, int depth) {
if (depth == 0) return;
if (depth>4) {
arg0=this.field2.method5(depth-1);
}
}
}
public class Test31{
public static void main(String[] args) {
int inputValue = 0;
Benchmark.alloc(1);
Test31Lib.local1 = new Test31Class1();
Benchmark.alloc(2);
Test31Lib.local2 = new Test31Class1();
Benchmark.alloc(3);
Test31Lib.local3 = new Test31Class1();
Benchmark.alloc(4);
Test31Lib.local4 = new Test31Class1();
Benchmark.alloc(5);
Test31Lib.local5 = new Test31Class2();
Benchmark.alloc(6);
Test31Lib.local6 = new Test31Class2();
Benchmark.alloc(7);
Test31Lib.local7 = new Test31Class2();
Benchmark.alloc(8);
Test31Lib.local8 = new Test31Class2();
Benchmark.alloc(9);
Test31Lib.local9 = new Test31Class3();
Test31Lib.local1.field1 = Test31Lib.local5;
Test31Lib.local1.field2 = Test31Lib.local9;
Test31Lib.local2.field1 = Test31Lib.local2;
Test31Lib.local2.field2 = Test31Lib.local9;
Test31Lib.local3.field1 = Test31Lib.local4;
Test31Lib.local3.field2 = Test31Lib.local9;
Test31Lib.local4.field1 = Test31Lib.local9;
Test31Lib.local4.field2 = Test31Lib.local9;
Test31Lib.local5.field3 = Test31Lib.local9;
Test31Lib.local5.field4 = Test31Lib.local4;
Test31Lib.local5.field5 = Test31Lib.local6;
Test31Lib.local5.field6 = Test31Lib.local4;
Test31Lib.local5.field7 = Test31Lib.local6;
Test31Lib.local5.field8 = Test31Lib.local6;
Test31Lib.local5.field1 = Test31Lib.local4;
Test31Lib.local5.field2 = Test31Lib.local9;
Test31Lib.local6.field3 = Test31Lib.local9;
Test31Lib.local6.field4 = Test31Lib.local8;
Test31Lib.local6.field5 = Test31Lib.local5;
Test31Lib.local6.field6 = Test31Lib.local1;
Test31Lib.local6.field7 = Test31Lib.local6;
Test31Lib.local6.field8 = Test31Lib.local9;
Test31Lib.local6.field1 = Test31Lib.local1;
Test31Lib.local6.field2 = Test31Lib.local9;
Test31Lib.local7.field3 = Test31Lib.local9;
Test31Lib.local7.field4 = Test31Lib.local6;
Test31Lib.local7.field5 = Test31Lib.local9;
Test31Lib.local7.field6 = Test31Lib.local5;
Test31Lib.local7.field7 = Test31Lib.local6;
Test31Lib.local7.field8 = Test31Lib.local7;
Test31Lib.local7.field1 = Test31Lib.local8;
Test31Lib.local7.field2 = Test31Lib.local9;
Test31Lib.local8.field3 = Test31Lib.local9;
Test31Lib.local8.field4 = Test31Lib.local4;
Test31Lib.local8.field5 = Test31Lib.local6;
Test31Lib.local8.field6 = Test31Lib.local4;
Test31Lib.local8.field7 = Test31Lib.local7;
Test31Lib.local8.field8 = Test31Lib.local8;
Test31Lib.local8.field1 = Test31Lib.local7;
Test31Lib.local8.field2 = Test31Lib.local9;
Test31Lib.local9.field9 = Test31Lib.local9;
Test31Lib.local9.field10 = Test31Lib.local7;
Test31Lib.local9.field11 = Test31Lib.local2;
Test31Lib.local9.field3 = Test31Lib.local9;
Test31Lib.local9.field4 = Test31Lib.local2;
Test31Lib.local9.field5 = Test31Lib.local7;
Test31Lib.local9.field6 = Test31Lib.local1;
Test31Lib.local9.field7 = Test31Lib.local7;
Test31Lib.local9.field8 = Test31Lib.local5;
Test31Lib.local9.field1 = Test31Lib.local2;
Test31Lib.local9.field2 = Test31Lib.local9;
for (int local12 = 0; local12<=2; local12 += 1) {
for (int local13 = 0; local13<=0; local13 += 1) {
Test31Lib.local8.field8=Test31Lib.local7.field8;
}
}
Test31Lib.local4.field1.method1(Test31Lib.local8.field7,3);
if (inputValue>4) {
Test31Lib.local4.field1=Test31Lib.local7.field6;
}else {
if (inputValue<1) {
if (inputValue>=2) {
Test31Lib.local5.field7=Test31Lib.local5.field7;
}
}else {
Test31Lib.local1.field2=Test31Lib.local8.field2;
}
}
Benchmark.test(1,Test31Lib.local1);
Benchmark.test(2,Test31Lib.local2);
Benchmark.test(3,Test31Lib.local3);
Benchmark.test(4,Test31Lib.local4);
Benchmark.test(5,Test31Lib.local5);
Benchmark.test(6,Test31Lib.local6);
Benchmark.test(7,Test31Lib.local7);
Benchmark.test(8,Test31Lib.local8);
Benchmark.test(9,Test31Lib.local9);
Benchmark.test(10,Test31Lib.local1.field1);
Benchmark.test(11,Test31Lib.local1.field2);
Benchmark.test(12,Test31Lib.local2.field1);
Benchmark.test(13,Test31Lib.local2.field2);
Benchmark.test(14,Test31Lib.local3.field1);
Benchmark.test(15,Test31Lib.local3.field2);
Benchmark.test(16,Test31Lib.local4.field1);
Benchmark.test(17,Test31Lib.local4.field2);
Benchmark.test(18,Test31Lib.local5.field3);
Benchmark.test(19,Test31Lib.local5.field4);
Benchmark.test(20,Test31Lib.local5.field5);
Benchmark.test(21,Test31Lib.local5.field6);
Benchmark.test(22,Test31Lib.local5.field7);
Benchmark.test(23,Test31Lib.local5.field8);
Benchmark.test(24,Test31Lib.local5.field1);
Benchmark.test(25,Test31Lib.local5.field2);
Benchmark.test(26,Test31Lib.local6.field3);
Benchmark.test(27,Test31Lib.local6.field4);
Benchmark.test(28,Test31Lib.local6.field5);
Benchmark.test(29,Test31Lib.local6.field6);
Benchmark.test(30,Test31Lib.local6.field7);
Benchmark.test(31,Test31Lib.local6.field8);
Benchmark.test(32,Test31Lib.local6.field1);
Benchmark.test(33,Test31Lib.local6.field2);
Benchmark.test(34,Test31Lib.local7.field3);
Benchmark.test(35,Test31Lib.local7.field4);
Benchmark.test(36,Test31Lib.local7.field5);
Benchmark.test(37,Test31Lib.local7.field6);
Benchmark.test(38,Test31Lib.local7.field7);
Benchmark.test(39,Test31Lib.local7.field8);
Benchmark.test(40,Test31Lib.local7.field1);
Benchmark.test(41,Test31Lib.local7.field2);
Benchmark.test(42,Test31Lib.local8.field3);
Benchmark.test(43,Test31Lib.local8.field4);
Benchmark.test(44,Test31Lib.local8.field5);
Benchmark.test(45,Test31Lib.local8.field6);
Benchmark.test(46,Test31Lib.local8.field7);
Benchmark.test(47,Test31Lib.local8.field8);
Benchmark.test(48,Test31Lib.local8.field1);
Benchmark.test(49,Test31Lib.local8.field2);
Benchmark.test(50,Test31Lib.local9.field9);
Benchmark.test(51,Test31Lib.local9.field10);
Benchmark.test(52,Test31Lib.local9.field11);
Benchmark.test(53,Test31Lib.local9.field3);
Benchmark.test(54,Test31Lib.local9.field4);
Benchmark.test(55,Test31Lib.local9.field5);
Benchmark.test(56,Test31Lib.local9.field6);
Benchmark.test(57,Test31Lib.local9.field7);
Benchmark.test(58,Test31Lib.local9.field8);
Benchmark.test(59,Test31Lib.local9.field1);
Benchmark.test(60,Test31Lib.local9.field2);
Benchmark.print();
}
}
