package org.minakdev.aktoreak;

public class Pelikulak {

	private static Pelikulak nirePelikulak;
	
	private Pelikulak() {
	}

	public static Pelikulak getInstance() {
		if (nirePelikulak == null) {
			nirePelikulak = new Pelikulak();
		}
		return nirePelikulak;
	}
}
