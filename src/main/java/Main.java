import Cuentas.CuentaCorriente;

public class Main {

    static void main() {
        CuentaCorriente cuentas = new CuentaCorriente("Alexis Jacob", "0000141414");
        System.out.println(cuentas.toString());

        cuentas.setSaldo(1200);
        System.out.println(cuentas.toString());
    }
}
