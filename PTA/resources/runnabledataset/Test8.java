package runnabledataset;

import benchmark.tool.Benchmark;
import benchmark.tool.BasicClass;
class Test8Lib{
public static Test8Class1 local1;
public static Test8Class1 local2;
public static Test8Class2 local3;
public static Test8Class2 local4;
}
class Test8Class1 extends BasicClass {
public static Test8Class1 field1;
public static void method1(Test8Class1 arg0, Test8Class2 arg1, int depth) {
if (depth == 0) return;
}
}
class Test8Class2 extends Test8Class1 {
public static Test8Class1 field2;
public Test8Class1 field3;
public Test8Class1 method2(Test8Class2 arg0, Test8Class2 arg1, int depth) {
if (depth == 0) return Test8Lib.local3;
return arg0;
}
}
public class Test8{
public static void main(String[] args) {
int inputValue = 10;
Benchmark.alloc(1);
Test8Lib.local1 = new Test8Class1();
Benchmark.alloc(2);
Test8Lib.local2 = new Test8Class1();
Benchmark.alloc(3);
Test8Lib.local3 = new Test8Class2();
Benchmark.alloc(4);
Test8Lib.local4 = new Test8Class2();
Test8Lib.local1.field1 = Test8Lib.local1;
Test8Lib.local2.field1 = Test8Lib.local4;
Test8Lib.local3.field2 = Test8Lib.local3;
Test8Lib.local3.field3 = Test8Lib.local2;
Test8Lib.local3.field1 = Test8Lib.local2;
Test8Lib.local4.field2 = Test8Lib.local1;
Test8Lib.local4.field3 = Test8Lib.local4;
Test8Lib.local4.field1 = Test8Lib.local2;
if (inputValue>=3) {
Test8Lib.local4.method2(Test8Lib.local3,Test8Lib.local4,3);
}else {
Test8Lib.local4.method2(Test8Lib.local3,Test8Lib.local4,3);
}
if (inputValue==4) {
Test8Lib.local2=Test8Lib.local4.method2(Test8Lib.local4,Test8Lib.local3,3);
}
if (inputValue>=4) {
Test8Lib.local4.method2(Test8Lib.local3,Test8Lib.local4,3);
}
Benchmark.test(1,Test8Lib.local1);
Benchmark.test(2,Test8Lib.local2);
Benchmark.test(3,Test8Lib.local3);
Benchmark.test(4,Test8Lib.local4);
Benchmark.test(5,Test8Lib.local1.field1);
Benchmark.test(6,Test8Lib.local2.field1);
Benchmark.test(7,Test8Lib.local3.field2);
Benchmark.test(8,Test8Lib.local3.field3);
Benchmark.test(9,Test8Lib.local3.field1);
Benchmark.test(10,Test8Lib.local4.field2);
Benchmark.test(11,Test8Lib.local4.field3);
Benchmark.test(12,Test8Lib.local4.field1);
Benchmark.print();
}
}
