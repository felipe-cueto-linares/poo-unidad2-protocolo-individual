package taller5.ejemplos.ejemplo3.paqueteB;

// Error de compilación: Vehiculo tiene acceso de paquete y paqueteB está fuera de paqueteA.
// import taller5.ejemplos.ejemplo3.paqueteA.Vehiculo;

public class Main {
    public static void main(String[] args) {
        // Vehiculo v = new Vehiculo("Toyota");
        System.out.println("Vehiculo no es visible desde paqueteB");
    }
}