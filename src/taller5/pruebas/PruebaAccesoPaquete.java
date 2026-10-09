package taller5.pruebas;

import taller5.vehiculos.Moto;
import taller5.vehiculos.Vehiculo;

public class PruebaAccesoPaquete {
    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo("Carro");
        Moto moto = new Moto("Deportiva", 600);

        // Forma correcta: metodo public de la propia clase
        moto.mostrarInfo();

        // Ejercicio 2, punto 3: acceso a miembros de paquete desde OTRO paquete.
        // Descomenta UNA linea a la vez para ver el error de compilacion:
        // System.out.println(vehiculo.tipo);
        //   Error: tipo is not public in Vehiculo; cannot be accessed from outside package
        // vehiculo.mostrarTipo();
        //   Error: mostrarTipo() is not public in Vehiculo; cannot be accessed from outside package
        // System.out.println(moto.cilindrada);
        //   Error: cilindrada is not public in Moto; cannot be accessed from outside package
        // System.out.println(moto.tipo);
        //   Error: tipo is not public in Vehiculo; cannot be accessed from outside package

        // DISCUSION: los miembros sin modificador solo son visibles dentro de su paquete
        // (taller5.vehiculos). Esta clase vive en taller5.pruebas, asi que para Java es
        // "otro paquete" y no puede ver tipo, mostrarTipo() ni cilindrada, ni siquiera
        // a traves de Moto, que hereda de Vehiculo. Moto si usa tipo en mostrarInfo()
        // porque esta en el mismo paquete que Vehiculo. Por eso el acceso de paquete
        // sirve para clases que trabajan juntas, no para exponer datos hacia afuera.
    }
}