package runnabledataset;

import benchmark.tool.Benchmark;
import benchmark.tool.BasicClass;
class Test18Lib{
public static Test18Class1 local1;
public static Test18Class1 local2;
public static Test18Class1 local3;
public static Test18Class2 local4;
public static Test18Class2 local5;
public static Test18Class2 local6;
public static Test18Class3 local7;
public static Test18Class3 local8;
public static Test18Class3 local9;
public static Test18Class3 local10;
public static Test18Class3 local11;
}
class Test18Class1 extends BasicClass {
public Test18Class3 field1;
public static Test18Class2 field2;
public Test18Class1 field3;
public static void method1(int depth) {
if (depth == 0) return;
for (int local12 = 0; local12<=1; local12 += 1) {
if (depth>2) {
if (depth>2) {
for (int local13 = 0; local13<=3; local13 += 1) {
for (int local14 = 0; local14<=0; local14 += 1) {
}
}
}else {
for (int local15 = 0; local15<=3; local15 += 1) {
field2.field2=field2;
}
}
}
}
field2.field1.method7(depth-1);
field2.field4=field2;
field2.field3=field2.field2.method3(depth-1);
if (depth>4) {
field2.field3=field2.field2.method3(depth-1);
}
field2.field5=field2;
for (int local16 = 0; local16<=0; local16 += 1) {
for (int local17 = 0; local17<=2; local17 += 1) {
field2.field5=field2.field1.method6(depth-1);
}
}
if (depth<3) {
field2.field5=field2.field2;
}else {
for (int local18 = 0; local18<=0; local18 += 1) {
field2.field1.method4(field2.field1,field2.field1,depth-1);
}
}
if (depth>3) {
field2.field5=field2.field4;
}
}
}
class Test18Class2 extends Test18Class1 {
public static Test18Class2 field4;
public Test18Class1 field5;
public static void method2(Test18Class3 arg0, Test18Class2 arg1, int depth) {
if (depth == 0) return;
for (int local19 = 0; local19<=1; local19 += 1) {
arg0.field1.method5(arg0.field1,depth-1);
}
if (depth>=4) {
for (int local20 = 0; local20<=1; local20 += 1) {
if (depth<4) {
arg1.field1=arg0.field1.method7(depth-1);
}else {
for (int local21 = 0; local21<=2; local21 += 1) {
if (depth<=1) {
}else {
}
}
}
}
}else {
if (depth<=1) {
field2.field1.method5(field4,depth-1);
}
}
arg0.method5(arg0,depth-1);
for (int local22 = 0; local22<=2; local22 += 1) {
if (depth==1) {
for (int local23 = 0; local23<=3; local23 += 1) {
if (depth==4) {
field4.field5=arg0.field1.method7(depth-1);
}else {
arg0.field3=field4.method3(depth-1);
}
}
}
}
}
public static Test18Class1 method3(int depth) {
if (depth == 0) return Test18Lib.local11;
if (depth>2) {
if (depth==1) {
for (int local24 = 0; local24<=3; local24 += 1) {
for (int local25 = 0; local25<=1; local25 += 1) {
field4.field3=field4.method3(depth-1);
}
}
}
}else {
field2.field5=field2.field2;
}
return field2.field1;
}
}
class Test18Class3 extends Test18Class1 {
public static Test18Class1 field6;
public void method4(Test18Class3 arg0, Test18Class3 arg1, int depth) {
if (depth == 0) return;
this.field1.method5(this.field6,depth-1);
this.field3.method1(depth-1);
}
public void method5(Test18Class1 arg0, int depth) {
if (depth == 0) return;
for (int local26 = 0; local26<=1; local26 += 1) {
for (int local27 = 0; local27<=0; local27 += 1) {
for (int local28 = 0; local28<=1; local28 += 1) {
for (int local29 = 0; local29<=0; local29 += 1) {
arg0.field1=this.field1;
}
}
}
}
this.field6=arg0.field2;
for (int local30 = 0; local30<=1; local30 += 1) {
this.field2=arg0.field2;
}
if (depth<=1) {
for (int local31 = 0; local31<=0; local31 += 1) {
for (int local32 = 0; local32<=3; local32 += 1) {
for (int local33 = 0; local33<=1; local33 += 1) {
for (int local34 = 0; local34<=0; local34 += 1) {
}
}
}
}
}
}
public static Test18Class3 method6(int depth) {
if (depth == 0) return Test18Lib.local10;
for (int local35 = 0; local35<=1; local35 += 1) {
for (int local36 = 0; local36<=1; local36 += 1) {
field2.field2=field2.field4;
}
}
if (depth<3) {
for (int local37 = 0; local37<=1; local37 += 1) {
if (depth>=3) {
field2=field2.field2;
}
}
}else {
field6.field3=field2;
}
field2.field5=field6.field3;
return field2.field1;
}
public static Test18Class3 method7(int depth) {
if (depth == 0) return Test18Lib.local8;
if (depth<=4) {
field2.field4=field2;
}else {
if (depth>4) {
field2.field1=field6.field1.method6(depth-1);
}else {
field2.field2.method3(depth-1);
}
}
field2.field1.method5(field6.field3,depth-1);
if (depth<2) {
for (int local38 = 0; local38<=1; local38 += 1) {
for (int local39 = 0; local39<=2; local39 += 1) {
field6.field1.method5(field2.field2,depth-1);
}
}
}else {
field2.field1.method6(depth-1);
}
return field2.field1;
}
}
public class Test18{
public static void main(String[] args) {
int inputValue = 10;
Benchmark.alloc(1);
Test18Lib.local1 = new Test18Class1();
Benchmark.alloc(2);
Test18Lib.local2 = new Test18Class1();
Benchmark.alloc(3);
Test18Lib.local3 = new Test18Class1();
Benchmark.alloc(4);
Test18Lib.local4 = new Test18Class2();
Benchmark.alloc(5);
Test18Lib.local5 = new Test18Class2();
Benchmark.alloc(6);
Test18Lib.local6 = new Test18Class2();
Benchmark.alloc(7);
Test18Lib.local7 = new Test18Class3();
Benchmark.alloc(8);
Test18Lib.local8 = new Test18Class3();
Benchmark.alloc(9);
Test18Lib.local9 = new Test18Class3();
Benchmark.alloc(10);
Test18Lib.local10 = new Test18Class3();
Benchmark.alloc(11);
Test18Lib.local11 = new Test18Class3();
Test18Lib.local1.field1 = Test18Lib.local8;
Test18Lib.local1.field2 = Test18Lib.local4;
Test18Lib.local1.field3 = Test18Lib.local1;
Test18Lib.local2.field1 = Test18Lib.local7;
Test18Lib.local2.field2 = Test18Lib.local5;
Test18Lib.local2.field3 = Test18Lib.local3;
Test18Lib.local3.field1 = Test18Lib.local7;
Test18Lib.local3.field2 = Test18Lib.local6;
Test18Lib.local3.field3 = Test18Lib.local4;
Test18Lib.local4.field4 = Test18Lib.local4;
Test18Lib.local4.field5 = Test18Lib.local5;
Test18Lib.local4.field1 = Test18Lib.local11;
Test18Lib.local4.field2 = Test18Lib.local6;
Test18Lib.local4.field3 = Test18Lib.local2;
Test18Lib.local5.field4 = Test18Lib.local4;
Test18Lib.local5.field5 = Test18Lib.local9;
Test18Lib.local5.field1 = Test18Lib.local10;
Test18Lib.local5.field2 = Test18Lib.local5;
Test18Lib.local5.field3 = Test18Lib.local2;
Test18Lib.local6.field4 = Test18Lib.local6;
Test18Lib.local6.field5 = Test18Lib.local2;
Test18Lib.local6.field1 = Test18Lib.local9;
Test18Lib.local6.field2 = Test18Lib.local4;
Test18Lib.local6.field3 = Test18Lib.local10;
Test18Lib.local7.field6 = Test18Lib.local5;
Test18Lib.local7.field1 = Test18Lib.local10;
Test18Lib.local7.field2 = Test18Lib.local5;
Test18Lib.local7.field3 = Test18Lib.local11;
Test18Lib.local8.field6 = Test18Lib.local3;
Test18Lib.local8.field1 = Test18Lib.local10;
Test18Lib.local8.field2 = Test18Lib.local4;
Test18Lib.local8.field3 = Test18Lib.local1;
Test18Lib.local9.field6 = Test18Lib.local5;
Test18Lib.local9.field1 = Test18Lib.local10;
Test18Lib.local9.field2 = Test18Lib.local4;
Test18Lib.local9.field3 = Test18Lib.local1;
Test18Lib.local10.field6 = Test18Lib.local3;
Test18Lib.local10.field1 = Test18Lib.local9;
Test18Lib.local10.field2 = Test18Lib.local5;
Test18Lib.local10.field3 = Test18Lib.local2;
Test18Lib.local11.field6 = Test18Lib.local10;
Test18Lib.local11.field1 = Test18Lib.local7;
Test18Lib.local11.field2 = Test18Lib.local6;
Test18Lib.local11.field3 = Test18Lib.local2;
Test18Lib.local4=Test18Lib.local4.field4;
Test18Lib.local7.field6=Test18Lib.local6.method3(3);
for (int local40 = 0; local40<=3; local40 += 1) {
for (int local41 = 0; local41<=3; local41 += 1) {
for (int local42 = 0; local42<=2; local42 += 1) {
Test18Lib.local2.field1.method5(Test18Lib.local1.field2,3);
}
}
}
Test18Lib.local2=Test18Lib.local5.field4;
Test18Lib.local9.method6(3);
Test18Lib.local6.field2.method2(Test18Lib.local11.field1,Test18Lib.local1.field2,3);
Test18Lib.local9.field1.method5(Test18Lib.local2.field1,3);
Test18Lib.local2.field2=Test18Lib.local4.field4;
if (inputValue>3) {
Test18Lib.local5.field3=Test18Lib.local2.field2;
}
Test18Lib.local9.method7(3);
Benchmark.test(1,Test18Lib.local1);
Benchmark.test(2,Test18Lib.local2);
Benchmark.test(3,Test18Lib.local3);
Benchmark.test(4,Test18Lib.local4);
Benchmark.test(5,Test18Lib.local5);
Benchmark.test(6,Test18Lib.local6);
Benchmark.test(7,Test18Lib.local7);
Benchmark.test(8,Test18Lib.local8);
Benchmark.test(9,Test18Lib.local9);
Benchmark.test(10,Test18Lib.local10);
Benchmark.test(11,Test18Lib.local11);
Benchmark.test(12,Test18Lib.local1.field1);
Benchmark.test(13,Test18Lib.local1.field2);
Benchmark.test(14,Test18Lib.local1.field3);
Benchmark.test(15,Test18Lib.local2.field1);
Benchmark.test(16,Test18Lib.local2.field2);
Benchmark.test(17,Test18Lib.local2.field3);
Benchmark.test(18,Test18Lib.local3.field1);
Benchmark.test(19,Test18Lib.local3.field2);
Benchmark.test(20,Test18Lib.local3.field3);
Benchmark.test(21,Test18Lib.local4.field4);
Benchmark.test(22,Test18Lib.local4.field5);
Benchmark.test(23,Test18Lib.local4.field1);
Benchmark.test(24,Test18Lib.local4.field2);
Benchmark.test(25,Test18Lib.local4.field3);
Benchmark.test(26,Test18Lib.local5.field4);
Benchmark.test(27,Test18Lib.local5.field5);
Benchmark.test(28,Test18Lib.local5.field1);
Benchmark.test(29,Test18Lib.local5.field2);
Benchmark.test(30,Test18Lib.local5.field3);
Benchmark.test(31,Test18Lib.local6.field4);
Benchmark.test(32,Test18Lib.local6.field5);
Benchmark.test(33,Test18Lib.local6.field1);
Benchmark.test(34,Test18Lib.local6.field2);
Benchmark.test(35,Test18Lib.local6.field3);
Benchmark.test(36,Test18Lib.local7.field6);
Benchmark.test(37,Test18Lib.local7.field1);
Benchmark.test(38,Test18Lib.local7.field2);
Benchmark.test(39,Test18Lib.local7.field3);
Benchmark.test(40,Test18Lib.local8.field6);
Benchmark.test(41,Test18Lib.local8.field1);
Benchmark.test(42,Test18Lib.local8.field2);
Benchmark.test(43,Test18Lib.local8.field3);
Benchmark.test(44,Test18Lib.local9.field6);
Benchmark.test(45,Test18Lib.local9.field1);
Benchmark.test(46,Test18Lib.local9.field2);
Benchmark.test(47,Test18Lib.local9.field3);
Benchmark.test(48,Test18Lib.local10.field6);
Benchmark.test(49,Test18Lib.local10.field1);
Benchmark.test(50,Test18Lib.local10.field2);
Benchmark.test(51,Test18Lib.local10.field3);
Benchmark.test(52,Test18Lib.local11.field6);
Benchmark.test(53,Test18Lib.local11.field1);
Benchmark.test(54,Test18Lib.local11.field2);
Benchmark.test(55,Test18Lib.local11.field3);
Benchmark.print();
}
}
