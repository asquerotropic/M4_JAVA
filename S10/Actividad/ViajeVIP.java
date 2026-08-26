package S10.Actividad;

public class ViajeVIP extends Viaje {
	public ViajeVIP(double distancia) {
		super(distancia);
	}
	
	@Override
	public double calcularTarifa() {
		return 25 * distancia;
	}
}
