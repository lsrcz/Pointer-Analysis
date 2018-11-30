package runnabledataset;

import benchmark.tool.Benchmark;
import benchmark.tool.BasicClass;
class Test8Lib{
public static Test8Class1 local1;
public static Test8Class2 local2;
public static Test8Class2 local3;
}
class Test8Class1 extends BasicClass {
public static Test8Class1 field1;
public Test8Class2 field2;
public void method1(Test8Class2 arg0, int depth) {
if (depth == 0) return;
}
}
class Test8Class2 extends Test8Class1 {
public Test8Class2 field3;
public void method2(Test8Class2 arg0, int depth) {
if (depth == 0) return;
}
}
public class Test8{
public static void main(String[] args) {
int inputValue = 10;
Benchmark.alloc(1);
Test8Lib.local1 = new Test8Class1();
Benchmark.alloc(2);
Test8Lib.local2 = new Test8Class2();
Benchmark.alloc(3);
Test8Lib.local3 = new Test8Class2();
Test8Lib.local1.field1 = Test8Lib.local1;
Test8Lib.local1.field2 = Test8Lib.local3;
Test8Lib.local2.field3 = Test8Lib.local3;
Test8Lib.local2.field1 = Test8Lib.local3;
Test8Lib.local2.field2 = Test8Lib.local2;
Test8Lib.local3.field3 = Test8Lib.local2;
Test8Lib.local3.field1 = Test8Lib.local3;
Test8Lib.local3.field2 = Test8Lib.local3;
Test8Lib.local1.field1.method1(Test8Lib.local2,3);
for (int local4 = 0; local4<=3; local4 += 1) {
if (inputValue>=3) {
for (int local5 = 0; local5<=0; local5 += 1) {
for (int local6 = 0; local6<=3; local6 += 1) {
if (inputValue==4) {
}else {
}
}
}
}else {
Test8Lib.local2.field3.method2(Test8Lib.local3.field3,3);
}
}
if (inputValue>=4) {
Test8Lib.local2.field2.method1(Test8Lib.local3.field3,3);
}else {
if (inputValue>3) {
Test8Lib.local2.field2.method2(Test8Lib.local2.field3,3);
}
}
Test8Lib.local3.field3.method1(Test8Lib.local3.field3,3);
Test8Lib.local1.field1=Test8Lib.local2.field2;
Test8Lib.local2=Test8Lib.local3.field3;
if (inputValue==1) {
Test8Lib.local3.method2(Test8Lib.local2.field2,3);
}else {
if (inputValue>3) {
for (int local7 = 0; local7<=2; local7 += 1) {
if (inputValue>=1) {
if (inputValue>1) {
}else {
}
}
}
}else {
Test8Lib.local3.field2.method2(Test8Lib.local2,3);
}
}
Test8Lib.local3.method2(Test8Lib.local2,3);
for (int local8 = 0; local8<=3; local8 += 1) {
Test8Lib.local3.field3.method1(Test8Lib.local2.field2,3);
}
Test8Lib.local2.field2.method1(Test8Lib.local3.field2,3);
Benchmark.test(1,Test8Lib.local1);
Benchmark.test(2,Test8Lib.local2);
Benchmark.test(3,Test8Lib.local3);
Benchmark.test(4,Test8Lib.local1.field1);
Benchmark.test(5,Test8Lib.local1.field2);
Benchmark.test(6,Test8Lib.local2.field3);
Benchmark.test(7,Test8Lib.local2.field1);
Benchmark.test(8,Test8Lib.local2.field2);
Benchmark.test(9,Test8Lib.local3.field3);
Benchmark.test(10,Test8Lib.local3.field1);
Benchmark.test(11,Test8Lib.local3.field2);
Benchmark.print();
}
}
