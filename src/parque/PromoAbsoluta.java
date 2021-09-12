package parque;

import java.util.List;

public class PromoAbsoluta extends Promocion {
	
	//falta aplicarle el descuento / ya lo puse pero esta bien?
	private double descuento;

	public PromoAbsoluta() {
		super();
	}

	public PromoAbsoluta(TipoDeAtraccion tipo, String nombre, double costoDeVisita, double tiempoNecesario,
			int cupoPersonasPorDia, List<Atraccion> atraccionesIncluidas,double descuento) {
		super(tipo, nombre, costoDeVisita, tiempoNecesario, cupoPersonasPorDia, atraccionesIncluidas);
		this.descuento=descuento;
	}

	@Override
	public double getCosto() {
		return this.costo - descuento;
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
