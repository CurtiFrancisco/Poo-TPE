package Comida;
import java.util.ArrayList;

public class ComidaCompleja extends Comida{
	private double calorias;
	private double precio;
	private int tiempo;
	private ArrayList<ComidaSimple>	conjuntoComidas;
	
	public ComidaCompleja(String nombre, String tipo, String modo_preparacion) {
		super(nombre,tipo,modo_preparacion);
		this.conjuntoComidas = new ArrayList<>();
		this.calorias = 0 ;
		this.precio = 0;
		this.tiempo = 0;
	}
	public ComidaCompleja(String nombre, String tipo, String modo_preparacion, ArrayList<ComidaSimple> comidasSimples) {
		super(nombre,tipo,modo_preparacion);
		this.conjuntoComidas = new ArrayList<>();
		//this.conjuntoComidas = comidasSimples;
		for (ComidaSimple comida : comidasSimples ){
				this.conjuntoComidas.add(comida);
				this.calorias += comida.getCalorias();
				this.precio += comida.getPrecio();
				this.tiempo += comida.getTiempo();			//Lo mismo que hiciste al agregar
		 }
	}
		
	public void addComidaSimple(ComidaSimple comida) {
		if (!this.conjuntoComidas.contains(comida)) {
			this.conjuntoComidas.add(comida);
			this.calorias +=comida.getCalorias();
			this.precio +=comida.getPrecio();
			this.tiempo +=comida.getTiempo();
		}
	}
	public double getCalorias() {
		return calorias;
	}

	public double getPrecio() {
		return precio;
	}

	public int getTiempo() {
		return tiempo;
	}

	public ArrayList<ComidaSimple> getConjunto_comidas() {
		return conjuntoComidas; //Cambiar esto.
	}

}
