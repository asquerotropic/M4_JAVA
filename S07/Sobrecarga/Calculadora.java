package S07.Sobrecarga;

public class Calculadora {
	//SOBRECARGA DE 2 ENTEROS
	public int sumar(int a, int b) {
		return a + b;
	}

	//SOBRECARGA DE 2 DECINALES
	public double sumar(double a, double b) {
		return a + b;
	}


	//SOBRECARGA DE 3 ENTEROS
    public int sumar(int a, int b, int c) {
        return a + b + c;
    }

}
