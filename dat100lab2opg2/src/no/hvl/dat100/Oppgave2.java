package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class Oppgave2 {
	public static void main(String args[]) {
		String brutto = showInputDialog("Skriv inn brutto lønn");
		int bruttoInntekt = Integer.parseInt(brutto);
		
		
		double trinnSkatt = 0.0;
		
		
		if (bruttoInntekt <= 164100) {
			trinnSkatt = 0.0;
		}
		else if (bruttoInntekt <= 230950) {
			trinnSkatt = 0.0093;
		}
		else if (bruttoInntekt <= 580650) {
			trinnSkatt = 0.0241;
		}
		else if (bruttoInntekt <= 934050) {
			trinnSkatt = 0.1152;
		}
		else if (bruttoInntekt > 934050) {
			trinnSkatt = 0.1452;
		}
		
		int etterSkatt = (int)(bruttoInntekt * (1 - trinnSkatt));
		
		showMessageDialog(null, "Etter skatt: " + etterSkatt);
		
	}
}
