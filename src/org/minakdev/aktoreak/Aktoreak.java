package org.minakdev.aktoreak;

import java.util.ArrayList;

public class Aktoreak {

	private static Aktoreak nireAktoreak;
	private AktoreZerrenda aktoreZerrenda;

	private Aktoreak() {
		aktoreZerrenda = new AktoreZerrenda();
	}

	public static Aktoreak getNireAktoreak() {
		if (nireAktoreak == null) {
			nireAktoreak = new Aktoreak();
		}
		return nireAktoreak;
	}
	
	public ArrayList<Aktorea> getAktoreZerrenda() {
		return this.aktoreZerrenda.getZerrenda();
	}
	
	public void sortuAktorea(String pAktoreaPelikulak) {
		String [] atalak = pAktoreaPelikulak.split("\\s*###\\s*");
		
		Aktorea aktoreBerria = new Aktorea(atalak[0]);
		
		for (int i = 1; i < atalak.length; i++) {
			String pelikulaIzena = atalak[i];
			Pelikula pelikula;
			
			if(Pelikulak.getNirePelikulak().pelikulaBueltatu(pelikulaIzena) == null) {
				pelikula = new Pelikula(pelikulaIzena);
				Pelikulak.getNirePelikulak().sartuPelikula(pelikula);
			}
			else {
				pelikula = Pelikulak.getNirePelikulak().pelikulaBueltatu(pelikulaIzena);
			}
			
			aktoreBerria.sartuPelikula(pelikula);
			pelikula.sartuAktorea(aktoreBerria);
		}
		
		aktoreZerrenda.aktoreaTxertatu(aktoreBerria);
	}
	
	public void aktoreaSartu(Aktorea pAktorea) {
		aktoreZerrenda.aktoreaTxertatu(pAktorea);
	}
	
	public Aktorea aktoreaBilatu (String izena) {
		
	}
	
	public void aktoreakOrdenatu() {
		
	}
	
	public void aktoreaEzabatu(String izena){
		Aktorea aktorea=this.aktoreaBilatu(izena);
		if (aktorea==null){
			System.out.println("Ezin da aktorea ezabatu ez baitago.");
		}
		else{
			aktorea.pelikuletatikEzabatu();
			aktoreZerrenda.aktoreaEzabatu(aktorea);
		}
		
	}
}
