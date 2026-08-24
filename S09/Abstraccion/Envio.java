package S09.Abstraccion;

public abstract class Envio {
	protected String destino;

	public Envio(String destino) {
		this.destino = destino;
	}

	//MÉTODO ABSTRACTO
	public abstract double calcularCosto(double peso);
}
