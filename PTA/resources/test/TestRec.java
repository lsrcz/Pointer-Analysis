package test;

import benchmark.internal.Benchmark;

class A {
    int i = 0;
    A first(A a, A b) {
        i++;
        return a;
    }
    A func1(A a, A b) {
        i++;
        return first(func2(a, b), func2(b, a));
    }
    A func2(A a, A b) {
        i++;
        return first(func1(a, b), func1(b, a));
    }
}

class B extends A {}
class C extends A {}

public class TestRec {
    public static void main(String[] args) {
        Benchmark.alloc(1);
        A a = new A();
        Benchmark.alloc(2);
        A a1 = new B();
        Benchmark.alloc(3);
        A a2 = new C();
        A t = a.func1(a1, a2);
        a1 = a2;
        A t1 = a.func1(a1, a2);
        Benchmark.test(1, a);
        Benchmark.test(2, a1);
        Benchmark.test(3, a2);
        Benchmark.test(4, t);
        Benchmark.test(5, t1);
    }
}