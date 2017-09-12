package no.hvl.dat100;

import static javax.swing.JOptionPane.*;


public class Dato {
	public static void main(String[] args) {
		String dag = showInputDialog("Dag i tall?");
		String maned = showInputDialog("Måned i tall?");
		String aar = showInputDialog("år i tall");
		
		showMessageDialog(null, dag + "." + maned + "." + aar);
	}
}
