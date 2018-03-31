package yaypixels;

import java.awt.Color;

import javax.swing.JFrame;

public class Window extends JFrame{
	
	public static final int frameWidth = 1500;
	public static final int frameHeight = 900;
	
	public static void main(String [] args) {
		new Window();
	}
	Window() {
		super("YayPixels");
		guiInitialize();
	}
	private void guiInitialize() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBackground(new Color(40,40,40));
		setSize(frameWidth, frameHeight);
		add(new Layout());
		setFocusable(false);
		setVisible(true);
	}
}
