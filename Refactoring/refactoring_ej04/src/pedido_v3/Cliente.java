package pedido_v3;

import java.time.LocalDate;
import java.time.Period;

public class Cliente {
    private LocalDate fechaAlta;

    public LocalDate getFechaAlta() {
        return fechaAlta;
    }

    public int calcularAñosDesdeFechaAlta() {
        return Period.between(fechaAlta, LocalDate.now()).getYears();
    }
}
