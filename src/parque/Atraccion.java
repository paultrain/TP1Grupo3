package parque;

public class Atraccion extends Producto {

	public Atraccion() {
		super();
	}

	public Atraccion(String nombre, double costoDeVisita,

			double tiempoNecesario, int cupoPersonasPorDia, TipoDeAtraccion tipo) {
		super(nombre, costoDeVisita, tiempoNecesario, cupoPersonasPorDia, tipo);
	}

	@Override
	public String toString() {
		return "Atraccion [nombre=" + nombre + ", costoDeVisita=" + costoDeVisita + ", tiempoNecesario="
				+ tiempoNecesario + ", CupoPersonasPorDia=" + CupoPersonasPorDia + ", tipo=" + tipo + "]";
	}
	

}
