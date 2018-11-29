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
        return first(func3(a, b), func3(b, a));
    }
    A func3(A a, A b) {
        i++;
        return first(func4(a, b), func4(b, a));
    }
    A func4(A a, A b) {
        i++;
        return first(func5(a, b), func5(b, a));
    }
    A func5(A a, A b) {
        i++;
        return first(func6(a, b), func6(b, a));
    }
    A func6(A a, A b) {
        i++;
        return first(func7(a, b), func7(b, a));
    }
    A func7(A a, A b) {
        i++;
        return first(func8(a, b), func8(b, a));
    }
    A func8(A a, A b) {
        i++;
        return first(func9(a, b), func9(b, a));
    }
    A func9(A a, A b) {
        i++;
        return first(func10(a, b), func10(b, a));
    }
    A func10(A a, A b) {
        i++;
        return first(func11(a, b), func11(b, a));
    }
    A func11(A a, A b) {
        i++;
        return first(func12(a, b), func12(b, a));
    }
    A func12(A a, A b) {
        i++;
        return first(func13(a, b), func13(b, a));
    }
    A func13(A a, A b) {
        i++;
        return first(func14(a, b), func14(b, a));
    }
    A func14(A a, A b) {
        i++;
        return first(func15(a, b), func15(b, a));
    }
    A func15(A a, A b) {
        i++;
        return first(func16(a, b), func16(b, a));
    }
    A func16(A a, A b) {
        i++;
        return first(func17(a, b), func17(b, a));
    }
    A func17(A a, A b) {
        i++;
        return first(func18(a, b), func18(b, a));
    }
    A func18(A a, A b) {
        i++;
        return first(func19(a, b), func19(b, a));
    }
    A func19(A a, A b) {
        i++;
        return first(first(a, b), first(b, a));
    }
}

class B extends A {}
class C extends A {}

public class ExponentialCalling {
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
        Benchmark.test(1, t); // 2
        Benchmark.test(2, t1); // 3
    }
}