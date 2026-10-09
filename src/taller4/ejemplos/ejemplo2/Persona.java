package taller4.ejemplos.ejemplo2;

public class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public int getEdad() { return edad; }

    public void setEdad(int edad) {
        if (edad >= 0) {
            this.edad = edad;
        }
    }

    public static void main(String[] args) {
        Persona p = new Persona("Juan", 30);
        p.setEdad(31);
        p.setEdad(-5); // se ignora por la validacion
        System.out.println(p.getNombre() + " tiene " + p.getEdad() + " anios");
    }
}