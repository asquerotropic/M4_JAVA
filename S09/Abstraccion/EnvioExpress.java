package S09.Abstraccion;

public class EnvioExpress extends Envio {

	public EnvioExpress(String destino) {
		super(destino);
	}

	//USO DEL MÉTODO ABSTRACTO
	@Override
	public double calcularCosto(double peso) {
		//TARIFA BASE $100 + $25 * CADA KILO
		return 100 + (25.0 *  peso);
	}
}
