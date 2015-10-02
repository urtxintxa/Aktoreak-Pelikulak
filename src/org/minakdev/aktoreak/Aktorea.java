package org.minakdev.aktoreak;

public class Aktorea {
	
	private String izena;
	private PelikulaZerrenda pelikulaZerrenda = new PelikulaZerrenda();
	
	public Aktorea(String pIzena) {
		this.izena = pIzena;
	}
	
	public String getIzena() {
		return this.izena;
	}
	
	public void sartuPelikula(String pIzena) {
		Pelikula pelikula = new Pelikula(pIzena);
		pelikulaZerrenda.sartuPelikula(pelikula);
	}
	
	public void pelikulakBueltatu() {
		
	}

	public void pelikuletatikEzabatu() {
		this.pelikulaZerrenda.aktoreaEzabatu(this);
		
	}
}
