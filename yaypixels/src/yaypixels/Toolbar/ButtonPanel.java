package yaypixels.Toolbar;

import java.awt.Color;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

import yaypixels.Window;

public class ButtonPanel extends JPanel{
	private final int buttonSize = 45;
	
	ButtonPanel() {
		setSize(60,buttonSize+buttonSize/7);
		setBackground(new Color(40,40,40));
		setLayout(new GridBagLayout());
		
		
	}
}
