package runnabledataset;

import benchmark.tool.Benchmark;
import benchmark.tool.BasicClass;
class Test13Lib{
public static Test13Class1 local1;
public static Test13Class2 local2;
}
class Test13Class1 extends BasicClass {
public Test13Class1 field1;
public static void method1(int depth) {
if (depth == 0) return;
}
}
class Test13Class2 extends Test13Class1 {
public Test13Class1 field2;
public Test13Class1 method2(Test13Class1 arg0, Test13Class1 arg1, int depth) {
if (depth == 0) return Test13Lib.local1;
return this.field2;
}
}
public class Test13{
public static void main(String[] args) {
int inputValue = 10;
Benchmark.alloc(1);
Test13Lib.local1 = new Test13Class1();
Benchmark.alloc(2);
Test13Lib.local2 = new Test13Class2();
Test13Lib.local1.field1 = Test13Lib.local1;
Test13Lib.local2.field2 = Test13Lib.local1;
Test13Lib.local2.field1 = Test13Lib.local1;
for (int local3 = 0; local3<=1; local3 += 1) {
Test13Lib.local1=Test13Lib.local2.method2(Test13Lib.local2.field1,Test13Lib.local1.field1,3);
}
for (int local4 = 0; local4<=3; local4 += 1) {
if (inputValue>3) {
Test13Lib.local2.field2=Test13Lib.local2.method2(Test13Lib.local2,Test13Lib.local2.field1,3);
}
}
Test13Lib.local1=Test13Lib.local2.method2(Test13Lib.local2.field1,Test13Lib.local1,3);
Test13Lib.local2=Test13Lib.local2;
for (int local5 = 0; local5<=2; local5 += 1) {
Test13Lib.local2.field2.method1(3);
}
if (inputValue==1) {
for (int local6 = 0; local6<=0; local6 += 1) {
if (inputValue>1) {
Test13Lib.local1=Test13Lib.local2.field2;
}
}
}
if (inputValue>=2) {
if (inputValue>=1) {
Test13Lib.local2.field2=Test13Lib.local2.method2(Test13Lib.local2,Test13Lib.local1.field1,3);
}else {
if (inputValue>3) {
if (inputValue>2) {
if (inputValue>=3) {
}
}
}
}
}
Test13Lib.local2.method1(3);
if (inputValue>=2) {
for (int local7 = 0; local7<=0; local7 += 1) {
if (inputValue<=1) {
for (int local8 = 0; local8<=1; local8 += 1) {
Test13Lib.local1.field1.method1(3);
}
}else {
Test13Lib.local1=Test13Lib.local2.field2;
}
}
}else {
Test13Lib.local2=Test13Lib.local2;
}
for (int local9 = 0; local9<=0; local9 += 1) {
if (inputValue==1) {
Test13Lib.local2=Test13Lib.local2;
}
}
Benchmark.test(1,Test13Lib.local1);
Benchmark.test(2,Test13Lib.local2);
Benchmark.test(3,Test13Lib.local1.field1);
Benchmark.test(4,Test13Lib.local2.field2);
Benchmark.test(5,Test13Lib.local2.field1);
Benchmark.print();
}
}
