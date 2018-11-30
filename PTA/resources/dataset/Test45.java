package dataset;

import benchmark.internal.Benchmark;
import benchmark.tool.BasicClass;
class Test45Lib{
public static Test45Class1 local1;
public static Test45Class2 local2;
public static Test45Class3 local3;
public static Test45Class3 local4;
}
class Test45Class1 extends BasicClass {
public static Test45Class3 field1;
public Test45Class3 field2;
public static Test45Class3 field3;
public Test45Class1 field4;
public static Test45Class2 field5;
public static Test45Class1 field6;
public static Test45Class1 method1(int depth) {
if (depth == 0) return Test45Lib.local3;
if (depth==4) {
field5.field6.method2(field3.field3,depth-1);
}
if (depth>2) {
field3.field4=field5.field11.method6(field3.field4,field1.field5,depth-1);
}
return field3.field4;
}
public static void method2(Test45Class1 arg0, int depth) {
if (depth == 0) return;
if (depth==4) {
field6.field1=field5.field2;
}else {
field5.field5=field5.field7;
}
}
public static void method3(int depth) {
if (depth == 0) return;
}
}
class Test45Class2 extends Test45Class1 {
public Test45Class2 field7;
public static Test45Class3 field8;
public static Test45Class1 field9;
public Test45Class3 field10;
public Test45Class2 field11;
public static void method4(Test45Class3 arg0, Test45Class1 arg1, int depth) {
if (depth == 0) return;
field1.field12=arg0.field15;
if (depth==1) {
for (int local5 = 0; local5<=0; local5 += 1) {
if (depth>=1) {
if (depth>1) {
for (int local6 = 0; local6<=1; local6 += 1) {
}
}
}
}
}
}
public static Test45Class3 method5(Test45Class1 arg0, Test45Class1 arg1, int depth) {
if (depth == 0) return Test45Lib.local3;
return field9.field2;
}
public static Test45Class2 method6(Test45Class1 arg0, Test45Class2 arg1, int depth) {
if (depth == 0) return Test45Lib.local2;
arg1.field2=field9.field1;
if (depth<3) {
if (depth>3) {
for (int local7 = 0; local7<=1; local7 += 1) {
arg1.field11=arg0.field5;
}
}
}
return field1.field12;
}
}
class Test45Class3 extends Test45Class1 {
public Test45Class2 field12;
public static Test45Class3 field13;
public static Test45Class2 field14;
public Test45Class2 field15;
public Test45Class1 field16;
public Test45Class2 method7(Test45Class3 arg0, int depth) {
if (depth == 0) return Test45Lib.local2;
this.field15.method4(arg0.field2,arg0.field5,depth-1);
return this.field5;
}
public void method8(int depth) {
if (depth == 0) return;
this.field12.method4(this.field1,this.field1,depth-1);
}
}
public class Test45{
public static void main(String[] args) {
int inputValue = 0;
Benchmark.alloc(1);
Test45Lib.local1 = new Test45Class1();
Benchmark.alloc(2);
Test45Lib.local2 = new Test45Class2();
Benchmark.alloc(3);
Test45Lib.local3 = new Test45Class3();
Benchmark.alloc(4);
Test45Lib.local4 = new Test45Class3();
Test45Lib.local1.field1 = Test45Lib.local4;
Test45Lib.local1.field2 = Test45Lib.local3;
Test45Lib.local1.field3 = Test45Lib.local4;
Test45Lib.local1.field4 = Test45Lib.local2;
Test45Lib.local1.field5 = Test45Lib.local2;
Test45Lib.local1.field6 = Test45Lib.local4;
Test45Lib.local2.field7 = Test45Lib.local2;
Test45Lib.local2.field8 = Test45Lib.local4;
Test45Lib.local2.field9 = Test45Lib.local3;
Test45Lib.local2.field10 = Test45Lib.local3;
Test45Lib.local2.field11 = Test45Lib.local2;
Test45Lib.local2.field1 = Test45Lib.local4;
Test45Lib.local2.field2 = Test45Lib.local4;
Test45Lib.local2.field3 = Test45Lib.local3;
Test45Lib.local2.field4 = Test45Lib.local3;
Test45Lib.local2.field5 = Test45Lib.local2;
Test45Lib.local2.field6 = Test45Lib.local4;
Test45Lib.local3.field12 = Test45Lib.local2;
Test45Lib.local3.field13 = Test45Lib.local4;
Test45Lib.local3.field14 = Test45Lib.local2;
Test45Lib.local3.field15 = Test45Lib.local2;
Test45Lib.local3.field16 = Test45Lib.local4;
Test45Lib.local3.field1 = Test45Lib.local4;
Test45Lib.local3.field2 = Test45Lib.local3;
Test45Lib.local3.field3 = Test45Lib.local4;
Test45Lib.local3.field4 = Test45Lib.local2;
Test45Lib.local3.field5 = Test45Lib.local2;
Test45Lib.local3.field6 = Test45Lib.local2;
Test45Lib.local4.field12 = Test45Lib.local2;
Test45Lib.local4.field13 = Test45Lib.local4;
Test45Lib.local4.field14 = Test45Lib.local2;
Test45Lib.local4.field15 = Test45Lib.local2;
Test45Lib.local4.field16 = Test45Lib.local4;
Test45Lib.local4.field1 = Test45Lib.local3;
Test45Lib.local4.field2 = Test45Lib.local3;
Test45Lib.local4.field3 = Test45Lib.local4;
Test45Lib.local4.field4 = Test45Lib.local1;
Test45Lib.local4.field5 = Test45Lib.local2;
Test45Lib.local4.field6 = Test45Lib.local3;
if (inputValue>4) {
if (inputValue<=3) {
Test45Lib.local4.field5.method4(Test45Lib.local2.field10,Test45Lib.local4.field15,3);
}
}
Test45Lib.local4.field5=Test45Lib.local4.field5;
for (int local8 = 0; local8<=3; local8 += 1) {
if (inputValue>4) {
Test45Lib.local3.field4=Test45Lib.local4.field16;
}
}
Benchmark.test(1,Test45Lib.local1);
Benchmark.test(2,Test45Lib.local2);
Benchmark.test(3,Test45Lib.local3);
Benchmark.test(4,Test45Lib.local4);
Benchmark.test(5,Test45Lib.local1.field1);
Benchmark.test(6,Test45Lib.local1.field2);
Benchmark.test(7,Test45Lib.local1.field3);
Benchmark.test(8,Test45Lib.local1.field4);
Benchmark.test(9,Test45Lib.local1.field5);
Benchmark.test(10,Test45Lib.local1.field6);
Benchmark.test(11,Test45Lib.local2.field7);
Benchmark.test(12,Test45Lib.local2.field8);
Benchmark.test(13,Test45Lib.local2.field9);
Benchmark.test(14,Test45Lib.local2.field10);
Benchmark.test(15,Test45Lib.local2.field11);
Benchmark.test(16,Test45Lib.local2.field1);
Benchmark.test(17,Test45Lib.local2.field2);
Benchmark.test(18,Test45Lib.local2.field3);
Benchmark.test(19,Test45Lib.local2.field4);
Benchmark.test(20,Test45Lib.local2.field5);
Benchmark.test(21,Test45Lib.local2.field6);
Benchmark.test(22,Test45Lib.local3.field12);
Benchmark.test(23,Test45Lib.local3.field13);
Benchmark.test(24,Test45Lib.local3.field14);
Benchmark.test(25,Test45Lib.local3.field15);
Benchmark.test(26,Test45Lib.local3.field16);
Benchmark.test(27,Test45Lib.local3.field1);
Benchmark.test(28,Test45Lib.local3.field2);
Benchmark.test(29,Test45Lib.local3.field3);
Benchmark.test(30,Test45Lib.local3.field4);
Benchmark.test(31,Test45Lib.local3.field5);
Benchmark.test(32,Test45Lib.local3.field6);
Benchmark.test(33,Test45Lib.local4.field12);
Benchmark.test(34,Test45Lib.local4.field13);
Benchmark.test(35,Test45Lib.local4.field14);
Benchmark.test(36,Test45Lib.local4.field15);
Benchmark.test(37,Test45Lib.local4.field16);
Benchmark.test(38,Test45Lib.local4.field1);
Benchmark.test(39,Test45Lib.local4.field2);
Benchmark.test(40,Test45Lib.local4.field3);
Benchmark.test(41,Test45Lib.local4.field4);
Benchmark.test(42,Test45Lib.local4.field5);
Benchmark.test(43,Test45Lib.local4.field6);
Benchmark.print();
}
}
