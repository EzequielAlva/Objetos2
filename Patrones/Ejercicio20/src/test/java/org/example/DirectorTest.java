package org.example;

import org.example.Builder.ArqueroBuilder;
import org.example.Builder.MagoBuilder;
import org.example.Builder.Personaje;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DirectorTest {
    private Director director;

    @BeforeEach
    void setUp() {
        director = new Director();
    }

    @Test
    public void combateTest() {
        Personaje guerrero = director.crearPersonaje("Brian", 100);
        director.establecerPersonaje(new ArqueroBuilder());
        Personaje arquero = director.crearPersonaje("Joel", 100);
        director.establecerPersonaje(new MagoBuilder());
        Personaje mago = director.crearPersonaje("Sergio", 100);

        System.out.println(guerrero.atacarPersonaje(arquero));

        System.out.println(mago.atacarPersonaje(guerrero));

        System.out.println(arquero.atacarPersonaje(mago));
    }
}
