package ar.edu.unlp.info.oo2.ejercicio_02;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CombateTest {
    private Elemento papel;
    private Elemento tijera;
    private Elemento piedra;

    @BeforeEach
    void setUp() {
        papel = new Papel();
        tijera = new Tijera();
        piedra = new Piedra();
    }

    @Test
    public void combateTest() {
        System.out.println(papel.combate(piedra));
        System.out.println(papel.combate(tijera));
        System.out.println(papel.combate(papel));
        System.out.println();

        System.out.println(piedra.combate(piedra));
        System.out.println(piedra.combate(tijera));
        System.out.println(piedra.combate(papel));
        System.out.println();

        System.out.println(tijera.combate(piedra));
        System.out.println(tijera.combate(tijera));
        System.out.println(tijera.combate(papel));
        System.out.println();
    }
}
