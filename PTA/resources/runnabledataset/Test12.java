package runnabledataset;

import benchmark.tool.Benchmark;
import benchmark.tool.BasicClass;
class Test12Lib{
public static Test12Class1 local1;
public static Test12Class1 local2;
public static Test12Class2 local3;
}
class Test12Class1 extends BasicClass {
public static Test12Class1 field1;
public static Test12Class1 field2;
public void method1(int depth) {
if (depth == 0) return;
}
}
class Test12Class2 extends Test12Class1 {
public Test12Class2 field3;
public Test12Class1 field4;
public Test12Class2 method2(int depth) {
if (depth == 0) return Test12Lib.local3;
return this.field3;
}
}
public class Test12{
public static void main(String[] args) {
int inputValue = 10;
Benchmark.alloc(1);
Test12Lib.local1 = new Test12Class1();
Benchmark.alloc(2);
Test12Lib.local2 = new Test12Class1();
Benchmark.alloc(3);
Test12Lib.local3 = new Test12Class2();
Test12Lib.local1.field1 = Test12Lib.local3;
Test12Lib.local1.field2 = Test12Lib.local1;
Test12Lib.local2.field1 = Test12Lib.local1;
Test12Lib.local2.field2 = Test12Lib.local1;
Test12Lib.local3.field3 = Test12Lib.local3;
Test12Lib.local3.field4 = Test12Lib.local2;
Test12Lib.local3.field1 = Test12Lib.local2;
Test12Lib.local3.field2 = Test12Lib.local2;
for (int local4 = 0; local4<=1; local4 += 1) {
for (int local5 = 0; local5<=1; local5 += 1) {
if (inputValue<3) {
if (inputValue==2) {
for (int local6 = 0; local6<=2; local6 += 1) {
}
}
}
}
}
if (inputValue==4) {
Test12Lib.local1=Test12Lib.local3.method2(3);
}else {
if (inputValue<=3) {
if (inputValue>=1) {
if (inputValue>4) {
if (inputValue>=1) {
}
}
}
}
}
Test12Lib.local3=Test12Lib.local3.field3;
if (inputValue>=4) {
if (inputValue<=4) {
if (inputValue>1) {
Test12Lib.local2=Test12Lib.local3.field3.method2(3);
}else {
Test12Lib.local3.field1=Test12Lib.local1.field1;
}
}else {
Test12Lib.local2.field2=Test12Lib.local2.field1;
}
}
for (int local7 = 0; local7<=2; local7 += 1) {
Test12Lib.local1.field2.method1(3);
}
if (inputValue>=4) {
Test12Lib.local3.field2.method1(3);
}
if (inputValue>=2) {
Test12Lib.local3.field1.method1(3);
}
Test12Lib.local3=Test12Lib.local3.field3;
Test12Lib.local1.method1(3);
for (int local8 = 0; local8<=0; local8 += 1) {
for (int local9 = 0; local9<=0; local9 += 1) {
if (inputValue>3) {
Test12Lib.local1.field1=Test12Lib.local3.method2(3);
}else {
for (int local10 = 0; local10<=0; local10 += 1) {
Test12Lib.local3.field3=Test12Lib.local3.field3;
}
}
}
}
Benchmark.test(1,Test12Lib.local1);
Benchmark.test(2,Test12Lib.local2);
Benchmark.test(3,Test12Lib.local3);
Benchmark.test(4,Test12Lib.local1.field1);
Benchmark.test(5,Test12Lib.local1.field2);
Benchmark.test(6,Test12Lib.local2.field1);
Benchmark.test(7,Test12Lib.local2.field2);
Benchmark.test(8,Test12Lib.local3.field3);
Benchmark.test(9,Test12Lib.local3.field4);
Benchmark.test(10,Test12Lib.local3.field1);
Benchmark.test(11,Test12Lib.local3.field2);
Benchmark.print();
}
}
