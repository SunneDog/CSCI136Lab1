// Author: Emily Nichols, Mover of Players
// Purpose: this class controls the movement of players.
package game;

public class Movement {
	private int newXPos;
	private int newYPos;
	private final int DIST = 100; // distance player moves per call of method.
	
	// constructor
	
	// getters + setters
	public int getNewXPos(int xPos) {
		newXPos = xPos + DIST;
		return newXPos;
	}
	public int getNewYPos(int yPos) {
		newYPos = yPos + DIST;
		return newYPos;
	}
}
