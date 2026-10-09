package taller6.gerencia;

import taller6.empleados.Empleado;

public class Gerente extends Empleado {
    private String departamento;

    public Gerente(String nombre, double salario, String departamento) {
        super(nombre, salario);
        this.departamento = departamento;
    }

    @Override
    public void mostrarInformacion() {
        // nombre y salario son protected en Empleado: Gerente los usa directo porque
        // hereda de ella, aunque este en un paquete diferente
        System.out.println("Gerente -> nombre: " + nombre + ", salario: " + salario + ", departamento: " + departamento);
    }
}