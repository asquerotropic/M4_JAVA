package S14.Actividad;

public class PlanPremium extends Suscripcion {
	private double spa;

	public PlanPremium(String nombre, int meses, double spa) {
		super(nombre, meses);
		this.spa = spa;
	}

	@Override
	public double cacularTotal() {
		return (meses * 600) + spa;
	}
	
}
