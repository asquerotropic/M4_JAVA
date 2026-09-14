package S06.Actividad;

public class Empleado {
	private String nombre;
	private String numeroEmpleado;
	private double salario;

	public Empleado(String nombre, String numeroEmpleado, double salario) {
		this.nombre = nombre;
		this.numeroEmpleado = numeroEmpleado;
		this.salario = salario;
	}

	public String obtenerIdentificacion() {
		return "Nombre: " + this.nombre + " | No. Empleado: " + this.numeroEmpleado;
	}

	public String getNombre() {
		return nombre;
	}

	public String getNumeroEmpleado() {
		return numeroEmpleado;
	}

	public double getSalario() {
		return salario;
	}
}
