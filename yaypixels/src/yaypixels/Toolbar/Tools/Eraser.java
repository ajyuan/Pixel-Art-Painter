package yaypixels.Toolbar.Tools;

public class Eraser {
	
	static void mouseClicked(int ax, int ay, int brushSize) {
		for(int i = ax;i > ax - brushSize; i--) {
			for (int k = ay; k > ay-brushSize; k--) {
				ToolHandler.getIsPainted()[i][k] = false; 
			}
		}
	}
	
}
