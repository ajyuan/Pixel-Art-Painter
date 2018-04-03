package yaypixels.Toolbar.Tools;

public class Brush{

	//Code is equivalent to mouse dragged
	static void mouseClicked(int ax, int ay, int brushSize) {
		for(int i = ax;i > ax - brushSize; i--) {
			for (int k = ay; k > ay-brushSize; k--) {
				ToolHandler.getColorArray()[i][k] = ToolHandler.getCurrentColor();
				ToolHandler.getIsPainted()[i][k] = true; 
			}
		}
	}
}
