package S06.Ejemplo;

public class Celular extends Dispositivo{
	private String sistemaOp;
	private int almacenamiento;

	public Celular(String marca, String modelo, String sistemaOp, int almacenamiento) {
		super(marca, modelo);
		this.sistemaOp = sistemaOp;
		this.almacenamiento = almacenamiento;
	}

	void mostrarDetalles() {
		mostrarInfo();
		System.out.println("Sistema Operativo: " + sistemaOp + "\nAlmacenamiento: " + almacenamiento + "GB.");
	}

	void tomarFoto() {
		System.out.println("El " + marca + " " + modelo + " ha tomado una foto.");
	}
}
