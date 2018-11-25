package routines;

/**
 * @author Suzumiya
 * @version Nov 18, 2018 10:58:28 AM
 * 
 */

public class CountingThread extends Thread {
	public void run(){
		System.out.println();
		System.out.println("subthread" + this + "starts");
		for(int i = 0; i < 8 ; i++){
			System.out.println(this.getName() + ".i = " + (i+1) + "\t");
		}
		System.out.println("subthread" + this + "ends");
	}
}
