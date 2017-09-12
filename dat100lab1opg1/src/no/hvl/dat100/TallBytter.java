package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class TallBytter {
	public static void main(String[] args) {
		String x = showInputDialog("Skriv in x");
		String y = showInputDialog("Skriv in y");
		String z = showInputDialog("Skriv in z");
		int tallx = Integer.parseInt(x);
		int tally = Integer.parseInt(y);
		int tallz = Integer.parseInt(z);
		
		int tmp = tally;
		tally = tallx;
		tallx = tallz;
		tallz = tmp;
		
		showMessageDialog(null, "x: " + tallx + ", y: " + tally + ", z: " + tallz);
	}
}
