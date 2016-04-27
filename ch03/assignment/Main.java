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
		
		GamePanel gp = new GamePanel();
		GameEngine engine = new GameEngine(gp);

		frame.addKeyListener(engine);
		frame.getContentPane().add(gp, BorderLayout.CENTER);
		frame.setVisible(true);//Show frame

		engine.start();
	}
}
