package dataset;

import benchmark.internal.Benchmark;
import benchmark.tool.BasicClass;
class Test30Lib{
public static Test30Class1 local1;
public static Test30Class1 local2;
public static Test30Class1 local3;
public static Test30Class1 local4;
public static Test30Class1 local5;
public static Test30Class2 local6;
public static Test30Class2 local7;
public static Test30Class2 local8;
public static Test30Class2 local9;
public static Test30Class3 local10;
public static Test30Class3 local11;
}
class Test30Class1 extends BasicClass {
public Test30Class2 field1;
public Test30Class2 field2;
public Test30Class3 field3;
public static Test30Class2 field4;
public void method1(Test30Class3 arg0, int depth) {
if (depth == 0) return;
for (int local12 = 0; local12<=3; local12 += 1) {
if (depth>=2) {
arg0.field9=arg0.field1;
}else {
if (depth>2) {
if (depth<=1) {
for (int local13 = 0; local13<=0; local13 += 1) {
}
}
}else {
for (int local14 = 0; local14<=0; local14 += 1) {
if (depth<=2) {
}else {
}
}
}
}
}
for (int local15 = 0; local15<=1; local15 += 1) {
if (depth<3) {
if (depth<1) {
if (depth<1) {
for (int local16 = 0; local16<=2; local16 += 1) {
}
}else {
for (int local17 = 0; local17<=3; local17 += 1) {
}
}
}
}
}
arg0=arg0;
this.field3.method8(arg0.field9,arg0.field2,depth-1);
if (depth==4) {
for (int local18 = 0; local18<=2; local18 += 1) {
for (int local19 = 0; local19<=3; local19 += 1) {
this.field2=arg0.field2;
}
}
}
}
public static Test30Class2 method2(Test30Class2 arg0, int depth) {
if (depth == 0) return Test30Lib.local9;
for (int local20 = 0; local20<=1; local20 += 1) {
arg0.field7=field4.field2;
}
return field4.field4;
}
public static Test30Class2 method3(Test30Class3 arg0, Test30Class2 arg1, int depth) {
if (depth == 0) return Test30Lib.local9;
arg1.field6=field4.field6.method3(field4.field3,field4.field2,depth-1);
if (depth<=3) {
field4.field5=arg1;
}else {
field4.field7=arg1.field4;
}
arg1.field2=arg0.field2.method3(arg1.field3,field4.field8,depth-1);
if (depth==2) {
arg1.field3=arg1.field3;
}
return field4.field2;
}
}
class Test30Class2 extends Test30Class1 {
public static Test30Class1 field5;
public static Test30Class2 field6;
public Test30Class2 field7;
public Test30Class2 field8;
public void method4(int depth) {
if (depth == 0) return;
}
public static Test30Class1 method5(Test30Class1 arg0, Test30Class3 arg1, int depth) {
if (depth == 0) return Test30Lib.local6;
for (int local21 = 0; local21<=3; local21 += 1) {
for (int local22 = 0; local22<=1; local22 += 1) {
if (depth>3) {
field4.field1=field6.field8;
}else {
for (int local23 = 0; local23<=0; local23 += 1) {
arg1.field1.method1(field4.field3,depth-1);
}
}
}
}
for (int local24 = 0; local24<=1; local24 += 1) {
for (int local25 = 0; local25<=2; local25 += 1) {
for (int local26 = 0; local26<=3; local26 += 1) {
field5=field5.field2.method5(field5.field2,field5.field3,depth-1);
}
}
}
field5.field3.method7(arg1,depth-1);
if (depth<3) {
if (depth==4) {
if (depth>=2) {
for (int local27 = 0; local27<=2; local27 += 1) {
arg0.field4=arg1.field4.method3(arg0.field3,field6.field6,depth-1);
}
}else {
if (depth==3) {
for (int local28 = 0; local28<=2; local28 += 1) {
}
}
}
}
}
arg0.field1.method4(depth-1);
if (depth<=2) {
if (depth>2) {
arg1.method8(field6.field8,field6.field8,depth-1);
}else {
if (depth>1) {
arg1.field3.method6(depth-1);
}else {
field4=arg0.field2.method2(arg0.field1,depth-1);
}
}
}else {
arg1.field4.method4(depth-1);
}
field4.field3=arg1.field3;
field4.field5=field6;
return field6;
}
}
class Test30Class3 extends Test30Class1 {
public static Test30Class1 field9;
public static void method6(int depth) {
if (depth == 0) return;
if (depth<1) {
field9.field3=field9.field3;
}else {
field4.field3=field9.field3;
}
field4.field8.method1(field9.field3,depth-1);
if (depth==2) {
field9.field3=field9.field3;
}else {
for (int local29 = 0; local29<=3; local29 += 1) {
field4.field3.method9(field9.field1,depth-1);
}
}
for (int local30 = 0; local30<=1; local30 += 1) {
field9.field1.method4(depth-1);
}
for (int local31 = 0; local31<=2; local31 += 1) {
if (depth<4) {
for (int local32 = 0; local32<=0; local32 += 1) {
for (int local33 = 0; local33<=3; local33 += 1) {
field9=field4.field2;
}
}
}
}
if (depth>2) {
field9.field3.method9(field4.field2,depth-1);
}
field9.field2=field4;
field4.field7.method4(depth-1);
field4.field1.method4(depth-1);
}
public void method7(Test30Class3 arg0, int depth) {
if (depth == 0) return;
}
public void method8(Test30Class1 arg0, Test30Class2 arg1, int depth) {
if (depth == 0) return;
for (int local34 = 0; local34<=0; local34 += 1) {
if (depth<3) {
arg0.field3.method6(depth-1);
}
}
arg1.field4.method1(arg1.field3,depth-1);
this.field3=arg0.field3;
for (int local35 = 0; local35<=1; local35 += 1) {
arg1.field3=this.field3;
}
this.field3=this.field3;
arg0=this.field1;
}
public static void method9(Test30Class1 arg0, int depth) {
if (depth == 0) return;
for (int local36 = 0; local36<=2; local36 += 1) {
field4.field7.method1(arg0.field3,depth-1);
}
field9=field4.field7;
field4.field5=field4.field2;
for (int local37 = 0; local37<=1; local37 += 1) {
for (int local38 = 0; local38<=3; local38 += 1) {
for (int local39 = 0; local39<=2; local39 += 1) {
field4.field8=field4.field1;
}
}
}
if (depth>1) {
field9.field3.method8(field4.field8,field9.field2,depth-1);
}
if (depth<=3) {
arg0.field1=field4.field6;
}else {
if (depth>=2) {
arg0=field9.field3;
}else {
for (int local40 = 0; local40<=1; local40 += 1) {
field4.field5=arg0.field2.method5(field9.field2,arg0.field3,depth-1);
}
}
}
}
}
public class Test30{
public static void main(String[] args) {
int inputValue = 0;
Benchmark.alloc(1);
Test30Lib.local1 = new Test30Class1();
Benchmark.alloc(2);
Test30Lib.local2 = new Test30Class1();
Benchmark.alloc(3);
Test30Lib.local3 = new Test30Class1();
Benchmark.alloc(4);
Test30Lib.local4 = new Test30Class1();
Benchmark.alloc(5);
Test30Lib.local5 = new Test30Class1();
Benchmark.alloc(6);
Test30Lib.local6 = new Test30Class2();
Benchmark.alloc(7);
Test30Lib.local7 = new Test30Class2();
Benchmark.alloc(8);
Test30Lib.local8 = new Test30Class2();
Benchmark.alloc(9);
Test30Lib.local9 = new Test30Class2();
Benchmark.alloc(10);
Test30Lib.local10 = new Test30Class3();
Benchmark.alloc(11);
Test30Lib.local11 = new Test30Class3();
Test30Lib.local1.field1 = Test30Lib.local9;
Test30Lib.local1.field2 = Test30Lib.local8;
Test30Lib.local1.field3 = Test30Lib.local10;
Test30Lib.local1.field4 = Test30Lib.local6;
Test30Lib.local2.field1 = Test30Lib.local6;
Test30Lib.local2.field2 = Test30Lib.local7;
Test30Lib.local2.field3 = Test30Lib.local11;
Test30Lib.local2.field4 = Test30Lib.local6;
Test30Lib.local3.field1 = Test30Lib.local7;
Test30Lib.local3.field2 = Test30Lib.local7;
Test30Lib.local3.field3 = Test30Lib.local10;
Test30Lib.local3.field4 = Test30Lib.local8;
Test30Lib.local4.field1 = Test30Lib.local9;
Test30Lib.local4.field2 = Test30Lib.local7;
Test30Lib.local4.field3 = Test30Lib.local10;
Test30Lib.local4.field4 = Test30Lib.local9;
Test30Lib.local5.field1 = Test30Lib.local9;
Test30Lib.local5.field2 = Test30Lib.local9;
Test30Lib.local5.field3 = Test30Lib.local10;
Test30Lib.local5.field4 = Test30Lib.local9;
Test30Lib.local6.field5 = Test30Lib.local10;
Test30Lib.local6.field6 = Test30Lib.local6;
Test30Lib.local6.field7 = Test30Lib.local9;
Test30Lib.local6.field8 = Test30Lib.local8;
Test30Lib.local6.field1 = Test30Lib.local8;
Test30Lib.local6.field2 = Test30Lib.local6;
Test30Lib.local6.field3 = Test30Lib.local10;
Test30Lib.local6.field4 = Test30Lib.local6;
Test30Lib.local7.field5 = Test30Lib.local4;
Test30Lib.local7.field6 = Test30Lib.local7;
Test30Lib.local7.field7 = Test30Lib.local8;
Test30Lib.local7.field8 = Test30Lib.local7;
Test30Lib.local7.field1 = Test30Lib.local9;
Test30Lib.local7.field2 = Test30Lib.local9;
Test30Lib.local7.field3 = Test30Lib.local11;
Test30Lib.local7.field4 = Test30Lib.local9;
Test30Lib.local8.field5 = Test30Lib.local11;
Test30Lib.local8.field6 = Test30Lib.local6;
Test30Lib.local8.field7 = Test30Lib.local9;
Test30Lib.local8.field8 = Test30Lib.local6;
Test30Lib.local8.field1 = Test30Lib.local6;
Test30Lib.local8.field2 = Test30Lib.local8;
Test30Lib.local8.field3 = Test30Lib.local10;
Test30Lib.local8.field4 = Test30Lib.local8;
Test30Lib.local9.field5 = Test30Lib.local4;
Test30Lib.local9.field6 = Test30Lib.local6;
Test30Lib.local9.field7 = Test30Lib.local6;
Test30Lib.local9.field8 = Test30Lib.local9;
Test30Lib.local9.field1 = Test30Lib.local7;
Test30Lib.local9.field2 = Test30Lib.local8;
Test30Lib.local9.field3 = Test30Lib.local10;
Test30Lib.local9.field4 = Test30Lib.local8;
Test30Lib.local10.field9 = Test30Lib.local4;
Test30Lib.local10.field1 = Test30Lib.local9;
Test30Lib.local10.field2 = Test30Lib.local8;
Test30Lib.local10.field3 = Test30Lib.local11;
Test30Lib.local10.field4 = Test30Lib.local7;
Test30Lib.local11.field9 = Test30Lib.local10;
Test30Lib.local11.field1 = Test30Lib.local8;
Test30Lib.local11.field2 = Test30Lib.local7;
Test30Lib.local11.field3 = Test30Lib.local10;
Test30Lib.local11.field4 = Test30Lib.local7;
if (inputValue>1) {
Test30Lib.local7.field5.method1(Test30Lib.local7.field3,3);
}else {
Test30Lib.local6.field6=Test30Lib.local6.field7;
}
for (int local41 = 0; local41<=1; local41 += 1) {
for (int local42 = 0; local42<=2; local42 += 1) {
for (int local43 = 0; local43<=1; local43 += 1) {
if (inputValue<4) {
Test30Lib.local9.field2=Test30Lib.local8.field1.method3(Test30Lib.local11.field3,Test30Lib.local4.field2,3);
}
}
}
}
for (int local44 = 0; local44<=2; local44 += 1) {
if (inputValue>=4) {
Test30Lib.local7.field3=Test30Lib.local5.field3;
}
}
Test30Lib.local1=Test30Lib.local9.field6;
for (int local45 = 0; local45<=1; local45 += 1) {
Test30Lib.local7.field3=Test30Lib.local5.field3;
}
if (inputValue==3) {
if (inputValue<=4) {
for (int local46 = 0; local46<=3; local46 += 1) {
Test30Lib.local8.field5=Test30Lib.local6.field4;
}
}
}
Test30Lib.local7.field8=Test30Lib.local11.field4;
if (inputValue>=2) {
for (int local47 = 0; local47<=1; local47 += 1) {
Test30Lib.local11.field4=Test30Lib.local6.field6;
}
}
if (inputValue==3) {
Test30Lib.local8.field3.method7(Test30Lib.local6.field3,3);
}else {
Test30Lib.local11.field3=Test30Lib.local11.field3;
}
Test30Lib.local7.field7=Test30Lib.local4.field4.method2(Test30Lib.local8.field4,3);
Benchmark.test(1,Test30Lib.local1);
Benchmark.test(2,Test30Lib.local2);
Benchmark.test(3,Test30Lib.local3);
Benchmark.test(4,Test30Lib.local4);
Benchmark.test(5,Test30Lib.local5);
Benchmark.test(6,Test30Lib.local6);
Benchmark.test(7,Test30Lib.local7);
Benchmark.test(8,Test30Lib.local8);
Benchmark.test(9,Test30Lib.local9);
Benchmark.test(10,Test30Lib.local10);
Benchmark.test(11,Test30Lib.local11);
Benchmark.test(12,Test30Lib.local1.field1);
Benchmark.test(13,Test30Lib.local1.field2);
Benchmark.test(14,Test30Lib.local1.field3);
Benchmark.test(15,Test30Lib.local1.field4);
Benchmark.test(16,Test30Lib.local2.field1);
Benchmark.test(17,Test30Lib.local2.field2);
Benchmark.test(18,Test30Lib.local2.field3);
Benchmark.test(19,Test30Lib.local2.field4);
Benchmark.test(20,Test30Lib.local3.field1);
Benchmark.test(21,Test30Lib.local3.field2);
Benchmark.test(22,Test30Lib.local3.field3);
Benchmark.test(23,Test30Lib.local3.field4);
Benchmark.test(24,Test30Lib.local4.field1);
Benchmark.test(25,Test30Lib.local4.field2);
Benchmark.test(26,Test30Lib.local4.field3);
Benchmark.test(27,Test30Lib.local4.field4);
Benchmark.test(28,Test30Lib.local5.field1);
Benchmark.test(29,Test30Lib.local5.field2);
Benchmark.test(30,Test30Lib.local5.field3);
Benchmark.test(31,Test30Lib.local5.field4);
Benchmark.test(32,Test30Lib.local6.field5);
Benchmark.test(33,Test30Lib.local6.field6);
Benchmark.test(34,Test30Lib.local6.field7);
Benchmark.test(35,Test30Lib.local6.field8);
Benchmark.test(36,Test30Lib.local6.field1);
Benchmark.test(37,Test30Lib.local6.field2);
Benchmark.test(38,Test30Lib.local6.field3);
Benchmark.test(39,Test30Lib.local6.field4);
Benchmark.test(40,Test30Lib.local7.field5);
Benchmark.test(41,Test30Lib.local7.field6);
Benchmark.test(42,Test30Lib.local7.field7);
Benchmark.test(43,Test30Lib.local7.field8);
Benchmark.test(44,Test30Lib.local7.field1);
Benchmark.test(45,Test30Lib.local7.field2);
Benchmark.test(46,Test30Lib.local7.field3);
Benchmark.test(47,Test30Lib.local7.field4);
Benchmark.test(48,Test30Lib.local8.field5);
Benchmark.test(49,Test30Lib.local8.field6);
Benchmark.test(50,Test30Lib.local8.field7);
Benchmark.test(51,Test30Lib.local8.field8);
Benchmark.test(52,Test30Lib.local8.field1);
Benchmark.test(53,Test30Lib.local8.field2);
Benchmark.test(54,Test30Lib.local8.field3);
Benchmark.test(55,Test30Lib.local8.field4);
Benchmark.test(56,Test30Lib.local9.field5);
Benchmark.test(57,Test30Lib.local9.field6);
Benchmark.test(58,Test30Lib.local9.field7);
Benchmark.test(59,Test30Lib.local9.field8);
Benchmark.test(60,Test30Lib.local9.field1);
Benchmark.test(61,Test30Lib.local9.field2);
Benchmark.test(62,Test30Lib.local9.field3);
Benchmark.test(63,Test30Lib.local9.field4);
Benchmark.test(64,Test30Lib.local10.field9);
Benchmark.test(65,Test30Lib.local10.field1);
Benchmark.test(66,Test30Lib.local10.field2);
Benchmark.test(67,Test30Lib.local10.field3);
Benchmark.test(68,Test30Lib.local10.field4);
Benchmark.test(69,Test30Lib.local11.field9);
Benchmark.test(70,Test30Lib.local11.field1);
Benchmark.test(71,Test30Lib.local11.field2);
Benchmark.test(72,Test30Lib.local11.field3);
Benchmark.test(73,Test30Lib.local11.field4);
Benchmark.print();
}
}
