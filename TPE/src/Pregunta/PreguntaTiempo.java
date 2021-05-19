package Pregunta;

import Comida.Comida;
public class PreguntaTiempo extends Pregunta {
	
	private int tiempo; 
		
		public PreguntaTiempo( int tiempo) {
			super() ; 
			this.tiempo = tiempo ; 
		}
		
	
	@Override  // retorna verdadero cuando el tiempo de preparacion es menor al predicado
	public boolean cumple(Comida c) {
		return c.getTiempo() < this.tiempo ; 
	}
	
}
