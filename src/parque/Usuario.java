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
		if (validaNumeros(dinero)) {
			this.dinero = dinero;
		} else {
			this.dinero = 0;
		}
		if (validaNumeros(tiempo)) {
			this.tiempoDisponible = tiempo;
		} else {
			this.tiempoDisponible = 0;
		}

		this.nombre = nombre;

		this.preferida = preferencia;

	}

	// Validacion de Doubles positivos
	private boolean validaNumeros(double valor) {
		boolean confirmacion = false;
		if (valor < 0) {
			throw new NumberFormatException("El valor no puede ser negativo");
		} else {
			confirmacion = true;
		}

		return confirmacion;
	}

//To String con el orden del archivo csv
	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", preferida=" + preferida + ", dinero=" + dinero + ", tiempoDisponible="
				+ tiempoDisponible + "]";
	}
}
