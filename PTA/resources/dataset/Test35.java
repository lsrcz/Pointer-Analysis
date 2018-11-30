package dataset;

import benchmark.internal.Benchmark;
import benchmark.tool.BasicClass;
class Test35Lib{
public static Test35Class1 local1;
public static Test35Class1 local2;
public static Test35Class1 local3;
public static Test35Class2 local4;
public static Test35Class3 local5;
}
class Test35Class1 extends BasicClass {
public static Test35Class2 field1;
public Test35Class3 field2;
public Test35Class2 field3;
public Test35Class2 field4;
public static void method1(Test35Class3 arg0, Test35Class3 arg1, int depth) {
if (depth == 0) return;
}
}
class Test35Class2 extends Test35Class1 {
public Test35Class1 field5;
public Test35Class2 field6;
public static Test35Class1 field7;
public static Test35Class2 field8;
public Test35Class1 field9;
public Test35Class2 field10;
public static void method2(int depth) {
if (depth == 0) return;
if (depth>=3) {
if (depth<=3) {
field1.method2(depth-1);
}
}else {
field8.field8=field8.field3;
}
field1.field8=field1.field8;
}
}
class Test35Class3 extends Test35Class2 {
public Test35Class3 field11;
public static void method3(Test35Class1 arg0, Test35Class3 arg1, int depth) {
if (depth == 0) return;
if (depth<=2) {
for (int local6 = 0; local6<=1; local6 += 1) {
for (int local7 = 0; local7<=3; local7 += 1) {
for (int local8 = 0; local8<=2; local8 += 1) {
arg0.field2.method3(arg1,field1.field2,depth-1);
}
}
}
}
}
}
public class Test35{
public static void main(String[] args) {
int inputValue = 0;
Benchmark.alloc(1);
Test35Lib.local1 = new Test35Class1();
Benchmark.alloc(2);
Test35Lib.local2 = new Test35Class1();
Benchmark.alloc(3);
Test35Lib.local3 = new Test35Class1();
Benchmark.alloc(4);
Test35Lib.local4 = new Test35Class2();
Benchmark.alloc(5);
Test35Lib.local5 = new Test35Class3();
Test35Lib.local1.field1 = Test35Lib.local5;
Test35Lib.local1.field2 = Test35Lib.local5;
Test35Lib.local1.field3 = Test35Lib.local4;
Test35Lib.local1.field4 = Test35Lib.local4;
Test35Lib.local2.field1 = Test35Lib.local4;
Test35Lib.local2.field2 = Test35Lib.local5;
Test35Lib.local2.field3 = Test35Lib.local4;
Test35Lib.local2.field4 = Test35Lib.local4;
Test35Lib.local3.field1 = Test35Lib.local5;
Test35Lib.local3.field2 = Test35Lib.local5;
Test35Lib.local3.field3 = Test35Lib.local5;
Test35Lib.local3.field4 = Test35Lib.local4;
Test35Lib.local4.field5 = Test35Lib.local4;
Test35Lib.local4.field6 = Test35Lib.local5;
Test35Lib.local4.field7 = Test35Lib.local5;
Test35Lib.local4.field8 = Test35Lib.local5;
Test35Lib.local4.field9 = Test35Lib.local2;
Test35Lib.local4.field10 = Test35Lib.local4;
Test35Lib.local4.field1 = Test35Lib.local5;
Test35Lib.local4.field2 = Test35Lib.local5;
Test35Lib.local4.field3 = Test35Lib.local5;
Test35Lib.local4.field4 = Test35Lib.local5;
Test35Lib.local5.field11 = Test35Lib.local5;
Test35Lib.local5.field5 = Test35Lib.local2;
Test35Lib.local5.field6 = Test35Lib.local4;
Test35Lib.local5.field7 = Test35Lib.local3;
Test35Lib.local5.field8 = Test35Lib.local5;
Test35Lib.local5.field9 = Test35Lib.local3;
Test35Lib.local5.field10 = Test35Lib.local4;
Test35Lib.local5.field1 = Test35Lib.local4;
Test35Lib.local5.field2 = Test35Lib.local5;
Test35Lib.local5.field3 = Test35Lib.local4;
Test35Lib.local5.field4 = Test35Lib.local5;
Test35Lib.local3.field4.method1(Test35Lib.local5.field11,Test35Lib.local5,3);
Test35Lib.local5.field6.method1(Test35Lib.local5.field2,Test35Lib.local5.field2,3);
Test35Lib.local2.field2.method3(Test35Lib.local1.field1,Test35Lib.local2.field2,3);
Benchmark.test(1,Test35Lib.local1);
Benchmark.test(2,Test35Lib.local2);
Benchmark.test(3,Test35Lib.local3);
Benchmark.test(4,Test35Lib.local4);
Benchmark.test(5,Test35Lib.local5);
Benchmark.test(6,Test35Lib.local1.field1);
Benchmark.test(7,Test35Lib.local1.field2);
Benchmark.test(8,Test35Lib.local1.field3);
Benchmark.test(9,Test35Lib.local1.field4);
Benchmark.test(10,Test35Lib.local2.field1);
Benchmark.test(11,Test35Lib.local2.field2);
Benchmark.test(12,Test35Lib.local2.field3);
Benchmark.test(13,Test35Lib.local2.field4);
Benchmark.test(14,Test35Lib.local3.field1);
Benchmark.test(15,Test35Lib.local3.field2);
Benchmark.test(16,Test35Lib.local3.field3);
Benchmark.test(17,Test35Lib.local3.field4);
Benchmark.test(18,Test35Lib.local4.field5);
Benchmark.test(19,Test35Lib.local4.field6);
Benchmark.test(20,Test35Lib.local4.field7);
Benchmark.test(21,Test35Lib.local4.field8);
Benchmark.test(22,Test35Lib.local4.field9);
Benchmark.test(23,Test35Lib.local4.field10);
Benchmark.test(24,Test35Lib.local4.field1);
Benchmark.test(25,Test35Lib.local4.field2);
Benchmark.test(26,Test35Lib.local4.field3);
Benchmark.test(27,Test35Lib.local4.field4);
Benchmark.test(28,Test35Lib.local5.field11);
Benchmark.test(29,Test35Lib.local5.field5);
Benchmark.test(30,Test35Lib.local5.field6);
Benchmark.test(31,Test35Lib.local5.field7);
Benchmark.test(32,Test35Lib.local5.field8);
Benchmark.test(33,Test35Lib.local5.field9);
Benchmark.test(34,Test35Lib.local5.field10);
Benchmark.test(35,Test35Lib.local5.field1);
Benchmark.test(36,Test35Lib.local5.field2);
Benchmark.test(37,Test35Lib.local5.field3);
Benchmark.test(38,Test35Lib.local5.field4);
Benchmark.print();
}
}
