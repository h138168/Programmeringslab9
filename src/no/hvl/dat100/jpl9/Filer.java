package no.hvl.dat100.jpl9;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Filer {

	private static String MAPPE = System.getProperty("user.dir") + "/src/no/hvl/dat100/jpl9/";

	private static String STUDENT = "STUDENT";
	private static String LAERER = "LAERER";

	public boolean skriv(PersonSamling samling, String filnavn) {

		boolean skrevet = true;
		PrintWriter writer = null;

		// TODO
		
		throw new RuntimeException("not implemented");

	}

	public PersonSamling les(String filnavn) {

		PersonSamling samling = null;

		// TODO
		throw new RuntimeException("not implemented");
	}
}
