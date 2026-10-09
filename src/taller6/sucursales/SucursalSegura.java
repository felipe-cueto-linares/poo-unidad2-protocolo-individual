package taller6.sucursales;

import taller6.banco.BancoSeguro;

public class SucursalSegura extends BancoSeguro {

    public SucursalSegura(double saldoInicial) {
        super(saldoInicial);
    }

    public void intentarCorromperSaldo() {
        // Descomenta la linea para ver el error de compilacion y vuelve a comentarla:
        // saldo = -999999;
        //   Error: saldo has private access in BancoSeguro

        // Lo unico que puede hacer la subclase es usar los metodos publicos, que validan:
        retirar(5000000);
    }
}