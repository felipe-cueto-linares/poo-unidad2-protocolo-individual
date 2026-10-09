package taller6.vehiculos;

public class Vehiculo {
    protected String tipo;
    protected String marca;

    public Vehiculo(String tipo, String marca) {
        this.tipo = tipo;
        this.marca = marca;
    }

    public void mostrarInformacion() {
        System.out.println("Vehiculo -> tipo: " + tipo + ", marca: " + marca);
    }
}