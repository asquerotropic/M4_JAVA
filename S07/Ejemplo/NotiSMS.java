package S07.Ejemplo;

public class NotiSMS extends Notificacion {
	@Override
	//SOBRE ESCRITTURA DEL MÉTODO DE LA CLASE PADRE
	void enviar() {
		System.out.println("El SMS ha sido enviado al número registrado.");
	}
}
