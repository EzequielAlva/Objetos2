package ar.edu.unlp.info.oo2.ejercicio06;

public class InscripcionProvisoria extends InformacionState {
    public InscripcionProvisoria(Excursion excursion) {
        super(excursion);
    }

    @Override
    public String obtenerInformacion() {
        String respuesta = super.obtenerInformacion();
        respuesta += "usuarios faltantes para el minimo: " + getExcursion().obtenerCantidadDeUsuarioFaltantesParaMinimo();
        return respuesta;
    }

    @Override
    public void inscribir(Persona persona) {
        super.inscribir(persona);
        if(getExcursion().obtenerCantidadDeUsuarioFaltantesParaMinimo() == 0)
            getExcursion().setEstado(new InscripcionDefinitiva(getExcursion()));
    }
}
