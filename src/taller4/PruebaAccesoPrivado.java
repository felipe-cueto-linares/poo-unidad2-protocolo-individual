package taller4;

public class PruebaAccesoPrivado {
    public static void main(String[] args) {
        Persona p = new Persona("Juan");

        // Ejercicio 3, punto 1: acceso directo a un atributo private desde otra clase.
        // Descomenta UNA linea a la vez para ver el error de compilacion:
        // System.out.println(p.nombre);
        //   Error: nombre has private access in Persona
        // p.nombre = "Pedro";
        //   Error: nombre has private access in Persona

        // La forma correcta: usar un metodo publico de la propia clase
        p.mostrarNombre();
    }
}