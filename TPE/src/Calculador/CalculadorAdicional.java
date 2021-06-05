package Calculador;

import Comida.Comida;
import Pregunta.Pregunta;

public class CalculadorAdicional extends Calculador {
	
	private double valor1,valor2 ; 
	private Pregunta p ;  
	
	public CalculadorAdicional( double valor1, double valor2, Pregunta p) {
		
		this.valor1 = valor1 ; 
		this.valor2 = valor2 ; 
		this.p = p ; 
	}
	
		
	public double calcularPrecio(Comida c){
		if (p.cumple(c))
			return  valor1 ; 
		return  valor2 ; 
		
	}
	
	
	
}
