package S01.POO;

public class Triangulo {
	//ATRIBUTOS
	double base;
	double altura;

	//CONSTRUCTOR INICIALIZA LOS ATRIBUTOS
	public Triangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}

	//METODO
	public double calcularArea() {
		return base * altura / 2;
	}
}