package Cocina;

import java.util.ArrayList;
import Comida.*;

public class Cocina {
	private ArrayList<Pedido> listaPedidos;
	private ArrayList<Estacion> listaEstacion;
	
	
	
	public void AsignarComidaEstacion(Comida c) {
		
		boolean asignado = false ; 
		
		for (Estacion e : listaEstacion) {
			if (e.puedePreparar(c)) {
				asignado = true ; 
				e.asignar(c) ;
				break; 
			}
		}
		
	}
	
	
}
