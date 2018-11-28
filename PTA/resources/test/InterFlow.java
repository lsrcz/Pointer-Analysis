package test;

import benchmark.internal.Benchmark;

class A {
}

class B {
    B func(B x, B y) {
        return x;
    }
}

class C extends B {
    B func(B x, B y) {
        return y;
    }
}

public class InterFlow {
    public InterFlow() {}

    private A transA(A ax) {
        return ax;
    }

    public void test() {
        Benchmark.alloc(1);
        A a1 = new A();
        A a2 = transA(a1);

        Benchmark.alloc(2);
        B b = new B();
        Benchmark.alloc(3);
        B c = new C();

        Benchmark.alloc(4);
        B b1 = new B();
        Benchmark.alloc(5);
        B b2 = new B();
        B b3, b4;
        b3 = b.func(b1, b2);
        b4 = c.func(b1, b2);
        Benchmark.test(1, a1); // 1
        Benchmark.test(2, a2); // 1
        Benchmark.test(3, b3); // 4
        Benchmark.test(4, b4); // 5
    }
    public static void main(String[] args) {
        InterFlow i = new InterFlow();
        i.test();
    }
}

