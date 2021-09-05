package parque;

public class Usuario {
	private String nombre;
	private TipoDeAtraccion preferida;
	private double dinero, tiempoDisponible;

	// private List<Itinerario> = new ArrayList<Itinerario>();
	public Usuario() {
	}

	public TipoDeAtraccion getAtraccionPreferida() {
		return preferida;
	}

	// constructor de usuario
	public Usuario(String nombre, TipoDeAtraccion preferencia, double dinero, double tiempo) {
		validaNumeros(dinero);
		validaNumeros(tiempo);
		this.nombre = nombre;
		this.preferida = preferencia;
		this.dinero = dinero;
		this.tiempoDisponible = tiempo;
	}

	// Validacion de Doubles positivos
	private void validaNumeros(double valor) {
		if (valor < 0) {
			throw new NumberFormatException("El valor no puede ser negativo");
		}
	}

//To String con el orden del archivo csv
	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", preferida=" + preferida + ", dinero=" + dinero + ", tiempoDisponible="
				+ tiempoDisponible + "]";
	}
}
