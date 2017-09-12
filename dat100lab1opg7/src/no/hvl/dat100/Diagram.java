package no.hvl.dat100;

import easygraphics.EasyGraphics;
import static javax.swing.JOptionPane.*;

public class Diagram extends EasyGraphics {
	public static void main(String[] args) {
		launch(args);
	}
	
	public void run() {
		int width = 800;
		int height = 600;
		makeWindow("Soylediagram", width, height);
		
		int[] dager = new int[7];
		int hoyeste = 0;
		for (int i = 0; i < dager.length; i++) {
			dager[i] = Integer.parseInt(showInputDialog("Temperatur for " + (i + 1) + "dagen"));
			if (dager[i] > hoyeste) {
				hoyeste = dager[i];
			}
		}
		
		int soyleWidth = width / 15;
		double hoydeSkalering = (((double)height / hoyeste) * 0.8);
		
		for (int i = 0; i < dager.length; i++) {
			drawRectangle(soyleWidth * (i * 2 + 1), (height - 50) - (int)(dager[i] * hoydeSkalering), soyleWidth, (int)(dager[i] * hoydeSkalering));
			drawString("Dag nr. " + (i + 1), soyleWidth * (i * 2 + 1), (height - 35));
			drawString("" + dager[i], soyleWidth * (i * 2 + 1), height - (int)(dager[i] * hoydeSkalering) - 55);
		}
		
		
	}
}
