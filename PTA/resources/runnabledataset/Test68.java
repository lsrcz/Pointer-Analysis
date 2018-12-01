package runnabledataset;

import benchmark.tool.Benchmark;
import benchmark.tool.BasicClass;
class Test68Lib{
public static Test68Class1 local1;
public static Test68Class2 local2;
public static Test68Class2 local3;
}
class Test68Class1 extends BasicClass {
public Test68Class1 field1;
public Test68Class1 field2;
public void method1(Test68Class2 arg0, int depth) {
if (depth == 0) return;
for (int local4 = 0; local4<=1; local4 += 1) {
for (int local5 = 0; local5<=1; local5 += 1) {
arg0.field5.field1.field1=arg0.field5;
}
}
}
}
class Test68Class2 extends Test68Class1 {
public Test68Class1 field3;
public Test68Class1 field4;
public Test68Class1 field5;
public Test68Class1 field6;
public Test68Class1 method2(Test68Class1 arg0, Test68Class1 arg1, int depth) {
if (depth == 0) return Test68Lib.local3;
this.method2(arg1.field2,this.field6.field1,depth-1);
for (int local6 = 0; local6<=3; local6 += 1) {
arg0.field1=this.method2(this.field5.field1.field2,this.field3.field1.field2,depth-1);
}
this.method2(arg1.field2.field2.field2,this.field3.field2.field2,depth-1);
return arg0.field2.field2.field2;
}
}
public class Test68{
public static void main(String[] args) {
int inputValue = 10;
Benchmark.alloc(1);
Test68Lib.local1 = new Test68Class1();
Benchmark.alloc(2);
Test68Lib.local2 = new Test68Class2();
Benchmark.alloc(3);
Test68Lib.local3 = new Test68Class2();
Test68Lib.local1.field1 = Test68Lib.local3;
Test68Lib.local1.field2 = Test68Lib.local1;
Test68Lib.local2.field3 = Test68Lib.local3;
Test68Lib.local2.field4 = Test68Lib.local2;
Test68Lib.local2.field5 = Test68Lib.local2;
Test68Lib.local2.field6 = Test68Lib.local3;
Test68Lib.local2.field1 = Test68Lib.local3;
Test68Lib.local2.field2 = Test68Lib.local1;
Test68Lib.local3.field3 = Test68Lib.local2;
Test68Lib.local3.field4 = Test68Lib.local1;
Test68Lib.local3.field5 = Test68Lib.local2;
Test68Lib.local3.field6 = Test68Lib.local3;
Test68Lib.local3.field1 = Test68Lib.local3;
Test68Lib.local3.field2 = Test68Lib.local2;
for (int local7 = 0; local7<=1; local7 += 1) {
for (int local8 = 0; local8<=1; local8 += 1) {
Test68Lib.local2=Test68Lib.local2;
}
}
Test68Lib.local3.field4.field1.field2.method1(Test68Lib.local2,3);
for (int local9 = 0; local9<=1; local9 += 1) {
if (inputValue>2) {
if (inputValue>4) {
Test68Lib.local2=Test68Lib.local2;
}
}else {
if (inputValue>=2) {
for (int local10 = 0; local10<=0; local10 += 1) {
Test68Lib.local2.field1.field1.field1=Test68Lib.local2.field1.field1;
}
}
}
}
for (int local11 = 0; local11<=3; local11 += 1) {
if (inputValue>4) {
Test68Lib.local3=Test68Lib.local3;
}else {
for (int local12 = 0; local12<=2; local12 += 1) {
Test68Lib.local2=Test68Lib.local3;
}
}
}
Test68Lib.local2.field1.field2.field1=Test68Lib.local2.method2(Test68Lib.local2.field2.field2.field1,Test68Lib.local3.field5.field2.field1,3);
if (inputValue>2) {
if (inputValue>=2) {
for (int local13 = 0; local13<=2; local13 += 1) {
for (int local14 = 0; local14<=2; local14 += 1) {
Test68Lib.local2=Test68Lib.local3;
}
}
}
}
for (int local15 = 0; local15<=2; local15 += 1) {
if (inputValue<=3) {
for (int local16 = 0; local16<=2; local16 += 1) {
Test68Lib.local2=Test68Lib.local3;
}
}
}
Test68Lib.local2=Test68Lib.local3;
Test68Lib.local3.field6.field1=Test68Lib.local3.method2(Test68Lib.local3.field1.field2,Test68Lib.local3.field3.field1,3);
for (int local17 = 0; local17<=3; local17 += 1) {
Test68Lib.local3.field1.field2=Test68Lib.local2.method2(Test68Lib.local2.field4.field2.field1,Test68Lib.local2.field4.field1.field1,3);
}
Benchmark.test(1,Test68Lib.local1);
Benchmark.test(2,Test68Lib.local2);
Benchmark.test(3,Test68Lib.local3);
Benchmark.test(4,Test68Lib.local1.field1);
Benchmark.test(5,Test68Lib.local1.field2);
Benchmark.test(6,Test68Lib.local2.field3);
Benchmark.test(7,Test68Lib.local2.field4);
Benchmark.test(8,Test68Lib.local2.field5);
Benchmark.test(9,Test68Lib.local2.field6);
Benchmark.test(10,Test68Lib.local2.field1);
Benchmark.test(11,Test68Lib.local2.field2);
Benchmark.test(12,Test68Lib.local3.field3);
Benchmark.test(13,Test68Lib.local3.field4);
Benchmark.test(14,Test68Lib.local3.field5);
Benchmark.test(15,Test68Lib.local3.field6);
Benchmark.test(16,Test68Lib.local3.field1);
Benchmark.test(17,Test68Lib.local3.field2);
Benchmark.print();
}
}
