package dataset;

import benchmark.internal.Benchmark;

class Test57A {

}

class Test57B {
    Test57A[] a;
    void setPos(int a, Test57A b) {
        this.a[a] = b;
    }
    Test57A getPos(int a) {
        return this.a[a];
    }
}

class Test57 {
    public static void main(String[] args) {
        Test57A a1, a2, a3, a4;
        Test57B b1, b2, b3, b4;
        Benchmark.alloc(1);
        a1 = new Test57A();
        Benchmark.alloc(2);
        a2 = new Test57A();
        Benchmark.alloc(3);
        Test57A[] aa = new Test57A[2];
        Benchmark.alloc(4);
        b1 = new Test57B();
        b1.a = aa;
        b1.setPos(1, a1);

        Benchmark.alloc(5);
        b2 = new Test57B();
        int t = 10;
        Benchmark.alloc(6);
        Test57A[] aa2 = new Test57A[t];
        b2.a = aa2;
        Benchmark.alloc(7);
        b2.a[t - 10] = new Test57A();
        if (a2 == a1) {
            b2.a[1] = b1.a[0];
        }
        if (a2 != a1) {
            b2.a[2] = a2;
        }

        Benchmark.test(1, b1.a);
        Benchmark.test(2, b1.a[0]);
        Benchmark.test(3, b1.a[1]);
        Benchmark.test(4, b2.a);
        Benchmark.test(5, b2.a[0]);
        Benchmark.test(6, b2.a[1]);
        Benchmark.test(7, b2.a[2]);



    }
}
