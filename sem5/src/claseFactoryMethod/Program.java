package claseFactoryMethod;

public class Program {
	public static void printeazaPersonalSpital(FactoryMethodPersonal factoryMethod, String nume, int salariu) {
		PersonalSpital personal1=factoryMethod.createPersonal(nume, salariu);
		System.out.println(personal1.toString());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FactoryMethodPersonal factoryMethod=new FactoryAsistent();
		printeazaPersonalSpital(factoryMethod,"Ion",1200);

		
	}

}
