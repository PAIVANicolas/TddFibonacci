import java.util.Iterator;

public class FiboIterator implements Iterator<Integer> {

    private int valeurInserer;
    private int rang;


    public FiboIterator(int valeurInserer) {
        this.valeurInserer = valeurInserer;
        this.rang = 0;
    }

    @Override
    public boolean hasNext() {
        return rang < valeurInserer;
    }

    @Override
    public Integer next() {
        int resultat = 0;

        if (valeurInserer==0){
            resultat = 1;
        }

        return resultat;
    }
}
