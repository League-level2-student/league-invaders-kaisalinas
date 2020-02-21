import javax.swing.JFrame;

public class LeagueInvaders {
	JFrame frame;
	GamePanel gPanel;
	public static final int WIDTH = 500;
	public static final int HEIGHT = 800;
public static void main(String[] args) {
	LeagueInvaders invader = new LeagueInvaders();
	invader.setup();
	
}
LeagueInvaders(){
	frame = new JFrame();
	gPanel = new GamePanel();
}
public void setup() {
	
frame.setVisible(true);
frame.setSize(WIDTH , HEIGHT);
frame.add(gPanel);
 	





	
}





}
