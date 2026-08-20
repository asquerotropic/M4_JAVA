package S08.A1;

public class Pelicula extends Contenido {
	private String director;

	public Pelicula(String titulo, int duracion, String director) {
		super(titulo, duracion);
		this.director = director;
	}

	@Override
	void mostrarInfo() {
		System.out.println("> Título: " + titulo + "\n	> Duración: " + duracion + " minutos\n	> Director: " + director);
	}
}