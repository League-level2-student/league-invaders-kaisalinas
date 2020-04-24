import java.awt.Color;
import java.awt.Graphics;

public class Alien extends GameObject {

	Alien(int x, int y, int width, int height, int speed, boolean isActive) {
		super(x, y, width, height, speed, isActive);
		speed = 1;

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
