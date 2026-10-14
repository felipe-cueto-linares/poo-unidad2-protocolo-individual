package taller5.ejemplos.ejemplo2;

public class PruebaEmpleado {
    public static void main(String[] args) {
        Empleado e = new Empleado("Carlos Ruiz", 2500000);
        e.mostrarInformacion();
        System.out.println("Nombre leido directo: " + e.nombre);
        e.salario = 2800000;
        e.mostrarInformacion();
    }
}