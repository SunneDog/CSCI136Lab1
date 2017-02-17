// Author: Emily Nichols, The Wall Sentinel
// Purpose: Contains the position of a wall, as well as the image
//		used. 
package game;

import javax.swing.ImageIcon;

public class Wall {
	private int xPos;
	private int yPos;
	private ImageIcon icon;
	
	// constructor
	public Wall(int xPos, int yPos, ImageIcon icon) {
		this.xPos = xPos;
		this.yPos = yPos;
		this.icon = icon;
	}
	public Wall() {
		
	}
	// getters + setters
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
	
	public void setIcon(ImageIcon icon) {
		this.icon = icon;
	}
	public ImageIcon getIcon() {
		return icon;
	}
}
