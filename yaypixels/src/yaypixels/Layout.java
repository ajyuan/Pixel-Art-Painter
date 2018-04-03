package yaypixels;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

import yaypixels.RightBar.RightBar;
import yaypixels.Toolbar.Toolbar;

public class Layout extends JPanel{
	public Layout() {
		setLayout(new BorderLayout());
		setBackground(new Color (40,40,40));
		setFocusable(false);
		
		Toolbar TB = new Toolbar();
		RightBar RB = new RightBar();
		
		TB.setPreferredSize(new Dimension(Toolbar.width,Window.frameHeight));
		RB.setPreferredSize(new Dimension(RightBar.width, Window.frameHeight));
		
		add(TB, BorderLayout.WEST);
		add(new Canvas(), BorderLayout.CENTER);
		add(RB, BorderLayout.EAST);
	}
}
