package Comida;
import java.util.ArrayList;

public class ComidaCompleja extends Comida{
	

	private ArrayList<Comida> conjuntoComidas;
	
	public ComidaCompleja(String nombre, String tipo, String modo_preparacion) {
		super(nombre,tipo,modo_preparacion);
		this.conjuntoComidas = new ArrayList<>();
	}
	
	public ComidaCompleja(String nombre, String tipo, String modo_preparacion, ArrayList<Comida> comidas) {
		super(nombre,tipo,modo_preparacion);
		this.conjuntoComidas = new ArrayList<>();
		this.conjuntoComidas.addAll(comidas) ;
	}
		
	public void addComidaSimple(ComidaSimple comida) {
		if (!this.conjuntoComidas.contains(comida)) {
			this.conjuntoComidas.add(comida);
		}
	}
	

	@Override
	public Comida copyOf() {
		// TODO Auto-generated method stub
		return null;
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
