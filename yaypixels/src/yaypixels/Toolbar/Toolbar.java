package yaypixels.Toolbar;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JPanel;
import yaypixels.Window;

public class Toolbar extends JPanel{
	
	public static final int width = 60;
	
	public Toolbar(){
		setBackground(new Color(30,30,30));
		setLayout(new BorderLayout());
		setFocusable(false);
		
		ButtonPanel Buttons = new ButtonPanel();
		
		add(Buttons, BorderLayout.NORTH);
	}
}
