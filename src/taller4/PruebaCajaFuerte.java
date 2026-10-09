package taller4;

public class PruebaCajaFuerte {
    public static void main(String[] args) {
        CajaFuerte caja = new CajaFuerte("1234", 500000);

        // Descomenta UNA linea a la vez para ver el error de compilacion:
        // System.out.println(caja.codigo);
        //   Error: codigo has private access in CajaFuerte
        // caja.contenido = 0;
        //   Error: contenido has private access in CajaFuerte

        System.out.println("La caja fuerte existe, pero desde fuera no puedo consultar ni modificar sus datos.");

        // DISCUSION (Ejercicio 3, punto 2):
        // Sin get ni set, los datos quedan totalmente protegidos: nadie de afuera puede
        // leerlos ni alterarlos. El problema es que la clase se vuelve casi inutil, porque
        // otras clases no pueden consultar ni actualizar informacion legitima, como saber
        // cuanto hay en la caja.
        // El riesgo real aparece despues: para resolver esa limitacion, un programador
        // apurado podria cambiar el atributo a public, y ahi se pierde toda la proteccion.
        // La solucion correcta es exponer solo lo necesario mediante metodos controlados,
        // por ejemplo un getContenido() de solo lectura y un metodo retirar(valor) que
        // valide el monto, sin dar un set que permita asignar cualquier valor.
    }
}