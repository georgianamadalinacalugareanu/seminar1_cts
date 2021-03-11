package ro.ase.cts.program;

import java.io.FileNotFoundException;
import java.util.List;

import ro.ase.cts.clase.Angajat;
import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.clase.Student;
import ro.ase.cts.readere.AngajatReader;
import ro.ase.cts.readere.AplicantReader;
import ro.ase.cts.readere.StudentReader;


public class Program {
	
	public static List<Aplicant> readApplicants(AplicantReader reader) throws NumberFormatException, FileNotFoundException{
		return reader.readApplicants();
	}

	public static void main(String[] args) {
		
		List<Aplicant> listaAplicanti;
		System.out.println(Angajat.getSumaFinantata());
		System.out.println(Student.getSumaFinantata());
	
		try {
			listaAplicanti = readApplicants(new StudentReader("studenti.txt"));
			for(Aplicant aplicant:listaAplicanti) {
				System.out.println(aplicant.toString());
			    aplicant.afiseazaSumaFinantata();
			} 
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
