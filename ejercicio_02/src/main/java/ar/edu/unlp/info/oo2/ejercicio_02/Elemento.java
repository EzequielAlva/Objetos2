package ar.edu.unlp.info.oo2.ejercicio_02;

public abstract class Elemento {
    private String name;

    public Elemento() {
    }

    public String getName() { return this.name; }

    protected void setName(String name) {
        this.name = name;
    }

    public abstract String combate(Elemento elemento);
}
