package ar.edu.unlp.info.oo2.ejercicio13;

public class SandwitchClasico extends SandwitchBuilder {
    @Override
    public void agregarPan() {
        getSandwitch().setPan(new Pan("Pan brioche", 100));
    }

    @Override
    public void agregarAderezo() {
        getSandwitch().setAderezo(new Aderezo("Mayonesa", 20));
    }

    @Override
    public void agregarPrincipal() {
        getSandwitch().setPrincipal(new Principal("Carne de ternera", 300));
    }

    @Override
    public void agregarAdicional() {
        getSandwitch().setAdicional(new Adicional("Tomate", 80));
    }
}
