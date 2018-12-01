package dataset;

import benchmark.internal.Benchmark;

class Test47A {

}

class Test47B {
    Test47A a;
}

class Test47C extends Test47B {
    Test47A a;
    Test47C(Test47A a1, Test47A a2) {
        this.a = a1;
        super.a = a2;
    }
}

class Test47 {
    public static void main(String[] args) {
        Test47B b;
        Test47C c;
        Test47A a1, a2;
        Test47A a3, a4;
        Benchmark.alloc(5);
        a3 = new Test47A();
        Benchmark.alloc(6);
        a4 = new Test47A();
        Benchmark.alloc(1);
        b = new Test47B();
        Benchmark.alloc(2);
        c = new Test47C(a3, a4);
        Benchmark.alloc(3);
        a1 = new Test47A();
        Benchmark.alloc(4);
        a2 = new Test47A();

        Benchmark.test(1, b.a);
        Benchmark.test(2, c.a);
        Benchmark.test(3, ((Test47B)c).a);
        
        b.a = a1;
        Benchmark.test(4, b.a);
        c.a = a2;
        Benchmark.test(5, c.a);
        Benchmark.test(6, ((Test47B)c).a);
        
        ((Test47B)c).a = a3;
        Benchmark.test(7, c.a);
        Benchmark.test(8, ((Test47B)c).a);
        
    }
}