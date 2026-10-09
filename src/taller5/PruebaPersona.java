package taller5;

public class PruebaPersona {
    public static void main(String[] args) {
        Persona p = new Persona("Ana", 25);

        // Lo que SI se puede hacer desde esta clase (mismo paquete):
        System.out.println("Nombre por get: " + p.getNombre());
        p.setNombre("Ana Maria");
        System.out.println("Nombre tras set: " + p.getNombre());
        System.out.println("Edad directa: " + p.edad);   // acceso de paquete
        p.edad = 26;                                     // se puede modificar directo
        System.out.println("Edad modificada: " + p.edad);

        // Lo que NO se puede hacer. Descomenta UNA linea a la vez para ver el error:
        // System.out.println(p.nombre);
        //   Error: nombre has private access in Persona
        // p.nombre = "Pedro";
        //   Error: nombre has private access in Persona

        // DISCUSION (Ejercicio 3, punto 3):
        // private: el atributo solo se ve dentro de su propia clase. Ni siquiera una clase
        // del mismo paquete puede tocarlo; solo se llega a el por get y set, que ademas
        // permiten validar. Es el nivel mas cerrado y protege la integridad de los datos.
        // Acceso de paquete: cualquier clase del mismo paquete lee y modifica el atributo
        // directo, sin pasar por ningun metodo, asi que no hay forma de validar. Por eso
        // edad podria quedar con un valor invalido sin que la clase se entere.
        // Resumen: private protege hacia todos; el acceso de paquete solo protege hacia
        // afuera del paquete y deja el atributo abierto a todas las clases de adentro.
    }
}