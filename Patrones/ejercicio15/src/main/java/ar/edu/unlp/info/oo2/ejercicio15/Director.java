package ar.edu.unlp.info.oo2.ejercicio15;

public class Director {
    private ConfigBuilder builder;

    public Director() {
        builder = new ConfigBasica();
    }

    public void cambiarConfiguracion(ConfigBuilder builder) {
        this.builder = builder;
    }

    public Equipo obtenerEquipo() {
        return builder.crearEquipo();
    }
}
