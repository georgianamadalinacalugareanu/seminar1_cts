package claseFactoryMethod;

public class FactoryMedic implements FactoryMethodPersonal{

	@Override
	public PersonalSpital createPersonal(String nume, int salariu) {
		// TODO Auto-generated method stub
		return new Medic(nume, salariu);
	}

}
