package S17;

import java.util.ArrayList;
import java.util.List;

public class Equipo {
	private String nombre;
	private List<Jugador> listaJugadores;
	
	public Equipo(String nombre) {
		this.nombre = nombre;
		this.listaJugadores = new ArrayList<>();
	}

	public void fichajeJugador(Jugador nuevoJugador) {
		listaJugadores.add(nuevoJugador);
		System.out.println("->" + nuevoJugador.getNJugador() + " has sido fichado.");
	}

	public void mostrarEquipo() {
		System.out.println("Equipo: " + nombre);
		for (Jugador j : listaJugadores) {
			System.out.println(">>Jugador: " + j.getNJugador());
		}
	}
}
