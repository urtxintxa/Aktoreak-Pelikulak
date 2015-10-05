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
	
	public void sartuPelikula(Pelikula pPelikula) {
		pelikulaZerrenda.sartuPelikula(pPelikula);
	}
	
	public void pelikulakBueltatu() {
		
	}

	public void pelikuletatikEzabatu() {
		this.pelikulaZerrenda.aktoreaEzabatu(this);
		
	}
}
