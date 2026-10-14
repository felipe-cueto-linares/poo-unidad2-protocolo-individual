package taller6.ejemplos.ejemplo5;

public class PruebaUsuario {
    public static void main(String[] args) {
        Usuario u = new Usuario("clave1234");
        System.out.println("Contraseña leida directamente: " + u.contraseña);
    }
}