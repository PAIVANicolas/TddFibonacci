import org.junit.Test;

import static org.junit.Assert.assertFalse;

public class TestFiboIterator {

    @Test
    public void TestFiboIteratorHasNext (){
        FiboIterator fiboIterator = new FiboIterator(0);
        assertFalse(fiboIterator.hasNext());
    }

}
