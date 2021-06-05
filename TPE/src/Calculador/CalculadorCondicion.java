package Calculador;

import Comida.Comida;
import Condicion.*;

public class CalculadorCondicion extends Calculador {

	
	private Condicion condicion ; 
	private Calculador calculador ;
	
	public CalculadorCondicion(Condicion c, Calculador calculador) {
		this.calculador = calculador ; 
		this.condicion = c ; 
	}

	@Override
	public double calcularPrecio(Comida c) {
		
		if(condicion.cumple()) //descuentos, aumentos, etc. 
			return calculador.calcularPrecio(c) ;
		
		return 0 ; 
	} 
	
}
