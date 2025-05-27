package ar.edu.unlp.info.oo2.ejercicio06;

public abstract class InformacionState {
    private Excursion excursion;

    public InformacionState(Excursion excursion) {
        this.excursion = excursion;
    }

    protected Excursion getExcursion() {
        return this.excursion;
    }

    public String obtenerInformacion() {
        return getExcursion().obtenerInformacionBasica();
    }

    public void inscribir(Persona persona) {
        getExcursion().agregarAListaInscriptos(persona);
    }
}
