package dataset;

import benchmark.internal.Benchmark;
import benchmark.tool.BasicClass;
class Test14Lib{
public static Test14Class1 local1;
public static Test14Class2 local2;
public static Test14Class2 local3;
}
class Test14Class1 extends BasicClass {
public static Test14Class2 field1;
public static void method1(Test14Class1 arg0, int depth) {
if (depth == 0) return;
}
}
class Test14Class2 extends Test14Class1 {
public static Test14Class2 field2;
public static Test14Class1 field3;
public Test14Class1 method2(int depth) {
if (depth == 0) return Test14Lib.local3;
return this.field3;
}
}
public class Test14{
public static void main(String[] args) {
int inputValue = 0;
Benchmark.alloc(1);
Test14Lib.local1 = new Test14Class1();
Benchmark.alloc(2);
Test14Lib.local2 = new Test14Class2();
Benchmark.alloc(3);
Test14Lib.local3 = new Test14Class2();
Test14Lib.local1.field1 = Test14Lib.local3;
Test14Lib.local2.field2 = Test14Lib.local2;
Test14Lib.local2.field3 = Test14Lib.local2;
Test14Lib.local2.field1 = Test14Lib.local3;
Test14Lib.local3.field2 = Test14Lib.local2;
Test14Lib.local3.field3 = Test14Lib.local3;
Test14Lib.local3.field1 = Test14Lib.local3;
for (int local4 = 0; local4<=3; local4 += 1) {
if (inputValue==2) {
Test14Lib.local2=Test14Lib.local3.field2;
}else {
if (inputValue>=2) {
if (inputValue<=4) {
Test14Lib.local1.field1=Test14Lib.local2;
}
}else {
Test14Lib.local2.field3=Test14Lib.local3;
}
}
}
Test14Lib.local2.field3=Test14Lib.local1.field1;
if (inputValue>=1) {
for (int local5 = 0; local5<=0; local5 += 1) {
Test14Lib.local3.field3=Test14Lib.local2.field1;
}
}else {
Test14Lib.local3.field3=Test14Lib.local3.method2(3);
}
Benchmark.test(1,Test14Lib.local1);
Benchmark.test(2,Test14Lib.local2);
Benchmark.test(3,Test14Lib.local3);
Benchmark.test(4,Test14Lib.local1.field1);
Benchmark.test(5,Test14Lib.local2.field2);
Benchmark.test(6,Test14Lib.local2.field3);
Benchmark.test(7,Test14Lib.local2.field1);
Benchmark.test(8,Test14Lib.local3.field2);
Benchmark.test(9,Test14Lib.local3.field3);
Benchmark.test(10,Test14Lib.local3.field1);
Benchmark.print();
}
}
