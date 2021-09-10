package parque;

import java.util.List;

public class PromoAbsoluta extends Promocion {
	
	//falta aplicarle el descuento

	public PromoAbsoluta() {
		super();
	}

	public PromoAbsoluta(TipoDeAtraccion tipo, String nombre, double costoDeVisita, double tiempoNecesario,
			int cupoPersonasPorDia, List<Atraccion> atraccionesIncluidas) {
		super(tipo, nombre, costoDeVisita, tiempoNecesario, cupoPersonasPorDia, atraccionesIncluidas);
	}

	@Override
	public double getCosto() {
		return this.costo;
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
