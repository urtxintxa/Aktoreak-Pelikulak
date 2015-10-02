package org.minakdev.aktoreak;

public class Pelikulak {

	private static Pelikulak nirePelikulak;
	private PelikulaZerrenda pelikulaZerrenda;
	
	private Pelikulak() {
	}

	public static Pelikulak getNirePelikulak() {
		if (nirePelikulak == null) {
			nirePelikulak = new Pelikulak();
		}
		return nirePelikulak;
	}
	
	public void sartuPelikula() {
		
	}
	
	public void pelikulaBilatu() {
		
	}
}
