package runnabledataset;

import benchmark.tool.Benchmark;
import benchmark.tool.BasicClass;
class Test42Lib{
public static Test42Class1 local1;
public static Test42Class1 local2;
public static Test42Class1 local3;
public static Test42Class1 local4;
public static Test42Class1 local5;
public static Test42Class2 local6;
public static Test42Class3 local7;
public static Test42Class3 local8;
}
class Test42Class1 extends BasicClass {
public Test42Class1 field1;
public Test42Class3 field2;
public Test42Class1 field3;
public Test42Class2 field4;
public Test42Class1 field5;
public static Test42Class3 method1(Test42Class3 arg0, int depth) {
if (depth == 0) return Test42Lib.local7;
return arg0;
}
public static Test42Class2 method2(int depth) {
if (depth == 0) return Test42Lib.local6;
for (int local9 = 0; local9<=0; local9 += 1) {
if (depth<=1) {
if (depth>4) {
for (int local10 = 0; local10<=1; local10 += 1) {
if (depth==3) {
}else {
}
}
}else {
for (int local11 = 0; local11<=1; local11 += 1) {
if (depth>=1) {
}else {
}
}
}
}else {
for (int local12 = 0; local12<=2; local12 += 1) {
if (depth>4) {
if (depth==4) {
}
}else {
for (int local13 = 0; local13<=0; local13 += 1) {
}
}
}
}
}
if (depth>2) {
if (depth==1) {
for (int local14 = 0; local14<=2; local14 += 1) {
if (depth<=2) {
for (int local15 = 0; local15<=2; local15 += 1) {
}
}
}
}else {
for (int local16 = 0; local16<=2; local16 += 1) {
if (depth<2) {
if (depth>2) {
}
}else {
for (int local17 = 0; local17<=2; local17 += 1) {
}
}
}
}
}
return Test42Lib.local6;
}
public void method3(Test42Class2 arg0, int depth) {
if (depth == 0) return;
for (int local18 = 0; local18<=0; local18 += 1) {
for (int local19 = 0; local19<=2; local19 += 1) {
arg0.field5=arg0;
}
}
arg0.method6(depth-1);
}
public static void method4(int depth) {
if (depth == 0) return;
if (depth<1) {
for (int local20 = 0; local20<=3; local20 += 1) {
if (depth<4) {
if (depth<=1) {
for (int local21 = 0; local21<=1; local21 += 1) {
}
}
}else {
if (depth==2) {
if (depth==1) {
}else {
}
}else {
for (int local22 = 0; local22<=0; local22 += 1) {
}
}
}
}
}
}
}
class Test42Class2 extends Test42Class1 {
public Test42Class2 field6;
public static Test42Class1 field7;
public static void method5(int depth) {
if (depth == 0) return;
for (int local23 = 0; local23<=2; local23 += 1) {
for (int local24 = 0; local24<=0; local24 += 1) {
field7.field1=field7.field4.method2(depth-1);
}
}
for (int local25 = 0; local25<=3; local25 += 1) {
if (depth<4) {
field7.field4.method3(field7.field4,depth-1);
}else {
if (depth>3) {
if (depth>1) {
field7.field2=field7.field2;
}else {
field7.field4=field7.field4;
}
}
}
}
}
public void method6(int depth) {
if (depth == 0) return;
}
public static Test42Class3 method7(Test42Class2 arg0, Test42Class3 arg1, int depth) {
if (depth == 0) return Test42Lib.local7;
for (int local26 = 0; local26<=2; local26 += 1) {
for (int local27 = 0; local27<=0; local27 += 1) {
field7.field5=arg0.method7(arg1.field9,arg1.field2,depth-1);
}
}
return arg1;
}
}
class Test42Class3 extends Test42Class1 {
public static Test42Class3 field8;
public static Test42Class2 field9;
public static Test42Class1 field10;
public Test42Class2 method8(Test42Class2 arg0, int depth) {
if (depth == 0) return Test42Lib.local6;
for (int local28 = 0; local28<=1; local28 += 1) {
if (depth>4) {
for (int local29 = 0; local29<=1; local29 += 1) {
if (depth>3) {
if (depth>2) {
}else {
}
}else {
arg0.field4=arg0.field6;
}
}
}else {
arg0.field2=this;
}
}
return arg0.field4;
}
public void method9(Test42Class1 arg0, Test42Class3 arg1, int depth) {
if (depth == 0) return;
arg0.field1=this.field3.method2(depth-1);
}
}
public class Test42{
public static void main(String[] args) {
int inputValue = 10;
Benchmark.alloc(1);
Test42Lib.local1 = new Test42Class1();
Benchmark.alloc(2);
Test42Lib.local2 = new Test42Class1();
Benchmark.alloc(3);
Test42Lib.local3 = new Test42Class1();
Benchmark.alloc(4);
Test42Lib.local4 = new Test42Class1();
Benchmark.alloc(5);
Test42Lib.local5 = new Test42Class1();
Benchmark.alloc(6);
Test42Lib.local6 = new Test42Class2();
Benchmark.alloc(7);
Test42Lib.local7 = new Test42Class3();
Benchmark.alloc(8);
Test42Lib.local8 = new Test42Class3();
Test42Lib.local1.field1 = Test42Lib.local4;
Test42Lib.local1.field2 = Test42Lib.local7;
Test42Lib.local1.field3 = Test42Lib.local8;
Test42Lib.local1.field4 = Test42Lib.local6;
Test42Lib.local1.field5 = Test42Lib.local4;
Test42Lib.local2.field1 = Test42Lib.local4;
Test42Lib.local2.field2 = Test42Lib.local7;
Test42Lib.local2.field3 = Test42Lib.local3;
Test42Lib.local2.field4 = Test42Lib.local6;
Test42Lib.local2.field5 = Test42Lib.local2;
Test42Lib.local3.field1 = Test42Lib.local1;
Test42Lib.local3.field2 = Test42Lib.local8;
Test42Lib.local3.field3 = Test42Lib.local8;
Test42Lib.local3.field4 = Test42Lib.local6;
Test42Lib.local3.field5 = Test42Lib.local8;
Test42Lib.local4.field1 = Test42Lib.local8;
Test42Lib.local4.field2 = Test42Lib.local8;
Test42Lib.local4.field3 = Test42Lib.local4;
Test42Lib.local4.field4 = Test42Lib.local6;
Test42Lib.local4.field5 = Test42Lib.local3;
Test42Lib.local5.field1 = Test42Lib.local1;
Test42Lib.local5.field2 = Test42Lib.local8;
Test42Lib.local5.field3 = Test42Lib.local4;
Test42Lib.local5.field4 = Test42Lib.local6;
Test42Lib.local5.field5 = Test42Lib.local8;
Test42Lib.local6.field6 = Test42Lib.local6;
Test42Lib.local6.field7 = Test42Lib.local6;
Test42Lib.local6.field1 = Test42Lib.local6;
Test42Lib.local6.field2 = Test42Lib.local8;
Test42Lib.local6.field3 = Test42Lib.local5;
Test42Lib.local6.field4 = Test42Lib.local6;
Test42Lib.local6.field5 = Test42Lib.local5;
Test42Lib.local7.field8 = Test42Lib.local7;
Test42Lib.local7.field9 = Test42Lib.local6;
Test42Lib.local7.field10 = Test42Lib.local4;
Test42Lib.local7.field1 = Test42Lib.local5;
Test42Lib.local7.field2 = Test42Lib.local7;
Test42Lib.local7.field3 = Test42Lib.local3;
Test42Lib.local7.field4 = Test42Lib.local6;
Test42Lib.local7.field5 = Test42Lib.local2;
Test42Lib.local8.field8 = Test42Lib.local7;
Test42Lib.local8.field9 = Test42Lib.local6;
Test42Lib.local8.field10 = Test42Lib.local7;
Test42Lib.local8.field1 = Test42Lib.local6;
Test42Lib.local8.field2 = Test42Lib.local8;
Test42Lib.local8.field3 = Test42Lib.local2;
Test42Lib.local8.field4 = Test42Lib.local6;
Test42Lib.local8.field5 = Test42Lib.local1;
Test42Lib.local8.field9.method6(3);
Test42Lib.local5.field2=Test42Lib.local8.field8;
for (int local30 = 0; local30<=1; local30 += 1) {
Test42Lib.local8.field10=Test42Lib.local2.field5;
}
Benchmark.test(1,Test42Lib.local1);
Benchmark.test(2,Test42Lib.local2);
Benchmark.test(3,Test42Lib.local3);
Benchmark.test(4,Test42Lib.local4);
Benchmark.test(5,Test42Lib.local5);
Benchmark.test(6,Test42Lib.local6);
Benchmark.test(7,Test42Lib.local7);
Benchmark.test(8,Test42Lib.local8);
Benchmark.test(9,Test42Lib.local1.field1);
Benchmark.test(10,Test42Lib.local1.field2);
Benchmark.test(11,Test42Lib.local1.field3);
Benchmark.test(12,Test42Lib.local1.field4);
Benchmark.test(13,Test42Lib.local1.field5);
Benchmark.test(14,Test42Lib.local2.field1);
Benchmark.test(15,Test42Lib.local2.field2);
Benchmark.test(16,Test42Lib.local2.field3);
Benchmark.test(17,Test42Lib.local2.field4);
Benchmark.test(18,Test42Lib.local2.field5);
Benchmark.test(19,Test42Lib.local3.field1);
Benchmark.test(20,Test42Lib.local3.field2);
Benchmark.test(21,Test42Lib.local3.field3);
Benchmark.test(22,Test42Lib.local3.field4);
Benchmark.test(23,Test42Lib.local3.field5);
Benchmark.test(24,Test42Lib.local4.field1);
Benchmark.test(25,Test42Lib.local4.field2);
Benchmark.test(26,Test42Lib.local4.field3);
Benchmark.test(27,Test42Lib.local4.field4);
Benchmark.test(28,Test42Lib.local4.field5);
Benchmark.test(29,Test42Lib.local5.field1);
Benchmark.test(30,Test42Lib.local5.field2);
Benchmark.test(31,Test42Lib.local5.field3);
Benchmark.test(32,Test42Lib.local5.field4);
Benchmark.test(33,Test42Lib.local5.field5);
Benchmark.test(34,Test42Lib.local6.field6);
Benchmark.test(35,Test42Lib.local6.field7);
Benchmark.test(36,Test42Lib.local6.field1);
Benchmark.test(37,Test42Lib.local6.field2);
Benchmark.test(38,Test42Lib.local6.field3);
Benchmark.test(39,Test42Lib.local6.field4);
Benchmark.test(40,Test42Lib.local6.field5);
Benchmark.test(41,Test42Lib.local7.field8);
Benchmark.test(42,Test42Lib.local7.field9);
Benchmark.test(43,Test42Lib.local7.field10);
Benchmark.test(44,Test42Lib.local7.field1);
Benchmark.test(45,Test42Lib.local7.field2);
Benchmark.test(46,Test42Lib.local7.field3);
Benchmark.test(47,Test42Lib.local7.field4);
Benchmark.test(48,Test42Lib.local7.field5);
Benchmark.test(49,Test42Lib.local8.field8);
Benchmark.test(50,Test42Lib.local8.field9);
Benchmark.test(51,Test42Lib.local8.field10);
Benchmark.test(52,Test42Lib.local8.field1);
Benchmark.test(53,Test42Lib.local8.field2);
Benchmark.test(54,Test42Lib.local8.field3);
Benchmark.test(55,Test42Lib.local8.field4);
Benchmark.test(56,Test42Lib.local8.field5);
Benchmark.print();
}
}
