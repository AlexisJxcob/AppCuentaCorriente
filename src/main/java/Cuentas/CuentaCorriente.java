package Cuentas;

public class CuentaCorriente {

    // atributos
    // punto 1.1
    private String titular;
    private Integer saldo; // permite valores null
    private String numero;

    // Punto 1.2
    public CuentaCorriente(String titular, String numero) {
        this.titular = titular;
        this.saldo = 0; // saldo opcional
        this.numero = numero;
    }

    // saldo inicilizado por el usuario
    public CuentaCorriente(String titular, String numero, Integer saldo) {
        this.titular = titular;
        this.numero = numero;
        this.saldo = saldo;
    }

    // Punto 1.3
    @Override
    public String toString() {
        return (
            "CuentaCorriente{ Titular = '" + titular + "', Numero de cuenta = '" + numero + "', Saldo = $" + saldo + "}"
        );
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

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setSaldo(Integer saldo) {
        this.saldo = saldo;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public int abonar(int sumar) {
        if (sumar >= 0) {
            System.out.println("Ingrese una cantidad valdia para abonar");
            return 0;
        } else {
            return sumar;
        }
    }

    public int cargar(int restar) {
        return restar;
    }
}
