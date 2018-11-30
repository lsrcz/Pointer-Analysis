package test;


import benchmark.internal.Benchmark;

class A {
    static int s;
    int i;
    A(int i) {
        super();
        this.i = i;
        this.s = i;
    }
}

class B extends A {
    static int s;
    int i;
    B(int i, int j) {
        super(j);
        this.i = i;
        this.s = i;
        super.i = j;
        super.s = j;
    }
}

class TestSuper {
    public static void main(String[] args) {
        Benchmark.alloc(1);
        A a = new A(1);
        Benchmark.alloc(2);
        B b = new B(1, 2);
        Benchmark.alloc(3);
        A ba = b;
        Benchmark.test(1, ba.i);
        Benchmark.test(2, ba.s);
        Benchmark.test(3, b.i);
        Benchmark.test(4, b.s);
        Benchmark.test(5, ((A)b).i);
        Benchmark.test(6, ((A)b).s);
    }
}