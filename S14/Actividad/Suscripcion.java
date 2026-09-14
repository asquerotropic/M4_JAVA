package S14.Actividad;

public abstract class Suscripcion {
	protected String nombre;
	protected int meses;

	public Suscripcion(String nombre, int meses) {
		this.nombre = nombre;
		this.meses = meses;
	}

	public abstract double cacularTotal();
}
