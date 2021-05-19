package Pregunta;
import Comida.*;

public class PreguntaNot extends Pregunta {

	private Pregunta p1;
	
	public PreguntaNot(Pregunta p1, Pregunta p2) {
		this.p1 = p1;
	}

	@Override
	public boolean cumple(Comida f) {
		return !(p1.cumple(f));
	}
}
