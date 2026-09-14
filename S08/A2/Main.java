package S08.A2;

public class Main {
	public static void main(String[] args) {
		Gerente g = new Gerente("Samuel Sanchéz", 17350.50, 3482.55);
		Vendedor v = new Vendedor("Alejandro Urbano", 12755.50, 2500.00);

		System.out.println("=".repeat(60));
		System.out.println("-> Gerente: " + g.nombre + "\n	-> Salario base: " + g.salariobBase + "\n	-> Bono: " + g.getBono() + "\n	-> Suelto neto: " + g.calcularPago());
		System.out.println("=".repeat(60));
		System.out.println("-> Vendedor: " + v.nombre + "\n	-> Salario base: " + v.salariobBase + "\n	-> Bono: " + v.getComision() + "\n	-> Suelto neto: " + v.calcularPago());
		System.out.println("=".repeat(60));
	}
}
