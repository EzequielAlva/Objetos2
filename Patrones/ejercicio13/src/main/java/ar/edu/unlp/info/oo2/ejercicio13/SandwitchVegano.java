package ar.edu.unlp.info.oo2.ejercicio13;

public class SandwitchVegano extends SandwitchBuilder {
    @Override
    public void agregarPan() {
        getSandwitch().setPan(new Pan("Pan integral", 100));
    }

    @Override
    public void agregarAderezo() {
        getSandwitch().setAderezo(new Aderezo("Salsa criolla", 20));
    }

    @Override
    public void agregarPrincipal() {
        getSandwitch().setPrincipal(new Principal("Milanesa de girgolas", 250));
    }

    @Override
    public void agregarAdicional() {
        getSandwitch().setAdicional(new Adicional("", 0));
    }
}
