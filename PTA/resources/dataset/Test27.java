package dataset;

import benchmark.internal.Benchmark;
import benchmark.tool.BasicClass;
class Test27Lib{
public static Test27Class1 local1;
public static Test27Class1 local2;
public static Test27Class1 local3;
public static Test27Class2 local4;
public static Test27Class2 local5;
public static Test27Class2 local6;
public static Test27Class2 local7;
public static Test27Class3 local8;
}
class Test27Class1 extends BasicClass {
public Test27Class2 field1;
public Test27Class3 field2;
public static Test27Class2 method1(Test27Class3 arg0, int depth) {
if (depth == 0) return Test27Lib.local6;
arg0.field1=arg0.field1;
return arg0.field8;
}
public Test27Class2 method2(Test27Class3 arg0, Test27Class2 arg1, int depth) {
if (depth == 0) return Test27Lib.local7;
for (int local9 = 0; local9<=0; local9 += 1) {
arg0.field6=this.field1.method5(arg1.field2,depth-1);
}
arg0.field7=this.field2;
arg1.field5=arg1.field4.method7(arg0,arg1,depth-1);
if (depth<3) {
for (int local10 = 0; local10<=3; local10 += 1) {
arg0=arg1.field2;
}
}
for (int local11 = 0; local11<=2; local11 += 1) {
arg1.field4.method4(depth-1);
}
return arg0.field8;
}
public static Test27Class2 method3(Test27Class3 arg0, Test27Class3 arg1, int depth) {
if (depth == 0) return Test27Lib.local7;
for (int local12 = 0; local12<=3; local12 += 1) {
if (depth<=2) {
for (int local13 = 0; local13<=3; local13 += 1) {
if (depth>3) {
arg1=arg1;
}
}
}else {
arg1.field8=arg0.field2.method1(arg1,depth-1);
}
}
return arg0.field6;
}
public static void method4(int depth) {
if (depth == 0) return;
for (int local14 = 0; local14<=1; local14 += 1) {
if (depth==2) {
if (depth==1) {
if (depth<2) {
if (depth==4) {
}
}else {
for (int local15 = 0; local15<=0; local15 += 1) {
}
}
}else {
if (depth==1) {
if (depth>=2) {
}
}
}
}
}
}
}
class Test27Class2 extends Test27Class1 {
public static Test27Class2 field3;
public static Test27Class2 field4;
public static Test27Class1 field5;
public static Test27Class2 method5(Test27Class3 arg0, int depth) {
if (depth == 0) return Test27Lib.local6;
return field4.field4;
}
public static void method6(Test27Class1 arg0, Test27Class2 arg1, int depth) {
if (depth == 0) return;
}
public Test27Class1 method7(Test27Class3 arg0, Test27Class2 arg1, int depth) {
if (depth == 0) return Test27Lib.local3;
arg0.field7=arg1.field4;
for (int local16 = 0; local16<=0; local16 += 1) {
arg1.field5=arg0;
}
arg0.field7=arg0.field8.method7(arg0.field2,arg1.field3,depth-1);
if (depth>=3) {
for (int local17 = 0; local17<=3; local17 += 1) {
for (int local18 = 0; local18<=0; local18 += 1) {
this.field5=this.field2.method8(arg0.field8,arg1.field3,depth-1);
}
}
}
for (int local19 = 0; local19<=0; local19 += 1) {
arg0.field8=this.field1;
}
arg0.field8=this;
arg0.field1.method6(arg1,this.field3,depth-1);
this.field5=this.field3;
return arg0.field2;
}
}
class Test27Class3 extends Test27Class1 {
public static Test27Class2 field6;
public static Test27Class1 field7;
public Test27Class2 field8;
public Test27Class1 method8(Test27Class2 arg0, Test27Class2 arg1, int depth) {
if (depth == 0) return Test27Lib.local5;
arg0=this.field7.method2(arg0.field2,this.field1,depth-1);
arg1.field3.method6(this.field2,arg0.field1,depth-1);
this.field7=arg0.field1.method7(arg1.field2,arg0.field4,depth-1);
this.field1=this.field1;
for (int local20 = 0; local20<=0; local20 += 1) {
arg1.field5=arg1.field5;
}
arg1.field5=arg0.field1;
for (int local21 = 0; local21<=1; local21 += 1) {
for (int local22 = 0; local22<=3; local22 += 1) {
if (depth<=1) {
arg0.field2=this;
}else {
this.field8.method7(this.field2,this.field6,depth-1);
}
}
}
arg1.field1=this.field7.method2(arg0.field2,arg0,depth-1);
return this.field1;
}
}
public class Test27{
public static void main(String[] args) {
int inputValue = 0;
Benchmark.alloc(1);
Test27Lib.local1 = new Test27Class1();
Benchmark.alloc(2);
Test27Lib.local2 = new Test27Class1();
Benchmark.alloc(3);
Test27Lib.local3 = new Test27Class1();
Benchmark.alloc(4);
Test27Lib.local4 = new Test27Class2();
Benchmark.alloc(5);
Test27Lib.local5 = new Test27Class2();
Benchmark.alloc(6);
Test27Lib.local6 = new Test27Class2();
Benchmark.alloc(7);
Test27Lib.local7 = new Test27Class2();
Benchmark.alloc(8);
Test27Lib.local8 = new Test27Class3();
Test27Lib.local1.field1 = Test27Lib.local4;
Test27Lib.local1.field2 = Test27Lib.local8;
Test27Lib.local2.field1 = Test27Lib.local7;
Test27Lib.local2.field2 = Test27Lib.local8;
Test27Lib.local3.field1 = Test27Lib.local7;
Test27Lib.local3.field2 = Test27Lib.local8;
Test27Lib.local4.field3 = Test27Lib.local5;
Test27Lib.local4.field4 = Test27Lib.local5;
Test27Lib.local4.field5 = Test27Lib.local5;
Test27Lib.local4.field1 = Test27Lib.local5;
Test27Lib.local4.field2 = Test27Lib.local8;
Test27Lib.local5.field3 = Test27Lib.local4;
Test27Lib.local5.field4 = Test27Lib.local5;
Test27Lib.local5.field5 = Test27Lib.local6;
Test27Lib.local5.field1 = Test27Lib.local4;
Test27Lib.local5.field2 = Test27Lib.local8;
Test27Lib.local6.field3 = Test27Lib.local4;
Test27Lib.local6.field4 = Test27Lib.local5;
Test27Lib.local6.field5 = Test27Lib.local7;
Test27Lib.local6.field1 = Test27Lib.local4;
Test27Lib.local6.field2 = Test27Lib.local8;
Test27Lib.local7.field3 = Test27Lib.local4;
Test27Lib.local7.field4 = Test27Lib.local5;
Test27Lib.local7.field5 = Test27Lib.local8;
Test27Lib.local7.field1 = Test27Lib.local7;
Test27Lib.local7.field2 = Test27Lib.local8;
Test27Lib.local8.field6 = Test27Lib.local4;
Test27Lib.local8.field7 = Test27Lib.local3;
Test27Lib.local8.field8 = Test27Lib.local5;
Test27Lib.local8.field1 = Test27Lib.local4;
Test27Lib.local8.field2 = Test27Lib.local8;
Test27Lib.local6=Test27Lib.local6.field4;
Test27Lib.local3.field1=Test27Lib.local4.field3;
Test27Lib.local3.field1.method3(Test27Lib.local7.field2,Test27Lib.local5.field2,3);
Test27Lib.local1.field2.method8(Test27Lib.local1.field1,Test27Lib.local3.field1,3);
if (inputValue>=1) {
Test27Lib.local7.field1=Test27Lib.local6.field4.method5(Test27Lib.local7.field2,3);
}
Test27Lib.local3=Test27Lib.local8.field6;
Test27Lib.local8.field7.method4(3);
if (inputValue>2) {
Test27Lib.local5.field5=Test27Lib.local2.field2.method3(Test27Lib.local3.field2,Test27Lib.local5.field2,3);
}else {
for (int local23 = 0; local23<=2; local23 += 1) {
if (inputValue==2) {
if (inputValue>=2) {
Test27Lib.local8.field7=Test27Lib.local8;
}else {
Test27Lib.local6.field3.method6(Test27Lib.local6.field4,Test27Lib.local8.field6,3);
}
}else {
Test27Lib.local4.field4=Test27Lib.local7.field2.method2(Test27Lib.local4.field2,Test27Lib.local4.field4,3);
}
}
}
Test27Lib.local3.field1=Test27Lib.local3.field1;
if (inputValue>1) {
Test27Lib.local4.field5=Test27Lib.local5.field3.method7(Test27Lib.local1.field2,Test27Lib.local7,3);
}
Benchmark.test(1,Test27Lib.local1);
Benchmark.test(2,Test27Lib.local2);
Benchmark.test(3,Test27Lib.local3);
Benchmark.test(4,Test27Lib.local4);
Benchmark.test(5,Test27Lib.local5);
Benchmark.test(6,Test27Lib.local6);
Benchmark.test(7,Test27Lib.local7);
Benchmark.test(8,Test27Lib.local8);
Benchmark.test(9,Test27Lib.local1.field1);
Benchmark.test(10,Test27Lib.local1.field2);
Benchmark.test(11,Test27Lib.local2.field1);
Benchmark.test(12,Test27Lib.local2.field2);
Benchmark.test(13,Test27Lib.local3.field1);
Benchmark.test(14,Test27Lib.local3.field2);
Benchmark.test(15,Test27Lib.local4.field3);
Benchmark.test(16,Test27Lib.local4.field4);
Benchmark.test(17,Test27Lib.local4.field5);
Benchmark.test(18,Test27Lib.local4.field1);
Benchmark.test(19,Test27Lib.local4.field2);
Benchmark.test(20,Test27Lib.local5.field3);
Benchmark.test(21,Test27Lib.local5.field4);
Benchmark.test(22,Test27Lib.local5.field5);
Benchmark.test(23,Test27Lib.local5.field1);
Benchmark.test(24,Test27Lib.local5.field2);
Benchmark.test(25,Test27Lib.local6.field3);
Benchmark.test(26,Test27Lib.local6.field4);
Benchmark.test(27,Test27Lib.local6.field5);
Benchmark.test(28,Test27Lib.local6.field1);
Benchmark.test(29,Test27Lib.local6.field2);
Benchmark.test(30,Test27Lib.local7.field3);
Benchmark.test(31,Test27Lib.local7.field4);
Benchmark.test(32,Test27Lib.local7.field5);
Benchmark.test(33,Test27Lib.local7.field1);
Benchmark.test(34,Test27Lib.local7.field2);
Benchmark.test(35,Test27Lib.local8.field6);
Benchmark.test(36,Test27Lib.local8.field7);
Benchmark.test(37,Test27Lib.local8.field8);
Benchmark.test(38,Test27Lib.local8.field1);
Benchmark.test(39,Test27Lib.local8.field2);
Benchmark.print();
}
}
