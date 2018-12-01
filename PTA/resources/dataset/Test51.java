package dataset;

import benchmark.internal.Benchmark;

class Test51A {

}

public class Test51 {
    public static void main(String[] args) {
        Benchmark.alloc(1);
        Test51A x[] = new Test51A[100];
        Benchmark.test(1, x);
        Benchmark.test(2, x[1]);
    }
}
