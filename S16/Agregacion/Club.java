package S16.Agregacion;

public class Club {
	private String nombreClub;
	//RELACIÓN AGREGACIÓN
	private Jugador jugador;

	public Club(String nombreClub, Jugador jugador) {
		this.nombreClub = nombreClub;
		this.jugador = jugador;
	}

	public void mostrarInfo() {
		System.out.println("Club: " + nombreClub);
		System.out.println("	-> Jugador: " + jugador.getNombre() + " (" + jugador.getPosicion() + ")");
	}
}
