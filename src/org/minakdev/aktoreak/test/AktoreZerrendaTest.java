package org.minakdev.aktoreak.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.minakdev.aktoreak.AktoreZerrenda;
import org.minakdev.aktoreak.Aktorea;

public class AktoreZerrendaTest {
	
	private AktoreZerrenda aktoreZerrenda;
	private Aktorea aktore1;
	private Aktorea aktore2;

	@Before
	public void setUp() throws Exception {
		aktoreZerrenda = new AktoreZerrenda();
		
		aktore1 = new Aktorea("Aktore1");
		aktore2 = new Aktorea("Aktore2");
	}

	@After
	public void tearDown() throws Exception {
		aktoreZerrenda = null;
		aktore1 = null;
		aktore2 = null;
	}
	
	@Test
	public void aktoreaSartu() {
		aktoreZerrenda.aktoreaSartu(aktore2);
		assertSame(aktoreZerrenda.getZerrenda().size(), 1);
		
		aktoreZerrenda.aktoreaSartu(aktore1);
		assertSame(aktoreZerrenda.getZerrenda().size(), 2);
	}
	
	@Test
	public void aktoreaTxertatu() {
		aktoreZerrenda.aktoreaTxertatu("Aktore1");
		assertSame(aktoreZerrenda.getZerrenda().size(), 1);
		
		aktoreZerrenda.aktoreaTxertatu("Aktore1");
		assertSame(aktoreZerrenda.getZerrenda().size(), 1);
		
		aktoreZerrenda.aktoreaTxertatu("Aktore2");
		assertSame(aktoreZerrenda.getZerrenda().size(), 2);
	}
	
	@Test
	public void aktoreaBilatu() {
		aktoreZerrenda.aktoreaSartu(aktore1);
		
		assertSame(aktoreZerrenda.aktoreaBilatu("Aktore1"), aktore1);
		assertSame(aktoreZerrenda.aktoreaBilatu("Aktore2"), null);
	}
	
	@Test
	public void aktoreakOrdenatu() {
		aktoreZerrenda.aktoreaSartu(aktore2);
		aktoreZerrenda.aktoreaSartu(aktore1);
		
		assertSame(aktoreZerrenda.getZerrenda().get(0), aktore2);
		
		aktoreZerrenda.aktoreakOrdenatu();
		
		assertSame(aktoreZerrenda.getZerrenda().get(0), aktore1);
	}
	
	@Test
	public void aktoreaEzabatu() {
		aktoreZerrenda.aktoreaSartu(aktore1);
		assertSame(aktoreZerrenda.getZerrenda().size(), 1);
		
		aktoreZerrenda.aktoreaEzabatu(aktore1);
		assertSame(aktoreZerrenda.getZerrenda().size(), 0);
	}

}
