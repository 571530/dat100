package no.hvl.dat100;

import static javax.swing.JOptionPane.showInputDialog;

public class Oppgave3a {
	public static void main(String[] args) {
		int antallOrd = Integer.parseInt(showInputDialog("Skriv inn antall ord"));		
		
		String[] ordTab = new String[antallOrd];
		
		for (int i = 0; i < antallOrd; i++) {
			ordTab[i] = showInputDialog("Skriv inn ord nr " + (i + 1));
			
		}
		
		for (int i = 0; i < antallOrd; i++) {
			System.out.println(i + ". " + ordTab[i]);
		}
				
	}
}
