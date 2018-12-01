package test;

import benchmark.internal.Benchmark;

class A {
}

class B {
    B func(B x, B y) {
        return x;
    }
}
/*
class C extends B {
    B func(B x, B y) {
        return y;
    }
}*/

class Rec {
    B func(B b, int i) {
        if (i == 0)
            return b;
        return func(b, i - 1);
    }
}

public class InterFlowCS {
    public InterFlowCS() {}

    private A transA(A ax) {
        return ax;
    }

    public void test() {
        Benchmark.alloc(1);
        A a1 = new A();
        A a2 = transA(a1);

        Benchmark.alloc(2);
        B b = new B();
        //Benchmark.alloc(4);
        //B c = new C();

        Benchmark.alloc(3);
        B b1 = new B();
        Benchmark.alloc(4);
        B b2 = new B();
        B b3, b4;
        b3 = b.func(b1, b2);
        b4 = b.func(b2, b1);
        Rec r = new Rec();
        B b6 = r.func(b1, -20);
        //B btmp, b5;
        //btmp = b1;
        //b1 = b2;
        //b2 = btmp;
        //b5 = b.func(b1, b2);

        //B b7 = r.func(b1, -20);
        Benchmark.test(1, a1); // 1
        Benchmark.test(2, a2); // 1
        Benchmark.test(3, b1); // 4
        Benchmark.test(4, b2); // 3
        Benchmark.test(5, b3); // 3
        Benchmark.test(6, b4); // 4
        //Benchmark.test(7, b5); // 4
        Benchmark.test(8, b6); // 3
        //Benchmark.test(9, b7); // 4
    }
    public static void main(String[] args) {
        InterFlowCS i = new InterFlowCS();
        i.test();
    }
}

