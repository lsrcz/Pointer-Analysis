package dataset;

import benchmark.internal.Benchmark;

class Test50A {
    public Test50A x;
    public Test50A get() {
        return this;
    }
}

public class Test50 {
    public static void main(String[] args) {
        Benchmark.alloc(1);
        Test50A x = new Test50A();
        Test50A y = new Test50A();
        y.x = x.get();
        Benchmark.test(1, x.x);
    }
}
