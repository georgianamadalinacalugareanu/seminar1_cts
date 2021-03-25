package program;

import clase.Asistent;
import clase.FactoryPersonal;
import clase.PersonalSpital;
import clase.TipPersonal;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FactoryPersonal factoryPersonal=new FactoryPersonal();
			PersonalSpital personal1;
			PersonalSpital personal2;
			personal1=factoryPersonal.createPersonal(TipPersonal.Medic, "Ionescu", 4000);
			personal2=factoryPersonal.createPersonal(TipPersonal.Asistent, "Maria", 7000);
			System.out.println(personal1);
			System.out.println(personal2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
