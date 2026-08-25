package S09.Interfaz;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		TarjetaCredito tc = new TarjetaCredito("1234");
		PayPal pp = new PayPal("erikc.77@gmail.com");

		System.out.println("\nIngrese el total de su carrito de compras: ");
		double total = scanner.nextDouble();

		System.out.println("\n========== Intentando cobro con tarjeta ==========");
		tc.procesarPago(total);
		System.out.println("\n========== Intentando cobro con Paypal ==========");
		pp.procesarPago(total);
		System.out.println("\n");
		
		scanner.close();
	}
}
