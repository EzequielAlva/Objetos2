package ar.edu.unlp.info.oo2.ejercicio09;

import java.time.LocalDate;

public class AutoEnAlquiler {
    private double precioPorDia;
    private Integer cantidadPlazas;
    private String marca;
    private PoliticaDeCancelacion politicaDeCancelacion;

    public AutoEnAlquiler(double precioPorDia, Integer cantidadPlazas, String marca, PoliticaDeCancelacion politicaDeCancelacion) {
        this.precioPorDia = precioPorDia;
        this.cantidadPlazas = cantidadPlazas;
        this.marca = marca;
        this.politicaDeCancelacion = politicaDeCancelacion;
    }

    public double getPrecioPorDia() {
        return precioPorDia;
    }

    public void setPoliticaDeCancelacion(PoliticaDeCancelacion politicaDeCancelacion) {
        this.politicaDeCancelacion = politicaDeCancelacion;
    }

    public double calcularPorcentajeDeReembolso(LocalDate fechainicial) {
        return politicaDeCancelacion.calcularMontoAReembolzar(fechainicial);
    }
}
