package Cocina;

import java.util.ArrayList;
import Comida.*;

public class Cocina {
	private ArrayList<Pedido> listaPedidos;
	private ArrayList<Estacion> listaEstacion;
	private Estacion _default ; 
	
	public Cocina() {
		
		listaPedidos = new ArrayList<Pedido>() ; 
		listaEstacion = new ArrayList<Estacion>() ; 
		_default = new Estacion() ; 
		
	}
	
	public void addEstacion(Estacion e) {
		listaEstacion.add(e) ; 
	}
	public void addPedido(Pedido p) {
		listaPedidos.add(p) ; //entendemos que pueden haber dos pedidos iguales. 
	}
	
	public boolean AsignarComidaEstacion(Comida c) {
 
		for (Estacion e : listaEstacion) {
			if (e.puedePreparar(c)) {
				e.asignar(c) ;
				return true; 
			}
		}
		_default.asignar(c); //asignamos la comida a la estacion default 
		return false ; 
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
