package S10.Actividad;

public class ViajeEconomico extends Viaje {
	public ViajeEconomico(double distancia) {
		super(distancia);
	}

	@Override
	public double calcularTarifa() {
		double total = 15.0 * distancia;
		return Math.round(total * 100.0) / 100.0;
	}	
}
