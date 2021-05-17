package Comida;

public class Comida {
	//hola
	private String nombre;
	private String tipo;
	private String modo_preparacion;
	private double calorias;
	private double precio;
	private int tiempo;
	public Comida(String nombre, String tipo, String modo_preparacion) {
		super();
		this.nombre = nombre;
		this.tipo = tipo;
		this.modo_preparacion = modo_preparacion;
	}
	public String getNombre() {
		return nombre;
	}
	public String getTipo() {
		return tipo;
	}
	public String getModo_preparacion() {
		return modo_preparacion;
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
	
	
	
	
	
	
}
