package S14.Actividad;

public class PlanBasico extends Suscripcion {
	public PlanBasico(String nombre, int meses) {
		super(nombre, meses);
	}

	@Override
	public double cacularTotal() {
		return meses * 400;
	}
	
}
