package org.minakdev.aktoreak;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
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
	}
	
	private void fitxategiaKargatu(String pFitxategia) {
		
		try {
			
			Scanner sc = new Scanner(new FileReader(pFitxategia));
			
			String lerroa;
			
			while(sc.hasNext()) {
				lerroa = sc.nextLine();
				// zerrenda.split("\\s* ### \\s*");
			}
			
			sc.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private void fitxategiaIdatzi() throws FileNotFoundException, UnsupportedEncodingException {
		PrintWriter idatzi = new PrintWriter("irteera.txt", "UTF-8;");
		idatzi.close();
		
	}

}
