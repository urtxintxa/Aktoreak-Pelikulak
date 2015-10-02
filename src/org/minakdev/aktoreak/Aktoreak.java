package org.minakdev.aktoreak;

public class Aktoreak {

	private static Aktoreak nireAktoreak;
	private AktoreZerrenda aktoreZerrenda = new AktoreZerrenda();

	private Aktoreak() {
	}

	public static Aktoreak getNireAktoreak() {
		if (nireAktoreak == null) {
			nireAktoreak = new Aktoreak();
		}
		return nireAktoreak;
	}
	
	public AktoreZerrenda getAktoreZerrenda() {
		return this.aktoreZerrenda;
	}
	
	public void sortuAktorea(String pAktoreaPelikulak) {
		String [] atalak = pAktoreaPelikulak.split("\\s*###\\s*");
		
		Aktorea aktoreBerria = new Aktorea(atalak[0]);
		
		for (int i = 1; i < atalak.length; i++) {
			aktoreBerria.sartuPelikula(atalak[i]);
		}
		
		aktoreZerrenda.getZerrenda().add(aktoreBerria);
	}
	
	public void aktoreaTxertatu(Aktorea pAktorea) {
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
