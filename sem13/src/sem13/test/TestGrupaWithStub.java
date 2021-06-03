package sem13.test;

import static org.junit.Assert.*;

import org.junit.Test;

import sem13.clase.Grupa;
import sem13.clase.IStudent;
import sem13.dubluri.StudentStub;

public class TestGrupaWithStub {

	Grupa grupa;
	@Test
	public void testGetPromovabilitate() {
		grupa=new Grupa(1076);
		IStudent s1=new StudentStub();
		grupa.adaugaStudent(s1);
		assertEquals(1, grupa.getPromovabilitate(),0.01);

	}

}
