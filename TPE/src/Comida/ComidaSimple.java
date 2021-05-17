package Comida;

public class ComidaSimple extends Comida{
	private double calorias;
	private double precio;
	private int tiempo;

	public ComidaSimple(String nombre, String tipo, String modo_preparacion, double calorias, double precio,
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
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getTiempo() {
		return tiempo;
	}
	public void setTiempo(int tiempo) {
		this.tiempo = tiempo;
	}
		
	


}
