package org.example.Builder;

import org.example.Armaduras.ArmaduraDeCuero;
import org.example.Armas.Arco;
import org.example.Habilidades.CombateADistancia;

public class ArqueroBuilder extends PersonajeBuilder {
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
