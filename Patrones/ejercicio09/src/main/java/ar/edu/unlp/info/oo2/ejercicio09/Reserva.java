package ar.edu.unlp.info.oo2.ejercicio09;

import java.time.LocalDate;

public class Reserva {
    private Integer cantidadDias;
    private LocalDate fecha;
    private Usuario conductor;
    private AutoEnAlquiler auto;


    public Reserva(Integer cantidadDias, LocalDate fecha, Usuario conductor, AutoEnAlquiler auto) {
        this.cantidadDias = cantidadDias;
        this.fecha = fecha;
        this.conductor = conductor;
        this.auto = auto;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public double montoAPagar() {
        return cantidadDias * auto.getPrecioPorDia();
    }

    public double montoAReembolzar() {
        return montoAPagar() * auto.calcularPorcentajeDeReembolso(fecha);
    }
}
