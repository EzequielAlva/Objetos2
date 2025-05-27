package ar.edu.unlp.info.oo2.ejercicio13;

public class SandwitchDirector {
    private SandwitchBuilder builder;

    public SandwitchDirector(SandwitchBuilder builder) {
        this.builder = builder;
    }

    public void cambiarSandwitchBuilder(SandwitchBuilder builder) {
        this.builder = builder;
    }

    public Sandwitch hacerSancuchito() {
        builder.agregarPan();
        builder.agregarAderezo();
        builder.agregarPrincipal();
        builder.agregarAdicional();
        return builder.obtenerSandwitch();
    }
}
