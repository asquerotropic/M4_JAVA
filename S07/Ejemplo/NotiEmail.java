package S07.Ejemplo;

public class NotiEmail extends Notificacion {
	@Override
	//SOBRE ESCRITTURA DEL MÉTODO DE LA CLASE PADRE
	void enviar() {
		System.out.println("El correo ha sido enviado al usuario.");
	}
}
