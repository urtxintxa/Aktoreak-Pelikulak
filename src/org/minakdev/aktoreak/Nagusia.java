package org.minakdev.aktoreak;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;
import java.util.Scanner;

public class Nagusia {
	
	private static Nagusia nireNagusia;
	
	private static String fitxategia = "aktore-zerrenda.txt";

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
		
		try {
			nireNagusia.aktoreenZerrendaGorde();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
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
		
	}
	
	public void aktoreBatenEzabaketa() {
		
	}

}
