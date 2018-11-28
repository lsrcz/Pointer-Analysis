package test;
import benchmark.internal.Benchmark;

class AllocInRec {
    AllocInRec alloc(AllocInRec a, AllocInRec b) {
        AllocInRec nxt = new AllocInRec();
        if (a == b) {
            a = nxt;
            return alloc(a, b);
        }
        return a;
    }
    public static void main(String[] main) {
        AllocInRec a = new AllocInRec();
        AllocInRec b = new AllocInRec();
        AllocInRec c = new AllocInRec();
        AllocInRec d = a.alloc(b, c);
        AllocInRec e = a.alloc(b, b);
        Benchmark.test(1, d);
        Benchmark.test(2, e);
    }
}