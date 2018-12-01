package dataset;

import benchmark.internal.Benchmark;

class Test59Exc extends Exception {

}

class Test59A {

}

public class Test59 {
    static Test59A t() throws Test59Exc {
        Benchmark.alloc(5);
        Test59A a = new Test59A();
        Test59A b = new Test59A();
        if (a == b)
            throw new Test59Exc();
        return a;
    }

    public static void main(String[] args) {
        Benchmark.alloc(6);
        Test59A a = new Test59A();
        Benchmark.alloc(7);
        Test59A b = new Test59A();
        Benchmark.alloc(8);
        Test59A c = new Test59A();
        Benchmark.alloc(9);
        Test59A d = new Test59A();
        try {
            a = t();
        } catch (Test59Exc e) {
            if (a != c)
                a = c;
        } finally {
            if (a != b)
                a = b;
            d = b;
        }

        Benchmark.test(1, d);
        Benchmark.test(2, a);
    }
}