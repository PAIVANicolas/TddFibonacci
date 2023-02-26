import java.net.Inet4Address;
import java.util.Iterator;

public class Fibonacci implements Iterable<Integer>{

    private int valeurInserer;

    public Fibonacci(int valeurInserer) {
        this.valeurInserer = valeurInserer;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new FiboIterator(this.valeurInserer);
    }
}
