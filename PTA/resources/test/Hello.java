package test;

import benchmark.internal.BenchmarkN;
import benchmark.objects.A;

public class Hello {

  public static void main(String[] args) {
    BenchmarkN.alloc(1); 
    A a = new A();
    BenchmarkN.alloc(2);
    A b = new A();
    BenchmarkN.alloc(3);
    A c = new A();
    if (args.length > 1) a = b;
    //if (args.length > 1) c = a;
    BenchmarkN.test(1, a); // 1, 2
    BenchmarkN.test(2, b); // 2
    BenchmarkN.test(3, c); // 3
  }
}
