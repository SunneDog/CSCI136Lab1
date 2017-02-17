// Author: Emily Nichols, Player of Games
// Purpose: Contains all the information about the player, their
// 		poisition, and their score. It also has an instance of
// 		Movement to manage motion on a player basis.
//		Can read in its attributes from a file
package game;

import javax.swing.ImageIcon;

public class Player {
	private String name;
	private ImageIcon icon;
	private int score;
	private int xPos = 0;
	private int yPos = 0;
	private Movement mover;
	
	// constructors
	public Player(String name, ImageIcon icon, int xPos, int yPos) {
		this.name = name;
		this.icon = icon;
		this.xPos = xPos;
		this.yPos = yPos;
	}
	public Player() {
		
	}
	// 
		
/*	public void move() {
		xPos = mover.getNewXPos(xPos);
		yPos = mover.getNewYPos(yPos);
	} */
	
	// getters + setters
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void setIcon(ImageIcon icon) {
		this.icon = icon;
	}
	public ImageIcon getIcon() {
		return icon;
	}
	
	public void setScore(int score) {
		this.score = score;
	}
	public int getScore() {
		return score;
	}
	public void setXPos(int xPos) {
		this.xPos = xPos;
	}
	public int getXPos() {
		return xPos;
	}
	
	public void setYPos(int yPos) {
		this.yPos = yPos;
	}
	public int getYPos() {
		return yPos;
	}

	// toString
	public String toString() {
		return "Name: " + name + "\nScore: " + score;
	}
}
