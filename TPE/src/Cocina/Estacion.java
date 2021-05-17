package Cocina;

import java.util.ArrayList;

public class Estacion {
	private ArrayList<String> listaEspecialidades;

	public Estacion() {
		super();
		this.listaEspecialidades = new ArrayList<>();
	}

	public Estacion(ArrayList<String> listaEspecialidades) {
		super();
		this.listaEspecialidades = listaEspecialidades;
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
	
}
