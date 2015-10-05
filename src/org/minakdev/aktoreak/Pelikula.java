package org.minakdev.aktoreak;

public class Pelikula {
	
	private String izena;
	private float dirua;
	private AktoreZerrenda aktoreZerrenda;
	
	public Pelikula(String pIzena) {
		this.izena = pIzena;
	}
	
	public String getDirua() {
		return this.izena;
	}
	
	public void setDirua(float pDirua) {
		this.dirua = pDirua;
	}

	public void aktoreakBueltatu() {
		
	}
	
	public void aktoreaEzabatu(Aktorea aktorea) {
		this.aktoreZerrenda.aktoreaEzabatu(aktorea);
	}
	
	public void diruaGehitu(float diru){
		this.dirua=this.dirua+diru;
	}
}
