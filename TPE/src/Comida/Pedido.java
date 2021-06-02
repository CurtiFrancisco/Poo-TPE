package Comida;
import java.util.ArrayList;

import Calculador.Calculador;
import Calculador.CalculadorAdicional;
import Pregunta.*;

public class Pedido {
	private ArrayList<Comida> comidas;
	private int mesa;
	private String mozo;
	private int diaSemana ; /*Numero de 0 a 6 que define en que dia de la semana se hizo el pedido, se usa para el calculo de la cuenta*/						

	//private static final double PROPINA = 0.1 ;  
	//private static final double AGITADO = 0.55 ;  
	//private static final double DESCUENTO = 0.20 ;
	
	public Pedido(int mesa, String mozo) {
		super();
		this.comidas = new ArrayList<>();
		this.mesa = mesa;
		this.mozo = mozo;
	}
	public ArrayList<Comida> getComidas() {
		
		ArrayList<Comida> aux = new ArrayList<>();
		for (Comida c1 : comidas) {
			Comida aux_comida = c1.copyOf() ; 
			aux.add(aux_comida) ; 
		}
		return aux;
	}
	public int getMesa() {
		return mesa;
	}
	public String getMozo() {
		return mozo;
	}
	
	public void addComida(Comida comida) {
		comidas.add(comida); 
	}
	public void modificarComida(Comida comidaModificada, Comida comida) {
		if (this.comidas.contains(comida)) {
			this.comidas.remove(comida);
			this.comidas.add(comidaModificada);
		}
	}
	
	
	public double calcularCuenta(boolean agitado, ArrayList<Calculador> criterio) {
		double precio = 0 ; 
		
		
		for( Calculador c : criterio) {
			for( Comida aux : comidas) {
				 precio += c.calcularPrecio(aux) ;
			}
		}
		
		return precio ; 
	}
	
}
