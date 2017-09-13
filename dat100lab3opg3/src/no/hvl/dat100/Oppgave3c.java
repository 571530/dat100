package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class Oppgave3c {
	public static void main(String[] args) {
		int antallOrd = Integer.parseInt(showInputDialog("Skriv inn antall ord"));		
		
		String[] ordTab = new String[antallOrd];

		
		
		for (int i = 0; i < antallOrd; i++) {
			ordTab[i] = showInputDialog("Skriv inn ord nr " + (i + 1));
			
		}
		
		for (int i = 0; i < antallOrd; i++) {
			int lengde = ordTab[i].length();
			String output = "";
			if (lengde % 2 == 1) { // Oddetall
				if (lengde == 1) {
					output = ordTab[i];
				}
				else {
					output = ordTab[i].substring(lengde / 2 - 1, lengde / 2 + 2);					
				}
				
			}
			
			else if (lengde % 2 == 0) { // Partall
				output = ordTab[i].substring(lengde / 2 - 1, lengde / 2 + 1);
			}
			
			System.out.println(output);
		}
	}
}
