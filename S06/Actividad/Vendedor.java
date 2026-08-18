package S06.Actividad;

public class Vendedor extends Empleado {
	private double comision;
	private int ventas;

	public Vendedor(String nombre, String numeroEmpleado, double salario, double comision) {
		super(nombre, numeroEmpleado, salario);
		this.comision = comision;
		this.ventas = 0;
	}

	public void registrarVentaExitosa() {
		this.ventas++;
		System.out.println(" -> [Vendedor] " + getNombre() + " registró una venta. Ventas realizadas: " + this.ventas);
	}

	public double getComision() {
		return comision;
	}
}
