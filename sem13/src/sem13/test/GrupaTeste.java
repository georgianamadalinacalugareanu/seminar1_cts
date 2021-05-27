package sem13.test;

import static org.junit.Assert.*;

import org.junit.Test;

import sem13.clase.Grupa;

public class GrupaTeste {

	@Test
	public void testConstructorRight(){
		Grupa grupa=new Grupa(1077);
		assertEquals(1077, grupa.getNrGrupa());
	}
	
	@Test
	public void testLimitaInferioara() {
		Grupa grupa=new Grupa(1000);
		assertEquals(1000, grupa.getNrGrupa());
	}

	@Test
	public void testLimitaSuperioara() {
		Grupa grupa=new Grupa(1100);
		assertEquals(1100, grupa.getNrGrupa());
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testConstructorError() {
		int nrGrupa=100;
		Grupa grupa=new Grupa(nrGrupa);
		
	}
	@Test(expected=IllegalArgumentException.class)
	public void testConstructorErrorMaiMare() {
		int nrGrupa=11001;
		Grupa grupa=new Grupa(nrGrupa);
	}
	
	@Test(timeout=500)
	public void testConstructorPerformance() {
		Grupa grupa=new Grupa(1077);
	}
	
	@Test
	public void testConstructorExistence() {
		Grupa grupa=new Grupa(1077);
		assertNotNull(grupa.getStudenti());
	}
	
	
}
