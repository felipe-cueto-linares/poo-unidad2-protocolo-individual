package taller6.pruebas;

import taller6.empleados.Empleado;
import taller6.gerencia.Gerente;

public class PruebaEmpleado {
    public static void main(String[] args) {
        Empleado emp = new Empleado("Carlos Ruiz", 2500000);
        Gerente gerente = new Gerente("Laura Gomez", 6000000, "Sistemas");

        emp.mostrarInformacion();
        gerente.mostrarInformacion();

        // Esta clase NO hereda de Empleado y esta en otro paquete, asi que no ve los
        // atributos protected. Descomenta UNA linea a la vez para ver el error:
        // System.out.println(emp.nombre);
        //   Error: nombre has protected access in Empleado
        // gerente.salario = 1;
        //   Error: salario has protected access in Empleado
    }
}