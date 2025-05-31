package org.example.Habilidades;

public class Curacion extends Habilidad {
    public Curacion() {
        this.setNombre("Curacion");
    }

    @Override
    public int ejecutarHabilidad() {
        return 4;
    }
}
