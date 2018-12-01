package dataset;

import benchmark.internal.Benchmark;

class Test50A {
    public static Test50A x;
    public static Test50B y;
}

class Test50B {
    public Test50A y;
}

public class Test50 {
    public static void main(String[] args) {
        Benchmark.alloc(1);
        Test50A.x = new Test50A();
        Benchmark.alloc(2);
        Test50A.y = new Test50B();
        Test50A.y.y = Test50A.x;
        Benchmark.test(1, Test50A.y.y);
    }
}
