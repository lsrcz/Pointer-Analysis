package runnabledataset;

import benchmark.tool.Benchmark;
import benchmark.tool.BasicClass;
class Test75Lib{
public static Test75Class1 local1;
public static Test75Class1 local2;
public static Test75Class2 local3;
public static Test75Class2 local4;
}
class Test75Class1 extends BasicClass {
public Test75Class2 field1;
public Test75Class2 field2;
public Test75Class1 field3;
public Test75Class1 field4;
public void method1(int depth) {
if (depth == 0) return;
if (depth==3) {
this.field2.field7.field1.method2(this.field2.field7.field2,this.field3.field2.field3,depth-1);
}else {
this.field1.field2.field1=this.field2.field6.field5;
}
this.field2.field4.field1.method1(depth-1);
if (depth>=4) {
this.field1.method2(this.field1.field7.field1,this.field1.field5.field3,depth-1);
}else {
this.field1.field5.field4=this.field4.field2.field6;
}
this.field3=this.field1.field7.field3;
}
}
class Test75Class2 extends Test75Class1 {
public Test75Class2 field5;
public Test75Class2 field6;
public Test75Class2 field7;
public void method2(Test75Class2 arg0, Test75Class1 arg1, int depth) {
if (depth == 0) return;
arg1.field2.field2.field7.method2(arg1.field3.field4.field2,arg1.field1.field1.field1,depth-1);
arg0.field6.field5.field4=arg1.field4.field1;
for (int local5 = 0; local5<=0; local5 += 1) {
arg0.field6.field1.field1=this.field5.field2.field6;
}
this.field6.field1=this.field2.field3.field2;
}
}
public class Test75{
public static void main(String[] args) {
int inputValue = 10;
Benchmark.alloc(1);
Test75Lib.local1 = new Test75Class1();
Benchmark.alloc(2);
Test75Lib.local2 = new Test75Class1();
Benchmark.alloc(3);
Test75Lib.local3 = new Test75Class2();
Benchmark.alloc(4);
Test75Lib.local4 = new Test75Class2();
Test75Lib.local1.field1 = Test75Lib.local3;
Test75Lib.local1.field2 = Test75Lib.local3;
Test75Lib.local1.field3 = Test75Lib.local4;
Test75Lib.local1.field4 = Test75Lib.local2;
Test75Lib.local2.field1 = Test75Lib.local3;
Test75Lib.local2.field2 = Test75Lib.local4;
Test75Lib.local2.field3 = Test75Lib.local1;
Test75Lib.local2.field4 = Test75Lib.local3;
Test75Lib.local3.field5 = Test75Lib.local3;
Test75Lib.local3.field6 = Test75Lib.local3;
Test75Lib.local3.field7 = Test75Lib.local4;
Test75Lib.local3.field1 = Test75Lib.local3;
Test75Lib.local3.field2 = Test75Lib.local3;
Test75Lib.local3.field3 = Test75Lib.local4;
Test75Lib.local3.field4 = Test75Lib.local2;
Test75Lib.local4.field5 = Test75Lib.local4;
Test75Lib.local4.field6 = Test75Lib.local3;
Test75Lib.local4.field7 = Test75Lib.local3;
Test75Lib.local4.field1 = Test75Lib.local3;
Test75Lib.local4.field2 = Test75Lib.local4;
Test75Lib.local4.field3 = Test75Lib.local1;
Test75Lib.local4.field4 = Test75Lib.local1;
Test75Lib.local2.field1.field4.field1=Test75Lib.local4.field5.field1.field1;
if (inputValue>=2) {
Test75Lib.local2.field2.field2.field7.method2(Test75Lib.local3.field5.field3.field2,Test75Lib.local3.field1.field1.field4,3);
}else {
if (inputValue<=1) {
Test75Lib.local3.field2.field6.field1.method2(Test75Lib.local4.field5.field1.field5,Test75Lib.local2.field2.field2.field3,3);
}
}
if (inputValue<1) {
Test75Lib.local4.field4.field2.field5.method2(Test75Lib.local2.field1.field5.field5,Test75Lib.local3.field6.field2.field2,3);
}else {
Test75Lib.local4.field7.field6.field1=Test75Lib.local4.field2.field5.field1;
}
Test75Lib.local2.field4.field1.field4=Test75Lib.local4.field1.field5.field2;
if (inputValue<=4) {
Test75Lib.local1.field1.field5.field7=Test75Lib.local4.field6.field2.field1;
}
for (int local6 = 0; local6<=0; local6 += 1) {
Test75Lib.local1.field3.field4.field3=Test75Lib.local4.field4.field1.field7;
}
for (int local7 = 0; local7<=0; local7 += 1) {
Test75Lib.local3.field1.field3.field2.method2(Test75Lib.local4.field4.field1.field2,Test75Lib.local1.field2.field5,3);
}
Test75Lib.local3.field1.field5.field3.method1(3);
Test75Lib.local3.field2.field7.field3=Test75Lib.local1.field2.field1.field6;
if (inputValue<=4) {
for (int local8 = 0; local8<=3; local8 += 1) {
Test75Lib.local1.field2.field6.field6=Test75Lib.local3.field6.field5;
}
}
Benchmark.test(1,Test75Lib.local1);
Benchmark.test(2,Test75Lib.local2);
Benchmark.test(3,Test75Lib.local3);
Benchmark.test(4,Test75Lib.local4);
Benchmark.test(5,Test75Lib.local1.field1);
Benchmark.test(6,Test75Lib.local1.field2);
Benchmark.test(7,Test75Lib.local1.field3);
Benchmark.test(8,Test75Lib.local1.field4);
Benchmark.test(9,Test75Lib.local2.field1);
Benchmark.test(10,Test75Lib.local2.field2);
Benchmark.test(11,Test75Lib.local2.field3);
Benchmark.test(12,Test75Lib.local2.field4);
Benchmark.test(13,Test75Lib.local3.field5);
Benchmark.test(14,Test75Lib.local3.field6);
Benchmark.test(15,Test75Lib.local3.field7);
Benchmark.test(16,Test75Lib.local3.field1);
Benchmark.test(17,Test75Lib.local3.field2);
Benchmark.test(18,Test75Lib.local3.field3);
Benchmark.test(19,Test75Lib.local3.field4);
Benchmark.test(20,Test75Lib.local4.field5);
Benchmark.test(21,Test75Lib.local4.field6);
Benchmark.test(22,Test75Lib.local4.field7);
Benchmark.test(23,Test75Lib.local4.field1);
Benchmark.test(24,Test75Lib.local4.field2);
Benchmark.test(25,Test75Lib.local4.field3);
Benchmark.test(26,Test75Lib.local4.field4);
Benchmark.print();
}
}
