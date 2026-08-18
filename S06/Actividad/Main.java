package S06.Actividad;

public class Main {
	public static void main(String[] args) {
		System.out.println("==================== EJERCICIO 06 ====================");
		Gerente gerente = new Gerente("Ana Laura", "AL-12345", 15000.0, 3000.0);
		Vendedor vendedor = new Vendedor("María de los Angeles", "MA-12345", 1000.0, 5.0);

		System.out.println("==================== Gerente");
		System.out.println(gerente.obtenerIdentificacion());
		gerente.asignarNuevoBono(5000);

		System.out.println("==================== Vendedor");
		System.out.println(vendedor.obtenerIdentificacion());
		vendedor.registrarVentaExitosa();
		vendedor.registrarVentaExitosa();
		vendedor.registrarVentaExitosa();
	}
}
