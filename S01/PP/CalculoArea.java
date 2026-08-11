//PROGRAMA PARA CALCULAR AREA
public class CalculoArea {
    //METODO PARA CALCULAR EL AREA A TRAVES DE UNA FUNCIÓN RECIBIENDO ATRIBUTOS DECIMALES Y APLICANDO LA FORMULA PARA CALCULAR EL AREA DE UN TRIANGULO
    public static double calcularArea(double base, double altura) {
        return base * altura / 2; //DEVUELVE EL VALOR CALCULADO POR LA FORMULA
    }
    //METODO DONDE SE EJECUTA EL PROGRAMA CREANDO LAS VARIABLES CON VALORES
    public static void main(String[] args) {
        double base = 36;
        double altura = 27;
        double area = calcularArea(base, altura); //EN LA VARIABLE AREA GUARDA EL RESULTADO QUE ARROJA LA CUNCIÓN QUE LLAMA
        System.out.println("El área del triangulo es: " + area); //IMPRIME EL RESULTADO EN LA CONSOLA
    } 
}