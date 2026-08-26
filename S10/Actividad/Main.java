package S10.Actividad;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("\n==================== Costo Viaje ====================");
		System.out.print("\n¿De cuantós kilómetros es tu recorrido?: ");
		double kilometros = scanner.nextDouble();

		ViajeEconomico ve = new ViajeEconomico(kilometros);
		ViajeVIP vv = new ViajeVIP(kilometros);
		System.out.println("");
		System.out.println("=".repeat(55));

		System.out.println("\nCosto del viaje por " + kilometros + " kilómetros");
		System.out.println("	-> Viaje ecónomico: $" + ve.calcularTarifa());
		System.out.println("	-> Viaje VIP: $" + vv.calcularTarifa() + "\n");
		System.out.println("=".repeat(55));

		scanner.close();
	}
}
