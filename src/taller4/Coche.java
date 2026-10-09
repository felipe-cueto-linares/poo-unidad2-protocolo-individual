package taller4;

public class Coche {
    private String marca;
    private String modelo;
    private double velocidadMaxima;

    public Coche(String marca, String modelo, double velocidadMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void acelerar(double incremento) {
        if (incremento > 0) {
            velocidadMaxima += incremento;
        } else {
            System.out.println("Incremento invalido, debe ser positivo");
        }
    }

    public void mostrarInfo() {
        System.out.println("Coche -> marca: " + marca + ", modelo: " + modelo + ", velocidad maxima: " + velocidadMaxima + " km/h");
    }
}