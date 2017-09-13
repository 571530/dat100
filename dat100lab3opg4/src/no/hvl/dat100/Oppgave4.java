package no.hvl.dat100;


public class Oppgave4 {
	public static void main(String[] args) {
		
		
		
		System.out.println("GRADER  RADIANER  SINUS  COSINUS");
		
		for (int grader = 0; grader <= 180; grader += 15) {
			double radianer = (Math.PI * grader) / 180;
			double sin = Math.sin(radianer);
			double cos = Math.cos(radianer);
			
			System.out.printf("%3d  \t %.3f \t %.3f \t %.3f \n", grader, radianer, sin, cos);
		}
		
		
	}
}
