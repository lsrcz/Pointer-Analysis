package runnabledataset;

import benchmark.tool.Benchmark;
import benchmark.tool.BasicClass;
class Test12Lib{
public static Test12Class1 local1;
public static Test12Class1 local2;
public static Test12Class1 local3;
public static Test12Class1 local4;
public static Test12Class1 local5;
public static Test12Class2 local6;
public static Test12Class3 local7;
public static Test12Class3 local8;
public static Test12Class3 local9;
public static Test12Class3 local10;
public static Test12Class3 local11;
}
class Test12Class1 extends BasicClass {
public Test12Class1 field1;
public void method1(Test12Class3 arg0, int depth) {
if (depth == 0) return;
}
}
class Test12Class2 extends Test12Class1 {
public Test12Class3 field2;
public Test12Class2 field3;
public Test12Class2 field4;
public void method2(Test12Class2 arg0, Test12Class1 arg1, int depth) {
if (depth == 0) return;
arg0.field3.method3(depth-1);
this.method4(this.field1,depth-1);
if (depth>3) {
arg0.field3=arg0;
}else {
if (depth<3) {
for (int local12 = 0; local12<=3; local12 += 1) {
if (depth>2) {
for (int local13 = 0; local13<=2; local13 += 1) {
}
}
}
}else {
this.field4=this.field3;
}
}
}
public static void method3(int depth) {
if (depth == 0) return;
for (int local14 = 0; local14<=2; local14 += 1) {
for (int local15 = 0; local15<=0; local15 += 1) {
for (int local16 = 0; local16<=0; local16 += 1) {
if (depth<2) {
if (depth<=1) {
}
}else {
for (int local17 = 0; local17<=0; local17 += 1) {
}
}
}
}
}
if (depth<=1) {
if (depth<=2) {
for (int local18 = 0; local18<=2; local18 += 1) {
for (int local19 = 0; local19<=3; local19 += 1) {
for (int local20 = 0; local20<=0; local20 += 1) {
}
}
}
}else {
if (depth>1) {
for (int local21 = 0; local21<=1; local21 += 1) {
if (depth<=2) {
}
}
}else {
if (depth<2) {
for (int local22 = 0; local22<=1; local22 += 1) {
}
}else {
for (int local23 = 0; local23<=1; local23 += 1) {
}
}
}
}
}
}
public static void method4(Test12Class1 arg0, int depth) {
if (depth == 0) return;
if (depth<3) {
for (int local24 = 0; local24<=2; local24 += 1) {
if (depth<=1) {
for (int local25 = 0; local25<=0; local25 += 1) {
if (depth<=1) {
}else {
}
}
}else {
for (int local26 = 0; local26<=3; local26 += 1) {
if (depth<4) {
}
}
}
}
}else {
if (depth<=1) {
if (depth<=3) {
for (int local27 = 0; local27<=2; local27 += 1) {
if (depth==1) {
}else {
}
}
}else {
arg0.field1=arg0.field1;
}
}else {
if (depth>4) {
if (depth>2) {
for (int local28 = 0; local28<=3; local28 += 1) {
}
}
}
}
}
}
}
class Test12Class3 extends Test12Class1 {
public Test12Class1 field5;
public Test12Class3 field6;
public Test12Class3 field7;
public static void method5(Test12Class2 arg0, int depth) {
if (depth == 0) return;
for (int local29 = 0; local29<=3; local29 += 1) {
arg0.field3.method4(arg0.field1,depth-1);
}
arg0.field4.method4(arg0.field4,depth-1);
arg0.field2=arg0.field2;
}
}
public class Test12{
public static void main(String[] args) {
int inputValue = 10;
Benchmark.alloc(1);
Test12Lib.local1 = new Test12Class1();
Benchmark.alloc(2);
Test12Lib.local2 = new Test12Class1();
Benchmark.alloc(3);
Test12Lib.local3 = new Test12Class1();
Benchmark.alloc(4);
Test12Lib.local4 = new Test12Class1();
Benchmark.alloc(5);
Test12Lib.local5 = new Test12Class1();
Benchmark.alloc(6);
Test12Lib.local6 = new Test12Class2();
Benchmark.alloc(7);
Test12Lib.local7 = new Test12Class3();
Benchmark.alloc(8);
Test12Lib.local8 = new Test12Class3();
Benchmark.alloc(9);
Test12Lib.local9 = new Test12Class3();
Benchmark.alloc(10);
Test12Lib.local10 = new Test12Class3();
Benchmark.alloc(11);
Test12Lib.local11 = new Test12Class3();
Test12Lib.local1.field1 = Test12Lib.local11;
Test12Lib.local2.field1 = Test12Lib.local2;
Test12Lib.local3.field1 = Test12Lib.local1;
Test12Lib.local4.field1 = Test12Lib.local11;
Test12Lib.local5.field1 = Test12Lib.local2;
Test12Lib.local6.field2 = Test12Lib.local9;
Test12Lib.local6.field3 = Test12Lib.local6;
Test12Lib.local6.field4 = Test12Lib.local6;
Test12Lib.local6.field1 = Test12Lib.local6;
Test12Lib.local7.field5 = Test12Lib.local3;
Test12Lib.local7.field6 = Test12Lib.local7;
Test12Lib.local7.field7 = Test12Lib.local9;
Test12Lib.local7.field1 = Test12Lib.local3;
Test12Lib.local8.field5 = Test12Lib.local5;
Test12Lib.local8.field6 = Test12Lib.local7;
Test12Lib.local8.field7 = Test12Lib.local8;
Test12Lib.local8.field1 = Test12Lib.local2;
Test12Lib.local9.field5 = Test12Lib.local6;
Test12Lib.local9.field6 = Test12Lib.local11;
Test12Lib.local9.field7 = Test12Lib.local9;
Test12Lib.local9.field1 = Test12Lib.local7;
Test12Lib.local10.field5 = Test12Lib.local5;
Test12Lib.local10.field6 = Test12Lib.local9;
Test12Lib.local10.field7 = Test12Lib.local7;
Test12Lib.local10.field1 = Test12Lib.local3;
Test12Lib.local11.field5 = Test12Lib.local11;
Test12Lib.local11.field6 = Test12Lib.local9;
Test12Lib.local11.field7 = Test12Lib.local11;
Test12Lib.local11.field1 = Test12Lib.local6;
for (int local30 = 0; local30<=2; local30 += 1) {
if (inputValue<1) {
Test12Lib.local6.method2(Test12Lib.local6.field3,Test12Lib.local2.field1,3);
}
}
Test12Lib.local10.field6.method5(Test12Lib.local6,3);
Test12Lib.local9.field6=Test12Lib.local11;
if (inputValue<3) {
Test12Lib.local9.field5.method1(Test12Lib.local11.field7,3);
}
for (int local31 = 0; local31<=1; local31 += 1) {
for (int local32 = 0; local32<=3; local32 += 1) {
for (int local33 = 0; local33<=0; local33 += 1) {
for (int local34 = 0; local34<=1; local34 += 1) {
for (int local35 = 0; local35<=1; local35 += 1) {
}
}
}
}
}
Benchmark.test(1,Test12Lib.local1);
Benchmark.test(2,Test12Lib.local2);
Benchmark.test(3,Test12Lib.local3);
Benchmark.test(4,Test12Lib.local4);
Benchmark.test(5,Test12Lib.local5);
Benchmark.test(6,Test12Lib.local6);
Benchmark.test(7,Test12Lib.local7);
Benchmark.test(8,Test12Lib.local8);
Benchmark.test(9,Test12Lib.local9);
Benchmark.test(10,Test12Lib.local10);
Benchmark.test(11,Test12Lib.local11);
Benchmark.test(12,Test12Lib.local1.field1);
Benchmark.test(13,Test12Lib.local2.field1);
Benchmark.test(14,Test12Lib.local3.field1);
Benchmark.test(15,Test12Lib.local4.field1);
Benchmark.test(16,Test12Lib.local5.field1);
Benchmark.test(17,Test12Lib.local6.field2);
Benchmark.test(18,Test12Lib.local6.field3);
Benchmark.test(19,Test12Lib.local6.field4);
Benchmark.test(20,Test12Lib.local6.field1);
Benchmark.test(21,Test12Lib.local7.field5);
Benchmark.test(22,Test12Lib.local7.field6);
Benchmark.test(23,Test12Lib.local7.field7);
Benchmark.test(24,Test12Lib.local7.field1);
Benchmark.test(25,Test12Lib.local8.field5);
Benchmark.test(26,Test12Lib.local8.field6);
Benchmark.test(27,Test12Lib.local8.field7);
Benchmark.test(28,Test12Lib.local8.field1);
Benchmark.test(29,Test12Lib.local9.field5);
Benchmark.test(30,Test12Lib.local9.field6);
Benchmark.test(31,Test12Lib.local9.field7);
Benchmark.test(32,Test12Lib.local9.field1);
Benchmark.test(33,Test12Lib.local10.field5);
Benchmark.test(34,Test12Lib.local10.field6);
Benchmark.test(35,Test12Lib.local10.field7);
Benchmark.test(36,Test12Lib.local10.field1);
Benchmark.test(37,Test12Lib.local11.field5);
Benchmark.test(38,Test12Lib.local11.field6);
Benchmark.test(39,Test12Lib.local11.field7);
Benchmark.test(40,Test12Lib.local11.field1);
Benchmark.print();
}
}
