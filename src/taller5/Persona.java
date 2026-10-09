package taller5;

public class Persona {
    private String nombre;   // privado: solo visible dentro de Persona
    int edad;                // sin modificador: visible en todo el paquete taller5

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}