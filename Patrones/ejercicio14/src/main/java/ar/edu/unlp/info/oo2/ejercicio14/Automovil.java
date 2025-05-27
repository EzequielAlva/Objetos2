package ar.edu.unlp.info.oo2.ejercicio14;


import java.time.LocalDate;

import static java.time.temporal.ChronoUnit.YEARS;

public class Automovil extends Prenda {
    private LocalDate modelo;
    private double kilometraje;
    private double costo0km;

    public Automovil(LocalDate modelo, double kilometraje, double costo0km) {
        this.modelo = modelo;
        this.kilometraje = kilometraje;
        this.costo0km = costo0km;
        setLiquidez(0.7);
    }

    @Override
    public double calculoValor() {
        double multiplicador = 1 - 0.1 * YEARS.between(modelo, LocalDate.now());
        return (multiplicador >= 0) ? this.costo0km * multiplicador : 0;
    }
}
