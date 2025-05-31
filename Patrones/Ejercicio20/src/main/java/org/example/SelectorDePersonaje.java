package org.example;

import org.example.Personajes.Guerrero;
import org.example.Personajes.Personaje;
import org.example.Personajes.PersonajeBuilder;

public class SelectorDePersonaje {
    private PersonajeBuilder builder;

    public SelectorDePersonaje() {
        this.builder = new Guerrero();
    }

    public void establecerPersonaje(PersonajeBuilder builder) {
        this.builder = builder;
    }

    public Personaje crearPersonaje(String nombre) {
        return builder.crearPersonaje(nombre, 100);
    }

    public String combatir(Personaje atacante, Personaje defensor) {
        int vidaAtacante = atacante.getVida();
        int vidaDefensor = defensor.getVida();
        String ganador = "Ganador: ";

        while(vidaAtacante > 0 && vidaDefensor > 0) {
            vidaDefensor = (atacante.calcularDanioDeAtaque(defensor.getArmadura())
                    - resolverCuracion(defensor.poseeCuracion(), defensor));

            vidaAtacante -= (defensor.calcularDanioDeAtaque(atacante.getArmadura())
                    - resolverCuracion(atacante.poseeCuracion(), atacante));
        }

        return ganador + ((vidaAtacante > vidaDefensor) ? atacante.getNombre() : defensor.getNombre());
    }

    private int resolverCuracion(boolean puedeCurar, Personaje personaje) {
        if(puedeCurar)
            return personaje.curar();
        return 0;
    }
}
