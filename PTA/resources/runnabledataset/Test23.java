package runnabledataset;

import benchmark.tool.Benchmark;
import benchmark.tool.BasicClass;
class Test23Lib{
public static Test23Class1 local1;
public static Test23Class1 local2;
public static Test23Class1 local3;
public static Test23Class1 local4;
public static Test23Class1 local5;
public static Test23Class2 local6;
public static Test23Class2 local7;
public static Test23Class2 local8;
public static Test23Class3 local9;
public static Test23Class3 local10;
}
class Test23Class1 extends BasicClass {
public static Test23Class1 field1;
public Test23Class1 field2;
public Test23Class2 field3;
public static void method1(int depth) {
if (depth == 0) return;
field1.field1.method2(depth-1);
for (int local11 = 0; local11<=1; local11 += 1) {
if (depth>2) {
for (int local12 = 0; local12<=1; local12 += 1) {
for (int local13 = 0; local13<=2; local13 += 1) {
if (depth<=1) {
}else {
}
}
}
}else {
if (depth<2) {
if (depth<1) {
field1.field3=field1.field3;
}
}else {
if (depth>=4) {
if (depth==3) {
}
}
}
}
}
}
public static void method2(int depth) {
if (depth == 0) return;
field1.field2.method1(depth-1);
field1.field3.method4(field1.field3,field1.field1,depth-1);
field1.field2=field1;
if (depth>4) {
if (depth==1) {
for (int local14 = 0; local14<=0; local14 += 1) {
for (int local15 = 0; local15<=3; local15 += 1) {
field1.field2=field1.field3;
}
}
}else {
field1.field3.method1(depth-1);
}
}else {
if (depth<3) {
for (int local16 = 0; local16<=1; local16 += 1) {
for (int local17 = 0; local17<=2; local17 += 1) {
field1.field2=field1.field2;
}
}
}else {
for (int local18 = 0; local18<=2; local18 += 1) {
for (int local19 = 0; local19<=0; local19 += 1) {
field1.field1=field1.field3;
}
}
}
}
for (int local20 = 0; local20<=3; local20 += 1) {
if (depth>=1) {
if (depth<1) {
field1.field3.method4(field1.field3,field1.field1,depth-1);
}
}
}
}
public Test23Class2 method3(Test23Class3 arg0, int depth) {
if (depth == 0) return Test23Lib.local7;
for (int local21 = 0; local21<=2; local21 += 1) {
arg0=arg0;
}
arg0.method6(depth-1);
return arg0.field3;
}
}
class Test23Class2 extends Test23Class1 {
public Test23Class1 field4;
public Test23Class3 field5;
public Test23Class3 field6;
public Test23Class1 field7;
public static void method4(Test23Class2 arg0, Test23Class1 arg1, int depth) {
if (depth == 0) return;
for (int local22 = 0; local22<=1; local22 += 1) {
if (depth<2) {
arg1.field3=field1.field3;
}
}
arg1.field3=field1.field3;
arg1.field3=arg0;
arg0.field5.method5(arg0.field5,arg0,depth-1);
if (depth==1) {
arg0.field7=field1;
}else {
if (depth>4) {
for (int local23 = 0; local23<=3; local23 += 1) {
if (depth<=4) {
for (int local24 = 0; local24<=3; local24 += 1) {
}
}else {
if (depth>3) {
}else {
}
}
}
}
}
arg0.method4(arg0,field1.field3,depth-1);
}
}
class Test23Class3 extends Test23Class1 {
public Test23Class2 field8;
public Test23Class2 field9;
public static Test23Class1 method5(Test23Class3 arg0, Test23Class2 arg1, int depth) {
if (depth == 0) return Test23Lib.local1;
for (int local25 = 0; local25<=2; local25 += 1) {
for (int local26 = 0; local26<=3; local26 += 1) {
arg1.field1.method3(arg1.field6,depth-1);
}
}
for (int local27 = 0; local27<=0; local27 += 1) {
field1.field1=field1.field2;
}
arg1.field6=arg0;
for (int local28 = 0; local28<=0; local28 += 1) {
if (depth>=1) {
for (int local29 = 0; local29<=3; local29 += 1) {
if (depth>=2) {
arg0.field1=field1.field1;
}
}
}else {
field1.field2=field1.field1;
}
}
arg0=arg0;
if (depth==2) {
for (int local30 = 0; local30<=2; local30 += 1) {
field1=arg0.method5(arg1.field6,arg1,depth-1);
}
}else {
if (depth>1) {
arg1.field4=arg1.field5.method5(arg1.field5,arg1.field3,depth-1);
}
}
arg1.field3.method4(arg0.field9,field1,depth-1);
arg1.field4.method1(depth-1);
for (int local31 = 0; local31<=1; local31 += 1) {
for (int local32 = 0; local32<=2; local32 += 1) {
for (int local33 = 0; local33<=3; local33 += 1) {
if (depth>1) {
arg1=arg1;
}
}
}
}
return field1.field2;
}
public static void method6(int depth) {
if (depth == 0) return;
if (depth>=4) {
for (int local34 = 0; local34<=2; local34 += 1) {
if (depth==1) {
for (int local35 = 0; local35<=1; local35 += 1) {
for (int local36 = 0; local36<=0; local36 += 1) {
}
}
}else {
for (int local37 = 0; local37<=1; local37 += 1) {
for (int local38 = 0; local38<=3; local38 += 1) {
}
}
}
}
}else {
field1.field3.method4(field1.field3,field1.field2,depth-1);
}
field1.field3.method4(field1.field3,field1.field2,depth-1);
if (depth>=3) {
if (depth>1) {
field1.field3.method4(field1.field3,field1.field1,depth-1);
}
}
field1.field3.method4(field1.field3,field1,depth-1);
for (int local39 = 0; local39<=3; local39 += 1) {
if (depth==2) {
for (int local40 = 0; local40<=0; local40 += 1) {
if (depth>=4) {
field1.field3=field1.field3;
}else {
field1.field3=field1.field3;
}
}
}else {
field1.field1=field1.field2;
}
}
if (depth<=2) {
field1.field3.method4(field1.field3,field1.field1,depth-1);
}
for (int local41 = 0; local41<=2; local41 += 1) {
for (int local42 = 0; local42<=2; local42 += 1) {
for (int local43 = 0; local43<=2; local43 += 1) {
for (int local44 = 0; local44<=0; local44 += 1) {
if (depth>1) {
}else {
}
}
}
}
}
if (depth<2) {
for (int local45 = 0; local45<=2; local45 += 1) {
field1=field1.field1;
}
}
if (depth<1) {
field1.field3=field1.field3;
}else {
for (int local46 = 0; local46<=0; local46 += 1) {
if (depth>2) {
field1.field3=field1.field3;
}
}
}
}
}
public class Test23{
public static void main(String[] args) {
int inputValue = 10;
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
Test23Lib.local7 = new Test23Class2();
Benchmark.alloc(8);
Test23Lib.local8 = new Test23Class2();
Benchmark.alloc(9);
Test23Lib.local9 = new Test23Class3();
Benchmark.alloc(10);
Test23Lib.local10 = new Test23Class3();
Test23Lib.local1.field1 = Test23Lib.local2;
Test23Lib.local1.field2 = Test23Lib.local8;
Test23Lib.local1.field3 = Test23Lib.local6;
Test23Lib.local2.field1 = Test23Lib.local9;
Test23Lib.local2.field2 = Test23Lib.local5;
Test23Lib.local2.field3 = Test23Lib.local7;
Test23Lib.local3.field1 = Test23Lib.local4;
Test23Lib.local3.field2 = Test23Lib.local3;
Test23Lib.local3.field3 = Test23Lib.local7;
Test23Lib.local4.field1 = Test23Lib.local8;
Test23Lib.local4.field2 = Test23Lib.local3;
Test23Lib.local4.field3 = Test23Lib.local8;
Test23Lib.local5.field1 = Test23Lib.local5;
Test23Lib.local5.field2 = Test23Lib.local4;
Test23Lib.local5.field3 = Test23Lib.local6;
Test23Lib.local6.field4 = Test23Lib.local10;
Test23Lib.local6.field5 = Test23Lib.local10;
Test23Lib.local6.field6 = Test23Lib.local10;
Test23Lib.local6.field7 = Test23Lib.local5;
Test23Lib.local6.field1 = Test23Lib.local7;
Test23Lib.local6.field2 = Test23Lib.local8;
Test23Lib.local6.field3 = Test23Lib.local8;
Test23Lib.local7.field4 = Test23Lib.local2;
Test23Lib.local7.field5 = Test23Lib.local10;
Test23Lib.local7.field6 = Test23Lib.local9;
Test23Lib.local7.field7 = Test23Lib.local9;
Test23Lib.local7.field1 = Test23Lib.local10;
Test23Lib.local7.field2 = Test23Lib.local10;
Test23Lib.local7.field3 = Test23Lib.local7;
Test23Lib.local8.field4 = Test23Lib.local7;
Test23Lib.local8.field5 = Test23Lib.local9;
Test23Lib.local8.field6 = Test23Lib.local9;
Test23Lib.local8.field7 = Test23Lib.local5;
Test23Lib.local8.field1 = Test23Lib.local6;
Test23Lib.local8.field2 = Test23Lib.local7;
Test23Lib.local8.field3 = Test23Lib.local8;
Test23Lib.local9.field8 = Test23Lib.local7;
Test23Lib.local9.field9 = Test23Lib.local8;
Test23Lib.local9.field1 = Test23Lib.local10;
Test23Lib.local9.field2 = Test23Lib.local3;
Test23Lib.local9.field3 = Test23Lib.local8;
Test23Lib.local10.field8 = Test23Lib.local6;
Test23Lib.local10.field9 = Test23Lib.local6;
Test23Lib.local10.field1 = Test23Lib.local7;
Test23Lib.local10.field2 = Test23Lib.local1;
Test23Lib.local10.field3 = Test23Lib.local6;
Test23Lib.local7.field4=Test23Lib.local6.field2;
if (inputValue==4) {
if (inputValue<=3) {
Test23Lib.local9=Test23Lib.local7.field5;
}else {
for (int local47 = 0; local47<=2; local47 += 1) {
Test23Lib.local6.field3.method1(3);
}
}
}else {
Test23Lib.local6.field5.method6(3);
}
Test23Lib.local7.field1=Test23Lib.local1;
Test23Lib.local8.field6=Test23Lib.local6.field6;
Test23Lib.local10.field8=Test23Lib.local6;
Test23Lib.local4=Test23Lib.local4.field2.method3(Test23Lib.local7.field5,3);
Test23Lib.local7.field2=Test23Lib.local2;
for (int local48 = 0; local48<=1; local48 += 1) {
if (inputValue==4) {
if (inputValue<=4) {
if (inputValue<1) {
Test23Lib.local7.field6=Test23Lib.local8.field5;
}else {
for (int local49 = 0; local49<=2; local49 += 1) {
}
}
}
}else {
if (inputValue>=1) {
for (int local50 = 0; local50<=3; local50 += 1) {
Test23Lib.local7.field6=Test23Lib.local6.field5;
}
}
}
}
Test23Lib.local7.field7=Test23Lib.local2;
for (int local51 = 0; local51<=1; local51 += 1) {
Test23Lib.local9.field3.method4(Test23Lib.local5.field3,Test23Lib.local4.field1,3);
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
Benchmark.test(11,Test23Lib.local1.field1);
Benchmark.test(12,Test23Lib.local1.field2);
Benchmark.test(13,Test23Lib.local1.field3);
Benchmark.test(14,Test23Lib.local2.field1);
Benchmark.test(15,Test23Lib.local2.field2);
Benchmark.test(16,Test23Lib.local2.field3);
Benchmark.test(17,Test23Lib.local3.field1);
Benchmark.test(18,Test23Lib.local3.field2);
Benchmark.test(19,Test23Lib.local3.field3);
Benchmark.test(20,Test23Lib.local4.field1);
Benchmark.test(21,Test23Lib.local4.field2);
Benchmark.test(22,Test23Lib.local4.field3);
Benchmark.test(23,Test23Lib.local5.field1);
Benchmark.test(24,Test23Lib.local5.field2);
Benchmark.test(25,Test23Lib.local5.field3);
Benchmark.test(26,Test23Lib.local6.field4);
Benchmark.test(27,Test23Lib.local6.field5);
Benchmark.test(28,Test23Lib.local6.field6);
Benchmark.test(29,Test23Lib.local6.field7);
Benchmark.test(30,Test23Lib.local6.field1);
Benchmark.test(31,Test23Lib.local6.field2);
Benchmark.test(32,Test23Lib.local6.field3);
Benchmark.test(33,Test23Lib.local7.field4);
Benchmark.test(34,Test23Lib.local7.field5);
Benchmark.test(35,Test23Lib.local7.field6);
Benchmark.test(36,Test23Lib.local7.field7);
Benchmark.test(37,Test23Lib.local7.field1);
Benchmark.test(38,Test23Lib.local7.field2);
Benchmark.test(39,Test23Lib.local7.field3);
Benchmark.test(40,Test23Lib.local8.field4);
Benchmark.test(41,Test23Lib.local8.field5);
Benchmark.test(42,Test23Lib.local8.field6);
Benchmark.test(43,Test23Lib.local8.field7);
Benchmark.test(44,Test23Lib.local8.field1);
Benchmark.test(45,Test23Lib.local8.field2);
Benchmark.test(46,Test23Lib.local8.field3);
Benchmark.test(47,Test23Lib.local9.field8);
Benchmark.test(48,Test23Lib.local9.field9);
Benchmark.test(49,Test23Lib.local9.field1);
Benchmark.test(50,Test23Lib.local9.field2);
Benchmark.test(51,Test23Lib.local9.field3);
Benchmark.test(52,Test23Lib.local10.field8);
Benchmark.test(53,Test23Lib.local10.field9);
Benchmark.test(54,Test23Lib.local10.field1);
Benchmark.test(55,Test23Lib.local10.field2);
Benchmark.test(56,Test23Lib.local10.field3);
Benchmark.print();
}
}
