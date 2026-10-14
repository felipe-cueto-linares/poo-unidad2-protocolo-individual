package taller6.ejemplos.ejemplo1;

public class Vehiculo {
    protected String tipo;

    public Vehiculo(String tipo) {
        this.tipo = tipo;
    }

    protected void mostrarTipo() {
        System.out.println("Tipo de vehiculo: " + tipo);
    }

    public static void main(String[] args) {
        Vehiculo v = new Vehiculo("Camioneta");
        v.mostrarTipo();
    }
}