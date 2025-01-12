package parque;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	private String nombre;
	private TipoDeAtraccion preferida;
	private double dinero, tiempo;
	private List<Producto> itinerario;
	
	// constructor de usuario
	public Usuario() {
	}

	public Usuario(String nombre, TipoDeAtraccion preferencia, double dinero, double tiempo) {
		if (validaNumeros(dinero)) {
			this.dinero = dinero;
		} else {
			this.dinero = 0;
		}
		if (validaNumeros(tiempo)) {
			this.tiempo = tiempo;
		} else {
			this.tiempo = 0;
		}

		this.nombre = nombre;
		this.preferida = preferencia;
		itinerario = new ArrayList<Producto>();
	}	

	public TipoDeAtraccion getAtraccionPreferida() {
		return preferida;
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
	
	public void comprarProducto(Producto producto) {
		if (this.dinero >= producto.getCosto() && this.tiempo >= producto.tiempoNecesario) {
			this.dinero -= producto.getCosto();
			this.tiempo -= producto.getTiempoNecesario();
			this.itinerario.add(producto);
		}
	}

	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", atracci�n preferida=" + preferida + ", dinero disponible=" + dinero + 
				", tiempo disponible=" + tiempo + "]";
	}
}
