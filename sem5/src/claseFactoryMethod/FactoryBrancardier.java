package claseFactoryMethod;

public class FactoryBrancardier implements FactoryMethodPersonal{

	@Override
	public PersonalSpital createPersonal(String nume, int salariu) {
		// TODO Auto-generated method stub
		return new Brancardier(nume,salariu);
	}

	
}
