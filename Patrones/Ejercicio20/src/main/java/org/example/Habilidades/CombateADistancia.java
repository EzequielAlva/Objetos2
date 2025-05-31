package org.example.Habilidades;

public class CombateADistancia extends Habilidad {
    public CombateADistancia() {
        this.setNombre("Combate a Distancia");
    }

    @Override
    public int ejecutarHabilidad() {
        return 4;
    }
}
