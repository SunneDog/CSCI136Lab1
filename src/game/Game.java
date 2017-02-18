// Author: Emily Nichols, ESports Gamer
// Purpose: Manages the players, items, and high score.

package game;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.ImageIcon;

public class Game {
	public Player player1;
	public Player player2;
	private static int highScore;
	private boolean gameComplete = false;
	public Item items[] = new Item[5];
	public Wall walls[] = new Wall[4];
	private File defaultPlayers = new File("./src/resources/players/Default.txt");
	private ImageIcon sideWall = new ImageIcon("./src/resources/icons/Sidewall.png");
	private ImageIcon topWall = new ImageIcon("./src/resources/icons/Topwall.png");
	private ImageIcon botWall = new ImageIcon("./src/resources/icons/Botwall.png");
	
	// constructors
	public Game() {
		player1 = new Player();
		player2 = new Player();
		for(int i = 0; i < walls.length; i++) {
			walls[i] = new Wall();
		}
		walls[0].setXPos(0); walls[0].setYPos(0); walls[0].setIcon(topWall); // n wall
		walls[1].setXPos(0); walls[1].setYPos(700); walls[1].setIcon(botWall); // s wall
		walls[2].setXPos(0); walls[2].setYPos(0); walls[2].setIcon(sideWall); // w wall
		walls[3].setXPos(700); walls[3].setYPos(0); walls[3].setIcon(sideWall); // e wall
		
		for(int i = 0; i < items.length; i++) {
			items[i] = new Item();
			System.out.println(i);
		}
		
	}
	//
	public void setDefaultPlayers() throws FileNotFoundException {
		readFromFile(defaultPlayers);
		setDefaultPlayerCoords();
	}
	
	public void resetGame() throws FileNotFoundException {
		setDefaultPlayers();
		for(int i = 0; i < items.length; i++) {
			items[i].reset();
		}
		player1.setScore(0);
		player2.setScore(0);
		gameComplete = false;
	}
	
	public void calcHighScore() {
		if(player1.getScore() > highScore && player1.getScore() > player2.getScore()) {
			highScore = player1.getScore();
		} else if(player2.getScore() > highScore && player2.getScore() > player1.getScore()) {
			highScore = player2.getScore();
		}
	}
	// getters + setters
	public void setHighScore(int highScore) {
		this.highScore = highScore;
	}
	public static int getHighScore() {
		return highScore;
	}
	public Player getPlayer1() {
		return player1;
	}
	public Player getPlayer2() {
		return player2;
	}
	public Wall getWallAtIndex(int i) {
		return walls[i];
	}
	public Item getItemAtIndex(int i) {
		return items[i];
	}
	public Item[] getItems() {
		return items;
	}
	public boolean getGameComplete() {
		return gameComplete;
	}
	public void setGameComplete(boolean gameComplete) {
		this.gameComplete = gameComplete;
	}
	//

	public void readFromFile(File file) throws FileNotFoundException {
		Scanner fileScanner = new Scanner(file);
		fileScanner.useDelimiter(",");
		String name;
		ImageIcon icon;
		ImageIcon icon2;
			name = fileScanner.next();
			icon = new ImageIcon(fileScanner.next());
			player1.setName(name);
			player1.setIcon(icon);
			System.out.println(player1.toString()); // TEST
			
			name = fileScanner.next();
			icon2 = new ImageIcon(fileScanner.next());
			player2.setName(name);
			player2.setIcon(icon2);
			System.out.println(player2.toString()); // TEST
			
			setDefaultPlayerCoords();
		fileScanner.close();
	}

	private void setDefaultPlayerCoords() {
		player1.setXPos(100);
		player1.setYPos(100);
		
		player2.setXPos(550);
		player2.setYPos(100);
	}
	// toString
	public String toString() {
		return "<html><body><p>Player 1: " + player1.getName() + "</p><br>"
				+ "<p>Player 2: " + player2.getName() + "</p><br>"
				+ "<p>High Score: " + highScore + "</p></body></html>";
	}
}
