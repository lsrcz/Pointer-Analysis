package runnabledataset;

import benchmark.tool.Benchmark;
import benchmark.tool.BasicClass;
class Test70Lib{
public static Test70Class1 local1;
public static Test70Class2 local2;
public static Test70Class2 local3;
}
class Test70Class1 extends BasicClass {
public Test70Class1 field1;
public Test70Class1 field2;
public static void method1(Test70Class2 arg0, Test70Class2 arg1, int depth) {
if (depth == 0) return;
arg1.field3.field3=arg0.field3;
arg0.field1.field1.field2=arg0.field3.field3.field3;
for (int local4 = 0; local4<=2; local4 += 1) {
if (depth<=3) {
if (depth>=1) {
if (depth>=3) {
for (int local5 = 0; local5<=0; local5 += 1) {
}
}else {
if (depth==4) {
}else {
}
}
}
}else {
arg0.field3.field3.field3=arg1.field3;
}
}
}
}
class Test70Class2 extends Test70Class1 {
public Test70Class2 field3;
public Test70Class1 method2(Test70Class1 arg0, Test70Class2 arg1, int depth) {
if (depth == 0) return Test70Lib.local1;
if (depth<3) {
arg0.field1.field1=this.field1.field2.field2;
}
if (depth>3) {
if (depth==1) {
if (depth>4) {
this.field1.field1.field2=this.field3.method2(arg1.field2.field1.field1,this.field3,depth-1);
}else {
arg0.field2.field1.field1.method1(this.field3.field3,arg1.field3.field3,depth-1);
}
}
}else {
for (int local6 = 0; local6<=3; local6 += 1) {
this.field3.field2.field2.method1(this,arg1,depth-1);
}
}
if (depth>2) {
for (int local7 = 0; local7<=2; local7 += 1) {
if (depth>=4) {
if (depth>=4) {
if (depth==4) {
}else {
}
}else {
arg1.field3.field1.field2=arg1.field3.field2;
}
}else {
for (int local8 = 0; local8<=3; local8 += 1) {
arg1.field2.field2.method1(this.field3,arg1.field3.field3,depth-1);
}
}
}
}
return this.field3.field2.field1;
}
}
public class Test70{
public static void main(String[] args) {
int inputValue = 10;
Benchmark.alloc(1);
Test70Lib.local1 = new Test70Class1();
Benchmark.alloc(2);
Test70Lib.local2 = new Test70Class2();
Benchmark.alloc(3);
Test70Lib.local3 = new Test70Class2();
Test70Lib.local1.field1 = Test70Lib.local3;
Test70Lib.local1.field2 = Test70Lib.local2;
Test70Lib.local2.field3 = Test70Lib.local2;
Test70Lib.local2.field1 = Test70Lib.local1;
Test70Lib.local2.field2 = Test70Lib.local2;
Test70Lib.local3.field3 = Test70Lib.local3;
Test70Lib.local3.field1 = Test70Lib.local3;
Test70Lib.local3.field2 = Test70Lib.local3;
if (inputValue<3) {
if (inputValue==4) {
for (int local9 = 0; local9<=3; local9 += 1) {
if (inputValue>=4) {
for (int local10 = 0; local10<=0; local10 += 1) {
}
}else {
if (inputValue<1) {
}else {
}
}
}
}
}else {
Test70Lib.local2.field2.field1.field2=Test70Lib.local2.field3.field1;
}
Test70Lib.local1.field2.field2.field2=Test70Lib.local3.field2.field1.field2;
Test70Lib.local3.field3.field1.field1.method1(Test70Lib.local2.field3.field3,Test70Lib.local3.field3.field3,3);
Test70Lib.local2.field3.field3.method2(Test70Lib.local3,Test70Lib.local3,3);
Test70Lib.local2.field1.field1.field2.method1(Test70Lib.local2.field3.field3.field3,Test70Lib.local2.field3.field3,3);
if (inputValue==3) {
Test70Lib.local2.field3.field3.field1.method1(Test70Lib.local2.field3.field3.field3,Test70Lib.local2.field3.field3,3);
}else {
Test70Lib.local3.field3.field3.method2(Test70Lib.local3.field3.field1.field2,Test70Lib.local2,3);
}
Test70Lib.local2.field1.field1.method1(Test70Lib.local3.field3.field3.field3,Test70Lib.local2.field3.field3.field3,3);
if (inputValue<=1) {
Test70Lib.local3.field2.field2.field2=Test70Lib.local2.field3.field3.field3.method2(Test70Lib.local3.field3.field3.field2,Test70Lib.local3,3);
}
for (int local11 = 0; local11<=2; local11 += 1) {
Test70Lib.local3.field2.field2.field1.method1(Test70Lib.local3.field3.field3,Test70Lib.local2.field3.field3.field3,3);
}
if (inputValue<2) {
Test70Lib.local3.field2.field1=Test70Lib.local2.field3.field2;
}
Benchmark.test(1,Test70Lib.local1);
Benchmark.test(2,Test70Lib.local2);
Benchmark.test(3,Test70Lib.local3);
Benchmark.test(4,Test70Lib.local1.field1);
Benchmark.test(5,Test70Lib.local1.field2);
Benchmark.test(6,Test70Lib.local2.field3);
Benchmark.test(7,Test70Lib.local2.field1);
Benchmark.test(8,Test70Lib.local2.field2);
Benchmark.test(9,Test70Lib.local3.field3);
Benchmark.test(10,Test70Lib.local3.field1);
Benchmark.test(11,Test70Lib.local3.field2);
Benchmark.print();
}
}
