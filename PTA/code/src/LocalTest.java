class LocalA {
    int x = 0;
}

class LocalB extends LocalA {
}

public class LocalTest {
    public static void main(String[] args) {
        LocalB k1 = new LocalB();
        LocalA k2 = k1;
        k1.x = 1;
        k2.x = 2;
    }
}
