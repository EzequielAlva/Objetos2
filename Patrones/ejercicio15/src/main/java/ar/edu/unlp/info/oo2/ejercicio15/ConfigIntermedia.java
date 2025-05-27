package ar.edu.unlp.info.oo2.ejercicio15;

public class ConfigIntermedia extends ConfigBuilder {
    @Override
    public void agregarProcesador() {
        getEquipo().agregarComponente(buscarComponente("Procesador Intermedio"));
    }

    @Override
    public void agregarRam() {
        getEquipo().agregarComponente(buscarComponente("ram de 16 gb"));
    }

    @Override
    public void agregarDisco() {
        getEquipo().agregarComponente(buscarComponente("ssd de 500 gb"));
    }

    @Override
    public void agregarGrafica() {
        getEquipo().agregarComponente(buscarComponente("GTX 1650"));
    }

    @Override
    public void agregarGabinete() {
        getEquipo().agregarComponente(buscarComponente("Gabinete intermedio"));
        getEquipo().agregarComponente(buscarComponente("fuente 800 w"));
    }
}
