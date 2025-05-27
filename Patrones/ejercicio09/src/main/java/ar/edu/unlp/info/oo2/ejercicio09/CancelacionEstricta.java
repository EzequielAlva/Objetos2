package ar.edu.unlp.info.oo2.ejercicio09;

import java.time.LocalDate;

public class CancelacionEstricta implements PoliticaDeCancelacion {
    @Override
    public double calcularMontoAReembolzar(LocalDate fechainicial) {
        return 0;
    }
}
