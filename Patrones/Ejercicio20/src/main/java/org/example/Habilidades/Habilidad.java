package org.example.Habilidades;

public abstract class Habilidad {
    private String nombre;

    public Habilidad() {
    }

    public String getNombre() {
        return nombre;
    }

    protected void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public abstract int ejecutarHabilidad();
}
