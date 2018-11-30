package runnabledataset;

import benchmark.tool.Benchmark;
import benchmark.tool.BasicClass;
class Test9Lib{
public static Test9Class1 local1;
public static Test9Class1 local2;
public static Test9Class2 local3;
public static Test9Class2 local4;
}
class Test9Class1 extends BasicClass {
public Test9Class1 field1;
public Test9Class1 field2;
public Test9Class2 method1(Test9Class2 arg0, int depth) {
if (depth == 0) return Test9Lib.local4;
return arg0;
}
}
class Test9Class2 extends Test9Class1 {
public Test9Class1 field3;
public Test9Class2 field4;
public static void method2(Test9Class1 arg0, int depth) {
if (depth == 0) return;
}
}
public class Test9{
public static void main(String[] args) {
int inputValue = 10;
Benchmark.alloc(1);
Test9Lib.local1 = new Test9Class1();
Benchmark.alloc(2);
Test9Lib.local2 = new Test9Class1();
Benchmark.alloc(3);
Test9Lib.local3 = new Test9Class2();
Benchmark.alloc(4);
Test9Lib.local4 = new Test9Class2();
Test9Lib.local1.field1 = Test9Lib.local1;
Test9Lib.local1.field2 = Test9Lib.local4;
Test9Lib.local2.field1 = Test9Lib.local4;
Test9Lib.local2.field2 = Test9Lib.local2;
Test9Lib.local3.field3 = Test9Lib.local3;
Test9Lib.local3.field4 = Test9Lib.local3;
Test9Lib.local3.field1 = Test9Lib.local3;
Test9Lib.local3.field2 = Test9Lib.local4;
Test9Lib.local4.field3 = Test9Lib.local3;
Test9Lib.local4.field4 = Test9Lib.local3;
Test9Lib.local4.field1 = Test9Lib.local3;
Test9Lib.local4.field2 = Test9Lib.local1;
Test9Lib.local3=Test9Lib.local4;
if (inputValue<1) {
for (int local5 = 0; local5<=2; local5 += 1) {
Test9Lib.local2.field2=Test9Lib.local3.field2;
}
}else {
Test9Lib.local3.field4=Test9Lib.local4;
}
for (int local6 = 0; local6<=1; local6 += 1) {
Test9Lib.local3.field4=Test9Lib.local3.method1(Test9Lib.local3,3);
}
Test9Lib.local4=Test9Lib.local3.field4;
Test9Lib.local3.field4.method2(Test9Lib.local3,3);
Test9Lib.local2.field1=Test9Lib.local4.field2;
for (int local7 = 0; local7<=0; local7 += 1) {
Test9Lib.local3.method2(Test9Lib.local4.field3,3);
}
for (int local8 = 0; local8<=2; local8 += 1) {
for (int local9 = 0; local9<=3; local9 += 1) {
Test9Lib.local3=Test9Lib.local4.field3.method1(Test9Lib.local4.field4,3);
}
}
Test9Lib.local4=Test9Lib.local4.field1.method1(Test9Lib.local4.field4,3);
Test9Lib.local3=Test9Lib.local3.field4;
Benchmark.test(1,Test9Lib.local1);
Benchmark.test(2,Test9Lib.local2);
Benchmark.test(3,Test9Lib.local3);
Benchmark.test(4,Test9Lib.local4);
Benchmark.test(5,Test9Lib.local1.field1);
Benchmark.test(6,Test9Lib.local1.field2);
Benchmark.test(7,Test9Lib.local2.field1);
Benchmark.test(8,Test9Lib.local2.field2);
Benchmark.test(9,Test9Lib.local3.field3);
Benchmark.test(10,Test9Lib.local3.field4);
Benchmark.test(11,Test9Lib.local3.field1);
Benchmark.test(12,Test9Lib.local3.field2);
Benchmark.test(13,Test9Lib.local4.field3);
Benchmark.test(14,Test9Lib.local4.field4);
Benchmark.test(15,Test9Lib.local4.field1);
Benchmark.test(16,Test9Lib.local4.field2);
Benchmark.print();
}
}
