package Calculador;

import Comida.Comida;
import Pregunta.Pregunta;

public class CalculadorPorcentaje extends Calculador {

	private double valor1 ;   
	
	
	public CalculadorPorcentaje( double valor1) {
		
		this.valor1 = valor1 ; 
	}


	@Override
	public double calcularPrecio(Comida c) {	
		return (c.getPrecio() * valor1 );
	}

	
}
