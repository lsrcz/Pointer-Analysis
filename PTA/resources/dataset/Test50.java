package dataset;

import benchmark.internal.Benchmark;

class Test50A {
    static public Test50A get(Test50A x) {
        return x;
    }
}

public class Test50 {
    public static void main(String[] args) {
        Benchmark.alloc(1);
        Test50A x = new Test50A();
        Benchmark.alloc(2);
        Test50A y = new Test50A();
        x = Test50A.get(x);
        y = Test50A.get(y);
        Benchmark.test(1, y);
    }
}
