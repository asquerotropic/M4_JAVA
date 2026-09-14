package S21;

public class Taquilla {
	private String nombrePelicula;
	private double precioBoletos;

	public Taquilla(String nombrePelicula, double precioBoletos) {
		this.nombrePelicula = nombrePelicula;
		this.precioBoletos = precioBoletos;
	}

	public void procesarVenta(int cantidadBoletos) {
		double total = cantidadBoletos * precioBoletos;
		System.out.println("\n¡Comnpra exitosa!\nPelicula: " + nombrePelicula + "\nBoletos generados: " + cantidadBoletos + "\nTotal a cobrar: $" + total);
	}
}
