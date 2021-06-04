package Condicion;

public abstract class Condicion {

	boolean condicion ; 
	
	
	public Condicion(boolean condicion) {
		this.condicion = condicion ; 
	}
	
	public boolean cumple() {return condicion; } 
	
}
