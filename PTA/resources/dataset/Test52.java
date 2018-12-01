package dataset;

import benchmark.internal.Benchmark;
import benchmark.objects.A;
import benchmark.objects.B;

/*
 * @testcase FieldSensitivity2
 *
 * @version 1.0
 *
 * @author Johannes Späth, Nguyen Quang Do Lisa (Secure Software Engineering Group, Fraunhofer
 * Institute SIT)
 *
 * @description Field Sensitivity without static method
 */
public class Test52 {

    public Test52() {}

    private void assign(A x, A y) {
        y.f = x.f;
    }

    private void test() {
        Benchmark.alloc(1);
        B b = new B();
        Benchmark.alloc(2);
        A a = new A(b);
        Benchmark.alloc(3);
        A c = new A();
        Benchmark.alloc(4);
        B e = new B();
        assign(a, c);
        B d = c.f;
        Benchmark.test(1, b);
        Benchmark.test(2, a.f);
        Benchmark.test(3, a);
        Benchmark.test(4, d);
    }

    public static void main(String[] args) {

        Test52 fs2 = new Test52();
        fs2.test();
    }

}
