package Pregunta;

import java.util.ArrayList;

import Comida.*;

public class PreguntaAnd extends Pregunta {

	private ArrayList<Pregunta> preguntas ; 
	
	public PreguntaAnd(Pregunta p1, Pregunta p2) {
		preguntas.add(p1) ; 
		preguntas.add(p2) ; 
	}
	
	public void addPregunta( Pregunta p) {
		preguntas.add(p) ; 
	}
	
	
	@Override
	public boolean cumple(Comida f) {
		for (Pregunta p : preguntas) {
			if (!p.cumple(f))
				return false ; 
		}
		return true;
	}

}
