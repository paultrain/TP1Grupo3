package parque;

public class Usuario {
	
	private TipoDeAtraccion atraccionPreferida;
	private String nombre;
	private int presupuesto;
	private double tiempoDisponible;
	
	public Usuario() {
	}
	
	public Usuario(TipoDeAtraccion atraccionPreferida, String nombre, int presupuesto, double tiempoDisponible) {
		this.atraccionPreferida = atraccionPreferida;
		this.nombre = nombre;
		this.presupuesto = presupuesto;
		this.tiempoDisponible = tiempoDisponible;
	}

	@Override
	public String toString() {
		return "Usuario [Atracción preferida=" + atraccionPreferida + ", nombre=" + nombre + ", presupuesto=" + presupuesto
				+ ", tiempo Disponible=" + tiempoDisponible + "]";
	}

	public TipoDeAtraccion getAtraccionPreferida() {
		return atraccionPreferida;
	}
	
	
	
	

}
