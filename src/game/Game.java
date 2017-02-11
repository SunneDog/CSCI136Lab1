// Author: Emily Nichols, ESports Gamer
// Purpose: Manages the players, items, and high score.

package game;

public class Game {
	Player player1;
	Player player2;
	private static int highScore;
	Item items[];
	
	// getters + setters
	public void setHighScore(int highScore) {
		this.highScore = highScore;
	}
	public int getHighScore() {
		return highScore;
	}
}
