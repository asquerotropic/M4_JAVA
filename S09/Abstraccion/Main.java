package S09.Abstraccion;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		//OBJETO DE LA CLASE SCANNER PARA LEER LOS DATOS INGRESADOS
		Scanner scanner = new Scanner(System.in);

		System.out.println("\n====================Cotización de envíos====================");
		System.out.println("\n¿A qué ciudad se envía el paquete?: ");
		//GUARDA CADENA DE TEXTO
		String ciudad = scanner.nextLine(); 
		System.out.println("\nIngrese el peso del paquete en KG: ");
		//GUARDA NÚMERO CON DECIMALES
		double peso = scanner.nextDouble();
		EnvioEstandar op1 = new EnvioEstandar(ciudad);
		EnvioExpress op2 = new EnvioExpress(ciudad);

		System.out.println("=".repeat(80));

		System.out.println("\nCotización de envío para " + ciudad);
		System.out.println("	-> Costo del envio estándar: $" + op1.calcularCosto(peso));
		System.out.println("	-> Costo del envio express: $" + op2.calcularCosto(peso) + "\n");
		System.out.println("=".repeat(80));

		System.out.println("\n");
		scanner.close();
	}
}
