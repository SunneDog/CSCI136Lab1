// Author: Emily Nichols, ESports Gamer
// Purpose: Manages the players, items, and high score.

package game;

public class Game {
	public Player player1;
	public Player player2;
	private static int highScore;
	public Item items[];
	public Wall walls[] = new Wall[4];
	
	// constructors
	public Game() {
		walls[0].setXPos(0); walls[0].setYPos(0); // n wall
		walls[1].setXPos(0); walls[1].setYPos(700); // s wall
		walls[2].setXPos(0); walls[2].setYPos(0); // w wall
	}
	//
	
	// getters + setters
	public void setHighScore(int highScore) {
		this.highScore = highScore;
	}
	public int getHighScore() {
		return highScore;
	}
	
	public String toString() {
		return "<html><body><p>Player 1: " + player1.getName() + "</p><br>"
				+ "<p>Player 2: " + player2.getName() + "</p><br>"
				+ "<p>High Score: " + highScore + "</p></body></html>";
	}
}
