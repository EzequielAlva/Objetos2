package ar.edu.unlp.info.oo2.ejercicio06;

public class InscripcionDefinitiva extends InformacionState {
    public InscripcionDefinitiva(Excursion excursion) {
        super(excursion);
    }

    @Override
    public String obtenerInformacion() {
        String respuesta = super.obtenerInformacion();
        respuesta += getExcursion().mailsDeInscriptos();
        respuesta += "faltantes para el cupo maximo: " + getExcursion().obtenerCantidadDeUsuarioFaltantesParaMaximo();
        return respuesta;
    }

    @Override
    public void inscribir(Persona persona) {
        super.inscribir(persona);
        if(getExcursion().obtenerCantidadDeUsuarioFaltantesParaMaximo() == 0)
            getExcursion().setEstado(new MaximoAlcanzado(getExcursion()));
    }
}
