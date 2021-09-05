package parque;

public abstract class Producto {
	protected String nombre;
	protected double costoDeVisita;
	protected double tiempoNecesario;
	protected int CupoPersonasPorDia;
	protected TipoDeAtraccion tipo;
	public Producto() {
	}
	
	public Producto(String nombre, double costoDeVisita, double tiempoNecesario,
			int cupoPersonasPorDia,TipoDeAtraccion tipo) {
		this.tipo = tipo;
		this.nombre = nombre;
		this.costoDeVisita = costoDeVisita;
		this.tiempoNecesario = tiempoNecesario;
		CupoPersonasPorDia = cupoPersonasPorDia;
	}
	
	public boolean esPromo() {
		return false;
	}

	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", costoDeVisita=" + costoDeVisita + ", tiempoNecesario="
				+ tiempoNecesario + ", CupoPersonasPorDia=" + CupoPersonasPorDia + ", tipo=" + tipo + "]";
	}

	
	
	
	
	

}
