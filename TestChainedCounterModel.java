package counter;

import static org.junit.jupiter.api.Assertions.assertEquals;

import javax.swing.Timer;

import org.junit.jupiter.api.Test;

//2020-01-20
class TestChainedCounterModel {

	
	/*Se om klockan wrappar vid dygnskifte*/
	@Test
	void test() {
		ChainedCounterModel hoursCounter = new ChainedCounterModel(23,24,null);
        ChainedCounterModel minsCounter = new ChainedCounterModel(59,60,hoursCounter);
        ChainedCounterModel secsCounter = new ChainedCounterModel(58,60,minsCounter);
        secsCounter.increment();
        assertEquals(59, secsCounter.counter);
        secsCounter.increment();
        assertEquals(0, secsCounter.counter);
        assertEquals(0, minsCounter.counter);
        assertEquals(0, hoursCounter.counter);
	}

}

