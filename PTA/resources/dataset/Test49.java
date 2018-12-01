package dataset;

import benchmark.internal.Benchmark;

class Test49A {
    int i = 0;
    Test49A first(Test49A a, Test49A b) {
        i++;
        return a;
    }
    Test49A func1(Test49A a, Test49A b) {
        i++;
        return first(func2(a, b), func2(b, a));
    }
    Test49A func2(Test49A a, Test49A b) {
        i++;
        return first(func3(a, b), func3(b, a));
    }
    Test49A func3(Test49A a, Test49A b) {
        i++;
        return first(func4(a, b), func4(b, a));
    }
    Test49A func4(Test49A a, Test49A b) {
        i++;
        return first(func5(a, b), func5(b, a));
    }
    Test49A func5(Test49A a, Test49A b) {
        i++;
        return first(func6(a, b), func6(b, a));
    }
    Test49A func6(Test49A a, Test49A b) {
        i++;
        return first(func7(a, b), func7(b, a));
    }
    Test49A func7(Test49A a, Test49A b) {
        i++;
        return first(func8(a, b), func8(b, a));
    }
    Test49A func8(Test49A a, Test49A b) {
        i++;
        return first(func9(a, b), func9(b, a));
    }
    Test49A func9(Test49A a, Test49A b) {
        i++;
        return first(func10(a, b), func10(b, a));
    }
    Test49A func10(Test49A a, Test49A b) {
        i++;
        return first(func11(a, b), func11(b, a));
    }
    Test49A func11(Test49A a, Test49A b) {
        i++;
        return first(func12(a, b), func12(b, a));
    }
    Test49A func12(Test49A a, Test49A b) {
        i++;
        return first(func13(a, b), func13(b, a));
    }
    Test49A func13(Test49A a, Test49A b) {
        i++;
        return first(func14(a, b), func14(b, a));
    }
    Test49A func14(Test49A a, Test49A b) {
        i++;
        return first(func15(a, b), func15(b, a));
    }
    Test49A func15(Test49A a, Test49A b) {
        i++;
        return first(func16(a, b), func16(b, a));
    }
    Test49A func16(Test49A a, Test49A b) {
        i++;
        return first(func17(a, b), func17(b, a));
    }
    Test49A func17(Test49A a, Test49A b) {
        i++;
        return first(func18(a, b), func18(b, a));
    }
    Test49A func18(Test49A a, Test49A b) {
        i++;
        return first(func19(a, b), func19(b, a));
    }
    Test49A func19(Test49A a, Test49A b) {
        i++;
        return first(first(a, b), first(b, a));
    }
}

class Test49B extends Test49A {}
class Test49C extends Test49A {}

public class Test49 {
    public static void main(String[] args) {
        Benchmark.alloc(1);
        Test49A a = new Test49A();
        Benchmark.alloc(2);
        Test49A a1 = new Test49B();
        Benchmark.alloc(3);
        Test49A a2 = new Test49C();
        Test49A t = a.func1(a1, a2);
        a1 = a2;
        Test49A t1 = a.func2(a1, a2);
        Benchmark.test(1, t); // 2
        Benchmark.test(2, t1); // 3
    }
}
