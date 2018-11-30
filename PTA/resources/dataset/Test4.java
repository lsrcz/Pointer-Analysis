package dataset;

import benchmark.internal.Benchmark;
import benchmark.tool.BasicClass;
class Test4Lib{
public static Test4Class1 local1;
public static Test4Class1 local2;
public static Test4Class2 local3;
public static Test4Class2 local4;
}
class Test4Class1 extends BasicClass {
public static Test4Class2 field1;
public Test4Class2 method1(Test4Class1 arg0, Test4Class1 arg1, int depth) {
if (depth == 0) return Test4Lib.local3;
return this.field1;
}
}
class Test4Class2 extends Test4Class1 {
public static Test4Class1 field2;
public Test4Class2 method2(Test4Class2 arg0, Test4Class1 arg1, int depth) {
if (depth == 0) return Test4Lib.local3;
return arg0;
}
}
public class Test4{
public static void main(String[] args) {
int inputValue = 0;
Benchmark.alloc(1);
Test4Lib.local1 = new Test4Class1();
Benchmark.alloc(2);
Test4Lib.local2 = new Test4Class1();
Benchmark.alloc(3);
Test4Lib.local3 = new Test4Class2();
Benchmark.alloc(4);
Test4Lib.local4 = new Test4Class2();
Test4Lib.local1.field1 = Test4Lib.local4;
Test4Lib.local2.field1 = Test4Lib.local4;
Test4Lib.local3.field2 = Test4Lib.local1;
Test4Lib.local3.field1 = Test4Lib.local4;
Test4Lib.local4.field2 = Test4Lib.local1;
Test4Lib.local4.field1 = Test4Lib.local3;
if (inputValue>1) {
Test4Lib.local3.method2(Test4Lib.local1.field1,Test4Lib.local3.field2,3);
}else {
if (inputValue>1) {
for (int local5 = 0; local5<=3; local5 += 1) {
Test4Lib.local1=Test4Lib.local2.field1;
}
}
}
Test4Lib.local1.field1=Test4Lib.local1.field1.method2(Test4Lib.local3.field1,Test4Lib.local4.field2,3);
if (inputValue<=3) {
for (int local6 = 0; local6<=3; local6 += 1) {
Test4Lib.local4.field1=Test4Lib.local1.field1.method2(Test4Lib.local1.field1,Test4Lib.local4.field1,3);
}
}
Test4Lib.local3=Test4Lib.local1.field1;
for (int local7 = 0; local7<=1; local7 += 1) {
Test4Lib.local4.field2=Test4Lib.local3.field1.method2(Test4Lib.local1.field1,Test4Lib.local1.field1,3);
}
for (int local8 = 0; local8<=3; local8 += 1) {
Test4Lib.local2.field1=Test4Lib.local3;
}
if (inputValue<=2) {
Test4Lib.local1=Test4Lib.local4;
}
for (int local9 = 0; local9<=2; local9 += 1) {
Test4Lib.local4.field2=Test4Lib.local2;
}
Test4Lib.local2=Test4Lib.local3.method1(Test4Lib.local3.field2,Test4Lib.local4.field2,3);
if (inputValue==1) {
for (int local10 = 0; local10<=3; local10 += 1) {
for (int local11 = 0; local11<=3; local11 += 1) {
Test4Lib.local3=Test4Lib.local3.field1;
}
}
}
Benchmark.test(1,Test4Lib.local1);
Benchmark.test(2,Test4Lib.local2);
Benchmark.test(3,Test4Lib.local3);
Benchmark.test(4,Test4Lib.local4);
Benchmark.test(5,Test4Lib.local1.field1);
Benchmark.test(6,Test4Lib.local2.field1);
Benchmark.test(7,Test4Lib.local3.field2);
Benchmark.test(8,Test4Lib.local3.field1);
Benchmark.test(9,Test4Lib.local4.field2);
Benchmark.test(10,Test4Lib.local4.field1);
Benchmark.print();
}
}
