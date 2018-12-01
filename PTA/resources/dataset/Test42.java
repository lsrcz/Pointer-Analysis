package dataset;

import benchmark.internal.Benchmark;
import benchmark.tool.BasicClass;
class Test42Lib{
public static Test42Class1 local1;
public static Test42Class2 local2;
public static Test42Class3 local3;
public static Test42Class3 local4;
public static Test42Class3 local5;
}
class Test42Class1 extends BasicClass {
public Test42Class3 field1;
public Test42Class1 field2;
public void method1(Test42Class1 arg0, Test42Class1 arg1, int depth) {
if (depth == 0) return;
if (depth<1) {
this.field1.field9.field4.method1(arg0.field1.field2,arg0.field1.field9.field4,depth-1);
}else {
if (depth<2) {
for (int local6 = 0; local6<=3; local6 += 1) {
for (int local7 = 0; local7<=2; local7 += 1) {
arg1.field2.method1(this.field1.field7,arg1.field1.field1.field5,depth-1);
}
}
}else {
for (int local8 = 0; local8<=1; local8 += 1) {
for (int local9 = 0; local9<=3; local9 += 1) {
this.field1.field8.field4.method4(arg0.field1.field9,arg1.field1.field8,depth-1);
}
}
}
}
}
}
class Test42Class2 extends Test42Class1 {
public Test42Class2 field3;
public Test42Class3 field4;
public void method2(int depth) {
if (depth == 0) return;
}
}
class Test42Class3 extends Test42Class1 {
public Test42Class2 field5;
public Test42Class3 field6;
public Test42Class2 field7;
public Test42Class2 field8;
public Test42Class2 field9;
public static Test42Class3 method3(Test42Class3 arg0, Test42Class2 arg1, int depth) {
if (depth == 0) return Test42Lib.local3;
return arg1.field1.field8.field1;
}
public void method4(Test42Class1 arg0, Test42Class2 arg1, int depth) {
if (depth == 0) return;
for (int local10 = 0; local10<=2; local10 += 1) {
arg1.field4.field6.field6.method1(this.field6.field9.field4,this.field7.field4.field2,depth-1);
}
}
}
public class Test42{
public static void main(String[] args) {
int inputValue = 0;
Benchmark.alloc(1);
Test42Lib.local1 = new Test42Class1();
Benchmark.alloc(2);
Test42Lib.local2 = new Test42Class2();
Benchmark.alloc(3);
Test42Lib.local3 = new Test42Class3();
Benchmark.alloc(4);
Test42Lib.local4 = new Test42Class3();
Benchmark.alloc(5);
Test42Lib.local5 = new Test42Class3();
Test42Lib.local1.field1 = Test42Lib.local3;
Test42Lib.local1.field2 = Test42Lib.local1;
Test42Lib.local2.field3 = Test42Lib.local2;
Test42Lib.local2.field4 = Test42Lib.local5;
Test42Lib.local2.field1 = Test42Lib.local5;
Test42Lib.local2.field2 = Test42Lib.local3;
Test42Lib.local3.field5 = Test42Lib.local2;
Test42Lib.local3.field6 = Test42Lib.local5;
Test42Lib.local3.field7 = Test42Lib.local2;
Test42Lib.local3.field8 = Test42Lib.local2;
Test42Lib.local3.field9 = Test42Lib.local2;
Test42Lib.local3.field1 = Test42Lib.local4;
Test42Lib.local3.field2 = Test42Lib.local4;
Test42Lib.local4.field5 = Test42Lib.local2;
Test42Lib.local4.field6 = Test42Lib.local5;
Test42Lib.local4.field7 = Test42Lib.local2;
Test42Lib.local4.field8 = Test42Lib.local2;
Test42Lib.local4.field9 = Test42Lib.local2;
Test42Lib.local4.field1 = Test42Lib.local3;
Test42Lib.local4.field2 = Test42Lib.local1;
Test42Lib.local5.field5 = Test42Lib.local2;
Test42Lib.local5.field6 = Test42Lib.local3;
Test42Lib.local5.field7 = Test42Lib.local2;
Test42Lib.local5.field8 = Test42Lib.local2;
Test42Lib.local5.field9 = Test42Lib.local2;
Test42Lib.local5.field1 = Test42Lib.local3;
Test42Lib.local5.field2 = Test42Lib.local5;
if (inputValue<4) {
Test42Lib.local2.field4.field9.field2=Test42Lib.local4.field1.field8.field4;
}else {
Test42Lib.local2.field4.field1.field1=Test42Lib.local5.field1.field5.field1;
}
for (int local11 = 0; local11<=2; local11 += 1) {
Test42Lib.local4.field1.field2.field1=Test42Lib.local3.field9.field4.field6;
}
for (int local12 = 0; local12<=2; local12 += 1) {
Test42Lib.local5.field1.field5.field1.method1(Test42Lib.local4.field6.field1.field1,Test42Lib.local3.field2.field1.field8,3);
}
Benchmark.test(1,Test42Lib.local1);
Benchmark.test(2,Test42Lib.local2);
Benchmark.test(3,Test42Lib.local3);
Benchmark.test(4,Test42Lib.local4);
Benchmark.test(5,Test42Lib.local5);
Benchmark.test(6,Test42Lib.local1.field1);
Benchmark.test(7,Test42Lib.local1.field2);
Benchmark.test(8,Test42Lib.local2.field3);
Benchmark.test(9,Test42Lib.local2.field4);
Benchmark.test(10,Test42Lib.local2.field1);
Benchmark.test(11,Test42Lib.local2.field2);
Benchmark.test(12,Test42Lib.local3.field5);
Benchmark.test(13,Test42Lib.local3.field6);
Benchmark.test(14,Test42Lib.local3.field7);
Benchmark.test(15,Test42Lib.local3.field8);
Benchmark.test(16,Test42Lib.local3.field9);
Benchmark.test(17,Test42Lib.local3.field1);
Benchmark.test(18,Test42Lib.local3.field2);
Benchmark.test(19,Test42Lib.local4.field5);
Benchmark.test(20,Test42Lib.local4.field6);
Benchmark.test(21,Test42Lib.local4.field7);
Benchmark.test(22,Test42Lib.local4.field8);
Benchmark.test(23,Test42Lib.local4.field9);
Benchmark.test(24,Test42Lib.local4.field1);
Benchmark.test(25,Test42Lib.local4.field2);
Benchmark.test(26,Test42Lib.local5.field5);
Benchmark.test(27,Test42Lib.local5.field6);
Benchmark.test(28,Test42Lib.local5.field7);
Benchmark.test(29,Test42Lib.local5.field8);
Benchmark.test(30,Test42Lib.local5.field9);
Benchmark.test(31,Test42Lib.local5.field1);
Benchmark.test(32,Test42Lib.local5.field2);
Benchmark.print();
}
}
