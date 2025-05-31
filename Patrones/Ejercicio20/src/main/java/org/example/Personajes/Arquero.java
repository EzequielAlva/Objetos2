package org.example.Personajes;

import org.example.Armaduras.ArmaduraDeCuero;
import org.example.Armas.Arco;
import org.example.Habilidades.CombateADistancia;

public class Arquero extends PersonajeBuilder {
    @Override
    public void agregarArma() {
        this.getPersonaje().setArma(new Arco());
    }

    @Override
    public void agregarArmadura() {
        this.getPersonaje().setArmadura(new ArmaduraDeCuero());
    }

    @Override
    public void agregarHabilidad() {
        this.getPersonaje().agregarHabilidad(new CombateADistancia());
    }
}
