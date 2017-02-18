// Author: Emily Nichols, Vendor of Precious Items
// Purpose: Contains the x and y coords and icon of an item.
package game;

import java.util.Random;

import javax.swing.ImageIcon;

public class Item {
	private int xPos;
	private int yPos;
	private static ImageIcon icon = new ImageIcon("./src/resources/icons/Item.png");
	
	// constructor
	public Item(int xPos, int yPos) {
		this.xPos = xPos;
		this.yPos = yPos;
	}
	public Item() {
		calcRandomCoords();
	}
	//
	
	public void collected() {
		this.xPos = 800;
		this.yPos = 800;
	}
	
	public void reset() {
		calcRandomCoords();
	}
	
	private void calcRandomCoords() {
		int random;
		Random coordRand = new Random(); // 8 potentials
		random = coordRand.nextInt(9) + 1;
		System.out.println(random);
		xPos = checkRandom(random);
		System.out.println("Item x: " + xPos);
		
		random = coordRand.nextInt(8) + 1;
		System.out.println(random);
		yPos = checkRandom(random);
		System.out.println("Item y: " + yPos);
	}

	private int checkRandom(int random) {
		int pos = 150;
		if(random == 1) {
			pos = 150;
		} else if(random == 2) {
			pos = 200;
		} else if(random == 3) {
			pos = 250;
		} else if(random == 4) {
			pos = 300;
		} else if(random == 5) {
			pos = 350;
		} else if(random == 6) {
			pos = 400;
		} else if(random == 7) {
			pos = 450;
		} else if(random == 8) {
			pos = 500;
		} else if(random == 9) {
			pos = 550;
		}
		return pos;
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
	
	// toString()
	public String toString() {
		return "X: " + xPos + "\nY: " + yPos;
	}
}
