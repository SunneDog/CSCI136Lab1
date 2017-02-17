// Author: Emily Nichols, Unliscensed Driver
// Purpose: Contains the JFrame and main method.
package game;

import java.io.FileNotFoundException;

import javax.swing.JFrame;

public class Driver {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		JFrame gameFrame = new JFrame("My Cool Game");
		GamePanel gamePanel = new GamePanel();
		
		gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gameFrame.getContentPane().add(gamePanel);
		gameFrame.pack();
		gameFrame.setVisible(true);
	}

}
