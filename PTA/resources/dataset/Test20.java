package dataset;

import benchmark.internal.Benchmark;
import benchmark.tool.BasicClass;
class Test20Lib{
public static Test20Class1 local1;
public static Test20Class1 local2;
public static Test20Class1 local3;
public static Test20Class1 local4;
public static Test20Class1 local5;
public static Test20Class2 local6;
public static Test20Class2 local7;
public static Test20Class2 local8;
public static Test20Class2 local9;
public static Test20Class2 local10;
public static Test20Class3 local11;
public static Test20Class3 local12;
public static Test20Class3 local13;
public static Test20Class3 local14;
}
class Test20Class1 extends BasicClass {
public static Test20Class2 field1;
public static Test20Class1 method1(Test20Class1 arg0, Test20Class1 arg1, int depth) {
if (depth == 0) return Test20Lib.local13;
return field1.field2;
}
}
class Test20Class2 extends Test20Class1 {
public static Test20Class2 field2;
public static Test20Class1 field3;
public static Test20Class1 field4;
public Test20Class2 field5;
public static Test20Class3 method2(int depth) {
if (depth == 0) return Test20Lib.local12;
field2=field4.field1;
if (depth>=3) {
for (int local15 = 0; local15<=2; local15 += 1) {
for (int local16 = 0; local16<=0; local16 += 1) {
field3.field1=field2;
}
}
}else {
for (int local17 = 0; local17<=3; local17 += 1) {
for (int local18 = 0; local18<=1; local18 += 1) {
if (depth==2) {
field2.field1.method2(depth-1);
}
}
}
}
field3.field1.method3(depth-1);
return Test20Lib.local11;
}
public Test20Class2 method3(int depth) {
if (depth == 0) return Test20Lib.local14;
this.field3=this.field5;
this.field2.method5(depth-1);
if (depth==2) {
this.field1=this.field2.method3(depth-1);
}
return this;
}
public static void method4(Test20Class1 arg0, Test20Class2 arg1, int depth) {
if (depth == 0) return;
if (depth==1) {
if (depth==3) {
arg0.field1.method4(arg0,field2.field5,depth-1);
}
}
if (depth==4) {
field2.field3=field1.field5.method1(arg1.field4,arg1.field1,depth-1);
}else {
for (int local19 = 0; local19<=3; local19 += 1) {
if (depth==2) {
field2.field4=field4.field1;
}
}
}
field4.field1=field2.field1.method3(depth-1);
field3=field1.field4;
if (depth>3) {
for (int local20 = 0; local20<=3; local20 += 1) {
for (int local21 = 0; local21<=2; local21 += 1) {
field1.field3=field1.field3;
}
}
}
if (depth==2) {
field2=arg0.field1;
}else {
for (int local22 = 0; local22<=3; local22 += 1) {
for (int local23 = 0; local23<=3; local23 += 1) {
for (int local24 = 0; local24<=2; local24 += 1) {
if (depth<=4) {
}else {
}
}
}
}
}
}
public static void method5(int depth) {
if (depth == 0) return;
for (int local25 = 0; local25<=2; local25 += 1) {
for (int local26 = 0; local26<=3; local26 += 1) {
if (depth>=1) {
for (int local27 = 0; local27<=2; local27 += 1) {
for (int local28 = 0; local28<=1; local28 += 1) {
}
}
}
}
}
for (int local29 = 0; local29<=3; local29 += 1) {
if (depth>=1) {
field2=field3.field1;
}else {
field3.field1.method2(depth-1);
}
}
field1.field5=field1.field5;
for (int local30 = 0; local30<=2; local30 += 1) {
for (int local31 = 0; local31<=1; local31 += 1) {
field1.field1=field4.field1.method2(depth-1);
}
}
if (depth<=2) {
for (int local32 = 0; local32<=3; local32 += 1) {
if (depth>4) {
for (int local33 = 0; local33<=3; local33 += 1) {
for (int local34 = 0; local34<=1; local34 += 1) {
}
}
}
}
}
field1.field2=field1;
field2.field4=field1.field5;
if (depth<1) {
for (int local35 = 0; local35<=2; local35 += 1) {
for (int local36 = 0; local36<=1; local36 += 1) {
field1.method5(depth-1);
}
}
}else {
field1.field5.method5(depth-1);
}
if (depth>1) {
for (int local37 = 0; local37<=0; local37 += 1) {
if (depth==4) {
field3=field1.field1.method1(field1,field1.field1,depth-1);
}
}
}else {
for (int local38 = 0; local38<=3; local38 += 1) {
field2.field3=field1;
}
}
}
}
class Test20Class3 extends Test20Class2 {
public static Test20Class2 field6;
public Test20Class1 method6(Test20Class3 arg0, int depth) {
if (depth == 0) return Test20Lib.local7;
if (depth==4) {
if (depth<2) {
arg0=this;
}
}else {
if (depth>3) {
arg0=arg0;
}
}
arg0=this;
return this.field4;
}
public static void method7(Test20Class3 arg0, Test20Class3 arg1, int depth) {
if (depth == 0) return;
if (depth==3) {
if (depth==4) {
if (depth<=2) {
if (depth<=4) {
arg0.field1=field2;
}
}
}
}else {
if (depth>=4) {
if (depth>4) {
arg1.field4=field1.field3;
}else {
if (depth>=1) {
field2.field3=arg1.field1;
}
}
}
}
for (int local39 = 0; local39<=2; local39 += 1) {
field6.field4=arg0.field2.method2(depth-1);
}
if (depth<=4) {
arg1.field6=arg1.field5;
}else {
for (int local40 = 0; local40<=3; local40 += 1) {
field6.method2(depth-1);
}
}
if (depth<=3) {
field6.field3=arg1.field2;
}else {
field3=arg1.method6(arg1,depth-1);
}
if (depth>3) {
for (int local41 = 0; local41<=3; local41 += 1) {
for (int local42 = 0; local42<=1; local42 += 1) {
if (depth<1) {
field6.field3=arg1.field6;
}
}
}
}else {
if (depth>=2) {
arg1.field5=arg0.field1;
}else {
if (depth>4) {
for (int local43 = 0; local43<=0; local43 += 1) {
for (int local44 = 0; local44<=3; local44 += 1) {
}
}
}else {
field1.field5=field3.field1.method3(depth-1);
}
}
}
field6.field2=arg0.field5;
}
}
public class Test20{
public static void main(String[] args) {
int inputValue = 0;
Benchmark.alloc(1);
Test20Lib.local1 = new Test20Class1();
Benchmark.alloc(2);
Test20Lib.local2 = new Test20Class1();
Benchmark.alloc(3);
Test20Lib.local3 = new Test20Class1();
Benchmark.alloc(4);
Test20Lib.local4 = new Test20Class1();
Benchmark.alloc(5);
Test20Lib.local5 = new Test20Class1();
Benchmark.alloc(6);
Test20Lib.local6 = new Test20Class2();
Benchmark.alloc(7);
Test20Lib.local7 = new Test20Class2();
Benchmark.alloc(8);
Test20Lib.local8 = new Test20Class2();
Benchmark.alloc(9);
Test20Lib.local9 = new Test20Class2();
Benchmark.alloc(10);
Test20Lib.local10 = new Test20Class2();
Benchmark.alloc(11);
Test20Lib.local11 = new Test20Class3();
Benchmark.alloc(12);
Test20Lib.local12 = new Test20Class3();
Benchmark.alloc(13);
Test20Lib.local13 = new Test20Class3();
Benchmark.alloc(14);
Test20Lib.local14 = new Test20Class3();
Test20Lib.local1.field1 = Test20Lib.local7;
Test20Lib.local2.field1 = Test20Lib.local11;
Test20Lib.local3.field1 = Test20Lib.local10;
Test20Lib.local4.field1 = Test20Lib.local13;
Test20Lib.local5.field1 = Test20Lib.local6;
Test20Lib.local6.field2 = Test20Lib.local10;
Test20Lib.local6.field3 = Test20Lib.local14;
Test20Lib.local6.field4 = Test20Lib.local9;
Test20Lib.local6.field5 = Test20Lib.local14;
Test20Lib.local6.field1 = Test20Lib.local8;
Test20Lib.local7.field2 = Test20Lib.local10;
Test20Lib.local7.field3 = Test20Lib.local9;
Test20Lib.local7.field4 = Test20Lib.local7;
Test20Lib.local7.field5 = Test20Lib.local9;
Test20Lib.local7.field1 = Test20Lib.local14;
Test20Lib.local8.field2 = Test20Lib.local6;
Test20Lib.local8.field3 = Test20Lib.local3;
Test20Lib.local8.field4 = Test20Lib.local10;
Test20Lib.local8.field5 = Test20Lib.local9;
Test20Lib.local8.field1 = Test20Lib.local9;
Test20Lib.local9.field2 = Test20Lib.local10;
Test20Lib.local9.field3 = Test20Lib.local14;
Test20Lib.local9.field4 = Test20Lib.local5;
Test20Lib.local9.field5 = Test20Lib.local14;
Test20Lib.local9.field1 = Test20Lib.local14;
Test20Lib.local10.field2 = Test20Lib.local14;
Test20Lib.local10.field3 = Test20Lib.local11;
Test20Lib.local10.field4 = Test20Lib.local4;
Test20Lib.local10.field5 = Test20Lib.local9;
Test20Lib.local10.field1 = Test20Lib.local12;
Test20Lib.local11.field6 = Test20Lib.local11;
Test20Lib.local11.field2 = Test20Lib.local6;
Test20Lib.local11.field3 = Test20Lib.local3;
Test20Lib.local11.field4 = Test20Lib.local8;
Test20Lib.local11.field5 = Test20Lib.local11;
Test20Lib.local11.field1 = Test20Lib.local10;
Test20Lib.local12.field6 = Test20Lib.local9;
Test20Lib.local12.field2 = Test20Lib.local10;
Test20Lib.local12.field3 = Test20Lib.local5;
Test20Lib.local12.field4 = Test20Lib.local9;
Test20Lib.local12.field5 = Test20Lib.local9;
Test20Lib.local12.field1 = Test20Lib.local8;
Test20Lib.local13.field6 = Test20Lib.local6;
Test20Lib.local13.field2 = Test20Lib.local7;
Test20Lib.local13.field3 = Test20Lib.local2;
Test20Lib.local13.field4 = Test20Lib.local6;
Test20Lib.local13.field5 = Test20Lib.local12;
Test20Lib.local13.field1 = Test20Lib.local8;
Test20Lib.local14.field6 = Test20Lib.local6;
Test20Lib.local14.field2 = Test20Lib.local12;
Test20Lib.local14.field3 = Test20Lib.local6;
Test20Lib.local14.field4 = Test20Lib.local3;
Test20Lib.local14.field5 = Test20Lib.local6;
Test20Lib.local14.field1 = Test20Lib.local13;
for (int local45 = 0; local45<=3; local45 += 1) {
if (inputValue>=4) {
for (int local46 = 0; local46<=1; local46 += 1) {
Test20Lib.local9.field1.method2(3);
}
}
}
Test20Lib.local12.field2.method3(3);
for (int local47 = 0; local47<=1; local47 += 1) {
if (inputValue>1) {
Test20Lib.local8=Test20Lib.local11.field5;
}else {
for (int local48 = 0; local48<=1; local48 += 1) {
Test20Lib.local9.field3=Test20Lib.local11.field2;
}
}
}
Test20Lib.local9.field5.method4(Test20Lib.local12.field6,Test20Lib.local6.field2,3);
Test20Lib.local9.field1.method5(3);
Test20Lib.local11.field4=Test20Lib.local11.field5;
if (inputValue==4) {
Test20Lib.local14.field3=Test20Lib.local14.method6(Test20Lib.local12,3);
}else {
if (inputValue>=2) {
Test20Lib.local13.method4(Test20Lib.local13,Test20Lib.local5.field1,3);
}
}
Test20Lib.local11.field3.method1(Test20Lib.local4,Test20Lib.local9.field4,3);
for (int local49 = 0; local49<=1; local49 += 1) {
if (inputValue>4) {
Test20Lib.local10.method1(Test20Lib.local6,Test20Lib.local5.field1,3);
}
}
for (int local50 = 0; local50<=3; local50 += 1) {
for (int local51 = 0; local51<=1; local51 += 1) {
if (inputValue>=4) {
if (inputValue<3) {
Test20Lib.local11.field4=Test20Lib.local12.method6(Test20Lib.local11,3);
}
}else {
Test20Lib.local8.field1.method5(3);
}
}
}
Benchmark.test(1,Test20Lib.local1);
Benchmark.test(2,Test20Lib.local2);
Benchmark.test(3,Test20Lib.local3);
Benchmark.test(4,Test20Lib.local4);
Benchmark.test(5,Test20Lib.local5);
Benchmark.test(6,Test20Lib.local6);
Benchmark.test(7,Test20Lib.local7);
Benchmark.test(8,Test20Lib.local8);
Benchmark.test(9,Test20Lib.local9);
Benchmark.test(10,Test20Lib.local10);
Benchmark.test(11,Test20Lib.local11);
Benchmark.test(12,Test20Lib.local12);
Benchmark.test(13,Test20Lib.local13);
Benchmark.test(14,Test20Lib.local14);
Benchmark.test(15,Test20Lib.local1.field1);
Benchmark.test(16,Test20Lib.local2.field1);
Benchmark.test(17,Test20Lib.local3.field1);
Benchmark.test(18,Test20Lib.local4.field1);
Benchmark.test(19,Test20Lib.local5.field1);
Benchmark.test(20,Test20Lib.local6.field2);
Benchmark.test(21,Test20Lib.local6.field3);
Benchmark.test(22,Test20Lib.local6.field4);
Benchmark.test(23,Test20Lib.local6.field5);
Benchmark.test(24,Test20Lib.local6.field1);
Benchmark.test(25,Test20Lib.local7.field2);
Benchmark.test(26,Test20Lib.local7.field3);
Benchmark.test(27,Test20Lib.local7.field4);
Benchmark.test(28,Test20Lib.local7.field5);
Benchmark.test(29,Test20Lib.local7.field1);
Benchmark.test(30,Test20Lib.local8.field2);
Benchmark.test(31,Test20Lib.local8.field3);
Benchmark.test(32,Test20Lib.local8.field4);
Benchmark.test(33,Test20Lib.local8.field5);
Benchmark.test(34,Test20Lib.local8.field1);
Benchmark.test(35,Test20Lib.local9.field2);
Benchmark.test(36,Test20Lib.local9.field3);
Benchmark.test(37,Test20Lib.local9.field4);
Benchmark.test(38,Test20Lib.local9.field5);
Benchmark.test(39,Test20Lib.local9.field1);
Benchmark.test(40,Test20Lib.local10.field2);
Benchmark.test(41,Test20Lib.local10.field3);
Benchmark.test(42,Test20Lib.local10.field4);
Benchmark.test(43,Test20Lib.local10.field5);
Benchmark.test(44,Test20Lib.local10.field1);
Benchmark.test(45,Test20Lib.local11.field6);
Benchmark.test(46,Test20Lib.local11.field2);
Benchmark.test(47,Test20Lib.local11.field3);
Benchmark.test(48,Test20Lib.local11.field4);
Benchmark.test(49,Test20Lib.local11.field5);
Benchmark.test(50,Test20Lib.local11.field1);
Benchmark.test(51,Test20Lib.local12.field6);
Benchmark.test(52,Test20Lib.local12.field2);
Benchmark.test(53,Test20Lib.local12.field3);
Benchmark.test(54,Test20Lib.local12.field4);
Benchmark.test(55,Test20Lib.local12.field5);
Benchmark.test(56,Test20Lib.local12.field1);
Benchmark.test(57,Test20Lib.local13.field6);
Benchmark.test(58,Test20Lib.local13.field2);
Benchmark.test(59,Test20Lib.local13.field3);
Benchmark.test(60,Test20Lib.local13.field4);
Benchmark.test(61,Test20Lib.local13.field5);
Benchmark.test(62,Test20Lib.local13.field1);
Benchmark.test(63,Test20Lib.local14.field6);
Benchmark.test(64,Test20Lib.local14.field2);
Benchmark.test(65,Test20Lib.local14.field3);
Benchmark.test(66,Test20Lib.local14.field4);
Benchmark.test(67,Test20Lib.local14.field5);
Benchmark.test(68,Test20Lib.local14.field1);
Benchmark.print();
}
}
