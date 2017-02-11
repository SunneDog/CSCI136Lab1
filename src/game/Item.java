// Author: Emily Nichols, Vendor of Precious Items
// Purpose: Contains the x and y coords and icon of an item.
package game;

import javax.swing.ImageIcon;

public class Item {
	private int xPos;
	private int yPos;
	private ImageIcon icon;
	
	// constructor
	public Item(int xPos, int yPos, ImageIcon icon) {
		this.xPos = xPos;
		this.yPos = yPos;
		this.icon = icon;
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
