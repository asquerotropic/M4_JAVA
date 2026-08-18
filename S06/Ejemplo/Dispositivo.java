package S06.Ejemplo;

public class Dispositivo {
	protected String marca;
	protected String modelo;

	public Dispositivo(String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
	}

	void encender() {
		System.out.println("El dispositivo" +  marca +  " " + modelo + " se ha encendido.");
	}

	void mostrarInfo() {
		System.out.println("Marca: " +  marca +  "\nModelo: " + modelo);
	}
}
