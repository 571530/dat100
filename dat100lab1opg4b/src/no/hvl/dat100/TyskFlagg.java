package no.hvl.dat100;

import easygraphics.EasyGraphics;

public class TyskFlagg extends EasyGraphics {
	
	public static void main(String args[]) {
		launch(args);
	}

	public void run() {
		makeWindow("Det tyske flagget", 800, 600);
		setColor(0, 0, 0);
		fillRectangle(0, 0, 800, 200);
		setColor(255, 0, 0);
		fillRectangle(0, 200, 800, 200);
		setColor(255, 215, 0);
		fillRectangle(0, 400, 800, 200);
	}
}
