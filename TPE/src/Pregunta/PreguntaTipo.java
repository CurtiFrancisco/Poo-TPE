package Pregunta;

import Comida.Comida;

public class PreguntaTipo extends Pregunta {

	private String tipo ; 
	
	public PreguntaTipo( String tipo) {
		super() ; 
		this.tipo = tipo ; 
	}
	
	
	@Override
	public boolean cumple(Comida c) {
		return c.getTipo().equals(this.tipo);
	}

}
