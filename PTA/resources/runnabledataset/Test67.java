package runnabledataset;

import benchmark.tool.Benchmark;
import benchmark.tool.BasicClass;
class Test67Lib{
public static Test67Class1 local1;
public static Test67Class2 local2;
}
class Test67Class1 extends BasicClass {
public Test67Class2 field1;
public Test67Class2 field2;
public Test67Class1 field3;
public Test67Class1 field4;
public void method1(int depth) {
if (depth == 0) return;
if (depth>3) {
this.field2.field2=this.field2.field2.field5;
}else {
for (int local3 = 0; local3<=3; local3 += 1) {
for (int local4 = 0; local4<=1; local4 += 1) {
this.field1.field3=this.field2.field4.field3;
}
}
}
this.field2.field5.field6.method1(depth-1);
for (int local5 = 0; local5<=0; local5 += 1) {
this.field2.field6.method2(this.field3.field3.field1,this.field4.field1.field1,depth-1);
}
}
}
class Test67Class2 extends Test67Class1 {
public Test67Class2 field5;
public Test67Class2 field6;
public static void method2(Test67Class2 arg0, Test67Class2 arg1, int depth) {
if (depth == 0) return;
if (depth==3) {
for (int local6 = 0; local6<=0; local6 += 1) {
if (depth>=3) {
arg0.field3.field1.field6=arg0.field2.field3.field2;
}else {
for (int local7 = 0; local7<=0; local7 += 1) {
for (int local8 = 0; local8<=1; local8 += 1) {
}
}
}
}
}
for (int local9 = 0; local9<=0; local9 += 1) {
arg0.field4.field2.field4.method1(depth-1);
}
if (depth<3) {
arg1.field2.field1.method2(arg0.field6.field5.field2,arg0.field3.field3.field1,depth-1);
}
}
}
public class Test67{
public static void main(String[] args) {
int inputValue = 10;
Benchmark.alloc(1);
Test67Lib.local1 = new Test67Class1();
Benchmark.alloc(2);
Test67Lib.local2 = new Test67Class2();
Test67Lib.local1.field1 = Test67Lib.local2;
Test67Lib.local1.field2 = Test67Lib.local2;
Test67Lib.local1.field3 = Test67Lib.local2;
Test67Lib.local1.field4 = Test67Lib.local2;
Test67Lib.local2.field5 = Test67Lib.local2;
Test67Lib.local2.field6 = Test67Lib.local2;
Test67Lib.local2.field1 = Test67Lib.local2;
Test67Lib.local2.field2 = Test67Lib.local2;
Test67Lib.local2.field3 = Test67Lib.local2;
Test67Lib.local2.field4 = Test67Lib.local1;
Test67Lib.local2.field3.field1.field3=Test67Lib.local2.field1.field5;
Test67Lib.local1.field4.field1.field5.method1(3);
Test67Lib.local2.field6.field1.method1(3);
if (inputValue<1) {
Test67Lib.local1.field2.field1.field5.method1(3);
}else {
Test67Lib.local2.field5.field2.method1(3);
}
for (int local10 = 0; local10<=3; local10 += 1) {
if (inputValue<=4) {
if (inputValue==1) {
if (inputValue>1) {
Test67Lib.local2.field3.field3.field2=Test67Lib.local1.field4.field1.field2;
}
}else {
Test67Lib.local1.field2.field1.field2.method1(3);
}
}
}
Test67Lib.local2.field5.field4.field2.method1(3);
if (inputValue<2) {
if (inputValue>=4) {
Test67Lib.local2.field5.field3.field3.method1(3);
}
}
Test67Lib.local2.field5.field2.field6.method2(Test67Lib.local1.field1.field3.field2,Test67Lib.local2.field5.field1.field1,3);
for (int local11 = 0; local11<=1; local11 += 1) {
for (int local12 = 0; local12<=0; local12 += 1) {
for (int local13 = 0; local13<=2; local13 += 1) {
Test67Lib.local1.field1.field4=Test67Lib.local2.field2.field2;
}
}
}
Test67Lib.local2.field2.field5.field1=Test67Lib.local1.field1.field2.field1;
Benchmark.test(1,Test67Lib.local1);
Benchmark.test(2,Test67Lib.local2);
Benchmark.test(3,Test67Lib.local1.field1);
Benchmark.test(4,Test67Lib.local1.field2);
Benchmark.test(5,Test67Lib.local1.field3);
Benchmark.test(6,Test67Lib.local1.field4);
Benchmark.test(7,Test67Lib.local2.field5);
Benchmark.test(8,Test67Lib.local2.field6);
Benchmark.test(9,Test67Lib.local2.field1);
Benchmark.test(10,Test67Lib.local2.field2);
Benchmark.test(11,Test67Lib.local2.field3);
Benchmark.test(12,Test67Lib.local2.field4);
Benchmark.print();
}
}
