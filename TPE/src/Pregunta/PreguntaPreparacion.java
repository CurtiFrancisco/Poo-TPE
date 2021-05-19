package Pregunta;

import Comida.Comida;

public class PreguntaPreparacion extends Pregunta {

	private String preparacion; 
		
		public PreguntaPreparacion( String p) {
			super() ; 
			this.preparacion = p ; 
		}
		

	
	
	@Override
	public boolean cumple(Comida c) {
		return c.getModo_preparacion().equals(this.preparacion) ; 
	}
	
}
