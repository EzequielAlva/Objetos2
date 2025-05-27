package ar.edu.unlp.info.oo2.ejercicio15;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DirectorTest {
    private Director director;

    @BeforeEach
    void setUp() {
        director = new Director();
    }

    @Test
    public void crearConfiguracionBasicaTest() {
        Equipo equipo = director.obtenerEquipo();
        assertEquals(3, equipo.getComponentes().size());
        assertEquals(470.0 * 1.21, equipo.calcularPrecio());
        assertEquals(47.0, equipo.calcularConsumo());
    }

    @Test
    public void crearConfiguracionIntermediaTest() {
        director.cambiarConfiguracion(new ConfigIntermedia());
        Equipo equipo = director.obtenerEquipo();
        //equipo.getComponentes().forEach(elem -> System.out.println(elem.getConsumo()));
        assertEquals(5, equipo.getComponentes().size());
        assertEquals(1140.0 * 1.21, equipo.calcularPrecio());
        assertEquals(164.0, equipo.calcularConsumo());
    }

    @Test
    public void crearConfiguracionGamerTest() {
        director.cambiarConfiguracion(new ConfigGamer());
        Equipo equipo = director.obtenerEquipo();
        //equipo.getComponentes().forEach(elem -> System.out.println(elem.getPrecio()));
        assertEquals(10, equipo.getComponentes().size());
        assertEquals(2850.0 * 1.21, equipo.calcularPrecio());
        assertEquals(422.0, equipo.calcularConsumo());
    }
}
