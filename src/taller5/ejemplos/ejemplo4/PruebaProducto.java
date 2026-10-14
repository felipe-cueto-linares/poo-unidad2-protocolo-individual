package taller5.ejemplos.ejemplo4;

public class PruebaProducto {
    public static void main(String[] args) {
        Producto p = new Producto("Teclado", 80000);
        p.mostrarInfo();
        p.precio = -500;
        p.mostrarInfo();
    }
}