package test;

import benchmark.internal.Benchmark;

class HelloArray {
    public static void main(String[] args) {
        Benchmark.alloc(1);
        args[0] = new String();
        Benchmark.alloc(2);
        args[1] = new String();
        Benchmark.test(1, args[0]);
        Benchmark.test(2, args[1]);
    }
}

/*
1: 1
2: 2
 */