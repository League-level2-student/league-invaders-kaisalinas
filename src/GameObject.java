import java.awt.Graphics;

public class GameObject {
int x;
int y;
int width;
int height;

GameObject(int x, int y, int width, int height){
	this.x = x;
	this.y = y;
	this.width = width;
	this.height = height;
	
	
}
public void update() {
	x+=1;
	y-=1;
	
}
public void draw (Graphics g) {
	 g.fillRect(x, y, 480, 780);
     
	
}

}
