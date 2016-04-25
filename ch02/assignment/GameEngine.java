package assignment;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.Timer;


public class GameEngine{
	GamePanel gp;
		
	private ArrayList<Enemy> enemies = new ArrayList<Enemy>();	
	public GameEngine(GamePanel gp) {
		this.gp = gp;
		process();
	}
	
	private void generateEnemy(){
		Enemy e = new Enemy(100, 30);
		gp.sprites.add(e);
		enemies.add(e);
	}
	
	private void process(){
		generateEnemy();
		gp.updateGameUI();
	
	}
	

}
