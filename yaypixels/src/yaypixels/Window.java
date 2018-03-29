package yaypixels;

import java.awt.Color;

import javax.swing.JFrame;

public class Window extends JFrame{
	
	static final int frameWidth = 1200;
	static final int frameHeight = 900;
	
	public static void main(String [] args) {
		new Window();
	}
	Window() {
		super("YayPixels");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBackground(new Color(40,40,40));
		setSize(frameWidth, frameHeight);
		add(new Layout());
		setVisible(true);
	}
}
