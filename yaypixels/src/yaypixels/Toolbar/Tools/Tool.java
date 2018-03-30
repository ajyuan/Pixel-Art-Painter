//Guide for methods that each tool much implement

package yaypixels.Toolbar.Tools;

import java.awt.Color;
import java.awt.event.MouseEvent;

public abstract class Tool {
	Color[][]colorArray;
	boolean[][]isPainted;
	void update(Color[][]inputColor, boolean[][]inputPainted) {
		colorArray = inputColor;
		isPainted = inputPainted;
	}
	abstract Color[][]MDColor(MouseEvent e, Color [][] colorArray, boolean [][] isPainted);
	abstract Color[][]MDisPainted(MouseEvent e, Color [][] colorArray, boolean [][] isPainted);
	abstract Color[][]MCColor(MouseEvent e, Color [][] colorArray, boolean [][] isPainted);
	abstract Color[][]MCisPainted(MouseEvent e, Color [][] colorArray, boolean [][] isPainted);
}
	
