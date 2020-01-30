package counter;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestFastCounter {

    @Test
    void testWrap3() {
    	FastCounter counter = new FastCounter();
    	counter.increment();
    	counter.decrement();
    	counter.reset();
        assertEquals(0, counter.getValue());
    }
    
    @Test
    void testWrap4() {
    	FastCounter counter = new FastCounter();
    	counter.downMany();
        assertEquals(10, counter.getValue());
    }
    
    @Test
    void test5() {
    	FastCounter counter = new FastCounter();
    	counter.upMany();
    	counter.upMany();
        assertEquals(10, counter.getValue());
    }
    
    @Test
    void test6() {
    	FastCounter counter = new FastCounter();
    	counter.decrement();
    	counter.downMany();
        assertEquals(9, counter.getValue());
    }

}
