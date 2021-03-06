package assignment;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.Timer;


public class GameEngine implements KeyListener, GameReporter{
	GamePanel gp;
		
	private ArrayList<Enemy> enemies = new ArrayList<Enemy>();	
	private Timer timer;

	private double difficulty = 0.1;

	public GameEngine(GamePanel gp) {
		this.gp = gp;

		timer = new Timer(50, new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				process();
			}
		});
		timer.setRepeats(true);

	}

	public void start(){
		timer.start();
	}

	
	private void generateEnemy(){
		Enemy e = new Enemy(100, 30);
		gp.sprites.add(e);
		enemies.add(e);
	}

	private void process(){
		if(Math.random() < difficulty){
			generateEnemy();
		}
		
		Iterator<Enemy> e_iter = enemies.iterator();
		while(e_iter.hasNext()){
			Enemy e = e_iter.next();
			e.proceed();

			if(!e.isAlive()){
				e_iter.remove();
				gp.sprites.remove(e);

			}
		}

		gp.updateGameUI(this);
		
		Rectangle2D.Double er;
		for(Enemy e : enemies){
			er = e.getRectangle();
			return;

			}
	}
	

	
	@Override
	public void keyPressed(KeyEvent e) {
		
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		//do nothing
	}

	@Override
	public void keyTyped(KeyEvent e) {
		//do nothing		
	}
	

}
