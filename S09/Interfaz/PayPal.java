package S09.Interfaz;

public class PayPal implements ProcesadorPago {
	private String correo;

	public PayPal(String correo) {
		this.correo = correo;
	}

	//SOBREESCRIBE EL MÉTODO DE LA INTERFAZ
	@Override
	public void procesarPago(double monto) {
		System.out.println("Conectando con PayPal...\nCobro de: $" + monto + " a " + correo + " ¡Completado!");
	}
	
}
