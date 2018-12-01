package runnabledataset;

import benchmark.tool.Benchmark;
import benchmark.tool.BasicClass;
class Test9Lib{
public static Test9Class1 local1;
public static Test9Class2 local2;
public static Test9Class2 local3;
public static Test9Class2 local4;
public static Test9Class2 local5;
public static Test9Class3 local6;
public static Test9Class3 local7;
public static Test9Class3 local8;
public static Test9Class3 local9;
}
class Test9Class1 extends BasicClass {
public Test9Class3 field1;
public Test9Class2 field2;
public static void method1(int depth) {
if (depth == 0) return;
if (depth==2) {
for (int local10 = 0; local10<=1; local10 += 1) {
for (int local11 = 0; local11<=2; local11 += 1) {
if (depth>2) {
if (depth>1) {
}
}else {
if (depth>4) {
}
}
}
}
}
if (depth<=2) {
if (depth<=3) {
for (int local12 = 0; local12<=2; local12 += 1) {
if (depth<=3) {
if (depth==2) {
}
}
}
}else {
if (depth<1) {
for (int local13 = 0; local13<=3; local13 += 1) {
if (depth<=1) {
}
}
}
}
}else {
for (int local14 = 0; local14<=2; local14 += 1) {
if (depth>=3) {
for (int local15 = 0; local15<=3; local15 += 1) {
if (depth>=1) {
}else {
}
}
}
}
}
}
public static Test9Class2 method2(int depth) {
if (depth == 0) return Test9Lib.local2;
return Test9Lib.local5;
}
}
class Test9Class2 extends Test9Class1 {
public Test9Class3 field3;
public Test9Class3 field4;
public static void method3(Test9Class1 arg0, int depth) {
if (depth == 0) return;
if (depth<3) {
arg0.field2=arg0.field2;
}
}
}
class Test9Class3 extends Test9Class1 {
public Test9Class2 field5;
public Test9Class3 field6;
public Test9Class3 field7;
public static void method4(Test9Class3 arg0, Test9Class3 arg1, int depth) {
if (depth == 0) return;
}
public void method5(Test9Class3 arg0, Test9Class1 arg1, int depth) {
if (depth == 0) return;
if (depth==1) {
arg1.field2=arg0.field1.method2(depth-1);
}else {
for (int local16 = 0; local16<=2; local16 += 1) {
for (int local17 = 0; local17<=1; local17 += 1) {
if (depth<3) {
if (depth<1) {
}
}
}
}
}
}
}
public class Test9{
public static void main(String[] args) {
int inputValue = 10;
Benchmark.alloc(1);
Test9Lib.local1 = new Test9Class1();
Benchmark.alloc(2);
Test9Lib.local2 = new Test9Class2();
Benchmark.alloc(3);
Test9Lib.local3 = new Test9Class2();
Benchmark.alloc(4);
Test9Lib.local4 = new Test9Class2();
Benchmark.alloc(5);
Test9Lib.local5 = new Test9Class2();
Benchmark.alloc(6);
Test9Lib.local6 = new Test9Class3();
Benchmark.alloc(7);
Test9Lib.local7 = new Test9Class3();
Benchmark.alloc(8);
Test9Lib.local8 = new Test9Class3();
Benchmark.alloc(9);
Test9Lib.local9 = new Test9Class3();
Test9Lib.local1.field1 = Test9Lib.local9;
Test9Lib.local1.field2 = Test9Lib.local2;
Test9Lib.local2.field3 = Test9Lib.local7;
Test9Lib.local2.field4 = Test9Lib.local9;
Test9Lib.local2.field1 = Test9Lib.local9;
Test9Lib.local2.field2 = Test9Lib.local5;
Test9Lib.local3.field3 = Test9Lib.local8;
Test9Lib.local3.field4 = Test9Lib.local9;
Test9Lib.local3.field1 = Test9Lib.local9;
Test9Lib.local3.field2 = Test9Lib.local4;
Test9Lib.local4.field3 = Test9Lib.local8;
Test9Lib.local4.field4 = Test9Lib.local8;
Test9Lib.local4.field1 = Test9Lib.local6;
Test9Lib.local4.field2 = Test9Lib.local5;
Test9Lib.local5.field3 = Test9Lib.local7;
Test9Lib.local5.field4 = Test9Lib.local6;
Test9Lib.local5.field1 = Test9Lib.local6;
Test9Lib.local5.field2 = Test9Lib.local3;
Test9Lib.local6.field5 = Test9Lib.local5;
Test9Lib.local6.field6 = Test9Lib.local6;
Test9Lib.local6.field7 = Test9Lib.local7;
Test9Lib.local6.field1 = Test9Lib.local6;
Test9Lib.local6.field2 = Test9Lib.local2;
Test9Lib.local7.field5 = Test9Lib.local4;
Test9Lib.local7.field6 = Test9Lib.local7;
Test9Lib.local7.field7 = Test9Lib.local7;
Test9Lib.local7.field1 = Test9Lib.local9;
Test9Lib.local7.field2 = Test9Lib.local2;
Test9Lib.local8.field5 = Test9Lib.local3;
Test9Lib.local8.field6 = Test9Lib.local7;
Test9Lib.local8.field7 = Test9Lib.local8;
Test9Lib.local8.field1 = Test9Lib.local8;
Test9Lib.local8.field2 = Test9Lib.local3;
Test9Lib.local9.field5 = Test9Lib.local5;
Test9Lib.local9.field6 = Test9Lib.local8;
Test9Lib.local9.field7 = Test9Lib.local7;
Test9Lib.local9.field1 = Test9Lib.local6;
Test9Lib.local9.field2 = Test9Lib.local3;
for (int local18 = 0; local18<=0; local18 += 1) {
for (int local19 = 0; local19<=2; local19 += 1) {
if (inputValue>=4) {
Test9Lib.local6.field6.method1(3);
}else {
for (int local20 = 0; local20<=2; local20 += 1) {
Test9Lib.local7.field5.method1(3);
}
}
}
}
for (int local21 = 0; local21<=1; local21 += 1) {
Test9Lib.local7.method5(Test9Lib.local9.field6,Test9Lib.local1.field2,3);
}
for (int local22 = 0; local22<=1; local22 += 1) {
for (int local23 = 0; local23<=2; local23 += 1) {
if (inputValue<=3) {
Test9Lib.local9.field6.method2(3);
}else {
Test9Lib.local4.field3=Test9Lib.local5.field3;
}
}
}
Test9Lib.local4=Test9Lib.local9.field5;
for (int local24 = 0; local24<=1; local24 += 1) {
if (inputValue>1) {
for (int local25 = 0; local25<=0; local25 += 1) {
for (int local26 = 0; local26<=2; local26 += 1) {
Test9Lib.local6.field5=Test9Lib.local5;
}
}
}else {
for (int local27 = 0; local27<=1; local27 += 1) {
if (inputValue>2) {
for (int local28 = 0; local28<=0; local28 += 1) {
}
}else {
Test9Lib.local7.field5.method3(Test9Lib.local3.field2,3);
}
}
}
}
Benchmark.test(1,Test9Lib.local1);
Benchmark.test(2,Test9Lib.local2);
Benchmark.test(3,Test9Lib.local3);
Benchmark.test(4,Test9Lib.local4);
Benchmark.test(5,Test9Lib.local5);
Benchmark.test(6,Test9Lib.local6);
Benchmark.test(7,Test9Lib.local7);
Benchmark.test(8,Test9Lib.local8);
Benchmark.test(9,Test9Lib.local9);
Benchmark.test(10,Test9Lib.local1.field1);
Benchmark.test(11,Test9Lib.local1.field2);
Benchmark.test(12,Test9Lib.local2.field3);
Benchmark.test(13,Test9Lib.local2.field4);
Benchmark.test(14,Test9Lib.local2.field1);
Benchmark.test(15,Test9Lib.local2.field2);
Benchmark.test(16,Test9Lib.local3.field3);
Benchmark.test(17,Test9Lib.local3.field4);
Benchmark.test(18,Test9Lib.local3.field1);
Benchmark.test(19,Test9Lib.local3.field2);
Benchmark.test(20,Test9Lib.local4.field3);
Benchmark.test(21,Test9Lib.local4.field4);
Benchmark.test(22,Test9Lib.local4.field1);
Benchmark.test(23,Test9Lib.local4.field2);
Benchmark.test(24,Test9Lib.local5.field3);
Benchmark.test(25,Test9Lib.local5.field4);
Benchmark.test(26,Test9Lib.local5.field1);
Benchmark.test(27,Test9Lib.local5.field2);
Benchmark.test(28,Test9Lib.local6.field5);
Benchmark.test(29,Test9Lib.local6.field6);
Benchmark.test(30,Test9Lib.local6.field7);
Benchmark.test(31,Test9Lib.local6.field1);
Benchmark.test(32,Test9Lib.local6.field2);
Benchmark.test(33,Test9Lib.local7.field5);
Benchmark.test(34,Test9Lib.local7.field6);
Benchmark.test(35,Test9Lib.local7.field7);
Benchmark.test(36,Test9Lib.local7.field1);
Benchmark.test(37,Test9Lib.local7.field2);
Benchmark.test(38,Test9Lib.local8.field5);
Benchmark.test(39,Test9Lib.local8.field6);
Benchmark.test(40,Test9Lib.local8.field7);
Benchmark.test(41,Test9Lib.local8.field1);
Benchmark.test(42,Test9Lib.local8.field2);
Benchmark.test(43,Test9Lib.local9.field5);
Benchmark.test(44,Test9Lib.local9.field6);
Benchmark.test(45,Test9Lib.local9.field7);
Benchmark.test(46,Test9Lib.local9.field1);
Benchmark.test(47,Test9Lib.local9.field2);
Benchmark.print();
}
}
