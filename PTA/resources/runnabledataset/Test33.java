package runnabledataset;

import benchmark.tool.Benchmark;
import benchmark.tool.BasicClass;
class Test33Lib{
public static Test33Class1 local1;
public static Test33Class1 local2;
public static Test33Class1 local3;
public static Test33Class1 local4;
public static Test33Class2 local5;
public static Test33Class2 local6;
public static Test33Class3 local7;
}
class Test33Class1 extends BasicClass {
public Test33Class1 field1;
public static Test33Class1 field2;
public void method1(Test33Class2 arg0, int depth) {
if (depth == 0) return;
for (int local8 = 0; local8<=0; local8 += 1) {
arg0.field5.method2(arg0.field4,this,depth-1);
}
arg0.field5=arg0.field5;
}
public static void method2(Test33Class2 arg0, Test33Class1 arg1, int depth) {
if (depth == 0) return;
}
public static Test33Class1 method3(Test33Class3 arg0, int depth) {
if (depth == 0) return Test33Lib.local4;
return arg0.field2;
}
}
class Test33Class2 extends Test33Class1 {
public static Test33Class1 field3;
public static Test33Class2 field4;
public static Test33Class3 field5;
public Test33Class1 method4(Test33Class3 arg0, int depth) {
if (depth == 0) return Test33Lib.local5;
for (int local9 = 0; local9<=2; local9 += 1) {
arg0.method1(this.field4,depth-1);
}
if (depth>1) {
this.field3=this.field4.method4(this.field5,depth-1);
}
return this.field1;
}
public Test33Class3 method5(int depth) {
if (depth == 0) return Test33Lib.local7;
this.field5=this.field5;
return this.field5;
}
}
class Test33Class3 extends Test33Class1 {
public static Test33Class3 field6;
public void method6(Test33Class3 arg0, Test33Class2 arg1, int depth) {
if (depth == 0) return;
}
public static void method7(int depth) {
if (depth == 0) return;
field6.field6=field6.field6;
if (depth<=3) {
if (depth<=4) {
for (int local10 = 0; local10<=2; local10 += 1) {
if (depth>=1) {
if (depth<=4) {
}else {
}
}
}
}
}
}
}
public class Test33{
public static void main(String[] args) {
int inputValue = 10;
Benchmark.alloc(1);
Test33Lib.local1 = new Test33Class1();
Benchmark.alloc(2);
Test33Lib.local2 = new Test33Class1();
Benchmark.alloc(3);
Test33Lib.local3 = new Test33Class1();
Benchmark.alloc(4);
Test33Lib.local4 = new Test33Class1();
Benchmark.alloc(5);
Test33Lib.local5 = new Test33Class2();
Benchmark.alloc(6);
Test33Lib.local6 = new Test33Class2();
Benchmark.alloc(7);
Test33Lib.local7 = new Test33Class3();
Test33Lib.local1.field1 = Test33Lib.local2;
Test33Lib.local1.field2 = Test33Lib.local7;
Test33Lib.local2.field1 = Test33Lib.local5;
Test33Lib.local2.field2 = Test33Lib.local5;
Test33Lib.local3.field1 = Test33Lib.local1;
Test33Lib.local3.field2 = Test33Lib.local4;
Test33Lib.local4.field1 = Test33Lib.local1;
Test33Lib.local4.field2 = Test33Lib.local5;
Test33Lib.local5.field3 = Test33Lib.local4;
Test33Lib.local5.field4 = Test33Lib.local6;
Test33Lib.local5.field5 = Test33Lib.local7;
Test33Lib.local5.field1 = Test33Lib.local6;
Test33Lib.local5.field2 = Test33Lib.local3;
Test33Lib.local6.field3 = Test33Lib.local6;
Test33Lib.local6.field4 = Test33Lib.local5;
Test33Lib.local6.field5 = Test33Lib.local7;
Test33Lib.local6.field1 = Test33Lib.local3;
Test33Lib.local6.field2 = Test33Lib.local6;
Test33Lib.local7.field6 = Test33Lib.local7;
Test33Lib.local7.field1 = Test33Lib.local1;
Test33Lib.local7.field2 = Test33Lib.local1;
Test33Lib.local2.field1=Test33Lib.local6.field5;
Test33Lib.local6.field5=Test33Lib.local6.field5;
Test33Lib.local5.field5.method6(Test33Lib.local6.field5,Test33Lib.local6,3);
Benchmark.test(1,Test33Lib.local1);
Benchmark.test(2,Test33Lib.local2);
Benchmark.test(3,Test33Lib.local3);
Benchmark.test(4,Test33Lib.local4);
Benchmark.test(5,Test33Lib.local5);
Benchmark.test(6,Test33Lib.local6);
Benchmark.test(7,Test33Lib.local7);
Benchmark.test(8,Test33Lib.local1.field1);
Benchmark.test(9,Test33Lib.local1.field2);
Benchmark.test(10,Test33Lib.local2.field1);
Benchmark.test(11,Test33Lib.local2.field2);
Benchmark.test(12,Test33Lib.local3.field1);
Benchmark.test(13,Test33Lib.local3.field2);
Benchmark.test(14,Test33Lib.local4.field1);
Benchmark.test(15,Test33Lib.local4.field2);
Benchmark.test(16,Test33Lib.local5.field3);
Benchmark.test(17,Test33Lib.local5.field4);
Benchmark.test(18,Test33Lib.local5.field5);
Benchmark.test(19,Test33Lib.local5.field1);
Benchmark.test(20,Test33Lib.local5.field2);
Benchmark.test(21,Test33Lib.local6.field3);
Benchmark.test(22,Test33Lib.local6.field4);
Benchmark.test(23,Test33Lib.local6.field5);
Benchmark.test(24,Test33Lib.local6.field1);
Benchmark.test(25,Test33Lib.local6.field2);
Benchmark.test(26,Test33Lib.local7.field6);
Benchmark.test(27,Test33Lib.local7.field1);
Benchmark.test(28,Test33Lib.local7.field2);
Benchmark.print();
}
}
