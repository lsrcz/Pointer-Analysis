package runnabledataset;

import benchmark.tool.Benchmark;
import benchmark.tool.BasicClass;
class Test36Lib{
public static Test36Class1 local1;
public static Test36Class2 local2;
public static Test36Class2 local3;
public static Test36Class3 local4;
public static Test36Class3 local5;
public static Test36Class3 local6;
public static Test36Class3 local7;
public static Test36Class3 local8;
}
class Test36Class1 extends BasicClass {
public Test36Class1 field1;
public static Test36Class3 field2;
public Test36Class2 field3;
public Test36Class2 field4;
public static void method1(int depth) {
if (depth == 0) return;
if (depth==4) {
if (depth<1) {
field2.field2.method8(field2.field4,field2.field13,depth-1);
}
}else {
field2.field4=field2.field13;
}
if (depth>4) {
if (depth==1) {
if (depth<=3) {
field2.field4.method4(depth-1);
}else {
if (depth>3) {
field2.field13.method3(depth-1);
}else {
field2.field4=field2.field4;
}
}
}
}else {
field2.field1=field2.field11;
}
}
public static void method2(Test36Class1 arg0, int depth) {
if (depth == 0) return;
}
public static void method3(int depth) {
if (depth == 0) return;
field2.field10=field2.field10.method4(depth-1);
for (int local9 = 0; local9<=3; local9 += 1) {
field2.field3.method2(field2.field1,depth-1);
}
}
}
class Test36Class2 extends Test36Class1 {
public Test36Class2 field5;
public Test36Class3 field6;
public static Test36Class2 field7;
public static Test36Class2 field8;
public Test36Class3 field9;
public Test36Class2 method4(int depth) {
if (depth == 0) return Test36Lib.local2;
this.field1=this.field8;
return this;
}
public Test36Class3 method5(Test36Class2 arg0, Test36Class3 arg1, int depth) {
if (depth == 0) return Test36Lib.local5;
for (int local10 = 0; local10<=0; local10 += 1) {
if (depth<1) {
arg1.field1=arg0;
}
}
if (depth==1) {
arg1.field2=this.field2;
}
return arg0.field6;
}
public Test36Class2 method6(Test36Class3 arg0, int depth) {
if (depth == 0) return Test36Lib.local3;
for (int local11 = 0; local11<=0; local11 += 1) {
this.field4.method6(this.field2,depth-1);
}
for (int local12 = 0; local12<=3; local12 += 1) {
arg0.field14=this.field4.method5(this.field3,this.field2,depth-1);
}
return this;
}
public void method7(int depth) {
if (depth == 0) return;
}
}
class Test36Class3 extends Test36Class1 {
public Test36Class2 field10;
public static Test36Class2 field11;
public static Test36Class1 field12;
public static Test36Class2 field13;
public Test36Class1 field14;
public void method8(Test36Class1 arg0, Test36Class2 arg1, int depth) {
if (depth == 0) return;
this.field13=arg1.field4;
arg1.field2.method8(arg0.field4,arg1,depth-1);
}
}
public class Test36{
public static void main(String[] args) {
int inputValue = 10;
Benchmark.alloc(1);
Test36Lib.local1 = new Test36Class1();
Benchmark.alloc(2);
Test36Lib.local2 = new Test36Class2();
Benchmark.alloc(3);
Test36Lib.local3 = new Test36Class2();
Benchmark.alloc(4);
Test36Lib.local4 = new Test36Class3();
Benchmark.alloc(5);
Test36Lib.local5 = new Test36Class3();
Benchmark.alloc(6);
Test36Lib.local6 = new Test36Class3();
Benchmark.alloc(7);
Test36Lib.local7 = new Test36Class3();
Benchmark.alloc(8);
Test36Lib.local8 = new Test36Class3();
Test36Lib.local1.field1 = Test36Lib.local8;
Test36Lib.local1.field2 = Test36Lib.local6;
Test36Lib.local1.field3 = Test36Lib.local3;
Test36Lib.local1.field4 = Test36Lib.local3;
Test36Lib.local2.field5 = Test36Lib.local3;
Test36Lib.local2.field6 = Test36Lib.local5;
Test36Lib.local2.field7 = Test36Lib.local2;
Test36Lib.local2.field8 = Test36Lib.local2;
Test36Lib.local2.field9 = Test36Lib.local6;
Test36Lib.local2.field1 = Test36Lib.local8;
Test36Lib.local2.field2 = Test36Lib.local8;
Test36Lib.local2.field3 = Test36Lib.local3;
Test36Lib.local2.field4 = Test36Lib.local2;
Test36Lib.local3.field5 = Test36Lib.local3;
Test36Lib.local3.field6 = Test36Lib.local7;
Test36Lib.local3.field7 = Test36Lib.local3;
Test36Lib.local3.field8 = Test36Lib.local3;
Test36Lib.local3.field9 = Test36Lib.local5;
Test36Lib.local3.field1 = Test36Lib.local8;
Test36Lib.local3.field2 = Test36Lib.local7;
Test36Lib.local3.field3 = Test36Lib.local2;
Test36Lib.local3.field4 = Test36Lib.local2;
Test36Lib.local4.field10 = Test36Lib.local3;
Test36Lib.local4.field11 = Test36Lib.local3;
Test36Lib.local4.field12 = Test36Lib.local6;
Test36Lib.local4.field13 = Test36Lib.local2;
Test36Lib.local4.field14 = Test36Lib.local5;
Test36Lib.local4.field1 = Test36Lib.local7;
Test36Lib.local4.field2 = Test36Lib.local4;
Test36Lib.local4.field3 = Test36Lib.local2;
Test36Lib.local4.field4 = Test36Lib.local2;
Test36Lib.local5.field10 = Test36Lib.local3;
Test36Lib.local5.field11 = Test36Lib.local3;
Test36Lib.local5.field12 = Test36Lib.local6;
Test36Lib.local5.field13 = Test36Lib.local2;
Test36Lib.local5.field14 = Test36Lib.local1;
Test36Lib.local5.field1 = Test36Lib.local5;
Test36Lib.local5.field2 = Test36Lib.local7;
Test36Lib.local5.field3 = Test36Lib.local2;
Test36Lib.local5.field4 = Test36Lib.local2;
Test36Lib.local6.field10 = Test36Lib.local2;
Test36Lib.local6.field11 = Test36Lib.local2;
Test36Lib.local6.field12 = Test36Lib.local4;
Test36Lib.local6.field13 = Test36Lib.local2;
Test36Lib.local6.field14 = Test36Lib.local5;
Test36Lib.local6.field1 = Test36Lib.local4;
Test36Lib.local6.field2 = Test36Lib.local5;
Test36Lib.local6.field3 = Test36Lib.local3;
Test36Lib.local6.field4 = Test36Lib.local3;
Test36Lib.local7.field10 = Test36Lib.local3;
Test36Lib.local7.field11 = Test36Lib.local2;
Test36Lib.local7.field12 = Test36Lib.local3;
Test36Lib.local7.field13 = Test36Lib.local3;
Test36Lib.local7.field14 = Test36Lib.local6;
Test36Lib.local7.field1 = Test36Lib.local2;
Test36Lib.local7.field2 = Test36Lib.local5;
Test36Lib.local7.field3 = Test36Lib.local2;
Test36Lib.local7.field4 = Test36Lib.local3;
Test36Lib.local8.field10 = Test36Lib.local2;
Test36Lib.local8.field11 = Test36Lib.local3;
Test36Lib.local8.field12 = Test36Lib.local8;
Test36Lib.local8.field13 = Test36Lib.local2;
Test36Lib.local8.field14 = Test36Lib.local4;
Test36Lib.local8.field1 = Test36Lib.local4;
Test36Lib.local8.field2 = Test36Lib.local6;
Test36Lib.local8.field3 = Test36Lib.local2;
Test36Lib.local8.field4 = Test36Lib.local3;
for (int local13 = 0; local13<=0; local13 += 1) {
Test36Lib.local7=Test36Lib.local6.field2;
}
Test36Lib.local6.field2=Test36Lib.local8.field2;
Test36Lib.local2.method7(3);
Benchmark.test(1,Test36Lib.local1);
Benchmark.test(2,Test36Lib.local2);
Benchmark.test(3,Test36Lib.local3);
Benchmark.test(4,Test36Lib.local4);
Benchmark.test(5,Test36Lib.local5);
Benchmark.test(6,Test36Lib.local6);
Benchmark.test(7,Test36Lib.local7);
Benchmark.test(8,Test36Lib.local8);
Benchmark.test(9,Test36Lib.local1.field1);
Benchmark.test(10,Test36Lib.local1.field2);
Benchmark.test(11,Test36Lib.local1.field3);
Benchmark.test(12,Test36Lib.local1.field4);
Benchmark.test(13,Test36Lib.local2.field5);
Benchmark.test(14,Test36Lib.local2.field6);
Benchmark.test(15,Test36Lib.local2.field7);
Benchmark.test(16,Test36Lib.local2.field8);
Benchmark.test(17,Test36Lib.local2.field9);
Benchmark.test(18,Test36Lib.local2.field1);
Benchmark.test(19,Test36Lib.local2.field2);
Benchmark.test(20,Test36Lib.local2.field3);
Benchmark.test(21,Test36Lib.local2.field4);
Benchmark.test(22,Test36Lib.local3.field5);
Benchmark.test(23,Test36Lib.local3.field6);
Benchmark.test(24,Test36Lib.local3.field7);
Benchmark.test(25,Test36Lib.local3.field8);
Benchmark.test(26,Test36Lib.local3.field9);
Benchmark.test(27,Test36Lib.local3.field1);
Benchmark.test(28,Test36Lib.local3.field2);
Benchmark.test(29,Test36Lib.local3.field3);
Benchmark.test(30,Test36Lib.local3.field4);
Benchmark.test(31,Test36Lib.local4.field10);
Benchmark.test(32,Test36Lib.local4.field11);
Benchmark.test(33,Test36Lib.local4.field12);
Benchmark.test(34,Test36Lib.local4.field13);
Benchmark.test(35,Test36Lib.local4.field14);
Benchmark.test(36,Test36Lib.local4.field1);
Benchmark.test(37,Test36Lib.local4.field2);
Benchmark.test(38,Test36Lib.local4.field3);
Benchmark.test(39,Test36Lib.local4.field4);
Benchmark.test(40,Test36Lib.local5.field10);
Benchmark.test(41,Test36Lib.local5.field11);
Benchmark.test(42,Test36Lib.local5.field12);
Benchmark.test(43,Test36Lib.local5.field13);
Benchmark.test(44,Test36Lib.local5.field14);
Benchmark.test(45,Test36Lib.local5.field1);
Benchmark.test(46,Test36Lib.local5.field2);
Benchmark.test(47,Test36Lib.local5.field3);
Benchmark.test(48,Test36Lib.local5.field4);
Benchmark.test(49,Test36Lib.local6.field10);
Benchmark.test(50,Test36Lib.local6.field11);
Benchmark.test(51,Test36Lib.local6.field12);
Benchmark.test(52,Test36Lib.local6.field13);
Benchmark.test(53,Test36Lib.local6.field14);
Benchmark.test(54,Test36Lib.local6.field1);
Benchmark.test(55,Test36Lib.local6.field2);
Benchmark.test(56,Test36Lib.local6.field3);
Benchmark.test(57,Test36Lib.local6.field4);
Benchmark.test(58,Test36Lib.local7.field10);
Benchmark.test(59,Test36Lib.local7.field11);
Benchmark.test(60,Test36Lib.local7.field12);
Benchmark.test(61,Test36Lib.local7.field13);
Benchmark.test(62,Test36Lib.local7.field14);
Benchmark.test(63,Test36Lib.local7.field1);
Benchmark.test(64,Test36Lib.local7.field2);
Benchmark.test(65,Test36Lib.local7.field3);
Benchmark.test(66,Test36Lib.local7.field4);
Benchmark.test(67,Test36Lib.local8.field10);
Benchmark.test(68,Test36Lib.local8.field11);
Benchmark.test(69,Test36Lib.local8.field12);
Benchmark.test(70,Test36Lib.local8.field13);
Benchmark.test(71,Test36Lib.local8.field14);
Benchmark.test(72,Test36Lib.local8.field1);
Benchmark.test(73,Test36Lib.local8.field2);
Benchmark.test(74,Test36Lib.local8.field3);
Benchmark.test(75,Test36Lib.local8.field4);
Benchmark.print();
}
}
