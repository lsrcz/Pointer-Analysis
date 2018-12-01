package dataset;

import benchmark.internal.Benchmark;

public class Test58 {
    Test58[] passArray(Test58[] t) {
        return t;
    }
    void setArray(Test58[] t, int i, Test58 n) {
        t[i] = n;
    }
    Test58 getArray(Test58[] t, int i) {
        return t[i];
    }

    public static void main(String[] args) {
        Benchmark.alloc(3);
        Test58[] tarray = new Test58[10];
        Test58 t1, t2;
        Benchmark.alloc(1);
        t1 = new Test58();
        Benchmark.alloc(2);
        t2 = new Test58();

        t2.setArray(t1.passArray(tarray), 0, t2);

        Benchmark.test(1, tarray);
        Benchmark.test(2, tarray[0]);

        Benchmark.alloc(4);
        Test58[] tarray2 = new Test58[10];
        t1.setArray(t2.passArray(tarray2), 0, t1.getArray(tarray, 0));
        Benchmark.test(3, tarray2[0]);
    }

}