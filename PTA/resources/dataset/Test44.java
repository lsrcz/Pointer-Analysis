package dataset;

import benchmark.internal.Benchmark;
import benchmark.tool.BasicClass;
class Test44Lib{
public static Test44Class1 local1;
public static Test44Class1 local2;
public static Test44Class1 local3;
public static Test44Class1 local4;
public static Test44Class1 local5;
public static Test44Class2 local6;
public static Test44Class2 local7;
public static Test44Class2 local8;
public static Test44Class3 local9;
public static Test44Class3 local10;
}
class Test44Class1 extends BasicClass {
public Test44Class3 field1;
public Test44Class2 field2;
public Test44Class3 field3;
public void method1(int depth) {
if (depth == 0) return;
}
public Test44Class2 method2(int depth) {
if (depth == 0) return Test44Lib.local8;
this.field2.field1.field2=this.field3.field2;
return this.field1.field2.field4;
}
}
class Test44Class2 extends Test44Class1 {
public Test44Class2 field4;
public Test44Class2 field5;
public Test44Class1 field6;
public Test44Class3 field7;
public void method3(int depth) {
if (depth == 0) return;
}
public void method4(Test44Class1 arg0, Test44Class2 arg1, int depth) {
if (depth == 0) return;
this.field1.field2.field6=this.field1.field9.field1;
}
public static void method5(Test44Class2 arg0, Test44Class3 arg1, int depth) {
if (depth == 0) return;
if (depth<3) {
arg0.field6.field1.field2=arg0.field6.field3.field1.method2(depth-1);
}
}
}
class Test44Class3 extends Test44Class1 {
public Test44Class3 field8;
public Test44Class1 field9;
public static Test44Class2 method6(Test44Class3 arg0, int depth) {
if (depth == 0) return Test44Lib.local6;
if (depth==1) {
arg0.field3.field8.field2.method5(arg0.field2.field6.field2,arg0.field8.field1.field3,depth-1);
}
return arg0.field8.field2;
}
public void method7(int depth) {
if (depth == 0) return;
this.field8.field1.field8.method1(depth-1);
}
public void method8(Test44Class3 arg0, Test44Class3 arg1, int depth) {
if (depth == 0) return;
arg0.field1.field2.field2=arg1.field2.field5.field2;
}
}
public class Test44{
public static void main(String[] args) {
int inputValue = 0;
Benchmark.alloc(1);
Test44Lib.local1 = new Test44Class1();
Benchmark.alloc(2);
Test44Lib.local2 = new Test44Class1();
Benchmark.alloc(3);
Test44Lib.local3 = new Test44Class1();
Benchmark.alloc(4);
Test44Lib.local4 = new Test44Class1();
Benchmark.alloc(5);
Test44Lib.local5 = new Test44Class1();
Benchmark.alloc(6);
Test44Lib.local6 = new Test44Class2();
Benchmark.alloc(7);
Test44Lib.local7 = new Test44Class2();
Benchmark.alloc(8);
Test44Lib.local8 = new Test44Class2();
Benchmark.alloc(9);
Test44Lib.local9 = new Test44Class3();
Benchmark.alloc(10);
Test44Lib.local10 = new Test44Class3();
Test44Lib.local1.field1 = Test44Lib.local9;
Test44Lib.local1.field2 = Test44Lib.local6;
Test44Lib.local1.field3 = Test44Lib.local10;
Test44Lib.local2.field1 = Test44Lib.local9;
Test44Lib.local2.field2 = Test44Lib.local8;
Test44Lib.local2.field3 = Test44Lib.local10;
Test44Lib.local3.field1 = Test44Lib.local9;
Test44Lib.local3.field2 = Test44Lib.local7;
Test44Lib.local3.field3 = Test44Lib.local10;
Test44Lib.local4.field1 = Test44Lib.local10;
Test44Lib.local4.field2 = Test44Lib.local6;
Test44Lib.local4.field3 = Test44Lib.local10;
Test44Lib.local5.field1 = Test44Lib.local10;
Test44Lib.local5.field2 = Test44Lib.local6;
Test44Lib.local5.field3 = Test44Lib.local9;
Test44Lib.local6.field4 = Test44Lib.local7;
Test44Lib.local6.field5 = Test44Lib.local6;
Test44Lib.local6.field6 = Test44Lib.local7;
Test44Lib.local6.field7 = Test44Lib.local10;
Test44Lib.local6.field1 = Test44Lib.local10;
Test44Lib.local6.field2 = Test44Lib.local8;
Test44Lib.local6.field3 = Test44Lib.local10;
Test44Lib.local7.field4 = Test44Lib.local6;
Test44Lib.local7.field5 = Test44Lib.local8;
Test44Lib.local7.field6 = Test44Lib.local5;
Test44Lib.local7.field7 = Test44Lib.local9;
Test44Lib.local7.field1 = Test44Lib.local9;
Test44Lib.local7.field2 = Test44Lib.local8;
Test44Lib.local7.field3 = Test44Lib.local10;
Test44Lib.local8.field4 = Test44Lib.local8;
Test44Lib.local8.field5 = Test44Lib.local8;
Test44Lib.local8.field6 = Test44Lib.local3;
Test44Lib.local8.field7 = Test44Lib.local9;
Test44Lib.local8.field1 = Test44Lib.local10;
Test44Lib.local8.field2 = Test44Lib.local7;
Test44Lib.local8.field3 = Test44Lib.local10;
Test44Lib.local9.field8 = Test44Lib.local9;
Test44Lib.local9.field9 = Test44Lib.local4;
Test44Lib.local9.field1 = Test44Lib.local9;
Test44Lib.local9.field2 = Test44Lib.local8;
Test44Lib.local9.field3 = Test44Lib.local10;
Test44Lib.local10.field8 = Test44Lib.local10;
Test44Lib.local10.field9 = Test44Lib.local9;
Test44Lib.local10.field1 = Test44Lib.local10;
Test44Lib.local10.field2 = Test44Lib.local7;
Test44Lib.local10.field3 = Test44Lib.local9;
Test44Lib.local7.field5.field2.field1.method8(Test44Lib.local7.field2.field2.field7,Test44Lib.local9.field8.field1.field3,3);
Test44Lib.local9.field1.field2.field4=Test44Lib.local7.field7.field2.field4;
for (int local11 = 0; local11<=1; local11 += 1) {
for (int local12 = 0; local12<=1; local12 += 1) {
Test44Lib.local9.field3.field2.field2.method3(3);
}
}
Benchmark.test(1,Test44Lib.local1);
Benchmark.test(2,Test44Lib.local2);
Benchmark.test(3,Test44Lib.local3);
Benchmark.test(4,Test44Lib.local4);
Benchmark.test(5,Test44Lib.local5);
Benchmark.test(6,Test44Lib.local6);
Benchmark.test(7,Test44Lib.local7);
Benchmark.test(8,Test44Lib.local8);
Benchmark.test(9,Test44Lib.local9);
Benchmark.test(10,Test44Lib.local10);
Benchmark.test(11,Test44Lib.local1.field1);
Benchmark.test(12,Test44Lib.local1.field2);
Benchmark.test(13,Test44Lib.local1.field3);
Benchmark.test(14,Test44Lib.local2.field1);
Benchmark.test(15,Test44Lib.local2.field2);
Benchmark.test(16,Test44Lib.local2.field3);
Benchmark.test(17,Test44Lib.local3.field1);
Benchmark.test(18,Test44Lib.local3.field2);
Benchmark.test(19,Test44Lib.local3.field3);
Benchmark.test(20,Test44Lib.local4.field1);
Benchmark.test(21,Test44Lib.local4.field2);
Benchmark.test(22,Test44Lib.local4.field3);
Benchmark.test(23,Test44Lib.local5.field1);
Benchmark.test(24,Test44Lib.local5.field2);
Benchmark.test(25,Test44Lib.local5.field3);
Benchmark.test(26,Test44Lib.local6.field4);
Benchmark.test(27,Test44Lib.local6.field5);
Benchmark.test(28,Test44Lib.local6.field6);
Benchmark.test(29,Test44Lib.local6.field7);
Benchmark.test(30,Test44Lib.local6.field1);
Benchmark.test(31,Test44Lib.local6.field2);
Benchmark.test(32,Test44Lib.local6.field3);
Benchmark.test(33,Test44Lib.local7.field4);
Benchmark.test(34,Test44Lib.local7.field5);
Benchmark.test(35,Test44Lib.local7.field6);
Benchmark.test(36,Test44Lib.local7.field7);
Benchmark.test(37,Test44Lib.local7.field1);
Benchmark.test(38,Test44Lib.local7.field2);
Benchmark.test(39,Test44Lib.local7.field3);
Benchmark.test(40,Test44Lib.local8.field4);
Benchmark.test(41,Test44Lib.local8.field5);
Benchmark.test(42,Test44Lib.local8.field6);
Benchmark.test(43,Test44Lib.local8.field7);
Benchmark.test(44,Test44Lib.local8.field1);
Benchmark.test(45,Test44Lib.local8.field2);
Benchmark.test(46,Test44Lib.local8.field3);
Benchmark.test(47,Test44Lib.local9.field8);
Benchmark.test(48,Test44Lib.local9.field9);
Benchmark.test(49,Test44Lib.local9.field1);
Benchmark.test(50,Test44Lib.local9.field2);
Benchmark.test(51,Test44Lib.local9.field3);
Benchmark.test(52,Test44Lib.local10.field8);
Benchmark.test(53,Test44Lib.local10.field9);
Benchmark.test(54,Test44Lib.local10.field1);
Benchmark.test(55,Test44Lib.local10.field2);
Benchmark.test(56,Test44Lib.local10.field3);
Benchmark.print();
}
}
