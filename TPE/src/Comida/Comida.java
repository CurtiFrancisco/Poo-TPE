package Comida;

public abstract class Comida {
	
	private String nombre;
	private String tipo;
	private String modo_preparacion;
	
	
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
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public void setModo_preparacion(String modo_preparacion) {
		this.modo_preparacion = modo_preparacion;
	}

	public abstract double getCalorias() ;
	public abstract float getPrecio() ; 
	public abstract int getTiempo() ;
	public abstract Comida copyOf() ;

	@Override
	public boolean equals(Object obj) {
		try {
			
			Comida c1 = (Comida) obj ;
			boolean modoPreparacion = this.modo_preparacion.equals(c1.getModo_preparacion()) ; 
			boolean tipo = this.tipo.equals(c1.getTipo()) ; 
			boolean nombre = this.getNombre().equals(c1.getNombre()) ; 
			return ( modoPreparacion && tipo && nombre ) ; 
			
		} catch(Exception e) {
			return false ; 
		}	
	} 
	
	
	
	
	
}
