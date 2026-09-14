package S17;

public class Main {
	public static void main(String[] args) {
		Equipo miEquipo = new Equipo("Curso");

		Jugador j1 = new Jugador("Maribel Blancas");
		Jugador j2 = new Jugador("Eric Contreras");
		Jugador j3 = new Jugador("Marco Cortez");
		Jugador j4 = new Jugador("Juan Ramirez");
		Jugador j5 = new Jugador("Juan Piedra");
		Jugador j6 = new Jugador("Minerva Crescencio");
		Jugador j7 = new Jugador("Sebastian Martinez");
		Jugador j8 = new Jugador("Ana Fuentes");
		Jugador j9 = new Jugador("Yadira Ramos");
		Jugador j10 = new Jugador("Emmanuel Garcia");
		Jugador j11 = new Jugador("Eric Morales");
		Jugador j12 = new Jugador("Mallely Vargas");

		miEquipo.fichajeJugador(j1);
		miEquipo.fichajeJugador(j2);
		miEquipo.fichajeJugador(j3);
		miEquipo.fichajeJugador(j4);
		miEquipo.fichajeJugador(j5);
		miEquipo.fichajeJugador(j6);
		miEquipo.fichajeJugador(j7);
		miEquipo.fichajeJugador(j8);
		miEquipo.fichajeJugador(j9);
		miEquipo.fichajeJugador(j10);
		miEquipo.fichajeJugador(j11);
		miEquipo.fichajeJugador(j12);

		miEquipo.mostrarEquipo();
	}
}
