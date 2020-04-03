import java.awt.Color;
import java.awt.Graphics;

public class RocketShip extends GameObject{
RocketShip(int x, int y, int width, int height, int speed, boolean isActive){
	super(x, y, width, height, speed, isActive);
	speed = 10;
	
}
public void draw(Graphics g) {
    g.setColor(Color.BLUE);
    g.fillRect(x, y, width, height);

}
public void up() {
	x+=speed;
}
public void right() {
	x+=speed;
}
public void left() {
	x+=speed;
}
public void down() {
	x+=speed;
}
}
