package runnabledataset;

import benchmark.tool.Benchmark;
import benchmark.tool.BasicClass;
class Test21Lib{
public static Test21Class1 local1;
public static Test21Class1 local2;
public static Test21Class2 local3;
public static Test21Class2 local4;
public static Test21Class2 local5;
public static Test21Class3 local6;
public static Test21Class3 local7;
public static Test21Class3 local8;
}
class Test21Class1 extends BasicClass {
public static Test21Class2 field1;
public Test21Class2 field2;
public Test21Class3 field3;
public Test21Class3 method1(int depth) {
if (depth == 0) return Test21Lib.local6;
for (int local9 = 0; local9<=1; local9 += 1) {
if (depth==2) {
for (int local10 = 0; local10<=2; local10 += 1) {
this.field3=this.field3.method7(this,this.field1,depth-1);
}
}
}
return this.field3;
}
public void method2(int depth) {
if (depth == 0) return;
this.field3=this.field3;
if (depth<=4) {
this.field1=this.field1;
}else {
if (depth==2) {
this.field3.method4(this.field2,this,depth-1);
}else {
if (depth<=3) {
this.field2=this.field2;
}else {
this.field3.method5(this.field3,depth-1);
}
}
}
for (int local11 = 0; local11<=3; local11 += 1) {
this.field3.method4(this.field1,this.field1,depth-1);
}
this.field3=this.field3;
}
}
class Test21Class2 extends Test21Class1 {
public static Test21Class1 field4;
public void method3(int depth) {
if (depth == 0) return;
this.field3=this.field3;
this.field4=this.field3.method1(depth-1);
this.field1=this.field2;
this.field4=this.field2;
this.field2.method3(depth-1);
for (int local12 = 0; local12<=3; local12 += 1) {
this.field1.method1(depth-1);
}
}
}
class Test21Class3 extends Test21Class1 {
public static Test21Class2 field5;
public void method4(Test21Class1 arg0, Test21Class1 arg1, int depth) {
if (depth == 0) return;
}
public void method5(Test21Class3 arg0, int depth) {
if (depth == 0) return;
for (int local13 = 0; local13<=3; local13 += 1) {
arg0=arg0;
}
for (int local14 = 0; local14<=3; local14 += 1) {
this.method6(arg0.field1,depth-1);
}
this.field1.method3(depth-1);
this.field2.method2(depth-1);
this.field3=arg0.field3;
if (depth<=4) {
if (depth>=3) {
for (int local15 = 0; local15<=3; local15 += 1) {
arg0.field5.method3(depth-1);
}
}
}else {
this.method2(depth-1);
}
if (depth<1) {
arg0.field3=this;
}else {
for (int local16 = 0; local16<=2; local16 += 1) {
for (int local17 = 0; local17<=2; local17 += 1) {
this.field1.method3(depth-1);
}
}
}
}
public static void method6(Test21Class2 arg0, int depth) {
if (depth == 0) return;
if (depth>3) {
field5.field3.method4(field1.field3,field5.field1,depth-1);
}else {
if (depth>3) {
if (depth<=1) {
field1.field4.method2(depth-1);
}else {
if (depth==3) {
field5.method2(depth-1);
}else {
field1.field3.method6(field1.field1,depth-1);
}
}
}else {
field1.field4=arg0.field1;
}
}
field1.field3=field1.field3;
arg0.field3=field1.field3;
field5.method3(depth-1);
}
public Test21Class3 method7(Test21Class1 arg0, Test21Class1 arg1, int depth) {
if (depth == 0) return Test21Lib.local6;
this.field3=arg0.field3;
this.field3=arg0.method1(depth-1);
for (int local18 = 0; local18<=1; local18 += 1) {
arg1.field3.method2(depth-1);
}
if (depth<4) {
arg1.field3.method5(this,depth-1);
}
arg1.field3=this.field3.method7(this.field3,this.field2,depth-1);
if (depth<4) {
arg0.field3.method4(arg1,this.field1,depth-1);
}else {
for (int local19 = 0; local19<=1; local19 += 1) {
if (depth<=4) {
arg1.field2=this.field5;
}else {
if (depth>1) {
this.method2(depth-1);
}else {
arg1.field3.method4(arg0,arg1,depth-1);
}
}
}
}
arg0=this.method7(arg0.field2,this.field1,depth-1);
if (depth>=3) {
arg1=this.method1(depth-1);
}else {
arg0.field3.method5(this,depth-1);
}
for (int local20 = 0; local20<=3; local20 += 1) {
arg0.field3=this.method7(arg0.field1,this.field3,depth-1);
}
return arg0.field3;
}
}
public class Test21{
public static void main(String[] args) {
int inputValue = 10;
Benchmark.alloc(1);
Test21Lib.local1 = new Test21Class1();
Benchmark.alloc(2);
Test21Lib.local2 = new Test21Class1();
Benchmark.alloc(3);
Test21Lib.local3 = new Test21Class2();
Benchmark.alloc(4);
Test21Lib.local4 = new Test21Class2();
Benchmark.alloc(5);
Test21Lib.local5 = new Test21Class2();
Benchmark.alloc(6);
Test21Lib.local6 = new Test21Class3();
Benchmark.alloc(7);
Test21Lib.local7 = new Test21Class3();
Benchmark.alloc(8);
Test21Lib.local8 = new Test21Class3();
Test21Lib.local1.field1 = Test21Lib.local4;
Test21Lib.local1.field2 = Test21Lib.local4;
Test21Lib.local1.field3 = Test21Lib.local7;
Test21Lib.local2.field1 = Test21Lib.local3;
Test21Lib.local2.field2 = Test21Lib.local3;
Test21Lib.local2.field3 = Test21Lib.local6;
Test21Lib.local3.field4 = Test21Lib.local6;
Test21Lib.local3.field1 = Test21Lib.local3;
Test21Lib.local3.field2 = Test21Lib.local3;
Test21Lib.local3.field3 = Test21Lib.local7;
Test21Lib.local4.field4 = Test21Lib.local7;
Test21Lib.local4.field1 = Test21Lib.local4;
Test21Lib.local4.field2 = Test21Lib.local5;
Test21Lib.local4.field3 = Test21Lib.local8;
Test21Lib.local5.field4 = Test21Lib.local3;
Test21Lib.local5.field1 = Test21Lib.local3;
Test21Lib.local5.field2 = Test21Lib.local3;
Test21Lib.local5.field3 = Test21Lib.local8;
Test21Lib.local6.field5 = Test21Lib.local3;
Test21Lib.local6.field1 = Test21Lib.local4;
Test21Lib.local6.field2 = Test21Lib.local4;
Test21Lib.local6.field3 = Test21Lib.local7;
Test21Lib.local7.field5 = Test21Lib.local4;
Test21Lib.local7.field1 = Test21Lib.local5;
Test21Lib.local7.field2 = Test21Lib.local4;
Test21Lib.local7.field3 = Test21Lib.local6;
Test21Lib.local8.field5 = Test21Lib.local3;
Test21Lib.local8.field1 = Test21Lib.local3;
Test21Lib.local8.field2 = Test21Lib.local5;
Test21Lib.local8.field3 = Test21Lib.local6;
Test21Lib.local5.field4=Test21Lib.local4.field3.method7(Test21Lib.local2.field3,Test21Lib.local8.field1,3);
Test21Lib.local1.field1=Test21Lib.local2.field2;
for (int local21 = 0; local21<=1; local21 += 1) {
Test21Lib.local5.field4=Test21Lib.local2;
}
Test21Lib.local8.field1=Test21Lib.local3;
for (int local22 = 0; local22<=0; local22 += 1) {
if (inputValue>4) {
if (inputValue>3) {
if (inputValue<2) {
Test21Lib.local1.field3.method6(Test21Lib.local4.field2,3);
}else {
Test21Lib.local5.field2=Test21Lib.local5;
}
}
}else {
for (int local23 = 0; local23<=1; local23 += 1) {
for (int local24 = 0; local24<=3; local24 += 1) {
if (inputValue<=3) {
}else {
}
}
}
}
}
Test21Lib.local6.method4(Test21Lib.local2.field2,Test21Lib.local5,3);
for (int local25 = 0; local25<=2; local25 += 1) {
if (inputValue==4) {
Test21Lib.local1.field3.method5(Test21Lib.local1.field3,3);
}else {
for (int local26 = 0; local26<=1; local26 += 1) {
if (inputValue<=1) {
Test21Lib.local7.field1.method3(3);
}
}
}
}
Test21Lib.local1=Test21Lib.local4.field3;
for (int local27 = 0; local27<=3; local27 += 1) {
Test21Lib.local6.field3.method6(Test21Lib.local6.field2,3);
}
Test21Lib.local8=Test21Lib.local8.field3.method1(3);
Benchmark.test(1,Test21Lib.local1);
Benchmark.test(2,Test21Lib.local2);
Benchmark.test(3,Test21Lib.local3);
Benchmark.test(4,Test21Lib.local4);
Benchmark.test(5,Test21Lib.local5);
Benchmark.test(6,Test21Lib.local6);
Benchmark.test(7,Test21Lib.local7);
Benchmark.test(8,Test21Lib.local8);
Benchmark.test(9,Test21Lib.local1.field1);
Benchmark.test(10,Test21Lib.local1.field2);
Benchmark.test(11,Test21Lib.local1.field3);
Benchmark.test(12,Test21Lib.local2.field1);
Benchmark.test(13,Test21Lib.local2.field2);
Benchmark.test(14,Test21Lib.local2.field3);
Benchmark.test(15,Test21Lib.local3.field4);
Benchmark.test(16,Test21Lib.local3.field1);
Benchmark.test(17,Test21Lib.local3.field2);
Benchmark.test(18,Test21Lib.local3.field3);
Benchmark.test(19,Test21Lib.local4.field4);
Benchmark.test(20,Test21Lib.local4.field1);
Benchmark.test(21,Test21Lib.local4.field2);
Benchmark.test(22,Test21Lib.local4.field3);
Benchmark.test(23,Test21Lib.local5.field4);
Benchmark.test(24,Test21Lib.local5.field1);
Benchmark.test(25,Test21Lib.local5.field2);
Benchmark.test(26,Test21Lib.local5.field3);
Benchmark.test(27,Test21Lib.local6.field5);
Benchmark.test(28,Test21Lib.local6.field1);
Benchmark.test(29,Test21Lib.local6.field2);
Benchmark.test(30,Test21Lib.local6.field3);
Benchmark.test(31,Test21Lib.local7.field5);
Benchmark.test(32,Test21Lib.local7.field1);
Benchmark.test(33,Test21Lib.local7.field2);
Benchmark.test(34,Test21Lib.local7.field3);
Benchmark.test(35,Test21Lib.local8.field5);
Benchmark.test(36,Test21Lib.local8.field1);
Benchmark.test(37,Test21Lib.local8.field2);
Benchmark.test(38,Test21Lib.local8.field3);
Benchmark.print();
}
}
