package no.hvl.dat100.jpl9;

public class Laerer extends Person {
	private int maanedslonn;
	private int kontonummer;

	public Laerer() {
		super();
		this.maanedslonn = 0;
		this.kontonummer = 0;
	}

	public Laerer(String etternamn, String fornamn, long fodselsnummer, int maanedslonn, int kontonummer) {
		// TODO
		this.etternamn = etternamn;
		this.fornamn = fornamn;
		this.fodselsnummer = fodselsnummer;
		this.maanedslonn = maanedslonn;
		this.kontonummer = kontonummer;
		//throw new RuntimeException("not implemented");
	}

	public int getMaanedslonn() {
		// TODO
		return maanedslonn;
		//throw new RuntimeException("not implemented");
	}

	public void setMaanedslonn(int maanedslonn) {
		// TODO
		this.maanedslonn = maanedslonn;
		//throw new RuntimeException("not implemented");
	}

	public int getKontonummer() {
		// TODO
		return kontonummer;
		//throw new RuntimeException("not implemented");
	}

	public void setKontonummer(int kontonummer) {
		// TODO
		this.kontonummer = kontonummer;
		//throw new RuntimeException("not implemented");
	}

	@Override
	public String toString() {
		// TODO
		return String.format("LAERER\n%d\n%s\n%s\n%d\n%d\n", fodselsnummer, etternamn, fornamn, maanedslonn, kontonummer);
		//throw new RuntimeException("not implemented");

	}
}
