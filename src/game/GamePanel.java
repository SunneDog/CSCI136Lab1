// Author: Emily Nichols, Panel Aficionado
// Purpose: The main panel of the program, does all the displaying
// 		of information.

package game;

import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

public class GamePanel extends JPanel implements KeyListener {
	public GamePanel() {
		setPreferredSize(new Dimension(700,700));
		addKeyListener(this);
		setFocusable(true);
	}

	
	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}