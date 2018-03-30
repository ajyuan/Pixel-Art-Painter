package yaypixels.Toolbar.Tools;

public class Eraser {
	
	static void mouseClicked(int ax, int ay) {
		ToolHandler.getIsPainted()[ax][ay] = false;
	}
	
}
