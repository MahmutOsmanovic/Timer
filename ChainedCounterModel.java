package counter;

public class ChainedCounterModel extends CounterModel {

	CounterModel next;
	
	/*This constructor is used to create the clock object for seconds/minutes/hours*/
	public ChainedCounterModel(int init, int max, CounterModel next) {
		this.counter = init;
		this.max = max;
		this.next = next;
	}
	
	/*increases the counter, resets and switches upon reaching its max value*/
	@Override
	public void increment() {
		counter++;
		if(super.counter >= super.max) {
			wrapUpperBound();
			if(next != null) {
				next.increment();
			
			}
		}
		
	}
	
}
