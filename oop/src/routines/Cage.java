package routines;

import java.awt.*;
import java.awt.event.*;

/**
 * @author Suzumiya
 * @version Nov 18, 2018 11:24:46 AM
 * 
 */

public class Cage extends Frame implements ActionListener {
	private Button quit = new Button("Quit");
	private Button start = new Button("Start");
	private Button stop = new Button("Stop");
	private Bird birds[] = new Bird[20];
	Image bird = Toolkit.getDefaultToolkit().getImage("C:\\Users\\mswdw\\Workspaces\\dove.jpg");
	
	public Cage(){
		super("Cage with Birds");
		setLayout(new FlowLayout());
		add(quit);quit.addActionListener(this);
		add(start);start.addActionListener(this);
		add(stop);stop.addActionListener(this);
		validate();setSize(300,300);
		setVisible(true);
		for(int i = 0; i < birds.length; i++){
			int x= (int)(getSize().width* Math.random());
			int y = (int)(getSize().height * Math.random());
			birds[i] = new Bird(this,x, y);
		}
	}


	@Override
	public void actionPerformed(ActionEvent ae) {
		Object o = ae.getSource();
		if(o == stop){
			for(int i = 0; i< birds.length; i++){
				birds[i].halt();
			}
		}
		
		if(o == start){
			for(int i = 0; i< birds.length; i++){
				birds[i].start();
			}
		}
		if(o == quit){
			System.exit(0);
		}
	}
	
	public void paint(Graphics g){
		for(int i = 0; i < birds.length; i++){
			if(birds[i] != null){
				birds[i].draw(g);
			}
		}
	}
	
	public static void main(String args[]){
		Cage table = new Cage();
	}

}
