package S16.Composicion;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.err.println("--------------- BÚSQUEDA DE HABITACIONES ---------------\n");
		System.out.print("Ingresa la dirección: ");
		String direccionCasa = scanner.nextLine();
		System.out.print("Ingresa el nommbre de la habitación: ");
		String nombreHabitacion = scanner.nextLine();
		System.out.print("Ingrega los metros cuadrados de la habitación: ");
		double medidaHabitacion = scanner.nextDouble();

		Casa casa = new Casa(direccionCasa, nombreHabitacion, medidaHabitacion);

		System.err.println("\n--------------- BÚSQUEDA\n");
		casa.mostrarInfo();
		System.err.println("\n---------------------------------------------");
		scanner.close();
	}
}
