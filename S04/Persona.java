package S04;

public class Persona {
	//DECLARACIÓN DE ATRIBUTOS PRIVADOS
	private String nombre;
	private int edad;

	//CONSTRUCTOR
	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	//MÉTODO GET
	public String getNombre() {
        return nombre;
    }

	//MÉTODO GET
	public int getEdad() {
        return edad;
    }

	//MÉTODO SET
	public int setEdad(int nuevaEdad) {
		return edad = nuevaEdad;
	}

	void mostrarDatos() {
		System.out.println("=".repeat(20));
		System.out.println("Actividad Encapsulamiento");
		System.out.println("=".repeat(20));
		System.out.println("Nombre: " + nombre + "\nEdad: " + edad);
		System.out.println("=".repeat(20));
	}
}
