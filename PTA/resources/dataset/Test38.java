package dataset;

import benchmark.internal.Benchmark;
import benchmark.tool.BasicClass;
class Test38Lib{
public static Test38Class1 local1;
public static Test38Class2 local2;
public static Test38Class2 local3;
public static Test38Class2 local4;
public static Test38Class2 local5;
public static Test38Class3 local6;
public static Test38Class3 local7;
}
class Test38Class1 extends BasicClass {
public static Test38Class3 field1;
public static Test38Class3 field2;
public static Test38Class3 field3;
public static Test38Class3 field4;
public static Test38Class3 field5;
public Test38Class1 method1(Test38Class2 arg0, Test38Class2 arg1, int depth) {
if (depth == 0) return Test38Lib.local3;
if (depth>=1) {
arg1.field4.method6(arg1.field4,arg1,depth-1);
}
return arg0.field5;
}
public static Test38Class3 method2(int depth) {
if (depth == 0) return Test38Lib.local6;
return field1.field7;
}
public static Test38Class1 method3(Test38Class3 arg0, int depth) {
if (depth == 0) return Test38Lib.local4;
for (int local8 = 0; local8<=2; local8 += 1) {
field4.field3.method1(field1,field3.field7,depth-1);
}
return field1.field4;
}
}
class Test38Class2 extends Test38Class1 {
public Test38Class2 field6;
public void method4(Test38Class2 arg0, Test38Class2 arg1, int depth) {
if (depth == 0) return;
}
}
class Test38Class3 extends Test38Class2 {
public Test38Class3 field7;
public static Test38Class3 field8;
public Test38Class2 field9;
public static void method5(int depth) {
if (depth == 0) return;
for (int local9 = 0; local9<=1; local9 += 1) {
field1.field7=field8.field3;
}
}
public static Test38Class1 method6(Test38Class2 arg0, Test38Class1 arg1, int depth) {
if (depth == 0) return Test38Lib.local3;
for (int local10 = 0; local10<=1; local10 += 1) {
if (depth==3) {
if (depth>=4) {
if (depth<=1) {
field1.field5.method4(field2.field3,field5.field5,depth-1);
}else {
for (int local11 = 0; local11<=3; local11 += 1) {
}
}
}else {
arg1=field2.field3;
}
}
}
for (int local12 = 0; local12<=1; local12 += 1) {
arg1.field2.method5(depth-1);
}
return field4.field1;
}
public void method7(Test38Class2 arg0, int depth) {
if (depth == 0) return;
if (depth<=1) {
this.field9.method3(arg0.field2,depth-1);
}else {
this.field6=this.field5;
}
}
public static void method8(Test38Class2 arg0, Test38Class3 arg1, int depth) {
if (depth == 0) return;
for (int local13 = 0; local13<=2; local13 += 1) {
arg1.field7.method4(field1.field4,field3.field1,depth-1);
}
for (int local14 = 0; local14<=3; local14 += 1) {
field3.field8.method2(depth-1);
}
}
}
public class Test38{
public static void main(String[] args) {
int inputValue = 0;
Benchmark.alloc(1);
Test38Lib.local1 = new Test38Class1();
Benchmark.alloc(2);
Test38Lib.local2 = new Test38Class2();
Benchmark.alloc(3);
Test38Lib.local3 = new Test38Class2();
Benchmark.alloc(4);
Test38Lib.local4 = new Test38Class2();
Benchmark.alloc(5);
Test38Lib.local5 = new Test38Class2();
Benchmark.alloc(6);
Test38Lib.local6 = new Test38Class3();
Benchmark.alloc(7);
Test38Lib.local7 = new Test38Class3();
Test38Lib.local1.field1 = Test38Lib.local6;
Test38Lib.local1.field2 = Test38Lib.local6;
Test38Lib.local1.field3 = Test38Lib.local7;
Test38Lib.local1.field4 = Test38Lib.local6;
Test38Lib.local1.field5 = Test38Lib.local6;
Test38Lib.local2.field6 = Test38Lib.local6;
Test38Lib.local2.field1 = Test38Lib.local7;
Test38Lib.local2.field2 = Test38Lib.local7;
Test38Lib.local2.field3 = Test38Lib.local6;
Test38Lib.local2.field4 = Test38Lib.local7;
Test38Lib.local2.field5 = Test38Lib.local7;
Test38Lib.local3.field6 = Test38Lib.local7;
Test38Lib.local3.field1 = Test38Lib.local7;
Test38Lib.local3.field2 = Test38Lib.local7;
Test38Lib.local3.field3 = Test38Lib.local6;
Test38Lib.local3.field4 = Test38Lib.local7;
Test38Lib.local3.field5 = Test38Lib.local7;
Test38Lib.local4.field6 = Test38Lib.local5;
Test38Lib.local4.field1 = Test38Lib.local6;
Test38Lib.local4.field2 = Test38Lib.local6;
Test38Lib.local4.field3 = Test38Lib.local7;
Test38Lib.local4.field4 = Test38Lib.local7;
Test38Lib.local4.field5 = Test38Lib.local7;
Test38Lib.local5.field6 = Test38Lib.local5;
Test38Lib.local5.field1 = Test38Lib.local7;
Test38Lib.local5.field2 = Test38Lib.local6;
Test38Lib.local5.field3 = Test38Lib.local6;
Test38Lib.local5.field4 = Test38Lib.local6;
Test38Lib.local5.field5 = Test38Lib.local6;
Test38Lib.local6.field7 = Test38Lib.local6;
Test38Lib.local6.field8 = Test38Lib.local6;
Test38Lib.local6.field9 = Test38Lib.local6;
Test38Lib.local6.field6 = Test38Lib.local2;
Test38Lib.local6.field1 = Test38Lib.local7;
Test38Lib.local6.field2 = Test38Lib.local7;
Test38Lib.local6.field3 = Test38Lib.local6;
Test38Lib.local6.field4 = Test38Lib.local7;
Test38Lib.local6.field5 = Test38Lib.local6;
Test38Lib.local7.field7 = Test38Lib.local7;
Test38Lib.local7.field8 = Test38Lib.local7;
Test38Lib.local7.field9 = Test38Lib.local2;
Test38Lib.local7.field6 = Test38Lib.local3;
Test38Lib.local7.field1 = Test38Lib.local6;
Test38Lib.local7.field2 = Test38Lib.local6;
Test38Lib.local7.field3 = Test38Lib.local7;
Test38Lib.local7.field4 = Test38Lib.local6;
Test38Lib.local7.field5 = Test38Lib.local6;
Test38Lib.local1=Test38Lib.local1.field5;
Test38Lib.local4.field1.method8(Test38Lib.local5.field4,Test38Lib.local3.field2,3);
Test38Lib.local5.field1.method7(Test38Lib.local3.field2,3);
Benchmark.test(1,Test38Lib.local1);
Benchmark.test(2,Test38Lib.local2);
Benchmark.test(3,Test38Lib.local3);
Benchmark.test(4,Test38Lib.local4);
Benchmark.test(5,Test38Lib.local5);
Benchmark.test(6,Test38Lib.local6);
Benchmark.test(7,Test38Lib.local7);
Benchmark.test(8,Test38Lib.local1.field1);
Benchmark.test(9,Test38Lib.local1.field2);
Benchmark.test(10,Test38Lib.local1.field3);
Benchmark.test(11,Test38Lib.local1.field4);
Benchmark.test(12,Test38Lib.local1.field5);
Benchmark.test(13,Test38Lib.local2.field6);
Benchmark.test(14,Test38Lib.local2.field1);
Benchmark.test(15,Test38Lib.local2.field2);
Benchmark.test(16,Test38Lib.local2.field3);
Benchmark.test(17,Test38Lib.local2.field4);
Benchmark.test(18,Test38Lib.local2.field5);
Benchmark.test(19,Test38Lib.local3.field6);
Benchmark.test(20,Test38Lib.local3.field1);
Benchmark.test(21,Test38Lib.local3.field2);
Benchmark.test(22,Test38Lib.local3.field3);
Benchmark.test(23,Test38Lib.local3.field4);
Benchmark.test(24,Test38Lib.local3.field5);
Benchmark.test(25,Test38Lib.local4.field6);
Benchmark.test(26,Test38Lib.local4.field1);
Benchmark.test(27,Test38Lib.local4.field2);
Benchmark.test(28,Test38Lib.local4.field3);
Benchmark.test(29,Test38Lib.local4.field4);
Benchmark.test(30,Test38Lib.local4.field5);
Benchmark.test(31,Test38Lib.local5.field6);
Benchmark.test(32,Test38Lib.local5.field1);
Benchmark.test(33,Test38Lib.local5.field2);
Benchmark.test(34,Test38Lib.local5.field3);
Benchmark.test(35,Test38Lib.local5.field4);
Benchmark.test(36,Test38Lib.local5.field5);
Benchmark.test(37,Test38Lib.local6.field7);
Benchmark.test(38,Test38Lib.local6.field8);
Benchmark.test(39,Test38Lib.local6.field9);
Benchmark.test(40,Test38Lib.local6.field6);
Benchmark.test(41,Test38Lib.local6.field1);
Benchmark.test(42,Test38Lib.local6.field2);
Benchmark.test(43,Test38Lib.local6.field3);
Benchmark.test(44,Test38Lib.local6.field4);
Benchmark.test(45,Test38Lib.local6.field5);
Benchmark.test(46,Test38Lib.local7.field7);
Benchmark.test(47,Test38Lib.local7.field8);
Benchmark.test(48,Test38Lib.local7.field9);
Benchmark.test(49,Test38Lib.local7.field6);
Benchmark.test(50,Test38Lib.local7.field1);
Benchmark.test(51,Test38Lib.local7.field2);
Benchmark.test(52,Test38Lib.local7.field3);
Benchmark.test(53,Test38Lib.local7.field4);
Benchmark.test(54,Test38Lib.local7.field5);
Benchmark.print();
}
}
