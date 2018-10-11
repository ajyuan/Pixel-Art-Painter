//Gets color of selected pixel

package yaypixels.Toolbar.Tools; 

public class Eyedropper implements ToolInterface{
	static void mouseClicked(int ax, int ay) {
		if (ToolHandler.getIsPainted()[ax][ay])
		ToolHandler.setCurrentColor(ToolHandler.getColorArray()[ax][ay]);
	}
	static void mouseDragged(int ax, int ay) {
		if (ToolHandler.getIsPainted()[ax][ay])
		ToolHandler.setCurrentColor(ToolHandler.getColorArray()[ax][ay]);
	}
}
