package assignment;

import javax.swing.JFrame;
import java.awt.BorderLayout;

public class Main {
	public static void main(String[] args){
		
		//Create frame
		JFrame frame = new JFrame("My App");
		
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 600); //Set size for frame
		frame.getContentPane().setLayout(new BorderLayout());
		
		frame.setVisible(true);//Show frame
	}
}
