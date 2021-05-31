package Cocina;

import Comida.Comida;
import java.util.ArrayList;
import Pregunta.* ; 

public class Estacion {
	private ArrayList<Comida> comidaAtendida ; 
	private Pregunta especialidad ; 
		
	public Estacion() {
		super();
		this.comidaAtendida = new ArrayList<>() ; 
	}

	public boolean puedePreparar(Comida c) {
		if ( especialidad.cumple(c) ) 
			 return true ; 
		return false ;
	}

	public void asignar(Comida c) {
		this.comidaAtendida.add(c) ; 
	}
	
	public Pregunta getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(Pregunta especialidad) {
		this.especialidad = especialidad;
	}

	
	
	
}
