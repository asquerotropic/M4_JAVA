package S07.Ejemplo;

public class Main {
	public static void main(String[] args) {
		Notificacion e = new NotiEmail();
		Notificacion s = new NotiSMS();

		//MÉTODO ENVIAR - BASE
		e.enviar();
		//MÉTODO ENVIAR - SOBRECARGA
		e.enviar(" -> Estimado usuario, tiene un correo nuevo.");

		s.enviar();
		s.enviar(" ->Estimado usuario, tiene un SMS nuevo.");
	}
}
