package dataset;

import benchmark.internal.Benchmark;
import benchmark.tool.BasicClass;
class Test17Lib{
public static Test17Class1 local1;
public static Test17Class1 local2;
public static Test17Class1 local3;
public static Test17Class1 local4;
public static Test17Class2 local5;
public static Test17Class3 local6;
public static Test17Class3 local7;
}
class Test17Class1 extends BasicClass {
public Test17Class1 field1;
public Test17Class2 field2;
public Test17Class1 field3;
public Test17Class3 method1(int depth) {
if (depth == 0) return Test17Lib.local7;
return Test17Lib.local6;
}
public static Test17Class3 method2(Test17Class3 arg0, Test17Class1 arg1, int depth) {
if (depth == 0) return Test17Lib.local7;
arg0=arg0.method6(arg1,depth-1);
return arg0;
}
}
class Test17Class2 extends Test17Class1 {
public Test17Class1 field4;
public Test17Class2 field5;
public void method3(int depth) {
if (depth == 0) return;
this.method3(depth-1);
}
}
class Test17Class3 extends Test17Class2 {
public Test17Class3 field6;
public static void method4(int depth) {
if (depth == 0) return;
}
public void method5(int depth) {
if (depth == 0) return;
}
public static Test17Class3 method6(Test17Class1 arg0, int depth) {
if (depth == 0) return Test17Lib.local7;
return Test17Lib.local6;
}
public Test17Class2 method7(int depth) {
if (depth == 0) return Test17Lib.local6;
if (depth<=4) {
for (int local8 = 0; local8<=0; local8 += 1) {
this.field4=this.field6;
}
}else {
this.method4(depth-1);
}
return this.field2;
}
}
public class Test17{
public static void main(String[] args) {
int inputValue = 0;
Benchmark.alloc(1);
Test17Lib.local1 = new Test17Class1();
Benchmark.alloc(2);
Test17Lib.local2 = new Test17Class1();
Benchmark.alloc(3);
Test17Lib.local3 = new Test17Class1();
Benchmark.alloc(4);
Test17Lib.local4 = new Test17Class1();
Benchmark.alloc(5);
Test17Lib.local5 = new Test17Class2();
Benchmark.alloc(6);
Test17Lib.local6 = new Test17Class3();
Benchmark.alloc(7);
Test17Lib.local7 = new Test17Class3();
Test17Lib.local1.field1 = Test17Lib.local1;
Test17Lib.local1.field2 = Test17Lib.local5;
Test17Lib.local1.field3 = Test17Lib.local6;
Test17Lib.local2.field1 = Test17Lib.local4;
Test17Lib.local2.field2 = Test17Lib.local6;
Test17Lib.local2.field3 = Test17Lib.local1;
Test17Lib.local3.field1 = Test17Lib.local4;
Test17Lib.local3.field2 = Test17Lib.local6;
Test17Lib.local3.field3 = Test17Lib.local2;
Test17Lib.local4.field1 = Test17Lib.local6;
Test17Lib.local4.field2 = Test17Lib.local5;
Test17Lib.local4.field3 = Test17Lib.local6;
Test17Lib.local5.field4 = Test17Lib.local1;
Test17Lib.local5.field5 = Test17Lib.local5;
Test17Lib.local5.field1 = Test17Lib.local6;
Test17Lib.local5.field2 = Test17Lib.local6;
Test17Lib.local5.field3 = Test17Lib.local1;
Test17Lib.local6.field6 = Test17Lib.local6;
Test17Lib.local6.field4 = Test17Lib.local6;
Test17Lib.local6.field5 = Test17Lib.local6;
Test17Lib.local6.field1 = Test17Lib.local3;
Test17Lib.local6.field2 = Test17Lib.local7;
Test17Lib.local6.field3 = Test17Lib.local6;
Test17Lib.local7.field6 = Test17Lib.local6;
Test17Lib.local7.field4 = Test17Lib.local2;
Test17Lib.local7.field5 = Test17Lib.local6;
Test17Lib.local7.field1 = Test17Lib.local2;
Test17Lib.local7.field2 = Test17Lib.local5;
Test17Lib.local7.field3 = Test17Lib.local3;
Test17Lib.local5.field2=Test17Lib.local6.field5;
for (int local9 = 0; local9<=3; local9 += 1) {
Test17Lib.local5.field3=Test17Lib.local1.field1.method1(3);
}
for (int local10 = 0; local10<=3; local10 += 1) {
Test17Lib.local6.method5(3);
}
Benchmark.test(1,Test17Lib.local1);
Benchmark.test(2,Test17Lib.local2);
Benchmark.test(3,Test17Lib.local3);
Benchmark.test(4,Test17Lib.local4);
Benchmark.test(5,Test17Lib.local5);
Benchmark.test(6,Test17Lib.local6);
Benchmark.test(7,Test17Lib.local7);
Benchmark.test(8,Test17Lib.local1.field1);
Benchmark.test(9,Test17Lib.local1.field2);
Benchmark.test(10,Test17Lib.local1.field3);
Benchmark.test(11,Test17Lib.local2.field1);
Benchmark.test(12,Test17Lib.local2.field2);
Benchmark.test(13,Test17Lib.local2.field3);
Benchmark.test(14,Test17Lib.local3.field1);
Benchmark.test(15,Test17Lib.local3.field2);
Benchmark.test(16,Test17Lib.local3.field3);
Benchmark.test(17,Test17Lib.local4.field1);
Benchmark.test(18,Test17Lib.local4.field2);
Benchmark.test(19,Test17Lib.local4.field3);
Benchmark.test(20,Test17Lib.local5.field4);
Benchmark.test(21,Test17Lib.local5.field5);
Benchmark.test(22,Test17Lib.local5.field1);
Benchmark.test(23,Test17Lib.local5.field2);
Benchmark.test(24,Test17Lib.local5.field3);
Benchmark.test(25,Test17Lib.local6.field6);
Benchmark.test(26,Test17Lib.local6.field4);
Benchmark.test(27,Test17Lib.local6.field5);
Benchmark.test(28,Test17Lib.local6.field1);
Benchmark.test(29,Test17Lib.local6.field2);
Benchmark.test(30,Test17Lib.local6.field3);
Benchmark.test(31,Test17Lib.local7.field6);
Benchmark.test(32,Test17Lib.local7.field4);
Benchmark.test(33,Test17Lib.local7.field5);
Benchmark.test(34,Test17Lib.local7.field1);
Benchmark.test(35,Test17Lib.local7.field2);
Benchmark.test(36,Test17Lib.local7.field3);
Benchmark.print();
}
}
