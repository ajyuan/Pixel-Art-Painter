package yaypixels.Toolbar.Tools;

public class Brush{

	//Code is equivalent to mouse dragged
	static void mouseClicked(int ax, int ay) {
		ToolHandler.getColorArray()[ax][ay] = ToolHandler.getCurrentColor();
		ToolHandler.getIsPainted()[ax][ay] = true; 
	}
}
