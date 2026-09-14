package S16.Composicion;

public class Habitacion {
	private String nombreHabitacion;
	private double metrosCuadrados;

	public Habitacion(String nombreHabitacion, double metrosCuadrados) {
		this.nombreHabitacion = nombreHabitacion;
		this.metrosCuadrados = metrosCuadrados;
	}

	public void mostrarInfo() {
		System.out.println("	-> Habitación: " + nombreHabitacion + "\n	-> Tamaño: " + metrosCuadrados + " m^2");
	}
}
