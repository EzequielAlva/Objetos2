package ar.edu.unlp.info.oo2.ejercicio_02_V2;

public abstract class Elemento {
    private String name;

    public Elemento() {
    }

    public String getName() { return this.name; }

    protected void setName(String name) {
        this.name = name;
    }

    public String combate(Elemento elemento) {
        return this.getName() + " vs " + elemento.getName() + ": ";
    }

    public abstract String contraPiedra();

    public abstract String contraPapel();

    public abstract String contraTijera();

    public abstract String contraSpock();

    public abstract String contraLagarto();
}
