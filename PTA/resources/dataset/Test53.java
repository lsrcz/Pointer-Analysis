package dataset;

import benchmark.internal.Benchmark;

class Test53A {
}

class Test53B {
    Test53B func(Test53B x, Test53B y) {
        return x;
    }
}

class Test53Rec {
    Test53B func(Test53B b, int i) {
        if (i == 0)
            return b;
        return func(b, i - 1);
    }
}

public class Test53 {
    public Test53() {}

    private Test53A transA(Test53A ax) {
        return ax;
    }

    public void test() {
        Benchmark.alloc(1);
        Test53A a1 = new Test53A();
        Test53A a2 = transA(a1);

        Benchmark.alloc(2);
        Test53B b = new Test53B();

        Benchmark.alloc(3);
        Test53B b1 = new Test53B();
        Benchmark.alloc(4);
        Test53B b2 = new Test53B();
        Test53B b3, b4;
        b3 = b.func(b1, b2);
        b4 = b.func(b2, b1);
        Test53Rec r = new Test53Rec();
        Test53B b6 = r.func(b1, -20);
        Test53B btmp, b5;
        btmp = b1;
        b1 = b2;
        b2 = btmp;
        b5 = b.func(b1, b2);

        Test53B b7 = r.func(b1, -20);
        Benchmark.test(1, a1); // 1
        Benchmark.test(2, a2); // 1
        Benchmark.test(3, b1); // 4
        Benchmark.test(4, b2); // 3
        Benchmark.test(5, b3); // 3
        Benchmark.test(6, b4); // 4
        Benchmark.test(7, b5); // 4
        Benchmark.test(8, b6); // 3
        Benchmark.test(9, b7); // 4
    }
    public static void main(String[] args) {
        Test53 i = new Test53();
        i.test();
    }
}
