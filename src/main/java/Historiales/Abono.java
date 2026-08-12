package Historiales;

import java.time.LocalDateTime;

public class Abono extends Movimiento {

    public Abono(double monto) {
        super("ABONO", monto, "Depósito en cuenta");
    }

    public Abono(double monto, String descripcion) {
        super("ABONO", monto, descripcion);
    }

    @Override
    public String getTipoMovimiento() {
        return "";
    }

    @Override
    public LocalDateTime getFechaHora() {
        return null;
    }
}
