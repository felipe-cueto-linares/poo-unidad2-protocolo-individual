package taller5;

public class PruebaProducto {
    public static void main(String[] args) {
        Producto p1 = new Producto("Teclado", 80000, 10);
        p1.mostrarInfo();

        // Mismo paquete: puedo leer y modificar los atributos directamente
        System.out.println("Nombre leido directo: " + p1.nombre);
        p1.stock = 7;
        p1.precio = 75000;
        p1.mostrarInfo();
    }
}