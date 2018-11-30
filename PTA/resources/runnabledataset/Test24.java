package runnabledataset;

import benchmark.tool.Benchmark;
import benchmark.tool.BasicClass;
class Test24Lib{
public static Test24Class1 local1;
public static Test24Class1 local2;
public static Test24Class1 local3;
public static Test24Class2 local4;
public static Test24Class2 local5;
public static Test24Class2 local6;
public static Test24Class3 local7;
}
class Test24Class1 extends BasicClass {
public static Test24Class3 field1;
public static Test24Class3 field2;
public Test24Class3 field3;
public static Test24Class1 field4;
public void method1(Test24Class3 arg0, int depth) {
if (depth == 0) return;
for (int local8 = 0; local8<=0; local8 += 1) {
if (depth==4) {
arg0.field8=arg0.field3;
}else {
if (depth>=1) {
arg0.field4.method1(arg0.field2,depth-1);
}else {
arg0.field6=arg0.field4;
}
}
}
arg0.field4=this.field3;
this.field2=arg0.field1.method4(arg0.field9,depth-1);
for (int local9 = 0; local9<=3; local9 += 1) {
arg0.field3=arg0.field2;
}
}
}
class Test24Class2 extends Test24Class1 {
public static Test24Class2 field5;
public Test24Class1 field6;
public void method2(int depth) {
if (depth == 0) return;
this.field3.method5(depth-1);
if (depth==2) {
this.field3=this.field3;
}else {
if (depth<4) {
this.field2=this.field2;
}
}
if (depth>1) {
for (int local10 = 0; local10<=3; local10 += 1) {
for (int local11 = 0; local11<=1; local11 += 1) {
for (int local12 = 0; local12<=3; local12 += 1) {
this.field4=this.field1.method4(this,depth-1);
}
}
}
}else {
if (depth>=3) {
if (depth<=1) {
this.method1(this.field3,depth-1);
}else {
for (int local13 = 0; local13<=2; local13 += 1) {
if (depth>=4) {
}
}
}
}
}
this.field5=this;
for (int local14 = 0; local14<=2; local14 += 1) {
this.field5.method2(depth-1);
}
this.field5=this.field3.method3(this.field6,this.field1,depth-1);
this.field2.method5(depth-1);
this.field5=this.field3;
this.field2=this.field2;
}
}
class Test24Class3 extends Test24Class2 {
public static Test24Class2 field7;
public static Test24Class2 field8;
public static Test24Class2 field9;
public Test24Class2 method3(Test24Class1 arg0, Test24Class3 arg1, int depth) {
if (depth == 0) return Test24Lib.local7;
for (int local15 = 0; local15<=1; local15 += 1) {
arg1.field3.method2(depth-1);
}
arg0.field1.method4(arg0.field1,depth-1);
for (int local16 = 0; local16<=0; local16 += 1) {
for (int local17 = 0; local17<=2; local17 += 1) {
arg1.field3.method3(arg1.field4,arg1,depth-1);
}
}
return arg1.field8;
}
public static Test24Class3 method4(Test24Class2 arg0, int depth) {
if (depth == 0) return Test24Lib.local7;
field7.field4.method1(field7.field1,depth-1);
field7.field5=field8.field1;
field2.field7.method2(depth-1);
if (depth>3) {
field9.field1=field8.field3;
}else {
field9=field1.method3(field8,field4.field3,depth-1);
}
field9=field1.field9;
for (int local18 = 0; local18<=3; local18 += 1) {
field7.field4=field1.field3.method4(field2.field7,depth-1);
}
return field5.field3;
}
public static void method5(int depth) {
if (depth == 0) return;
}
}
public class Test24{
public static void main(String[] args) {
int inputValue = 10;
Benchmark.alloc(1);
Test24Lib.local1 = new Test24Class1();
Benchmark.alloc(2);
Test24Lib.local2 = new Test24Class1();
Benchmark.alloc(3);
Test24Lib.local3 = new Test24Class1();
Benchmark.alloc(4);
Test24Lib.local4 = new Test24Class2();
Benchmark.alloc(5);
Test24Lib.local5 = new Test24Class2();
Benchmark.alloc(6);
Test24Lib.local6 = new Test24Class2();
Benchmark.alloc(7);
Test24Lib.local7 = new Test24Class3();
Test24Lib.local1.field1 = Test24Lib.local7;
Test24Lib.local1.field2 = Test24Lib.local7;
Test24Lib.local1.field3 = Test24Lib.local7;
Test24Lib.local1.field4 = Test24Lib.local1;
Test24Lib.local2.field1 = Test24Lib.local7;
Test24Lib.local2.field2 = Test24Lib.local7;
Test24Lib.local2.field3 = Test24Lib.local7;
Test24Lib.local2.field4 = Test24Lib.local1;
Test24Lib.local3.field1 = Test24Lib.local7;
Test24Lib.local3.field2 = Test24Lib.local7;
Test24Lib.local3.field3 = Test24Lib.local7;
Test24Lib.local3.field4 = Test24Lib.local3;
Test24Lib.local4.field5 = Test24Lib.local7;
Test24Lib.local4.field6 = Test24Lib.local2;
Test24Lib.local4.field1 = Test24Lib.local7;
Test24Lib.local4.field2 = Test24Lib.local7;
Test24Lib.local4.field3 = Test24Lib.local7;
Test24Lib.local4.field4 = Test24Lib.local1;
Test24Lib.local5.field5 = Test24Lib.local5;
Test24Lib.local5.field6 = Test24Lib.local7;
Test24Lib.local5.field1 = Test24Lib.local7;
Test24Lib.local5.field2 = Test24Lib.local7;
Test24Lib.local5.field3 = Test24Lib.local7;
Test24Lib.local5.field4 = Test24Lib.local3;
Test24Lib.local6.field5 = Test24Lib.local4;
Test24Lib.local6.field6 = Test24Lib.local1;
Test24Lib.local6.field1 = Test24Lib.local7;
Test24Lib.local6.field2 = Test24Lib.local7;
Test24Lib.local6.field3 = Test24Lib.local7;
Test24Lib.local6.field4 = Test24Lib.local1;
Test24Lib.local7.field7 = Test24Lib.local4;
Test24Lib.local7.field8 = Test24Lib.local7;
Test24Lib.local7.field9 = Test24Lib.local5;
Test24Lib.local7.field5 = Test24Lib.local4;
Test24Lib.local7.field6 = Test24Lib.local6;
Test24Lib.local7.field1 = Test24Lib.local7;
Test24Lib.local7.field2 = Test24Lib.local7;
Test24Lib.local7.field3 = Test24Lib.local7;
Test24Lib.local7.field4 = Test24Lib.local1;
for (int local19 = 0; local19<=3; local19 += 1) {
if (inputValue>=3) {
Test24Lib.local2.field1.method5(3);
}
}
for (int local20 = 0; local20<=1; local20 += 1) {
Test24Lib.local5.field3=Test24Lib.local1.field2;
}
for (int local21 = 0; local21<=3; local21 += 1) {
Test24Lib.local4.field2=Test24Lib.local2.field1;
}
for (int local22 = 0; local22<=0; local22 += 1) {
Test24Lib.local6=Test24Lib.local4.field3;
}
Test24Lib.local3.field1.method2(3);
if (inputValue>=4) {
Test24Lib.local7.field9.method1(Test24Lib.local5.field1,3);
}else {
for (int local23 = 0; local23<=1; local23 += 1) {
for (int local24 = 0; local24<=3; local24 += 1) {
if (inputValue>1) {
Test24Lib.local2.field2.method3(Test24Lib.local5.field5,Test24Lib.local2.field2,3);
}
}
}
}
for (int local25 = 0; local25<=3; local25 += 1) {
Test24Lib.local2=Test24Lib.local2.field1.method3(Test24Lib.local1,Test24Lib.local4.field2,3);
}
Test24Lib.local6.field1.method2(3);
if (inputValue>4) {
Test24Lib.local7.field6=Test24Lib.local6;
}
Test24Lib.local7.field7.method1(Test24Lib.local2.field2,3);
Benchmark.test(1,Test24Lib.local1);
Benchmark.test(2,Test24Lib.local2);
Benchmark.test(3,Test24Lib.local3);
Benchmark.test(4,Test24Lib.local4);
Benchmark.test(5,Test24Lib.local5);
Benchmark.test(6,Test24Lib.local6);
Benchmark.test(7,Test24Lib.local7);
Benchmark.test(8,Test24Lib.local1.field1);
Benchmark.test(9,Test24Lib.local1.field2);
Benchmark.test(10,Test24Lib.local1.field3);
Benchmark.test(11,Test24Lib.local1.field4);
Benchmark.test(12,Test24Lib.local2.field1);
Benchmark.test(13,Test24Lib.local2.field2);
Benchmark.test(14,Test24Lib.local2.field3);
Benchmark.test(15,Test24Lib.local2.field4);
Benchmark.test(16,Test24Lib.local3.field1);
Benchmark.test(17,Test24Lib.local3.field2);
Benchmark.test(18,Test24Lib.local3.field3);
Benchmark.test(19,Test24Lib.local3.field4);
Benchmark.test(20,Test24Lib.local4.field5);
Benchmark.test(21,Test24Lib.local4.field6);
Benchmark.test(22,Test24Lib.local4.field1);
Benchmark.test(23,Test24Lib.local4.field2);
Benchmark.test(24,Test24Lib.local4.field3);
Benchmark.test(25,Test24Lib.local4.field4);
Benchmark.test(26,Test24Lib.local5.field5);
Benchmark.test(27,Test24Lib.local5.field6);
Benchmark.test(28,Test24Lib.local5.field1);
Benchmark.test(29,Test24Lib.local5.field2);
Benchmark.test(30,Test24Lib.local5.field3);
Benchmark.test(31,Test24Lib.local5.field4);
Benchmark.test(32,Test24Lib.local6.field5);
Benchmark.test(33,Test24Lib.local6.field6);
Benchmark.test(34,Test24Lib.local6.field1);
Benchmark.test(35,Test24Lib.local6.field2);
Benchmark.test(36,Test24Lib.local6.field3);
Benchmark.test(37,Test24Lib.local6.field4);
Benchmark.test(38,Test24Lib.local7.field7);
Benchmark.test(39,Test24Lib.local7.field8);
Benchmark.test(40,Test24Lib.local7.field9);
Benchmark.test(41,Test24Lib.local7.field5);
Benchmark.test(42,Test24Lib.local7.field6);
Benchmark.test(43,Test24Lib.local7.field1);
Benchmark.test(44,Test24Lib.local7.field2);
Benchmark.test(45,Test24Lib.local7.field3);
Benchmark.test(46,Test24Lib.local7.field4);
Benchmark.print();
}
}
