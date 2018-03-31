package yaypixels.Toolbar;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JPanel;
import yaypixels.Window;

public class Toolbar extends JPanel{
	
	public Toolbar(){
		setSize(60,Window.frameHeight);
		setBackground(new Color(40,40,40));
		setLayout(new BorderLayout());
		setFocusable(false);
		
		ButtonPanel Buttons = new ButtonPanel();
		
		add(Buttons, BorderLayout.NORTH);
	}
}
