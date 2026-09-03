package S16.Agregacion;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("-------------------- FICHAJES FÚTBOL --------------------\n");
		System.out.print("Nombre del jugador: ");
		String nombreJugador = entrada.nextLine();
		System.out.print("Posición del jugador: ");
		String posicionJugador = entrada.nextLine();

		Jugador jugador = new Jugador(nombreJugador, posicionJugador);

		System.out.print("Club del jugador: ");
		String clubJugador = entrada.nextLine();

		Club club = new Club(clubJugador, jugador);

		System.out.println("\n--------------------RESUMEN CONTRATACIÓN\n");
		club.mostrarInfo();

		System.out.println("\n------------------------------------------------------------");
		entrada.close();
	}
}
