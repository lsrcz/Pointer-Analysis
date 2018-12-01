package dataset;

import benchmark.internal.Benchmark;

public class Test51 {
    public static void main(String[] args) {
        Benchmark.alloc(1);
        Integer x[] = new Integer[100];
        Benchmark.test(1, x);
        Benchmark.test(2, x[1]);
    }
}
