package ar.edu.unlp.info.oo2.ejercicio09;

import java.time.LocalDate;

public class CancelacionFlexible implements PoliticaDeCancelacion {
    @Override
    public double calcularMontoAReembolzar(LocalDate fechainicial) {
        return 1;
    }
}
