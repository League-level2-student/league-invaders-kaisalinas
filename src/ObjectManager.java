
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

public class ObjectManager implements ActionListener {
	private static final String Graphics = null;
	RocketShip r;
	ArrayList<Projectile> bullets;
	ArrayList<Alien> aliens;
	Random random = new Random();

	ObjectManager(RocketShip r) {
		this.r = r;
		bullets = new ArrayList<Projectile>();
		aliens = new ArrayList<Alien>();
	}

	void addAlien() {
		aliens.add(new Alien(random.nextInt(LeagueInvaders.WIDTH), 0, 50, 50, 5));
		update();
	}

	void update() {

		for (int i = 0; i < aliens.size(); i++) {
			if (aliens.get(i).y > LeagueInvaders.HEIGHT) {
			aliens.get(i).isActive = false;
			}
			aliens.get(i).update();
			}
		for (int i = 0; i < bullets.size(); i++) {
			if (bullets.get(i).y > LeagueInvaders.HEIGHT) {
				bullets.get(i).isActive = false;
			}
			bullets.get(i).update();
		}
		checkCollision();
		purgeObjects();
		}

	void draw(Graphics g) {
		for (int i = 0; i < aliens.size(); i++) {
			aliens.get(i).draw(g);
		}
		for (int i = 0; i < bullets.size(); i++) {
			bullets.get(i).draw(g);
		}
	}

	void purgeObjects() {
		for (int i = 0; i < aliens.size(); i++) {
			if (aliens.get(i).isActive == false) {
				aliens.remove(i);
			}
		}
	}

	private void get(ArrayList<Alien> aliens2) {
		// TODO Auto-generated method stub

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		addAlien();
	}

	void addProjectiles(Projectile p) {
		bullets.add(p);

	}
  void checkCollision() {
		for (int i = 0; i < aliens.size(); i++) {
			if (r.collisionBox.intersects(aliens.get(i).collisionBox)){
		    aliens.get(i).isActive = false;
		    r.isActive = false;
			}

		}
		
	}
			
}
