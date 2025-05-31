package ar.edu.unlp.info.oo2.ejercicio_02;

public class Piedra extends Elemento {

    public Piedra() {
        this.setName("Piedra");
    }

    @Override
    public String contraPiedra() {
        return this.getName() + " empata";
    }

    @Override
    public String contraPapel() {
        return this.getName() + " pierde";
    }

    @Override
    public String contraTijera() {
        return this.getName() + " gana";
    }

    @Override
    public String combate(Elemento elemento) {
        return super.combate(elemento) + elemento.contraPiedra();
    }
}
