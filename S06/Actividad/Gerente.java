package S06.Actividad;

public class Gerente extends Empleado {
	private double bono;

	public Gerente (String nombre, String numeroEmpleado, double salario, double bono) {
		super(nombre, numeroEmpleado, salario);
		this.bono = bono;
	}

	public void asignarNuevoBono(double monto) {
		this.bono = monto;
		System.out.println(" -> [Gerente] Se actualizó el bono de " + getNombre() + " a: $" + bono);
	}

	public double getBono() {
		return bono;
	}
}
