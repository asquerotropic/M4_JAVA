package S06.Ejemplo;

public class Main {
	public static void main(String[] args) {
		System.out.println("==================== ACTIVIDAD 06 ====================");
		Celular miCelular = new Celular("oppo", "Reno7", "Android 14", 256);
		miCelular.encender();
		//miCelular.mostrarInfo();
		miCelular.mostrarDetalles();
		miCelular.tomarFoto();
	}
}
