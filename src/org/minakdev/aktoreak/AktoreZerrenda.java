package org.minakdev.aktoreak;

import java.util.ArrayList;

public class AktoreZerrenda {

	private ArrayList<Aktorea> aktoreZerrenda = new ArrayList<>();

	public ArrayList<Aktorea> getZerrenda() {
		return aktoreZerrenda;
	}
	
	public void aktoreaTxertatu(Aktorea pAktorea) {
		System.out.println("lol");
		aktoreZerrenda.add(pAktorea);
	}
	
	public void aktoreaBilatu() {
		
	}
	
	public void aktoreaEzbatu() {
		
	}
	
	public void aktoreakOrdenatu() {
		
	}
}
