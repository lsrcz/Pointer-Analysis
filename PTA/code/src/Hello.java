class A {
    public void foo() {
        bar();
    }
    public void bar() {}
    public A get(int k) {
        if (k == 1) {
            return this;
        } else  {
            return new A();
        }
    }
}

class B extends A{
    public void foo() {
        super.bar();
    }

    public void bar() {
        super.foo();
    }
}

public class Hello {
    public static void main(String[] args) {
        A k = new B().get(1);
        k.foo();
    }
}
