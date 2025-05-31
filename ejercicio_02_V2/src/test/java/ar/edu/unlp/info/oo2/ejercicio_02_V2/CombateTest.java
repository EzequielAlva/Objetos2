package ar.edu.unlp.info.oo2.ejercicio_02_V2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CombateTest {
    private Elemento papel;
    private Elemento tijera;
    private Elemento piedra;
    private Elemento spock;
    private Elemento lagarto;

    @BeforeEach
    void setUp() {
        papel = new Papel();
        tijera = new Tijera();
        piedra = new Piedra();
        spock = new Spock();
        lagarto = new Lagarto();
    }

    @Test
    public void combateTest() {
        System.out.println(papel.combate(piedra));
        System.out.println(papel.combate(tijera));
        System.out.println(papel.combate(papel));
        System.out.println(papel.combate(spock));
        System.out.println(papel.combate(lagarto));

        System.out.println(spock.combate(piedra));
        System.out.println(spock.combate(tijera));
        System.out.println(spock.combate(papel));
        System.out.println(spock.combate(spock));
        System.out.println(spock.combate(lagarto));
    }
}
