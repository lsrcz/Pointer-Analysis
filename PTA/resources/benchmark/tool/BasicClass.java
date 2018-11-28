package benchmark.tool;

public class BasicClass {
    public int allocId = 0;
    public BasicClass() {
        allocId = Counter.count;
        Counter.count = 0;
    }
}
