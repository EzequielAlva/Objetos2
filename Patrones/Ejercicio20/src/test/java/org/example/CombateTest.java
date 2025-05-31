package org.example;

import org.example.Armaduras.ArmaduraDeCuero;
import org.example.Personajes.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CombateTest {
    private SelectorDePersonaje selector;

    @BeforeEach
    void setUp() {
        selector = new SelectorDePersonaje();
    }

    @Test
    public void creacionDePersonajesTest() {
        //Crea Guerrero por defecto
        Personaje p1 = selector.crearPersonaje("Brian");
        assertEquals("Espada", p1.getArma().getNombre());
        assertEquals("Armadura de Acero", p1.getArmadura().getNombre());
        assertEquals("Combate Cuerpo a Cuerpo", p1.getHabilidades().get(0).getNombre());
    }

    @Test
    public void combateEntrePersonajesTest() {
        selector.establecerPersonaje(new Guerrero());
        Personaje chechoino = selector.crearPersonaje("Chechoino");
        System.out.println("Daño de personaje 1: " + chechoino.calcularDanioDeAtaque(new ArmaduraDeCuero()));

        System.out.println();

        selector.establecerPersonaje(new Mago());
        Personaje joel = selector.crearPersonaje("Joel");
        System.out.println("Daño de personaje 2: " + joel.calcularDanioDeAtaque(new ArmaduraDeCuero()));

        System.out.println(selector.combatir(chechoino, joel));
    }
}
