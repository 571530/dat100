<<<<<<< HEAD
package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class Oddetall {
	public static void main(String[] args) {
		int nedreGrense = Integer.parseInt(showInputDialog("Skriv inn nedre grense"));
		int ovreGrense = Integer.parseInt(showInputDialog("Skriv inn �vre grense"));
		
		String tall = "";
		
		for (int i = nedreGrense; i <= ovreGrense; i++) {
			if (i % 2 == 1) {		
				tall += (tall.length() > 1 ? ", " : " ") + i ;
			}
		}
		showMessageDialog(null, tall);
	}
}
=======
package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class Oddetall {
	public static void main(String[] args) {
		int nedreGrense = Integer.parseInt(showInputDialog("Skriv inn nedre grense"));
		int ovreGrense = Integer.parseInt(showInputDialog("Skriv inn �vre grense"));
		
		String tall = "";
		
		for (int i = nedreGrense; i <= ovreGrense; i++) {
			if (i % 2 == 1) {		
				tall += (tall.length() > 1 ? ", " : " ") + i ;
			}
		}
		showMessageDialog(null, tall);
	}
}
>>>>>>> e2adec7d491d897eec7805c8975b39b9725171e3
