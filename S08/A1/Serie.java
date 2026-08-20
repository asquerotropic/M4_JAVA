package S08.A1;

public class Serie extends Contenido {
	private int temporadas;

	public Serie(String titulo, int duracion, int temporadas) {
		super(titulo, duracion);
		this.temporadas = temporadas;
	}

	@Override
	void mostrarInfo() {
		System.out.println(">Título: " + titulo + "\n	> Duración: " + duracion + " minutos\n	> Temporadas: " + temporadas);
	}
}
