package ar.edu.unlp.info.oo2.ejercicio09;

import java.time.LocalDate;

import static java.time.temporal.ChronoUnit.DAYS;

public class CancelacionModerada implements PoliticaDeCancelacion {
    @Override
    public double calcularMontoAReembolzar(LocalDate fechainicial) {
        if(diferenciaDeFechas(fechainicial) > 2) {
            if(diferenciaDeFechas(fechainicial) > 7) {
                return 0.5;
            }
            return 1;
        }
        return 0;
    }

    private long diferenciaDeFechas(LocalDate fechainicial) {
        return DAYS.between(LocalDate.now(), fechainicial);
    }
}
