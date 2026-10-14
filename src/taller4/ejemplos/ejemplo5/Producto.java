package taller4.ejemplos.ejemplo5;

public class Producto {
    private double precio;

    public Producto(double precio) {
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    public void actualizarPrecio(double nuevoPrecio) {
        precio = nuevoPrecio;
    }

    public static void main(String[] args) {
        Producto p = new Producto(50000);
        p.actualizarPrecio(-999);
        System.out.println("Precio: " + p.getPrecio());
    }
}