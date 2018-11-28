package test;

import benchmark.internal.Benchmark;

class Link {
    Link ne;
    Link pre;
    void setNe2(Link k){
        ne = k;
    }
    void setNe(Link k) {
        setNe2(k);
    }
}

public class FieldEasy {
    private static Link get(Link x) {
        return x;
    }

    private static int get2() {
        return 1;
    }

    public static void main(String[] args) {
        Benchmark.alloc(1);
        Link x = new Link();
        Benchmark.alloc(2);
        Link y = new Link();
        x.setNe(y);
        x.pre = y;
        y.ne = get(x);
        y.pre = x;
        int z = 1;
        z = get2();
        Benchmark.test(1, x.pre.ne);
        Benchmark.test(2, x.ne.pre.pre);
        Benchmark.test(3, x.pre.ne.ne.ne.pre);
    }
}
