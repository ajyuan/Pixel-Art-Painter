//A panel for adjusting settings such as canvas size and cursor size

package yaypixels.RightBar.Panels;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import yaypixels.Toolbar.Tools.ToolHandler;

public class Settings extends JPanel{
	Color textColor = new Color(230,230,230);
	
	public Settings() {
		setBackground(new Color (30,30,30));
		setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		
		c.gridx = 0;
		c.gridy = 0;
		c.ipadx = 30;
		c.ipady = 20;
		JLabel PixelSizeLabel = new JLabel("Pixel Size:", SwingConstants.LEFT);
		PixelSizeLabel.setForeground(textColor);
		add(PixelSizeLabel, c);
		
		c.gridx=1;
		c.gridy=0;
		c.ipadx = 100;
		c.ipady = 20;
		JTextField PixelSizeTextField = new JTextField("8");
		PixelSizeTextField.setPreferredSize(new Dimension(100,20));
		add (PixelSizeTextField);
		
		c.gridx = 0;
		c.gridy = 1;
		c.ipadx = 30;
		c.ipady = 20;
		JLabel BrushSizeLabel = new JLabel("Brush Size:", SwingConstants.LEFT);
		BrushSizeLabel.setForeground(textColor);
		add(BrushSizeLabel, c);
		
		c.gridx = 1;
		c.gridy = 1;
		c.ipadx = 100;
		c.ipady = 20;
		JTextField BrushSizeTextField = new JTextField("1");
		//BrushSizeTextField.setPreferredSize(new Dimension(100,20));
		add(BrushSizeTextField, c);
		
		BrushSizeTextField.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				ToolHandler.setBrushSize(Integer.parseInt(BrushSizeTextField.getText()));
			}
		});
		
		PixelSizeTextField.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(Integer.parseInt(PixelSizeTextField.getText()) > 0) ToolHandler.setPixelSize(Integer.parseInt(PixelSizeTextField.getText()));
				else System.out.println("Error: Pixelsize must be > 0");
			}
		});
	}
}
