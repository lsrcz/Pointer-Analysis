package test;

class A {
    static A x;
}
class B extends A {

}

class TestStatic {
    public static void main(String[] args) {
        B b = new B();
        A a = new A();
        A.x = new A();
        B.x = new A();
        a.x = new A();
        b.x = new A();
    }
}