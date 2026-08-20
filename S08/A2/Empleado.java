package S08.A2;

public class Empleado {
	protected String nombre;
	protected double salariobBase;

	public Empleado(String nombre, double salariobBase) {
		this.nombre = nombre;
		this.salariobBase = salariobBase;
	}

	public double calcularPago() {
		return salariobBase;
	}
}
