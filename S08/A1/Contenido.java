package S08.A1;

public class Contenido {
	protected String titulo;
	protected int duracion;

	public Contenido(String titulo, int duracion) {
		this.titulo = titulo;
		this.duracion = duracion;
	}

	void mostrarInfo() {
		System.out.println(">Título: " + titulo + "\n> Duración: " + duracion + " minutos.");
	}
}
