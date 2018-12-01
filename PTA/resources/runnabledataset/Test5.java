package runnabledataset;

import benchmark.tool.Benchmark;
import benchmark.tool.BasicClass;
class Test5Lib{
public static Test5Class1 local1;
public static Test5Class1 local2;
public static Test5Class2 local3;
public static Test5Class2 local4;
public static Test5Class2 local5;
public static Test5Class3 local6;
}
class Test5Class1 extends BasicClass {
public Test5Class2 field1;
public Test5Class2 field2;
public Test5Class3 field3;
public static Test5Class2 method1(Test5Class2 arg0, int depth) {
if (depth == 0) return Test5Lib.local3;
return arg0.field2;
}
public static void method2(Test5Class2 arg0, Test5Class2 arg1, int depth) {
if (depth == 0) return;
arg0.field2.method4(arg0.field4,arg0.field1,depth-1);
arg0.field3.method6(depth-1);
arg1=arg0.field1;
}
}
class Test5Class2 extends Test5Class1 {
public Test5Class3 field4;
public Test5Class1 method3(int depth) {
if (depth == 0) return Test5Lib.local2;
if (depth==1) {
if (depth>4) {
if (depth>2) {
for (int local7 = 0; local7<=0; local7 += 1) {
this.field4=this.field3;
}
}
}
}else {
for (int local8 = 0; local8<=2; local8 += 1) {
for (int local9 = 0; local9<=1; local9 += 1) {
this.field1=this;
}
}
}
if (depth<=2) {
this.field1.method3(depth-1);
}
return this.field2;
}
public static Test5Class3 method4(Test5Class3 arg0, Test5Class2 arg1, int depth) {
if (depth == 0) return Test5Lib.local6;
return arg0.field3;
}
public void method5(Test5Class3 arg0, Test5Class2 arg1, int depth) {
if (depth == 0) return;
arg0.field1=this.field1;
if (depth<1) {
if (depth>3) {
for (int local10 = 0; local10<=3; local10 += 1) {
for (int local11 = 0; local11<=0; local11 += 1) {
for (int local12 = 0; local12<=1; local12 += 1) {
}
}
}
}else {
this.method2(arg0.field1,arg0.field1,depth-1);
}
}
arg0.field1=arg0.field3.method1(arg1.field1,depth-1);
}
}
class Test5Class3 extends Test5Class1 {
public Test5Class3 field5;
public void method6(int depth) {
if (depth == 0) return;
this.field2.method4(this,this.field1,depth-1);
}
public Test5Class2 method7(Test5Class2 arg0, int depth) {
if (depth == 0) return Test5Lib.local4;
return arg0;
}
public Test5Class2 method8(Test5Class2 arg0, int depth) {
if (depth == 0) return Test5Lib.local5;
if (depth>2) {
this.field2.method2(arg0.field1,arg0,depth-1);
}else {
arg0.field4.method2(arg0.field1,arg0.field1,depth-1);
}
arg0=arg0.field1;
this.field3=this;
if (depth>=3) {
this.field2=arg0.field4.method7(this.field1,depth-1);
}else {
if (depth==4) {
this.field1=arg0.field2;
}else {
if (depth<4) {
for (int local13 = 0; local13<=3; local13 += 1) {
for (int local14 = 0; local14<=0; local14 += 1) {
}
}
}else {
this.field3.method6(depth-1);
}
}
}
return this.field1;
}
}
public class Test5{
public static void main(String[] args) {
int inputValue = 10;
Benchmark.alloc(1);
Test5Lib.local1 = new Test5Class1();
Benchmark.alloc(2);
Test5Lib.local2 = new Test5Class1();
Benchmark.alloc(3);
Test5Lib.local3 = new Test5Class2();
Benchmark.alloc(4);
Test5Lib.local4 = new Test5Class2();
Benchmark.alloc(5);
Test5Lib.local5 = new Test5Class2();
Benchmark.alloc(6);
Test5Lib.local6 = new Test5Class3();
Test5Lib.local1.field1 = Test5Lib.local5;
Test5Lib.local1.field2 = Test5Lib.local5;
Test5Lib.local1.field3 = Test5Lib.local6;
Test5Lib.local2.field1 = Test5Lib.local3;
Test5Lib.local2.field2 = Test5Lib.local5;
Test5Lib.local2.field3 = Test5Lib.local6;
Test5Lib.local3.field4 = Test5Lib.local6;
Test5Lib.local3.field1 = Test5Lib.local4;
Test5Lib.local3.field2 = Test5Lib.local4;
Test5Lib.local3.field3 = Test5Lib.local6;
Test5Lib.local4.field4 = Test5Lib.local6;
Test5Lib.local4.field1 = Test5Lib.local3;
Test5Lib.local4.field2 = Test5Lib.local4;
Test5Lib.local4.field3 = Test5Lib.local6;
Test5Lib.local5.field4 = Test5Lib.local6;
Test5Lib.local5.field1 = Test5Lib.local3;
Test5Lib.local5.field2 = Test5Lib.local5;
Test5Lib.local5.field3 = Test5Lib.local6;
Test5Lib.local6.field5 = Test5Lib.local6;
Test5Lib.local6.field1 = Test5Lib.local3;
Test5Lib.local6.field2 = Test5Lib.local3;
Test5Lib.local6.field3 = Test5Lib.local6;
Test5Lib.local2=Test5Lib.local5.field1;
Test5Lib.local1.field2.method1(Test5Lib.local1.field1,3);
Test5Lib.local2.field3.method6(3);
for (int local15 = 0; local15<=3; local15 += 1) {
Test5Lib.local4.field1=Test5Lib.local5.field1;
}
Test5Lib.local6=Test5Lib.local3.field4;
Benchmark.test(1,Test5Lib.local1);
Benchmark.test(2,Test5Lib.local2);
Benchmark.test(3,Test5Lib.local3);
Benchmark.test(4,Test5Lib.local4);
Benchmark.test(5,Test5Lib.local5);
Benchmark.test(6,Test5Lib.local6);
Benchmark.test(7,Test5Lib.local1.field1);
Benchmark.test(8,Test5Lib.local1.field2);
Benchmark.test(9,Test5Lib.local1.field3);
Benchmark.test(10,Test5Lib.local2.field1);
Benchmark.test(11,Test5Lib.local2.field2);
Benchmark.test(12,Test5Lib.local2.field3);
Benchmark.test(13,Test5Lib.local3.field4);
Benchmark.test(14,Test5Lib.local3.field1);
Benchmark.test(15,Test5Lib.local3.field2);
Benchmark.test(16,Test5Lib.local3.field3);
Benchmark.test(17,Test5Lib.local4.field4);
Benchmark.test(18,Test5Lib.local4.field1);
Benchmark.test(19,Test5Lib.local4.field2);
Benchmark.test(20,Test5Lib.local4.field3);
Benchmark.test(21,Test5Lib.local5.field4);
Benchmark.test(22,Test5Lib.local5.field1);
Benchmark.test(23,Test5Lib.local5.field2);
Benchmark.test(24,Test5Lib.local5.field3);
Benchmark.test(25,Test5Lib.local6.field5);
Benchmark.test(26,Test5Lib.local6.field1);
Benchmark.test(27,Test5Lib.local6.field2);
Benchmark.test(28,Test5Lib.local6.field3);
Benchmark.print();
}
}
