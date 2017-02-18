package game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class EndPanel extends JPanel {
	JButton yes;
	JButton no;
	JLabel resetLabel;
	JLabel highScoreLabel;

	public EndPanel() throws FileNotFoundException {
		// TODO Auto-generated constructor stub
		resetLabel = new JLabel("Would you like to see the high score?",10);
		highScoreLabel = new JLabel();
		yes = new JButton("Yes");
		//no = new JButton("No");
		
		setFocusable(true);
		add(highScoreLabel);
		add(resetLabel);
		add(yes);
		yes.addActionListener(new buttonListener());
		// add(no);
	}
	
	public class buttonListener implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			if(arg0.getSource().equals(yes)) {
				highScoreLabel.setText("High Score!: " + Game.getHighScore() + "");
				System.out.println("BUTTON PUSH");
				resetLabel.setText("Press enter to play again!");
				yes.setEnabled(false);
			}
			
		}
	}
	public void resetPanel() {
		resetLabel.setText("Would you like to play again?");
		yes.setEnabled(true);
	}
	
}
