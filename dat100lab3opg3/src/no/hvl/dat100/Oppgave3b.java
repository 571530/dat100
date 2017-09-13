package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class Oppgave3b {
	public static void main(String[] args) {
		int antallOrd = Integer.parseInt(showInputDialog("Skriv inn antall ord"));		
		
		String[] ordTab = new String[antallOrd];

		String monster = showInputDialog("Skriv inn mønsteret");
		
		int antMonster = 0;
		
		for (int i = 0; i < antallOrd; i++) {
			ordTab[i] = showInputDialog("Skriv inn ord nr " + (i + 1));
			
			if (ordTab[i].contains(monster)) {
				antMonster++;
			}
		}
		
		System.out.println(antMonster + " ord som inneholder mønsteret");
		
	}
}
