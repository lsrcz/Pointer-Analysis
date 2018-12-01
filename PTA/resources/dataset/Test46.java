package dataset;

// 为了看这东西编译出啥
import benchmark.internal.Benchmark;
import benchmark.objects.A;

class Test46IntegerWrapper {
    Integer a;
    Test46IntegerWrapper(Integer i) {
        a = i;
    }
    Integer getA() {
        return a;
    }
    Test46IntegerWrapper setA(Integer a) {
        this.a = a;
        return this;
    }
    Test46IntegerWrapper(Test46IntegerWrapper r) {
        a = r.a;
    }
    Test46IntegerWrapper(Test46IntegerWrapper2 r) {
        a = r.b;
    }
}

class Test46IntegerWrapper2 {
    Integer b;
    Test46IntegerWrapper2(int i) {
        b = i;
    }
    int getB() {
        return b;
    }
    Test46IntegerWrapper2 setB(int b) {
        this.b = b;
        return this;
    }
    Test46IntegerWrapper2(Test46IntegerWrapper2 r) {
        b = r.b;
    }
    Test46IntegerWrapper2(Test46IntegerWrapper r) {
        b = r.a;
    }
}

class Test46Class1 {
    int passInt1(int a) {
        return a;
    }
    Integer passInt2(int b) {
        return b;
    }
    int passInt3(Integer c) {
        return c;
    }
    Integer passInt4(Integer d) {
        return d;
    }
}

public class Test46 {
    public static void mani(Test46IntegerWrapper a1, Test46IntegerWrapper a2, Integer i) {
        a1.setA(a2.setA(i).setA(i).getA());
    }
    public static void mani2(Test46IntegerWrapper a1, Test46IntegerWrapper2 b1, Test46IntegerWrapper2 b2) {
        Benchmark.alloc(129);
        Test46Class1 c = new Test46Class1();
        if (a1.getA() < 2) {
            a1.setA(c.passInt2(b1.getB()));
        } else {
            a1.setA(c.passInt4(b2.b));
        }
    }
    public static void main(String[] args) {
        Test46IntegerWrapper a1, a2, a3, a4;
        Test46IntegerWrapper2 b1, b2, b3, b4;
        Integer i1, i2, i3, i4;
        int in1, in2, in3, in4;

        Benchmark.alloc(1);
        i1 = new Integer(1);
        Benchmark.alloc(2);
        i2 = new Integer(i1);
        in1 = 1;
        in2 = i1;
        Benchmark.alloc(3);
        in3 = new Integer(2);
        in4 = 1 + 1;
        Benchmark.alloc(100);
        i3 = new Integer(1);
        i4 = 1 + 1;

        Benchmark.alloc(4);
        a1 = new Test46IntegerWrapper(i1);
        Benchmark.alloc(5);
        a2 = new Test46IntegerWrapper(i2);
        Benchmark.alloc(6);
        a3 = new Test46IntegerWrapper(a1);

        Benchmark.alloc(8);
        b1 = new Test46IntegerWrapper2(i2);
        Benchmark.alloc(9);
        b2 = new Test46IntegerWrapper2(in1);
        Benchmark.alloc(10);
        b3 = new Test46IntegerWrapper2(b1);
        Benchmark.alloc(11);
        b4 = new Test46IntegerWrapper2(a3);


        Benchmark.alloc(7);
        a4 = new Test46IntegerWrapper(b1);

        Benchmark.test(1, a1);
        Benchmark.test(2, a2);
        Benchmark.test(3, a3);
        Benchmark.test(4, a4);
        Benchmark.test(5, b1);
        Benchmark.test(6, b2);
        Benchmark.test(7, b3);
        Benchmark.test(8, b4);
        Benchmark.test(9, a1.a);
        Benchmark.test(10, a2.a);
        Benchmark.test(11, a3.a);
        Benchmark.test(12, a4.a);
        Benchmark.test(13, b1.b);
        Benchmark.test(14, b2.b);
        Benchmark.test(15, b3.b);
        Benchmark.test(16, b4.b);
        Benchmark.test(17, i1);
        Benchmark.test(18, i2);
        Benchmark.test(19, in2);
        Benchmark.test(20, in3);

        b1.b = i3;
        b2.b = i1;
        Benchmark.test(21, b1.b);
        Benchmark.test(22, b2.b);

        mani2(a1, b1, b2);
        Benchmark.test(23, a1.a);
        Benchmark.test(24, b1.b);
        Benchmark.test(25, b2.b);

        mani2(a4, b2, b1);
        Benchmark.test(26, a4.a);
        Benchmark.test(27, b1.b);
        Benchmark.test(28, b2.b);

        Test46Class1 t = new Test46Class1();
        mani(a1, a2, t.passInt3(i3));
        Benchmark.test(29, a1.a);
        Benchmark.test(30, a2.a);
        Benchmark.test(31, i3);

    }
}