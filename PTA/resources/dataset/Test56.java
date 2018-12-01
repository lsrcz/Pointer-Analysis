package dataset;

import benchmark.internal.Benchmark;

class Test56Link {
    Test56Link ne;
    Test56Link pre;
    void setNe2(Test56Link k){
        ne = k;
    }
    void setNe(Test56Link k) {
        setNe2(k);
    }
}

public class Test56 {
    private static Test56Link get(Test56Link x) {
        return x;
    } 

    private static int get2() {
        return 1;
    }

    public static void main(String[] args) {
        Benchmark.alloc(1);
        Test56Link x = new Test56Link();
        Benchmark.alloc(2);
        Test56Link y = new Test56Link();
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