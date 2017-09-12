package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class TidsUtregner {
	public static void main(String[] args) {
		String sekunderITekst = showInputDialog("Tid i sekunder");
		int sekunderTotal = Integer.parseInt(sekunderITekst);
		
		int timer = sekunderTotal / 3600;
		int minutter = (sekunderTotal % 3600) / 60;
		int sekunder = (sekunderTotal % 3600) % 60;
		
		showMessageDialog(null, "Timer: " + timer + " minutter: " + minutter + " sekunder: " + sekunder);
	}
}
