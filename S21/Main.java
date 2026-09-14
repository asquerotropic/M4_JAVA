package S21;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Taquilla mitaquilla = new Taquilla("Avengers: Dommsday", 44.90);

		boolean salir = false;

		while (!salir) {
			System.out.println("\n-------------------- Bienvenido al Cine--------------------\n[1] Comprar boletos.\n[2] Salir.\n-> Elige una opción: ");

			try {
				int op = sc.nextInt();
				sc.nextLine();

				if (op == 1) {
					System.out.println("¿Cuántos boletos desea comprar?: ");
					//AQUI EL USUARIO PUEDE INGRESAR CUALQUIER VALOR QUE NO SEA NÚMERO
					int cantidad = sc.nextInt();
					sc.nextLine();

					mitaquilla.procesarVenta(cantidad);
				} else if (op == 2) {
					salir = true;
					System.out.println("Cerrando el sistema de taquilla ¡Vuelve pronto!");
				} else {
					System.out.println("\nOPción no válida. Intenta de nuevo.");
				}
			} catch (Exception e) {
				System.out.println("\n[ERROR DEL SISTEMA] Por favor, ingresa únicamente números entertos.\nEl sistema ha sido protegido de un colapso.");
				sc.nextLine();
			}
		}
		sc.close();
	}
}
