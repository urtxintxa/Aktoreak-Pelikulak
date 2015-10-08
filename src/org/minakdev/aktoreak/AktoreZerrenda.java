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
	
	public void aktoreaBilatu() {
		
	}
	
	public void aktoreakOrdenatu() {
		
	}

	public void aktoreaEzabatu(Aktorea aktorea) {
		this.aktoreZerrenda.remove(aktorea);		
	}
	
	public void aktoreaTxertatu(String izena) {
		int i =0;
		while (i<aktoreZerrenda.size() && izena.compareTo(aktoreZerrenda.get(i).getIzena())>0){	
			i ++;
		}
		
		if(i==aktoreZerrenda.size()){
			aktoreZerrenda.add(new Aktorea(izena));
		}
		else if(izena.compareTo(aktoreZerrenda.get(i).getIzena())==0){
			System.out.println("Aktorea ezin da txertatu, izen bereko aktore bat baitago.");
		}
		else{
			aktoreZerrenda.add(i, new Aktorea(izena));
		}
		
	}
}
