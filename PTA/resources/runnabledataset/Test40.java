package runnabledataset;

import benchmark.tool.Benchmark;
import benchmark.tool.BasicClass;
class Test40Lib{
public static Test40Class1 local1;
public static Test40Class1 local2;
public static Test40Class1 local3;
public static Test40Class1 local4;
public static Test40Class1 local5;
public static Test40Class2 local6;
public static Test40Class3 local7;
}
class Test40Class1 extends BasicClass {
public Test40Class2 field1;
public Test40Class2 field2;
public Test40Class1 method1(int depth) {
if (depth == 0) return Test40Lib.local1;
this.field2.field4.method4(this.field1.field4,depth-1);
return this.field1.field4.field1;
}
}
class Test40Class2 extends Test40Class1 {
public Test40Class3 field3;
public Test40Class3 field4;
public static void method2(Test40Class2 arg0, int depth) {
if (depth == 0) return;
}
public Test40Class3 method3(Test40Class1 arg0, int depth) {
if (depth == 0) return Test40Lib.local7;
this.field4.field4.field4.method1(depth-1);
return arg0.field1.field2.field3;
}
}
class Test40Class3 extends Test40Class2 {
public Test40Class2 field5;
public Test40Class1 field6;
public static Test40Class2 method4(Test40Class2 arg0, int depth) {
if (depth == 0) return Test40Lib.local7;
return arg0.field4.field1;
}
public void method5(Test40Class2 arg0, int depth) {
if (depth == 0) return;
}
}
public class Test40{
public static void main(String[] args) {
int inputValue = 10;
Benchmark.alloc(1);
Test40Lib.local1 = new Test40Class1();
Benchmark.alloc(2);
Test40Lib.local2 = new Test40Class1();
Benchmark.alloc(3);
Test40Lib.local3 = new Test40Class1();
Benchmark.alloc(4);
Test40Lib.local4 = new Test40Class1();
Benchmark.alloc(5);
Test40Lib.local5 = new Test40Class1();
Benchmark.alloc(6);
Test40Lib.local6 = new Test40Class2();
Benchmark.alloc(7);
Test40Lib.local7 = new Test40Class3();
Test40Lib.local1.field1 = Test40Lib.local7;
Test40Lib.local1.field2 = Test40Lib.local7;
Test40Lib.local2.field1 = Test40Lib.local7;
Test40Lib.local2.field2 = Test40Lib.local7;
Test40Lib.local3.field1 = Test40Lib.local7;
Test40Lib.local3.field2 = Test40Lib.local7;
Test40Lib.local4.field1 = Test40Lib.local6;
Test40Lib.local4.field2 = Test40Lib.local6;
Test40Lib.local5.field1 = Test40Lib.local7;
Test40Lib.local5.field2 = Test40Lib.local6;
Test40Lib.local6.field3 = Test40Lib.local7;
Test40Lib.local6.field4 = Test40Lib.local7;
Test40Lib.local6.field1 = Test40Lib.local7;
Test40Lib.local6.field2 = Test40Lib.local7;
Test40Lib.local7.field5 = Test40Lib.local7;
Test40Lib.local7.field6 = Test40Lib.local4;
Test40Lib.local7.field3 = Test40Lib.local7;
Test40Lib.local7.field4 = Test40Lib.local7;
Test40Lib.local7.field1 = Test40Lib.local7;
Test40Lib.local7.field2 = Test40Lib.local7;
if (inputValue==1) {
Test40Lib.local3.field1.field3.field5=Test40Lib.local7.field1.field4.field2;
}else {
for (int local8 = 0; local8<=2; local8 += 1) {
Test40Lib.local6.field4.field2=Test40Lib.local6.field3.field6.field2;
}
}
for (int local9 = 0; local9<=2; local9 += 1) {
if (inputValue<4) {
if (inputValue<=2) {
if (inputValue>2) {
if (inputValue>=3) {
}
}else {
for (int local10 = 0; local10<=2; local10 += 1) {
}
}
}else {
Test40Lib.local7.field3.field4.field2=Test40Lib.local7.field2.field4.field5;
}
}else {
for (int local11 = 0; local11<=3; local11 += 1) {
for (int local12 = 0; local12<=3; local12 += 1) {
Test40Lib.local5.field1.field2.field1=Test40Lib.local4.field2.field4.field3.method4(Test40Lib.local7.field5.field3.field5,3);
}
}
}
}
if (inputValue<3) {
for (int local13 = 0; local13<=2; local13 += 1) {
for (int local14 = 0; local14<=1; local14 += 1) {
if (inputValue<2) {
for (int local15 = 0; local15<=0; local15 += 1) {
}
}else {
Test40Lib.local7.field3.field6.field2=Test40Lib.local4.field1.field1.field3.method4(Test40Lib.local6.field3.field6.field1,3);
}
}
}
}
Benchmark.test(1,Test40Lib.local1);
Benchmark.test(2,Test40Lib.local2);
Benchmark.test(3,Test40Lib.local3);
Benchmark.test(4,Test40Lib.local4);
Benchmark.test(5,Test40Lib.local5);
Benchmark.test(6,Test40Lib.local6);
Benchmark.test(7,Test40Lib.local7);
Benchmark.test(8,Test40Lib.local1.field1);
Benchmark.test(9,Test40Lib.local1.field2);
Benchmark.test(10,Test40Lib.local2.field1);
Benchmark.test(11,Test40Lib.local2.field2);
Benchmark.test(12,Test40Lib.local3.field1);
Benchmark.test(13,Test40Lib.local3.field2);
Benchmark.test(14,Test40Lib.local4.field1);
Benchmark.test(15,Test40Lib.local4.field2);
Benchmark.test(16,Test40Lib.local5.field1);
Benchmark.test(17,Test40Lib.local5.field2);
Benchmark.test(18,Test40Lib.local6.field3);
Benchmark.test(19,Test40Lib.local6.field4);
Benchmark.test(20,Test40Lib.local6.field1);
Benchmark.test(21,Test40Lib.local6.field2);
Benchmark.test(22,Test40Lib.local7.field5);
Benchmark.test(23,Test40Lib.local7.field6);
Benchmark.test(24,Test40Lib.local7.field3);
Benchmark.test(25,Test40Lib.local7.field4);
Benchmark.test(26,Test40Lib.local7.field1);
Benchmark.test(27,Test40Lib.local7.field2);
Benchmark.print();
}
}
