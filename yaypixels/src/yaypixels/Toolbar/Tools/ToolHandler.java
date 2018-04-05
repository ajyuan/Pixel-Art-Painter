//Tracks the current tool and mouse information and runs the appropriate methods. 

package yaypixels.Toolbar.Tools;

import java.awt.Color;

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
	private static int pixelSize = 8;
	
	private static int mouseX = -1;
	private static int mouseY = -1;
	private static int brushSize = 1;
	
	//Methods to be run when mouse is dragged/clicked -----------------
	public static void toolClicked() {
		if (currentTool == 'b') Brush.mouseClicked(mouseX, mouseY, brushSize);
		else if (currentTool == 'e') Eraser.mouseClicked(mouseX, mouseY, brushSize);
		else if (currentTool == 'i') Eyedropper.mouseClicked(mouseX, mouseY);
	}
	public static void toolDragged() {
		if (currentTool == 'b') Brush.mouseClicked(mouseX, mouseY, brushSize);
		else if (currentTool == 'e') Eraser.mouseClicked(mouseX, mouseY, brushSize);
		else if (currentTool == 'i') Eyedropper.mouseDragged(mouseX, mouseY);
	}
	
	public static Color[][] getColorArray() { return colorArray; }
	public static boolean[][]getIsPainted() { return isPainted; }
	
	public static void updateArrays(Color[][]inputColor, boolean[][]inputPainted) {
		colorArray = inputColor;
		isPainted = inputPainted;
	}
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
	
	public static int getPixelSize() {
		return pixelSize;
	}
	
	public static void setPixelSize(int i) {
		pixelSize = i;
	}
	
	public static int getBrushSize() {
		return brushSize;
	}
	
	public static void setBrushSize(int i) {
		brushSize = i;
	}
	
	public static void updateCursor(int x, int y) {
		mouseX = x;
		mouseY = y;
	}
	public static int getMouseX() {
		return mouseX;
	}
	public static int getMouseY() {
		return mouseY;
	}
}
