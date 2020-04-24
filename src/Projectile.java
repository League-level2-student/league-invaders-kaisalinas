import java.awt.Color;
import java.awt.Graphics;

public class Projectile extends GameObject{

	Projectile(int x, int y, int width, int height, int speed, boolean isActive) {
		super(x, y, width, height, speed, isActive);
		speed = 10;
		// TODO Auto-generated constructor stub
	}
 public void draw(Graphics g) {
     g.setColor(Color.RED);
     g.fillRect(x, y, width, height);
 }
 public void update() {
	 y-=speed;
 }
}
