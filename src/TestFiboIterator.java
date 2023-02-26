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



}
