package Historiales;

import Historiales.Movimiento;
import java.time.LocalDateTime;

public abstract class Cargo extends Movimiento {

    public Cargo(double monto) {
        super("CARGO", monto, "Retiro de cuenta");
    }

    public Cargo(double monto, String descripcion) {
        super("CARGO", monto, descripcion);
    }
}
