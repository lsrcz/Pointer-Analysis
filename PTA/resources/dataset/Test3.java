package dataset;

import benchmark.internal.Benchmark;
import benchmark.tool.BasicClass;
class Test3Lib{
public static Test3Class1 local1;
public static Test3Class1 local2;
public static Test3Class1 local3;
public static Test3Class1 local4;
public static Test3Class2 local5;
public static Test3Class3 local6;
}
class Test3Class1 extends BasicClass {
public Test3Class3 field1;
public Test3Class2 field2;
public void method1(Test3Class2 arg0, int depth) {
if (depth == 0) return;
arg0.field2=arg0.field1.method2(arg0.field1,depth-1);
}
}
class Test3Class2 extends Test3Class1 {
public Test3Class2 field3;
public Test3Class2 method2(Test3Class2 arg0, int depth) {
if (depth == 0) return Test3Lib.local6;
if (depth>=2) {
if (depth==3) {
for (int local7 = 0; local7<=1; local7 += 1) {
this.field1.method2(this.field2,depth-1);
}
}
}else {
if (depth<4) {
arg0.field1.method3(arg0,this.field1,depth-1);
}
}
arg0.field1.method4(this.field3,depth-1);
return this;
}
}
class Test3Class3 extends Test3Class2 {
public Test3Class2 field4;
public Test3Class2 field5;
public static Test3Class1 method3(Test3Class1 arg0, Test3Class2 arg1, int depth) {
if (depth == 0) return Test3Lib.local6;
arg0.field2=arg0.field1.method2(arg1.field3,depth-1);
arg0.field2.method1(arg1.field1,depth-1);
arg1.field3.method1(arg0.field2,depth-1);
return arg0;
}
public static Test3Class2 method4(Test3Class2 arg0, int depth) {
if (depth == 0) return Test3Lib.local5;
for (int local8 = 0; local8<=0; local8 += 1) {
arg0=arg0.field3;
}
arg0=arg0.field1.method4(arg0.field2,depth-1);
arg0.field2=arg0.field3;
if (depth<2) {
if (depth<1) {
arg0=arg0.field2.method2(arg0.field3,depth-1);
}
}else {
arg0.field3=arg0.field2;
}
return arg0.field3;
}
}
public class Test3{
public static void main(String[] args) {
int inputValue = 0;
Benchmark.alloc(1);
Test3Lib.local1 = new Test3Class1();
Benchmark.alloc(2);
Test3Lib.local2 = new Test3Class1();
Benchmark.alloc(3);
Test3Lib.local3 = new Test3Class1();
Benchmark.alloc(4);
Test3Lib.local4 = new Test3Class1();
Benchmark.alloc(5);
Test3Lib.local5 = new Test3Class2();
Benchmark.alloc(6);
Test3Lib.local6 = new Test3Class3();
Test3Lib.local1.field1 = Test3Lib.local6;
Test3Lib.local1.field2 = Test3Lib.local5;
Test3Lib.local2.field1 = Test3Lib.local6;
Test3Lib.local2.field2 = Test3Lib.local6;
Test3Lib.local3.field1 = Test3Lib.local6;
Test3Lib.local3.field2 = Test3Lib.local5;
Test3Lib.local4.field1 = Test3Lib.local6;
Test3Lib.local4.field2 = Test3Lib.local6;
Test3Lib.local5.field3 = Test3Lib.local6;
Test3Lib.local5.field1 = Test3Lib.local6;
Test3Lib.local5.field2 = Test3Lib.local5;
Test3Lib.local6.field4 = Test3Lib.local5;
Test3Lib.local6.field5 = Test3Lib.local6;
Test3Lib.local6.field3 = Test3Lib.local6;
Test3Lib.local6.field1 = Test3Lib.local6;
Test3Lib.local6.field2 = Test3Lib.local6;
Test3Lib.local2.field1.method4(Test3Lib.local5,3);
Test3Lib.local4.field1.method3(Test3Lib.local2,Test3Lib.local5,3);
if (inputValue>3) {
Test3Lib.local2.field2=Test3Lib.local5.field1;
}
if (inputValue<=3) {
Test3Lib.local6.method3(Test3Lib.local6.field1,Test3Lib.local6.field1,3);
}else {
if (inputValue>=4) {
Test3Lib.local1.field2=Test3Lib.local6.field3;
}
}
Test3Lib.local6.field4=Test3Lib.local3.field1.method4(Test3Lib.local4.field1,3);
Benchmark.test(1,Test3Lib.local1);
Benchmark.test(2,Test3Lib.local2);
Benchmark.test(3,Test3Lib.local3);
Benchmark.test(4,Test3Lib.local4);
Benchmark.test(5,Test3Lib.local5);
Benchmark.test(6,Test3Lib.local6);
Benchmark.test(7,Test3Lib.local1.field1);
Benchmark.test(8,Test3Lib.local1.field2);
Benchmark.test(9,Test3Lib.local2.field1);
Benchmark.test(10,Test3Lib.local2.field2);
Benchmark.test(11,Test3Lib.local3.field1);
Benchmark.test(12,Test3Lib.local3.field2);
Benchmark.test(13,Test3Lib.local4.field1);
Benchmark.test(14,Test3Lib.local4.field2);
Benchmark.test(15,Test3Lib.local5.field3);
Benchmark.test(16,Test3Lib.local5.field1);
Benchmark.test(17,Test3Lib.local5.field2);
Benchmark.test(18,Test3Lib.local6.field4);
Benchmark.test(19,Test3Lib.local6.field5);
Benchmark.test(20,Test3Lib.local6.field3);
Benchmark.test(21,Test3Lib.local6.field1);
Benchmark.test(22,Test3Lib.local6.field2);
Benchmark.print();
}
}
