package Cuentas;

public class CuentaCorriente {

    // atributos
    private String titular;
    private Integer saldo; // permite valores null
    private String numero;

    public CuentaCorriente(String titular, String numero) {
        this.titular = titular;
        this.saldo = 0;
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Cuenta Corriente : " + "Titular = '" + this.titular + '\'' + ", Número = '" + this.numero + '\'' + '}';
    }

    public String getTitular() {
        return titular;
    }

    public String getNumero() {
        return numero;
    }

    public Integer getSaldo() {
        return saldo;
    }
}
