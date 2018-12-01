package dataset;

import benchmark.internal.Benchmark;
import benchmark.tool.BasicClass;
class Test20Lib{
public static Test20Class1 local1;
public static Test20Class2 local2;
public static Test20Class3 local3;
public static Test20Class3 local4;
}
class Test20Class1 extends BasicClass {
public Test20Class3 field1;
public void method1(int depth) {
if (depth == 0) return;
this.field1=this.field1;
}
public Test20Class2 method2(int depth) {
if (depth == 0) return Test20Lib.local2;
return this.field1;
}
public void method3(int depth) {
if (depth == 0) return;
}
public Test20Class2 method4(int depth) {
if (depth == 0) return Test20Lib.local3;
return this.field1;
}
}
class Test20Class2 extends Test20Class1 {
public Test20Class2 field2;
public Test20Class1 field3;
public Test20Class2 field4;
public static void method5(Test20Class1 arg0, Test20Class1 arg1, int depth) {
if (depth == 0) return;
arg0.field1=arg0.field1;
}
}
class Test20Class3 extends Test20Class2 {
public Test20Class2 field5;
public Test20Class2 field6;
public static void method6(Test20Class2 arg0, Test20Class3 arg1, int depth) {
if (depth == 0) return;
}
public void method7(int depth) {
if (depth == 0) return;
this.field3.method2(depth-1);
}
public void method8(Test20Class3 arg0, int depth) {
if (depth == 0) return;
for (int local5 = 0; local5<=0; local5 += 1) {
if (depth==3) {
this.field6=this.field2;
}else {
if (depth==4) {
arg0.field5=arg0.field5.method4(depth-1);
}else {
this.field3=this.field2;
}
}
}
}
}
public class Test20{
public static void main(String[] args) {
int inputValue = 0;
Benchmark.alloc(1);
Test20Lib.local1 = new Test20Class1();
Benchmark.alloc(2);
Test20Lib.local2 = new Test20Class2();
Benchmark.alloc(3);
Test20Lib.local3 = new Test20Class3();
Benchmark.alloc(4);
Test20Lib.local4 = new Test20Class3();
Test20Lib.local1.field1 = Test20Lib.local3;
Test20Lib.local2.field2 = Test20Lib.local4;
Test20Lib.local2.field3 = Test20Lib.local1;
Test20Lib.local2.field4 = Test20Lib.local4;
Test20Lib.local2.field1 = Test20Lib.local4;
Test20Lib.local3.field5 = Test20Lib.local4;
Test20Lib.local3.field6 = Test20Lib.local3;
Test20Lib.local3.field2 = Test20Lib.local3;
Test20Lib.local3.field3 = Test20Lib.local2;
Test20Lib.local3.field4 = Test20Lib.local3;
Test20Lib.local3.field1 = Test20Lib.local4;
Test20Lib.local4.field5 = Test20Lib.local4;
Test20Lib.local4.field6 = Test20Lib.local3;
Test20Lib.local4.field2 = Test20Lib.local2;
Test20Lib.local4.field3 = Test20Lib.local2;
Test20Lib.local4.field4 = Test20Lib.local4;
Test20Lib.local4.field1 = Test20Lib.local3;
for (int local6 = 0; local6<=3; local6 += 1) {
if (inputValue==3) {
for (int local7 = 0; local7<=2; local7 += 1) {
Test20Lib.local3.field4=Test20Lib.local4;
}
}else {
Test20Lib.local2.field3=Test20Lib.local4;
}
}
for (int local8 = 0; local8<=0; local8 += 1) {
Test20Lib.local2.field3.method1(3);
}
Test20Lib.local2.field1.method7(3);
Benchmark.test(1,Test20Lib.local1);
Benchmark.test(2,Test20Lib.local2);
Benchmark.test(3,Test20Lib.local3);
Benchmark.test(4,Test20Lib.local4);
Benchmark.test(5,Test20Lib.local1.field1);
Benchmark.test(6,Test20Lib.local2.field2);
Benchmark.test(7,Test20Lib.local2.field3);
Benchmark.test(8,Test20Lib.local2.field4);
Benchmark.test(9,Test20Lib.local2.field1);
Benchmark.test(10,Test20Lib.local3.field5);
Benchmark.test(11,Test20Lib.local3.field6);
Benchmark.test(12,Test20Lib.local3.field2);
Benchmark.test(13,Test20Lib.local3.field3);
Benchmark.test(14,Test20Lib.local3.field4);
Benchmark.test(15,Test20Lib.local3.field1);
Benchmark.test(16,Test20Lib.local4.field5);
Benchmark.test(17,Test20Lib.local4.field6);
Benchmark.test(18,Test20Lib.local4.field2);
Benchmark.test(19,Test20Lib.local4.field3);
Benchmark.test(20,Test20Lib.local4.field4);
Benchmark.test(21,Test20Lib.local4.field1);
Benchmark.print();
}
}
