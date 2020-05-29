import java.awt.Color;
import java.awt.Graphics;

public class Alien extends GameObject {

	Alien(int x, int y, int width, int height, int speed) {
		super(x, y, width, height, speed, true);

		// TODO Auto-generated constructor stub
	}

	public void update() {
		y += speed;
	}

	public void draw(Graphics g) {
		g.setColor(Color.YELLOW);
		g.fillRect(x, y, width, height);
	}
}
