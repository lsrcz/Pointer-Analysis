package dataset;

import benchmark.internal.Benchmark;
import benchmark.tool.BasicClass;

class Link extends BasicClass {
    Link ne;
}

public class Test1 {
    public static void main(String[] args) {
        int inputValue = 0;
        Benchmark.alloc(1);
        Link x = new Link();
        Benchmark.alloc(2);
        Link y = new Link();
        x.ne = y;
        y.ne = x;
        Link z = y;
        if (inputValue == 0) {
            z = x;
        } else {
            z = y;
        }
        Benchmark.test(1, z);
        Benchmark.print();
    }
}
