package yaypixels.Toolbar;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

import yaypixels.Window;

public class Toolbar extends JPanel{
	
	public Toolbar(){
		setSize(60,Window.frameHeight);
		setBackground(new Color(40,40,40));
		setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		
		c.gridx = 0;
		c.gridy = 0;
		add(new ButtonPanel(), c);
	}
}
