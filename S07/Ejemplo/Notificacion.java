package S07.Ejemplo;

public class Notificacion {
	//MÉTODO 1
	void enviar() {
		System.out.println("La notificación del sistema ha sido enviada");
	}

	//SOBRECARGA DEL MÉTODO 1
	void enviar(String mensaje) {
		System.out.println("Mensaje: " + mensaje);
	}
}
