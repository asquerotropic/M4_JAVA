package S05;

public class Perro extends Animal {
	private String raza;

	public Perro(String nombre, int edad, String raza) {
		super(nombre, edad);
		this.raza = raza;
	}

	@Override
	void sonido() {
		System.out.println(nombre + " ladra: ¡Guau!");
	}

	void moverCola() {
		System.out.println(nombre + " de raza " + raza + " tiene " + edad + " años de edad y mueve la cola felizmente.");
	}
}
