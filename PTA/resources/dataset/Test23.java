package dataset;

import benchmark.internal.Benchmark;
import benchmark.tool.BasicClass;
class Test23Lib{
public static Test23Class1 local1;
public static Test23Class1 local2;
public static Test23Class1 local3;
public static Test23Class1 local4;
public static Test23Class1 local5;
public static Test23Class2 local6;
public static Test23Class3 local7;
public static Test23Class3 local8;
public static Test23Class3 local9;
public static Test23Class3 local10;
public static Test23Class3 local11;
}
class Test23Class1 extends BasicClass {
public Test23Class1 field1;
public Test23Class3 field2;
public static Test23Class1 method1(Test23Class2 arg0, int depth) {
if (depth == 0) return Test23Lib.local10;
arg0.field4=arg0.field4;
return arg0;
}
}
class Test23Class2 extends Test23Class1 {
public Test23Class1 field3;
public Test23Class2 field4;
public Test23Class1 field5;
public Test23Class3 method2(Test23Class3 arg0, Test23Class3 arg1, int depth) {
if (depth == 0) return Test23Lib.local7;
return arg1;
}
public static Test23Class3 method3(Test23Class3 arg0, int depth) {
if (depth == 0) return Test23Lib.local7;
return arg0.field2;
}
}
class Test23Class3 extends Test23Class1 {
public Test23Class1 field6;
public Test23Class2 field7;
public Test23Class1 field8;
public static void method4(Test23Class2 arg0, Test23Class3 arg1, int depth) {
if (depth == 0) return;
}
public static void method5(int depth) {
if (depth == 0) return;
if (depth>=2) {
if (depth>4) {
for (int local12 = 0; local12<=1; local12 += 1) {
if (depth<1) {
if (depth==3) {
}
}
}
}else {
for (int local13 = 0; local13<=3; local13 += 1) {
for (int local14 = 0; local14<=3; local14 += 1) {
for (int local15 = 0; local15<=2; local15 += 1) {
}
}
}
}
}else {
for (int local16 = 0; local16<=0; local16 += 1) {
for (int local17 = 0; local17<=1; local17 += 1) {
for (int local18 = 0; local18<=1; local18 += 1) {
for (int local19 = 0; local19<=3; local19 += 1) {
}
}
}
}
}
}
public static void method6(int depth) {
if (depth == 0) return;
for (int local20 = 0; local20<=0; local20 += 1) {
for (int local21 = 0; local21<=1; local21 += 1) {
for (int local22 = 0; local22<=3; local22 += 1) {
if (depth>=1) {
for (int local23 = 0; local23<=2; local23 += 1) {
}
}else {
if (depth>4) {
}else {
}
}
}
}
}
}
public Test23Class1 method7(int depth) {
if (depth == 0) return Test23Lib.local8;
if (depth<=4) {
for (int local24 = 0; local24<=3; local24 += 1) {
if (depth<1) {
if (depth>4) {
this.field8=this.field7.method3(this.field2,depth-1);
}
}
}
}
return this.field2;
}
}
public class Test23{
public static void main(String[] args) {
int inputValue = 0;
Benchmark.alloc(1);
Test23Lib.local1 = new Test23Class1();
Benchmark.alloc(2);
Test23Lib.local2 = new Test23Class1();
Benchmark.alloc(3);
Test23Lib.local3 = new Test23Class1();
Benchmark.alloc(4);
Test23Lib.local4 = new Test23Class1();
Benchmark.alloc(5);
Test23Lib.local5 = new Test23Class1();
Benchmark.alloc(6);
Test23Lib.local6 = new Test23Class2();
Benchmark.alloc(7);
Test23Lib.local7 = new Test23Class3();
Benchmark.alloc(8);
Test23Lib.local8 = new Test23Class3();
Benchmark.alloc(9);
Test23Lib.local9 = new Test23Class3();
Benchmark.alloc(10);
Test23Lib.local10 = new Test23Class3();
Benchmark.alloc(11);
Test23Lib.local11 = new Test23Class3();
Test23Lib.local1.field1 = Test23Lib.local9;
Test23Lib.local1.field2 = Test23Lib.local7;
Test23Lib.local2.field1 = Test23Lib.local5;
Test23Lib.local2.field2 = Test23Lib.local7;
Test23Lib.local3.field1 = Test23Lib.local10;
Test23Lib.local3.field2 = Test23Lib.local9;
Test23Lib.local4.field1 = Test23Lib.local7;
Test23Lib.local4.field2 = Test23Lib.local9;
Test23Lib.local5.field1 = Test23Lib.local6;
Test23Lib.local5.field2 = Test23Lib.local7;
Test23Lib.local6.field3 = Test23Lib.local10;
Test23Lib.local6.field4 = Test23Lib.local6;
Test23Lib.local6.field5 = Test23Lib.local3;
Test23Lib.local6.field1 = Test23Lib.local3;
Test23Lib.local6.field2 = Test23Lib.local7;
Test23Lib.local7.field6 = Test23Lib.local1;
Test23Lib.local7.field7 = Test23Lib.local6;
Test23Lib.local7.field8 = Test23Lib.local8;
Test23Lib.local7.field1 = Test23Lib.local8;
Test23Lib.local7.field2 = Test23Lib.local7;
Test23Lib.local8.field6 = Test23Lib.local3;
Test23Lib.local8.field7 = Test23Lib.local6;
Test23Lib.local8.field8 = Test23Lib.local9;
Test23Lib.local8.field1 = Test23Lib.local2;
Test23Lib.local8.field2 = Test23Lib.local11;
Test23Lib.local9.field6 = Test23Lib.local3;
Test23Lib.local9.field7 = Test23Lib.local6;
Test23Lib.local9.field8 = Test23Lib.local8;
Test23Lib.local9.field1 = Test23Lib.local3;
Test23Lib.local9.field2 = Test23Lib.local9;
Test23Lib.local10.field6 = Test23Lib.local9;
Test23Lib.local10.field7 = Test23Lib.local6;
Test23Lib.local10.field8 = Test23Lib.local6;
Test23Lib.local10.field1 = Test23Lib.local11;
Test23Lib.local10.field2 = Test23Lib.local11;
Test23Lib.local11.field6 = Test23Lib.local3;
Test23Lib.local11.field7 = Test23Lib.local6;
Test23Lib.local11.field8 = Test23Lib.local4;
Test23Lib.local11.field1 = Test23Lib.local11;
Test23Lib.local11.field2 = Test23Lib.local11;
if (inputValue<=3) {
for (int local25 = 0; local25<=1; local25 += 1) {
if (inputValue>=2) {
Test23Lib.local11.field7=Test23Lib.local6;
}
}
}else {
if (inputValue>2) {
Test23Lib.local6.field4=Test23Lib.local6.field4;
}
}
Test23Lib.local10=Test23Lib.local4.field2;
if (inputValue<=1) {
Test23Lib.local8.field6=Test23Lib.local7.field7;
}else {
if (inputValue==2) {
if (inputValue>=2) {
Test23Lib.local7.field6=Test23Lib.local9.field7.method3(Test23Lib.local3.field2,3);
}else {
Test23Lib.local8.field7=Test23Lib.local8.field7;
}
}
}
Benchmark.test(1,Test23Lib.local1);
Benchmark.test(2,Test23Lib.local2);
Benchmark.test(3,Test23Lib.local3);
Benchmark.test(4,Test23Lib.local4);
Benchmark.test(5,Test23Lib.local5);
Benchmark.test(6,Test23Lib.local6);
Benchmark.test(7,Test23Lib.local7);
Benchmark.test(8,Test23Lib.local8);
Benchmark.test(9,Test23Lib.local9);
Benchmark.test(10,Test23Lib.local10);
Benchmark.test(11,Test23Lib.local11);
Benchmark.test(12,Test23Lib.local1.field1);
Benchmark.test(13,Test23Lib.local1.field2);
Benchmark.test(14,Test23Lib.local2.field1);
Benchmark.test(15,Test23Lib.local2.field2);
Benchmark.test(16,Test23Lib.local3.field1);
Benchmark.test(17,Test23Lib.local3.field2);
Benchmark.test(18,Test23Lib.local4.field1);
Benchmark.test(19,Test23Lib.local4.field2);
Benchmark.test(20,Test23Lib.local5.field1);
Benchmark.test(21,Test23Lib.local5.field2);
Benchmark.test(22,Test23Lib.local6.field3);
Benchmark.test(23,Test23Lib.local6.field4);
Benchmark.test(24,Test23Lib.local6.field5);
Benchmark.test(25,Test23Lib.local6.field1);
Benchmark.test(26,Test23Lib.local6.field2);
Benchmark.test(27,Test23Lib.local7.field6);
Benchmark.test(28,Test23Lib.local7.field7);
Benchmark.test(29,Test23Lib.local7.field8);
Benchmark.test(30,Test23Lib.local7.field1);
Benchmark.test(31,Test23Lib.local7.field2);
Benchmark.test(32,Test23Lib.local8.field6);
Benchmark.test(33,Test23Lib.local8.field7);
Benchmark.test(34,Test23Lib.local8.field8);
Benchmark.test(35,Test23Lib.local8.field1);
Benchmark.test(36,Test23Lib.local8.field2);
Benchmark.test(37,Test23Lib.local9.field6);
Benchmark.test(38,Test23Lib.local9.field7);
Benchmark.test(39,Test23Lib.local9.field8);
Benchmark.test(40,Test23Lib.local9.field1);
Benchmark.test(41,Test23Lib.local9.field2);
Benchmark.test(42,Test23Lib.local10.field6);
Benchmark.test(43,Test23Lib.local10.field7);
Benchmark.test(44,Test23Lib.local10.field8);
Benchmark.test(45,Test23Lib.local10.field1);
Benchmark.test(46,Test23Lib.local10.field2);
Benchmark.test(47,Test23Lib.local11.field6);
Benchmark.test(48,Test23Lib.local11.field7);
Benchmark.test(49,Test23Lib.local11.field8);
Benchmark.test(50,Test23Lib.local11.field1);
Benchmark.test(51,Test23Lib.local11.field2);
Benchmark.print();
}
}
