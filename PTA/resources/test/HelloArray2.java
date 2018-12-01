package test;

import benchmark.internal.Benchmark;

class HelloArray2 {
    public static void main(String[] args) {
        String p[] = new String[2];
        Benchmark.alloc(1);
        p[0] = new String();
        Benchmark.alloc(2);
        p[1] = new String();
        Benchmark.test(1, args[0]);
        Benchmark.test(2, args[1]);
    }
}

/*
1: 1
2: 2
 */
