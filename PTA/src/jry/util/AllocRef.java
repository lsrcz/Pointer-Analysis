package jry.util;

public class AllocRef {
    Integer id;

    @Override
    public int hashCode() {
        return ("AllocRef" + id).hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof AllocRef)) {
            return false;
        }
        return id.equals(((AllocRef) obj).id);
    }

    public AllocRef(int _id) {
        id = _id;
    }
}
