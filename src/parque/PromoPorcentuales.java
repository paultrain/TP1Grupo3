package parque;

import java.util.List;

public class PromoPorcentuales extends Promocion {
	
	private int descuento;

	public PromoPorcentuales() {
		super();
	}

	public PromoPorcentuales(TipoDeAtraccion tipo, String nombre, double costoDeVisita, double tiempoNecesario,
			int cupoPersonasPorDia, List<Atraccion> atraccionesIncluidas, int descuento) {
		super(tipo, nombre, costoDeVisita, tiempoNecesario, cupoPersonasPorDia, atraccionesIncluidas);
		this.descuento = descuento;
	}

	@Override
	public double getCosto() {
		return this.costo - this.descuento;
	}

	@Override
	public double getTiempoNecesario() {
		double tiempo = 0;
		for (Atraccion atrac : atraccionesIncluidas){
			tiempo += atrac.getTiempoNecesario();
		}
		return tiempo;
	}
}
