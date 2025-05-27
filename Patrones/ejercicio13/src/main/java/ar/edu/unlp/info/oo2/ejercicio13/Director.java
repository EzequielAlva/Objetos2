package ar.edu.unlp.info.oo2.ejercicio13;

public class Director {
    private SandwitchBuilder builder;

    public Director(SandwitchBuilder builder) {
        this.builder = builder;
    }

    public void changeBuilder(SandwitchBuilder builder) {
        this.builder = builder;
    }

    public Sandwitch hacerSandwitch() {
        return builder.obtenerSandwitch();
    }
}
