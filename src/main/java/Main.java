import Cuentas.CuentaCorriente; // Importamos tu clase
import java.util.Scanner; // Cumple con el criterio CE8

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("BIENVENIDO AL SISTEMA DE CAJERO AUTOMÁTICO");

        // 1. Demostración de Constructores (Criterio CE4)
        System.out.println("\n[Prueba 1] Creación de Cuentas");

        // Caso A: Usando el constructor con saldo opcional (por defecto 0)
        CuentaCorriente cuenta1 = new CuentaCorriente("Juan Perez", "CC-98765");
        System.out.println("Cuenta 1 creada (Sin saldo inicial):");
        System.out.println(cuenta1.toString()); // Llama toString personalizado

        // Caso B: Usando el constructor con saldo inicializado
        CuentaCorriente cuenta2 = new CuentaCorriente("Maria Lopez", "CC-12345", 50000);
        System.out.println("\nCuenta 2 creada con saldo inicial de : $" + cuenta2.getSaldo());
        System.out.println(cuenta2.toString());

        // 2. Interacción con el usuario mediante Scanner (Criterio CE8)
        System.out.println("\n[Prueba 2] Operando con la cuenta de " + cuenta2.getTitular());

        // CASO DE USO: ABONAR VALOR VÁLIDO
        System.out.print("Ingrese una cantidad para abonar a la cuenta de " + cuenta2.getTitular() + ": $");
        int montoAbono = entrada.nextInt();
        cuenta2.abonar(montoAbono);

        // CASO DE USO: ABONAR VALOR NEGATIVO (Validación CE9)
        System.out.println("\nIntentando abonar un monto inválido (-5000)...");
        cuenta2.abonar(-5000);

        // CASO DE USO: CARGAR VALOR VÁLIDO
        System.out.print(
            "\nIngrese una cantidad para CARGAR (retirar) de la cuenta de " + cuenta2.getTitular() + ": $"
        );
        int montoCargo = entrada.nextInt();
        cuenta2.cargar(montoCargo);

        // CASO DE USO: FORZAR SALDO A CERO (Regla de negocio crítica)
        System.out.println("\n[Prueba 3] Forzando el límite de Cargar ");
        System.out.println("Intentaremos cargar $200.000 a la cuenta de Juan (Su saldo actual es $0)...");
        cuenta1.cargar(200000);

        System.out.println("\nEstado final de la cuenta de Juan:");
        System.out.println(cuenta1.toString());

        System.out.println("\n==================================================");
        System.out.println("Todas las pruebas se ejecutaron exitosamente.");
        entrada.close();
    }
}
