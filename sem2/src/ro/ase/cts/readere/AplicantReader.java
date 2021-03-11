package ro.ase.cts.readere;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

import ro.ase.cts.clase.Aplicant;

public abstract class AplicantReader {
	protected String fileName;
	public abstract List<Aplicant> readApplicants() throws FileNotFoundException, NumberFormatException;
	
	public AplicantReader(String fileName) {
		super();
		this.fileName = fileName;
	}
	
	protected void readAplicant(Scanner input, Aplicant aplicant) {
		String nume = input.next();
		String prenume = input.next();
		int varsta = input.nextInt();
		int punctaj = input.nextInt();
		int nr = input.nextInt();
		String[] vect = new String[5];
		for (int i = 0; i < nr; i++)
			vect[i] = input.next();
		aplicant.setNume(nume);
		aplicant.setPrenume(prenume);
		aplicant.setVarsta(varsta);
		aplicant.setPunctaj(punctaj);
		aplicant.setDenumiriProiecte(nr,vect);
				
	}

}
