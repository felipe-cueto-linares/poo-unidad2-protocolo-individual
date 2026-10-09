package taller5.vehiculos;

public class Moto extends Vehiculo {
    int cilindrada;   // acceso de paquete

    public Moto(String tipo, int cilindrada) {
        super(tipo);
        this.cilindrada = cilindrada;
    }

    // Moto esta en el MISMO paquete que Vehiculo, asi que si puede usar tipo
    public void mostrarInfo() {
        System.out.println("Moto -> tipo: " + tipo + ", cilindrada: " + cilindrada + " cc");
    }
}