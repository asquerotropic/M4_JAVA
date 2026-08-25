package S09.Interfaz;

public class TarjetaCredito implements ProcesadorPago {
	private String terminacion;

	public TarjetaCredito(String terminacion) {
		this.terminacion = terminacion;
	}

	//SOBREESCRIBE EL MÉTODO DE LA INTERFAZ
	@Override
	public void procesarPago(double monto) {
		System.out.println("Cobrando: $" + monto + " a la tarjeta con terminación: " + terminacion);
	}
}
