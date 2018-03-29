//A class for transfering info between canvas and UI components

package yaypixels.Toolbar;

public class DataHandler {
	/* Tracks current tool
	 * 0 = brush
	 * 1 = eraser
	 * 2 = fill
	 */
	private static char currentTool = 'b';
	
	public static void setTool(char tool) {
		currentTool = tool;
	}
	public static char getTool() {
		return currentTool;
	}
}
