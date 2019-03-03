package chap1;

import javax.swing.*;
import java.awt.*;

public class JavaHello {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Hello, Java");
		//JLabel label = new JLabel("Hello, Java", JLabel.CENTER);
		frame.getContentPane().add(new HelloComponent());
		
		frame.setSize(300, 300);
		frame.setVisible(true);

	}

}

// Add a new HelloComponent class
class HelloComponent extends JComponent{
	public void paintComponent(Graphics g) {
		g.drawString("Hello, Java", 125, 95);
	}
}
