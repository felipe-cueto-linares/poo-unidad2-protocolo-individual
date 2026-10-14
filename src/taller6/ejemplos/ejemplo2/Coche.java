package taller6.ejemplos.ejemplo2;

public class Coche extends Vehiculo {
    private int puertas;

    public Coche(String marca, double velocidad, int puertas) {
        super(marca, velocidad);
        this.puertas = puertas;
    }

    public void mostrarInformacion() {
        mostrarDetalles();
        System.out.println("Numero de puertas: " + puertas);
    }

    public static void main(String[] args) {
        Coche c = new Coche("Mazda", 120, 4);
        c.mostrarInformacion();
    }
}