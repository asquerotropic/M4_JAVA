package S08.A2;

public class Gerente extends Empleado {
	private double bono;

	public Gerente(String nombre, double salariobBase, double bono) {
		super(nombre, salariobBase);
		this.bono = bono;
	}
	
	@Override
	public double calcularPago() {
		return salariobBase + bono;
	}

	public double getBono() {
		return bono;
	}
}
