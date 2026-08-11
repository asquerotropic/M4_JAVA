package S02;

public class Carro {
    String color;
    String modelo;
    int velocidad;

    public Carro (String color, String modelo) {
        this.color = color;
        this.modelo = modelo;
        this.velocidad = 0;
    }

    void acelerar() {
        velocidad += 10;
        System.out.println("El " + modelo + " color " + color + " acelera. Velocidad:" + velocidad + " km/h.");
    }

    void frenar() {
        if (velocidad > 0) {
            velocidad -= 10;
            System.out.println("El " + modelo + " color " + color + " frena. Velocidad: " + velocidad + "km/h."
            );
        } else {
            System.out.println("El " + modelo + " color " + color + " esta detenido."
            );
        }
    }
}
