package runnabledataset;

import benchmark.tool.Benchmark;
import benchmark.tool.BasicClass;
class Test73Lib{
public static Test73Class1 local1;
public static Test73Class1 local2;
public static Test73Class2 local3;
public static Test73Class2 local4;
}
class Test73Class1 extends BasicClass {
public Test73Class2 field1;
public Test73Class1 field2;
public Test73Class1 field3;
public Test73Class2 field4;
public void method1(int depth) {
if (depth == 0) return;
this.field4.field2.field4.method2(depth-1);
this.field2.field3=this.field2.field4.field4;
this.field3.field1.field7.method2(depth-1);
}
}
class Test73Class2 extends Test73Class1 {
public Test73Class1 field5;
public Test73Class2 field6;
public Test73Class2 field7;
public void method2(int depth) {
if (depth == 0) return;
this.field2.field3.field1.method2(depth-1);
}
}
public class Test73{
public static void main(String[] args) {
int inputValue = 10;
Benchmark.alloc(1);
Test73Lib.local1 = new Test73Class1();
Benchmark.alloc(2);
Test73Lib.local2 = new Test73Class1();
Benchmark.alloc(3);
Test73Lib.local3 = new Test73Class2();
Benchmark.alloc(4);
Test73Lib.local4 = new Test73Class2();
Test73Lib.local1.field1 = Test73Lib.local3;
Test73Lib.local1.field2 = Test73Lib.local4;
Test73Lib.local1.field3 = Test73Lib.local4;
Test73Lib.local1.field4 = Test73Lib.local3;
Test73Lib.local2.field1 = Test73Lib.local4;
Test73Lib.local2.field2 = Test73Lib.local1;
Test73Lib.local2.field3 = Test73Lib.local3;
Test73Lib.local2.field4 = Test73Lib.local4;
Test73Lib.local3.field5 = Test73Lib.local3;
Test73Lib.local3.field6 = Test73Lib.local3;
Test73Lib.local3.field7 = Test73Lib.local4;
Test73Lib.local3.field1 = Test73Lib.local3;
Test73Lib.local3.field2 = Test73Lib.local2;
Test73Lib.local3.field3 = Test73Lib.local3;
Test73Lib.local3.field4 = Test73Lib.local3;
Test73Lib.local4.field5 = Test73Lib.local3;
Test73Lib.local4.field6 = Test73Lib.local3;
Test73Lib.local4.field7 = Test73Lib.local3;
Test73Lib.local4.field1 = Test73Lib.local3;
Test73Lib.local4.field2 = Test73Lib.local3;
Test73Lib.local4.field3 = Test73Lib.local3;
Test73Lib.local4.field4 = Test73Lib.local4;
if (inputValue<=3) {
for (int local5 = 0; local5<=3; local5 += 1) {
Test73Lib.local1.field1.field6.method2(3);
}
}
Test73Lib.local1.field2.field4.field6.method1(3);
Test73Lib.local1.field1.field4.field5.method1(3);
Test73Lib.local2.field4.field5.field1=Test73Lib.local4.field4.field1.field6;
if (inputValue>=1) {
if (inputValue<2) {
if (inputValue>4) {
for (int local6 = 0; local6<=2; local6 += 1) {
Test73Lib.local2.field3.field1.field4.method2(3);
}
}
}
}
Test73Lib.local3.field1.field6.field5=Test73Lib.local4.field2.field1.field6;
for (int local7 = 0; local7<=2; local7 += 1) {
Test73Lib.local4.field4.field5.field4.method1(3);
}
Test73Lib.local3.field5.field4.field1=Test73Lib.local1.field3.field1.field1;
Test73Lib.local4.field1.field3.field4=Test73Lib.local4.field7.field1.field1;
for (int local8 = 0; local8<=3; local8 += 1) {
for (int local9 = 0; local9<=1; local9 += 1) {
Test73Lib.local4.field6.field6.field7=Test73Lib.local4.field5.field3.field4;
}
}
Benchmark.test(1,Test73Lib.local1);
Benchmark.test(2,Test73Lib.local2);
Benchmark.test(3,Test73Lib.local3);
Benchmark.test(4,Test73Lib.local4);
Benchmark.test(5,Test73Lib.local1.field1);
Benchmark.test(6,Test73Lib.local1.field2);
Benchmark.test(7,Test73Lib.local1.field3);
Benchmark.test(8,Test73Lib.local1.field4);
Benchmark.test(9,Test73Lib.local2.field1);
Benchmark.test(10,Test73Lib.local2.field2);
Benchmark.test(11,Test73Lib.local2.field3);
Benchmark.test(12,Test73Lib.local2.field4);
Benchmark.test(13,Test73Lib.local3.field5);
Benchmark.test(14,Test73Lib.local3.field6);
Benchmark.test(15,Test73Lib.local3.field7);
Benchmark.test(16,Test73Lib.local3.field1);
Benchmark.test(17,Test73Lib.local3.field2);
Benchmark.test(18,Test73Lib.local3.field3);
Benchmark.test(19,Test73Lib.local3.field4);
Benchmark.test(20,Test73Lib.local4.field5);
Benchmark.test(21,Test73Lib.local4.field6);
Benchmark.test(22,Test73Lib.local4.field7);
Benchmark.test(23,Test73Lib.local4.field1);
Benchmark.test(24,Test73Lib.local4.field2);
Benchmark.test(25,Test73Lib.local4.field3);
Benchmark.test(26,Test73Lib.local4.field4);
Benchmark.print();
}
}
