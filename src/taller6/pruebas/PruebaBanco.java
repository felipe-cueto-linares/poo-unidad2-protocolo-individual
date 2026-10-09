package taller6.pruebas;

import taller6.sucursales.SucursalBanco;
import taller6.sucursales.SucursalSegura;

public class PruebaBanco {
    public static void main(String[] args) {
        System.out.println("--- Version insegura (saldo protected) ---");
        SucursalBanco insegura = new SucursalBanco(1000000);
        insegura.mostrarSaldo();
        insegura.corromperSaldo();
        insegura.mostrarSaldo();

        System.out.println("--- Version segura (saldo private) ---");
        SucursalSegura segura = new SucursalSegura(1000000);
        segura.mostrarSaldo();
        segura.intentarCorromperSaldo();
        segura.retirar(100000);
        segura.mostrarSaldo();

        // DISCUSION (Ejercicio 3, punto 1): por que saldo protected no es seguro
        // protected no solo da acceso a las subclases: tambien a cualquier clase del mismo
        // paquete. Cualquiera de ellas puede escribir saldo directo, sin pasar por
        // depositar() ni retirar(), y por eso en la version insegura el saldo quedo en
        // -999999: se salto la regla de que no se puede retirar mas de lo que hay.
        // Para un dato critico como el dinero, eso rompe la integridad del sistema.
        //
        // SOLUCION (Ejercicio 3, punto 2): encapsular con private
        // El saldo pasa a private y se expone solo lo necesario: getSaldo() de solo
        // lectura y metodos depositar() y retirar() que validan cada operacion. No hay
        // setSaldo(), asi que nadie, ni siquiera una subclase, puede asignar un valor
        // arbitrario. La unica forma de cambiar el saldo es por reglas controladas.
    }
}