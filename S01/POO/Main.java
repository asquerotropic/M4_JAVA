package S01.POO;

public class Main {
	public static void main(String[] args) {
		Triangulo fig1 = new Triangulo(10, 6); //INSTANCIA QUE CREA UN OBJETO DE LA CLASE TRIANGULO CON ATRIBUTOS
		Triangulo fig2 = new Triangulo(15, 5);
		Triangulo fig3 = new Triangulo(18, 9);

		System.out.println("El área del triangulo es: " +  fig1.calcularArea()); //IMPRIME EL RESULTADO DE LA FUNCIÓN QUE LLAMÓ EL OBJETO
		System.out.println("El área del triangulo 2 es: " +  fig2.calcularArea());
		System.out.println("El área del triangulo 3 es: " +  fig3.calcularArea());
	}
}