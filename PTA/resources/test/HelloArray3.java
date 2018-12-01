package test;

import benchmark.internal.Benchmark;
import benchmark.objects.B;

class HelloArray3 {
    static void test(B[] c) {
        Benchmark.alloc(1);
        c[0] = new B();
        c[1] = new B();
    }

    public static void main(String[] args) {
        B b[] = new B[2];
        Benchmark.test(1, b[0]);
        Benchmark.test(2, b[1]);
    }
}

/*
1: 0 1
2: 0 1
 */
