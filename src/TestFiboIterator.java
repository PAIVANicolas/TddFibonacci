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
        FiboIterator fiboIterator = new FiboIterator(3);
        fiboIterator.next();
        fiboIterator.next();
        assertEquals(fiboIterator.next().intValue(),2);
    }



}
