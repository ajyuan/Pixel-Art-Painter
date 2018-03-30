package yaypixels.Toolbar.Tools;

import java.awt.Color;
import java.awt.Point;
import java.awt.event.MouseEvent;

public class Brush{

	//Code is equivalent to mouse dragged
	static void mouseClicked(int ax, int ay) {
		ToolHandler.getColorArray()[ax][ay] = ToolHandler.getCurrentColor();
		ToolHandler.getIsPainted()[ax][ay] = true; 
	}
}
