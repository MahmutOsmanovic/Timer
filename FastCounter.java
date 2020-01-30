package counter;

public class FastCounter extends CounterModel {

	int step;
	
	/* Creates a FastCounter with initialized values, 
	 * the new feature is the step value, which allows one to
	 * increment the counter by a desired amount*/
	public FastCounter() {
		super.counter = 0;
		super.max = 15;
		step = 5;
	}
	
	/* Creates a FastCounter with declared variables, 
	 * the new feature is the step value, which allows one to
	 * increment the counter by a desired amount*/
	public FastCounter(int init, int max, int step) {
		super.counter = init;
		super.max = max;
		this.step = step;
	}

	/*increase the counter by step, wraps if max value is reached*/
	public void upMany() {
		super.counter += step;
		wrapUpperBound();
	}
	
	/*increase the counter by step, wraps if max value is reached*/
	public void downMany() {
		super.counter -= step;
		if(this.counter < 0)
			this.counter = max - step;
	}
	
	public int getStep() {
		return step;
	}
}
