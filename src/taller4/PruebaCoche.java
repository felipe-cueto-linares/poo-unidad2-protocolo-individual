package taller4;

public class PruebaCoche {
    public static void main(String[] args) {
        Coche coche1 = new Coche("Mazda", "3", 180);
        coche1.mostrarInfo();

        coche1.acelerar(20);
        coche1.mostrarInfo();

        // Incremento negativo: el metodo lo rechaza
        coche1.acelerar(-10);
        coche1.mostrarInfo();

        // Punto 3 del ejercicio: acceso directo a atributos privados.
        // Descomenta UNA linea a la vez para ver el error de compilacion:
        // System.out.println(coche1.marca);
        //   Error: marca has private access in Coche
        // coche1.velocidadMaxima = 500;
        //   Error: velocidadMaxima has private access in Coche
    }
}