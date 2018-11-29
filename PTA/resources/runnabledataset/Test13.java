package runnabledataset;

import benchmark.tool.Benchmark;
import benchmark.tool.BasicClass;
class Test13Lib{
public static Test13Class1 local1;
public static Test13Class2 local2;
public static Test13Class2 local3;
public static Test13Class2 local4;
}
class Test13Class1 extends BasicClass {
public static Test13Class2 field1;
public Test13Class1 field2;
public static Test13Class1 field3;
public void method1(int depth) {
if (depth == 0) return;
}
public static void method2(int depth) {
if (depth == 0) return;
if (depth<=4) {
for (int local5 = 0; local5<=0; local5 += 1) {
field3.method2(depth-1);
}
}
field3.field2.method2(depth-1);
for (int local6 = 0; local6<=0; local6 += 1) {
if (depth>=3) {
field1.field11.method2(depth-1);
}else {
field1.field10.method2(depth-1);
}
}
for (int local7 = 0; local7<=0; local7 += 1) {
for (int local8 = 0; local8<=1; local8 += 1) {
field1.method5(field1.field7,field1.field7,depth-1);
}
}
if (depth<1) {
field1.method1(depth-1);
}
field1.field10=field1.field4;
field1.field3.method2(depth-1);
field1.field1=field3.field1;
field3=field1.field1;
}
public static void method3(Test13Class1 arg0, Test13Class1 arg1, int depth) {
if (depth == 0) return;
}
}
class Test13Class2 extends Test13Class1 {
public static Test13Class2 field4;
public Test13Class2 field5;
public Test13Class2 field6;
public static Test13Class2 field7;
public static Test13Class1 field8;
public Test13Class1 field9;
public static Test13Class1 field10;
public static Test13Class2 field11;
public static void method4(Test13Class2 arg0, Test13Class1 arg1, int depth) {
if (depth == 0) return;
if (depth<4) {
field4.field7.method4(field7.field5,field8.field2,depth-1);
}else {
field1.field3=arg0.field9;
}
field10.field1.method1(depth-1);
if (depth<=2) {
for (int local9 = 0; local9<=1; local9 += 1) {
field10=arg0.field10;
}
}else {
field7.field5=arg0.field4.method6(field7,arg0.field11,depth-1);
}
field8.field2.method2(depth-1);
field1.field7.method6(field11.field6,field1.field6,depth-1);
field8=arg0.field9;
}
public void method5(Test13Class2 arg0, Test13Class2 arg1, int depth) {
if (depth == 0) return;
if (depth<=2) {
if (depth<=1) {
arg1.field6.method3(arg0.field11,arg0.field3,depth-1);
}else {
if (depth>=3) {
if (depth>=3) {
if (depth<1) {
}
}else {
if (depth<=1) {
}
}
}else {
for (int local10 = 0; local10<=3; local10 += 1) {
for (int local11 = 0; local11<=0; local11 += 1) {
}
}
}
}
}else {
arg0.field7.method3(this.field10,arg0.field11,depth-1);
}
arg0.field11=this;
}
public static Test13Class2 method6(Test13Class2 arg0, Test13Class2 arg1, int depth) {
if (depth == 0) return Test13Lib.local2;
for (int local12 = 0; local12<=2; local12 += 1) {
if (depth>=1) {
field11.field7=field4.field7;
}else {
field7.field5.method5(field11.field5,field11.field4,depth-1);
}
}
for (int local13 = 0; local13<=1; local13 += 1) {
field4.method6(field4.field4,field1.field4,depth-1);
}
if (depth==4) {
field1.method1(depth-1);
}
field3.field1=field11;
field11.field5=field4.field4;
if (depth==1) {
field7.field7=field7.field4;
}
field8.field1=field1;
if (depth<2) {
for (int local14 = 0; local14<=2; local14 += 1) {
if (depth<1) {
if (depth>=1) {
for (int local15 = 0; local15<=2; local15 += 1) {
}
}
}else {
for (int local16 = 0; local16<=0; local16 += 1) {
field7.field11.method2(depth-1);
}
}
}
}else {
field7.field10=field7.field10;
}
field7.field8.method1(depth-1);
return arg1;
}
}
public class Test13{
public static void main(String[] args) {
int inputValue = 10;
Benchmark.alloc(1);
Test13Lib.local1 = new Test13Class1();
Benchmark.alloc(2);
Test13Lib.local2 = new Test13Class2();
Benchmark.alloc(3);
Test13Lib.local3 = new Test13Class2();
Benchmark.alloc(4);
Test13Lib.local4 = new Test13Class2();
Test13Lib.local1.field1 = Test13Lib.local3;
Test13Lib.local1.field2 = Test13Lib.local3;
Test13Lib.local1.field3 = Test13Lib.local3;
Test13Lib.local2.field4 = Test13Lib.local2;
Test13Lib.local2.field5 = Test13Lib.local3;
Test13Lib.local2.field6 = Test13Lib.local3;
Test13Lib.local2.field7 = Test13Lib.local2;
Test13Lib.local2.field8 = Test13Lib.local1;
Test13Lib.local2.field9 = Test13Lib.local2;
Test13Lib.local2.field10 = Test13Lib.local4;
Test13Lib.local2.field11 = Test13Lib.local2;
Test13Lib.local2.field1 = Test13Lib.local2;
Test13Lib.local2.field2 = Test13Lib.local1;
Test13Lib.local2.field3 = Test13Lib.local2;
Test13Lib.local3.field4 = Test13Lib.local4;
Test13Lib.local3.field5 = Test13Lib.local3;
Test13Lib.local3.field6 = Test13Lib.local2;
Test13Lib.local3.field7 = Test13Lib.local3;
Test13Lib.local3.field8 = Test13Lib.local2;
Test13Lib.local3.field9 = Test13Lib.local3;
Test13Lib.local3.field10 = Test13Lib.local3;
Test13Lib.local3.field11 = Test13Lib.local3;
Test13Lib.local3.field1 = Test13Lib.local2;
Test13Lib.local3.field2 = Test13Lib.local2;
Test13Lib.local3.field3 = Test13Lib.local4;
Test13Lib.local4.field4 = Test13Lib.local2;
Test13Lib.local4.field5 = Test13Lib.local4;
Test13Lib.local4.field6 = Test13Lib.local3;
Test13Lib.local4.field7 = Test13Lib.local3;
Test13Lib.local4.field8 = Test13Lib.local3;
Test13Lib.local4.field9 = Test13Lib.local3;
Test13Lib.local4.field10 = Test13Lib.local1;
Test13Lib.local4.field11 = Test13Lib.local4;
Test13Lib.local4.field1 = Test13Lib.local3;
Test13Lib.local4.field2 = Test13Lib.local4;
Test13Lib.local4.field3 = Test13Lib.local1;
if (inputValue<=4) {
Test13Lib.local3.field10=Test13Lib.local1.field1.method6(Test13Lib.local3,Test13Lib.local4.field7,3);
}else {
for (int local17 = 0; local17<=3; local17 += 1) {
Test13Lib.local4.field6=Test13Lib.local2.field1;
}
}
Test13Lib.local1.field1.method5(Test13Lib.local3.field11,Test13Lib.local3.field5,3);
if (inputValue<4) {
Test13Lib.local4.field5=Test13Lib.local3.field4;
}
Test13Lib.local2.method2(3);
Test13Lib.local3.field9=Test13Lib.local3.field5;
for (int local18 = 0; local18<=3; local18 += 1) {
if (inputValue<4) {
for (int local19 = 0; local19<=1; local19 += 1) {
for (int local20 = 0; local20<=0; local20 += 1) {
for (int local21 = 0; local21<=0; local21 += 1) {
}
}
}
}else {
if (inputValue>3) {
Test13Lib.local4.field3=Test13Lib.local2.field1;
}else {
Test13Lib.local2.field8.method1(3);
}
}
}
Test13Lib.local3.field9=Test13Lib.local2.field6;
if (inputValue==2) {
Test13Lib.local2.field6=Test13Lib.local4.field7;
}else {
for (int local22 = 0; local22<=3; local22 += 1) {
if (inputValue==3) {
if (inputValue==2) {
if (inputValue>2) {
}
}else {
for (int local23 = 0; local23<=3; local23 += 1) {
}
}
}
}
}
for (int local24 = 0; local24<=0; local24 += 1) {
if (inputValue<2) {
if (inputValue==4) {
Test13Lib.local2.field7.method4(Test13Lib.local3.field5,Test13Lib.local3.field2,3);
}
}
}
if (inputValue>2) {
if (inputValue==2) {
if (inputValue<4) {
if (inputValue==1) {
for (int local25 = 0; local25<=3; local25 += 1) {
}
}else {
Test13Lib.local2.field6.method3(Test13Lib.local2.field4,Test13Lib.local2.field11,3);
}
}
}else {
Test13Lib.local3.field6=Test13Lib.local2.field11;
}
}
Benchmark.test(1,Test13Lib.local1);
Benchmark.test(2,Test13Lib.local2);
Benchmark.test(3,Test13Lib.local3);
Benchmark.test(4,Test13Lib.local4);
Benchmark.test(5,Test13Lib.local1.field1);
Benchmark.test(6,Test13Lib.local1.field2);
Benchmark.test(7,Test13Lib.local1.field3);
Benchmark.test(8,Test13Lib.local2.field4);
Benchmark.test(9,Test13Lib.local2.field5);
Benchmark.test(10,Test13Lib.local2.field6);
Benchmark.test(11,Test13Lib.local2.field7);
Benchmark.test(12,Test13Lib.local2.field8);
Benchmark.test(13,Test13Lib.local2.field9);
Benchmark.test(14,Test13Lib.local2.field10);
Benchmark.test(15,Test13Lib.local2.field11);
Benchmark.test(16,Test13Lib.local2.field1);
Benchmark.test(17,Test13Lib.local2.field2);
Benchmark.test(18,Test13Lib.local2.field3);
Benchmark.test(19,Test13Lib.local3.field4);
Benchmark.test(20,Test13Lib.local3.field5);
Benchmark.test(21,Test13Lib.local3.field6);
Benchmark.test(22,Test13Lib.local3.field7);
Benchmark.test(23,Test13Lib.local3.field8);
Benchmark.test(24,Test13Lib.local3.field9);
Benchmark.test(25,Test13Lib.local3.field10);
Benchmark.test(26,Test13Lib.local3.field11);
Benchmark.test(27,Test13Lib.local3.field1);
Benchmark.test(28,Test13Lib.local3.field2);
Benchmark.test(29,Test13Lib.local3.field3);
Benchmark.test(30,Test13Lib.local4.field4);
Benchmark.test(31,Test13Lib.local4.field5);
Benchmark.test(32,Test13Lib.local4.field6);
Benchmark.test(33,Test13Lib.local4.field7);
Benchmark.test(34,Test13Lib.local4.field8);
Benchmark.test(35,Test13Lib.local4.field9);
Benchmark.test(36,Test13Lib.local4.field10);
Benchmark.test(37,Test13Lib.local4.field11);
Benchmark.test(38,Test13Lib.local4.field1);
Benchmark.test(39,Test13Lib.local4.field2);
Benchmark.test(40,Test13Lib.local4.field3);
Benchmark.print();
}
}
