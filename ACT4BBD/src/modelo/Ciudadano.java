package ACT4BBD.src.modelo;

public class Ciudadano {
	// CREACIÓN DE ATRIBUTOS DE LA CLASE
	private String nombre;
	private String CURP;
	private String telefono;

	// CREACIÓN DEL CONSTRUCTOS DE LA CLASE
	public Ciudadano(String nombre, String CURP, String telefono) {
		this.nombre = nombre;
		this.CURP = CURP;
		this.telefono = telefono;
	}

	// MÉTODO PARA MOSTRAR LA INFORMACIÓN DEL CIUDADANO
	public void mostrarInfo() {
		System.out.println("\n	-> Ciudadano: " + nombre + "\n	-> CURP: " + CURP + "\n	-> Teléfono: " + telefono);
	}

	// CREACIÓN DE LOS METODOS GETTERS
	public String getNombre() {
		return nombre;
	}

	public String getCURP() {
		return CURP;
	}

	public String getTelefono() {
		return telefono;
	}
}
