package chap1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// Task/Function: Message should change color when button is clicked
// Class is implementing 2 interfaces

public class JavaHello3 {

	public static void main(String[] args) {
		JFrame frame = new JFrame("HelloJava3");
		frame.getContentPane().add(new HelloComponent3("Hello, Java"));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setSize(300, 300);
		frame.setVisible(true);

	}

}

class HelloComponent3 extends JComponent implements MouseMotionListener, ActionListener
{
	String theMessage;
	int messageX = 125, messageY = 95;
	
	JButton theButton;
	
	int colorIndex;		// Current index into some colors;
	static Color[] someColors = {
			Color.black, Color.red, Color.green, Color.green, Color.magenta
	};
	
	// Class Constructor HelloCompnent3
	public HelloComponent3(String message) {
		theMessage = message;
		theButton = new JButton("Change Color");
		setLayout (new FlowLayout());
		add( theButton );
		theButton.addActionListener(this);
		addMouseMotionListener(this);
	}
	public void paintComponent(Graphics g) {
		g.drawString(theMessage, messageX, messageY);
	}
	public void mouseDragged(MouseEvent e) {
		messageX = e.getX();
		messageY = e.getX();
		repaint();
	}
	public void mouseMove(MouseEvent e) {
		
	}
	public void actionPerformed(ActionEvent e) {
		// Did somebody push the button
		if(e.getSource() == theButton) {
			changeColor();
		}
		
	}
	synchronized private void changeColor() {
		// Change the index to the next color akwardly
		if (++colorIndex == someColors.length) 
			colorIndex = 0;
		
		setForeground(currentColor());		// Use the new color.
		repaint();
	}
	synchronized private Color currentColor() {
		return someColors[colorIndex];
	}
	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
