package Concurrency;

public class Counter {
	private int i = 0;
	
	synchronized public void increment() {
		i++;
		// unsafe method
		// getI()
		// increment
		// setI()
	}
	
	public int getI() {
		return i;
	}
}
