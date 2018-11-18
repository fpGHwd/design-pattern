package oop;

/**
 * @author Suzumiya
 * @version Nov 18, 2018 12:17:41 PM
 * 
 */

public class CorruptedData {
	protected static int DISPLAY = 1, CHANGE = 2;
	private WorkThread slowWorker = null;
	private WorkThread fastWorker = null;
	private int number = 0;

	public CorruptedData() throws InterruptedException {
		number = (int) (10 * Math.random());
		slowWorker = new WorkThread(this, DISPLAY);
		Thread.sleep(1000);
		fastWorker = new WorkThread(this, CHANGE);
	}

	public synchronized void performWork(int type) {
		if (type == DISPLAY) {
			System.out.println("Number before sleeping: " + number);
			try {
				slowWorker.sleep(2000);
			} catch (InterruptedException ie) {
				System.err.println("Error: " + ie);
			}
			System.out.println("Number after waking up: " + number);
			// slow thread get a number which not match its value before sleep
			// and after sleep
		}

		if (type == CHANGE) { // fast thread change this number
			number = -1;
		}
	}

	public static void main(String args[]) throws InterruptedException {
		CorruptedData cd = new CorruptedData();
	}
}
