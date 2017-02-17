// Author: Emily Nichols, Panel Aficionado
// Purpose: The main panel of the program, does all the displaying
// 		of information.

package game;

import java.awt.Graphics;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.FileNotFoundException;

import javax.swing.JPanel;

public class GamePanel extends JPanel implements KeyListener {
	public static int keyCode;
	public Game game = new Game();
	public Movement mover = new Movement();
	
	public GamePanel() throws FileNotFoundException {
		setPreferredSize(new Dimension(700,700));
		game.setDefaultPlayers(); // REMOVE LATER
		addKeyListener(this);
		setFocusable(true);
		repaint();
	}

	public void paintComponent(Graphics page) {
		super.paintComponent(page);
		page.drawImage(game.getPlayer1().getIcon().getImage(),game.getPlayer1().getXPos(),game.getPlayer1().getYPos(),null);
		page.drawImage(game.getPlayer2().getIcon().getImage(),game.getPlayer2().getXPos(), game.getPlayer2().getYPos(), null);
	}
	
	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		keyCode = arg0.getKeyCode();
		if(keyCode == KeyEvent.VK_LEFT || keyCode == KeyEvent.VK_RIGHT) {
			//game.getPlayer2().move();
			game.getPlayer2().setXPos(mover.getNewXPos(game.getPlayer2().getXPos()));
			System.out.println("p2 X: " + game.getPlayer2().getXPos() + "\np2 Y: " + game.getPlayer2().getYPos());
		} else if(keyCode == KeyEvent.VK_UP || keyCode == KeyEvent.VK_DOWN) {
			game.getPlayer2().setYPos(mover.getNewYPos(game.getPlayer2().getYPos()));
			System.out.println("p2 X: " + game.getPlayer2().getXPos() + "\np2 Y: " + game.getPlayer2().getYPos());
		} else if(keyCode == KeyEvent.VK_A || keyCode == KeyEvent.VK_D) {
			//game.getPlayer1().move();
			game.getPlayer1().setXPos(mover.getNewXPos(game.getPlayer1().getXPos()));
			System.out.println("p1 X: " + game.getPlayer1().getXPos() + "\np1 Y: " + game.getPlayer1().getYPos());
		} else if(keyCode == KeyEvent.VK_W || keyCode == KeyEvent.VK_S) {
			game.getPlayer1().setYPos(mover.getNewYPos(game.getPlayer1().getYPos()));
			System.out.println("p1 X: " + game.getPlayer1().getXPos() + "\np1 Y: " + game.getPlayer1().getYPos());
		}
		repaint();
	}
	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	
	public static int getKeyCode() {
		return keyCode;
	}
}