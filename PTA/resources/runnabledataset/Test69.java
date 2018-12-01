package runnabledataset;

import benchmark.tool.Benchmark;
import benchmark.tool.BasicClass;
class Test69Lib{
public static Test69Class1 local1;
public static Test69Class2 local2;
public static Test69Class2 local3;
}
class Test69Class1 extends BasicClass {
public Test69Class1 field1;
public static void method1(Test69Class2 arg0, int depth) {
if (depth == 0) return;
for (int local4 = 0; local4<=0; local4 += 1) {
arg0.field3.field1.field1.method1(arg0.field2.field2,depth-1);
}
if (depth<=2) {
for (int local5 = 0; local5<=0; local5 += 1) {
if (depth<=4) {
arg0.field2.field2.field2=arg0;
}else {
for (int local6 = 0; local6<=0; local6 += 1) {
arg0.field2.field3.field1.method1(arg0.field2,depth-1);
}
}
}
}
if (depth==1) {
arg0.field1=arg0.field1;
}
}
}
class Test69Class2 extends Test69Class1 {
public Test69Class2 field2;
public Test69Class1 field3;
public Test69Class1 field4;
public static void method2(Test69Class2 arg0, Test69Class2 arg1, int depth) {
if (depth == 0) return;
}
}
public class Test69{
public static void main(String[] args) {
int inputValue = 10;
Benchmark.alloc(1);
Test69Lib.local1 = new Test69Class1();
Benchmark.alloc(2);
Test69Lib.local2 = new Test69Class2();
Benchmark.alloc(3);
Test69Lib.local3 = new Test69Class2();
Test69Lib.local1.field1 = Test69Lib.local2;
Test69Lib.local2.field2 = Test69Lib.local3;
Test69Lib.local2.field3 = Test69Lib.local3;
Test69Lib.local2.field4 = Test69Lib.local2;
Test69Lib.local2.field1 = Test69Lib.local1;
Test69Lib.local3.field2 = Test69Lib.local3;
Test69Lib.local3.field3 = Test69Lib.local1;
Test69Lib.local3.field4 = Test69Lib.local1;
Test69Lib.local3.field1 = Test69Lib.local2;
Test69Lib.local3.field2.field2.field2=Test69Lib.local2.field2;
Test69Lib.local1.method1(Test69Lib.local2.field2.field2.field2,3);
Test69Lib.local3.field2=Test69Lib.local3.field2;
if (inputValue<=1) {
if (inputValue<=3) {
Test69Lib.local2.field4.field1=Test69Lib.local3.field2.field2.field2;
}
}else {
if (inputValue>4) {
Test69Lib.local3.field2.field2.field3=Test69Lib.local3.field2.field2.field3;
}
}
if (inputValue<=1) {
for (int local7 = 0; local7<=3; local7 += 1) {
for (int local8 = 0; local8<=0; local8 += 1) {
Test69Lib.local2.field2.field1=Test69Lib.local3.field2.field1.field1;
}
}
}
Test69Lib.local2.field2.field2.field1.method1(Test69Lib.local2.field2.field2,3);
if (inputValue>=4) {
for (int local9 = 0; local9<=3; local9 += 1) {
for (int local10 = 0; local10<=1; local10 += 1) {
for (int local11 = 0; local11<=2; local11 += 1) {
Test69Lib.local3.method2(Test69Lib.local3,Test69Lib.local2.field2.field2,3);
}
}
}
}
if (inputValue>=4) {
Test69Lib.local2.field2=Test69Lib.local3.field2.field2.field2;
}else {
for (int local12 = 0; local12<=3; local12 += 1) {
Test69Lib.local2.field2.method2(Test69Lib.local3.field2.field2.field2,Test69Lib.local2.field2.field2,3);
}
}
Test69Lib.local3.field1.field1.method1(Test69Lib.local2,3);
for (int local13 = 0; local13<=3; local13 += 1) {
Test69Lib.local3.field2.field2.field2.method1(Test69Lib.local2,3);
}
Benchmark.test(1,Test69Lib.local1);
Benchmark.test(2,Test69Lib.local2);
Benchmark.test(3,Test69Lib.local3);
Benchmark.test(4,Test69Lib.local1.field1);
Benchmark.test(5,Test69Lib.local2.field2);
Benchmark.test(6,Test69Lib.local2.field3);
Benchmark.test(7,Test69Lib.local2.field4);
Benchmark.test(8,Test69Lib.local2.field1);
Benchmark.test(9,Test69Lib.local3.field2);
Benchmark.test(10,Test69Lib.local3.field3);
Benchmark.test(11,Test69Lib.local3.field4);
Benchmark.test(12,Test69Lib.local3.field1);
Benchmark.print();
}
}
