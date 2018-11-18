package oop;

/**
 * @author Suzumiya
 * @version Nov 18, 2018 12:19:47 PM
 * 
 */

public class WorkThread extends Thread {
	private CorruptedData data=null;
	private int work = 0;
	
	public WorkThread(CorruptedData _data, int _work){
		data = _data;
		work = _work;
		this.start();
	}
	
	public void run(){
		data.performWork(work);
	}
}
