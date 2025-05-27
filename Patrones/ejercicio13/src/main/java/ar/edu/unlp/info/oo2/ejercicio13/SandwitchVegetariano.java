package ar.edu.unlp.info.oo2.ejercicio13;

public class SandwitchVegetariano extends SandwitchBuilder {
    @Override
    public void agregarPan() {
        getSandwitch().setPan(new Pan("Pan con semillas", 120));
    }

    @Override
    public void agregarAderezo() {
        getSandwitch().setAderezo(new Aderezo("", 0));
    }

    @Override
    public void agregarPrincipal() {
        getSandwitch().setPrincipal(new Principal("Provoleta grillada", 200));
    }

    @Override
    public void agregarAdicional() {
        getSandwitch().setAdicional(new Adicional("Berenjenas al escabeche", 100));
    }
}
