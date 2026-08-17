package S05;

public class Animal {
	protected String nombre;
	protected int edad;

	public Animal(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	void sonido() {
		System.out.println(nombre +  " hizo un sonido. " + nombre + " tiene " + edad + " años de edad.");
	}
}
