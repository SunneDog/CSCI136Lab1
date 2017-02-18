// Author: Emily Nichols, Mover of Players
// Purpose: this class controls the movement of players.
package game;

import java.awt.event.KeyEvent;

public class Movement  {
	private int newXPos;
	private int newYPos;
	private final int DIST = 50; // distance player moves per call of method.
	// constructor
	public Movement() {
		 
	}
	
	
	public int getNewXPos(int xPos) {
		calcNewXPos(xPos);
		return newXPos;
	}
	private void calcNewXPos(int xPos) {
		if(GamePanel.getKeyCode() == KeyEvent.VK_RIGHT || GamePanel.getKeyCode() == KeyEvent.VK_D) {
			if(xPos == 550) {
				// stops them from leaving the screen
				newXPos = xPos;
				} else {
					newXPos = xPos += DIST;
					System.out.println("Player moved right!");
				}
		} else if(GamePanel.getKeyCode() == KeyEvent.VK_LEFT || GamePanel.getKeyCode() == KeyEvent.VK_A) {
			if(xPos == 100) {
				// stops them from leaving the screen
				newXPos = xPos;
				} else {
					newXPos = xPos -= DIST;
					System.out.println("Player moved left!");
				}
		}
	}
	public int getNewYPos(int yPos) {
		calcNewYPos(yPos);
		return newYPos;
	}
	private void calcNewYPos(int yPos) {
		if(GamePanel.getKeyCode() == KeyEvent.VK_UP || GamePanel.getKeyCode() == KeyEvent.VK_W) {
			if(yPos == 100) {
			// stops them from leaving the screen	
				newYPos = yPos;
			} else {
				newYPos = yPos -= DIST;
				System.out.println("Player moved up!");
			}
		} else if(GamePanel.getKeyCode() == KeyEvent.VK_DOWN || GamePanel.getKeyCode() == KeyEvent.VK_S) {
			if(yPos == 550) {
				// stops them from leaving the screen
				newYPos = yPos;
				} else {
					newYPos = yPos += DIST;
					System.out.println("Player moved down");
				}
		}
	}
}
