package runnabledataset;

import benchmark.tool.Benchmark;
import benchmark.tool.BasicClass;
class Test7Lib{
public static Test7Class1 local1;
public static Test7Class1 local2;
public static Test7Class2 local3;
public static Test7Class2 local4;
}
class Test7Class1 extends BasicClass {
public Test7Class1 field1;
public Test7Class2 method1(Test7Class1 arg0, Test7Class1 arg1, int depth) {
if (depth == 0) return Test7Lib.local4;
return Test7Lib.local4;
}
}
class Test7Class2 extends Test7Class1 {
public static Test7Class1 field2;
public void method2(Test7Class1 arg0, Test7Class2 arg1, int depth) {
if (depth == 0) return;
}
}
public class Test7{
public static void main(String[] args) {
int inputValue = 10;
Benchmark.alloc(1);
Test7Lib.local1 = new Test7Class1();
Benchmark.alloc(2);
Test7Lib.local2 = new Test7Class1();
Benchmark.alloc(3);
Test7Lib.local3 = new Test7Class2();
Benchmark.alloc(4);
Test7Lib.local4 = new Test7Class2();
Test7Lib.local1.field1 = Test7Lib.local2;
Test7Lib.local2.field1 = Test7Lib.local4;
Test7Lib.local3.field2 = Test7Lib.local4;
Test7Lib.local3.field1 = Test7Lib.local4;
Test7Lib.local4.field2 = Test7Lib.local1;
Test7Lib.local4.field1 = Test7Lib.local3;
Test7Lib.local4.method2(Test7Lib.local3,Test7Lib.local3,3);
if (inputValue==1) {
Test7Lib.local3=Test7Lib.local3;
}else {
Test7Lib.local3.field2=Test7Lib.local4.field2;
}
for (int local5 = 0; local5<=2; local5 += 1) {
if (inputValue<4) {
Test7Lib.local4.method2(Test7Lib.local3,Test7Lib.local3,3);
}else {
for (int local6 = 0; local6<=2; local6 += 1) {
for (int local7 = 0; local7<=3; local7 += 1) {
for (int local8 = 0; local8<=0; local8 += 1) {
}
}
}
}
}
Benchmark.test(1,Test7Lib.local1);
Benchmark.test(2,Test7Lib.local2);
Benchmark.test(3,Test7Lib.local3);
Benchmark.test(4,Test7Lib.local4);
Benchmark.test(5,Test7Lib.local1.field1);
Benchmark.test(6,Test7Lib.local2.field1);
Benchmark.test(7,Test7Lib.local3.field2);
Benchmark.test(8,Test7Lib.local3.field1);
Benchmark.test(9,Test7Lib.local4.field2);
Benchmark.test(10,Test7Lib.local4.field1);
Benchmark.print();
}
}
