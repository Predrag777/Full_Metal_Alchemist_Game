package levels;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

import characters.Alchemist;

public class Level1 extends JPanel implements KeyListener, ActionListener{
	Timer t=new Timer(100, this);
	int speed, enemySpeed;
	int x,y;
	int holdX, holdY;
	int side=1;//This will determined on which side player moves
	
	
	int changeMove=1;
	
	Alchemist mainCharacter;
	
	
	
	public Level1() throws IOException {
		t.start();
		setSize(1000,1000);
		setVisible(true);
		addKeyListener(this);
		setFocusable(true);
		setFocusTraversalKeysEnabled(false);
		this.holdX=this.holdY=0;
		
		this.x=100;this.y=700;
		
		this.mainCharacter=new Alchemist("Edward","stateAlchemist",100.0f,100);
		this.speed=15;
		this.enemySpeed=15;
	}
	
	/////////////////////////////////////////////////////////////
	
	
	public void right() {
		holdX=speed*side;
		changeMove++;
		
	}
	
	public void left() {
		holdX=-speed*side;
		changeMove++;
	}
	
	
	////////////////////////////////////////////////////////////
	
	public void drawArea(Graphics g) throws IOException {
		BufferedImage image;
		BufferedImage img=ImageIO.read(new File("SS/stage1.jpg"));
		Dimension size = new Dimension(img.getWidth(null), img.getHeight(null));
	    setPreferredSize(size);
	    setMinimumSize(size);
	    setMaximumSize(size);
	    g.drawImage(img,0,0,1400,1000,null);
	    
	    
	    
	    
	}
	
	
	public void game(Graphics g) throws IOException {
		String filePath="Edward/edwardelricBase.png";
		if(changeMove%2==0)
		    filePath="Edward/edwardelricBase2.png";
	    BufferedImage player1=ImageIO.read(new File(filePath));
	    
	    g.drawImage(player1, x, y, 200*side, 200, null);
	}

	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		repaint();
		System.out.println(holdX);
		x+=holdX;
		try {
			drawArea(g);
			game(g);
			
			
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		int code=e.getKeyCode();
		if(code==KeyEvent.VK_RIGHT) {
			right();
		}
		if(code==KeyEvent.VK_LEFT) {
			left();
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		holdX=0;
	}


}
