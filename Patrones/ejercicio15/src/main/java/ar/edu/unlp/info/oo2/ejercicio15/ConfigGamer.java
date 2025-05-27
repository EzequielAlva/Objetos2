package ar.edu.unlp.info.oo2.ejercicio15;

public class ConfigGamer extends ConfigBuilder {
    @Override
    public void agregarProcesador() {
        getEquipo().agregarComponente(buscarComponente("Procesador Gamer"));
        getEquipo().agregarComponente(buscarComponente("Pad Termico"));
        getEquipo().agregarComponente(buscarComponente("cooler"));
    }

    @Override
    public void agregarRam() {
        getEquipo().agregarComponente(buscarComponente("ram de 32 gb"));
        getEquipo().agregarComponente(buscarComponente("ram de 32 gb"));
    }

    @Override
    public void agregarDisco() {
        getEquipo().agregarComponente(buscarComponente("ssd 500 gb"));
        getEquipo().agregarComponente(buscarComponente("ssd 1 TB"));
    }

    @Override
    public void agregarGrafica() {
        getEquipo().agregarComponente(buscarComponente("RTX 4090"));
    }

    @Override
    public void agregarGabinete() {
        getEquipo().agregarComponente(buscarComponente("Gabinete Gamer"));
        double consumoDelEquipo = getEquipo().getComponentes().stream().mapToDouble(Componente::getConsumo).sum();
        Componente fuenteGamer = new Componente("Fuente Gamer", "", 540, consumoDelEquipo);
        fuenteGamer.setDescripcion("fuente gamer de " + fuenteGamer.getConsumo() + " w");
        getEquipo().agregarComponente(fuenteGamer);
    }
}
