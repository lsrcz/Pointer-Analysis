package runnabledataset;

import benchmark.tool.Benchmark;
import benchmark.tool.BasicClass;
class Test4Lib{
public static Test4Class1 local1;
public static Test4Class2 local2;
public static Test4Class2 local3;
}
class Test4Class1 extends BasicClass {
public static Test4Class1 field1;
public Test4Class2 field2;
public static Test4Class2 method1(Test4Class2 arg0, Test4Class2 arg1, int depth) {
if (depth == 0) return Test4Lib.local2;
return arg0.field2;
}
}
class Test4Class2 extends Test4Class1 {
public static Test4Class2 field3;
public Test4Class2 method2(Test4Class1 arg0, int depth) {
if (depth == 0) return Test4Lib.local3;
return this.field2;
}
}
public class Test4{
public static void main(String[] args) {
int inputValue = 10;
Benchmark.alloc(1);
Test4Lib.local1 = new Test4Class1();
Benchmark.alloc(2);
Test4Lib.local2 = new Test4Class2();
Benchmark.alloc(3);
Test4Lib.local3 = new Test4Class2();
Test4Lib.local1.field1 = Test4Lib.local2;
Test4Lib.local1.field2 = Test4Lib.local3;
Test4Lib.local2.field3 = Test4Lib.local2;
Test4Lib.local2.field1 = Test4Lib.local2;
Test4Lib.local2.field2 = Test4Lib.local2;
Test4Lib.local3.field3 = Test4Lib.local3;
Test4Lib.local3.field1 = Test4Lib.local2;
Test4Lib.local3.field2 = Test4Lib.local2;
Test4Lib.local3.field2=Test4Lib.local1.field2.method2(Test4Lib.local2,3);
Test4Lib.local3.field3.method2(Test4Lib.local2.field1,3);
Test4Lib.local1=Test4Lib.local2.method2(Test4Lib.local1,3);
Benchmark.test(1,Test4Lib.local1);
Benchmark.test(2,Test4Lib.local2);
Benchmark.test(3,Test4Lib.local3);
Benchmark.test(4,Test4Lib.local1.field1);
Benchmark.test(5,Test4Lib.local1.field2);
Benchmark.test(6,Test4Lib.local2.field3);
Benchmark.test(7,Test4Lib.local2.field1);
Benchmark.test(8,Test4Lib.local2.field2);
Benchmark.test(9,Test4Lib.local3.field3);
Benchmark.test(10,Test4Lib.local3.field1);
Benchmark.test(11,Test4Lib.local3.field2);
Benchmark.print();
}
}
