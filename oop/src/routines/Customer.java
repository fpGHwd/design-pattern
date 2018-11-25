package routines;

/**
 * @author Suzumiya
 * @version Nov 18, 2018 12:56:52 PM
 * 
 */

public class Customer extends Thread {
	private Bank bank = null;
	private int id=  -1;
	private boolean running= false;
	public Customer(Bank _bank, int _id){ // _ avoid bank literal
		bank = _bank;
		id = _id;
		this.start();
	}
	
	public void start(){
		running = true;
		super.start();
	}
	
	public void halt(){
		running = false;
	}
	
	public void run(){
		while(running){
			int into = (int)(Bank.NUM_ACCOUNTS *Math.random());
			int amount = (int)(1000 * Math.random());
			if(id != into)
				bank.transfer(id, into, amount);
			yield();
		}
	}
}
