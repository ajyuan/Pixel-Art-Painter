package yaypixels.Toolbar.Tools;

import java.awt.Color;
import java.awt.event.MouseEvent;

public class Brush extends Tool{

	static Color[][] MDColor(MouseEvent e, Color[][] colorArray, boolean[][] isPainted) {
		update(colorArray, isPainted);
		return null;
	}

	
	static Color[][] MDisPainted(MouseEvent e, Color[][] colorArray, boolean[][] isPainted) {
		update(colorArray, isPainted);
		return null;
	}

	static Color[][] MCColor(MouseEvent e, Color[][] colorArray, boolean[][] isPainted) {
		update(colorArray, isPainted);
		return null;
	}

	static Color[][] MCisPainted(MouseEvent e, Color[][] colorArray, boolean[][] isPainted) {
		update(colorArray, isPainted);
		return null;
	}

}
