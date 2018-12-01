package runnabledataset;

import benchmark.tool.Benchmark;
import benchmark.tool.BasicClass;
class Test15Lib{
public static Test15Class1 local1;
public static Test15Class1 local2;
public static Test15Class1 local3;
public static Test15Class1 local4;
public static Test15Class1 local5;
public static Test15Class2 local6;
public static Test15Class2 local7;
public static Test15Class2 local8;
public static Test15Class2 local9;
public static Test15Class3 local10;
public static Test15Class3 local11;
public static Test15Class3 local12;
}
class Test15Class1 extends BasicClass {
public Test15Class2 field1;
public Test15Class2 field2;
public Test15Class3 field3;
public static void method1(int depth) {
if (depth == 0) return;
if (depth==2) {
if (depth>=1) {
for (int local13 = 0; local13<=3; local13 += 1) {
if (depth<=1) {
for (int local14 = 0; local14<=2; local14 += 1) {
}
}
}
}
}
if (depth>=4) {
if (depth<=1) {
if (depth==1) {
for (int local15 = 0; local15<=0; local15 += 1) {
if (depth<1) {
}else {
}
}
}
}else {
for (int local16 = 0; local16<=3; local16 += 1) {
for (int local17 = 0; local17<=3; local17 += 1) {
if (depth<2) {
}else {
}
}
}
}
}else {
if (depth>=4) {
for (int local18 = 0; local18<=1; local18 += 1) {
if (depth<=4) {
if (depth>4) {
}
}
}
}else {
for (int local19 = 0; local19<=3; local19 += 1) {
if (depth>=3) {
for (int local20 = 0; local20<=2; local20 += 1) {
}
}
}
}
}
}
}
class Test15Class2 extends Test15Class1 {
public Test15Class2 field4;
public Test15Class2 field5;
public void method2(int depth) {
if (depth == 0) return;
if (depth==3) {
this.field4=this.field4;
}
this.field2.method1(depth-1);
this.field5=this.field3;
this.field3.method3(this.field3,depth-1);
}
}
class Test15Class3 extends Test15Class2 {
public Test15Class2 field6;
public Test15Class1 field7;
public Test15Class2 field8;
public void method3(Test15Class3 arg0, int depth) {
if (depth == 0) return;
this.field4.method1(depth-1);
for (int local21 = 0; local21<=2; local21 += 1) {
if (depth<=2) {
this.field3=this.field3;
}else {
this.method3(arg0.field3,depth-1);
}
}
}
}
public class Test15{
public static void main(String[] args) {
int inputValue = 10;
Benchmark.alloc(1);
Test15Lib.local1 = new Test15Class1();
Benchmark.alloc(2);
Test15Lib.local2 = new Test15Class1();
Benchmark.alloc(3);
Test15Lib.local3 = new Test15Class1();
Benchmark.alloc(4);
Test15Lib.local4 = new Test15Class1();
Benchmark.alloc(5);
Test15Lib.local5 = new Test15Class1();
Benchmark.alloc(6);
Test15Lib.local6 = new Test15Class2();
Benchmark.alloc(7);
Test15Lib.local7 = new Test15Class2();
Benchmark.alloc(8);
Test15Lib.local8 = new Test15Class2();
Benchmark.alloc(9);
Test15Lib.local9 = new Test15Class2();
Benchmark.alloc(10);
Test15Lib.local10 = new Test15Class3();
Benchmark.alloc(11);
Test15Lib.local11 = new Test15Class3();
Benchmark.alloc(12);
Test15Lib.local12 = new Test15Class3();
Test15Lib.local1.field1 = Test15Lib.local7;
Test15Lib.local1.field2 = Test15Lib.local11;
Test15Lib.local1.field3 = Test15Lib.local11;
Test15Lib.local2.field1 = Test15Lib.local12;
Test15Lib.local2.field2 = Test15Lib.local12;
Test15Lib.local2.field3 = Test15Lib.local10;
Test15Lib.local3.field1 = Test15Lib.local6;
Test15Lib.local3.field2 = Test15Lib.local11;
Test15Lib.local3.field3 = Test15Lib.local10;
Test15Lib.local4.field1 = Test15Lib.local10;
Test15Lib.local4.field2 = Test15Lib.local10;
Test15Lib.local4.field3 = Test15Lib.local12;
Test15Lib.local5.field1 = Test15Lib.local8;
Test15Lib.local5.field2 = Test15Lib.local11;
Test15Lib.local5.field3 = Test15Lib.local10;
Test15Lib.local6.field4 = Test15Lib.local9;
Test15Lib.local6.field5 = Test15Lib.local11;
Test15Lib.local6.field1 = Test15Lib.local11;
Test15Lib.local6.field2 = Test15Lib.local9;
Test15Lib.local6.field3 = Test15Lib.local12;
Test15Lib.local7.field4 = Test15Lib.local10;
Test15Lib.local7.field5 = Test15Lib.local10;
Test15Lib.local7.field1 = Test15Lib.local8;
Test15Lib.local7.field2 = Test15Lib.local6;
Test15Lib.local7.field3 = Test15Lib.local12;
Test15Lib.local8.field4 = Test15Lib.local6;
Test15Lib.local8.field5 = Test15Lib.local9;
Test15Lib.local8.field1 = Test15Lib.local8;
Test15Lib.local8.field2 = Test15Lib.local10;
Test15Lib.local8.field3 = Test15Lib.local11;
Test15Lib.local9.field4 = Test15Lib.local8;
Test15Lib.local9.field5 = Test15Lib.local9;
Test15Lib.local9.field1 = Test15Lib.local10;
Test15Lib.local9.field2 = Test15Lib.local7;
Test15Lib.local9.field3 = Test15Lib.local12;
Test15Lib.local10.field6 = Test15Lib.local8;
Test15Lib.local10.field7 = Test15Lib.local10;
Test15Lib.local10.field8 = Test15Lib.local6;
Test15Lib.local10.field4 = Test15Lib.local8;
Test15Lib.local10.field5 = Test15Lib.local12;
Test15Lib.local10.field1 = Test15Lib.local8;
Test15Lib.local10.field2 = Test15Lib.local12;
Test15Lib.local10.field3 = Test15Lib.local10;
Test15Lib.local11.field6 = Test15Lib.local9;
Test15Lib.local11.field7 = Test15Lib.local6;
Test15Lib.local11.field8 = Test15Lib.local10;
Test15Lib.local11.field4 = Test15Lib.local12;
Test15Lib.local11.field5 = Test15Lib.local8;
Test15Lib.local11.field1 = Test15Lib.local7;
Test15Lib.local11.field2 = Test15Lib.local9;
Test15Lib.local11.field3 = Test15Lib.local11;
Test15Lib.local12.field6 = Test15Lib.local7;
Test15Lib.local12.field7 = Test15Lib.local5;
Test15Lib.local12.field8 = Test15Lib.local12;
Test15Lib.local12.field4 = Test15Lib.local12;
Test15Lib.local12.field5 = Test15Lib.local7;
Test15Lib.local12.field1 = Test15Lib.local10;
Test15Lib.local12.field2 = Test15Lib.local12;
Test15Lib.local12.field3 = Test15Lib.local12;
if (inputValue<=2) {
for (int local22 = 0; local22<=0; local22 += 1) {
for (int local23 = 0; local23<=1; local23 += 1) {
Test15Lib.local2.field3=Test15Lib.local4.field3;
}
}
}
for (int local24 = 0; local24<=0; local24 += 1) {
for (int local25 = 0; local25<=0; local25 += 1) {
for (int local26 = 0; local26<=2; local26 += 1) {
for (int local27 = 0; local27<=2; local27 += 1) {
Test15Lib.local9.field3.method2(3);
}
}
}
}
for (int local28 = 0; local28<=3; local28 += 1) {
Test15Lib.local5.field3=Test15Lib.local2.field3;
}
if (inputValue>4) {
if (inputValue<=1) {
for (int local29 = 0; local29<=0; local29 += 1) {
if (inputValue>4) {
for (int local30 = 0; local30<=3; local30 += 1) {
}
}else {
for (int local31 = 0; local31<=1; local31 += 1) {
}
}
}
}
}else {
for (int local32 = 0; local32<=0; local32 += 1) {
Test15Lib.local6.field5.method1(3);
}
}
if (inputValue<=2) {
Test15Lib.local12.field3=Test15Lib.local12.field3;
}else {
if (inputValue>4) {
Test15Lib.local12.field3=Test15Lib.local8.field3;
}else {
if (inputValue>=3) {
for (int local33 = 0; local33<=3; local33 += 1) {
for (int local34 = 0; local34<=3; local34 += 1) {
}
}
}else {
Test15Lib.local12.method2(3);
}
}
}
Benchmark.test(1,Test15Lib.local1);
Benchmark.test(2,Test15Lib.local2);
Benchmark.test(3,Test15Lib.local3);
Benchmark.test(4,Test15Lib.local4);
Benchmark.test(5,Test15Lib.local5);
Benchmark.test(6,Test15Lib.local6);
Benchmark.test(7,Test15Lib.local7);
Benchmark.test(8,Test15Lib.local8);
Benchmark.test(9,Test15Lib.local9);
Benchmark.test(10,Test15Lib.local10);
Benchmark.test(11,Test15Lib.local11);
Benchmark.test(12,Test15Lib.local12);
Benchmark.test(13,Test15Lib.local1.field1);
Benchmark.test(14,Test15Lib.local1.field2);
Benchmark.test(15,Test15Lib.local1.field3);
Benchmark.test(16,Test15Lib.local2.field1);
Benchmark.test(17,Test15Lib.local2.field2);
Benchmark.test(18,Test15Lib.local2.field3);
Benchmark.test(19,Test15Lib.local3.field1);
Benchmark.test(20,Test15Lib.local3.field2);
Benchmark.test(21,Test15Lib.local3.field3);
Benchmark.test(22,Test15Lib.local4.field1);
Benchmark.test(23,Test15Lib.local4.field2);
Benchmark.test(24,Test15Lib.local4.field3);
Benchmark.test(25,Test15Lib.local5.field1);
Benchmark.test(26,Test15Lib.local5.field2);
Benchmark.test(27,Test15Lib.local5.field3);
Benchmark.test(28,Test15Lib.local6.field4);
Benchmark.test(29,Test15Lib.local6.field5);
Benchmark.test(30,Test15Lib.local6.field1);
Benchmark.test(31,Test15Lib.local6.field2);
Benchmark.test(32,Test15Lib.local6.field3);
Benchmark.test(33,Test15Lib.local7.field4);
Benchmark.test(34,Test15Lib.local7.field5);
Benchmark.test(35,Test15Lib.local7.field1);
Benchmark.test(36,Test15Lib.local7.field2);
Benchmark.test(37,Test15Lib.local7.field3);
Benchmark.test(38,Test15Lib.local8.field4);
Benchmark.test(39,Test15Lib.local8.field5);
Benchmark.test(40,Test15Lib.local8.field1);
Benchmark.test(41,Test15Lib.local8.field2);
Benchmark.test(42,Test15Lib.local8.field3);
Benchmark.test(43,Test15Lib.local9.field4);
Benchmark.test(44,Test15Lib.local9.field5);
Benchmark.test(45,Test15Lib.local9.field1);
Benchmark.test(46,Test15Lib.local9.field2);
Benchmark.test(47,Test15Lib.local9.field3);
Benchmark.test(48,Test15Lib.local10.field6);
Benchmark.test(49,Test15Lib.local10.field7);
Benchmark.test(50,Test15Lib.local10.field8);
Benchmark.test(51,Test15Lib.local10.field4);
Benchmark.test(52,Test15Lib.local10.field5);
Benchmark.test(53,Test15Lib.local10.field1);
Benchmark.test(54,Test15Lib.local10.field2);
Benchmark.test(55,Test15Lib.local10.field3);
Benchmark.test(56,Test15Lib.local11.field6);
Benchmark.test(57,Test15Lib.local11.field7);
Benchmark.test(58,Test15Lib.local11.field8);
Benchmark.test(59,Test15Lib.local11.field4);
Benchmark.test(60,Test15Lib.local11.field5);
Benchmark.test(61,Test15Lib.local11.field1);
Benchmark.test(62,Test15Lib.local11.field2);
Benchmark.test(63,Test15Lib.local11.field3);
Benchmark.test(64,Test15Lib.local12.field6);
Benchmark.test(65,Test15Lib.local12.field7);
Benchmark.test(66,Test15Lib.local12.field8);
Benchmark.test(67,Test15Lib.local12.field4);
Benchmark.test(68,Test15Lib.local12.field5);
Benchmark.test(69,Test15Lib.local12.field1);
Benchmark.test(70,Test15Lib.local12.field2);
Benchmark.test(71,Test15Lib.local12.field3);
Benchmark.print();
}
}
