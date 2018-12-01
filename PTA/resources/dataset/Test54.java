package dataset;

import benchmark.internal.Benchmark;

class Test54A {
    int i = 0;
    Test54A first(Test54A a, Test54A b) {
        i++;
        return a;
    }
    Test54A func1(Test54A a, Test54A b) {
        i++;
        return first(func2(a, b), func2(b, a));
    }
    Test54A func2(Test54A a, Test54A b) {
        i++;
        return first(func1(a, b), func1(b, a));
    }
}

class Test54B extends Test54A {}
class Test54C extends Test54A {}

public class Test54 {
    public static void main(String[] args) {
        Benchmark.alloc(1);
        Test54A a = new Test54A();
        Benchmark.alloc(2);
        Test54A a1 = new Test54B();
        Benchmark.alloc(3);
        Test54A a2 = new Test54C();
        Test54A t = a.func1(a1, a2);
        a1 = a2;
        Test54A t1 = a.func1(a1, a2);
        Benchmark.test(1, a);
        Benchmark.test(2, a1);
        Benchmark.test(3, a2);
        Benchmark.test(4, t);
        Benchmark.test(5, t1);
    }
}