package Pregunta;

import Comida.Comida;

public class PreguntaCalorias extends Pregunta {

	private double calorias ;  
	
	
	public PreguntaCalorias (double cal) {
		this.calorias = cal ; 
	}
	
	@Override
	public boolean cumple(Comida c) {
		return c.getCalorias() < calorias ; 
	}

}
