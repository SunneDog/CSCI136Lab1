// Author: Emily Nichols, Mover of Players
// Purpose: this class controls the movement of players.
package game;

import java.awt.event.KeyEvent;

public class Movement  {
	private int newXPos;
	private int newYPos;
	private final int DIST = 100; // distance player moves per call of method.
	// constructor
	public Movement() {
		 
	}
	// getters + setters
	public int getNewXPos(int xPos) {
		if(GamePanel.getKeyCode() == KeyEvent.VK_RIGHT || GamePanel.getKeyCode() == KeyEvent.VK_D) {
			newXPos = xPos += DIST;
		} else if(GamePanel.getKeyCode() == KeyEvent.VK_LEFT || GamePanel.getKeyCode() == KeyEvent.VK_A) {
			newXPos = xPos -= DIST;
		}
		return newXPos;
	}
	public int getNewYPos(int yPos) {
		if(GamePanel.getKeyCode() == KeyEvent.VK_UP || GamePanel.getKeyCode() == KeyEvent.VK_W) {
			newYPos = yPos += DIST;
		} else if(GamePanel.getKeyCode() == KeyEvent.VK_DOWN || GamePanel.getKeyCode() == KeyEvent.VK_S) {
			newYPos = yPos -= DIST;
		}
		
		return newYPos;
	}
}
