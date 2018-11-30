package dataset;

import benchmark.internal.Benchmark;
import benchmark.tool.BasicClass;
class Test11Lib{
public static Test11Class1 local1;
public static Test11Class1 local2;
public static Test11Class2 local3;
public static Test11Class2 local4;
}
class Test11Class1 extends BasicClass {
public Test11Class1 field1;
public static void method1(int depth) {
if (depth == 0) return;
}
}
class Test11Class2 extends Test11Class1 {
public static Test11Class1 field2;
public static Test11Class1 field3;
public static Test11Class1 method2(Test11Class2 arg0, int depth) {
if (depth == 0) return Test11Lib.local1;
return arg0;
}
}
public class Test11{
public static void main(String[] args) {
int inputValue = 0;
Benchmark.alloc(1);
Test11Lib.local1 = new Test11Class1();
Benchmark.alloc(2);
Test11Lib.local2 = new Test11Class1();
Benchmark.alloc(3);
Test11Lib.local3 = new Test11Class2();
Benchmark.alloc(4);
Test11Lib.local4 = new Test11Class2();
Test11Lib.local1.field1 = Test11Lib.local3;
Test11Lib.local2.field1 = Test11Lib.local4;
Test11Lib.local3.field2 = Test11Lib.local3;
Test11Lib.local3.field3 = Test11Lib.local3;
Test11Lib.local3.field1 = Test11Lib.local3;
Test11Lib.local4.field2 = Test11Lib.local1;
Test11Lib.local4.field3 = Test11Lib.local4;
Test11Lib.local4.field1 = Test11Lib.local4;
Test11Lib.local4.field3=Test11Lib.local4.field3;
Test11Lib.local3.method1(3);
Test11Lib.local1.field1=Test11Lib.local3;
Benchmark.test(1,Test11Lib.local1);
Benchmark.test(2,Test11Lib.local2);
Benchmark.test(3,Test11Lib.local3);
Benchmark.test(4,Test11Lib.local4);
Benchmark.test(5,Test11Lib.local1.field1);
Benchmark.test(6,Test11Lib.local2.field1);
Benchmark.test(7,Test11Lib.local3.field2);
Benchmark.test(8,Test11Lib.local3.field3);
Benchmark.test(9,Test11Lib.local3.field1);
Benchmark.test(10,Test11Lib.local4.field2);
Benchmark.test(11,Test11Lib.local4.field3);
Benchmark.test(12,Test11Lib.local4.field1);
Benchmark.print();
}
}
