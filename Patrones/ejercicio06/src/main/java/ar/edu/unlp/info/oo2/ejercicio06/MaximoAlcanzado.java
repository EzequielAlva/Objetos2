package ar.edu.unlp.info.oo2.ejercicio06;

public class MaximoAlcanzado extends InformacionState {
    public MaximoAlcanzado(Excursion excursion) {
        super(excursion);
    }

    @Override
    public String obtenerInformacion() {
        return super.obtenerInformacion();
    }

    @Override
    public void inscribir(Persona persona) {
        getExcursion().agregarAListaEspera(persona);
    }
}
