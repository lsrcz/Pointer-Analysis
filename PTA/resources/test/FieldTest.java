package test;

import benchmark.internal.Benchmark;

class A {
    static A as;
    A a;
    B b;
    void setA(A a) {
        this.a = a;
    }
    A passSelf() {
        return this;
    }
    void setSelf() {
        setA(passSelf());
    }
    void setAs(A a) {
        this.as = a;
    }
}

class B extends A {
    B a;
    A b;
}

class FieldTest {
    public static void main(String[] args) {
        Benchmark.alloc(1);
        A a = new A();
        //Benchmark.alloc(2);
        //B b = new B();
        Benchmark.alloc(3);
        A a1 = new A();
        Benchmark.alloc(4);
        A a2 = new A();
        //Benchmark.alloc(5);
        //B b1 = new B();
        //Benchmark.alloc(6);
        //B b2 = new B();

        a1.setA(a);
        A tmp = a1.passSelf();
        a2.setA(tmp);
        a.setSelf();
        a1.setAs(a);
        a2.setAs(a1);
        Benchmark.test(1, a);
        Benchmark.test(2, a1);
        Benchmark.test(3, a2);
        Benchmark.test(4, a.a);
        Benchmark.test(5, a1.a);
        Benchmark.test(6, a2.a);
        Benchmark.test(7, tmp);
        Benchmark.test(8, a.as);
    }
}