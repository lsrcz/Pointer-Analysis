package test;

import benchmark.internal.Benchmark;

class A {
    static A next;
};

public class StaticInterNew {
    public static void test() {
        Benchmark.alloc(2);
        A.next = new A();
    }

    public static void main(String[] args) {
        Benchmark.alloc(1);
        A x = new A();
        test();
        Benchmark.alloc(3);
        if (args.length == 1) {
            x.next = new A();
        }
        Benchmark.test(1, x.next);
        Benchmark.test(2, A.next);
    }
}

/*
1: 2 3
2: 2 3
 */