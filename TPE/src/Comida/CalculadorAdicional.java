package Comida;

import Pregunta.Pregunta;

public class CalculadorAdicional {
	
	public double calcularPrecio(double valor1, double valor2, Pregunta p, Comida c){
		if (p.cumple(c))
			return c.getPrecio() + valor1 ; 
		return c.getPrecio() + valor2 ; 
	}
	public double calcularPrecio(double valor1,Pregunta p, Comida c){ //Este seria el del porcentaje :S
		if (p.cumple(c))
			return c.getPrecio() * valor1 ; 
		return c.getPrecio(); 
	}
}
