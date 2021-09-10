package parque;

public abstract class Producto {
	protected String nombre;
	protected double costo;
	protected double tiempoNecesario;
	protected int cupoPersonas;
	protected TipoDeAtraccion tipo;
	
	public Producto() {
	}
	
	public Producto(String nombre, double costo, double tiempoNecesario,
			int cupoPersonas,TipoDeAtraccion tipo) {
		this.tipo = tipo;
		this.nombre = nombre;
		this.costo = costo;
		this.tiempoNecesario = tiempoNecesario;
		this.cupoPersonas = cupoPersonas;
	}
	
	public abstract boolean esPromo();		
	public abstract double getCosto();
	public abstract double getTiempoNecesario();

	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", costoDeVisita=" + costo + ", tiempoNecesario="
				+ tiempoNecesario + ", CupoPersonasPorDia=" + cupoPersonas + ", tipo=" + tipo + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Producto other = (Producto) obj;
		if (Double.doubleToLongBits(costo) != Double.doubleToLongBits(other.costo))
			return false;
		if (cupoPersonas != other.cupoPersonas)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (Double.doubleToLongBits(tiempoNecesario) != Double.doubleToLongBits(other.tiempoNecesario))
			return false;
		if (tipo != other.tipo)
			return false;
		return true;
	}

	
}
