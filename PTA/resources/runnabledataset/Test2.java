package runnabledataset;

import benchmark.tool.Benchmark;
import benchmark.tool.BasicClass;
class Test2Lib{
    public static Test2Class1 local1;
    public static Test2Class1 local2;
    public static Test2Class2 local3;
    public static Test2Class2 local4;
}
class Test2Class1 extends BasicClass {
    public Test2Class2 field1;
    public void method1(Test2Class2 arg0, Test2Class2 arg1, int depth) {
        if (depth == 0) return;
    }
}
class Test2Class2 extends Test2Class1 {
    public static Test2Class2 field2;
    public void method2(int depth) {
        if (depth == 0) return;
    }
}
public class Test2{
    public static void main(String[] args) {
        int inputValue = 10;
        Benchmark.alloc(1);
        Test2Lib.local1 = new Test2Class1();
        Benchmark.alloc(2);
        Test2Lib.local2 = new Test2Class1();
        Benchmark.alloc(3);
        Test2Lib.local3 = new Test2Class2();
        Benchmark.alloc(4);
        Test2Lib.local4 = new Test2Class2();
        Test2Lib.local1.field1 = Test2Lib.local4;
        Test2Lib.local2.field1 = Test2Lib.local4;
        Test2Lib.local3.field2 = Test2Lib.local3;
        Test2Lib.local3.field1 = Test2Lib.local4;
        Test2Lib.local4.field2 = Test2Lib.local4;
        Test2Lib.local4.field1 = Test2Lib.local3;
        Test2Lib.local3=Test2Lib.local4.field1;
        Test2Lib.local2=Test2Lib.local4;
        Test2Lib.local4.field1.method1(Test2Lib.local2.field1,Test2Lib.local3,3);
        Benchmark.test(1,Test2Lib.local1);
        Benchmark.test(2,Test2Lib.local2);
        Benchmark.test(3,Test2Lib.local3);
        Benchmark.test(4,Test2Lib.local4);
        Benchmark.test(5,Test2Lib.local1.field1);
        Benchmark.test(6,Test2Lib.local2.field1);
        Benchmark.test(7,Test2Lib.local3.field2);
        Benchmark.test(8,Test2Lib.local3.field1);
        Benchmark.test(9,Test2Lib.local4.field2);
        Benchmark.test(10,Test2Lib.local4.field1);
        Benchmark.print();
    }
}
