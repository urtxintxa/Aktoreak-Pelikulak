package org.minakdev.aktoreak.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.minakdev.aktoreak.Aktorea;
import org.minakdev.aktoreak.Aktoreak;
import org.minakdev.aktoreak.Nagusia;
import org.minakdev.aktoreak.Pelikulak;

public class NagusiaTest {

	@Before
	public void setUp() throws Exception {
		Nagusia.getNireNagusia().fitxategiaKargatu("aktore-zerrenda_txiki.txt");
		Aktorea a1 = new Aktorea("AAA");
	}

	@After
	public void tearDown() throws Exception {
		Aktoreak.getNireAktoreak().erreseteatu();
		Pelikulak.getNirePelikulak().erreseteatu();
	}
	
	
	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	
	@Test
	public void aktoreaTxertatuTest(){
		assertSame(Aktoreak.getNireAktoreak().luzera(),4);
		Aktoreak.getNireAktoreak().aktoreaTxertatu("Caktore1");
		assertSame(Aktoreak.getNireAktoreak().luzera(),4);
		Aktoreak.getNireAktoreak().aktoreaTxertatu("AAA");
		assertSame(Aktoreak.getNireAktoreak().luzera(),5);
		Aktoreak.getNireAktoreak().aktoreaTxertatu("ZZZ");
		assertSame(Aktoreak.getNireAktoreak().luzera(),6);
		Aktoreak.getNireAktoreak().aktoreaTxertatu("CCC");
		assertSame(Aktoreak.getNireAktoreak().luzera(),7);
		
	}

}
