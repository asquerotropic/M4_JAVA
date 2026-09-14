package S11.Actividad;

public class TelefonoMovil implements Recargable {
	private String marca;

	public TelefonoMovil(String marca) {
		this.marca = marca;
	}

	@Override
	public void iniciarCarga() {
		System.out.println("\nCable USB conectado.\n	->Cargando " + marca + " al 15%, tiempo estimado 45 minutos...");
	}
	
}
