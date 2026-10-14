package taller6.ejemplos.ejemplo4.paquete2;

import taller6.ejemplos.ejemplo4.paquete1.Persona;

public class Main {
    public static void main(String[] args) {
        Persona p = new Persona("Juan");
        System.out.println("Objeto creado, pero su nombre es protected");

        // Error de compilación: nombre tiene acceso protected en Persona y Main
        // no es subclase de Persona ni está en su mismo paquete.
        // System.out.println(p.nombre);
    }
}