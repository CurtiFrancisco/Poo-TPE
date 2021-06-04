package Calculador;

import Comida.Comida;
import Condicion.*;

public class CalculadorCondicion extends Calculador {

	
	private Condicion condicion ; 
	private Calculador calculador ;

	@Override
	public double calcularPrecio(Comida c) {
		
		if(condicion.cumple())
			return calculador.calcularPrecio(c) ;
	
		return 0 ; 
	} 
	
	
	
}
