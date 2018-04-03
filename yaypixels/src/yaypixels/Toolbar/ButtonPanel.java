package yaypixels.Toolbar;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JPanel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import yaypixels.Toolbar.Tools.ToolHandler;

public class ButtonPanel extends JPanel{
	private Color buttonColor = (new Color(30,30,30));
	
	ButtonPanel() {
		setSize(60,400);
		setBackground(new Color(30,30,30));
		setLayout(new GridLayout(8,1));
		setFocusable(false);
		
		JButton Brush = new JButton("Br");
		JButton Eraser = new JButton("Er");
		JButton Bucket = new JButton("Bu");
		JButton Eyedropper = new JButton("Ed");
		JButton ColorSelecter = new JButton("CC");
		
		Brush.setPreferredSize(new Dimension(60,60));
		Eraser.setPreferredSize(new Dimension(60,60));
		Bucket.setPreferredSize(new Dimension(60,60));
		Eyedropper.setPreferredSize(new Dimension(60,60));
		
		Brush.setToolTipText("Brush Tool");
		Eraser.setToolTipText("Eraser Tool");
		Bucket.setToolTipText("Bucket Tool");
		Eyedropper.setToolTipText("Eyedropper Tool");
		ColorSelecter.setToolTipText("Color Selecter");
		
		Brush.setBackground(buttonColor);
		Brush.setForeground(Color.WHITE);
		Eraser.setBackground(buttonColor);
		Eraser.setForeground(Color.WHITE);
		Bucket.setBackground(buttonColor);
		Bucket.setForeground(Color.WHITE);
		Eyedropper.setBackground(buttonColor);
		Eyedropper.setForeground(Color.WHITE);
		ColorSelecter.setBackground(ToolHandler.getCurrentColor());
		ColorSelecter.setForeground(Color.WHITE);
		
		add(Brush);
		add(Eraser);
		//add(Bucket);
		add(Eyedropper);
		add(ColorSelecter);
		
		Brush.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ToolHandler.setTool('b');
			}
		});
		Eraser.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ToolHandler.setTool('e');
			}
		});
		Eyedropper.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ToolHandler.setTool('i');
			}
		});
		ColorSelecter.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ToolHandler.setCurrentColor(JColorChooser.showDialog(new JColorChooser(Color.BLACK), "Select a color", new Color(40,40,40)));
				ColorSelecter.setBackground(ToolHandler.getCurrentColor());
			}
		});
	}
}
