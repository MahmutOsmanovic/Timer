package counter;

public class CounterModel {
	int counter;
    int init, max;
	
	public CounterModel() {
		counter = 0;
		this.max = 10;
	}
	
	CounterModel(int init, int max) {
		this.counter = init;
		this.max = max;
	}
	
	/*resets counter if it reaches its max value*/
	public void wrapUpperBound() {
		if(this.counter >= max) 
			counter = 0;
	}
	/*resets counter if it reaches its less than zero*/	
	public void wrapLowerBound() {
		if(this.counter < 0)
			this.counter = max - 1;
	}

	/*increments counter by one and wraps above*/
	public void increment() {
		counter++;
		wrapUpperBound();
	}
	
	/*decrements counter by one and wraps below*/
	public void decrement() {
		counter--;
		wrapLowerBound();
	}
	
	public void reset() {
		counter = 0;
	}
	
	public int getValue() {
		return counter;
	}
	
	public int getMax(){
		return max;
	}
	
}
