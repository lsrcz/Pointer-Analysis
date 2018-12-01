package runnabledataset;

import benchmark.tool.Benchmark;
import benchmark.tool.BasicClass;
class Test72Lib{
public static Test72Class1 local1;
public static Test72Class1 local2;
public static Test72Class2 local3;
public static Test72Class2 local4;
}
class Test72Class1 extends BasicClass {
public Test72Class1 field1;
public Test72Class2 field2;
public static Test72Class2 method1(Test72Class1 arg0, int depth) {
if (depth == 0) return Test72Lib.local3;
if (depth<=3) {
arg0.field2=arg0.field1.field2.field4;
}else {
arg0.field1.field2.field3=arg0.field2.field3.field2;
}
if (depth>=4) {
arg0.field2.field2.field2=arg0.field1.method1(arg0.field2.field3.field2,depth-1);
}
if (depth<=3) {
if (depth<1) {
for (int local5 = 0; local5<=2; local5 += 1) {
arg0.field2.field2.field4=arg0.field2.field2.field2;
}
}else {
arg0.field2.field4.field4=arg0.field2.field3.field2;
}
}
if (depth==3) {
if (depth<3) {
for (int local6 = 0; local6<=2; local6 += 1) {
for (int local7 = 0; local7<=2; local7 += 1) {
if (depth>4) {
}
}
}
}
}
return arg0.field2.field5.field2;
}
}
class Test72Class2 extends Test72Class1 {
public Test72Class1 field3;
public Test72Class2 field4;
public Test72Class1 field5;
public Test72Class1 field6;
public static Test72Class1 method2(Test72Class2 arg0, int depth) {
if (depth == 0) return Test72Lib.local2;
arg0.field3=arg0.field2.field4.field2.method2(arg0.field2.field1.field2,depth-1);
arg0.field4.field1.method1(arg0.field1.field2.field2,depth-1);
arg0.field4.field4.field6.method1(arg0.field5.field2.field2,depth-1);
if (depth<4) {
if (depth<=2) {
arg0.field6.field2=arg0.field5.field2.field4;
}
}else {
for (int local8 = 0; local8<=0; local8 += 1) {
arg0.field2.field1.field1=arg0.field5.field2.field5.method1(arg0.field3.field2.field2,depth-1);
}
}
return arg0.field1.field2.field1;
}
}
public class Test72{
public static void main(String[] args) {
int inputValue = 10;
Benchmark.alloc(1);
Test72Lib.local1 = new Test72Class1();
Benchmark.alloc(2);
Test72Lib.local2 = new Test72Class1();
Benchmark.alloc(3);
Test72Lib.local3 = new Test72Class2();
Benchmark.alloc(4);
Test72Lib.local4 = new Test72Class2();
Test72Lib.local1.field1 = Test72Lib.local1;
Test72Lib.local1.field2 = Test72Lib.local3;
Test72Lib.local2.field1 = Test72Lib.local2;
Test72Lib.local2.field2 = Test72Lib.local4;
Test72Lib.local3.field3 = Test72Lib.local2;
Test72Lib.local3.field4 = Test72Lib.local4;
Test72Lib.local3.field5 = Test72Lib.local2;
Test72Lib.local3.field6 = Test72Lib.local1;
Test72Lib.local3.field1 = Test72Lib.local2;
Test72Lib.local3.field2 = Test72Lib.local3;
Test72Lib.local4.field3 = Test72Lib.local1;
Test72Lib.local4.field4 = Test72Lib.local4;
Test72Lib.local4.field5 = Test72Lib.local2;
Test72Lib.local4.field6 = Test72Lib.local3;
Test72Lib.local4.field1 = Test72Lib.local4;
Test72Lib.local4.field2 = Test72Lib.local3;
Test72Lib.local3.field4.field3.field2=Test72Lib.local1.field1.field1.field2;
Test72Lib.local2.field2.field4.field5=Test72Lib.local2.field2.field1.field1.method1(Test72Lib.local2.field2.field4.field1,3);
for (int local9 = 0; local9<=0; local9 += 1) {
Test72Lib.local3.field4.field2.field5=Test72Lib.local1.field1.field2.field4.method2(Test72Lib.local4.field6.field2.field4,3);
}
if (inputValue>3) {
for (int local10 = 0; local10<=3; local10 += 1) {
Test72Lib.local2.field1.field2.field5=Test72Lib.local4.field2.field4.field4.method1(Test72Lib.local3.field2,3);
}
}else {
Test72Lib.local4.field2.field2.method2(Test72Lib.local4.field1.field2,3);
}
Test72Lib.local2.field2.field1.field2=Test72Lib.local4.field4.field4.field2;
for (int local11 = 0; local11<=2; local11 += 1) {
for (int local12 = 0; local12<=0; local12 += 1) {
for (int local13 = 0; local13<=2; local13 += 1) {
Test72Lib.local4.field4.field6=Test72Lib.local4.field1.field2.field2.method1(Test72Lib.local2.field1.field2.field6,3);
}
}
}
for (int local14 = 0; local14<=3; local14 += 1) {
for (int local15 = 0; local15<=3; local15 += 1) {
if (inputValue==1) {
for (int local16 = 0; local16<=0; local16 += 1) {
Test72Lib.local3.field3.field1.field1=Test72Lib.local3.field4.field1;
}
}else {
Test72Lib.local4.field4.field4.field4.method2(Test72Lib.local3.field3.field2.field2,3);
}
}
}
if (inputValue<2) {
Test72Lib.local2.field2.field4=Test72Lib.local4.field3.field2.field2.method1(Test72Lib.local3.field3.field2.field2,3);
}
for (int local17 = 0; local17<=0; local17 += 1) {
if (inputValue<2) {
Test72Lib.local1.field2.field5=Test72Lib.local1.field2.field4.field4.method2(Test72Lib.local3.field3.field2.field2,3);
}
}
if (inputValue<=4) {
Test72Lib.local3.field6.field2.method2(Test72Lib.local3.field1.field2,3);
}else {
Test72Lib.local3.field4.field5.field1=Test72Lib.local2.field2.field2.field2.method2(Test72Lib.local2.field2.field1.field2,3);
}
Benchmark.test(1,Test72Lib.local1);
Benchmark.test(2,Test72Lib.local2);
Benchmark.test(3,Test72Lib.local3);
Benchmark.test(4,Test72Lib.local4);
Benchmark.test(5,Test72Lib.local1.field1);
Benchmark.test(6,Test72Lib.local1.field2);
Benchmark.test(7,Test72Lib.local2.field1);
Benchmark.test(8,Test72Lib.local2.field2);
Benchmark.test(9,Test72Lib.local3.field3);
Benchmark.test(10,Test72Lib.local3.field4);
Benchmark.test(11,Test72Lib.local3.field5);
Benchmark.test(12,Test72Lib.local3.field6);
Benchmark.test(13,Test72Lib.local3.field1);
Benchmark.test(14,Test72Lib.local3.field2);
Benchmark.test(15,Test72Lib.local4.field3);
Benchmark.test(16,Test72Lib.local4.field4);
Benchmark.test(17,Test72Lib.local4.field5);
Benchmark.test(18,Test72Lib.local4.field6);
Benchmark.test(19,Test72Lib.local4.field1);
Benchmark.test(20,Test72Lib.local4.field2);
Benchmark.print();
}
}
