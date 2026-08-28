package S11.Actividad;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("\n-------------------- Estación de carga inteligente --------------------\n");
		System.out.print("Índica la marca de tu teléfono movil: ");
		String telefono = scanner.nextLine();

		System.out.print("\nÍndica el modelo de tu Automóvil: ");
		String modelo = scanner.nextLine();

		TelefonoMovil tm = new TelefonoMovil(telefono);
		AutoElectrico ae = new AutoElectrico(modelo);

		System.out.println("");
		System.out.println("-".repeat(65));
		tm.iniciarCarga();
		ae.iniciarCarga();
		System.out.println("");
		System.out.println("-".repeat(65));

		scanner.close();
	}
}
