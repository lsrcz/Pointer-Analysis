package dataset;

import benchmark.tool.Benchmark;

class Test55A {

}

public class Test55 {
    public static void main(String[] args) {
        Benchmark.alloc(1);
        Test55A[] a = new Test55A[10];
        Test55A[] b = a;

        Benchmark.test(1, b);
        Benchmark.test(2, b[0]);
    }
}