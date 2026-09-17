package ACT4B.main;

import java.util.ArrayList;
import java.util.Scanner;

import ACT4B.modelo.Ciudadano;
import ACT4B.modelo.Requisito;
import ACT4B.modelo.SolicitudLicencia;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<SolicitudLicencia> listaSolicitudes = new ArrayList<>();
		boolean salir = false;
		int cFolio = 1001;

		System.out.println("\n-------------------- Ventanilla de Trámites Ciudadanos --------------------");
		while (!salir) {
			System.out.println("\n-------------------- Menú Principal\n");
			System.out.println("1. Registrar nuevo trámite de licencia.");
			System.out.println("2. Consultar historial de trámites.");
			System.out.println("3. Salir del sistema.");
			System.out.print("Elija una opción: ");
			int op = sc.nextInt();
			sc.nextLine();

			if (op == 1) {
				System.out.println("\n[A] Datos del ciudadano");
				System.out.print("-> Nombre completo: ");
				String nombre = sc.nextLine();
				System.out.print("-> CURP: ");
				String curp = sc.nextLine();
				System.out.print("-> Teléfono: ");
				String telefono = sc.nextLine();

				Ciudadano ciudadano = new Ciudadano(nombre, curp, telefono);

				System.out.println("\n[B] Datos del trámite");
				System.out.print("-> Tipo de licencia: Primera vez / Renovación: ");
				String tipoLicencia = sc.nextLine();

				Requisito requisito = new Requisito("Identificación oficial y comprobante de domicilio");
				System.out.print("-> ¿El ciudadano entregó todos los documentos? 1. Si - 2. No: ");
				int entrego = sc.nextInt();

				if (entrego == 1) {
					requisito.marcarComoEntregado();
				}

				SolicitudLicencia nuevaSolicitud = new SolicitudLicencia(cFolio, tipoLicencia, ciudadano, requisito);
				nuevaSolicitud.procesarSolicitud();
				listaSolicitudes.add(nuevaSolicitud);
				cFolio++;
			} else if (op == 2) {
				System.out.println("\n -------------------- Historial de trámites");
				if (listaSolicitudes.isEmpty()) {
					System.err.println("\n -> Aún no hay ningún trámite registrado en el sistema.");
				} else {
					for (int i = 0; i < listaSolicitudes.size(); i++) {
						System.out.println("\n	>> Registro #" + (i + 1) + ": ");
						listaSolicitudes.get(i).consultarEstado();
					}
				}
			} else if (op == 3) {
				salir = true;
				System.out.println("\n	-> Cerrando la ventanilla... ¡Se han guardado " + listaSolicitudes.size() + " trámites hoy!\n");
			} else {
				System.out.println("\n-> Opción no válida. Por favor intenta de nuevo.");
			}
		}
		sc.close();
	}
}
