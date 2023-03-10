import org.junit.Test;

import static org.junit.Assert.*;

public class TestFiboIterator {

    @Test
    public void TestFiboIteratorHasNextFalse (){
        FiboIterator fiboIterator = new FiboIterator(0);
        assertFalse(fiboIterator.hasNext());
    }

    @Test
    public void TestFiboIteratorHasNextTrue (){
        FiboIterator fiboIterator = new FiboIterator(1);
        assertTrue(fiboIterator.hasNext());
    }

    @Test
    public void TestFiboIteratorNext0 (){
        FiboIterator fiboIterator = new FiboIterator(0);
        assertEquals(fiboIterator.next().intValue(),1);
    }

    @Test
    public void TestFiboIteratorNext1 (){
        FiboIterator fiboIterator = new FiboIterator(1);
        assertEquals(fiboIterator.next().intValue(),1);
    }

    @Test
    public void TestFiboIteratorNext2 (){
        FiboIterator fiboIterator = new FiboIterator(2);
        fiboIterator.next();
        assertEquals(fiboIterator.next().intValue(),1);
    }

    @Test
    public void TestFiboIteratorNext3 (){
        Fibonacci fibonacci = new Fibonacci(3);
        int resultat = 0;

        for(int i : fibonacci){
            resultat = i;

        }
        assertEquals(resultat,2);
    }

    @Test
    public void TestFiboIteratorNext4 (){
        Fibonacci fibonacci = new Fibonacci(4);
        int resultat = 0;

        for(int i : fibonacci){
            resultat = i;
        }
        assertEquals(resultat,3);
    }

    @Test
    public void TestFiboIteratorNext5 (){
        Fibonacci fibonacci = new Fibonacci(5);
        int resultat = 0;

        for(int i : fibonacci){
            resultat = i;
        }
        assertEquals(resultat,5);
    }
    @Test
    public void TestFiboIteratorNext6 (){
        Fibonacci fibonacci = new Fibonacci(6);
        int resultat = 0;

        for(int i : fibonacci){
            resultat = i;
        }
        assertEquals(resultat,8);
    }

    @Test
    public void TestFiboIteratorNext7 (){
        Fibonacci fibonacci = new Fibonacci(7);
        int resultat = 0;

        for(int i : fibonacci){
            resultat = i;
        }
        assertEquals(resultat,13);
    }
    @Test
    public void TestFiboIteratorNext8 (){
        Fibonacci fibonacci = new Fibonacci(8);
        int resultat = 0;

        for(int i : fibonacci){
            resultat = i;
        }
        assertEquals(resultat,21);
    }
    @Test
    public void TestFiboIteratorNext9 (){
        Fibonacci fibonacci = new Fibonacci(9);
        int resultat = 0;

        for(int i : fibonacci){
            resultat = i;
        }
        assertEquals(resultat,34);
    }
    @Test
    public void TestFiboIteratorNext10 (){
        Fibonacci fibonacci = new Fibonacci(10);
        int resultat = 0;

        for(int i : fibonacci){
            resultat = i;
        }
        assertEquals(resultat,55);
    }

    @Test
    public void TestFiboIteratorNext30 (){
        int resultat = 0;

        int tableau[] = {0,1, 1, 2, 3, 5, 8, 13, 21, 34,
                55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181,
                6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229};

        for (int z =0; z<tableau.length;z++) {
            FiboIterator fiboIterator = new FiboIterator(z);
            while (fiboIterator.hasNext()) {
                resultat = fiboIterator.next();

            }
            assertEquals(resultat, tableau[z]);
        }

    }
}
