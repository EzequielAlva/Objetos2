package org.example.Personajes;

import org.example.Armaduras.ArmaduraDeAcero;
import org.example.Armas.Espada;
import org.example.Habilidades.CombateCuerpoACuerpo;

public class Guerrero extends PersonajeBuilder {
    @Override
    public void agregarArma() {
        this.getPersonaje().setArma(new Espada());
    }

    @Override
    public void agregarArmadura() {
        this.getPersonaje().setArmadura(new ArmaduraDeAcero());
    }

    @Override
    public void agregarHabilidad() {
        this.getPersonaje().agregarHabilidad(new CombateCuerpoACuerpo());
    }
}
