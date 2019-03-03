package chap1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// To be able to drag Hello, Java Message around the screen

public class JavaHello2 {

	public static void main(String[] args) {
		JFrame frame = new JFrame("HelloJava2");
		frame.getContentPane().add(new HelloComponent2("Hello, Java"));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 300);
		frame.setVisible(true);
		

	}

}

class HelloComponent2 extends JComponent implements MouseMotionListener
{
	String theMessage;
	int messageX = 125, messageY = 95;		// Coordinate/Position of the message
	
	public HelloComponent2(String message) {
		theMessage = message;
		addMouseMotionListener(this);
		
	}
	public void paintComponent(Graphics g) {
		g.drawString(theMessage, messageX, messageY);
	}
	public void mouseDragged(MouseEvent e) {
		// save the mouse coordinate and paint the message
		messageX = e.getX();
		messageY = e.getY();
		repaint();
	}
	
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
