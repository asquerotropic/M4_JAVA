package S08.A1;

public class Main {
	public static void main(String[] args) {
		Pelicula p = new Pelicula("60 segundos", 190, "Dominic Sena");
		Serie s = new Serie("MindHunter", 40, 2);

		System.out.println("====================Película Favorita====================");
		p.mostrarInfo();
		System.out.println("====================Serie Favorita====================");
		s.mostrarInfo();
		System.out.println("=".repeat(60));
	}
}
