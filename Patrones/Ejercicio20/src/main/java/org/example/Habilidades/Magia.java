package org.example.Habilidades;

public class Magia extends Habilidad {
    public Magia() {
        this.setNombre("Magia");
    }

    @Override
    public int ejecutarHabilidad() {
        return 7;
    }
}
