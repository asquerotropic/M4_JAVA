package S03.Actividad02;

public class Main {
	public static void main(String[] args) {
		Estudiante e1 = new Estudiante("Eric Contreras", "Ingeniería de Software", 8.9);
		Estudiante e2 = new Estudiante("Ana Laura López", "Comunicación", 9.4);
		Estudiante e3 = new Estudiante("Samuel Sanchéz", "Psicología", 6.9);

		e1.mostrarDatos();
		e1.evaluarRendimiento();
		e2.mostrarDatos();
		e2.evaluarRendimiento();
		e3.mostrarDatos();
		e3.evaluarRendimiento();
	}
}
