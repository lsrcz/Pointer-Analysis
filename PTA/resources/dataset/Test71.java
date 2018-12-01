package dataset;

import benchmark.internal.Benchmark;
import benchmark.tool.BasicClass;
class Test71Lib{
public static Test71Class1 local1;
public static Test71Class1 local2;
public static Test71Class2 local3;
public static Test71Class2 local4;
}
class Test71Class1 extends BasicClass {
public Test71Class1 field1;
public static Test71Class2 method1(Test71Class2 arg0, Test71Class1 arg1, int depth) {
if (depth == 0) return Test71Lib.local3;
for (int local5 = 0; local5<=0; local5 += 1) {
if (depth>3) {
arg1.method1(arg0,arg1,depth-1);
}
}
arg1.field1.field1=arg1.field1.field1.method1(arg0,arg1,depth-1);
for (int local6 = 0; local6<=0; local6 += 1) {
arg0=arg0;
}
arg0.field1.field1.field1=arg0.field1.field1;
return arg0;
}
}
class Test71Class2 extends Test71Class1 {
public Test71Class1 field2;
public Test71Class1 method2(Test71Class1 arg0, int depth) {
if (depth == 0) return Test71Lib.local4;
return this.field2.field1;
}
}
public class Test71{
public static void main(String[] args) {
int inputValue = 0;
Benchmark.alloc(1);
Test71Lib.local1 = new Test71Class1();
Benchmark.alloc(2);
Test71Lib.local2 = new Test71Class1();
Benchmark.alloc(3);
Test71Lib.local3 = new Test71Class2();
Benchmark.alloc(4);
Test71Lib.local4 = new Test71Class2();
Test71Lib.local1.field1 = Test71Lib.local3;
Test71Lib.local2.field1 = Test71Lib.local3;
Test71Lib.local3.field2 = Test71Lib.local2;
Test71Lib.local3.field1 = Test71Lib.local1;
Test71Lib.local4.field2 = Test71Lib.local4;
Test71Lib.local4.field1 = Test71Lib.local4;
if (inputValue<=2) {
Test71Lib.local1.field1=Test71Lib.local3.field1;
}else {
for (int local7 = 0; local7<=0; local7 += 1) {
for (int local8 = 0; local8<=2; local8 += 1) {
Test71Lib.local3.field2=Test71Lib.local3.field1.field1.field1;
}
}
}
if (inputValue<=2) {
Test71Lib.local3.field1.field1.field1.method1(Test71Lib.local3,Test71Lib.local1.field1,3);
}
for (int local9 = 0; local9<=1; local9 += 1) {
for (int local10 = 0; local10<=2; local10 += 1) {
Test71Lib.local2.field1.field1.field1=Test71Lib.local3.field2.field1;
}
}
Test71Lib.local3.field1.method1(Test71Lib.local4,Test71Lib.local3.field1,3);
for (int local11 = 0; local11<=1; local11 += 1) {
Test71Lib.local1.field1.field1.field1=Test71Lib.local4;
}
Test71Lib.local2.field1.method1(Test71Lib.local3,Test71Lib.local1.field1.field1.field1,3);
if (inputValue<=1) {
Test71Lib.local4.field2.field1.field1=Test71Lib.local1.field1.field1;
}else {
if (inputValue>=3) {
if (inputValue==1) {
for (int local12 = 0; local12<=0; local12 += 1) {
if (inputValue==4) {
}
}
}
}
}
Test71Lib.local3=Test71Lib.local4;
Test71Lib.local1=Test71Lib.local2;
Test71Lib.local1=Test71Lib.local4.method2(Test71Lib.local1,3);
Benchmark.test(1,Test71Lib.local1);
Benchmark.test(2,Test71Lib.local2);
Benchmark.test(3,Test71Lib.local3);
Benchmark.test(4,Test71Lib.local4);
Benchmark.test(5,Test71Lib.local1.field1);
Benchmark.test(6,Test71Lib.local2.field1);
Benchmark.test(7,Test71Lib.local3.field2);
Benchmark.test(8,Test71Lib.local3.field1);
Benchmark.test(9,Test71Lib.local4.field2);
Benchmark.test(10,Test71Lib.local4.field1);
Benchmark.print();
}
}
