package org.example.Builder;


import org.example.Armaduras.ArmaduraDeCuero;
import org.example.Armas.Baston;
import org.example.Habilidades.CombateADistancia;
import org.example.Habilidades.Magia;

public class MagoBuilder extends PersonajeBuilder {
    @Override
    public void agregarArma() {
        this.getPersonaje().setArma(new Baston());
    }

    @Override
    public void agregarArmadura() {
        this.getPersonaje().setArmadura(new ArmaduraDeCuero());
    }

    @Override
    public void agregarHabilidad() {
        this.getPersonaje().agregarHabilidad(new CombateADistancia());
        this.getPersonaje().agregarHabilidad(new Magia());
    }
}
