package S14.Actividad;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Suscripcion socio = null;
		double total = 0.0;

		System.out.println("++++++++++++++++++++++++++++++ Gimnasio ++++++++++++++++++++++++++++++\n");
		System.out.print("Escribe el nombre del soci@: ");
		String nombre = scanner.nextLine();
		System.out.print("Escribe los meses a pagar: ");
		int meses = scanner.nextInt();	
		System.out.println("Selecciona el tipo de plan: ");
		System.out.println("1. Plan Básico.");
		System.out.println("2. Plan Premium.");
		System.out.print("Opción: ");
		int opcion = scanner.nextInt();	

		if (opcion == 1) {
			socio = new PlanBasico(nombre, meses);
			total = socio.cacularTotal();
			System.out.println("\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
			System.out.println(nombre + ", el total de tu suscripción al plan básico, por " + meses + " mes(es), es de: $" + total);
		} else if (opcion == 2) {
			System.out.print("Ingrese el cargo por uso del spa: ");
			double spa = scanner.nextDouble();
			socio = new PlanPremium(nombre, meses, spa);
			total = socio.cacularTotal();
			System.out.println("\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
			System.out.println(nombre + ", el total de tu suscripción al plan premium, por " + meses + " mes(es), es de: $" + total);
		} else {
			System.out.println("\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
			System.out.println("Opción incorrecta.");
		}

		System.out.println("\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

		scanner.close();
	}
}
