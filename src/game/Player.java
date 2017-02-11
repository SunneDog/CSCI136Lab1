// Author: Emily Nichols, Player of Games
// Purpose: Contains all the information about the player, their
// 		poisition, and their score. It also has an instance of
// 		Movement to manage motion on a player basis.
package game;

import javax.swing.ImageIcon;

public class Player {
	private String name;
	private ImageIcon icon;
	private int score;
	private int xPos;
	private int yPos;
	private Movement mover;
	
	// constructor
	public Player(String name, ImageIcon icon, int xPos, int yPos) {
		this.name = name;
		this.icon = icon;
		this.xPos = xPos;
		this.yPos = yPos;
	}
	
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
}
