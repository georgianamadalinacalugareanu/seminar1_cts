package sem6.builder;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rezervare rezervare=new RezervareBuilder().setAreBauturaRacoritoare(true).setCodRezervare(1).build();
		Rezervare rezervare2=new RezervareBuilder().setAreMancareInclusa(true).setCodRezervare(2).build();
		System.out.println(rezervare.toString());
		System.out.println(rezervare2.toString());
		

	}

}
