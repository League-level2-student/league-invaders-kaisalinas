

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener, KeyListener{
Timer time;
final int MENU_STATE = 0;
final int GAME_STATE = 1;
final int END_STATE = 2;
int currentState = MENU_STATE;
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	repaint();
	update(null);
	


}

GamePanel(){
	time = new Timer(1000/60, (ActionListener) this);

}
public void startGame() {
	time.start();

}
@Override

public void paintComponent(Graphics g){

}

@Override
public void keyTyped(KeyEvent e) {
	// TODO Auto-generated method stub
	System.out.println("y");
}
@Override
public void keyPressed(KeyEvent e) {
	// TODO Auto-generated method stub
	System.out.println("y");
}
@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
System.out.println("y");	
}
public void updateMenuState() {
	
}
public void updateGameState() {
	
}
public void updateEndState() {
	
}
public void drawMenuState(Graphics g) {
	
}
public void drawGameState(Graphics g) {
	
}
public void drawEndState(Graphics g) {
	
	
}
}