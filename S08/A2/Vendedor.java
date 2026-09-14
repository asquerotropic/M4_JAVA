package S08.A2;

public class Vendedor extends Empleado {
	private double comision;

	public Vendedor(String nombre, double salariobBase, double comision) {
		super(nombre, salariobBase);
		this.comision = comision;
	}

	@Override
	public double calcularPago() {
		return salariobBase + comision;
	}

	public double getComision() {
		return comision;
	}
}
