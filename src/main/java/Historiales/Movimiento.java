package Historiales;

import Interfaces.MovimientosInterface;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public abstract class Movimiento implements MovimientosInterface {

    protected String tipo;
    protected LocalDateTime fecha;
    protected double monto;
    protected String descripcion;

    public Movimiento(String tipo, double monto, String descripcion) {
        this.tipo = tipo;
        this.fecha = LocalDateTime.now();
        this.monto = monto;
        this.descripcion = descripcion;
    }

    public String getTipo() {
        return tipo;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    @Override
    public double getMonto() {
        return monto;
    }

    @Override
    public String getDescripcion() {
        return descripcion;
    }

    public String getFechaFormateada() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        return fecha.format(formatter);
    }

    @Override
    public String toString() {
        return String.format("[%s] %s: $%.2f - %s", getFechaFormateada(), tipo, monto, descripcion);
    }
}
