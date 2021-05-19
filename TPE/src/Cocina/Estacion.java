package Cocina;

import Comida.Comida;
import java.util.ArrayList;
import Pregunta.* ; 

public class Estacion {
	private ArrayList<String> listaEspecialidades;
	private ArrayList<Comida> comidaAtendida ; 
	private Pregunta criterio ; 
	
	
	
	public Estacion() {
		super();
		this.listaEspecialidades = new ArrayList<>();
		this.comidaAtendida = new ArrayList<>() ; 
	}

	public Estacion(ArrayList<String> listaEspecialidades) {
		super();
		this.listaEspecialidades = listaEspecialidades;
		this.comidaAtendida = new ArrayList<>() ;
	}
	
	public void setListaEspecialidades(ArrayList<String> listaEspecialidades) {
		this.listaEspecialidades = listaEspecialidades;
	}

	public void add(String especialidad) {
		if (!this.listaEspecialidades.contains(especialidad))
			this.listaEspecialidades.add(especialidad);
	}
	public void rmv(String especialidad) {
			this.listaEspecialidades.remove(especialidad);
	}
	
	//Retorna verdadero si la estacion de trabajo puede aceptar el pedido. 
	public boolean puedePreparar(Comida c) {
		if ( criterio.cumple(c) /*&& lista de especialidades, a preguntar*/ ) 
			 return true ; 
		return false ;
	}

	public void asignar(Comida c) {
		this.comidaAtendida.add(c) ; 
	}
	
	
}
