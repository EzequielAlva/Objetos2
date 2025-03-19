package ar.edu.unlp.info.oo2.ejercicio_02_V2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ArenaDeCombateTest {
    private ArenaDeCombate arena;

    @BeforeEach
    void setup() {
        arena = new ArenaDeCombate();
    }

    @Test
    public void combateTest() {
        arena.cargarElementos(new Papel(true), new Piedra(true));
        String resultado = arena.combate();
        System.out.println(resultado);
    }
}
