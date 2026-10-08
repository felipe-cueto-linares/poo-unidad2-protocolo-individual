package taller4;

public class PruebaEstudiante {
    public static void main(String[] args) {
        Estudiante est1 = new Estudiante("Felipe Cueto", 20, 4.2);
        est1.mostrarInfo();

        // Accedo siempre a traves de get/set, nunca directo (son privados)
        est1.setEdad(21);
        est1.setNotaPromedio(4.5);
        est1.mostrarInfo();

        // Esto demuestra la validacion en accion
        est1.setEdad(-5);
        est1.setNotaPromedio(10);
    }
}