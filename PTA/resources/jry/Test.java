package jry;

import benchmark.internal.Benchmark;

class myA {
    public myA next;
}

public class Test {
    public static void main(String[] args) {
        Benchmark.alloc(1);
        myA x = new myA();
        Benchmark.alloc(2);
        myA y = new myA();
        x.next = y;
        y.next = x;
        Benchmark.test(1, x.next);
        Benchmark.test(2, x.next.next);
        Benchmark.test(3, x.next.next.next);
        Benchmark.test(4, x.next.next.next.next);
        Benchmark.test(5, x.next.next.next.next.next);
        Benchmark.test(6, x.next.next.next.next.next.next);
        Benchmark.test(7, x.next.next.next.next.next.next.next);
        Benchmark.test(8, x.next.next.next.next.next.next.next.next);
        Benchmark.test(9, x.next.next.next.next.next.next.next.next.next);
    }
}
