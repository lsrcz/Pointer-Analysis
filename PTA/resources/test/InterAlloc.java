package test;

import benchmark.internal.Benchmark;

class InterAlloc {
    public static void test() {
        Benchmark.alloc(1);
    }

    public static void test2(InterAlloc x) {
        Benchmark.test(1, x);
    }

    public static void main(String[] args) {
        test();
        InterAlloc x = new InterAlloc();
        test2(x);
    }
}

/*
1: 1
 */