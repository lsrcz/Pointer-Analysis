class LocalA {
    static int x = 0;
}

class LocalB extends LocalA {
}

public class LocalTest {
    public static void main(String[] args) {
        LocalB k1 = new LocalB();
        LocalB.x = 1;
        LocalA.x = 2;
    }
}
