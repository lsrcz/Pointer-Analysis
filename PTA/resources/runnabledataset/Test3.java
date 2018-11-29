package runnabledataset;

import benchmark.tool.Benchmark;
import benchmark.tool.BasicClass;
class Test3Lib{
    public static Test3Class1 local1;
    public static Test3Class1 local2;
    public static Test3Class1 local3;
    public static Test3Class2 local4;
}
class Test3Class1 extends BasicClass {
    public static Test3Class1 field1;
    public static void method2(Test3Class2 arg0, Test3Class1 arg1, int depth) {
        if (depth == 0) return;
    }
}
class Test3Class2 extends Test3Class1 {
    public Test3Class2 field2;
    public static Test3Class2 field3;
    public static Test3Class2 field4;
    public static Test3Class1 field5;
    public Test3Class1 field6;
}
public class Test3{
    public static void main(String[] args) {
        int inputValue = 10;
        Benchmark.alloc(1);
        Test3Lib.local1 = new Test3Class1();
        Benchmark.alloc(2);
        Test3Lib.local2 = new Test3Class1();
        Benchmark.alloc(3);
        Test3Lib.local3 = new Test3Class1();
        Benchmark.alloc(4);
        Test3Lib.local4 = new Test3Class2();
        Test3Lib.local1.field1 = Test3Lib.local2;
        Test3Lib.local2.field1 = Test3Lib.local3;
        Test3Lib.local3.field1 = Test3Lib.local2;
        Test3Lib.local4.field2 = Test3Lib.local4;
        Test3Lib.local4.field3 = Test3Lib.local4;
        Test3Lib.local4.field4 = Test3Lib.local4;
        Test3Lib.local4.field5 = Test3Lib.local3;
        Test3Lib.local4.field6 = Test3Lib.local4;
        Test3Lib.local4.field1 = Test3Lib.local1;
        Test3Lib.local4.field3.method2(Test3Lib.local4.field2,Test3Lib.local4.field4,3);
        Benchmark.test(1,Test3Lib.local1);
        Benchmark.test(2,Test3Lib.local2);
        Benchmark.test(3,Test3Lib.local3);
        Benchmark.test(4,Test3Lib.local4);
        Benchmark.test(5,Test3Lib.local1.field1);
        Benchmark.test(6,Test3Lib.local2.field1);
        Benchmark.test(7,Test3Lib.local3.field1);
        Benchmark.test(8,Test3Lib.local4.field2);
        Benchmark.test(9,Test3Lib.local4.field3);
        Benchmark.test(10,Test3Lib.local4.field4);
        Benchmark.test(11,Test3Lib.local4.field5);
        Benchmark.test(12,Test3Lib.local4.field6);
        Benchmark.test(13,Test3Lib.local4.field1);
        Benchmark.print();
    }
}
