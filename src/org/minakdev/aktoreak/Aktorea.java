package org.minakdev.aktoreak;

import java.util.Iterator;

public class Aktorea {
	
	private String izena;
	private PelikulaZerrenda pelikulaZerrenda;
	
	public Aktorea(String pIzena) {
		this.izena = pIzena;
		this.pelikulaZerrenda = new PelikulaZerrenda();
	}
	
	public String getIzena() {
		return this.izena;
	}
	
	public Iterator<Pelikula> getIteradorea(){
		return this.pelikulaZerrenda.getIteradorea();
	}
	
	public void sartuPelikula(Pelikula pPelikula) {
		pelikulaZerrenda.sartuPelikula(pPelikula);
	}
	
	public void pelikulakBueltatu() {
		System.out.println("Pelikulak:");
		Iterator<Pelikula> itr = this.getIteradorea();
		while (itr.hasNext()) {
			System.out.println(itr.next().getIzena());
		}
	}

	public void pelikuletatikEzabatu() {
		this.pelikulaZerrenda.aktoreaEzabatu(this);
		
	}
}
