package taller4.ejemplos.ejemplo3;

public class Vehiculo {
    private String marca;
    private double velocidad;

    public Vehiculo(String marca, double velocidad) {
        this.marca = marca;
        this.velocidad = velocidad;
    }

    public String getMarca() { return marca; }
    public double getVelocidad() { return velocidad; }

    public void acelerar(double incremento) {
        if (incremento > 0) {
            velocidad += incremento;
        }
    }

    public static void main(String[] args) {
        Vehiculo v = new Vehiculo("Mazda", 60);
        v.acelerar(25);
        v.acelerar(-10); // se ignora por la validacion
        System.out.println(v.getMarca() + " va a " + v.getVelocidad() + " km/h");
    }
}