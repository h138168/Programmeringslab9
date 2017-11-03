package no.hvl.dat100.jpl9;

public class Student extends Person {
	private int studentnummer;
	private String klasse;

	public Student() {
		super();
		this.studentnummer = 0;
		this.klasse = "";
	}

	public Student(String etternamn, String fornamn, long fodselsnummer, int studentnummer, String klasse) {
		// TODO
		this.etternamn = etternamn;
		this.fornamn = fornamn;
		this.fodselsnummer = fodselsnummer;
		this.studentnummer = studentnummer;
		this.klasse = klasse;		
		//throw new RuntimeException("not implemented");
	}

	public int getStudentnummer() {
		// TODO
		return studentnummer;
		//throw new RuntimeException("not implemented");
	}

	public void setStudentnummer(int studentnummer) {
		// TODO
		this.studentnummer = studentnummer;
		//throw new RuntimeException("not implemented");
	}

	public String getKlasse() {
		// TODO
		return klasse;
		//throw new RuntimeException("not implemented");
	}

	public void setKlasse(String klasse) {
		// TODO
		this.klasse = klasse;
		//throw new RuntimeException("not implemented");
	}

	@Override
	public String toString() {
		// TODO
		return String.format("STUDENT\n%d\n%s\n%s\n%d\n%s\n", fodselsnummer, etternamn, fornamn, studentnummer, klasse);
		//throw new RuntimeException("not implemented");

	}

}
