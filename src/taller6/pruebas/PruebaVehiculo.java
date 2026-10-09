package taller6.pruebas;

import taller6.motos.Moto;
import taller6.vehiculos.Vehiculo;

public class PruebaVehiculo {
    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo("Carro", "Mazda");
        Moto moto = new Moto("Deportiva", "Yamaha", 600);

        vehiculo.mostrarInformacion();
        moto.mostrarInformacion();

        // Esta clase no hereda de Vehiculo y esta en otro paquete, asi que no ve los
        // miembros protected. Descomenta UNA linea a la vez para ver el error:
        // System.out.println(vehiculo.tipo);
        //   Error: tipo has protected access in Vehiculo
        // vehiculo.marca = "Toyota";
        //   Error: marca has protected access in Vehiculo
        // System.out.println(moto.tipo);
        //   Error: tipo has protected access in Vehiculo
        // moto.marca = "Honda";
        //   Error: marca has protected access in Vehiculo

        // OBSERVACION: Moto si usa tipo y marca dentro de su propio codigo porque es
        // subclase. Pero esta clase de prueba es una clase "no relacionada": ni hereda
        // de Vehiculo ni esta en su paquete, por eso Java le niega el acceso, incluso
        // cuando el objeto es una Moto que hereda esos atributos.
    }
}