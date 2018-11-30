package dataset;

import benchmark.internal.Benchmark;
import benchmark.tool.BasicClass;
class Test9Lib{
public static Test9Class1 local1;
public static Test9Class1 local2;
public static Test9Class2 local3;
}
class Test9Class1 extends BasicClass {
public Test9Class2 field1;
public static void method1(int depth) {
//if (depth == 0) return;
}
}
class Test9Class2 extends Test9Class1 {
public static Test9Class1 field2;
public static Test9Class1 field3;
public static void method2(Test9Class1 arg0, Test9Class1 arg1, int depth) {
//if (depth == 0) return;
}
}
public class Test60{
public static void main(String[] args) {
int inputValue = 0;
//Benchmark.alloc(1);
//Test9Lib.local1 = new Test9Class1();
Benchmark.alloc(2);
Test9Lib.local2 = new Test9Class1();
Benchmark.alloc(3);
Test9Lib.local3 = new Test9Class2();
//Test9Lib.local1.field1 = Test9Lib.local3;
//Test9Lib.local2.field1 = Test9Lib.local3;
//Test9Lib.local3.field2 = Test9Lib.local1;
//Test9Lib.local3.field3 = Test9Lib.local2;
//Test9Lib.local3.field1 = Test9Lib.local3;
Test9Lib.local3.field2=Test9Lib.local3;
//Test9Lib.local3.field1.method1(3);
if (inputValue<=4) {
Test9Lib.local2=Test9Lib.local3.field2;
//Test9Lib.local1.field1.method2(Test9Lib.local2.field1,Test9Lib.local3.field1,3);
}//else {
//Test9Lib.local2=Test9Lib.local3.field2;
//}
//Benchmark.test(1,Test9Lib.local1);
Benchmark.test(2,Test9Lib.local2);
//Benchmark.test(3,Test9Lib.local3);
//Benchmark.test(4,Test9Lib.local1.field1);
//Benchmark.test(5,Test9Lib.local2.field1);
//Benchmark.test(6,Test9Lib.local3.field2);
//Benchmark.test(7,Test9Lib.local3.field3);
//Benchmark.test(8,Test9Lib.local3.field1);
Benchmark.print();
}
}
