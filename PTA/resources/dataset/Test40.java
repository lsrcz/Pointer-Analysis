package dataset;

import benchmark.internal.Benchmark;
import benchmark.tool.BasicClass;
class Test40Lib{
public static Test40Class1 local1;
public static Test40Class1 local2;
public static Test40Class1 local3;
public static Test40Class1 local4;
public static Test40Class2 local5;
public static Test40Class2 local6;
public static Test40Class2 local7;
public static Test40Class3 local8;
public static Test40Class3 local9;
}
class Test40Class1 extends BasicClass {
public static Test40Class2 field1;
public static Test40Class1 field2;
public static Test40Class3 method1(Test40Class2 arg0, Test40Class2 arg1, int depth) {
if (depth == 0) return Test40Lib.local8;
if (depth==1) {
for (int local10 = 0; local10<=0; local10 += 1) {
arg0.field4.method1(arg0.field3,field1.field1,depth-1);
}
}else {
for (int local11 = 0; local11<=3; local11 += 1) {
for (int local12 = 0; local12<=2; local12 += 1) {
if (depth<2) {
for (int local13 = 0; local13<=3; local13 += 1) {
}
}else {
if (depth<=1) {
}else {
}
}
}
}
}
return Test40Lib.local9;
}
public static Test40Class1 method2(int depth) {
if (depth == 0) return Test40Lib.local8;
return field2.field1;
}
public void method3(Test40Class1 arg0, Test40Class3 arg1, int depth) {
if (depth == 0) return;
if (depth<4) {
arg1=arg1;
}else {
arg1.field2=arg1.method7(arg1.field5,this.field1,depth-1);
}
arg1=arg1;
}
}
class Test40Class2 extends Test40Class1 {
public Test40Class2 field3;
public static Test40Class1 field4;
public Test40Class1 method4(int depth) {
if (depth == 0) return Test40Lib.local5;
for (int local14 = 0; local14<=2; local14 += 1) {
if (depth==1) {
for (int local15 = 0; local15<=0; local15 += 1) {
if (depth==3) {
this.field1=this.field3.method6(this.field4,depth-1);
}else {
this.field2=this.field1;
}
}
}
}
return this;
}
public void method5(Test40Class2 arg0, Test40Class3 arg1, int depth) {
if (depth == 0) return;
arg1.field5=arg1;
arg0.method6(this.field1,depth-1);
}
public static Test40Class2 method6(Test40Class1 arg0, int depth) {
if (depth == 0) return Test40Lib.local6;
for (int local16 = 0; local16<=3; local16 += 1) {
for (int local17 = 0; local17<=3; local17 += 1) {
if (depth>=2) {
for (int local18 = 0; local18<=3; local18 += 1) {
for (int local19 = 0; local19<=1; local19 += 1) {
}
}
}
}
}
for (int local20 = 0; local20<=1; local20 += 1) {
if (depth<4) {
for (int local21 = 0; local21<=2; local21 += 1) {
if (depth<=2) {
if (depth==1) {
}else {
}
}else {
for (int local22 = 0; local22<=0; local22 += 1) {
}
}
}
}else {
field1.field2=field1.field4;
}
}
return field1.field3;
}
}
class Test40Class3 extends Test40Class2 {
public Test40Class3 field5;
public Test40Class3 method7(Test40Class3 arg0, Test40Class2 arg1, int depth) {
if (depth == 0) return Test40Lib.local9;
return arg0.field5;
}
}
public class Test40{
public static void main(String[] args) {
int inputValue = 0;
Benchmark.alloc(1);
Test40Lib.local1 = new Test40Class1();
Benchmark.alloc(2);
Test40Lib.local2 = new Test40Class1();
Benchmark.alloc(3);
Test40Lib.local3 = new Test40Class1();
Benchmark.alloc(4);
Test40Lib.local4 = new Test40Class1();
Benchmark.alloc(5);
Test40Lib.local5 = new Test40Class2();
Benchmark.alloc(6);
Test40Lib.local6 = new Test40Class2();
Benchmark.alloc(7);
Test40Lib.local7 = new Test40Class2();
Benchmark.alloc(8);
Test40Lib.local8 = new Test40Class3();
Benchmark.alloc(9);
Test40Lib.local9 = new Test40Class3();
Test40Lib.local1.field1 = Test40Lib.local7;
Test40Lib.local1.field2 = Test40Lib.local9;
Test40Lib.local2.field1 = Test40Lib.local5;
Test40Lib.local2.field2 = Test40Lib.local8;
Test40Lib.local3.field1 = Test40Lib.local7;
Test40Lib.local3.field2 = Test40Lib.local8;
Test40Lib.local4.field1 = Test40Lib.local9;
Test40Lib.local4.field2 = Test40Lib.local5;
Test40Lib.local5.field3 = Test40Lib.local7;
Test40Lib.local5.field4 = Test40Lib.local6;
Test40Lib.local5.field1 = Test40Lib.local9;
Test40Lib.local5.field2 = Test40Lib.local2;
Test40Lib.local6.field3 = Test40Lib.local8;
Test40Lib.local6.field4 = Test40Lib.local8;
Test40Lib.local6.field1 = Test40Lib.local5;
Test40Lib.local6.field2 = Test40Lib.local9;
Test40Lib.local7.field3 = Test40Lib.local7;
Test40Lib.local7.field4 = Test40Lib.local4;
Test40Lib.local7.field1 = Test40Lib.local6;
Test40Lib.local7.field2 = Test40Lib.local7;
Test40Lib.local8.field5 = Test40Lib.local9;
Test40Lib.local8.field3 = Test40Lib.local8;
Test40Lib.local8.field4 = Test40Lib.local4;
Test40Lib.local8.field1 = Test40Lib.local8;
Test40Lib.local8.field2 = Test40Lib.local9;
Test40Lib.local9.field5 = Test40Lib.local9;
Test40Lib.local9.field3 = Test40Lib.local7;
Test40Lib.local9.field4 = Test40Lib.local3;
Test40Lib.local9.field1 = Test40Lib.local6;
Test40Lib.local9.field2 = Test40Lib.local9;
for (int local23 = 0; local23<=2; local23 += 1) {
Test40Lib.local7.field2.method3(Test40Lib.local7.field1,Test40Lib.local8,3);
}
Test40Lib.local1.field1=Test40Lib.local8.field5;
Test40Lib.local4=Test40Lib.local5.field3;
Benchmark.test(1,Test40Lib.local1);
Benchmark.test(2,Test40Lib.local2);
Benchmark.test(3,Test40Lib.local3);
Benchmark.test(4,Test40Lib.local4);
Benchmark.test(5,Test40Lib.local5);
Benchmark.test(6,Test40Lib.local6);
Benchmark.test(7,Test40Lib.local7);
Benchmark.test(8,Test40Lib.local8);
Benchmark.test(9,Test40Lib.local9);
Benchmark.test(10,Test40Lib.local1.field1);
Benchmark.test(11,Test40Lib.local1.field2);
Benchmark.test(12,Test40Lib.local2.field1);
Benchmark.test(13,Test40Lib.local2.field2);
Benchmark.test(14,Test40Lib.local3.field1);
Benchmark.test(15,Test40Lib.local3.field2);
Benchmark.test(16,Test40Lib.local4.field1);
Benchmark.test(17,Test40Lib.local4.field2);
Benchmark.test(18,Test40Lib.local5.field3);
Benchmark.test(19,Test40Lib.local5.field4);
Benchmark.test(20,Test40Lib.local5.field1);
Benchmark.test(21,Test40Lib.local5.field2);
Benchmark.test(22,Test40Lib.local6.field3);
Benchmark.test(23,Test40Lib.local6.field4);
Benchmark.test(24,Test40Lib.local6.field1);
Benchmark.test(25,Test40Lib.local6.field2);
Benchmark.test(26,Test40Lib.local7.field3);
Benchmark.test(27,Test40Lib.local7.field4);
Benchmark.test(28,Test40Lib.local7.field1);
Benchmark.test(29,Test40Lib.local7.field2);
Benchmark.test(30,Test40Lib.local8.field5);
Benchmark.test(31,Test40Lib.local8.field3);
Benchmark.test(32,Test40Lib.local8.field4);
Benchmark.test(33,Test40Lib.local8.field1);
Benchmark.test(34,Test40Lib.local8.field2);
Benchmark.test(35,Test40Lib.local9.field5);
Benchmark.test(36,Test40Lib.local9.field3);
Benchmark.test(37,Test40Lib.local9.field4);
Benchmark.test(38,Test40Lib.local9.field1);
Benchmark.test(39,Test40Lib.local9.field2);
Benchmark.print();
}
}
