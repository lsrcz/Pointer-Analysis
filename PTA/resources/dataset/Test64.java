package dataset;

import benchmark.internal.Benchmark;
import benchmark.tool.BasicClass;
class Test64Lib{
public static Test64Class1 local1;
public static Test64Class1 local2;
public static Test64Class2 local3;
public static Test64Class2 local4;
}
class Test64Class1 extends BasicClass {
public Test64Class1 field1;
public Test64Class1 field2;
public Test64Class1 field3;
public Test64Class1 field4;
public Test64Class2 method1(Test64Class1 arg0, Test64Class2 arg1, int depth) {
if (depth == 0) return Test64Lib.local4;
return arg1.field8.field8.field7;
}
}
class Test64Class2 extends Test64Class1 {
public Test64Class1 field5;
public Test64Class2 field6;
public Test64Class2 field7;
public Test64Class2 field8;
public void method2(Test64Class2 arg0, int depth) {
if (depth == 0) return;
this.field7.field7.field6=arg0.field6.field7.field6;
arg0.field6.field3=arg0.field4.field4;
if (depth==4) {
if (depth<3) {
arg0.field7.field6.field6.method2(this.field6.field6.field8,depth-1);
}else {
if (depth>1) {
if (depth>=1) {
arg0.field7.field4.field1=arg0.field7.field7.field3;
}else {
for (int local5 = 0; local5<=1; local5 += 1) {
}
}
}else {
arg0.field7.field6.field4=this.field1.field4.field4.method1(arg0.field7.field8.field8,this.field8.field6.field7,depth-1);
}
}
}
if (depth>=1) {
arg0=arg0.field6.field6.field8;
}else {
arg0.field5.field2.field1=arg0.field5.field3.field2;
}
}
}
public class Test64{
public static void main(String[] args) {
int inputValue = 0;
Benchmark.alloc(1);
Test64Lib.local1 = new Test64Class1();
Benchmark.alloc(2);
Test64Lib.local2 = new Test64Class1();
Benchmark.alloc(3);
Test64Lib.local3 = new Test64Class2();
Benchmark.alloc(4);
Test64Lib.local4 = new Test64Class2();
Test64Lib.local1.field1 = Test64Lib.local4;
Test64Lib.local1.field2 = Test64Lib.local2;
Test64Lib.local1.field3 = Test64Lib.local1;
Test64Lib.local1.field4 = Test64Lib.local3;
Test64Lib.local2.field1 = Test64Lib.local1;
Test64Lib.local2.field2 = Test64Lib.local1;
Test64Lib.local2.field3 = Test64Lib.local2;
Test64Lib.local2.field4 = Test64Lib.local2;
Test64Lib.local3.field5 = Test64Lib.local1;
Test64Lib.local3.field6 = Test64Lib.local4;
Test64Lib.local3.field7 = Test64Lib.local3;
Test64Lib.local3.field8 = Test64Lib.local3;
Test64Lib.local3.field1 = Test64Lib.local2;
Test64Lib.local3.field2 = Test64Lib.local4;
Test64Lib.local3.field3 = Test64Lib.local2;
Test64Lib.local3.field4 = Test64Lib.local2;
Test64Lib.local4.field5 = Test64Lib.local4;
Test64Lib.local4.field6 = Test64Lib.local4;
Test64Lib.local4.field7 = Test64Lib.local4;
Test64Lib.local4.field8 = Test64Lib.local4;
Test64Lib.local4.field1 = Test64Lib.local4;
Test64Lib.local4.field2 = Test64Lib.local4;
Test64Lib.local4.field3 = Test64Lib.local3;
Test64Lib.local4.field4 = Test64Lib.local1;
Test64Lib.local1.field2.field3.field3=Test64Lib.local4.field7.field6.field7;
Test64Lib.local3.field7.field6.field7.method2(Test64Lib.local4.field8.field8.field8,3);
Test64Lib.local4.field8.field7=Test64Lib.local3.field7.field7.field8;
for (int local6 = 0; local6<=2; local6 += 1) {
for (int local7 = 0; local7<=3; local7 += 1) {
Test64Lib.local3=Test64Lib.local4.field8.field7;
}
}
if (inputValue<1) {
for (int local8 = 0; local8<=1; local8 += 1) {
Test64Lib.local4.field2.field3.field1=Test64Lib.local1.field4.field1.field4;
}
}else {
for (int local9 = 0; local9<=0; local9 += 1) {
if (inputValue==1) {
Test64Lib.local4.field3.field2=Test64Lib.local4.field7.field1.field1.method1(Test64Lib.local2.field2.field4,Test64Lib.local3.field6.field6.field6,3);
}
}
}
Test64Lib.local4.field6.field8.field8.method2(Test64Lib.local4.field8.field6.field7,3);
if (inputValue>3) {
for (int local10 = 0; local10<=1; local10 += 1) {
for (int local11 = 0; local11<=1; local11 += 1) {
Test64Lib.local4.field7.field6.field7=Test64Lib.local4.field3.field3.field2.method1(Test64Lib.local3.field3.field4.field4,Test64Lib.local3.field8.field8.field8,3);
}
}
}else {
Test64Lib.local4.field8.field6.field7=Test64Lib.local3.field8.field7;
}
for (int local12 = 0; local12<=2; local12 += 1) {
if (inputValue==3) {
Test64Lib.local4.field8.field7.field6=Test64Lib.local4.field8.field7;
}else {
for (int local13 = 0; local13<=3; local13 += 1) {
if (inputValue>=4) {
Test64Lib.local4.field8.field8.field6.method2(Test64Lib.local4.field7.field7.field6,3);
}else {
Test64Lib.local3.field7.field6.field8.method2(Test64Lib.local3,3);
}
}
}
}
if (inputValue>=2) {
Test64Lib.local3.field6.field6.field6=Test64Lib.local3.field7.field6.field8;
}
Test64Lib.local4.field7.field7.method2(Test64Lib.local3.field6.field7.field7,3);
Benchmark.test(1,Test64Lib.local1);
Benchmark.test(2,Test64Lib.local2);
Benchmark.test(3,Test64Lib.local3);
Benchmark.test(4,Test64Lib.local4);
Benchmark.test(5,Test64Lib.local1.field1);
Benchmark.test(6,Test64Lib.local1.field2);
Benchmark.test(7,Test64Lib.local1.field3);
Benchmark.test(8,Test64Lib.local1.field4);
Benchmark.test(9,Test64Lib.local2.field1);
Benchmark.test(10,Test64Lib.local2.field2);
Benchmark.test(11,Test64Lib.local2.field3);
Benchmark.test(12,Test64Lib.local2.field4);
Benchmark.test(13,Test64Lib.local3.field5);
Benchmark.test(14,Test64Lib.local3.field6);
Benchmark.test(15,Test64Lib.local3.field7);
Benchmark.test(16,Test64Lib.local3.field8);
Benchmark.test(17,Test64Lib.local3.field1);
Benchmark.test(18,Test64Lib.local3.field2);
Benchmark.test(19,Test64Lib.local3.field3);
Benchmark.test(20,Test64Lib.local3.field4);
Benchmark.test(21,Test64Lib.local4.field5);
Benchmark.test(22,Test64Lib.local4.field6);
Benchmark.test(23,Test64Lib.local4.field7);
Benchmark.test(24,Test64Lib.local4.field8);
Benchmark.test(25,Test64Lib.local4.field1);
Benchmark.test(26,Test64Lib.local4.field2);
Benchmark.test(27,Test64Lib.local4.field3);
Benchmark.test(28,Test64Lib.local4.field4);
Benchmark.print();
}
}
