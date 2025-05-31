package org.example.Armas;

import org.example.Armaduras.Armadura;

public abstract class Arma {
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    protected void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public abstract int calcularDanio(Armadura armaduraEnemiga);
}
