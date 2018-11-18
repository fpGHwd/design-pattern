package oop;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @author Suzumiya
 * @version Nov 18, 2018 12:54:12 PM
 * 
 */

public class Bank extends Frame implements ActionListener {
	protected final static int NUM_ACCOUNTS = 8;
	private final static int WASTE_TIME = 1;
	private int accounts[] = new int[NUM_ACCOUNTS];
	private Customer customer[] = new Customer[NUM_ACCOUNTS];
	private int counter = 0;

	private Label status = new Label("Transfers Completed: 0");
	private TextArea display = new TextArea();
	private Button show = new Button("Show Accounts");
	private Button start = new Button("Start");
	private Button stop = new Button("Stop");

	public Bank() {
		super("Mystery Money");
		Panel buttons = new Panel();
		buttons.setLayout(new FlowLayout());
		buttons.add(show);
		show.addActionListener(this);
		buttons.add(start);
		start.addActionListener(this);
		buttons.add(stop);
		stop.addActionListener(this);
		setLayout(new BorderLayout());
		add("North", status);
		add("South", buttons);
		add("Center", display);

		for (int i = 0; i < accounts.length; i++) {
			accounts[i] = 10000;
		}
		start();

		validate();
		setSize(300, 300);
		setVisible(true);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
	}

	public void transfer(int from, int into, int amount) {
		// if(accounts[from] > amount){
		// accounts[from] -= amount;
		// accounts[into] += amount;
		// }
		synchronized (this) {
			if (accounts[from] > amount) {
				int newFrom = accounts[from] - amount;
				int newInto = accounts[into] + amount;
				wasteSomeTime();
				accounts[from] = newFrom;
				accounts[into] = newInto;
			}
			status.setText("Transfers completed: " + counter++);
		}

	}

	public void start() {
		stop();
		for (int i = 0; i < accounts.length; i++) {
			customer[i] = new Customer(this, i); // not i this, because i change
													// the order
		}
	}

	public void stop() {
		for (int i = 0; i < accounts.length; i++) {
			if (customer[i] != null)
				customer[i].halt();
		}
	}

	private void wasteSomeTime() {
		try {
			Thread.sleep(WASTE_TIME);
		} catch (InterruptedException e) {
			System.err.println("Error: " + e);
		}
	}

	private void showAccounts() {
		int sum = 0;
		for (int i = 0; i < accounts.length; i++) {
			sum += accounts[i];
			display.append("\nAccount " + (i + 1) + ": $" + accounts[i]);
		}
		display.append("\nTotal Amount:  $" + sum);
		display.append("\nTotal Transfers:  " + counter + "\n");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == show) {
			showAccounts();
		} else if (e.getSource() == start) {
			start();
		} else if (e.getSource() == stop) {
			stop();
		}
	}

	public static void main(String args[]) {
		Bank bank = new Bank();
	}
}
