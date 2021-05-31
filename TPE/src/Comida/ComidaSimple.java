package Comida;

public class ComidaSimple extends Comida{
	
	private double calorias;
	private float precio;
	private int tiempo;
	
	
	public ComidaSimple(String nombre, String tipo, String modo_preparacion, double calorias, float precio,
			int tiempo) {
		super(nombre,tipo,modo_preparacion);
		this.calorias = calorias;
		this.precio = precio;
		this.tiempo = tiempo;
	}
	public double getCalorias() {
		return calorias;
	}
	public void setCalorias(double calorias) {
		this.calorias = calorias;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public int getTiempo() {
		return tiempo;
	}
	public void setTiempo(int tiempo) {
		this.tiempo = tiempo;
	}
	@Override
	public Comida copyOf() {
		ComidaSimple c = new ComidaSimple(this.getNombre(),this.getTipo(),
										  this.getModo_preparacion(), this.getCalorias(),
										  this.getPrecio(),this.getTiempo()) ; 
		return c;
	}
		
	


}
