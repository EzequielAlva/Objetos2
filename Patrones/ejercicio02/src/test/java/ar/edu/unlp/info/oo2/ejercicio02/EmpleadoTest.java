package ar.edu.unlp.info.oo2.ejercicio02;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EmpleadoTest {
    Empleado pasante;
    Empleado temporario;
    Empleado planta;

    @BeforeEach
    void setup() {
        pasante = new EmpleadoPasante(3);
        temporario = new EmpleadoTemporario(true, 2, 25);
        planta = new EmpleadoPlanta(true, 1, 6.5);
    }

    @Test
    public void sueldoBasico() {
        assertEquals(20000, pasante.sueldoBasico());
        assertEquals(20000 + 25 * 300, temporario.sueldoBasico());
        assertEquals(50000, planta.sueldoBasico());
    }

    @Test
    public void adicional() {
        assertEquals(6000, pasante.adicional());
        assertEquals(9000, temporario.adicional());
        assertEquals(7000 + 6.5 * 2000, planta.adicional());
    }

    @Test
    public void descuento() {
        assertEquals(pasante.sueldoBasico() * 0.13 + pasante.adicional() * 0.05, pasante.descuento());
        assertEquals(temporario.sueldoBasico() * 0.13 + temporario.adicional() * 0.05, temporario.descuento());
        assertEquals(planta.sueldoBasico() * 0.13 + planta.adicional() * 0.05, planta.descuento());
    }
}
