package test;

import benchmark.internal.Benchmark;
import benchmark.objects.A;

public class Hello2 {

  public static void main(String[] args) {
    Benchmark.alloc(1);
    int x[][][] = new int[10][][];
    Benchmark.alloc(2);
    x[1] = new int[10][];
    Benchmark.alloc(3);
    x[1][1] = new int[10];
    Benchmark.test(1, x);
    Benchmark.test(2, x[1]);
    Benchmark.test(3, x[1][1]);
  }
}
