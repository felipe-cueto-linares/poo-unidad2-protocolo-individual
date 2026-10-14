package taller5.ejemplos.ejemplo1;

class Producto {
    String nombre;
    double precio;

    Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    void mostrarInfo() {
        System.out.println("Nombre: " + nombre + ", Precio: " + precio);
    }

    public static void main(String[] args) {
        Producto p = new Producto("Teclado", 80000);
        p.mostrarInfo();
    }
}