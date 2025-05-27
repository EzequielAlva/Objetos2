package ar.edu.unlp.info.oo2.ejercicio14;

import java.time.LocalDate;

import static java.time.temporal.ChronoUnit.MONTHS;

public class Alquiler extends Prenda {
    private LocalDate comienzoContrato;
    private LocalDate finContrato;
    private double costoMensual;

    public Alquiler(LocalDate comienzoContrato, LocalDate finContrato, double costoMensual) {
        this.comienzoContrato = comienzoContrato;
        this.finContrato = finContrato;
        this.costoMensual = costoMensual;
        setLiquidez(0.9);
    }

    @Override
    public double calculoValor() {
        return costoMensual * MONTHS.between(LocalDate.now(), finContrato);
    }
}
