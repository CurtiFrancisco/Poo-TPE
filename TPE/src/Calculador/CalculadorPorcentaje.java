package Calculador;

import Comida.Comida;
import Pregunta.Pregunta;

public class CalculadorPorcentaje extends Calculador {

	/* Implementamos esta clase que trabaja con porcentajes y un booleano que sirve como criterio
	 * creemos que es mejor así dado que "concepto de dia agitado" "propina de mosos" y 
	 * "descuento los dias miercoles" son las unicas situaciones donde se aplican costos o descuentos
	 * lo manejamos con un booleano desde afuera que se puede setear de forma tal que una persona
	 * para usar esta clase debe crear un CalculadorPorcentaje DIAAGITADO y poner el valor que quiere
	 * puede armar una lista de estos criterios y funcionarian bien con los que son con valores fijos*/
	
	

	private double valor1 ; 
	private boolean p ;  
	
	public CalculadorPorcentaje( double valor1, boolean p) {
		
		this.valor1 = valor1 ; 
		this.p = p ; 
	}
	
	
	public void setEstado(boolean b) {
		this.p = b ; 
	}

	@Override
	public double calcularPrecio(Comida c) {
		
		if (p)	
			return (c.getPrecio() + c.getPrecio() * valor1 );
		return c.getPrecio();
	}
	
	
	
	
}
