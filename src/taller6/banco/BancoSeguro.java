package taller6.banco;

public class BancoSeguro {
    private double saldo;

    public BancoSeguro(double saldoInicial) {
        this.saldo = saldoInicial >= 0 ? saldoInicial : 0;
    }

    public double getSaldo() {
        return saldo;
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