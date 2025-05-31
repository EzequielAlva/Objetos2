package ar.edu.unlp.info.oo2.ejercicio_02;

public class Tijera extends Elemento {

    public Tijera() {
        this.setName("Tijera");
    }

    @Override
    public String contraPiedra() {
        return this.getName() + " pierde";
    }

    @Override
    public String contraPapel() {
        return this.getName() + " gana";
    }

    @Override
    public String contraTijera() {
        return this.getName() + " empata";
    }

    @Override
    public String combate(Elemento elemento) {
        return super.combate(elemento) + elemento.contraTijera();
    }
}
