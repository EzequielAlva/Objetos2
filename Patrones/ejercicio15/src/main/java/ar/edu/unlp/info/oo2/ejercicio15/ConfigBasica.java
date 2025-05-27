package ar.edu.unlp.info.oo2.ejercicio15;

public class ConfigBasica extends ConfigBuilder {
    @Override
    public void agregarProcesador() {
        getEquipo().agregarComponente(buscarComponente("Procesador Basico"));
    }

    @Override
    public void agregarRam() {
        getEquipo().agregarComponente(buscarComponente("ram de 8 gb"));
    }

    @Override
    public void agregarDisco() {
        getEquipo().agregarComponente(buscarComponente("hdd de 500 gb"));
    }

    @Override
    public void agregarGrafica() {

    }

    @Override
    public void agregarGabinete() {
        getEquipo().agregarComponente(buscarComponente("Gabinete estandar"));
    }
}
