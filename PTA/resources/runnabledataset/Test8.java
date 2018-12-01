package runnabledataset;

import benchmark.tool.Benchmark;
import benchmark.tool.BasicClass;
class Test8Lib{
public static Test8Class1 local1;
public static Test8Class1 local2;
public static Test8Class2 local3;
public static Test8Class2 local4;
public static Test8Class2 local5;
public static Test8Class2 local6;
public static Test8Class3 local7;
public static Test8Class3 local8;
public static Test8Class3 local9;
public static Test8Class3 local10;
}
class Test8Class1 extends BasicClass {
public Test8Class2 field1;
public static void method1(int depth) {
if (depth == 0) return;
for (int local11 = 0; local11<=3; local11 += 1) {
if (depth>=2) {
for (int local12 = 0; local12<=3; local12 += 1) {
for (int local13 = 0; local13<=3; local13 += 1) {
if (depth>1) {
}
}
}
}
}
if (depth>=2) {
for (int local14 = 0; local14<=2; local14 += 1) {
for (int local15 = 0; local15<=2; local15 += 1) {
for (int local16 = 0; local16<=1; local16 += 1) {
if (depth==4) {
}
}
}
}
}
for (int local17 = 0; local17<=3; local17 += 1) {
for (int local18 = 0; local18<=3; local18 += 1) {
if (depth>=4) {
for (int local19 = 0; local19<=0; local19 += 1) {
if (depth<=1) {
}else {
}
}
}
}
}
if (depth==2) {
if (depth<=1) {
for (int local20 = 0; local20<=0; local20 += 1) {
for (int local21 = 0; local21<=0; local21 += 1) {
for (int local22 = 0; local22<=0; local22 += 1) {
}
}
}
}
}
}
public static void method2(Test8Class1 arg0, int depth) {
if (depth == 0) return;
if (depth>1) {
if (depth>1) {
arg0=arg0;
}
}else {
for (int local23 = 0; local23<=1; local23 += 1) {
arg0.field1=arg0.field1;
}
}
if (depth>=3) {
arg0.field1=arg0.field1;
}else {
if (depth>=1) {
arg0.method2(arg0,depth-1);
}
}
arg0=arg0.field1.method5(arg0.field1,depth-1);
}
}
class Test8Class2 extends Test8Class1 {
public Test8Class3 field2;
public void method3(Test8Class2 arg0, int depth) {
if (depth == 0) return;
arg0.method1(depth-1);
if (depth>4) {
if (depth>1) {
arg0.field1=arg0.field1.method5(arg0,depth-1);
}
}else {
arg0.field1=arg0.field2;
}
arg0.field1=this.field1;
this.field1=this.field1;
}
public static void method4(Test8Class1 arg0, int depth) {
if (depth == 0) return;
for (int local24 = 0; local24<=1; local24 += 1) {
for (int local25 = 0; local25<=2; local25 += 1) {
if (depth<=2) {
arg0.field1.method5(arg0.field1,depth-1);
}else {
arg0=arg0.field1.method5(arg0.field1,depth-1);
}
}
}
if (depth<2) {
if (depth<3) {
arg0.field1=arg0.field1;
}
}
}
public static Test8Class2 method5(Test8Class2 arg0, int depth) {
if (depth == 0) return Test8Lib.local4;
arg0=arg0.field1;
if (depth==2) {
if (depth==3) {
for (int local26 = 0; local26<=0; local26 += 1) {
for (int local27 = 0; local27<=1; local27 += 1) {
if (depth<=2) {
}
}
}
}
}else {
for (int local28 = 0; local28<=0; local28 += 1) {
for (int local29 = 0; local29<=0; local29 += 1) {
if (depth>=3) {
arg0.field1.method3(arg0.field2,depth-1);
}else {
arg0.field2=arg0.field2;
}
}
}
}
for (int local30 = 0; local30<=0; local30 += 1) {
arg0.field2=arg0.field2;
}
if (depth<=4) {
for (int local31 = 0; local31<=1; local31 += 1) {
for (int local32 = 0; local32<=1; local32 += 1) {
for (int local33 = 0; local33<=2; local33 += 1) {
for (int local34 = 0; local34<=0; local34 += 1) {
}
}
}
}
}
return arg0;
}
}
class Test8Class3 extends Test8Class2 {
public Test8Class2 field3;
public Test8Class1 field4;
public Test8Class1 method6(Test8Class3 arg0, int depth) {
if (depth == 0) return Test8Lib.local9;
arg0=this;
for (int local35 = 0; local35<=1; local35 += 1) {
for (int local36 = 0; local36<=2; local36 += 1) {
this.field3.method2(arg0.field3,depth-1);
}
}
if (depth>2) {
arg0.field2.method6(this,depth-1);
}else {
this.field4=this.method6(arg0,depth-1);
}
if (depth>=4) {
for (int local37 = 0; local37<=2; local37 += 1) {
this.field4=this.field2;
}
}
return this.field4;
}
}
public class Test8{
public static void main(String[] args) {
int inputValue = 10;
Benchmark.alloc(1);
Test8Lib.local1 = new Test8Class1();
Benchmark.alloc(2);
Test8Lib.local2 = new Test8Class1();
Benchmark.alloc(3);
Test8Lib.local3 = new Test8Class2();
Benchmark.alloc(4);
Test8Lib.local4 = new Test8Class2();
Benchmark.alloc(5);
Test8Lib.local5 = new Test8Class2();
Benchmark.alloc(6);
Test8Lib.local6 = new Test8Class2();
Benchmark.alloc(7);
Test8Lib.local7 = new Test8Class3();
Benchmark.alloc(8);
Test8Lib.local8 = new Test8Class3();
Benchmark.alloc(9);
Test8Lib.local9 = new Test8Class3();
Benchmark.alloc(10);
Test8Lib.local10 = new Test8Class3();
Test8Lib.local1.field1 = Test8Lib.local9;
Test8Lib.local2.field1 = Test8Lib.local8;
Test8Lib.local3.field2 = Test8Lib.local7;
Test8Lib.local3.field1 = Test8Lib.local3;
Test8Lib.local4.field2 = Test8Lib.local9;
Test8Lib.local4.field1 = Test8Lib.local10;
Test8Lib.local5.field2 = Test8Lib.local10;
Test8Lib.local5.field1 = Test8Lib.local6;
Test8Lib.local6.field2 = Test8Lib.local7;
Test8Lib.local6.field1 = Test8Lib.local3;
Test8Lib.local7.field3 = Test8Lib.local7;
Test8Lib.local7.field4 = Test8Lib.local4;
Test8Lib.local7.field2 = Test8Lib.local9;
Test8Lib.local7.field1 = Test8Lib.local6;
Test8Lib.local8.field3 = Test8Lib.local9;
Test8Lib.local8.field4 = Test8Lib.local7;
Test8Lib.local8.field2 = Test8Lib.local8;
Test8Lib.local8.field1 = Test8Lib.local5;
Test8Lib.local9.field3 = Test8Lib.local8;
Test8Lib.local9.field4 = Test8Lib.local8;
Test8Lib.local9.field2 = Test8Lib.local8;
Test8Lib.local9.field1 = Test8Lib.local7;
Test8Lib.local10.field3 = Test8Lib.local5;
Test8Lib.local10.field4 = Test8Lib.local2;
Test8Lib.local10.field2 = Test8Lib.local10;
Test8Lib.local10.field1 = Test8Lib.local5;
for (int local38 = 0; local38<=2; local38 += 1) {
for (int local39 = 0; local39<=1; local39 += 1) {
for (int local40 = 0; local40<=2; local40 += 1) {
Test8Lib.local8.method6(Test8Lib.local10,3);
}
}
}
Test8Lib.local5.field1.method3(Test8Lib.local3.field1,3);
Test8Lib.local2.field1=Test8Lib.local5.field1;
Test8Lib.local10.field1.method4(Test8Lib.local9.field4,3);
if (inputValue>=4) {
for (int local41 = 0; local41<=3; local41 += 1) {
if (inputValue>4) {
if (inputValue>1) {
for (int local42 = 0; local42<=2; local42 += 1) {
}
}else {
Test8Lib.local9.field4=Test8Lib.local8.field3;
}
}else {
if (inputValue<=1) {
Test8Lib.local3.field1=Test8Lib.local4;
}else {
Test8Lib.local2=Test8Lib.local3.field1;
}
}
}
}else {
Test8Lib.local1.field1.method3(Test8Lib.local4,3);
}
Benchmark.test(1,Test8Lib.local1);
Benchmark.test(2,Test8Lib.local2);
Benchmark.test(3,Test8Lib.local3);
Benchmark.test(4,Test8Lib.local4);
Benchmark.test(5,Test8Lib.local5);
Benchmark.test(6,Test8Lib.local6);
Benchmark.test(7,Test8Lib.local7);
Benchmark.test(8,Test8Lib.local8);
Benchmark.test(9,Test8Lib.local9);
Benchmark.test(10,Test8Lib.local10);
Benchmark.test(11,Test8Lib.local1.field1);
Benchmark.test(12,Test8Lib.local2.field1);
Benchmark.test(13,Test8Lib.local3.field2);
Benchmark.test(14,Test8Lib.local3.field1);
Benchmark.test(15,Test8Lib.local4.field2);
Benchmark.test(16,Test8Lib.local4.field1);
Benchmark.test(17,Test8Lib.local5.field2);
Benchmark.test(18,Test8Lib.local5.field1);
Benchmark.test(19,Test8Lib.local6.field2);
Benchmark.test(20,Test8Lib.local6.field1);
Benchmark.test(21,Test8Lib.local7.field3);
Benchmark.test(22,Test8Lib.local7.field4);
Benchmark.test(23,Test8Lib.local7.field2);
Benchmark.test(24,Test8Lib.local7.field1);
Benchmark.test(25,Test8Lib.local8.field3);
Benchmark.test(26,Test8Lib.local8.field4);
Benchmark.test(27,Test8Lib.local8.field2);
Benchmark.test(28,Test8Lib.local8.field1);
Benchmark.test(29,Test8Lib.local9.field3);
Benchmark.test(30,Test8Lib.local9.field4);
Benchmark.test(31,Test8Lib.local9.field2);
Benchmark.test(32,Test8Lib.local9.field1);
Benchmark.test(33,Test8Lib.local10.field3);
Benchmark.test(34,Test8Lib.local10.field4);
Benchmark.test(35,Test8Lib.local10.field2);
Benchmark.test(36,Test8Lib.local10.field1);
Benchmark.print();
}
}
