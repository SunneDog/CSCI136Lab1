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
	public EndPanel endPanel = new EndPanel();
	public boolean endPanelUp = false;
	
	public GamePanel() throws FileNotFoundException {
		setPreferredSize(new Dimension(700,700));
		game.setDefaultPlayers(); // REMOVE LATER
		add(endPanel,JPanel.CENTER_ALIGNMENT);
		endPanel.setVisible(false);
		addKeyListener(this);
		setFocusable(true);
	}

	public void paintComponent(Graphics page) {
		super.paintComponent(page);
		page.drawImage(game.getPlayer1().getIcon().getImage(),game.getPlayer1().getXPos(),game.getPlayer1().getYPos(),null);
		page.drawImage(game.getPlayer2().getIcon().getImage(),game.getPlayer2().getXPos(), game.getPlayer2().getYPos(), null);
		page.drawImage(game.getWallAtIndex(0).getIcon().getImage(), 0, 0, null); // n wall
		page.drawImage(game.getWallAtIndex(1).getIcon().getImage(), 0, 600, null); // s wall
		page.drawImage(game.getWallAtIndex(2).getIcon().getImage(), 0, 0, null); // w wall
		page.drawImage(game.getWallAtIndex(3).getIcon().getImage(), 600, 0, null); // e wall
		for(int i = 0; i < game.getItems().length; i++) {
			page.drawImage(game.getItemAtIndex(i).getIcon().getImage(), game.getItemAtIndex(i).getXPos(), game.getItemAtIndex(i).getYPos(), null);
		}
	}
	
	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
			keyCode = arg0.getKeyCode();
			if(keyCode == KeyEvent.VK_LEFT || keyCode == KeyEvent.VK_RIGHT) { // p2
				game.getPlayer2().setXPos(mover.getNewXPos(game.getPlayer2().getXPos()));
				System.out.println("p2 X: " + game.getPlayer2().getXPos() + "\np2 Y: " + game.getPlayer2().getYPos());
			} else if(keyCode == KeyEvent.VK_UP || keyCode == KeyEvent.VK_DOWN) { // p2
				game.getPlayer2().setYPos(mover.getNewYPos(game.getPlayer2().getYPos()));
				System.out.println("p2 X: " + game.getPlayer2().getXPos() + "\np2 Y: " + game.getPlayer2().getYPos());
			} else if(keyCode == KeyEvent.VK_A || keyCode == KeyEvent.VK_D) { // p1
				game.getPlayer1().setXPos(mover.getNewXPos(game.getPlayer1().getXPos()));
				System.out.println("p1 X: " + game.getPlayer1().getXPos() + "\np1 Y: " + game.getPlayer1().getYPos());
			} else if(keyCode == KeyEvent.VK_W || keyCode == KeyEvent.VK_S) { // p1
				game.getPlayer1().setYPos(mover.getNewYPos(game.getPlayer1().getYPos()));
				System.out.println("p1 X: " + game.getPlayer1().getXPos() + "\np1 Y: " + game.getPlayer1().getYPos());
			}
			
			for(int i = 0; i < game.getItems().length; i++) {
				if(game.getPlayer1().getXPos() == game.getItemAtIndex(i).getXPos() && game.getPlayer1().getYPos() == game.getItemAtIndex(i).getYPos()) {
					// p1
					game.getPlayer1().scorePoint();
					game.getItemAtIndex(i).collected();
				} else if(game.getPlayer2().getXPos() == game.getItemAtIndex(i).getXPos() && game.getPlayer2().getYPos() == game.getItemAtIndex(i).getYPos()) {
					// p2
					game.getPlayer2().scorePoint();
					game.getItemAtIndex(i).collected();
				}
			}
			
			if((game.getPlayer1().getScore() + game.getPlayer2().getScore()) == game.getItems().length) {
				game.setGameComplete(true);
			}
			
			if(game.getGameComplete() == true) {
				System.out.println("Done!");
				game.calcHighScore();
				System.out.println(game.getHighScore());
				endPanel.setVisible(true);
				endPanelUp = true;
				endPanel.revalidate();
			}
			
			if(keyCode == KeyEvent.VK_ENTER) {
				if(endPanelUp == true) {
					
					try {
						game.resetGame();
						System.out.println("ENTER ACCEPT");
					} catch (FileNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					endPanel.setVisible(false);
					endPanel.resetPanel();
					endPanelUp = false;
					game.setGameComplete(false);
					endPanel.revalidate();
				}
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