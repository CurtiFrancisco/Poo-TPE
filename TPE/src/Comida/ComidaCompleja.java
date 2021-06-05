package Comida;
import java.util.ArrayList;

public class ComidaCompleja extends Comida{
	
	private ArrayList<Comida> conjuntoComidas;
	
	public ComidaCompleja(String nombre, String tipo, String modo_preparacion) {
		super(nombre,tipo,modo_preparacion);
		this.conjuntoComidas = new ArrayList<>();
	}
	
		
	public void addComida(Comida comida) {
		if (!this.conjuntoComidas.contains(comida)) { //preguntar
			this.conjuntoComidas.add(comida);
		}
	}
	

	@Override
	public Comida copyOf() {
		
		ComidaCompleja aux = new ComidaCompleja(super.getNombre(),super.getTipo(),super.getModo_preparacion()) ; 

		for (Comida c : conjuntoComidas) {
			aux.addComida(c.copyOf());
		}
		return aux;
	}

	@Override
	public double getCalorias() {
		double aux = 0 ; 
		
		for (Comida c : conjuntoComidas) {
			aux += c.getCalorias() ; 
		}
		
		return aux;
	}

	@Override
	public float getPrecio() {
		float aux = 0 ; 
		
		for (Comida c : conjuntoComidas) {
			aux += c.getCalorias() ; 
		}
		
		return aux;
	}

	@Override
	public int getTiempo() {
		int aux = 0 ; 
		
		for (Comida c : conjuntoComidas) {
			aux += c.getCalorias() ; 
		}
		
		return aux;
	}

}
