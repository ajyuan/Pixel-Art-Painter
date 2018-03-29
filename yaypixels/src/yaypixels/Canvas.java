package yaypixels;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JPanel;

public class Canvas extends JPanel implements MouseListener, MouseMotionListener {
	int pixelSize = 8;
	private int mouseX = -1;
	private int mouseY = -1;
	Color dPColor1 = new Color(220, 220, 220);
	Color dPColor2 = new Color(180, 180, 180);
	Color mouseOverColor = new Color(120, 120, 120);
	Color currentColor = Color.BLACK;

	private Color[][] colorArray; // tracks current color of each pixel
	private boolean[][] isPainted;

	Canvas() {
		setBackground(new Color (40,40,40));
		colorArray = new Color[Window.frameWidth / pixelSize][Window.frameHeight / pixelSize];
		isPainted = new boolean[Window.frameWidth / pixelSize][Window.frameHeight / pixelSize];
		addMouseListener(this);
		addMouseMotionListener(this);
	}

	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		for (int k = 0; k < this.getHeight() - (this.getHeight() % pixelSize); k += pixelSize) {
			for (int i = 0; i < this.getWidth() - (this.getWidth() % pixelSize); i += pixelSize) {
				int ip = i / pixelSize;
				int kp = k / pixelSize;
				colorAssigner(ip, kp);
				g.setColor(colorArray[ip][kp]);
				if (ip == mouseX && kp == mouseY)
					g.setColor(mouseOverColor);
				g.fillRect(i, k, pixelSize, pixelSize);
			}
		}
	}

	private void colorAssigner(int i, int k) {
		if (!isPainted[i][k])
			defaultColorAssigner(i, k);
	}

	private void defaultColorAssigner(int i, int k) {
		if ((i + k) % 2 == 0)
			colorArray[i][k] = dPColor1;
		else
			colorArray[i][k] = dPColor2;
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		Point p = e.getPoint();
		if (p.x >= 0 && p.y >= 0) {
			mouseX = p.x / pixelSize;
			mouseY = p.y / pixelSize;
			this.setToolTipText(mouseX + "," + mouseY);
			isPainted[p.x / pixelSize][p.y / pixelSize] = true;
			colorArray[p.x / pixelSize][p.y / pixelSize] = currentColor;
			repaint();
		}
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		Point p = e.getPoint();
		if (p.x >= 0 && p.y >= 0) {
			mouseX = p.x / pixelSize;
			mouseY = p.y / pixelSize;
			this.setToolTipText(mouseX + "," + mouseY);
			repaint();
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		Point p = e.getPoint();
		if (p.x >= 0 && p.y >= 0) {
			isPainted[p.x / pixelSize][p.y / pixelSize] = true;
			colorArray[p.x / pixelSize][p.y / pixelSize] = currentColor;
			repaint();
		}
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}
}
