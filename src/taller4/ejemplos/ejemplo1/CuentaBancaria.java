package taller4.ejemplos.ejemplo1;

public class CuentaBancaria {
    private double saldo; // privado para proteger el saldo

    public CuentaBancaria(double saldoInicial) {
        if (saldoInicial >= 0) {
            this.saldo = saldoInicial;
        } else {
            this.saldo = 0;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
        }
    }

    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria(100000);
        cuenta.depositar(50000);
        cuenta.depositar(-20000); // se ignora por la validacion
        System.out.println("Saldo: " + cuenta.getSaldo());
        // cuenta.saldo = 5;  // Error: saldo has private access in CuentaBancaria
    }
}