import java.awt.Dimension;
import java.awt.event.ActionListener;

import javax.swing.JFrame;


public class LeagueInvaders {
	JFrame frame;
	final int x = 500;
	final int y = 800;
	GamePanel gPane;
	public static void main(String[] args) {
	LeagueInvaders invader = new LeagueInvaders();

		
}

	
	
	void setup() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(gPane);
		frame.getContentPane().setPreferredSize(new Dimension(x, y));
        frame.pack();
       
	gPane.startGame();
	}
	
	LeagueInvaders(){
	frame = new JFrame();
	gPane = new GamePanel();
	frame.setVisible(true);
	setup();	
	}
	}


	