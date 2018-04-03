package yaypixels.RightBar;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JPanel;
import yaypixels.RightBar.Panels.ColorSwatches;
import yaypixels.RightBar.Panels.Settings;

public class RightBarPanels extends JPanel{
	ColorSwatches ColorPanel = new ColorSwatches();
	Settings SettingsPanel = new Settings();
	public RightBarPanels() {
		setBackground(new Color(30,30,30));
		setLayout(new GridLayout(8,1));
		setFocusable(false);
		
		SettingsPanel.setPreferredSize(new Dimension(RightBar.width, 30));
		ColorPanel.setPreferredSize(new Dimension(RightBar.width, 200));
		
		add(SettingsPanel);
		add(ColorPanel);
	}
}
