package org.minakdev.aktoreak;

public class Pelikulak {

	private static Pelikulak nirePelikula;
	
	private Pelikulak() {
	}

	public static Pelikulak getInstance() {
		if (nirePelikula == null) {
			nirePelikula = new Pelikulak();
		}
		return nirePelikula;
	}
}
