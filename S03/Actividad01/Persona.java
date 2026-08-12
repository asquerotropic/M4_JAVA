package S03.Actividad01;

public class Persona {
	String nombre;
	int edad;

	public Persona (String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	void presentarse() {
		System.out.println("Hola, soy " + nombre + " y tengo " + edad + " años.\n");
	}
}
