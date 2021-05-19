package Pregunta;

import Comida.*;

public class PreguntaAnd extends Pregunta {

	private Pregunta p1;
	private Pregunta p2;
	
	public PreguntaAnd(Pregunta p1, Pregunta p2) {
		this.p1 = p1; 
		this.p2 = p2; 
	}
	
	
	@Override
	public boolean cumple(Comida f) {
		return p1.cumple(f) && p2.cumple(f); 
	}

}
