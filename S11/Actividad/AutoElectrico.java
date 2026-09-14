package S11.Actividad;

public class AutoElectrico implements Recargable{
	private String modelo;

	public AutoElectrico(String modelo) {
		this.modelo = modelo;
	}

	@Override
	public void iniciarCarga() {
		System.out.println("\nCable de alta tensión conectado:\n	->Cargando " + modelo + " al 37%, tiempo estimado 6 horas...");
	}
	
}
