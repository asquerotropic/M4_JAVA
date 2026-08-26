package S10.Actividad;

public abstract class Viaje {
	protected double distancia;

	public Viaje(double distancia) {
		this.distancia = distancia;
	}

	public abstract double calcularTarifa();
}
