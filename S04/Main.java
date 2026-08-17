package S04;

public class Main {
	public static void main(String[] args) {
		//SE CREAL EL OBJETO DE TIPO PERSONA CON LOS DATOS PARA LOS ATRIBUTOS
		Persona p = new Persona("Eric Contreras", 25);
		//SE MUESTRAN DATOS 
		p.mostrarDatos();
		//SE MODIFICA LA EDAD A TRAVÉS DEL MÉTODO SET
		p.setEdad(30);//ACCEDEMOS AL ATRIBUTO PRIVADO A TRAVES DEL SET
		//MOSTRAMOS LOS DATOS DE LA PERSONA ACTUALIZADOS
		System.out.println("Después de 5 años, ahora " + p.getNombre() + " tiene " + p.getEdad() + " años.\n");
	}
}
