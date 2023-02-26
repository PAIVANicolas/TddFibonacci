import java.util.Iterator;

public class FiboIterator implements Iterator<Integer> {

    private int valeurInserer;
    private int valeurPrecedente;

    private int valeurSuivante;
    private int rang;


    public FiboIterator(int valeurInserer) {
        this.valeurInserer = valeurInserer;
        this.valeurPrecedente = 0;
        this.valeurSuivante = 1;
        this.rang = 0;
    }

    @Override
    public boolean hasNext() {
        return rang < valeurInserer;
    }

    @Override
    public Integer next() {
        int resultat = 0;

        if (rang==0 || rang==1 ){
            resultat = 1;
            this.valeurPrecedente=1;
        }else {
            resultat = this.valeurPrecedente + this.valeurSuivante;
        }
        rang++;


        return resultat;
    }
}
