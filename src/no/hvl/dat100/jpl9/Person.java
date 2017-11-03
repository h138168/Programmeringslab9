package no.hvl.dat100.jpl9;

public abstract class Person {
	
	protected String etternamn;
	protected String fornamn;
	protected long fodselsnummer;

	public Person() {
		super();
		this.etternamn = "";
		this.fornamn = "";
		this.fodselsnummer = 0;
	}

	public Person(String etternamn, String fornamn, long fodselsnummer) {
		this.etternamn = etternamn;
		this.fornamn = fornamn;
		this.fodselsnummer = fodselsnummer;
	}

	public String getEtternamn() {
		// TODO
		return etternamn;
		//throw new RuntimeException("not implemented");
	}

	public void setEtternamn(String etternamn) {
		// TODO
		this.etternamn = etternamn;
		//throw new RuntimeException("not implemented");
	}

	public String getFornamn() {
		// TODO
		return fornamn;
		//throw new RuntimeException("not implemented");
	}

	public void setFornamn(String fornamn) {
		// TODO
		this.fornamn = fornamn;
		//throw new RuntimeException("not implemented");
	}

	public void setFodselsnummer(long fodselsnummer) {
		// TODO
		this.fodselsnummer = fodselsnummer;
		//throw new RuntimeException("not implemented");
	}

	public long getFodselsnummer() {
		// TODO
		return fodselsnummer;
		//throw new RuntimeException("not implemented");
	}

	public boolean erLik(Person person) {
		// TODO
		return this.fodselsnummer == person.fodselsnummer;
		//throw new RuntimeException("not implemented");
	}

	public boolean erKvinne() {
		// TODO
		String s = String.valueOf(fodselsnummer);
		char ch = s.charAt(8);
		if (ch%2 == 0)
		{
			return true;
		}
		else 
		{
			return false;
		}
		//throw new RuntimeException("not implemented");
	}

	public boolean erMann() {
		// TODO
		String s = String.valueOf(fodselsnummer);
		char ch = s.charAt(8);
		if (ch%2 == 0)
		{
			return false;
		}
		else 
		{
			return true;
		}
		//throw new RuntimeException("not implemented");
	}

	@Override
	public String toString() {
		// TODO
		return String.format("%d\n%s\n%s\n", fodselsnummer, etternamn, fornamn);
		//throw new RuntimeException("not implemented");
	}
}
