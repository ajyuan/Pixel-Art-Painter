//A class for transfering info between canvas and UI components

package yaypixels.Toolbar.Tools;

import java.awt.Color;
import java.awt.Point;
import java.awt.event.MouseEvent;

public class ToolHandler {
	/* Tracks current tool
	 * b = brush
	 * e = eraser
	 * f = fill
	 * i = color grabber
	 */
	private static char currentTool = 'b';
	private static Color currentColor = Color.BLACK;
	private static Color[][]colorArray;
	private static boolean[][]isPainted;
	
	//Methods to be run when mouse is dragged/clicked -----------------
	public static void toolClicked(int x, int y) {
		if (currentTool == 'b') Brush.mouseClicked(x, y);
		else if (currentTool == 'e') Eraser.mouseClicked(x, y);
	}
	public static void toolDragged(int x, int y) {
		if (currentTool == 'b') Brush.mouseClicked(x, y);
		else if (currentTool == 'e') Eraser.mouseClicked(x, y);
	}
	
	public static Color[][] getColorArray() { return colorArray; }
	public static boolean[][]getIsPainted() { return isPainted; }
	// ---------------------------------------------------------------
	
	public static void setTool(char tool) {
		currentTool = tool;
	}
	public static char getTool() {
		return currentTool;
	}
	
	public static void setCurrentColor(Color input) {
		currentColor = input;
	}
	
	public static Color getCurrentColor() {
		return currentColor;
	}	
	
	public static void update(Color[][]inputColor, boolean[][]inputPainted) {
		colorArray = inputColor;
		isPainted = inputPainted;
	}
}
