
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Random;

public class ObjectManager {
RocketShip r;
ArrayList<Projectile> bullets;
ArrayList<Alien> aliens;
Alien a;
Random random = new Random();
ObjectManager(RocketShip r){
	this.r = r;
	bullets = new ArrayList<Projectile>();
	aliens = new ArrayList<Alien>();
}
void addAlien(){
	aliens.add(new Alien(random.nextInt(LeagueInvaders.WIDTH),0,50,50,5));
	update();
}
void update(){

	for(int i=0; i<=aliens.size(); i++)
	if(LeagueInvaders.HEIGHT>800) {
}
	}
void draw() {

}

	
void purgeObjects() {
	
}
}