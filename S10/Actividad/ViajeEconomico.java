package S10.Actividad;

public class ViajeEconomico extends Viaje {
	public ViajeEconomico(double distancia) {
		super(distancia);
	}

	@Override
	public double calcularTarifa() {
		return 15 * distancia;
	}	
}
