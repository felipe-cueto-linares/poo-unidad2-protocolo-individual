package taller6.banco;

public class Banco {
    protected double saldo;

    public Banco(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
        }
    }

    public void retirar(double monto) {
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
        } else {
            System.out.println("Retiro rechazado: monto invalido o fondos insuficientes");
        }
    }

    public void mostrarSaldo() {
        System.out.println("Saldo: " + saldo);
    }
}