package Pregunta;

public class PreguntaOr extends Pregunta {

	private Pregunta p1 ; 
	private Pregunta p2 ; 
	
	public PreguntaOr(Pregunta p1, Pregunta p2) {
		this.p1 = p1; 
		this.p2 = p2; 
	}
	
	@Override
	public boolean cumple(/*f*/) {
		//return p1.cumple(f) || p2.cumple(f) ;
		return false; 
	}

}
