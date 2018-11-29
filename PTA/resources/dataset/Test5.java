package dataset;

import benchmark.internal.Benchmark;
import benchmark.tool.BasicClass;
class Test5Lib{
public static Test5Class1 local1;
public static Test5Class1 local2;
public static Test5Class2 local3;
public static Test5Class2 local4;
}
class Test5Class1 extends BasicClass {
public Test5Class2 field1;
public static Test5Class2 field2;
public static Test5Class2 method1(Test5Class2 arg0, int depth) {
if (depth == 0) return Test5Lib.local4;
return field2.field1;
}
}
class Test5Class2 extends Test5Class1 {
public static Test5Class1 field3;
public Test5Class1 field4;
public static void method2(Test5Class1 arg0, Test5Class1 arg1, int depth) {
if (depth == 0) return;
}
}
public class Test5{
public static void main(String[] args) {
int inputValue = 0;
Benchmark.alloc(1);
Test5Lib.local1 = new Test5Class1();
Benchmark.alloc(2);
Test5Lib.local2 = new Test5Class1();
Benchmark.alloc(3);
Test5Lib.local3 = new Test5Class2();
Benchmark.alloc(4);
Test5Lib.local4 = new Test5Class2();
Test5Lib.local1.field1 = Test5Lib.local3;
Test5Lib.local1.field2 = Test5Lib.local4;
Test5Lib.local2.field1 = Test5Lib.local4;
Test5Lib.local2.field2 = Test5Lib.local4;
Test5Lib.local3.field3 = Test5Lib.local1;
Test5Lib.local3.field4 = Test5Lib.local2;
Test5Lib.local3.field1 = Test5Lib.local3;
Test5Lib.local3.field2 = Test5Lib.local3;
Test5Lib.local4.field3 = Test5Lib.local1;
Test5Lib.local4.field4 = Test5Lib.local4;
Test5Lib.local4.field1 = Test5Lib.local3;
Test5Lib.local4.field2 = Test5Lib.local4;
Test5Lib.local2.field2=Test5Lib.local4.field2;
Test5Lib.local2.field1=Test5Lib.local1.field2;
Test5Lib.local3.method1(Test5Lib.local2.field2,3);
Benchmark.test(1,Test5Lib.local1);
Benchmark.test(2,Test5Lib.local2);
Benchmark.test(3,Test5Lib.local3);
Benchmark.test(4,Test5Lib.local4);
Benchmark.test(5,Test5Lib.local1.field1);
Benchmark.test(6,Test5Lib.local1.field2);
Benchmark.test(7,Test5Lib.local2.field1);
Benchmark.test(8,Test5Lib.local2.field2);
Benchmark.test(9,Test5Lib.local3.field3);
Benchmark.test(10,Test5Lib.local3.field4);
Benchmark.test(11,Test5Lib.local3.field1);
Benchmark.test(12,Test5Lib.local3.field2);
Benchmark.test(13,Test5Lib.local4.field3);
Benchmark.test(14,Test5Lib.local4.field4);
Benchmark.test(15,Test5Lib.local4.field1);
Benchmark.test(16,Test5Lib.local4.field2);
Benchmark.print();
}
}
