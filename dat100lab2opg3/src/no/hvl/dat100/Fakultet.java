package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import java.math.*;

public class Fakultet {
	public static void main(String[] args) {
		String input = showInputDialog("Skriv inn n");
		int n = Integer.parseInt(input);
		
		showMessageDialog(null, Fakultet(n));
	}
	
	public static int Fakultet(int n) {
		
		int sum = n;
		while (--n > 0) {
			System.out.println(n);			
			sum*=n;
		}
		
		return sum;
		
	}
}
