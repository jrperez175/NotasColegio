package org.gradle;

import org.junit.Before;
import org.junit.Test;
//import org.junit.Assert.*;
import static org.junit.Assert.*;

public class NotasColegioTest {
    
	private NotasColegio notasColegio;

	@Before
	public void setup() {
		notasColegio = new NotasColegio();
	}
	
	@Test
	public void ingreso7y7yObtengoAprueba() {
		// arrange definicion de la variables
		int int1 = 7;
		int int2 = 7;
		

		// act- accion

		String resultado = notasColegio.resultadoCurso(int1,int2);

		// assert
		assertEquals("Aprueba",resultado);
	}
	
	
	
	@Test
	public void ingreso4y6ySupletorio() {
		// arrange definicion de la variables
		int int1 = 4;
		int int2 = 6;
		

		// act- accion

		String resultado = notasColegio.resultadoCurso(int1,int2);

		// assert
		assertEquals("Supletorio",resultado);
	}
	
	@Test
	public void ingreso5y4yReprueba() {
		// arrange definicion de la variables
		int int1 = 5;
		int int2 = 4;
		

		// act- accion

		String resultado = notasColegio.resultadoCurso(int1,int2);

		// assert
		assertEquals("Reprueba",resultado);
	}
    
}

