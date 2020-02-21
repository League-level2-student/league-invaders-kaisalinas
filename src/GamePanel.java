import java.awt.Graphics;

import javax.swing.JPanel;

public class GamePanel extends JPanel{
	
	GamePanel gPanel;
	@Override
	public void paintComponent(Graphics g){
		g.fillRect(10, 10, 100, 100);
	}
}

