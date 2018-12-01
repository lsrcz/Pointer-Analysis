package dataset;

import benchmark.internal.Benchmark;
import benchmark.tool.BasicClass;
class Test26Lib{
public static Test26Class1 local1;
public static Test26Class1 local2;
public static Test26Class1 local3;
public static Test26Class1 local4;
public static Test26Class2 local5;
public static Test26Class3 local6;
public static Test26Class3 local7;
public static Test26Class3 local8;
}
class Test26Class1 extends BasicClass {
public Test26Class1 field1;
public static void method1(int depth) {
if (depth == 0) return;
for (int local9 = 0; local9<=2; local9 += 1) {
for (int local10 = 0; local10<=3; local10 += 1) {
if (depth<=3) {
if (depth<4) {
if (depth>4) {
}else {
}
}
}else {
for (int local11 = 0; local11<=1; local11 += 1) {
for (int local12 = 0; local12<=0; local12 += 1) {
}
}
}
}
}
}
}
class Test26Class2 extends Test26Class1 {
public Test26Class2 field2;
public Test26Class1 field3;
public static void method2(Test26Class2 arg0, int depth) {
if (depth == 0) return;
arg0.field2=arg0.field2;
}
public static void method3(int depth) {
if (depth == 0) return;
for (int local13 = 0; local13<=3; local13 += 1) {
if (depth>1) {
if (depth>1) {
if (depth>2) {
for (int local14 = 0; local14<=3; local14 += 1) {
}
}else {
for (int local15 = 0; local15<=0; local15 += 1) {
}
}
}else {
for (int local16 = 0; local16<=2; local16 += 1) {
if (depth<4) {
}else {
}
}
}
}else {
for (int local17 = 0; local17<=1; local17 += 1) {
if (depth>1) {
for (int local18 = 0; local18<=2; local18 += 1) {
}
}else {
for (int local19 = 0; local19<=3; local19 += 1) {
}
}
}
}
}
}
public static void method4(int depth) {
if (depth == 0) return;
}
public static Test26Class3 method5(Test26Class3 arg0, int depth) {
if (depth == 0) return Test26Lib.local6;
return arg0;
}
public void method6(int depth) {
if (depth == 0) return;
for (int local20 = 0; local20<=2; local20 += 1) {
this.field2.method6(depth-1);
}
}
}
class Test26Class3 extends Test26Class1 {
public Test26Class1 field4;
public Test26Class1 field5;
public Test26Class1 field6;
public Test26Class3 method7(int depth) {
if (depth == 0) return Test26Lib.local6;
if (depth==3) {
if (depth>=1) {
for (int local21 = 0; local21<=3; local21 += 1) {
for (int local22 = 0; local22<=2; local22 += 1) {
this.field5=this.method7(depth-1);
}
}
}else {
for (int local23 = 0; local23<=0; local23 += 1) {
if (depth>1) {
for (int local24 = 0; local24<=3; local24 += 1) {
}
}else {
for (int local25 = 0; local25<=3; local25 += 1) {
}
}
}
}
}
return this;
}
public Test26Class2 method8(Test26Class2 arg0, int depth) {
if (depth == 0) return Test26Lib.local5;
return arg0.field2;
}
}
public class Test26{
public static void main(String[] args) {
int inputValue = 0;
Benchmark.alloc(1);
Test26Lib.local1 = new Test26Class1();
Benchmark.alloc(2);
Test26Lib.local2 = new Test26Class1();
Benchmark.alloc(3);
Test26Lib.local3 = new Test26Class1();
Benchmark.alloc(4);
Test26Lib.local4 = new Test26Class1();
Benchmark.alloc(5);
Test26Lib.local5 = new Test26Class2();
Benchmark.alloc(6);
Test26Lib.local6 = new Test26Class3();
Benchmark.alloc(7);
Test26Lib.local7 = new Test26Class3();
Benchmark.alloc(8);
Test26Lib.local8 = new Test26Class3();
Test26Lib.local1.field1 = Test26Lib.local3;
Test26Lib.local2.field1 = Test26Lib.local2;
Test26Lib.local3.field1 = Test26Lib.local6;
Test26Lib.local4.field1 = Test26Lib.local4;
Test26Lib.local5.field2 = Test26Lib.local5;
Test26Lib.local5.field3 = Test26Lib.local8;
Test26Lib.local5.field1 = Test26Lib.local4;
Test26Lib.local6.field4 = Test26Lib.local2;
Test26Lib.local6.field5 = Test26Lib.local4;
Test26Lib.local6.field6 = Test26Lib.local8;
Test26Lib.local6.field1 = Test26Lib.local8;
Test26Lib.local7.field4 = Test26Lib.local1;
Test26Lib.local7.field5 = Test26Lib.local4;
Test26Lib.local7.field6 = Test26Lib.local2;
Test26Lib.local7.field1 = Test26Lib.local8;
Test26Lib.local8.field4 = Test26Lib.local7;
Test26Lib.local8.field5 = Test26Lib.local6;
Test26Lib.local8.field6 = Test26Lib.local5;
Test26Lib.local8.field1 = Test26Lib.local2;
if (inputValue>=4) {
for (int local26 = 0; local26<=1; local26 += 1) {
Test26Lib.local5.method6(3);
}
}
if (inputValue>2) {
if (inputValue<=1) {
if (inputValue<=3) {
Test26Lib.local5.field2=Test26Lib.local5.field2;
}
}else {
if (inputValue<=4) {
if (inputValue<=2) {
Test26Lib.local5.field1=Test26Lib.local8.field1;
}
}else {
Test26Lib.local7=Test26Lib.local8;
}
}
}else {
if (inputValue==3) {
Test26Lib.local1.field1=Test26Lib.local8.method7(3);
}else {
if (inputValue==3) {
Test26Lib.local6.field4=Test26Lib.local6;
}else {
for (int local27 = 0; local27<=0; local27 += 1) {
Test26Lib.local7=Test26Lib.local6.method7(3);
}
}
}
}
for (int local28 = 0; local28<=2; local28 += 1) {
Test26Lib.local5.field2.method2(Test26Lib.local5.field2,3);
}
Benchmark.test(1,Test26Lib.local1);
Benchmark.test(2,Test26Lib.local2);
Benchmark.test(3,Test26Lib.local3);
Benchmark.test(4,Test26Lib.local4);
Benchmark.test(5,Test26Lib.local5);
Benchmark.test(6,Test26Lib.local6);
Benchmark.test(7,Test26Lib.local7);
Benchmark.test(8,Test26Lib.local8);
Benchmark.test(9,Test26Lib.local1.field1);
Benchmark.test(10,Test26Lib.local2.field1);
Benchmark.test(11,Test26Lib.local3.field1);
Benchmark.test(12,Test26Lib.local4.field1);
Benchmark.test(13,Test26Lib.local5.field2);
Benchmark.test(14,Test26Lib.local5.field3);
Benchmark.test(15,Test26Lib.local5.field1);
Benchmark.test(16,Test26Lib.local6.field4);
Benchmark.test(17,Test26Lib.local6.field5);
Benchmark.test(18,Test26Lib.local6.field6);
Benchmark.test(19,Test26Lib.local6.field1);
Benchmark.test(20,Test26Lib.local7.field4);
Benchmark.test(21,Test26Lib.local7.field5);
Benchmark.test(22,Test26Lib.local7.field6);
Benchmark.test(23,Test26Lib.local7.field1);
Benchmark.test(24,Test26Lib.local8.field4);
Benchmark.test(25,Test26Lib.local8.field5);
Benchmark.test(26,Test26Lib.local8.field6);
Benchmark.test(27,Test26Lib.local8.field1);
Benchmark.print();
}
}
