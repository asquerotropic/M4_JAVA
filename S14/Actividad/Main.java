package S14.Actividad;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Suscripcion socio = null;
		//double total = 0.0;

		System.out.println("++++++++++++++++++++++++++++++ Gimnasio ++++++++++++++++++++++++++++++\n");
		System.out.print("Escribe el nombre del soci@: ");
		String nombre = scanner.nextLine();

		System.out.print("Escribe los meses a pagar: ");
		int meses = scanner.nextInt();	

		System.out.println("\nSelecciona el tipo de plan: ");
		System.out.println("1. Plan Básico.");
		System.out.println("2. Plan Premium.");
		System.out.print("Opción: ");
		int opcion = scanner.nextInt();	

		if (opcion == 1) {
			socio = new PlanBasico(nombre, meses);
			//total = socio.cacularTotal();
		} else if (opcion == 2) {
			System.out.print("\nIngrese el cargo por uso del spa: ");
			double spa = scanner.nextDouble();
			socio = new PlanPremium(nombre, meses, spa);
			//total = socio.cacularTotal();
			//System.out.println("\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
			//System.out.println(nombre + ", el total de tu suscripción al plan premium, por " + meses + " mes(es), es de: $" + total);
		} else {
			System.out.println("\nOpción incorrecta.");
		}

		if (socio != null) {
			System.out.println("\n++++++++++ Resumen de pago");
			System.out.println("-> Socio: " + nombre);
			System.out.println("-> Total a pagar: " + socio.cacularTotal());
		}

		System.out.println("\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		scanner.close();
	}
}