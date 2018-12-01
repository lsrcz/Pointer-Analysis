package dataset;

import benchmark.internal.Benchmark;
import benchmark.tool.BasicClass;
class Test66Lib{
public static Test66Class1 local1;
public static Test66Class2 local2;
}
class Test66Class1 extends BasicClass {
public Test66Class1 field1;
public Test66Class2 field2;
public Test66Class1 field3;
public static Test66Class2 method1(Test66Class2 arg0, Test66Class2 arg1, int depth) {
if (depth == 0) return Test66Lib.local2;
for (int local3 = 0; local3<=1; local3 += 1) {
for (int local4 = 0; local4<=0; local4 += 1) {
arg1.field2.field7.field2.method2(arg1.field1.field2.field6,arg0.field4,depth-1);
}
}
if (depth<4) {
for (int local5 = 0; local5<=2; local5 += 1) {
for (int local6 = 0; local6<=2; local6 += 1) {
arg1.field4.field2.field3=arg1.field7.field6;
}
}
}
for (int local7 = 0; local7<=0; local7 += 1) {
if (depth>=1) {
arg1.field7.field4.field6=arg0.field2.field7.method2(arg1.field4.field2.field7,arg1.field5.field5.field1,depth-1);
}else {
if (depth>=4) {
for (int local8 = 0; local8<=1; local8 += 1) {
arg0.field5.field2=arg1.field4.field2.field2;
}
}
}
}
for (int local9 = 0; local9<=0; local9 += 1) {
arg0.field3.field3.field1=arg0.field4.field1;
}
return arg1.field7.field4;
}
}
class Test66Class2 extends Test66Class1 {
public Test66Class2 field4;
public Test66Class2 field5;
public Test66Class1 field6;
public Test66Class2 field7;
public Test66Class2 method2(Test66Class1 arg0, Test66Class1 arg1, int depth) {
if (depth == 0) return Test66Lib.local2;
arg0.field2.field3.field1=this.field2.field1.field1;
for (int local10 = 0; local10<=0; local10 += 1) {
this.field5.field2.field3=this.field7.field7.field2;
}
if (depth<1) {
this.field7.field6.field2=this.field4.field5;
}
return this.field7.field2;
}
}
public class Test66{
public static void main(String[] args) {
int inputValue = 0;
Benchmark.alloc(1);
Test66Lib.local1 = new Test66Class1();
Benchmark.alloc(2);
Test66Lib.local2 = new Test66Class2();
Test66Lib.local1.field1 = Test66Lib.local1;
Test66Lib.local1.field2 = Test66Lib.local2;
Test66Lib.local1.field3 = Test66Lib.local1;
Test66Lib.local2.field4 = Test66Lib.local2;
Test66Lib.local2.field5 = Test66Lib.local2;
Test66Lib.local2.field6 = Test66Lib.local2;
Test66Lib.local2.field7 = Test66Lib.local2;
Test66Lib.local2.field1 = Test66Lib.local1;
Test66Lib.local2.field2 = Test66Lib.local2;
Test66Lib.local2.field3 = Test66Lib.local1;
Test66Lib.local2.field3.field2.field6=Test66Lib.local2.field7.field4.field3;
if (inputValue>4) {
if (inputValue<=1) {
if (inputValue>2) {
for (int local11 = 0; local11<=0; local11 += 1) {
Test66Lib.local2.field4.field2.field7=Test66Lib.local2.field6.field2;
}
}else {
Test66Lib.local2.field5.field2.field7=Test66Lib.local1.field2.field2.field5;
}
}
}
for (int local12 = 0; local12<=1; local12 += 1) {
if (inputValue<=1) {
Test66Lib.local2.field4.field5.field3=Test66Lib.local1.field3.field2.field4;
}else {
for (int local13 = 0; local13<=3; local13 += 1) {
for (int local14 = 0; local14<=0; local14 += 1) {
for (int local15 = 0; local15<=2; local15 += 1) {
}
}
}
}
}
Test66Lib.local2.field7.field1=Test66Lib.local2.field7.field7.field3;
for (int local16 = 0; local16<=3; local16 += 1) {
for (int local17 = 0; local17<=1; local17 += 1) {
Test66Lib.local2.field2.field5.field2.method2(Test66Lib.local1.field3.field2.field5,Test66Lib.local2.field1.field3,3);
}
}
Test66Lib.local1.field1.field2.field5=Test66Lib.local2.field2.field1.field2;
Test66Lib.local2.field6.field3.field2=Test66Lib.local2.field5.field7.field4.method2(Test66Lib.local2.field7.field3.field1,Test66Lib.local2.field7.field4.field1,3);
Test66Lib.local2.field1.field1.field1=Test66Lib.local2.field4.field5.field6;
Test66Lib.local1.field2.field4.field6=Test66Lib.local2.field2.field4.method2(Test66Lib.local2.field4.field7.field5,Test66Lib.local1.field2.field3,3);
Test66Lib.local2.field4.field6=Test66Lib.local1.field2.field2.method1(Test66Lib.local2.field5.field2,Test66Lib.local2.field6.field2.field5,3);
Benchmark.test(1,Test66Lib.local1);
Benchmark.test(2,Test66Lib.local2);
Benchmark.test(3,Test66Lib.local1.field1);
Benchmark.test(4,Test66Lib.local1.field2);
Benchmark.test(5,Test66Lib.local1.field3);
Benchmark.test(6,Test66Lib.local2.field4);
Benchmark.test(7,Test66Lib.local2.field5);
Benchmark.test(8,Test66Lib.local2.field6);
Benchmark.test(9,Test66Lib.local2.field7);
Benchmark.test(10,Test66Lib.local2.field1);
Benchmark.test(11,Test66Lib.local2.field2);
Benchmark.test(12,Test66Lib.local2.field3);
Benchmark.print();
}
}
