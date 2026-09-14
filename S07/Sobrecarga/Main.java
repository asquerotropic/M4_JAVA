package S07.Sobrecarga;

public class Main {
	public static void main(String[] args) {
		Calculadora c = new Calculadora();

		System.out.println("Suma de 2 valores enteros: " + c.sumar(5, 2));
		System.out.println("Suma de 2 valores decimales: " + c.sumar(49.5, 13.2));
		System.out.println("Suma de 3 valores enteros: " + c.sumar(5, 7, 9));
	}
}
