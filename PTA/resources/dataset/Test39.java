package dataset;

import benchmark.internal.Benchmark;
import benchmark.tool.BasicClass;
class Test39Lib{
public static Test39Class1 local1;
public static Test39Class1 local2;
public static Test39Class1 local3;
public static Test39Class2 local4;
public static Test39Class2 local5;
public static Test39Class2 local6;
public static Test39Class3 local7;
public static Test39Class3 local8;
public static Test39Class3 local9;
public static Test39Class3 local10;
}
class Test39Class1 extends BasicClass {
public Test39Class2 field1;
public Test39Class1 field2;
public void method1(int depth) {
if (depth == 0) return;
if (depth>=4) {
for (int local11 = 0; local11<=3; local11 += 1) {
this.field2=this.field1.field3.field5.method4(depth-1);
}
}else {
if (depth>3) {
if (depth>2) {
if (depth<4) {
this.field2.field1.field3=this.field1.field3.field3;
}else {
this.field1.field4.field3.method5(depth-1);
}
}else {
this.field1.field2.field1=this.field1.field4.field5;
}
}else {
this.field1.field4.field6.method1(depth-1);
}
}
}
}
class Test39Class2 extends Test39Class1 {
public Test39Class3 field3;
public Test39Class3 field4;
public static void method2(Test39Class1 arg0, Test39Class1 arg1, int depth) {
if (depth == 0) return;
arg1.field2.field1.field3.method4(depth-1);
}
public Test39Class3 method3(Test39Class2 arg0, Test39Class1 arg1, int depth) {
if (depth == 0) return Test39Lib.local8;
return arg0.field3.field6.field4;
}
public Test39Class2 method4(int depth) {
if (depth == 0) return Test39Lib.local7;
return this.field3.field6.field5;
}
}
class Test39Class3 extends Test39Class2 {
public Test39Class2 field5;
public Test39Class3 field6;
public Test39Class3 field7;
public Test39Class1 method5(int depth) {
if (depth == 0) return Test39Lib.local1;
for (int local12 = 0; local12<=2; local12 += 1) {
this.field4.field6.field5=this.field3.field3.field1.method3(this.field6.field3.field3,this.field3.field5.field1,depth-1);
}
return this.field3.field4;
}
public static Test39Class3 method6(int depth) {
if (depth == 0) return Test39Lib.local9;
return Test39Lib.local9;
}
}
public class Test39{
public static void main(String[] args) {
int inputValue = 0;
Benchmark.alloc(1);
Test39Lib.local1 = new Test39Class1();
Benchmark.alloc(2);
Test39Lib.local2 = new Test39Class1();
Benchmark.alloc(3);
Test39Lib.local3 = new Test39Class1();
Benchmark.alloc(4);
Test39Lib.local4 = new Test39Class2();
Benchmark.alloc(5);
Test39Lib.local5 = new Test39Class2();
Benchmark.alloc(6);
Test39Lib.local6 = new Test39Class2();
Benchmark.alloc(7);
Test39Lib.local7 = new Test39Class3();
Benchmark.alloc(8);
Test39Lib.local8 = new Test39Class3();
Benchmark.alloc(9);
Test39Lib.local9 = new Test39Class3();
Benchmark.alloc(10);
Test39Lib.local10 = new Test39Class3();
Test39Lib.local1.field1 = Test39Lib.local10;
Test39Lib.local1.field2 = Test39Lib.local4;
Test39Lib.local2.field1 = Test39Lib.local8;
Test39Lib.local2.field2 = Test39Lib.local8;
Test39Lib.local3.field1 = Test39Lib.local6;
Test39Lib.local3.field2 = Test39Lib.local3;
Test39Lib.local4.field3 = Test39Lib.local7;
Test39Lib.local4.field4 = Test39Lib.local9;
Test39Lib.local4.field1 = Test39Lib.local8;
Test39Lib.local4.field2 = Test39Lib.local9;
Test39Lib.local5.field3 = Test39Lib.local7;
Test39Lib.local5.field4 = Test39Lib.local7;
Test39Lib.local5.field1 = Test39Lib.local9;
Test39Lib.local5.field2 = Test39Lib.local7;
Test39Lib.local6.field3 = Test39Lib.local10;
Test39Lib.local6.field4 = Test39Lib.local7;
Test39Lib.local6.field1 = Test39Lib.local6;
Test39Lib.local6.field2 = Test39Lib.local3;
Test39Lib.local7.field5 = Test39Lib.local5;
Test39Lib.local7.field6 = Test39Lib.local10;
Test39Lib.local7.field7 = Test39Lib.local8;
Test39Lib.local7.field3 = Test39Lib.local9;
Test39Lib.local7.field4 = Test39Lib.local9;
Test39Lib.local7.field1 = Test39Lib.local4;
Test39Lib.local7.field2 = Test39Lib.local7;
Test39Lib.local8.field5 = Test39Lib.local6;
Test39Lib.local8.field6 = Test39Lib.local9;
Test39Lib.local8.field7 = Test39Lib.local7;
Test39Lib.local8.field3 = Test39Lib.local8;
Test39Lib.local8.field4 = Test39Lib.local7;
Test39Lib.local8.field1 = Test39Lib.local4;
Test39Lib.local8.field2 = Test39Lib.local1;
Test39Lib.local9.field5 = Test39Lib.local6;
Test39Lib.local9.field6 = Test39Lib.local7;
Test39Lib.local9.field7 = Test39Lib.local8;
Test39Lib.local9.field3 = Test39Lib.local9;
Test39Lib.local9.field4 = Test39Lib.local7;
Test39Lib.local9.field1 = Test39Lib.local5;
Test39Lib.local9.field2 = Test39Lib.local7;
Test39Lib.local10.field5 = Test39Lib.local8;
Test39Lib.local10.field6 = Test39Lib.local8;
Test39Lib.local10.field7 = Test39Lib.local10;
Test39Lib.local10.field3 = Test39Lib.local9;
Test39Lib.local10.field4 = Test39Lib.local9;
Test39Lib.local10.field1 = Test39Lib.local4;
Test39Lib.local10.field2 = Test39Lib.local1;
Test39Lib.local4.field3.field1.field4.method2(Test39Lib.local6.field3.field4.field4,Test39Lib.local5.field1.field1.field3,3);
Test39Lib.local7.field4.field3.field2=Test39Lib.local8.field7.field3.method6(3);
if (inputValue>3) {
Test39Lib.local8.field3.field4.field6.method2(Test39Lib.local10.field5.field3.field2,Test39Lib.local10.field7.field4.field6,3);
}
Benchmark.test(1,Test39Lib.local1);
Benchmark.test(2,Test39Lib.local2);
Benchmark.test(3,Test39Lib.local3);
Benchmark.test(4,Test39Lib.local4);
Benchmark.test(5,Test39Lib.local5);
Benchmark.test(6,Test39Lib.local6);
Benchmark.test(7,Test39Lib.local7);
Benchmark.test(8,Test39Lib.local8);
Benchmark.test(9,Test39Lib.local9);
Benchmark.test(10,Test39Lib.local10);
Benchmark.test(11,Test39Lib.local1.field1);
Benchmark.test(12,Test39Lib.local1.field2);
Benchmark.test(13,Test39Lib.local2.field1);
Benchmark.test(14,Test39Lib.local2.field2);
Benchmark.test(15,Test39Lib.local3.field1);
Benchmark.test(16,Test39Lib.local3.field2);
Benchmark.test(17,Test39Lib.local4.field3);
Benchmark.test(18,Test39Lib.local4.field4);
Benchmark.test(19,Test39Lib.local4.field1);
Benchmark.test(20,Test39Lib.local4.field2);
Benchmark.test(21,Test39Lib.local5.field3);
Benchmark.test(22,Test39Lib.local5.field4);
Benchmark.test(23,Test39Lib.local5.field1);
Benchmark.test(24,Test39Lib.local5.field2);
Benchmark.test(25,Test39Lib.local6.field3);
Benchmark.test(26,Test39Lib.local6.field4);
Benchmark.test(27,Test39Lib.local6.field1);
Benchmark.test(28,Test39Lib.local6.field2);
Benchmark.test(29,Test39Lib.local7.field5);
Benchmark.test(30,Test39Lib.local7.field6);
Benchmark.test(31,Test39Lib.local7.field7);
Benchmark.test(32,Test39Lib.local7.field3);
Benchmark.test(33,Test39Lib.local7.field4);
Benchmark.test(34,Test39Lib.local7.field1);
Benchmark.test(35,Test39Lib.local7.field2);
Benchmark.test(36,Test39Lib.local8.field5);
Benchmark.test(37,Test39Lib.local8.field6);
Benchmark.test(38,Test39Lib.local8.field7);
Benchmark.test(39,Test39Lib.local8.field3);
Benchmark.test(40,Test39Lib.local8.field4);
Benchmark.test(41,Test39Lib.local8.field1);
Benchmark.test(42,Test39Lib.local8.field2);
Benchmark.test(43,Test39Lib.local9.field5);
Benchmark.test(44,Test39Lib.local9.field6);
Benchmark.test(45,Test39Lib.local9.field7);
Benchmark.test(46,Test39Lib.local9.field3);
Benchmark.test(47,Test39Lib.local9.field4);
Benchmark.test(48,Test39Lib.local9.field1);
Benchmark.test(49,Test39Lib.local9.field2);
Benchmark.test(50,Test39Lib.local10.field5);
Benchmark.test(51,Test39Lib.local10.field6);
Benchmark.test(52,Test39Lib.local10.field7);
Benchmark.test(53,Test39Lib.local10.field3);
Benchmark.test(54,Test39Lib.local10.field4);
Benchmark.test(55,Test39Lib.local10.field1);
Benchmark.test(56,Test39Lib.local10.field2);
Benchmark.print();
}
}
