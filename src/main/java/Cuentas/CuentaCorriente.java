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

    // saldo inicializado por el usuario
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
        if (saldo != null && saldo < 0) {
            System.out.println("Error: El saldo no puede ser negativo. Se asignará $0.");
            this.saldo = 0;
        } else {
            this.saldo = saldo;
        }
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void abonar(int cantidad) {
        if (cantidad > 0) {
            this.saldo = this.saldo + cantidad;
            System.out.println(
                "Ingreso a su cuenta la cantidad de: $" + cantidad + " y su saldo actual es de: $" + this.saldo
            );
        } else {
            System.out.println("Error: no se puede abonar una cantidad negativa o cero");
        }
    }

    public void cargar(int cantidad) {
        int saldoResta = this.saldo - cantidad;

        if (saldoResta < 0) {
            this.saldo = 0;
            System.out.println("Se intentó cargar $" + cantidad + ". Saldo insuficiente, tu cuenta queda en: $0");
        } else {
            this.saldo = saldoResta;
            System.out.println("Se han cargado: $" + cantidad + ". Nuevo saldo: $" + this.saldo);
        }
    }
}
