package ACT4B.modelo;

public class SolicitudLicencia {
	private int folio;
	private String tipoLicencia;
	private boolean aprobada;

	// CREAMOS LA ASOCIACIONES O RELACIONES CON LAS DEMAS CLASES
	private Ciudadano titular;
	private Requisito requisito;

	public SolicitudLicencia(int folio, String tipoLicencia, Ciudadano titular, Requisito requisito) {
		this.folio = folio;
		this.tipoLicencia = tipoLicencia;
		this.aprobada = false;
		this.titular = titular;
		this.requisito = requisito;
	}

	public void procesarSolicitud() {
		if (requisito.getFueEntregado()) {
			this.aprobada = true;
			System.out.println("\n	-> La solicitud con folio " + folio + " ha sido aprobada.");
		} else {
			System.out.println("\n	-> La solicitud con folio " + folio + " ha sido rechazada. ¡Faltan documentos!");
		}
	}

	public void consultarEstado() {
		System.out.println("\n	Estado del trámite");
		titular.mostrarInfo();
	System.out.println("\n	-> Tipo de licencia:  " + tipoLicencia + "\n	-> Aprobado: " + (aprobada ? "Si" : "No"));
	}
}
