package ar.edu.unlp.info.oo2.ejercicio15;

public abstract class ConfigBuilder {
    private Equipo equipo;
    private Catalogo catalogo;

    public ConfigBuilder() {
        this.catalogo = new Catalogo();
    }

    protected Equipo getEquipo() {
        return this.equipo;
    }

    protected Catalogo getCatalogo() {
        return catalogo;
    }

    protected void reset() {
        this.equipo = new Equipo();
    }

    public abstract void agregarProcesador();
    public abstract void agregarRam();
    public abstract void agregarDisco();
    public abstract void agregarGrafica();
    public abstract void agregarGabinete();

    protected Componente buscarComponente(String descripcion) {
        return this.getCatalogo().getComponente(descripcion);
    }

    public Equipo crearEquipo() {
        Equipo armado = this.equipo;
        this.reset();
        return armado;
    }
}
