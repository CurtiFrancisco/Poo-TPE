package Comida;
import java.util.ArrayList;

public class Pedido {
	private ArrayList<Comida> comidas;
	private int mesa;
	private String mozo;
	
	
	
	
	public Pedido(int mesa, String mozo) {
		super();
		this.comidas = new ArrayList<>();
		this.mesa = mesa;
		this.mozo = mozo;
	}
	public ArrayList<Comida> getComidas() {
		return comidas;
	}
	public int getMesa() {
		return mesa;
	}
	public String getMozo() {
		return mozo;
	}
	
	public void addComida(Comida comida) {
		comidas.add(comida); 
	}
	public void modificarComida(Comida comidaModificada, Comida comida) {
		if (this.comidas.contains(comida)) {
			this.comidas.remove(comida);
			this.comidas.add(comidaModificada);
		}
	}
	
	
}
