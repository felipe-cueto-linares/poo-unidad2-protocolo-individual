package taller6.motos;

import taller6.vehiculos.Vehiculo;

public class Moto extends Vehiculo {
    private int cilindrada;

    public Moto(String tipo, String marca, int cilindrada) {
        super(tipo, marca);
        this.cilindrada = cilindrada;
    }

    @Override
    public void mostrarInformacion() {
        // tipo y marca son protected en Vehiculo: Moto los usa directo porque hereda
        // de ella, aunque este en un paquete diferente
        System.out.println("Moto -> tipo: " + tipo + ", marca: " + marca + ", cilindrada: " + cilindrada + " cc");
    }
}