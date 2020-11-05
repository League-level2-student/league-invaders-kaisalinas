
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
}
void update(){
	
}
void draw() {
	
}
void purgeObjects() {
	
}
}