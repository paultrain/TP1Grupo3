package parque;

public class Atraccion extends Producto{

	public Atraccion() {
		super();
	}

	public Atraccion(TipoDeAtraccion tipo, String nombre, double costoDeVisita, double tiempoNecesario,
			int cupoPersonasPorDia) {
		super(tipo, nombre, costoDeVisita, tiempoNecesario, cupoPersonasPorDia);
		}

	
}
