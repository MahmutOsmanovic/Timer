package counter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCounterModel {
    
    @Test
    void testNewCounter() {
        CounterModel counter = new CounterModel();
        assertEquals(0, counter.getValue());
    }
    
    @Test
    void testIncrement() {
        CounterModel counter = new CounterModel();
        counter.increment();
        assertEquals(1, counter.getValue());
    }
    
    @Test
    void testDecrement() {
        CounterModel counter = new CounterModel();
        counter.increment();
        counter.decrement();
        assertEquals(0, counter.getValue());
    }
    
    @Test
    void testReset() {
        CounterModel counter = new CounterModel();
        counter.increment();
        counter.increment();
        counter.reset();
        assertEquals(0, counter.getValue());
    }
    
    @Test
    void testWrap1() {
        CounterModel counter = new CounterModel(0, 3);
        counter.increment();
        counter.increment();
        counter.increment();
        assertEquals(0, counter.getValue());
    }

    @Test
    void testWrap2() {
        CounterModel counter = new CounterModel(0, 3);
        counter.decrement();
        assertEquals(2, counter.getValue());
    }
    
    // Different counters should have different values
    @Test
    void testTwoCounters() {
        CounterModel counter1 = new CounterModel();
        CounterModel counter2 = new CounterModel();
        counter1.increment();
        counter2.increment();
        counter2.increment();
        assertEquals(1, counter1.getValue());
        assertEquals(2, counter2.getValue());
    }
}
