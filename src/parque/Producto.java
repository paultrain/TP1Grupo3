package parque;

public abstract class Producto {
	
	protected TipoDeAtraccion tipo;
	protected String nombre;
	protected double costoDeVisita;
	protected double tiempoNecesario;
	protected int CupoPersonasPorDia;
	
	public Producto() {
	}
	
	public Producto(TipoDeAtraccion tipo, String nombre, double costoDeVisita, double tiempoNecesario,
			int cupoPersonasPorDia) {
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
		return "Producto [tipo=" + tipo + ", nombre=" + nombre + ", costo=" + costoDeVisita
				+ ", tiempo Necesario=" + tiempoNecesario + ", Cupo de Personas Por Dia=" + CupoPersonasPorDia + "]";
	}
	
	
	
	
	

}
