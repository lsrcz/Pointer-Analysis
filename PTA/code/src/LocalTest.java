class LocalA {
    LocalB x;
}

class LocalB extends LocalA {
    LocalA y;
}

public class LocalTest {
    public static void main(String[] args) {
        LocalA x[][] = new LocalA[1000][110];
        LocalA y = x[1][1];
        LocalA k = new LocalA();
        LocalB k2 = new LocalB();
    }
}
