package org.minakdev.aktoreak;

public class Aktoreak {

	private static Aktoreak nireAktoreak;

	private Aktoreak() {
	}

	public static Aktoreak getInstance() {
		if (nireAktoreak == null) {
			nireAktoreak = new Aktoreak();
		}
		return nireAktoreak;
	}
}
