package Cocina;

import java.util.ArrayList;
import Comida.*;

public class Cocina {
	private ArrayList<Pedido> listaPedidos;
	private ArrayList<Estacion> listaEstacion;
	private Estacion _default ; 
	
	
	public void AsignarComidaEstacion(Comida c) {

		boolean asignado = false ; 
		for (Estacion e : listaEstacion) {
			if (e.puedePreparar(c)) {
				asignado = true ; 
				e.asignar(c) ;
				break; 
			}
		}
		_default.asignar(c); //asignamos la comida a la estacion default 
	}
	
	public void AsignarPedidos() {
		for (Pedido p : listaPedidos) {
			ArrayList<Comida> aux = p.getComidas(); 		
			
			for(Comida c : aux) {
				this.AsignarComidaEstacion(c);
			}
		}
	}
	
}
