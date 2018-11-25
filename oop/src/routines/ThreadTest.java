package routines;

/**
 * @author Suzumiya
 * @version Nov 18, 2018 11:03:22 AM
 * 
 */

public class ThreadTest {
	public static void main(String args[]){
		System.out.println("main thread starts");
		CountingThread t1 = new CountingThread();
		t1.start();
		CountingThread t2 = new CountingThread();
		t2.start();
		CountingThread t3 = new CountingThread();
		t3.start();
		System.out.println("main thread ends");
	}
}
