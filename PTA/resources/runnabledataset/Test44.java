package runnabledataset;

import benchmark.tool.Benchmark;
import benchmark.tool.BasicClass;
class Test44Lib{
public static Test44Class1 local1;
public static Test44Class1 local2;
public static Test44Class2 local3;
public static Test44Class3 local4;
}
class Test44Class1 extends BasicClass {
public static Test44Class3 field1;
public Test44Class3 field2;
public static Test44Class1 field3;
public Test44Class3 field4;
public static Test44Class1 field5;
public Test44Class1 field6;
public static Test44Class2 method1(Test44Class1 arg0, Test44Class2 arg1, int depth) {
if (depth == 0) return Test44Lib.local4;
arg1.field2.method6(depth-1);
return field3.field4;
}
}
class Test44Class2 extends Test44Class1 {
public Test44Class1 field7;
public static Test44Class3 field8;
public Test44Class1 field9;
public static Test44Class3 method2(int depth) {
if (depth == 0) return Test44Lib.local4;
return field1.field1;
}
public static Test44Class1 method3(Test44Class3 arg0, Test44Class1 arg1, int depth) {
if (depth == 0) return Test44Lib.local4;
field1.field15=field8;
if (depth>3) {
if (depth>2) {
field8.field6=arg0.field2;
}else {
if (depth<=4) {
for (int local5 = 0; local5<=2; local5 += 1) {
field3.field1.method4(arg0.field1,field8.field6,depth-1);
}
}else {
field1=field3.field2;
}
}
}else {
arg0.field12=field1.field11;
}
return arg0.field12;
}
public Test44Class3 method4(Test44Class3 arg0, Test44Class1 arg1, int depth) {
if (depth == 0) return Test44Lib.local4;
return this.field1;
}
}
class Test44Class3 extends Test44Class2 {
public static Test44Class3 field10;
public static Test44Class3 field11;
public static Test44Class3 field12;
public Test44Class3 field13;
public static Test44Class3 field14;
public static Test44Class2 field15;
public static Test44Class3 method5(Test44Class2 arg0, Test44Class1 arg1, int depth) {
if (depth == 0) return Test44Lib.local4;
return field12.field14;
}
public static void method6(int depth) {
if (depth == 0) return;
}
}
public class Test44{
public static void main(String[] args) {
int inputValue = 10;
Benchmark.alloc(1);
Test44Lib.local1 = new Test44Class1();
Benchmark.alloc(2);
Test44Lib.local2 = new Test44Class1();
Benchmark.alloc(3);
Test44Lib.local3 = new Test44Class2();
Benchmark.alloc(4);
Test44Lib.local4 = new Test44Class3();
Test44Lib.local1.field1 = Test44Lib.local4;
Test44Lib.local1.field2 = Test44Lib.local4;
Test44Lib.local1.field3 = Test44Lib.local2;
Test44Lib.local1.field4 = Test44Lib.local4;
Test44Lib.local1.field5 = Test44Lib.local1;
Test44Lib.local1.field6 = Test44Lib.local3;
Test44Lib.local2.field1 = Test44Lib.local4;
Test44Lib.local2.field2 = Test44Lib.local4;
Test44Lib.local2.field3 = Test44Lib.local2;
Test44Lib.local2.field4 = Test44Lib.local4;
Test44Lib.local2.field5 = Test44Lib.local2;
Test44Lib.local2.field6 = Test44Lib.local2;
Test44Lib.local3.field7 = Test44Lib.local1;
Test44Lib.local3.field8 = Test44Lib.local4;
Test44Lib.local3.field9 = Test44Lib.local3;
Test44Lib.local3.field1 = Test44Lib.local4;
Test44Lib.local3.field2 = Test44Lib.local4;
Test44Lib.local3.field3 = Test44Lib.local3;
Test44Lib.local3.field4 = Test44Lib.local4;
Test44Lib.local3.field5 = Test44Lib.local2;
Test44Lib.local3.field6 = Test44Lib.local3;
Test44Lib.local4.field10 = Test44Lib.local4;
Test44Lib.local4.field11 = Test44Lib.local4;
Test44Lib.local4.field12 = Test44Lib.local4;
Test44Lib.local4.field13 = Test44Lib.local4;
Test44Lib.local4.field14 = Test44Lib.local4;
Test44Lib.local4.field15 = Test44Lib.local4;
Test44Lib.local4.field7 = Test44Lib.local1;
Test44Lib.local4.field8 = Test44Lib.local4;
Test44Lib.local4.field9 = Test44Lib.local4;
Test44Lib.local4.field1 = Test44Lib.local4;
Test44Lib.local4.field2 = Test44Lib.local4;
Test44Lib.local4.field3 = Test44Lib.local2;
Test44Lib.local4.field4 = Test44Lib.local4;
Test44Lib.local4.field5 = Test44Lib.local3;
Test44Lib.local4.field6 = Test44Lib.local2;
Test44Lib.local1.field5=Test44Lib.local3.field8.method4(Test44Lib.local4.field13,Test44Lib.local4.field15,3);
for (int local6 = 0; local6<=3; local6 += 1) {
for (int local7 = 0; local7<=3; local7 += 1) {
if (inputValue<3) {
Test44Lib.local4.field3=Test44Lib.local1.field1;
}
}
}
Test44Lib.local3.field2=Test44Lib.local3.field2.method2(3);
Benchmark.test(1,Test44Lib.local1);
Benchmark.test(2,Test44Lib.local2);
Benchmark.test(3,Test44Lib.local3);
Benchmark.test(4,Test44Lib.local4);
Benchmark.test(5,Test44Lib.local1.field1);
Benchmark.test(6,Test44Lib.local1.field2);
Benchmark.test(7,Test44Lib.local1.field3);
Benchmark.test(8,Test44Lib.local1.field4);
Benchmark.test(9,Test44Lib.local1.field5);
Benchmark.test(10,Test44Lib.local1.field6);
Benchmark.test(11,Test44Lib.local2.field1);
Benchmark.test(12,Test44Lib.local2.field2);
Benchmark.test(13,Test44Lib.local2.field3);
Benchmark.test(14,Test44Lib.local2.field4);
Benchmark.test(15,Test44Lib.local2.field5);
Benchmark.test(16,Test44Lib.local2.field6);
Benchmark.test(17,Test44Lib.local3.field7);
Benchmark.test(18,Test44Lib.local3.field8);
Benchmark.test(19,Test44Lib.local3.field9);
Benchmark.test(20,Test44Lib.local3.field1);
Benchmark.test(21,Test44Lib.local3.field2);
Benchmark.test(22,Test44Lib.local3.field3);
Benchmark.test(23,Test44Lib.local3.field4);
Benchmark.test(24,Test44Lib.local3.field5);
Benchmark.test(25,Test44Lib.local3.field6);
Benchmark.test(26,Test44Lib.local4.field10);
Benchmark.test(27,Test44Lib.local4.field11);
Benchmark.test(28,Test44Lib.local4.field12);
Benchmark.test(29,Test44Lib.local4.field13);
Benchmark.test(30,Test44Lib.local4.field14);
Benchmark.test(31,Test44Lib.local4.field15);
Benchmark.test(32,Test44Lib.local4.field7);
Benchmark.test(33,Test44Lib.local4.field8);
Benchmark.test(34,Test44Lib.local4.field9);
Benchmark.test(35,Test44Lib.local4.field1);
Benchmark.test(36,Test44Lib.local4.field2);
Benchmark.test(37,Test44Lib.local4.field3);
Benchmark.test(38,Test44Lib.local4.field4);
Benchmark.test(39,Test44Lib.local4.field5);
Benchmark.test(40,Test44Lib.local4.field6);
Benchmark.print();
}
}
