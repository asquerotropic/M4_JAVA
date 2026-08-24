package S09.Abstraccion;

public class EnvioEstandar extends Envio {
	public EnvioEstandar(String destino) {
		super(destino);
	}

	//USO DEL MÉTODO ABSTRACTO
	@Override
	public double calcularCosto(double peso) {
		//TARIFA BASE $50 + $10 * CADA KILO
		return 50 + (10.0 *  peso);
	}
}
