//A class for transfering info between canvas and UI components

package yaypixels.Toolbar.Tools;

import java.awt.Color;
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
	
	//Methods to be run when mouse is dragged/clicked
	public static Color[][] MDColor (MouseEvent e, Color [][] colorArray, boolean [][] isPainted){
		if (currentTool == 'b') return Brush.MDColor(e, colorArray, isPainted);
		return null;
	}
	
	public static boolean[][] MDisPainted (MouseEvent e, Color [][] colorArray, boolean [][] isPainted){
		if (currentTool == 'b') return Brush.MDisPainted(e,colorArray,isPainted);
		return null;
	}
	
	public static Color[][] MCColor (MouseEvent e, Color [][] colorArray, boolean [][] isPainted){
		if (currentTool == 'b') return Brush.MCColor(e,colorArray,isPainted);
		return null;
	}
	
	public static boolean[][] MCisPainted (MouseEvent e, Color [][] colorArray, boolean [][] isPainted){
		if (currentTool == 'b') return Brush.MCisPainted(e,colorArray,isPainted);
		return null;
	}
	
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
}
