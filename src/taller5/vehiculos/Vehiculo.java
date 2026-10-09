package taller5.vehiculos;

public class Vehiculo {
    String tipo;   // sin modificador: acceso de paquete

    public Vehiculo(String tipo) {
        this.tipo = tipo;
    }

    void mostrarTipo() {   // metodo de paquete
        System.out.println("Tipo de vehiculo: " + tipo);
    }
}