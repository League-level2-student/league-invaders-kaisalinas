
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Random;

public class ObjectManager {
private static final String Graphics = null;
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
void draw(Graphics g) {
for(int i=0; i<aliens.size(); i++) {
Rocketship(g);
}
}

	
private void Rocketship(java.awt.Graphics g) {
	// TODO Auto-generated method stub
	RocketShip ship = new RocketShip(200, 700, 50, 50, 5, true);
}
void purgeObjects() {
for(int i=0; i<aliens.size();i++) {
	get(aliens);
	
}
}
private void get(ArrayList<Alien> aliens2) {
	// TODO Auto-generated method stub
	
}

}
