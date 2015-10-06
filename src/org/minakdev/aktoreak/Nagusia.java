package org.minakdev.aktoreak;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

import TartetikKanpoException.TartetikKanpoException;

public class Nagusia {
	
	private static Nagusia nireNagusia;
	
	private static String fitxategia = "aktore-zerrenda.txt";
	
	private static Scanner sc = new Scanner(System.in);

	private Nagusia() {
	}

	public static Nagusia getNireNagusia() {
		if (nireNagusia == null) {
			nireNagusia = new Nagusia();
		}
		return nireNagusia;
	}

	public static void main(String[] args) {
		nireNagusia = Nagusia.getNireNagusia();
		
		nireNagusia.fitxategiaKargatu(fitxategia);
		
		/*try {
			nireNagusia.aktoreenZerrendaGorde();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} */
		
		System.out.println("AKOTEAK ETA PELIKULAK KUDEATZEKO APLIKAZIOA");
		System.out.println("Aplikazioa honek aukera hauek ditu:");
		
		System.out.println("1 - Aktore bat bilatu");
		System.out.println("2 - Aktore berri bat txertatu");
		System.out.println("3 - Aktore baten pelikulak ikusi");
		System.out.println("4 - Pelikula baten aktoreak ikusi");
		System.out.println("5 - Pelikula batek lortutako dirua ezarri");
		System.out.println("6 - Aktore bat ezabatu");
		System.out.println("7 - Aktoreen zerrenda gorde");
		
		System.out.println();
		
		int aukera = 0;
		boolean ezAmaitu = true;
		
		do {
			try {
				System.out.println("Hautatu nahi duzun aukera: ");
				aukera = sc.nextInt();	
				if(aukera > 7 || aukera < 1){
					throw new TartetikKanpoException("Zenbaki okerra hautatu duzu.");
				}
				ezAmaitu = false;
			} catch (InputMismatchException  e) {
				sc.nextLine();
				aukera = 0;
				System.out.println("Zenbaki okerra hautatu duzu.");
			} catch (TartetikKanpoException e) {
				System.out.println(e.getMessage());
			}
		} while (ezAmaitu);
		
	}
	
	private void fitxategiaKargatu(String pFitxategia) {
		
		try {
			
			Scanner sc = new Scanner(new FileReader(pFitxategia));
			
			String aktoreaPelikulak;
			
			while(sc.hasNext()) {
				aktoreaPelikulak = sc.nextLine();
				Aktoreak.getNireAktoreak().sortuAktorea(aktoreaPelikulak);
			}
			
			sc.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private void aktoreenZerrendaGorde() throws FileNotFoundException, UnsupportedEncodingException {		
		PrintWriter idatzi = new PrintWriter("AktoreakOutput.txt", "UTF-8");
		
		Iterator<Aktorea> itr =  Aktoreak.getNireAktoreak().getAktoreZerrenda().getZerrenda().iterator();
		
		while(itr.hasNext()) {
			idatzi.println(itr.next().getIzena());
		}
		
		idatzi.close();
	}
	
	public void aktoreBatenPelikulakBueltatu() {
		
	}
	
	public void pelikulaBatekoAktoreakBueltatu() {
		
	}
	
	public void diruaGehitu() {
		System.out.println("Sartu pelikularen izena");
		String pelIzen=this.stringEskatu();
		Pelikula peli= Pelikulak.getNirePelikulak().pelikulaBilatu(pelIzen);
		if(peli==null){
			System.out.println("Pelikula hori ez dago. Ezin da dirurik gehitu.");
		}
		else{
			float n=this.diruaEskatu();
			peli.diruaGehitu(n);
		}	
		
	}
	
	public void aktoreBatenEzabaketa() {
		
	}
	
	private float diruaEskatu(){
		float n;
		
		boolean ezAmaitu = true;
		
		do {
			try {
				System.out.println("Sartu diru kantitate bat: ");
				n = sc.nextFloat();
				ezAmaitu=false;
			} catch (InputMismatchException e) {
				sc.nextLine();
				n = 0;
				System.out.println("Sartu duzuna ez da diru kantitate bat.");
			} 
		}while (ezAmaitu);
		
		return n;
	}
	
	private String stringEskatu(){
		Scanner sc=new Scanner(System.in);
		
		String izena = sc.nextLine();
		sc.close();
		return izena;
		
	}
	
	public void aktoreaTxertatu(){
		String izena=this.stringEskatu();
		Aktorea aktor= Aktoreak.getNireAktoreak().aktoreaBilatu(izena);
		if(aktor==null){
			Aktoreak.getNireAktoreak().aktoreaTxertatu(new Aktorea(izena));
			Aktoreak.getNireAktoreak().aktoreakOrdenatu();
		}
		else{
			System.out.println("Ezin da aktorea gehitu, izen bereko pertsona bat baitago.");
		}
	}

}
