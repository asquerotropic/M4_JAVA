package S16.Composicion;

public class Casa {
	private String direccion;
	private Habitacion habitacion;

	public Casa(String direccion, String nombre, double medida) {
		this.direccion = direccion;
		this.habitacion = new Habitacion(nombre, medida);
	}

	public void mostrarInfo() {
		System.out.println("Dirección: " + direccion);
		habitacion.mostrarInfo();
	}
}
