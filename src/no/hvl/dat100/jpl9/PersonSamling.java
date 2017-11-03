package no.hvl.dat100.jpl9;

public class PersonSamling {

	private Person[] tabell;
	private int nesteLedige;
	private int antall;
	
	public PersonSamling() {
		// TODO
		tabell = new Person[20];
		nesteLedige = 0;
		antall = 0;
		//throw new RuntimeException("not implemented");
	}

	public PersonSamling(int lengde) {
		// TODO
		tabell = new Person[lengde];
		nesteLedige = 0;
		antall = 0;
		//throw new RuntimeException("not implemented");
	}

	public int getAntall() {
		// TODO
		return antall;
		//throw new RuntimeException("not implemented");
	}

	public Person[] getSamling() {
		// TODO
		return tabell;
		//throw new RuntimeException("not implemented");
	}

	public int finnPerson(Person p) {
		// TODO
		boolean funnet = false;
		int pos = 0;
		while(pos < nesteLedige && !funnet)
		{
			if(tabell[pos].erLik(p))
			{
				funnet = true;
			}
			else
			{
				pos++;
			}
		}
		if(funnet)
		{
			return pos;
		}
		else
		{
			return -1;
		}
		//throw new RuntimeException("not implemented");
	}

	public boolean finnes(Person p) {
		// TODO
		int pos = finnPerson(p);
		if (pos >= 0)
		{
			return true;
		}
		else 
		{
			return false;
		}
		//throw new RuntimeException("not implemented");
	}

	public String toString() {
		// TODO
		return antall + "\n" + Student.class.toString() + "\n" + Laerer.class.toString();
		//throw new RuntimeException("not implemented");
	}

	public void utvid() {
		// TODO
		Person[] tabell2 = new Person[tabell.length*2];
		for(int i = 0; i < tabell.length; i++)
		{
			tabell2[i] = tabell[i];
		}
		antall = tabell.length;
		ledigPlass();
		//throw new RuntimeException("not implemented");
	}

	public boolean ledigPlass() {
		// TODO
		if(antall < tabell.length)
		{
			return true;
		}
		else
		{
			return false;
		}
		//throw new RuntimeException("not implemented");
	}

	public boolean leggTil(Person p) {
		// TODO
		boolean ny = finnPerson(p) == -1;
		if(ny && nesteLedige < tabell.length)
		{
			tabell[nesteLedige] = p;
			nesteLedige++;
			antall++;
			return true;
		}
		else if(ny && nesteLedige >= tabell.length)
		{
			utvid();
			tabell[nesteLedige] = p;
			nesteLedige++;
			antall++;
			return true;
		}
		else
		{
			return false;
		}
		//throw new RuntimeException("not implemented");
	}

	public boolean slett(Person p) {
		// TODO
		int pos = finnPerson(p);
		if (pos >=0)
		{
			nesteLedige--;
			tabell[pos] = tabell[nesteLedige];
			tabell[nesteLedige] = null;
			antall--;
			return true;
		}
		else
		{
			return true;
		}
		//throw new RuntimeException("not implemented");
	}
}