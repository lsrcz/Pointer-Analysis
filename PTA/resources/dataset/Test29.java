package dataset;

import benchmark.internal.Benchmark;
import benchmark.tool.BasicClass;
class Test29Lib{
public static Test29Class1 local1;
public static Test29Class2 local2;
public static Test29Class2 local3;
public static Test29Class2 local4;
public static Test29Class3 local5;
public static Test29Class3 local6;
public static Test29Class3 local7;
public static Test29Class3 local8;
public static Test29Class3 local9;
}
class Test29Class1 extends BasicClass {
public Test29Class2 field1;
public Test29Class2 field2;
public Test29Class2 field3;
public Test29Class1 method1(int depth) {
if (depth == 0) return Test29Lib.local5;
return this.field1;
}
public static Test29Class3 method2(Test29Class1 arg0, int depth) {
if (depth == 0) return Test29Lib.local7;
if (depth>=2) {
arg0.field2.method6(arg0.field3,arg0.field3,depth-1);
}
return Test29Lib.local6;
}
public static void method3(Test29Class3 arg0, int depth) {
if (depth == 0) return;
}
public Test29Class1 method4(int depth) {
if (depth == 0) return Test29Lib.local6;
for (int local10 = 0; local10<=2; local10 += 1) {
this.field2=this.field1;
}
return this.field1;
}
}
class Test29Class2 extends Test29Class1 {
public Test29Class3 field4;
public Test29Class3 field5;
public static Test29Class3 method5(int depth) {
if (depth == 0) return Test29Lib.local9;
return Test29Lib.local5;
}
public void method6(Test29Class2 arg0, Test29Class2 arg1, int depth) {
if (depth == 0) return;
}
}
class Test29Class3 extends Test29Class1 {
public Test29Class1 field6;
public Test29Class3 field7;
public Test29Class1 method7(int depth) {
if (depth == 0) return Test29Lib.local3;
return this.field3;
}
}
public class Test29{
public static void main(String[] args) {
int inputValue = 0;
Benchmark.alloc(1);
Test29Lib.local1 = new Test29Class1();
Benchmark.alloc(2);
Test29Lib.local2 = new Test29Class2();
Benchmark.alloc(3);
Test29Lib.local3 = new Test29Class2();
Benchmark.alloc(4);
Test29Lib.local4 = new Test29Class2();
Benchmark.alloc(5);
Test29Lib.local5 = new Test29Class3();
Benchmark.alloc(6);
Test29Lib.local6 = new Test29Class3();
Benchmark.alloc(7);
Test29Lib.local7 = new Test29Class3();
Benchmark.alloc(8);
Test29Lib.local8 = new Test29Class3();
Benchmark.alloc(9);
Test29Lib.local9 = new Test29Class3();
Test29Lib.local1.field1 = Test29Lib.local4;
Test29Lib.local1.field2 = Test29Lib.local4;
Test29Lib.local1.field3 = Test29Lib.local3;
Test29Lib.local2.field4 = Test29Lib.local7;
Test29Lib.local2.field5 = Test29Lib.local6;
Test29Lib.local2.field1 = Test29Lib.local3;
Test29Lib.local2.field2 = Test29Lib.local2;
Test29Lib.local2.field3 = Test29Lib.local4;
Test29Lib.local3.field4 = Test29Lib.local6;
Test29Lib.local3.field5 = Test29Lib.local5;
Test29Lib.local3.field1 = Test29Lib.local2;
Test29Lib.local3.field2 = Test29Lib.local4;
Test29Lib.local3.field3 = Test29Lib.local2;
Test29Lib.local4.field4 = Test29Lib.local6;
Test29Lib.local4.field5 = Test29Lib.local9;
Test29Lib.local4.field1 = Test29Lib.local4;
Test29Lib.local4.field2 = Test29Lib.local2;
Test29Lib.local4.field3 = Test29Lib.local3;
Test29Lib.local5.field6 = Test29Lib.local6;
Test29Lib.local5.field7 = Test29Lib.local9;
Test29Lib.local5.field1 = Test29Lib.local2;
Test29Lib.local5.field2 = Test29Lib.local3;
Test29Lib.local5.field3 = Test29Lib.local3;
Test29Lib.local6.field6 = Test29Lib.local9;
Test29Lib.local6.field7 = Test29Lib.local5;
Test29Lib.local6.field1 = Test29Lib.local2;
Test29Lib.local6.field2 = Test29Lib.local2;
Test29Lib.local6.field3 = Test29Lib.local2;
Test29Lib.local7.field6 = Test29Lib.local2;
Test29Lib.local7.field7 = Test29Lib.local9;
Test29Lib.local7.field1 = Test29Lib.local4;
Test29Lib.local7.field2 = Test29Lib.local4;
Test29Lib.local7.field3 = Test29Lib.local2;
Test29Lib.local8.field6 = Test29Lib.local6;
Test29Lib.local8.field7 = Test29Lib.local6;
Test29Lib.local8.field1 = Test29Lib.local3;
Test29Lib.local8.field2 = Test29Lib.local2;
Test29Lib.local8.field3 = Test29Lib.local4;
Test29Lib.local9.field6 = Test29Lib.local1;
Test29Lib.local9.field7 = Test29Lib.local9;
Test29Lib.local9.field1 = Test29Lib.local4;
Test29Lib.local9.field2 = Test29Lib.local3;
Test29Lib.local9.field3 = Test29Lib.local2;
Test29Lib.local7.field7=Test29Lib.local2.field1.method2(Test29Lib.local1.field3,3);
for (int local11 = 0; local11<=2; local11 += 1) {
Test29Lib.local8.field3.method2(Test29Lib.local3.field4,3);
}
for (int local12 = 0; local12<=2; local12 += 1) {
Test29Lib.local7.field2=Test29Lib.local3;
}
Benchmark.test(1,Test29Lib.local1);
Benchmark.test(2,Test29Lib.local2);
Benchmark.test(3,Test29Lib.local3);
Benchmark.test(4,Test29Lib.local4);
Benchmark.test(5,Test29Lib.local5);
Benchmark.test(6,Test29Lib.local6);
Benchmark.test(7,Test29Lib.local7);
Benchmark.test(8,Test29Lib.local8);
Benchmark.test(9,Test29Lib.local9);
Benchmark.test(10,Test29Lib.local1.field1);
Benchmark.test(11,Test29Lib.local1.field2);
Benchmark.test(12,Test29Lib.local1.field3);
Benchmark.test(13,Test29Lib.local2.field4);
Benchmark.test(14,Test29Lib.local2.field5);
Benchmark.test(15,Test29Lib.local2.field1);
Benchmark.test(16,Test29Lib.local2.field2);
Benchmark.test(17,Test29Lib.local2.field3);
Benchmark.test(18,Test29Lib.local3.field4);
Benchmark.test(19,Test29Lib.local3.field5);
Benchmark.test(20,Test29Lib.local3.field1);
Benchmark.test(21,Test29Lib.local3.field2);
Benchmark.test(22,Test29Lib.local3.field3);
Benchmark.test(23,Test29Lib.local4.field4);
Benchmark.test(24,Test29Lib.local4.field5);
Benchmark.test(25,Test29Lib.local4.field1);
Benchmark.test(26,Test29Lib.local4.field2);
Benchmark.test(27,Test29Lib.local4.field3);
Benchmark.test(28,Test29Lib.local5.field6);
Benchmark.test(29,Test29Lib.local5.field7);
Benchmark.test(30,Test29Lib.local5.field1);
Benchmark.test(31,Test29Lib.local5.field2);
Benchmark.test(32,Test29Lib.local5.field3);
Benchmark.test(33,Test29Lib.local6.field6);
Benchmark.test(34,Test29Lib.local6.field7);
Benchmark.test(35,Test29Lib.local6.field1);
Benchmark.test(36,Test29Lib.local6.field2);
Benchmark.test(37,Test29Lib.local6.field3);
Benchmark.test(38,Test29Lib.local7.field6);
Benchmark.test(39,Test29Lib.local7.field7);
Benchmark.test(40,Test29Lib.local7.field1);
Benchmark.test(41,Test29Lib.local7.field2);
Benchmark.test(42,Test29Lib.local7.field3);
Benchmark.test(43,Test29Lib.local8.field6);
Benchmark.test(44,Test29Lib.local8.field7);
Benchmark.test(45,Test29Lib.local8.field1);
Benchmark.test(46,Test29Lib.local8.field2);
Benchmark.test(47,Test29Lib.local8.field3);
Benchmark.test(48,Test29Lib.local9.field6);
Benchmark.test(49,Test29Lib.local9.field7);
Benchmark.test(50,Test29Lib.local9.field1);
Benchmark.test(51,Test29Lib.local9.field2);
Benchmark.test(52,Test29Lib.local9.field3);
Benchmark.print();
}
}
