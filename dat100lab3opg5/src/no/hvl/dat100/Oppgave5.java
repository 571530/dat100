package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class Oppgave5 {
	public static void main(String[] args) {
		
		int temp[] = new int[7];
		
		System.out.println("Analyse av temperaturer\n*****************");
		
		for (int i = 0; i < temp.length; i++) {	
			int temperatur = Integer.parseInt(showInputDialog("Skriv inn temperaturen for dag " + (i + 1)));
			
			temp[i] = temperatur;
		}
		
		int gjennomsnittTall = gjennomsnitt(temp);
		System.out.println("Gjennomsnittet er " + gjennomsnittTall);
		
		int maksTall = maks(temp);
		System.out.println("Høyeste temperatur var " + maksTall);
		
	}
	
	public static int gjennomsnitt(int[] tab) {
		int sum = 0;
		for (int i = 0; i < tab.length; i++) {
			sum += tab[i];
		}
		return sum / tab.length;
	}
	
	public static int maks(int[] tab) {
		int maksIndex = 0;
		for (int i = 1; i < tab.length; i++) {
			if (tab[i] > tab[maksIndex]) {
				maksIndex = i;
			}
			
		}
		return tab[maksIndex];
	}
}
