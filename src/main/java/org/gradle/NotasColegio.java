package org.gradle;

public class NotasColegio {

	public String resultadoCurso(int nota1, int nota2) {
		// TODO Auto-generated method stub
		
		int sumaBimestre = nota1+nota2;
		
		if ((sumaBimestre) >= 14) {
			return "Aprueba";
		}
		
		if (sumaBimestre <10) {
			return "Reprueba";
		}
		
		return "Supletorio";
		
		
	}
    
}
