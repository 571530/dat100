<<<<<<< HEAD
package no.hvl.dat100;


import static javax.swing.JOptionPane.*;

public class Oppgave6 {
	public static void main(String[] args) {
		int antallStudenter = Integer.parseInt(showInputDialog(null, "Skriv inn antall studenter"));
		
		for (int i = 0; i < antallStudenter; i++) {
			boolean gyldigSvar = false;
			int svar = 0;
			char karakter;
			
			do {
				int input = Integer.parseInt(showInputDialog(null, "Skriv inn poengsummen til student nr " + (i + 1)));
				svar = input;
				gyldigSvar = (input >= 0) && (input <= 100);
				if (!gyldigSvar) {
					showMessageDialog(null, "Skriv inn en gyldig poengsum!");
				}
			} while (!gyldigSvar);
			
			if (svar >= 90) {
				karakter= 'A';
			}
			else if (svar >= 80) {
				karakter = 'B';
			}
			else if (svar >= 60) {
				karakter = 'C';
			}
			else if (svar >= 50) {
				karakter = 'D';
			}
			else if (svar >= 40) {
				karakter = 'E';
			}
			else {
				karakter = 'F';
			}
			
			showMessageDialog(null, "Student nr " + (i + 1) + " får karakteren " + karakter);
		}
	}
}
=======
package no.hvl.dat100;


import static javax.swing.JOptionPane.*;

public class Oppgave6 {
	public static void main(String[] args) {
		int antallStudenter = Integer.parseInt(showInputDialog(null, "Skriv inn antall studenter"));
		
		for (int i = 0; i < antallStudenter; i++) {
			boolean gyldigSvar = false;
			int svar = 0;
			char karakter;
			
			do {
				int input = Integer.parseInt(showInputDialog(null, "Skriv inn poengsummen til student nr " + (i + 1)));
				svar = input;
				gyldigSvar = (input >= 0) && (input <= 100);
				if (!gyldigSvar) {
					showMessageDialog(null, "Skriv inn en gyldig poengsum!");
				}
			} while (!gyldigSvar);
			
			if (svar >= 90) {
				karakter= 'A';
			}
			else if (svar >= 80) {
				karakter = 'B';
			}
			else if (svar >= 60) {
				karakter = 'C';
			}
			else if (svar >= 50) {
				karakter = 'D';
			}
			else if (svar >= 40) {
				karakter = 'E';
			}
			else {
				karakter = 'F';
			}
			
			showMessageDialog(null, "Student nr " + (i + 1) + " får karakteren " + karakter);
		}
	}
}
>>>>>>> e2adec7d491d897eec7805c8975b39b9725171e3
