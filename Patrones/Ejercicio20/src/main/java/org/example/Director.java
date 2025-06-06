package org.example;

import org.example.Builder.GuerreroBuilder;
import org.example.Builder.Personaje;
import org.example.Builder.PersonajeBuilder;

public class Director {
    private PersonajeBuilder builder;

    public Director() {
        this.builder = new GuerreroBuilder();
    }

    public void establecerPersonaje(PersonajeBuilder builder) {
        this.builder = builder;
    }

    public Personaje crearPersonaje(String nombre) {
        return builder.crearPersonaje(nombre, 100);
    }

    public Personaje crearPersonaje(String nombre, int vida) {
        this.builder.agregarArma();
        this.builder.agregarArmadura();
        this.builder.agregarHabilidad();
        return this.builder.crearPersonaje(nombre, vida);
    }
}
