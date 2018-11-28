package test;

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
public class FlowSensitivity {

  public FlowSensitivity() {}

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
    if (c == a)
      b = e;
    c = a;

    Benchmark.test(1, b); // expected: 1, 4
    Benchmark.test(2, a); // expected: 2
    Benchmark.test(3, c); // expected: 2
    Benchmark.test(4, e); // expected: 4
  }

  public static void main(String[] args) {

    FlowSensitivity fs2 = new FlowSensitivity();
    fs2.test();
  }

}
