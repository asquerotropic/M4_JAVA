package S10.Actividad;

public class ViajeVIP extends Viaje {
	public ViajeVIP(double distancia) {
		super(distancia);
	}
	
	@Override
	public double calcularTarifa() {
		double total = (25 * distancia) + 50;
		return Math.round(total * 100.0) / 100.0;
	}
}
