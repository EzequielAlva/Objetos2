package ar.edu.unlp.info.oo2.ejercicio13;

public abstract class SandwitchBuilder {
    private Sandwitch sandwitch;

    public SandwitchBuilder() {
        this.reset();
    }

    protected Sandwitch getSandwitch() {
        return sandwitch;
    }

    public void reset() {
        this.sandwitch = new Sandwitch();
    }

    public abstract void agregarPan();
    public abstract void agregarAderezo();
    public abstract void agregarPrincipal();
    public abstract void agregarAdicional();

    public Sandwitch obtenerSandwitch() {
        reset();
        this.agregarPan();
        this.agregarAderezo();
        this.agregarPrincipal();
        this.agregarAdicional();
        return this.sandwitch;
    }
}
