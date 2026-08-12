package S03.Actividad02;

public class Estudiante {
	String nombre;
	String carrera;
	double promedio;

	public Estudiante(String nombre, String carrera, double promedio) {
		this.nombre = nombre;
		this.carrera = carrera;
		this.promedio = promedio;
	}

	void mostrarDatos() {
		System.out.println("\nSoy " + nombre + ", estudio " + carrera + " y mi primedio es " + promedio);
	}

	void evaluarRendimiento() {
		if (promedio >= 9) {
			System.out.println("Excelente rendimiento\n");
		} else if (promedio >= 7 && promedio <= 8.9) {
			System.out.println("Buen rendimiento \n");
		} else {
			System.out.println("Necesita mejorar\n");
		}
	}
}
