package yaypixels;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JPanel;
import yaypixels.Toolbar.Tools.ToolHandler;

public class Canvas extends JPanel implements MouseListener, MouseMotionListener, KeyListener {
	private int brushSize = ToolHandler.getBrushSize();
	private int pixelSize = ToolHandler.getPixelSize();
	
	private Color dPColor1 = new Color(220, 220, 220);
	private Color dPColor2 = new Color(180, 180, 180);
	private Color mouseOverColor = new Color(120, 120, 120);

	private Color[][] colorArray; // tracks current color of each pixel
	private boolean[][] isPainted;

	Canvas() {
		setBackground(new Color(40, 40, 40));
		colorArray = new Color[Window.frameWidth / pixelSize][Window.frameHeight / pixelSize];
		isPainted = new boolean[Window.frameWidth / pixelSize][Window.frameHeight / pixelSize];
		addMouseListener(this);
		addMouseMotionListener(this);
		addKeyListener(this);
		setFocusable(true);
	}

	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		reinitialize();
		
		for (int k = 0; k < this.getHeight() - (this.getHeight() % pixelSize); k += pixelSize) {
			for (int i = 0; i < this.getWidth() - (this.getWidth() % pixelSize); i += pixelSize) {
				int ip = i / pixelSize;
				int kp = k / pixelSize;
				colorAssigner(ip, kp);
				g.setColor(colorArray[ip][kp]);
				
				//Overwrites fill with mouse cursor color if brush will affect that area
				if (ip > ToolHandler.getMouseX() - brushSize && ip <= ToolHandler.getMouseX() && kp > ToolHandler.getMouseY() - brushSize && kp <= ToolHandler.getMouseY()) {
					g.setColor(mouseOverColor);
				}
				
				//Draw the pixel after color has been determined
				g.fillRect(i, k, pixelSize, pixelSize);
			}
		}
	}
	
	 // sets pixels to default checker pattern if it isnt painted
	private void colorAssigner(int i, int k) {
		if (!isPainted[i][k])
			if ((i + k) % 2 == 0)
				colorArray[i][k] = dPColor1;
			else
				colorArray[i][k] = dPColor2;
	}

	private void updateCursor(Point p) {
		ToolHandler.updateCursor(p.x / pixelSize, p.y / pixelSize);
		this.setToolTipText(ToolHandler.getMouseX() + "," + ToolHandler.getMouseY());
	}
	
	//When draw settings are modified by RightPanel, reinitialize must be called to update canvas with new values
	private void reinitialize() {	
		if (pixelSize != ToolHandler.getPixelSize() || brushSize != ToolHandler.getBrushSize()) {
		pixelSize = ToolHandler.getPixelSize();
		brushSize = ToolHandler.getBrushSize();
		Color [][] tempC = new Color[Window.frameWidth / pixelSize][Window.frameHeight / pixelSize];
		boolean [][] tempB = new boolean[Window.frameWidth / pixelSize][Window.frameHeight / pixelSize];
		if(tempC.length < colorArray.length) {
			for(int i = 0; i < tempC.length; i++) {
				for (int k = 0; k < tempC[i].length; k++) {
					tempC[i][k] = colorArray[i][k];
					tempB[i][k] = isPainted[i][k];
				}
			}
		} else {
			for(int i = 0; i < colorArray.length; i++) {
				for (int k = 0; k < colorArray[i].length; k++) {
					tempC[i][k] = colorArray[i][k];
					tempB[i][k] = isPainted[i][k];
				}
			}
		}
		colorArray = tempC;
		isPainted = tempB;
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		Point p = e.getPoint();
		if (p.x/pixelSize - brushSize + 1 >= 0 && p.y/pixelSize - brushSize +1 >= 0) {
			ToolHandler.updateArrays(colorArray, isPainted);
			ToolHandler.toolClicked();
			colorArray = ToolHandler.getColorArray();
			isPainted = ToolHandler.getIsPainted();
			repaint();
		}
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		Point p = e.getPoint();
		if (p.x/pixelSize - brushSize + 1 >= 0 && p.y/pixelSize - brushSize +1 >= 0) {
			ToolHandler.updateArrays(colorArray, isPainted);
			ToolHandler.toolDragged();
			colorArray = ToolHandler.getColorArray();
			isPainted = ToolHandler.getIsPainted();
			updateCursor(p);
			repaint();
		}
	}
	
	// Calls methods that will fill area that mouse is over
	@Override
	public void mouseMoved(MouseEvent e) { 
		Point p = e.getPoint();
		if (p.x/pixelSize - brushSize + 1 >= 0 && p.y/pixelSize - brushSize +1 >= 0) {
			updateCursor(p);
			repaint();
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		if (e.getKeyChar() == 'b' || e.getKeyChar() == 'B')
			ToolHandler.setTool('b');
		if (e.getKeyChar() == 'e' || e.getKeyChar() == 'E')
			ToolHandler.setTool('e');
		if (e.getKeyChar() == 'f' || e.getKeyChar() == 'F')
			ToolHandler.setTool('f');
		if (e.getKeyChar() == 'i' || e.getKeyChar() == 'I')
			ToolHandler.setTool('i');
	}

	@Override
	public void mouseEntered(MouseEvent e) {
	}

	@Override
	public void mouseExited(MouseEvent e) {
	}

	@Override
	public void mousePressed(MouseEvent e) {
	}

	@Override
	public void mouseReleased(MouseEvent e) {
	}

	@Override
	public void keyPressed(KeyEvent e) {
	}

	@Override
	public void keyTyped(KeyEvent e) {
	}
}
