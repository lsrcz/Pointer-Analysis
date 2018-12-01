package runnabledataset;

import benchmark.tool.Benchmark;
import benchmark.tool.BasicClass;
class Test4Lib{
public static Test4Class1 local1;
public static Test4Class1 local2;
public static Test4Class1 local3;
public static Test4Class2 local4;
public static Test4Class3 local5;
}
class Test4Class1 extends BasicClass {
public Test4Class3 field1;
public Test4Class1 field2;
public static void method1(Test4Class1 arg0, int depth) {
if (depth == 0) return;
}
public void method2(int depth) {
if (depth == 0) return;
for (int local6 = 0; local6<=2; local6 += 1) {
for (int local7 = 0; local7<=2; local7 += 1) {
if (depth<=3) {
if (depth>3) {
for (int local8 = 0; local8<=1; local8 += 1) {
}
}else {
for (int local9 = 0; local9<=1; local9 += 1) {
}
}
}
}
}
}
}
class Test4Class2 extends Test4Class1 {
public Test4Class1 field3;
public Test4Class1 field4;
public Test4Class3 field5;
public Test4Class1 method3(Test4Class2 arg0, Test4Class1 arg1, int depth) {
if (depth == 0) return Test4Lib.local3;
if (depth<1) {
this.field5.method7(depth-1);
}else {
arg0.field4=arg1.field1.method7(depth-1);
}
this.field1.method6(this,depth-1);
for (int local10 = 0; local10<=2; local10 += 1) {
if (depth<1) {
if (depth<=3) {
for (int local11 = 0; local11<=1; local11 += 1) {
this.field3=this.method5(arg0.field4,this.field5,depth-1);
}
}else {
arg0.field5=arg0.field5;
}
}
}
arg0=this;
return this.field5;
}
public static void method4(Test4Class1 arg0, Test4Class3 arg1, int depth) {
if (depth == 0) return;
arg0.field1.method6(arg1.field6,depth-1);
for (int local12 = 0; local12<=1; local12 += 1) {
if (depth<=4) {
if (depth<1) {
for (int local13 = 0; local13<=3; local13 += 1) {
if (depth>=3) {
}
}
}
}
}
for (int local14 = 0; local14<=2; local14 += 1) {
for (int local15 = 0; local15<=1; local15 += 1) {
for (int local16 = 0; local16<=3; local16 += 1) {
arg1.field6.method3(arg1.field6,arg1,depth-1);
}
}
}
}
public static Test4Class2 method5(Test4Class1 arg0, Test4Class3 arg1, int depth) {
if (depth == 0) return Test4Lib.local4;
for (int local17 = 0; local17<=2; local17 += 1) {
if (depth==2) {
arg0.field1=arg1;
}
}
arg1=arg1.field1;
for (int local18 = 0; local18<=1; local18 += 1) {
if (depth>=4) {
arg1.field1.method6(arg1.field6,depth-1);
}else {
if (depth<1) {
arg1.field6=arg1.field6;
}else {
arg1=arg1;
}
}
}
arg1.field7=arg0.field1;
return arg1.field6;
}
}
class Test4Class3 extends Test4Class1 {
public Test4Class2 field6;
public Test4Class1 field7;
public static void method6(Test4Class2 arg0, int depth) {
if (depth == 0) return;
}
public static Test4Class1 method7(int depth) {
if (depth == 0) return Test4Lib.local4;
for (int local19 = 0; local19<=1; local19 += 1) {
for (int local20 = 0; local20<=3; local20 += 1) {
for (int local21 = 0; local21<=2; local21 += 1) {
for (int local22 = 0; local22<=3; local22 += 1) {
for (int local23 = 0; local23<=3; local23 += 1) {
}
}
}
}
}
if (depth>=1) {
if (depth<3) {
if (depth<2) {
if (depth==3) {
if (depth==4) {
}else {
}
}
}
}else {
if (depth>4) {
if (depth<=1) {
if (depth<1) {
}
}
}else {
if (depth>=1) {
for (int local24 = 0; local24<=2; local24 += 1) {
}
}
}
}
}
for (int local25 = 0; local25<=0; local25 += 1) {
if (depth<3) {
if (depth>3) {
if (depth>4) {
for (int local26 = 0; local26<=3; local26 += 1) {
}
}else {
if (depth==1) {
}
}
}else {
for (int local27 = 0; local27<=0; local27 += 1) {
if (depth>2) {
}
}
}
}
}
return Test4Lib.local5;
}
}
public class Test4{
public static void main(String[] args) {
int inputValue = 10;
Benchmark.alloc(1);
Test4Lib.local1 = new Test4Class1();
Benchmark.alloc(2);
Test4Lib.local2 = new Test4Class1();
Benchmark.alloc(3);
Test4Lib.local3 = new Test4Class1();
Benchmark.alloc(4);
Test4Lib.local4 = new Test4Class2();
Benchmark.alloc(5);
Test4Lib.local5 = new Test4Class3();
Test4Lib.local1.field1 = Test4Lib.local5;
Test4Lib.local1.field2 = Test4Lib.local4;
Test4Lib.local2.field1 = Test4Lib.local5;
Test4Lib.local2.field2 = Test4Lib.local3;
Test4Lib.local3.field1 = Test4Lib.local5;
Test4Lib.local3.field2 = Test4Lib.local3;
Test4Lib.local4.field3 = Test4Lib.local3;
Test4Lib.local4.field4 = Test4Lib.local5;
Test4Lib.local4.field5 = Test4Lib.local5;
Test4Lib.local4.field1 = Test4Lib.local5;
Test4Lib.local4.field2 = Test4Lib.local4;
Test4Lib.local5.field6 = Test4Lib.local4;
Test4Lib.local5.field7 = Test4Lib.local5;
Test4Lib.local5.field1 = Test4Lib.local5;
Test4Lib.local5.field2 = Test4Lib.local4;
for (int local28 = 0; local28<=2; local28 += 1) {
Test4Lib.local4.field5.method6(Test4Lib.local5.field6,3);
}
if (inputValue<=1) {
Test4Lib.local4=Test4Lib.local5.field6;
}else {
for (int local29 = 0; local29<=3; local29 += 1) {
Test4Lib.local5.field2=Test4Lib.local1;
}
}
for (int local30 = 0; local30<=0; local30 += 1) {
Test4Lib.local4.method3(Test4Lib.local4,Test4Lib.local1.field1,3);
}
Test4Lib.local4=Test4Lib.local4;
if (inputValue<=3) {
Test4Lib.local2=Test4Lib.local5.field2;
}
Benchmark.test(1,Test4Lib.local1);
Benchmark.test(2,Test4Lib.local2);
Benchmark.test(3,Test4Lib.local3);
Benchmark.test(4,Test4Lib.local4);
Benchmark.test(5,Test4Lib.local5);
Benchmark.test(6,Test4Lib.local1.field1);
Benchmark.test(7,Test4Lib.local1.field2);
Benchmark.test(8,Test4Lib.local2.field1);
Benchmark.test(9,Test4Lib.local2.field2);
Benchmark.test(10,Test4Lib.local3.field1);
Benchmark.test(11,Test4Lib.local3.field2);
Benchmark.test(12,Test4Lib.local4.field3);
Benchmark.test(13,Test4Lib.local4.field4);
Benchmark.test(14,Test4Lib.local4.field5);
Benchmark.test(15,Test4Lib.local4.field1);
Benchmark.test(16,Test4Lib.local4.field2);
Benchmark.test(17,Test4Lib.local5.field6);
Benchmark.test(18,Test4Lib.local5.field7);
Benchmark.test(19,Test4Lib.local5.field1);
Benchmark.test(20,Test4Lib.local5.field2);
Benchmark.print();
}
}
