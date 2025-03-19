package ar.edu.unlp.info.oo2.ejercicio_02;

public abstract class Elemento {
    private String name;

    public Elemento(String name) {
        this.name = name;
    }

    public String getName() { return this.name; }

    public abstract String combate(Elemento elemento);
}
