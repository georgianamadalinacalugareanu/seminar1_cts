package claseFactoryMethod;

public class FactoryAsistent implements FactoryMethodPersonal {

	@Override
	public PersonalSpital createPersonal(String nume, int salariu) {
		// TODO Auto-generated method stub
		return new Asistent(nume,salariu);
	}

}
