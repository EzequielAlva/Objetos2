package ar.edu.unlp.info.oo2.ejercicio15;

public class Director {
    //director que arma con 5 piezas
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

    public Equipo crearEquipo() {
        this.builder.agregarProcesador();
        this.builder.agregarRam();
        this.builder.agregarDisco();
        this.builder.agregarGrafica();
        this.builder.agregarGabinete();
        return this.builder.crearEquipo();
    }
}
