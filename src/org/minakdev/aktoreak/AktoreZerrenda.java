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
	
	public Aktorea aktoreaBilatu(String izena) {
		int ezker= 0;
		int eskuin= this.aktoreZerrenda.size();
		Aktorea aktore=null;
		while (ezker<=eskuin){
			int i = (ezker+eskuin)/2;
			int lag = this.aktoreZerrenda.get(i).getIzena().compareTo(izena);
			if (lag==0){
				aktore= this.aktoreZerrenda.get(i);}
			else{
				if (lag>0){
					ezker= i+1;}
				else{
				eskuin= i-1;
				}
			}
		}
	return aktore;

	}
	
	public void aktoreakOrdenatu() {
		mergeSort(0, this.aktoreZerrenda.size()-1);
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
