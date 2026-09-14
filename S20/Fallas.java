package S20;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Fallas {
	//CHEKED EXCEPTION -> "THROWS" 
	public void exFaltaArchivo() throws FileNotFoundException {
		System.out.println("-> Buscando archivo [Acta_Calificaciones.xlsx] en el Disco Duro");
		FileReader lector = new FileReader("Acta_Calificaciones.xlsx");
	}

	//UNCHEKED - ERROR DEL QUE PODEMOS ESTAR PREPARADOS PERO NO PREVEERLO
	public void exFueraRango() {
		System.out.println("-> Accediendo a la posición 10 de un arreglo de 3 espacios");
		int[] numeros = {15,68,93};
		int valor = numeros[10];
	} 

	//UNCHEKED - ERROR DEL QUE PODEMOS ESTAR PREPARADOS PERO NO PREVEERLO
	public void exDivisionPorCero(int a, int b) {
		System.out.println("-> Calculando la división...");
		int resultado = a / b;
		System.out.println("-> Resultado: " + resultado);
	}

	//UNCHEKED - ERROR DEL QUE PODEMOS ESTAR PREPARADOS PERO NO PREVEERLO
	public void exObjetoNulo() {
		System.out.println("-> Intentando leer un dato que no existe");
		String textoVacio = null;
		int longitud = textoVacio.length();
	}

	//ERROR CRÍTICO
	public void exStackOverflow() {
		exStackOverflow();
	}
}
