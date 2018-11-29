package test;
import benchmark.internal.Benchmark;

class AllocInRec {
    AllocInRec alloc(AllocInRec a, AllocInRec b) {
        Benchmark.alloc(4);
        AllocInRec nxt = new AllocInRec();
        if (a == b) {
            a = nxt;
            return alloc(a, b);
        }
        return a;
    }
    public static void main(String[] main) {
        Benchmark.alloc(1);
        AllocInRec a = new AllocInRec();
        Benchmark.alloc(2);
        AllocInRec b = new AllocInRec();
        Benchmark.alloc(3);
        AllocInRec c = new AllocInRec();
        AllocInRec d = a.alloc(b, c);
        AllocInRec e = a.alloc(b, b);
        Benchmark.test(1, d); // 2, 4
        Benchmark.test(2, e); // 2, 4
    }
}