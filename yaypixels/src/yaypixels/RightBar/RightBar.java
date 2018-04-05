package yaypixels.RightBar;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JPanel;

public class RightBar extends JPanel{
	
	public static final int width = 220;
	RightBarPanels panels = new RightBarPanels();
	
	public RightBar() {
		setBackground(new Color(30,30,30));
		setLayout(new BorderLayout());
		setFocusable(false);
		add(panels, BorderLayout.NORTH);
	}
}
