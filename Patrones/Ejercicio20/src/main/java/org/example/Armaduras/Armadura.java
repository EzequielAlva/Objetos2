package org.example.Armaduras;

public abstract class Armadura {
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    protected void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public abstract int contraEspada();

    public abstract int contraArco();

    public abstract int contraBaston();
}
