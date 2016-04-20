package assignment;

import javax.swing.JFrame;
import java.awt.BorderLayout;

public class Main {
	public static void main(String[] args){
		
		//Create frame
		JFrame frame = new JFrame("My App");
		
		//mathod for close frame "setDefaultCloseOperation()"
		//arqument "EXIT_ON_CLOSE"
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 600); //Set size for frame
		
		
		
		GamePanel gp = new GamePanel();
		GameEngine engine = new GameEngine(gp);
		engine.start();
		
		frame.getContentPane().setLayout(new BorderLayout());
		frame.getContentPane().add(gp, BorderLayout.CENTER);//Set position for background frame
		
		frame.setVisible(true);//Show frame
	}
}
