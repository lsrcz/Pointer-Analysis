package dataset;

import benchmark.internal.Benchmark;
import benchmark.tool.BasicClass;
class Test32Lib{
public static Test32Class1 local1;
public static Test32Class1 local2;
public static Test32Class1 local3;
public static Test32Class1 local4;
public static Test32Class1 local5;
public static Test32Class2 local6;
public static Test32Class2 local7;
public static Test32Class3 local8;
public static Test32Class3 local9;
public static Test32Class3 local10;
}
class Test32Class1 extends BasicClass {
public Test32Class2 field1;
public static Test32Class2 field2;
public static void method1(Test32Class3 arg0, Test32Class2 arg1, int depth) {
if (depth == 0) return;
if (depth>=2) {
arg1=arg0.field9;
}
if (depth<=3) {
arg0.field12=arg0.method4(arg0,field2.field2,depth-1);
}else {
field2.field6=arg0.field10;
}
}
}
class Test32Class2 extends Test32Class1 {
public static Test32Class2 field3;
public static Test32Class3 field4;
public static Test32Class2 field5;
public Test32Class3 field6;
public static Test32Class1 field7;
public Test32Class1 field8;
public void method2(Test32Class2 arg0, Test32Class1 arg1, int depth) {
if (depth == 0) return;
arg1.field2.method1(this.field6,arg0.field5,depth-1);
}
}
class Test32Class3 extends Test32Class1 {
public Test32Class2 field9;
public Test32Class3 field10;
public Test32Class3 field11;
public Test32Class1 field12;
public Test32Class1 field13;
public static Test32Class3 method3(Test32Class3 arg0, Test32Class3 arg1, int depth) {
if (depth == 0) return Test32Lib.local9;
arg1.field11=arg1.field10.method4(field2.field1,arg0.field2,depth-1);
if (depth>3) {
for (int local11 = 0; local11<=1; local11 += 1) {
arg0.field1.method1(arg0,arg0.field9,depth-1);
}
}
return arg1.field11;
}
public static Test32Class3 method4(Test32Class1 arg0, Test32Class2 arg1, int depth) {
if (depth == 0) return Test32Lib.local10;
arg0.field2=field2;
for (int local12 = 0; local12<=3; local12 += 1) {
if (depth<=2) {
field2.method2(field2,arg1.field6,depth-1);
}
}
return arg1.field6;
}
public void method5(Test32Class1 arg0, Test32Class2 arg1, int depth) {
if (depth == 0) return;
}
}
public class Test32{
public static void main(String[] args) {
int inputValue = 0;
Benchmark.alloc(1);
Test32Lib.local1 = new Test32Class1();
Benchmark.alloc(2);
Test32Lib.local2 = new Test32Class1();
Benchmark.alloc(3);
Test32Lib.local3 = new Test32Class1();
Benchmark.alloc(4);
Test32Lib.local4 = new Test32Class1();
Benchmark.alloc(5);
Test32Lib.local5 = new Test32Class1();
Benchmark.alloc(6);
Test32Lib.local6 = new Test32Class2();
Benchmark.alloc(7);
Test32Lib.local7 = new Test32Class2();
Benchmark.alloc(8);
Test32Lib.local8 = new Test32Class3();
Benchmark.alloc(9);
Test32Lib.local9 = new Test32Class3();
Benchmark.alloc(10);
Test32Lib.local10 = new Test32Class3();
Test32Lib.local1.field1 = Test32Lib.local6;
Test32Lib.local1.field2 = Test32Lib.local6;
Test32Lib.local2.field1 = Test32Lib.local6;
Test32Lib.local2.field2 = Test32Lib.local7;
Test32Lib.local3.field1 = Test32Lib.local7;
Test32Lib.local3.field2 = Test32Lib.local6;
Test32Lib.local4.field1 = Test32Lib.local6;
Test32Lib.local4.field2 = Test32Lib.local6;
Test32Lib.local5.field1 = Test32Lib.local7;
Test32Lib.local5.field2 = Test32Lib.local7;
Test32Lib.local6.field3 = Test32Lib.local6;
Test32Lib.local6.field4 = Test32Lib.local9;
Test32Lib.local6.field5 = Test32Lib.local7;
Test32Lib.local6.field6 = Test32Lib.local10;
Test32Lib.local6.field7 = Test32Lib.local1;
Test32Lib.local6.field8 = Test32Lib.local6;
Test32Lib.local6.field1 = Test32Lib.local7;
Test32Lib.local6.field2 = Test32Lib.local7;
Test32Lib.local7.field3 = Test32Lib.local6;
Test32Lib.local7.field4 = Test32Lib.local9;
Test32Lib.local7.field5 = Test32Lib.local7;
Test32Lib.local7.field6 = Test32Lib.local9;
Test32Lib.local7.field7 = Test32Lib.local6;
Test32Lib.local7.field8 = Test32Lib.local2;
Test32Lib.local7.field1 = Test32Lib.local7;
Test32Lib.local7.field2 = Test32Lib.local7;
Test32Lib.local8.field9 = Test32Lib.local6;
Test32Lib.local8.field10 = Test32Lib.local8;
Test32Lib.local8.field11 = Test32Lib.local8;
Test32Lib.local8.field12 = Test32Lib.local6;
Test32Lib.local8.field13 = Test32Lib.local2;
Test32Lib.local8.field1 = Test32Lib.local7;
Test32Lib.local8.field2 = Test32Lib.local6;
Test32Lib.local9.field9 = Test32Lib.local7;
Test32Lib.local9.field10 = Test32Lib.local10;
Test32Lib.local9.field11 = Test32Lib.local9;
Test32Lib.local9.field12 = Test32Lib.local6;
Test32Lib.local9.field13 = Test32Lib.local10;
Test32Lib.local9.field1 = Test32Lib.local6;
Test32Lib.local9.field2 = Test32Lib.local6;
Test32Lib.local10.field9 = Test32Lib.local7;
Test32Lib.local10.field10 = Test32Lib.local9;
Test32Lib.local10.field11 = Test32Lib.local9;
Test32Lib.local10.field12 = Test32Lib.local9;
Test32Lib.local10.field13 = Test32Lib.local8;
Test32Lib.local10.field1 = Test32Lib.local7;
Test32Lib.local10.field2 = Test32Lib.local7;
Test32Lib.local10.field10=Test32Lib.local7.field4;
Test32Lib.local7.field4=Test32Lib.local9;
Test32Lib.local10.field11=Test32Lib.local6.field6;
Benchmark.test(1,Test32Lib.local1);
Benchmark.test(2,Test32Lib.local2);
Benchmark.test(3,Test32Lib.local3);
Benchmark.test(4,Test32Lib.local4);
Benchmark.test(5,Test32Lib.local5);
Benchmark.test(6,Test32Lib.local6);
Benchmark.test(7,Test32Lib.local7);
Benchmark.test(8,Test32Lib.local8);
Benchmark.test(9,Test32Lib.local9);
Benchmark.test(10,Test32Lib.local10);
Benchmark.test(11,Test32Lib.local1.field1);
Benchmark.test(12,Test32Lib.local1.field2);
Benchmark.test(13,Test32Lib.local2.field1);
Benchmark.test(14,Test32Lib.local2.field2);
Benchmark.test(15,Test32Lib.local3.field1);
Benchmark.test(16,Test32Lib.local3.field2);
Benchmark.test(17,Test32Lib.local4.field1);
Benchmark.test(18,Test32Lib.local4.field2);
Benchmark.test(19,Test32Lib.local5.field1);
Benchmark.test(20,Test32Lib.local5.field2);
Benchmark.test(21,Test32Lib.local6.field3);
Benchmark.test(22,Test32Lib.local6.field4);
Benchmark.test(23,Test32Lib.local6.field5);
Benchmark.test(24,Test32Lib.local6.field6);
Benchmark.test(25,Test32Lib.local6.field7);
Benchmark.test(26,Test32Lib.local6.field8);
Benchmark.test(27,Test32Lib.local6.field1);
Benchmark.test(28,Test32Lib.local6.field2);
Benchmark.test(29,Test32Lib.local7.field3);
Benchmark.test(30,Test32Lib.local7.field4);
Benchmark.test(31,Test32Lib.local7.field5);
Benchmark.test(32,Test32Lib.local7.field6);
Benchmark.test(33,Test32Lib.local7.field7);
Benchmark.test(34,Test32Lib.local7.field8);
Benchmark.test(35,Test32Lib.local7.field1);
Benchmark.test(36,Test32Lib.local7.field2);
Benchmark.test(37,Test32Lib.local8.field9);
Benchmark.test(38,Test32Lib.local8.field10);
Benchmark.test(39,Test32Lib.local8.field11);
Benchmark.test(40,Test32Lib.local8.field12);
Benchmark.test(41,Test32Lib.local8.field13);
Benchmark.test(42,Test32Lib.local8.field1);
Benchmark.test(43,Test32Lib.local8.field2);
Benchmark.test(44,Test32Lib.local9.field9);
Benchmark.test(45,Test32Lib.local9.field10);
Benchmark.test(46,Test32Lib.local9.field11);
Benchmark.test(47,Test32Lib.local9.field12);
Benchmark.test(48,Test32Lib.local9.field13);
Benchmark.test(49,Test32Lib.local9.field1);
Benchmark.test(50,Test32Lib.local9.field2);
Benchmark.test(51,Test32Lib.local10.field9);
Benchmark.test(52,Test32Lib.local10.field10);
Benchmark.test(53,Test32Lib.local10.field11);
Benchmark.test(54,Test32Lib.local10.field12);
Benchmark.test(55,Test32Lib.local10.field13);
Benchmark.test(56,Test32Lib.local10.field1);
Benchmark.test(57,Test32Lib.local10.field2);
Benchmark.print();
}
}
