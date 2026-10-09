package taller6.sucursales;

import taller6.banco.Banco;

public class SucursalBanco extends Banco {

    public SucursalBanco(double saldoInicial) {
        super(saldoInicial);
    }

    // Compila sin error: saldo es protected y esta clase hereda de Banco.
    // Esto es el problema: se salta toda la validacion de retirar().
    public void corromperSaldo() {
        saldo = -999999;
    }
}