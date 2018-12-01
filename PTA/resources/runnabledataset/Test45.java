package runnabledataset;

import benchmark.tool.Benchmark;
import benchmark.tool.BasicClass;
class Test45Lib{
public static Test45Class1 local1;
public static Test45Class1 local2;
public static Test45Class1 local3;
public static Test45Class1 local4;
public static Test45Class2 local5;
public static Test45Class2 local6;
public static Test45Class3 local7;
public static Test45Class3 local8;
public static Test45Class3 local9;
public static Test45Class3 local10;
public static Test45Class3 local11;
}
class Test45Class1 extends BasicClass {
public Test45Class2 field1;
public Test45Class3 field2;
public Test45Class3 field3;
public Test45Class3 field4;
public void method1(Test45Class2 arg0, Test45Class1 arg1, int depth) {
if (depth == 0) return;
}
}
class Test45Class2 extends Test45Class1 {
public Test45Class3 field5;
public Test45Class3 method2(Test45Class2 arg0, Test45Class2 arg1, int depth) {
if (depth == 0) return Test45Lib.local10;
if (depth>=1) {
for (int local12 = 0; local12<=1; local12 += 1) {
this.field2.field3.field2=this.field5.field4;
}
}else {
if (depth>=4) {
if (depth<3) {
this.field1.field4.field1.method1(this.field3.field3.field6,this.field5.field6,depth-1);
}
}else {
if (depth>=4) {
arg1.field2.field1.field3.method1(this.field1.field2.field6,arg1.field3.field2.field1,depth-1);
}
}
}
return arg1.field1.field2.field2;
}
public static Test45Class3 method3(Test45Class3 arg0, Test45Class3 arg1, int depth) {
if (depth == 0) return Test45Lib.local7;
return arg0.field2.field2.field4;
}
}
class Test45Class3 extends Test45Class1 {
public Test45Class2 field6;
public void method4(Test45Class2 arg0, int depth) {
if (depth == 0) return;
}
}
public class Test45{
public static void main(String[] args) {
int inputValue = 10;
Benchmark.alloc(1);
Test45Lib.local1 = new Test45Class1();
Benchmark.alloc(2);
Test45Lib.local2 = new Test45Class1();
Benchmark.alloc(3);
Test45Lib.local3 = new Test45Class1();
Benchmark.alloc(4);
Test45Lib.local4 = new Test45Class1();
Benchmark.alloc(5);
Test45Lib.local5 = new Test45Class2();
Benchmark.alloc(6);
Test45Lib.local6 = new Test45Class2();
Benchmark.alloc(7);
Test45Lib.local7 = new Test45Class3();
Benchmark.alloc(8);
Test45Lib.local8 = new Test45Class3();
Benchmark.alloc(9);
Test45Lib.local9 = new Test45Class3();
Benchmark.alloc(10);
Test45Lib.local10 = new Test45Class3();
Benchmark.alloc(11);
Test45Lib.local11 = new Test45Class3();
Test45Lib.local1.field1 = Test45Lib.local6;
Test45Lib.local1.field2 = Test45Lib.local11;
Test45Lib.local1.field3 = Test45Lib.local10;
Test45Lib.local1.field4 = Test45Lib.local8;
Test45Lib.local2.field1 = Test45Lib.local6;
Test45Lib.local2.field2 = Test45Lib.local11;
Test45Lib.local2.field3 = Test45Lib.local7;
Test45Lib.local2.field4 = Test45Lib.local8;
Test45Lib.local3.field1 = Test45Lib.local6;
Test45Lib.local3.field2 = Test45Lib.local10;
Test45Lib.local3.field3 = Test45Lib.local7;
Test45Lib.local3.field4 = Test45Lib.local9;
Test45Lib.local4.field1 = Test45Lib.local6;
Test45Lib.local4.field2 = Test45Lib.local10;
Test45Lib.local4.field3 = Test45Lib.local11;
Test45Lib.local4.field4 = Test45Lib.local11;
Test45Lib.local5.field5 = Test45Lib.local11;
Test45Lib.local5.field1 = Test45Lib.local5;
Test45Lib.local5.field2 = Test45Lib.local10;
Test45Lib.local5.field3 = Test45Lib.local11;
Test45Lib.local5.field4 = Test45Lib.local7;
Test45Lib.local6.field5 = Test45Lib.local9;
Test45Lib.local6.field1 = Test45Lib.local5;
Test45Lib.local6.field2 = Test45Lib.local11;
Test45Lib.local6.field3 = Test45Lib.local10;
Test45Lib.local6.field4 = Test45Lib.local7;
Test45Lib.local7.field6 = Test45Lib.local5;
Test45Lib.local7.field1 = Test45Lib.local5;
Test45Lib.local7.field2 = Test45Lib.local11;
Test45Lib.local7.field3 = Test45Lib.local9;
Test45Lib.local7.field4 = Test45Lib.local7;
Test45Lib.local8.field6 = Test45Lib.local5;
Test45Lib.local8.field1 = Test45Lib.local5;
Test45Lib.local8.field2 = Test45Lib.local9;
Test45Lib.local8.field3 = Test45Lib.local11;
Test45Lib.local8.field4 = Test45Lib.local10;
Test45Lib.local9.field6 = Test45Lib.local5;
Test45Lib.local9.field1 = Test45Lib.local5;
Test45Lib.local9.field2 = Test45Lib.local8;
Test45Lib.local9.field3 = Test45Lib.local11;
Test45Lib.local9.field4 = Test45Lib.local11;
Test45Lib.local10.field6 = Test45Lib.local5;
Test45Lib.local10.field1 = Test45Lib.local6;
Test45Lib.local10.field2 = Test45Lib.local8;
Test45Lib.local10.field3 = Test45Lib.local8;
Test45Lib.local10.field4 = Test45Lib.local10;
Test45Lib.local11.field6 = Test45Lib.local5;
Test45Lib.local11.field1 = Test45Lib.local5;
Test45Lib.local11.field2 = Test45Lib.local9;
Test45Lib.local11.field3 = Test45Lib.local7;
Test45Lib.local11.field4 = Test45Lib.local8;
Test45Lib.local7.field1.field4.field4=Test45Lib.local6.field5.field3.field6.method2(Test45Lib.local11.field6,Test45Lib.local1.field1.field1.field1,3);
Test45Lib.local8.field1.field2.field1=Test45Lib.local6.field4.field6;
Test45Lib.local11.field3.field3=Test45Lib.local2.field2;
Benchmark.test(1,Test45Lib.local1);
Benchmark.test(2,Test45Lib.local2);
Benchmark.test(3,Test45Lib.local3);
Benchmark.test(4,Test45Lib.local4);
Benchmark.test(5,Test45Lib.local5);
Benchmark.test(6,Test45Lib.local6);
Benchmark.test(7,Test45Lib.local7);
Benchmark.test(8,Test45Lib.local8);
Benchmark.test(9,Test45Lib.local9);
Benchmark.test(10,Test45Lib.local10);
Benchmark.test(11,Test45Lib.local11);
Benchmark.test(12,Test45Lib.local1.field1);
Benchmark.test(13,Test45Lib.local1.field2);
Benchmark.test(14,Test45Lib.local1.field3);
Benchmark.test(15,Test45Lib.local1.field4);
Benchmark.test(16,Test45Lib.local2.field1);
Benchmark.test(17,Test45Lib.local2.field2);
Benchmark.test(18,Test45Lib.local2.field3);
Benchmark.test(19,Test45Lib.local2.field4);
Benchmark.test(20,Test45Lib.local3.field1);
Benchmark.test(21,Test45Lib.local3.field2);
Benchmark.test(22,Test45Lib.local3.field3);
Benchmark.test(23,Test45Lib.local3.field4);
Benchmark.test(24,Test45Lib.local4.field1);
Benchmark.test(25,Test45Lib.local4.field2);
Benchmark.test(26,Test45Lib.local4.field3);
Benchmark.test(27,Test45Lib.local4.field4);
Benchmark.test(28,Test45Lib.local5.field5);
Benchmark.test(29,Test45Lib.local5.field1);
Benchmark.test(30,Test45Lib.local5.field2);
Benchmark.test(31,Test45Lib.local5.field3);
Benchmark.test(32,Test45Lib.local5.field4);
Benchmark.test(33,Test45Lib.local6.field5);
Benchmark.test(34,Test45Lib.local6.field1);
Benchmark.test(35,Test45Lib.local6.field2);
Benchmark.test(36,Test45Lib.local6.field3);
Benchmark.test(37,Test45Lib.local6.field4);
Benchmark.test(38,Test45Lib.local7.field6);
Benchmark.test(39,Test45Lib.local7.field1);
Benchmark.test(40,Test45Lib.local7.field2);
Benchmark.test(41,Test45Lib.local7.field3);
Benchmark.test(42,Test45Lib.local7.field4);
Benchmark.test(43,Test45Lib.local8.field6);
Benchmark.test(44,Test45Lib.local8.field1);
Benchmark.test(45,Test45Lib.local8.field2);
Benchmark.test(46,Test45Lib.local8.field3);
Benchmark.test(47,Test45Lib.local8.field4);
Benchmark.test(48,Test45Lib.local9.field6);
Benchmark.test(49,Test45Lib.local9.field1);
Benchmark.test(50,Test45Lib.local9.field2);
Benchmark.test(51,Test45Lib.local9.field3);
Benchmark.test(52,Test45Lib.local9.field4);
Benchmark.test(53,Test45Lib.local10.field6);
Benchmark.test(54,Test45Lib.local10.field1);
Benchmark.test(55,Test45Lib.local10.field2);
Benchmark.test(56,Test45Lib.local10.field3);
Benchmark.test(57,Test45Lib.local10.field4);
Benchmark.test(58,Test45Lib.local11.field6);
Benchmark.test(59,Test45Lib.local11.field1);
Benchmark.test(60,Test45Lib.local11.field2);
Benchmark.test(61,Test45Lib.local11.field3);
Benchmark.test(62,Test45Lib.local11.field4);
Benchmark.print();
}
}
