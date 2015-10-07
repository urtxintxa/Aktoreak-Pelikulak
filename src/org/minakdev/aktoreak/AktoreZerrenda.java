package org.minakdev.aktoreak;

import java.util.ArrayList;

public class AktoreZerrenda {

	private ArrayList<Aktorea> aktoreZerrenda;

	public AktoreZerrenda(){
		this.aktoreZerrenda = new ArrayList<Aktorea>();
	}
	public ArrayList<Aktorea> getZerrenda() {
		return aktoreZerrenda;
	}
	
	public void aktoreaTxertatu(Aktorea pAktorea) {
		aktoreZerrenda.add(pAktorea);
	}
	
	public void aktoreaBilatu() {
		
	}
	
	public void aktoreakOrdenatu() {
		
	}

	public void aktoreaEzabatu(Aktorea aktorea) {
		this.aktoreZerrenda.remove(aktorea);		
	}
}
