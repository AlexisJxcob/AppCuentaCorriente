package Interfaces;

import java.time.LocalDateTime;

public interface MovimientosInterface {
    String getTipoMovimiento(); // Devuelve el tipo de movimiento (Abono o Cargo)
    LocalDateTime getFechaHora(); // Devuelve la fecha y hora del movimiento
    double getMonto(); // Devuelve el monto del movimiento
    String getDescripcion(); // Devuelve una descripción del movimiento
}
