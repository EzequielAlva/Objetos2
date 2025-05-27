package ar.edu.unlp.info.oo2.ejercicio13;

public class SandwitchSinTacc extends SandwitchBuilder {
    @Override
    public void agregarPan() {
        getSandwitch().setPan(new Pan("Pan de chipá", 150));
    }

    @Override
    public void agregarAderezo() {
        getSandwitch().setAderezo(new Aderezo("Salsa tártara", 18));
    }

    @Override
    public void agregarPrincipal() {
        getSandwitch().setPrincipal(new Principal("Carne de pollo", 250));
    }

    @Override
    public void agregarAdicional() {
        getSandwitch().setAdicional(new Adicional("Verduras grilladas", 200));
    }
}
