package counter;

import javax.swing.*;
public class CCMain {

	public static void main(String[] args) {
		ClockView view = new ClockView(	0, 0, 0);
		
		JFrame f = new JFrame("Clock");	
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.add(view);
		f.setLocation(100,100);
		f.pack();
		f.setVisible(true);
	}
}
