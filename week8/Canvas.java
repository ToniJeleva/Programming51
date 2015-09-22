package week8;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.LinkedList;
import java.util.Random;
import java.util.Stack;

import javax.swing.JPanel;

public class Canvas2 extends JPanel implements MouseListener {

  public static final int WIDTH = 800;
  public static final int HEIGHT = 800;
  public int x[]=new int[3];
  public int y[]=new int[3];


  public Canvas2() {
    // very important here - addMouseListener(this)
    setPreferredSize(new Dimension(WIDTH, HEIGHT));
    addMouseListener(this);
    setBackground(Color.WHITE);
  }
  
  public LinkedList<Polygon>polygons=new LinkedList<>();
  
  public void paintComponent(Graphics g) {
	  if(i==3){
    super.paintComponent(g);
     Graphics2D g2 = (Graphics2D) g;
    //Polygon a=new Polygon(x, y, 3);
     polygons.add(new Polygon(x, y, 3));
     for (int i = 0; i < polygons.size(); i++) {
    	 Random rand = new Random();

    	    int k = rand.nextInt((250 - 1) + 1) + 1;
    	    int l = rand.nextInt((250 - 1) + 1) + 1;
    	    int m = rand.nextInt((250 - 1) + 1) + 1;

    	 g2.setColor(new Color(k, l, m));
    	 g2.fill(polygons.get(i));
		}
    
    i=0;
	  }

    // magic happens here  
  }
  
   
  public static int i=0;

  @Override
  public void mouseClicked(MouseEvent e) {
      x[i]=e.getX();
	  y[i]=e.getY();
	  ++i;
	  	 	  	  
    repaint();
  }


  
  @Override
  public void mousePressed(MouseEvent e) {
  }

  @Override
  public void mouseReleased(MouseEvent e) {
    // TODO Auto-generated method stub

  }

  @Override
  public void mouseEntered(MouseEvent e) {
    // TODO Auto-generated method stub

  }

  @Override
  public void mouseExited(MouseEvent e) {
    // TODO Auto-generated method stub

  }
}