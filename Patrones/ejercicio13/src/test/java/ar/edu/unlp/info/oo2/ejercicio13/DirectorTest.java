package ar.edu.unlp.info.oo2.ejercicio13;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DirectorTest {
    private Director director;
    private SandwitchBuilder builder;


    @BeforeEach
    void setUp() {
        builder = new SandwitchClasico();
        director = new Director(builder);
    }

    @Test
    public void obtenerSandwitchClasico() {
        Sandwitch sandwitch = director.hacerSandwitch();
        assertEquals("Pan brioche",sandwitch.getPan().getNombre());
        assertEquals("Mayonesa",sandwitch.getAderezo().getNombre());
        assertEquals("Carne de ternera",sandwitch.getPrincipal().getNombre());
        assertEquals("Tomate",sandwitch.getAdicional().getNombre());
    }

    @Test
    public void obtenerSandwitchVeganoTest() {
        director.changeBuilder(new SandwitchVegano());
        Sandwitch sandwitch = director.hacerSandwitch();
        assertEquals("Pan integral",sandwitch.getPan().getNombre());
        assertEquals("Salsa criolla",sandwitch.getAderezo().getNombre());
        assertEquals("Milanesa de girgolas",sandwitch.getPrincipal().getNombre());
        assertEquals("",sandwitch.getAdicional().getNombre());
    }

    @Test
    public void obtenerSandwitchSinTaccTest() {
        director.changeBuilder(new SandwitchSinTacc());
        Sandwitch sandwitch = director.hacerSandwitch();
        assertEquals("Pan de chipá",sandwitch.getPan().getNombre());
        assertEquals("Salsa tártara",sandwitch.getAderezo().getNombre());
        assertEquals("Carne de pollo",sandwitch.getPrincipal().getNombre());
        assertEquals("Verduras grilladas",sandwitch.getAdicional().getNombre());
    }

    @Test
    public void obtenerSandwitchVegetarianoTest() {
        director.changeBuilder(new SandwitchVegetariano());
        Sandwitch sandwitch = director.hacerSandwitch();
        assertEquals("Pan con semillas",sandwitch.getPan().getNombre());
        assertEquals("",sandwitch.getAderezo().getNombre());
        assertEquals("Provoleta grillada",sandwitch.getPrincipal().getNombre());
        assertEquals("Berenjenas al escabeche",sandwitch.getAdicional().getNombre());
    }
}
