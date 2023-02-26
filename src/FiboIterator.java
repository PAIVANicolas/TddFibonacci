import java.util.Iterator;

public class FiboIterator implements Iterator<Integer> {

    private int valeurInserer;

    public FiboIterator(int valeurInserer) {
        this.valeurInserer = valeurInserer;
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Integer next() {
        return null;
    }
}
