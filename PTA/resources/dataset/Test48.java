package dataset;
import benchmark.internal.Benchmark;

class Test48 {
    Test48 alloc(Test48 a, Test48 b) {
        Benchmark.alloc(4);
        Test48 nxt = new Test48();
        if (a == b) {
            a = nxt;
            return alloc(a, b);
        }
        return a;
    }
    public static void main(String[] main) {
        Benchmark.alloc(1);
        Test48 a = new Test48();
        Benchmark.alloc(2);
        Test48 b = new Test48();
        Benchmark.alloc(3);
        Test48 c = new Test48();
        Test48 d = a.alloc(b, c);
        Test48 e = a.alloc(b, b);
        Benchmark.test(1, d); // 2, 4
        Benchmark.test(2, e); // 2, 4
    }
}